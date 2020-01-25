package forge.your.world.data;

import forge.your.world.init.ItemsHandler;
import forge.your.world.utils.tags.ItemsTags;
import net.minecraft.data.*;
import net.minecraft.item.Items;

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
        this.registerFoodsRecipes(consumer);
        this.registerOresRecipes(consumer);
    }

    private void registerFoodsRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(ItemsHandler.FLOUR, 1)
                .addIngredient(ItemsHandler.MORTAR_AND_PESTLE)
                .addIngredient(Items.WHEAT)
                .addCriterion("has_wheat", this.hasItem(Items.WHEAT))
                .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ItemsHandler.CEREALS, 1)
                .addIngredient(ItemsHandler.CEREALS)
                .addIngredient(Items.SUGAR)
                .addCriterion("has_wheat", this.hasItem(Items.WHEAT))
                .build(consumer);
    }

    private void registerOresRecipes(Consumer<IFinishedRecipe> consumer) {
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
