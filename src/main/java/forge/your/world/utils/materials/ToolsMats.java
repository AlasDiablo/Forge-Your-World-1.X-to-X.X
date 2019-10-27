package forge.your.world.utils.materials;

import forge.your.world.utils.tags.ItemsTags;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.Tag;

/**
 * enum use for store all tools material
 */
public enum ToolsMats implements IItemTier {
    /**
     * terillium tools material
     */
    TERILLIUM(768, 8.0f, 8.0f, 3, 25, ItemsTags.TERILLIUM),
    /**
     * red diamond material
     */
    RED_DIAMOND(1536, 16.0f, 10.0f, 3, 50, ItemsTags.RED_DIAMOND),
    ENDERIUM(2304, 24.0f, 12.0f, 3, 75, ItemsTags.ENDERIUM_INGOT);

    /**
     * max use of the material
     */
    private int maxUses;

    /**
     * harvest level of the material
     */
    private int harvestLevel;

    /**
     * enchantability of the material
     */
    private int enchantability;

    /**
     * efficiency of the material
     */
    private float efficiency;

    /**
     * attack damage of the material
     */
    private float attackDamage;

    /**
     * item use of repair the item
     */
    private Ingredient repairMaterial;

    /**
     * default contructor
     * @param maxUses @see the private variable
     * @param efficiency @see the private variable
     * @param attackDamage @see the private variable
     * @param harvestLevel @see the private variable
     * @param enchantability @see the private variable
     * @param repairItem @see the private variable
     */
    ToolsMats(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Tag<Item> repairItem) {
        this.maxUses = maxUses;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.repairMaterial = Ingredient.fromTag(repairItem);
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
