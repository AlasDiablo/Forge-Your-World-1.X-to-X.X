package forge.your.world.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BasicBlock extends Block {

    public BasicBlock(String registryName, int harvestLevel) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(harvestLevel)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }
}
