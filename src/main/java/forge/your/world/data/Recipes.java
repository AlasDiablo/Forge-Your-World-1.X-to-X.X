package forge.your.world.data;

import forge.your.world.init.BlocksHandler;
import forge.your.world.init.ItemsHandler;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

/**
 * Janoeo recipes data generator
 */
public class Recipes extends RecipeProvider {

    /**
     * constructor
     * @param generatorIn data generator instance
     */
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    /**
     * load all recipes
     */
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        this.oreSmelting(consumer);
        this.oreBlasting(consumer);
    }

    private void oreSmelting(Consumer<IFinishedRecipe> consumer) {
        // trillium
//        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHandler.TERILLIUM_ORE), ItemsHandler.TERILLIUM, 0.1f, 200)
//                .addCriterion("has_terillium_ore", this.hasItem(BlocksHandler.TERILLIUM_ORE)).build(consumer, "terillium_smelting");
    }

    private void oreBlasting(Consumer<IFinishedRecipe> consumer) {
        // trillium
//        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHandler.TERILLIUM_ORE), ItemsHandler.TERILLIUM, 0.1f, 100)
//                .addCriterion("has_terillium_ore", this.hasItem(BlocksHandler.TERILLIUM_ORE)).build(consumer, "terillium_blasting");
    }

}