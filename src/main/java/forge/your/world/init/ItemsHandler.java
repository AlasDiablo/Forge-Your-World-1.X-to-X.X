package forge.your.world.init;

import forge.your.world.ForgeYourWorld;
import forge.your.world.items.ArmorsMats;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class ItemsHandler {

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

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(ForgeYourWorld.fywGroup);
            event.getRegistry().register(new Item(properties).setRegistryName(RegisteryHolder.TERILLIUM_RAW));
            event.getRegistry().register(new Item(properties).setRegistryName(RegisteryHolder.TERILLIUM));
            event.getRegistry().register(new ArmorItem(ArmorsMats.TERILLIUM, EquipmentSlotType.HEAD, properties).setRegistryName(RegisteryHolder.TERILLIUM_HELMET));
            event.getRegistry().register(new ArmorItem(ArmorsMats.TERILLIUM, EquipmentSlotType.CHEST, properties).setRegistryName(RegisteryHolder.TERILLIUM_CHESTPLATE));
            event.getRegistry().register(new ArmorItem(ArmorsMats.TERILLIUM, EquipmentSlotType.LEGS, properties).setRegistryName(RegisteryHolder.TERILLIUM_LEGGINGS));
            event.getRegistry().register(new ArmorItem(ArmorsMats.TERILLIUM, EquipmentSlotType.FEET, properties).setRegistryName(RegisteryHolder.TERILLIUM_BOOTS));
        }
    }
}
