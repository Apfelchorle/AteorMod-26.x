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

        blockModelGenerators
            .family(Blocks.WHITE_WOOL)
            .slab(ModBlocks.WOOL_SLABS)
            .stairs(ModBlocks.WOOL_STAIRS);
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
