package forge.your.world.proxy;

import forge.your.world.world.OreGenerator;

/**
 * client proxy class
 */
public class ClientProxy implements IProxy {

    /**
     * @see IProxy
     */
    @Override
    public void startWorldGen() {
        OreGenerator.registerOreGen();
    }
}
