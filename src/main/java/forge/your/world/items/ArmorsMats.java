package forge.your.world.items;

import forge.your.world.init.RegisteryHolder;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum ArmorsMats implements IArmorMaterial {
    TERILLIUM("terillium", 25, new int[] {3, 6, 8, 3}, 25, Items.BEDROCK, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f);

    private String name;
    private int[] durability;
    private int[] damageReductionAmount;
    private int enchantability;
    private Ingredient repairMaterial;
    private SoundEvent soundEvent;
    private float toughness;

    private ArmorsMats(String name, int durability, int[] damageReductionAmount, int enchantability, Item repairItem, SoundEvent soundEvent, float toughness) {
        final int[] max_damge_arry = new int[] {13, 15, 16, 11};
        this.damageReductionAmount = damageReductionAmount;
        this.toughness = toughness;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.durability = new int[4];
        for (int i = 0; i < 4; i++) {
            this.durability[i] = max_damge_arry[i] * durability;
        }
        this.repairMaterial = Ingredient.fromItems(repairItem);
        this.name = RegisteryHolder.MOD_ID + ":" + name;
    }

    @Override
    public int getDurability(EquipmentSlotType equipmentSlot) {
        return this.durability[equipmentSlot.getIndex()];
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType equipmentSlot) {
        return this.damageReductionAmount[equipmentSlot.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
