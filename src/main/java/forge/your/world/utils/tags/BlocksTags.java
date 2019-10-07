package forge.your.world.utils.tags;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class BlocksTags {

    public static final Tag<Block> TERILLIUM_ORE = tag("forge", "ore/terillium");
    public static final Tag<Block> TERILLIUM_BLOCK = tag("forge", "block/terillium");

    private static Tag<Block> tag(String namespace, String name) {
        return new BlockTags.Wrapper(new ResourceLocation(namespace, name));
    }
}
