package net.brocker.arcanatech.item;

import java.util.function.Function;

import net.brocker.arcanatech.Arcanatech;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    
    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Arcanatech.MOD_ID), 
            function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Arcanatech.MOD_ID, name)))));
    }
    public static void registerModItems() {
        Arcanatech.LOGGER.info("Registering Mod Items for " + Arcanatech.MOD_ID);
    }
}