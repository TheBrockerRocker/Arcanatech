package net.brocker.arcanatech.item;

import net.brocker.arcanatech.Arcanatech;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    
    public static final ItemGroup ARCANATECH_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, 
        Identifier.of(Arcanatech.MOD_ID, "arcanatech_items"), 
        FabricItemGroup.builder().icon(null)
            .displayName(Text.translatable("itemgroup.arcanatech.arcanatech_items"))
            .entries((displayContext, entries) -> {
                
            }).build());

    public static void registerItemGroups() {
        Arcanatech.LOGGER.info("Registering Item Groups for " + Arcanatech.MOD_ID);
    }
}