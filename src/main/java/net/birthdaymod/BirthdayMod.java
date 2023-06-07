package net.birthdaymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BirthdayMod implements ModInitializer {
	public static final String MOD_ID = "fabric-birthdaymod";
    public static final Logger LOGGER = LoggerFactory.getLogger("fabric-birthdaymod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}