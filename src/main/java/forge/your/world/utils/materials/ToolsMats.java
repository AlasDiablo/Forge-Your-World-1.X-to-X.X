package forge.your.world.utils.materials;

import forge.your.world.init.ItemsHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

/**
 * enum use for store all tools material
 */
public enum ToolsMats implements IItemTier {
    /**
     * terillium tools material
     */
    TERILLIUM(768, 8.0f, 8.0f, 3, 25, ItemsHandler.TERILLIUM),
    RED_DIAMOND(1536, 16.0f, 10.0f, 3, 50, ItemsHandler.RED_DIAMOND);

    // todo finish the javadoc

    private int maxUses, harvestLevel, enchantability;
    private float efficiency, attackDamage;
    private Ingredient repairMaterial;

    ToolsMats(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Item repairItem) {
        this.maxUses = maxUses;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.repairMaterial = Ingredient.fromItems(repairItem);
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }
}
