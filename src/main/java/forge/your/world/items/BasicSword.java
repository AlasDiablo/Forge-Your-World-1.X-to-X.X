package forge.your.world.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class BasicSword extends SwordItem {
    public BasicSword(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, (int) tier.getAttackDamage(), attackSpeedIn, builder);
    }
}
