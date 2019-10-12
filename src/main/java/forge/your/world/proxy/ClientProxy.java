package forge.your.world.proxy;

import forge.your.world.world.IWorldGenerator;
import forge.your.world.world.OreGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * client proxy class
 */
public class ClientProxy implements IProxy {

    /**
     * @see IProxy
     */
    @Override
    public void startWorldGen() {
        List<IWorldGenerator> worldGenerators = new ArrayList<>();
        worldGenerators.add(new OreGenerator());
        worldGenerators.forEach(IWorldGenerator::startWorldGeneration);
    }
}
