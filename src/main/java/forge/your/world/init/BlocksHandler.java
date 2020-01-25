package forge.your.world.init;

import forge.your.world.ForgeYourWorld;
import forge.your.world.blocks.BasicBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

/**
 * class use for handle all block
 */
@SuppressWarnings("unused")
public class BlocksHandler {

    /**
     * Block declaration
     */

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_ORE)
    public static Block TERILLIUM_ORE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.TERILLIUM_BLOCK)
    public static Block TERILLIUM_BLOCK;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_ORE)
    public static Block RED_DIAMOND_ORE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.RED_DIAMOND_BLOCK)
    public static Block RED_DIAMOND_BLOCK;

    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_ORE)
    public static Block ENDERIUM_ORE;
    @ObjectHolder(RegisteryHolder.MOD_ID + ":" + RegisteryHolder.ENDERIUM_BLOCK)
    public static Block ENDERIUM_BLOCK;

    /**
     * event use for make an instance
     */
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        /**
         * blocks register
         * @param event registry event from forge
         */
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            IForgeRegistry<Block> e = event.getRegistry();
            e.register(new BasicBlock(RegisteryHolder.TERILLIUM_ORE, ToolType.PICKAXE, 2));
            e.register(new BasicBlock(RegisteryHolder.TERILLIUM_BLOCK, ToolType.PICKAXE, 1));
            e.register(new BasicBlock(RegisteryHolder.RED_DIAMOND_ORE, ToolType.PICKAXE, 3));
            e.register(new BasicBlock(RegisteryHolder.RED_DIAMOND_BLOCK, ToolType.PICKAXE, 2));
            e.register(new BasicBlock(RegisteryHolder.ENDERIUM_ORE, ToolType.PICKAXE, 3));
            e.register(new BasicBlock(RegisteryHolder.ENDERIUM_BLOCK, ToolType.PICKAXE, 3));
        }

        /**
         * items register
         * @param event registry event from forge
         */
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(ForgeYourWorld.FYW_GROUP);
            IForgeRegistry<Item> e = event.getRegistry();
            e.register(new BlockItem(TERILLIUM_ORE, properties).setRegistryName(RegisteryHolder.TERILLIUM_ORE));
            e.register(new BlockItem(TERILLIUM_BLOCK, properties).setRegistryName(RegisteryHolder.TERILLIUM_BLOCK));
            e.register(new BlockItem(RED_DIAMOND_ORE, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_ORE));
            e.register(new BlockItem(RED_DIAMOND_BLOCK, properties).setRegistryName(RegisteryHolder.RED_DIAMOND_BLOCK));
            e.register(new BlockItem(ENDERIUM_ORE, properties).setRegistryName(RegisteryHolder.ENDERIUM_ORE));
            e.register(new BlockItem(ENDERIUM_BLOCK, properties).setRegistryName(RegisteryHolder.ENDERIUM_BLOCK));
        }
    }
}
