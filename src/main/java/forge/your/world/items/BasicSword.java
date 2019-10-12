package forge.your.world.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

/**
 * class use for create basic sword
 */
public class BasicSword extends SwordItem {
    public BasicSword(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, 0, attackSpeedIn, builder);
    }
}
