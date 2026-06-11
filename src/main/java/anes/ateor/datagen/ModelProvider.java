package anes.ateor.datagen;

import anes.ateor.block.ModBlocks;
import anes.ateor.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
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
            .wall(ModBlocks.WOOL_WALLS)
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

        // stone type blocks

        blockModelGenerators
            .family(Blocks.END_STONE)
            .stairs(ModBlocks.END_STONE_STAIRS)
            .slab(ModBlocks.END_STONE_SLABS);

        // grass type blocks

        // blockModelGenerators
        //         .family(Blocks.GRASS_BLOCK)
        //         .stairs(ModBlocks.GRASS_BLOCK_STAIRS)
        //         .slab(ModBlocks.GRASS_BLOCK_SLABS);

        //        blockModelGenerators
        //            .family(Blocks.OAK_WOOD)
        //            .stairs(ModBlocks.OAK_WOOD_STAIRS)
        //            .slab(ModBlocks.OAK_WOOD_SLABS);

        // concrete
        blockModelGenerators
            .family(Blocks.BLACK_CONCRETE)
            .stairs(ModBlocks.BLACK_CONCRETE_STAIRS)
            .slab(ModBlocks.BLACK_CONCRETE_SLABS);

        blockModelGenerators
            .family(Blocks.CYAN_CONCRETE)
            .stairs(ModBlocks.CYAN_CONCRETE_STAIRS)
            .wall(ModBlocks.CYAN_CONCRETE_WALLS)
            .slab(ModBlocks.CYAN_CONCRETE_SLABS);

        blockModelGenerators
                .family(Blocks.BLUE_CONCRETE)
                .slab(ModBlocks.BLUE_CONCRETE_SLABS)
                .stairs(ModBlocks.BLUE_CONCRETE_STAIRS);

        // fun

        blockModelGenerators
            .family(Blocks.REDSTONE_BLOCK)
            .stairs(ModBlocks.REDSTONE_BLOCK_STAIRS)
            .slab(ModBlocks.REDSTONE_BLOCK_SLABS);

        blockModelGenerators
            .family(Blocks.REDSTONE_LAMP)
            .stairs(ModBlocks.REDSTONE_LAMP_STAIRS)
            .slab(ModBlocks.REDSTONE_LAMP_SLABS);

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
