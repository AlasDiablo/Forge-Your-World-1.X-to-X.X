package forge.your.world.data;

import forge.your.world.init.ItemsHandler;
import forge.your.world.utils.tags.ItemsTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;

import java.util.function.Consumer;

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
    }
}
