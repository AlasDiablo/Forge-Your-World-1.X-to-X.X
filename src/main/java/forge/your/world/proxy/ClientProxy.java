package forge.your.world.proxy;

import forge.your.world.world.OreGenerator;

public class ClientProxy implements IProxy {
    @Override
    public void startWorldGen() {
        OreGenerator.registerOreGen();
    }
}
