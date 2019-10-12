package forge.your.world.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

/**
 * Class use for create blocks
 */
public class BasicBlock extends Block {

    /**
     * default constructor
     * @param registryName name of the blocks
     * @param toolType type of tool need for take it
     * @param harvestLevel level of the tool
     */
    public BasicBlock(String registryName, ToolType toolType, int harvestLevel) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(harvestLevel)
                .harvestTool(toolType)
        );
        this.setRegistryName(registryName);
    }
}
