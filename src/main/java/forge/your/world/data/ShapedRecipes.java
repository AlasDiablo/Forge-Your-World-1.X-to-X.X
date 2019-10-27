package forge.your.world.data;

import forge.your.world.init.BlocksHandler;
import forge.your.world.init.ItemsHandler;
import forge.your.world.utils.tags.ItemsTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

/**
 * Class use to handle all shaped recipes
 */
public class ShapedRecipes extends RecipeProvider {

    public ShapedRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        this.registerTerilliumRecipes(consumer);
        this.registerRedDiamondRecipes(consumer);
        this.registerEnderiumRecipes(consumer);
    }

    private void registerEnderiumRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(BlocksHandler.ENDERIUM_BLOCK)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .patternLine("EEE")
                .patternLine("EEE")
                .patternLine("EEE")
                .addCriterion("has_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.ENDERIUM_HELMET)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .patternLine("EEE")
                .patternLine("E E")
                .addCriterion("has_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.ENDERIUM_CHESTPLATE)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .patternLine("E E")
                .patternLine("EEE")
                .patternLine("EEE")
                .addCriterion("has_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.ENDERIUM_LEGGINGS)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .patternLine("EEE")
                .patternLine("E E")
                .patternLine("E E")
                .addCriterion("has_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.ENDERIUM_BOOTS)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .patternLine("E E")
                .patternLine("E E")
                .addCriterion("has_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.ENDERIUM_PICKAXE)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("EEE")
                .patternLine(" S ")
                .patternLine(" S ")
                .addCriterion("has_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.ENDERIUM_AXE)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("EE")
                .patternLine("ES")
                .patternLine(" S")
                .addCriterion("has_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.ENDERIUM_HOE)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("EE")
                .patternLine(" S")
                .patternLine(" S")
                .addCriterion("has_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.ENDERIUM_SWORD)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("E")
                .patternLine("E")
                .patternLine("S")
                .addCriterion("has_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.ENDERIUM_SHOVEL)
                .key('E', ItemsTags.ENDERIUM_INGOT)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("E")
                .patternLine("S")
                .patternLine("S")
                .addCriterion("has_red_enderium", this.hasItem(ItemsTags.ENDERIUM_INGOT))
                .build(consumer);
    }

    private void registerRedDiamondRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(BlocksHandler.RED_DIAMOND_BLOCK)
                .key('R', ItemsTags.RED_DIAMOND)
                .patternLine("RRR")
                .patternLine("RRR")
                .patternLine("RRR")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.RED_DIAMOND_HELMET)
                .key('R', ItemsTags.RED_DIAMOND)
                .patternLine("RRR")
                .patternLine("R R")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.RED_DIAMOND_CHESTPLATE)
                .key('R', ItemsTags.RED_DIAMOND)
                .patternLine("R R")
                .patternLine("RRR")
                .patternLine("RRR")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.RED_DIAMOND_LEGGINGS)
                .key('R', ItemsTags.RED_DIAMOND)
                .patternLine("RRR")
                .patternLine("R R")
                .patternLine("R R")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.RED_DIAMOND_BOOTS)
                .key('R', ItemsTags.RED_DIAMOND)
                .patternLine("R R")
                .patternLine("R R")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.RED_DIAMOND_PICKAXE)
                .key('R', ItemsTags.RED_DIAMOND)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("RRR")
                .patternLine(" S ")
                .patternLine(" S ")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.RED_DIAMOND_AXE)
                .key('R', ItemsTags.RED_DIAMOND)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("RR")
                .patternLine("RS")
                .patternLine(" S")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.RED_DIAMOND_HOE)
                .key('R', ItemsTags.RED_DIAMOND)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("RR")
                .patternLine(" S")
                .patternLine(" S")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.RED_DIAMOND_SWORD)
                .key('R', ItemsTags.RED_DIAMOND)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("R")
                .patternLine("R")
                .patternLine("S")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemsHandler.RED_DIAMOND_SHOVEL)
                .key('R', ItemsTags.RED_DIAMOND)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("R")
                .patternLine("S")
                .patternLine("S")
                .addCriterion("has_red_diamond", this.hasItem(ItemsTags.RED_DIAMOND))
                .build(consumer);
    }

    private void registerTerilliumRecipes(Consumer<IFinishedRecipe> consumer) {
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
    }
}
