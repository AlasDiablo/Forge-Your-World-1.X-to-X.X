package forge.your.world.utils.tags;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

/**
 * class use for handle the minecraft tags(items) inside of the code
 */
public class ItemsTags {

    public static final Tag<Item> RAW_TERILLIUM = tag("forge", "gems/raw_terillium");
    public static final Tag<Item> TERILLIUM = tag("forge", "gems/terillium");
    public static final Tag<Item> TERILLIUM_ORE = tag("forge", "ore/terillium");
    public static final Tag<Item> TERILLIUM_BLOCK = tag("forge", "storage_blocks/terillium");
    public static final Tag<Item> RED_DIAMOND_ORE = tag("forge", "ore/red_diamond");
    public static final Tag<Item> RED_DIAMOND = tag("forge", "gems/red_diamond");
    public static final Tag<Item> RED_DIAMOND_BLOCK = tag("forge", "storage_blocks/red_diamond");

    /**
     * tags builder
     * @param namespace is the same as mod id
     * @param name name of the tags
     * @return the tags corresponding to the file
     */
    private static Tag<Item> tag(String namespace, String name) {
        return new ItemTags.Wrapper(new ResourceLocation(namespace, name));
    }
}
