package krismod.krismod2.client;

import krismod.krismod2.client.renderer.MykiReaderRenderer;
import krismod.krismod2.client.renderer.OldShelfRenderer;
import krismod.krismod2.client.renderer.TestBlockRenderer;
import krismod.krismod2.registry.BlockEntityRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl;

public class Krismod2Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        registerRenderers();
    }

    private static void registerRenderers() {
        BlockEntityRendererRegistryImpl.register(BlockEntityRegistry.MYKI_READER,
                context -> new MykiReaderRenderer());
        BlockEntityRendererRegistryImpl.register(BlockEntityRegistry.OLD_SHELF,
                context -> new OldShelfRenderer());
        BlockEntityRendererRegistryImpl.register(BlockEntityRegistry.TEST_BLOCK,
                context -> new TestBlockRenderer());
    }
}
