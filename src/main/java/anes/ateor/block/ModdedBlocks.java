package anes.ateor.block;

import anes.ateor.AteorMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModdedBlocks {
    public static Block registerBlock(
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

    // mojang original code.
    public static Block register(final ResourceKey<Block> id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        Block block = (Block)factory.apply(properties.setId(id));
        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    public static Block register(final ResourceKey<Block> id, final BlockBehaviour.Properties properties) {
        return register(id, Block::new, properties);
    }

    private static ResourceKey<Block> vanillaBlockId(final String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.withDefaultNamespace(name));
    }

    private static Block register(final String id, final Function<BlockBehaviour.Properties, Block> factory, final BlockBehaviour.Properties properties) {
        return register(vanillaBlockId(id), factory, properties);
    }

    private static Block register(final String id, final BlockBehaviour.Properties properties) {
        return register(id, Block::new, properties);
    }
    // end of mojang original code

    public static void registerBlockItem(String name, Block block) {
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

    public static void InitModdedBlocks() {
        AteorMod.LOGGER.info("Init ModdedBlocks methods");
    }
}
