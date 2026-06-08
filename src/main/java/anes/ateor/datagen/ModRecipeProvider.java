package anes.ateor.datagen;

import anes.ateor.block.ModBlocks;
import anes.ateor.item.ModItems;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(
        FabricPackOutput output,
        CompletableFuture<HolderLookup.Provider> registriesFuture
    ) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(
        HolderLookup.Provider registries,
        RecipeOutput output
    ) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                // makes recipes n shi

                // Recipe for Processed Nebula Fragment

                List<ItemLike> NEBULAGAS_SMELTABLES = List.of(
                    ModItems.UNPROCESSED_NEBULA
                );
                oreSmelting(
                    NEBULAGAS_SMELTABLES,
                    RecipeCategory.BREWING,
                    CookingBookCategory.MISC,
                    ModItems.NEBULA,
                    30,
                    '1',
                    "nebulagas"
                );

                // Recipe for Nebulagas.
                List<ItemLike> NEBULAGAS_CONSUMABLES = List.of(
                    ModItems.NEBULAGAS
                );

                shapeless(RecipeCategory.BREWING, ModItems.NEBULAGAS)
                    .requires(ModItems.NEBULA)
                    .requires(Items.GLASS_BOTTLE)
                    .unlockedBy(
                        getHasName(ModItems.NEBULA),
                        has(ModItems.NEBULA)
                    )
                    .group("nebulagas")
                    .save(output);

                // Recipe For Nebula Planks

                List<ItemLike> NEBULA_WOOD = List.of(ModBlocks.NEBULA_PLANKS);

                shapeless(
                    RecipeCategory.BUILDING_BLOCKS,
                    ModBlocks.NEBULA_PLANKS
                )
                    .requires(ModBlocks.NEBULA_LOG)
                    .unlockedBy(
                        getHasName(ModBlocks.NEBULA_LOG),
                        has(ModBlocks.NEBULA_LOG)
                    )
                    .group("nebulagas")
                    .save(output);

                // Recipe For Nebula Sticks

                List<ItemLike> NEBULA_STICKS = List.of(ModItems.NEBULA_STICKS);

                shaped(RecipeCategory.MISC, ModItems.NEBULA_STICKS)
                    .pattern("P")
                    .pattern("P")
                    .define('P', ModBlocks.NEBULA_PLANKS)
                    .unlockedBy(
                        getHasName(ModBlocks.NEBULA_PLANKS),
                        has(ModBlocks.NEBULA_PLANKS)
                    )
                    .group("nebulagas")
                    .save(output);

                // Recipe For Nebula Pickaxe

                shaped(RecipeCategory.TOOLS, ModItems.NEBULA_PICKAXE)
                    .pattern("PPP")
                    .pattern(" N ")
                    .pattern(" N ")
                    .define('N', ModItems.NEBULA_STICKS)
                    .define('P', ModItems.NEBULA)
                    .unlockedBy(
                        getHasName(ModItems.NEBULA),
                        has(ModItems.NEBULA)
                    )
                    .group("nebulagas")
                    .save(output);

                // Recipe for Nebula Stairs

                stairBuilder(
                    ModBlocks.NEBULA_STAIRS,
                    Ingredient.of(ModBlocks.NEBULA_PLANKS)
                )
                    .unlockedBy(
                        getHasName(ModBlocks.NEBULA_PLANKS),
                        has(ModBlocks.NEBULA_PLANKS)
                    )
                    .group("nebulagas")
                    .save(output);

                // Recipe for wool slabs

                slab(
                    RecipeCategory.BUILDING_BLOCKS,
                    ModBlocks.WOOL_SLABS,
                    Blocks.WHITE_WOOL
                );
            }
        };
    }

    @Override
    public String getName() {
        return "ateor recipes";
    }
}
