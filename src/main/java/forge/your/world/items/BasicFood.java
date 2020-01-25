package forge.your.world.items;

import forge.your.world.utils.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BasicFood extends Item {
    public BasicFood(ItemGroup itemGroup, Foods food) {
        super(new Properties().group(itemGroup).food(food.getFood()));
    }
}
