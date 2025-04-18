package krismod.krismod2.registry;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockEntityRegistry {
    public static final BlockEntityType<OldShelfBlockEntity> OLD_SHELF_BLOCK = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Krismod2.MOD_ID + ":old_shelf",
            FabricBlockEntityTypeBuilder.create(OldShelfBlockEntity::new, BlockRegistry.OLD_SHELF_BLOCK).build(null));
    public static final BlockEntityType<MykiReaderBlockEntity> MYKI_READER_BLOCK = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Krismod2.MOD_ID + ":myki_reader",
            FabricBlockEntityTypeBuilder.create(MykiReaderBlockEntity::new, BlockRegistry.MYKI_READER_BLOCK).build(null));
}
