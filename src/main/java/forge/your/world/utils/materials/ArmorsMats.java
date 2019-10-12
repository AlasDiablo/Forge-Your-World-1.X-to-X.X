package forge.your.world.utils.materials;

import forge.your.world.init.ItemsHandler;
import forge.your.world.init.RegisteryHolder;
import forge.your.world.utils.tags.ItemsTags;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

/**
 * enum use for store all armor material
 */
public enum ArmorsMats implements IArmorMaterial {
    /**
     * terillium material
     */
    TERILLIUM("terillium", 25, new int[] {3, 6, 8, 3}, 25, ItemsTags.TERILLIUM, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f),
    /**
     * red diamond material
     */
    RED_DIAMOND("red_diamond", 75, new int[] {3, 6, 8, 3}, 75, ItemsTags.RED_DIAMOND, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);

    /**
     * name of the material
     */
    private String name;

    /**
     * durability of the material
     */
    private int[] durability;

    /**
     * damage reduction of the material
     */
    private int[] damageReductionAmount;

    /**
     * enchantability of the material
     */
    private int enchantability;

    /**
     * repair material(item use for repair the armor) of the material
     */
    private Ingredient repairMaterial;

    /**
     * sound(sound use on equipe) of the material
     */
    private SoundEvent soundEvent;

    /**
     * toughness of the material
     */
    private float toughness;

    /**
     * default constructor
     * @param name name of the material
     * @param durability durability of the material
     * @param damageReductionAmount damage reduction of the material
     * @param enchantability enchantability of the material
     * @param repairItem repair material(item use for repair the armor) of the material
     * @param soundEvent sound(sound use on equipe) of the material
     * @param toughness toughness of the material
     */
    ArmorsMats(String name, int durability, int[] damageReductionAmount, int enchantability, Tag<Item> repairItem, SoundEvent soundEvent, float toughness) {
        final int[] max_damge_arry = new int[] {13, 15, 16, 11};
        this.damageReductionAmount = damageReductionAmount;
        this.toughness = toughness;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.durability = new int[4];
        for (int i = 0; i < 4; i++) {
            this.durability[i] = max_damge_arry[i] * durability;
        }
        this.repairMaterial = Ingredient.fromTag(repairItem);
        this.name = RegisteryHolder.MOD_ID + ":" + name;
    }

    /**
     * use for get the durability
     * @param equipmentSlot select the armor piece (head, body, ...)
     * @return the value of the durability
     */
    @Override
    public int getDurability(EquipmentSlotType equipmentSlot) {
        return this.durability[equipmentSlot.getIndex()];
    }

    /**
     * use for get the damage reduction
     * @param equipmentSlot select the armor piece (head, body, ...)
     * @return returne the damage reduction
     */
    @Override
    public int getDamageReductionAmount(EquipmentSlotType equipmentSlot) {
        return this.damageReductionAmount[equipmentSlot.getIndex()];
    }

    /**
     * use for get the enchatability
     * @return the value of the enchatability
     */
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    /**
     * use for get the equipe sound
     * @return the sound of the armor
     */
    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    /**
     * use for get the item use for repair the armor
     * @return an ingredient corresponding to the item
     */
    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }

    /**
     * use for get the name of the materials
     * @return the name of the materials
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * use for get the toughness
     * @return the toughness
     */
    @Override
    public float getToughness() {
        return this.toughness;
    }
}
