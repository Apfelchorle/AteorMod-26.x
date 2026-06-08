package anes.ateor.block;

import anes.ateor.AteorMod;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

    public static final Block NEBULA_FRAGMENT_BLOCK = registerBlock(
        "nebula_fragment",
        properties ->
            new Block(
                properties
                    .strength(4F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST_CLUSTER)
            )
    );
    public static final Block NEBULA_LOG = registerBlock(
        "nebula_log",
        properties ->
            new Block(properties.strength(1F).sound(SoundType.NETHER_WOOD))
    );
    public static final Block NEBULA_PLANKS = registerBlock(
        "nebula_planks",
        properties ->
            new Block(properties.strength(1F).sound(SoundType.NETHER_WOOD))
    );

    public static final Block NEBULA_STAIRS = registerBlock(
        "nebula_stairs",
        properties ->
            new StairBlock(
                ModBlocks.NEBULA_PLANKS.defaultBlockState(),
                properties.strength(3F).sound(SoundType.AMETHYST)
            )
    );

    public static final Block NEBULA_SLABS = registerBlock(
        "nebula_slabs",
        properties ->
            new SlabBlock(properties.strength(3F).sound(SoundType.AMETHYST))
    );

    // Add Wool Blocks For Fun Cuz New Wool Blocks are added.

    public static final Block WOOL_SLABS = registerBlock(
        "wool_slabs",
        properties ->
            new SlabBlock(properties.strength(3F).sound(SoundType.WOOL))
    );

    public static final Block WOOL_STAIRS = registerBlock(
        "wool_stairs",
        properties ->
            new StairBlock(
                Blocks.WHITE_WOOL.defaultBlockState(),
                properties.strength(3F).sound(SoundType.WOOL)
            )
    );

    private static Block registerBlock(
        String name,
        Function<BlockBehaviour.Properties, Block> function
    ) {
        Block toRegister = function.apply(
            BlockBehaviour.Properties.of().setId(
                ResourceKey.create(
                    Registries.BLOCK,
                    Identifier.fromNamespaceAndPath(AteorMod.MOD_ID, name)
                )
            )
        );
        registerBlockItem(name, toRegister);
        return Registry.register(
            BuiltInRegistries.BLOCK,
            Identifier.fromNamespaceAndPath(AteorMod.MOD_ID, name),
            toRegister
        );
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(
            BuiltInRegistries.ITEM,
            Identifier.fromNamespaceAndPath(AteorMod.MOD_ID, name),
            new BlockItem(
                block,
                new Item.Properties()
                    .useBlockDescriptionPrefix()
                    .setId(
                        ResourceKey.create(
                            Registries.ITEM,
                            Identifier.fromNamespaceAndPath(
                                AteorMod.MOD_ID,
                                name
                            )
                        )
                    )
            )
        );
    }

    public static void registerModBlocks() {
        AteorMod.LOGGER.info("Registering ModBlocks");
    }
}
