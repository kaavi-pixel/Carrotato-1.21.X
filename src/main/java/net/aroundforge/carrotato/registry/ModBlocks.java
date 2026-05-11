package net.aroundforge.carrotato.registry;

import net.aroundforge.carrotato.Carrotato;
import net.aroundforge.carrotato.block.ChiliCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CHILI_CROP = registerBlockWithoutItem("chili_crop",
            new ChiliCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Carrotato.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Carrotato.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Carrotato.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Carrotato.LOGGER.info("Registering Mod Blocks for " + Carrotato.MOD_ID);
    }
}
