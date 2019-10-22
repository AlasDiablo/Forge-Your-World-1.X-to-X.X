package forge.your.world.data;

import forge.your.world.init.BlocksHandler;
import forge.your.world.init.ItemsHandler;
import forge.your.world.utils.tags.ItemsTags;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class SmeltingRecipes  extends RecipeProvider {

    public SmeltingRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHandler.TERILLIUM_ORE), ItemsHandler.TERILLIUM, 0.1f, 200)
                .addCriterion("has_terillium_ore", this.hasItem(ItemsTags.TERILLIUM_ORE)).build(consumer, "terillium_smelting");

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHandler.RED_DIAMOND_ORE), ItemsHandler.RED_DIAMOND, 0.1f, 200)
                .addCriterion("has_red_diamond_ore", this.hasItem(ItemsTags.RED_DIAMOND_ORE)).build(consumer, "red_diamond_smelting");
    }
}
