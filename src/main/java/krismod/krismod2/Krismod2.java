package krismod.krismod2;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Krismod2 implements ModInitializer {
    public static final String MOD_ID = "krismod2";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initialized!");
    }
}
