package forge.your.world.proxy;

import forge.your.world.world.OreGenerator;

public class ServerProxy implements IProxy {
    @Override
    public void startWorldGen() {
        OreGenerator.registerOreGen();
    }
}
