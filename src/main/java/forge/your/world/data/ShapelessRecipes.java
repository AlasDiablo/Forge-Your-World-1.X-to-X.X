package forge.your.world.data;

import forge.your.world.init.ItemsHandler;
import forge.your.world.utils.tags.ItemsTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;

import java.util.function.Consumer;

/**
 * Class use to handle all shapeless recipes
 */
public class ShapelessRecipes extends RecipeProvider {

    public ShapelessRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(ItemsHandler.TERILLIUM, 9)
                .addIngredient(ItemsTags.TERILLIUM_BLOCK)
                .addCriterion("has_terillium_block", this.hasItem(ItemsTags.TERILLIUM_BLOCK))
                .build(consumer, "terillium_from_block");

        ShapelessRecipeBuilder.shapelessRecipe(ItemsHandler.RED_DIAMOND, 9)
                .addIngredient(ItemsTags.RED_DIAMOND_BLOCK)
                .addCriterion("has_red_diamond_block", this.hasItem(ItemsTags.RED_DIAMOND_BLOCK))
                .build(consumer, "red_diamond_from_block");

        ShapelessRecipeBuilder.shapelessRecipe(ItemsHandler.ENDERIUM_INGOT, 9)
                .addIngredient(ItemsTags.ENDERIUM_BLOCK)
                .addCriterion("has_enderium_block", this.hasItem(ItemsTags.ENDERIUM_BLOCK))
                .build(consumer, "enderium_from_block");
    }
}
