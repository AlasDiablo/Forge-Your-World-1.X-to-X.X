package forge.your.world.init;

import forge.your.world.ForgeYourWorld;
import forge.your.world.blocks.BasicBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class BlocksHandler {

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_ORE)
    public static Block TERILLIUM_ORE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_BLOCK)
    public static Block TERILLIUM_BLOCK;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_ORE)
    public static Block RED_DIAMOND_ORE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_BLOCK)
    public static Block RED_DIAMOND_BLOCK;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            IForgeRegistry<Block> e = event.getRegistry();
            e.register(new BasicBlock(RegisteryHolder.TERILLIUM_ORE, 2));
            e.register(new BasicBlock(RegisteryHolder.TERILLIUM_BLOCK, 1));
            e.register(new BasicBlock(RegisteryHolder.RED_DIAMOND_ORE, 3));
            e.register(new BasicBlock(RegisteryHolder.RED_DIAMOND_BLOCK, 2));
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(ForgeYourWorld.fywGroup);
            IForgeRegistry<Item> e = event.getRegistry();
            e.register(new BlockItem(TERILLIUM_ORE, properties).setRegistryName(RegisteryHolder.TERILLIUM_ORE));
            e.register(new BlockItem(TERILLIUM_BLOCK, properties).setRegistryName(RegisteryHolder.TERILLIUM_BLOCK));
            e.register(new BlockItem(RED_DIAMOND_ORE, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_ORE));
            e.register(new BlockItem(RED_DIAMOND_BLOCK, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_BLOCK));
        }
    }
}
