package forge.your.world.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

/**
 * class use for create basic axe
 */
public class BasicAxe extends AxeItem {
    public BasicAxe(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, (tier.getAttackDamage() * 0.3f), attackSpeedIn, builder);
    }
}
