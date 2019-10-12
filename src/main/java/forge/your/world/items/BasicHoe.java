package forge.your.world.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

/**
 * class use for create basic hoe
 */
public class BasicHoe extends HoeItem {
    public BasicHoe(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, attackSpeedIn, builder);
    }
}
