package anes.ateor.datagen;

import anes.ateor.block.ModBlocks;
import anes.ateor.item.ModItems;
import java.util.Optional;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.level.block.Blocks;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(
        BlockModelGenerators blockModelGenerators
    ) {
        blockModelGenerators.createTrivialCube(ModBlocks.NEBULA_FRAGMENT_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.NEBULA_LOG);
        //blockModelGenerators.createTrivialCube(ModBlocks.NEBULA_PLANKS);

        blockModelGenerators
            .family(ModBlocks.NEBULA_PLANKS)
            .stairs(ModBlocks.NEBULA_STAIRS)
            .slab(ModBlocks.NEBULA_SLABS);

        // minecraft wool update Wools
        blockModelGenerators
            .family(Blocks.RED_WOOL)
            .slab(ModBlocks.RED_WOOL_SLABS)
            .stairs(ModBlocks.RED_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.BLUE_WOOL)
            .stairs(ModBlocks.BLUE_WOOL_STAIRS)
            .slab(ModBlocks.BLUE_WOOL_SLABS);

        blockModelGenerators
            .family(Blocks.BLACK_WOOL)
            .slab(ModBlocks.BLACK_WOOL_SLABS)
            .stairs(ModBlocks.BLACK_WOOL_STAIRS);

         blockModelGenerators
             .family(Blocks.CYAN_WOOL)
             .slab(ModBlocks.CYAN_WOOL_SLABS)
             .stairs(ModBlocks.CYAN_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.YELLOW_WOOL)
            .slab(ModBlocks.YELLOW_WOOL_SLABS)
            .stairs(ModBlocks.YELLOW_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.PINK_WOOL)
            .slab(ModBlocks.PINK_WOOL_SLABS)
            .stairs(ModBlocks.PINK_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.WHITE_WOOL)
            .slab(ModBlocks.WOOL_SLABS)
            .stairs(ModBlocks.WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.MAGENTA_WOOL)
            .slab(ModBlocks.MAGENTA_WOOL_SLABS)
            .stairs(ModBlocks.MAGENTA_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.PURPLE_WOOL)
            .slab(ModBlocks.PURPLE_WOOL_SLABS)
            .stairs(ModBlocks.PURPLE_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.LIME_WOOL)
            .slab(ModBlocks.LIME_WOOL_SLABS)
            .stairs(ModBlocks.LIME_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.LIGHT_GRAY_WOOL)
            .slab(ModBlocks.LIGHT_GRAY_WOOL_SLABS)
            .stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.GRAY_WOOL)
            .slab(ModBlocks.GRAY_WOOL_SLABS)
            .stairs(ModBlocks.GRAY_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.BROWN_WOOL)
            .slab(ModBlocks.BROWN_WOOL_SLABS)
            .stairs(ModBlocks.BROWN_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.ORANGE_WOOL)
            .slab(ModBlocks.ORANGE_WOOL_SLABS)
            .stairs(ModBlocks.ORANGE_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.GREEN_WOOL)
            .slab(ModBlocks.GREEN_WOOL_SLABS)
            .stairs(ModBlocks.GREEN_WOOL_STAIRS);

        blockModelGenerators
            .family(Blocks.LIGHT_BLUE_WOOL)
            .slab(ModBlocks.LIGHT_BLUE_WOOL_SLABS)
            .stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(
            ModItems.NEBULAGAS,
            ModelTemplates.FLAT_ITEM
        );
        itemModelGenerators.generateFlatItem(
            ModItems.NEBULA,
            ModelTemplates.FLAT_ITEM
        );
        itemModelGenerators.generateFlatItem(
            ModItems.UNPROCESSED_NEBULA,
            ModelTemplates.FLAT_ITEM
        );
        itemModelGenerators.generateFlatItem(
            ModItems.NEBULA_PICKAXE,
            ModelTemplates.FLAT_HANDHELD_ITEM
        );
        itemModelGenerators.generateFlatItem(
            ModItems.NEBULA_STICKS,
            ModelTemplates.FLAT_ITEM
        );
    }
}
