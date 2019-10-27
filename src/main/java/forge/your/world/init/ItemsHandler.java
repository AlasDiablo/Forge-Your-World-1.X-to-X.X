package forge.your.world.init;

import forge.your.world.ForgeYourWorld;
import forge.your.world.items.*;
import forge.your.world.utils.materials.ArmorsMats;
import forge.your.world.utils.materials.ToolsMats;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

/**
 * class use for handle all block
 */
@SuppressWarnings("unused")
public class ItemsHandler {

    /**
     * Items declaration
     */

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_RAW)
    public static Item RAW_TERILLIUM;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM)
    public static Item TERILLIUM;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_HELMET)
    public static Item TERILLIUM_HELMET;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_CHESTPLATE)
    public static Item TERILLIUM_CHESTPLATE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_LEGGINGS)
    public static Item TERILLIUM_LEGGINGS;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_BOOTS)
    public static Item TERILLIUM_BOOTS;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_PICKAXE)
    public static Item TERILLIUM_PICKAXE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_AXE)
    public static Item TERILLIUM_AXE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_HOE)
    public static Item TERILLIUM_HOE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_SHOVEL)
    public static Item TERILLIUM_SHOVEL;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_SWORD)
    public static Item TERILLIUM_SWORD;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND)
    public static Item RED_DIAMOND;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_HELMET)
    public static Item RED_DIAMOND_HELMET;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_CHESTPLATE)
    public static Item RED_DIAMOND_CHESTPLATE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_LEGGINGS)
    public static Item RED_DIAMOND_LEGGINGS;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_BOOTS)
    public static Item RED_DIAMOND_BOOTS;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_SWORD)
    public static Item RED_DIAMOND_SWORD;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_PICKAXE)
    public static Item RED_DIAMOND_PICKAXE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_AXE)
    public static Item RED_DIAMOND_AXE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_HOE)
    public static Item RED_DIAMOND_HOE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_SHOVEL)
    public static Item RED_DIAMOND_SHOVEL;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_INGOT)
    public static Item ENDERIUM_INGOT;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_HELMET)
    public static Item ENDERIUM_HELMET;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_CHESTPLATE)
    public static Item ENDERIUM_CHESTPLATE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_LEGGINGS)
    public static Item ENDERIUM_LEGGINGS;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_BOOTS)
    public static Item ENDERIUM_BOOTS;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_SWORD)
    public static Item ENDERIUM_SWORD;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_PICKAXE)
    public static Item ENDERIUM_PICKAXE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_AXE)
    public static Item ENDERIUM_AXE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_HOE)
    public static Item ENDERIUM_HOE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_SHOVEL)
    public static Item ENDERIUM_SHOVEL;

    /**
     * event use for make an instance
     */
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        /**
         * items register
         * @param event registry event from forge
         */
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(ForgeYourWorld.fywGroup);
            IForgeRegistry<Item> e = event.getRegistry();
            e.register(new Item(properties).setRegistryName(RegisteryHolder.TERILLIUM_RAW));
            e.register(new Item(properties).setRegistryName(RegisteryHolder.TERILLIUM));
            e.register(new ArmorItem(ArmorsMats.TERILLIUM, EquipmentSlotType.HEAD, properties).setRegistryName(RegisteryHolder.TERILLIUM_HELMET));
            e.register(new ArmorItem(ArmorsMats.TERILLIUM, EquipmentSlotType.CHEST, properties).setRegistryName(RegisteryHolder.TERILLIUM_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMats.TERILLIUM, EquipmentSlotType.LEGS, properties).setRegistryName(RegisteryHolder.TERILLIUM_LEGGINGS));
            e.register(new ArmorItem(ArmorsMats.TERILLIUM, EquipmentSlotType.FEET, properties).setRegistryName(RegisteryHolder.TERILLIUM_BOOTS));
            e.register(new BasicPickaxe(ToolsMats.TERILLIUM, -2.8f, properties).setRegistryName(RegisteryHolder.TERILLIUM_PICKAXE));
            e.register(new BasicAxe(ToolsMats.TERILLIUM, -3.0f, properties).setRegistryName(RegisteryHolder.TERILLIUM_AXE));
            e.register(new BasicHoe(ToolsMats.TERILLIUM, -0.0f, properties).setRegistryName(RegisteryHolder.TERILLIUM_HOE));
            e.register(new BasicShovel(ToolsMats.TERILLIUM, -3.0f, properties).setRegistryName(RegisteryHolder.TERILLIUM_SHOVEL));
            e.register(new BasicSword(ToolsMats.TERILLIUM, -2.4f, properties).setRegistryName(RegisteryHolder.TERILLIUM_SWORD));
            e.register(new Item(properties).setRegistryName(RegisteryHolder.RED_DIAMOND));
            e.register(new ArmorItem(ArmorsMats.RED_DIAMOND, EquipmentSlotType.HEAD, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_HELMET));
            e.register(new ArmorItem(ArmorsMats.RED_DIAMOND, EquipmentSlotType.CHEST, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMats.RED_DIAMOND, EquipmentSlotType.LEGS, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_LEGGINGS));
            e.register(new ArmorItem(ArmorsMats.RED_DIAMOND, EquipmentSlotType.FEET, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_BOOTS));
            e.register(new BasicPickaxe(ToolsMats.RED_DIAMOND, -2.8f, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_PICKAXE));
            e.register(new BasicAxe(ToolsMats.RED_DIAMOND, -3.0f, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_AXE));
            e.register(new BasicHoe(ToolsMats.RED_DIAMOND, -0.0f, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_HOE));
            e.register(new BasicShovel(ToolsMats.RED_DIAMOND, -3.0f, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_SHOVEL));
            e.register(new BasicSword(ToolsMats.RED_DIAMOND, -2.4f, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_SWORD));
            e.register(new Item(properties).setRegistryName(RegisteryHolder.ENDERIUM_INGOT));
            e.register(new ArmorItem(ArmorsMats.ENDERIUM, EquipmentSlotType.HEAD, properties).setRegistryName(RegisteryHolder.ENDERIUM_HELMET));
            e.register(new ArmorItem(ArmorsMats.ENDERIUM, EquipmentSlotType.CHEST, properties).setRegistryName(RegisteryHolder.ENDERIUM_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMats.ENDERIUM, EquipmentSlotType.LEGS, properties).setRegistryName(RegisteryHolder.ENDERIUM_LEGGINGS));
            e.register(new ArmorItem(ArmorsMats.ENDERIUM, EquipmentSlotType.FEET, properties).setRegistryName(RegisteryHolder.ENDERIUM_BOOTS));
            e.register(new BasicPickaxe(ToolsMats.ENDERIUM, -2.8f, properties).setRegistryName(RegisteryHolder.ENDERIUM_PICKAXE));
            e.register(new BasicAxe(ToolsMats.ENDERIUM, -3.0f, properties).setRegistryName(RegisteryHolder.ENDERIUM_AXE));
            e.register(new BasicHoe(ToolsMats.ENDERIUM, -0.0f, properties).setRegistryName(RegisteryHolder.ENDERIUM_HOE));
            e.register(new BasicShovel(ToolsMats.ENDERIUM, -3.0f, properties).setRegistryName(RegisteryHolder.ENDERIUM_SHOVEL));
            e.register(new BasicSword(ToolsMats.ENDERIUM, -2.4f, properties).setRegistryName(RegisteryHolder.ENDERIUM_SWORD));
        }
    }
}
