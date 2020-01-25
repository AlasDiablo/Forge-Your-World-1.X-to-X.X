package forge.your.world.utils;

import net.minecraft.item.Food;

public enum Foods {
    TOAST(new Food.Builder().hunger(2).saturation(0.3f).build()),
    CEREALS(new Food.Builder().hunger(5).saturation(0.5f).build());

    private Food food;

    Foods(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }
}
