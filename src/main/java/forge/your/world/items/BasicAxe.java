package forge.your.world.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;

public class BasicAxe extends AxeItem {
    public BasicAxe(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier,tier.getAttackDamage() + (tier.getAttackDamage() * 0.3f), attackSpeedIn, builder);
    }
}
