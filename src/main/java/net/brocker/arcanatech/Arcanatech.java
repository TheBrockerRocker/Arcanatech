package net.brocker.arcanatech;

import net.brocker.arcanatech.block.ModBlocks;
import net.brocker.arcanatech.item.ModItemGroups;
import net.brocker.arcanatech.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Arcanatech implements ModInitializer {
    public static final String MOD_ID = "arcanatech";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
