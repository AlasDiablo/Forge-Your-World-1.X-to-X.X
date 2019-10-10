package forge.your.world.world;

import forge.your.world.init.BlocksHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGenerator {

    public static void registerOreGen() {
        ForgeRegistries.BIOMES.forEach(biome -> {

            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(
                            Feature.ORE,
                            new OreFeatureConfig(
                                    FillerBlockType.NATURAL_STONE,
                                    BlocksHandler.TERILLIUM_ORE.getDefaultState(),
                                    4),
                            Placement.COUNT_RANGE,
                            new CountRangeConfig(
                                    6,
                                    2,
                                    0,
                                    28
                            )
                    )
            );

            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(
                            Feature.ORE,
                            new OreFeatureConfig(
                                    FillerBlockType.NETHERRACK,
                                    BlocksHandler.RED_DIAMOND_ORE.getDefaultState(),
                                    4),
                            Placement.COUNT_RANGE,
                            new CountRangeConfig(
                                    32,
                                    2,
                                    0,
                                    126
                            )
                    )
            );

        });
    }
}
