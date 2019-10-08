package forge.your.world.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class BasicHoe extends HoeItem {
    public BasicHoe(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, attackSpeedIn, builder);
    }
}
