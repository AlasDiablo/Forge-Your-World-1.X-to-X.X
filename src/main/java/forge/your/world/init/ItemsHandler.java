package forge.your.world.init;

import forge.your.world.ForgeYourWorld;
import forge.your.world.items.BasicPickaxe;
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

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_PICKAXE)
    public static Item TERILLIUM_PICKAXE;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
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
            e.register(new BasicPickaxe(ToolsMats.TERILLIUM, 0.2f, properties).setRegistryName(RegisteryHolder.TERILLIUM_PICKAXE));
        }
    }
}
