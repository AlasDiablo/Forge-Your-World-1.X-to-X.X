package forge.your.world.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ShovelItem;

/**
 * class use for create basic shovel
 */
public class BasicShovel extends ShovelItem {
    public BasicShovel(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, -(tier.getAttackDamage() * 0.3f), attackSpeedIn, builder);
    }
}
