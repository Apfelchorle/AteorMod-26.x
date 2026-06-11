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
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

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

    public static final Block WOOL_WALLS = CreateWalls(
        "wool_walls",
        SoundType.WOOL
    );

    // Wool Stairs + Slabs Created Using CreateWool Method
    public static final Block RED_WOOL_STAIRS = CreateWoolStairs(
        "red_wool_stairs",
        Blocks.RED_WOOL.defaultBlockState()
    );
    public static final Block RED_WOOL_SLABS = CreateWoolSlabs(
        "red_wool_slabs"
    );

    public static final Block CYAN_WOOL_STAIRS = CreateWoolStairs(
        "cyan_wool_stairs",
        Blocks.CYAN_WOOL.defaultBlockState()
    );
    public static final Block CYAN_WOOL_SLABS = CreateWoolSlabs(
        "cyan_wool_slabs"
    );

    public static final Block BLACK_WOOL_STAIRS = CreateWoolStairs(
        "black_wool_stairs",
        Blocks.BLACK_WOOL.defaultBlockState()
    );
    public static final Block BLACK_WOOL_SLABS = CreateWoolSlabs(
        "black_wool_slabs"
    );

    public static final Block BLUE_WOOL_STAIRS = CreateWoolStairs(
        "blue_wool_stairs",
        Blocks.BLUE_WOOL.defaultBlockState()
    );
    public static final Block BLUE_WOOL_SLABS = CreateWoolSlabs(
        "blue_wool_slabs"
    );

    public static final Block YELLOW_WOOL_STAIRS = CreateWoolStairs(
        "yellow_wool_stairs",
        Blocks.YELLOW_WOOL.defaultBlockState()
    );
    public static final Block YELLOW_WOOL_SLABS = CreateWoolSlabs(
        "yellow_wool_slabs"
    );

    public static final Block PINK_WOOL_STAIRS = CreateWoolStairs(
        "pink_wool_stairs",
        Blocks.PINK_WOOL.defaultBlockState()
    );

    public static final Block PINK_WOOL_SLABS = CreateWoolSlabs(
        "pink_wool_slabs"
    );

    public static final Block MAGENTA_WOOL_STAIRS = CreateWoolStairs(
        "magenta_wool_stairs",
        Blocks.MAGENTA_WOOL.defaultBlockState()
    );

    public static final Block MAGENTA_WOOL_SLABS = CreateWoolSlabs(
        "magenta_wool_slabs"
    );

    public static final Block GREEN_WOOL_STAIRS = CreateWoolStairs(
        "green_wool_stairs",
        Blocks.GREEN_WOOL.defaultBlockState()
    );

    public static final Block GREEN_WOOL_SLABS = CreateWoolSlabs(
        "green_wool_slabs"
    );

    public static final Block LIGHT_GRAY_WOOL_STAIRS = CreateWoolStairs(
        "light_gray_wool_stairs",
        Blocks.LIGHT_GRAY_WOOL.defaultBlockState()
    );

    public static final Block LIGHT_GRAY_WOOL_SLABS = CreateWoolSlabs(
        "light_gray_wool_slabs"
    );

    public static final Block GRAY_WOOL_STAIRS = CreateWoolStairs(
        "gray_wool_stairs",
        Blocks.GRAY_WOOL.defaultBlockState()
    );

    public static final Block GRAY_WOOL_SLABS = CreateWoolSlabs(
        "gray_wool_slabs"
    );

    public static final Block BROWN_WOOL_STAIRS = CreateWoolStairs(
        "brown_wool_stairs",
        Blocks.BROWN_WOOL.defaultBlockState()
    );

    public static final Block BROWN_WOOL_SLABS = CreateWoolSlabs(
        "brown_wool_slabs"
    );

    public static final Block ORANGE_WOOL_STAIRS = CreateWoolStairs(
        "orange_wool_stairs",
        Blocks.ORANGE_WOOL.defaultBlockState()
    );

    public static final Block ORANGE_WOOL_SLABS = CreateWoolSlabs(
        "orange_wool_slabs"
    );

    public static final Block LIME_WOOL_STAIRS = CreateWoolStairs(
        "lime_wool_stairs",
        Blocks.LIME_WOOL.defaultBlockState()
    );

    public static final Block LIME_WOOL_SLABS = CreateWoolSlabs(
        "lime_wool_slabs"
    );

    public static final Block LIGHT_BLUE_WOOL_STAIRS = CreateWoolStairs(
        "light_blue_wool_stairs",
        Blocks.LIGHT_BLUE_WOOL.defaultBlockState()
    );

    public static final Block LIGHT_BLUE_WOOL_SLABS = CreateWoolSlabs(
        "light_blue_wool_slabs"
    );

    public static final Block PURPLE_WOOL_STAIRS = CreateWoolStairs(
        "purple_wool_stairs",
        Blocks.PURPLE_WOOL.defaultBlockState()
    );

    public static final Block PURPLE_WOOL_SLABS = CreateWoolSlabs(
        "purple_wool_slabs"
    );

    // STONE BASED BLOCKS

    public static final Block END_STONE_STAIRS = CreateStairs(
        "end_stone_stairs",
        Blocks.END_STONE.defaultBlockState(),
        SoundType.STONE
    );
    public static final Block END_STONE_SLABS = CreateSlabs(
        "end_stone_slabs",
        SoundType.STONE
    );

    // BLOCKS

    // public static final Block GRASS_BLOCK_STAIRS = CreateStairs("grass_block_stairs", Blocks.GRASS_BLOCK.defaultBlockState(), SoundType.GRASS);
    // public static final Block GRASS_BLOCK_SLABS = CreateSlabs("grass_block_slabs", SoundType.GRASS);

    //    public static final Block OAK_WOOD_STAIRS = CreateStairs(
    //        "oak_wood_stairs",
    //        Blocks.OAK_WOOD.defaultBlockState(),
    //        SoundType.WOOD
    //    );
    //    public static final Block OAK_WOOD_SLABS = CreateSlabs(
    //        "oak_wood_slabs",
    //        SoundType.WOOD
    //    );

    // concrete
    public static final Block BLACK_CONCRETE_STAIRS = CreateStairs(
        "black_concrete_stairs",
        Blocks.BLACK_CONCRETE.defaultBlockState(),
        SoundType.STONE
    );

    public static final Block BLACK_CONCRETE_SLABS = CreateSlabs(
        "black_concrete_slabs",
        SoundType.STONE
    );

    public static final Block BLUE_CONCRETE_STAIRS = CreateStairs(
        "blue_concrete_stairs",
        Blocks.BLUE_CONCRETE.defaultBlockState(),
        SoundType.STONE
    );

    public static final Block BLUE_CONCRETE_SLABS = CreateSlabs(
        "blue_concrete_slabs",
        SoundType.STONE
    );

    public static final Block CYAN_CONCRETE_STAIRS = CreateStairs(
        "cyan_concrete_stairs",
        Blocks.CYAN_CONCRETE.defaultBlockState(),
        SoundType.STONE
    );

    public static final Block CYAN_CONCRETE_SLABS = CreateSlabs(
        "cyan_concrete_slabs",
        SoundType.STONE
    );

    public static final Block CYAN_CONCRETE_WALLS = CreateWalls(
        "cyan_concrete_walls",
        SoundType.STONE
    );

    public static final Block REDSTONE_BLOCK_STAIRS = CreateStairs(
        "redstone_block_stairs",
        Blocks.REDSTONE_BLOCK.defaultBlockState(),
        SoundType.STONE
    );

    public static final Block REDSTONE_BLOCK_SLABS = CreateSlabs(
        "redstone_block_slabs",
        SoundType.STONE
    );

    public static final Block REDSTONE_LAMP_STAIRS = CreateStairs(
        "redstone_lamp_stairs",
        Blocks.REDSTONE_LAMP.defaultBlockState(),
        SoundType.STONE
    );

    public static final Block REDSTONE_LAMP_SLABS = CreateSlabs(
        "redstone_lamp_slabs",
        SoundType.STONE
    );

    // BLOCK CREATION METHODS

    private static Block CreateWalls(String name, SoundType soundType) {
        return registerBlock(name, properties ->
            new WallBlock(properties.strength(3F).sound(soundType))
        );
    }

    private static Block CreateStairs(
        String name,
        BlockState blockState,
        SoundType soundType
    ) {
        return registerBlock(name, properties ->
            new StairBlock(blockState, properties.strength(3F).sound(soundType))
        );
    }

    private static Block CreateSlabs(String name, SoundType soundType) {
        return registerBlock(name, properties ->
            new SlabBlock(properties.strength(3F).sound(soundType))
        );
    }

    private static Block CreateWoolStairs(String name, BlockState blockState) {
        return registerBlock(name, properties ->
            new StairBlock(
                blockState,
                properties.strength(1F).sound(SoundType.WOOL)
            )
        );
    }

    private static Block CreateWoolSlabs(String name) {
        return registerBlock(name, properties ->
            new SlabBlock(properties.strength(1F).sound(SoundType.WOOL))
        );
    }

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
