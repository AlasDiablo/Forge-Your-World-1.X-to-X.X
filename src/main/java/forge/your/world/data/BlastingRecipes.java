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

/**
 * Class use to handle all blasting recipes
 */
public class BlastingRecipes extends RecipeProvider {

    public BlastingRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHandler.TERILLIUM_ORE), ItemsHandler.TERILLIUM, 0.1f, 100)
                .addCriterion("has_terillium_ore", this.hasItem(ItemsTags.TERILLIUM_ORE)).build(consumer, "terillium_blasting");

        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHandler.RED_DIAMOND_ORE), ItemsHandler.RED_DIAMOND, 0.1f, 100)
                .addCriterion("has_red_diamond_ore", this.hasItem(ItemsTags.RED_DIAMOND_ORE)).build(consumer, "red_diamond_blasting");

        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHandler.ENDERIUM_ORE), ItemsHandler.ENDERIUM_INGOT, 0.1f, 100)
                .addCriterion("has_enderium_ore", this.hasItem(ItemsTags.ENDERIUM_ORE)).build(consumer, "enderium_blasting");
    }
}
