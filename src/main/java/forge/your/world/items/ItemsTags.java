package forge.your.world.items;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ItemsTags {

    public static final Tag<Item> RAW_TERILLIUM = tag("forge", "gems/raw_terillium");
    public static final Tag<Item> TERILLIUM = tag("forge", "gems/terillium");
    public static final Tag<Item> TERILLIUM_ORE = tag("forge", "ore/terillium");
    public static final Tag<Item> TERILLIUM_BLOCK = tag("forge", "storage_blocks/terillium");

    private static Tag<Item> tag(String namespace, String name) {
        return new ItemTags.Wrapper(new ResourceLocation(namespace, name));
    }
}
