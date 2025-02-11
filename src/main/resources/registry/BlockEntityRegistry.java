import krismod.krismod2.Krismod2;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public final class BlockEntityRegistry {
    public static final BlockEntityType<MykiReaderBlockEntity> MYKI_READER = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Krismod2.MOD_ID + ":mykireader",
            FabricBlockEntityTypeBuilder.create(MykiReaderBlockEntity::new, ))

}