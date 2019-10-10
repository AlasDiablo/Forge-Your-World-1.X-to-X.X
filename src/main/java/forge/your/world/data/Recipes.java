package forge.your.world.data;

import forge.your.world.init.BlocksHandler;
import forge.your.world.init.ItemsHandler;
import forge.your.world.utils.tags.BlocksTags;
import forge.your.world.utils.tags.ItemsTags;
import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

/**
 * forge your world recipes data generator
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
        this.shapedRecipe(consumer);
        this.shapelessRecipe(consumer);
    }

    private void shapedRecipe(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM)
                .key('T', ItemsTags.RAW_TERILLIUM)
                .key('G', Tags.Items.DUSTS_GLOWSTONE)
                .key('R', Tags.Items.DUSTS_REDSTONE)
                .patternLine(" G ")
                .patternLine("RTR")
                .patternLine(" G ")
                .addCriterion("has_raw_terillium", this.hasItem(ItemsTags.RAW_TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(BlocksHandler.TERILLIUM_BLOCK)
                .key('T', ItemsTags.TERILLIUM)
                .patternLine("TTT")
                .patternLine("TTT")
                .patternLine("TTT")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM_HELMET)
                .key('T', ItemsTags.TERILLIUM)
                .patternLine("TTT")
                .patternLine("T T")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM_CHESTPLATE)
                .key('T', ItemsTags.TERILLIUM)
                .patternLine("T T")
                .patternLine("TTT")
                .patternLine("TTT")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM_LEGGINGS)
                .key('T', ItemsTags.TERILLIUM)
                .patternLine("TTT")
                .patternLine("T T")
                .patternLine("T T")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM_BOOTS)
                .key('T', ItemsTags.TERILLIUM)
                .patternLine("T T")
                .patternLine("T T")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM_PICKAXE)
                .key('T', ItemsTags.TERILLIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("TTT")
                .patternLine(" S ")
                .patternLine(" S ")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM_AXE)
                .key('T', ItemsTags.TERILLIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("TT")
                .patternLine("TS")
                .patternLine(" S")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM_HOE)
                .key('T', ItemsTags.TERILLIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("TT")
                .patternLine(" S")
                .patternLine(" S")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM_SWORD)
                .key('T', ItemsTags.TERILLIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("T")
                .patternLine("T")
                .patternLine("S")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.TERILLIUM_SHOVEL)
                .key('T', ItemsTags.TERILLIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("T")
                .patternLine("S")
                .patternLine("S")
                .addCriterion("has_terillium", this.hasItem(ItemsTags.TERILLIUM))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(BlocksHandler.RED_DIAMOND_BLOCK)
                .key('R', ItemsTags.RED_DIAMOND)
                .patternLine("RRR")
                .patternLine("RRR")
                .patternLine("RRR")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);
    }

    public void shapelessRecipe(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(ItemsHandler.TERILLIUM, 9)
                .addIngredient(ItemsTags.TERILLIUM_BLOCK)
                .addCriterion("has_terillium_block", this.hasItem(ItemsTags.TERILLIUM_BLOCK))
                .build(consumer, "terillium_from_block");

        ShapelessRecipeBuilder.shapelessRecipe(ItemsHandler.RED_DIAMOND, 9)
                .addIngredient(ItemsTags.RED_DIAMOND_BLOCK)
                .addCriterion("has_red_diamond_block", this.hasItem(ItemsTags.RED_DIAMOND_BLOCK))
                .build(consumer, "red_diamond_from_block");
    }

    private void oreSmelting(Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHandler.TERILLIUM_ORE), ItemsHandler.TERILLIUM, 0.1f, 200)
                .addCriterion("has_terillium_ore", this.hasItem(ItemsTags.TERILLIUM_ORE)).build(consumer, "terillium_smelting");

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHandler.RED_DIAMOND_ORE), ItemsHandler.RED_DIAMOND, 0.1f, 200)
                .addCriterion("has_red_diamond_ore", this.hasItem(ItemsTags.RED_DIAMOND_ORE)).build(consumer, "red_diamond_smelting");
    }

    private void oreBlasting(Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHandler.TERILLIUM_ORE), ItemsHandler.TERILLIUM, 0.1f, 100)
                .addCriterion("has_terillium_ore", this.hasItem(ItemsTags.TERILLIUM_ORE)).build(consumer, "terillium_blasting");

        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHandler.RED_DIAMOND_ORE), ItemsHandler.RED_DIAMOND, 0.1f, 100)
                .addCriterion("has_red_diamond_ore", this.hasItem(ItemsTags.RED_DIAMOND_ORE)).build(consumer, "red_diamond_blasting");
    }

}