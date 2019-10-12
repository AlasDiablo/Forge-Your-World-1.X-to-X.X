package forge.your.world.proxy;

import forge.your.world.world.OreGenerator;

/**
 * server proxy class
 */
public class ServerProxy implements IProxy {

    /**
     * @see IProxy
     */
    @Override
    public void startWorldGen() {
        OreGenerator.registerOreGen();
    }
}
