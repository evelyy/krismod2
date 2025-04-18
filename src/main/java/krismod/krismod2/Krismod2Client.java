package krismod.krismod2;

import krismod.krismod2.client.renderer.block.*;
import krismod.krismod2.registry.BlockEntityRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class Krismod2Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerRenderers();
    }

    private static void registerRenderers() {
        BlockEntityRendererFactories.register(BlockEntityRegistry.OLD_SHELF_BLOCK,
                context -> new OldShelfBlockRenderer());
        BlockEntityRendererFactories.register(BlockEntityRegistry.MYKI_READER_BLOCK,
                context -> new MykiReaderBlockRenderer());
    }
}
