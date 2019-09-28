package forge.your.world;

import forge.your.world.init.BlocksHandler;
import forge.your.world.init.RegisteryHolder;
import forge.your.world.proxy.ClientProxy;
import forge.your.world.proxy.IProxy;
import forge.your.world.proxy.ServerProxy;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(RegisteryHolder.MOD_ID)
public class ForgeYourWorld {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static final Logger LOGGER = LogManager.getLogger();

    public static ItemGroup fywGroup = new ItemGroup("fyw.group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlocksHandler.TERILLIUM_BLOCK);
        }
    };

    public ForgeYourWorld() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        proxy.startWorldGen();
    }
}
