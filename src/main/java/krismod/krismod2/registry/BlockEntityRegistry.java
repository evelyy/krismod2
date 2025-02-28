package krismod.krismod2.registry;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public final class BlockEntityRegistry {
    public static final BlockEntityType<MykiReaderBlockEntity> MYKI_READER = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Krismod2.MOD_ID + ":mykireader",
            FabricBlockEntityTypeBuilder.create(MykiReaderBlockEntity::new, BlockRegistry.MYKI_READER).build(null));

    public static final BlockEntityType<OldShelfBlockEntity> OLD_SHELF = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Krismod2.MOD_ID + ":oldshelf",
            FabricBlockEntityTypeBuilder.create(OldShelfBlockEntity::new, BlockRegistry.OLD_SHELF).build(null));

    public static final BlockEntityType<TestBlockEntity> TEST_BLOCK = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Krismod2.MOD_ID + ":testblock",
            FabricBlockEntityTypeBuilder.create(TestBlockEntity::new, BlockRegistry.TEST_BLOCK).build(null));

}