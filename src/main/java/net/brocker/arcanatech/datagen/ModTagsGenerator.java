package net.brocker.arcanatech.datagen;

import net.brocker.arcanatech.Arcanatech;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModTagsGenerator extends FabricTagProvider.BlockTagProvider {
    public ModTagsGenerator(FabricDataOutput output, CompletableFuture registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> PIPE_DONT_LIKE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(Arcanatech.MOD_ID, "pipe_dont_like"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(PIPE_DONT_LIKE).add(Blocks.BEDROCK);
    }
}
