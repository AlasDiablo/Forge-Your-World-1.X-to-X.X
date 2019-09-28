package forge.your.world.init;

import forge.your.world.ForgeYourWorld;
import forge.your.world.blocks.BasicOre;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class BlocksHandler {

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_ORE)
    public static Block TERILLIUM_ORE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_BLOCK)
    public static Block TERILLIUM_BLOCK;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new BasicOre(RegisteryHolder.TERILLIUM_ORE, 2));
            event.getRegistry().register(new BasicOre(RegisteryHolder.TERILLIUM_BLOCK, 1));
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(ForgeYourWorld.fywGroup);
            event.getRegistry().register(new BlockItem(TERILLIUM_ORE, properties).setRegistryName(RegisteryHolder.TERILLIUM_ORE));
            event.getRegistry().register(new BlockItem(TERILLIUM_BLOCK, properties).setRegistryName(RegisteryHolder.TERILLIUM_BLOCK));
        }
    }
}
