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
        BlockEntityRendererFactories.register(BlockEntityRegistry.OLD_SHELF,
                context -> new OldShelfBlockRenderer());
        BlockEntityRendererFactories.register(BlockEntityRegistry.MYKI_READER,
                context -> new MykiReaderBlockRenderer());
        BlockEntityRendererFactories.register(BlockEntityRegistry.CURTAINS_TEST,
                context -> new CurtainsBlockRenderer());
        BlockEntityRendererFactories.register(BlockEntityRegistry.VERT_WOOD_PLANKS,
                context -> new VertPlankBlockRenderer());
    }
}
