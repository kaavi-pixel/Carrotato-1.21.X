package net.aroundforge.carrotato.datagen;

import net.aroundforge.carrotato.registry.ModBlocks;
import net.aroundforge.carrotato.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // blockStateModelGenerator.registerCrop(ModBlocks.CHILI_CROP, ChiliCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHILI, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHILI_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIED_CHILI, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHILI_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPICY_CHILI_CON_CARNE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPICY_FRIED_CHICKEN, Models.GENERATED);
    }
}
