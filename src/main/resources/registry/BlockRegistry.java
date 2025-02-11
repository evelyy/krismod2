import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {
    public static final MykiReaderBlock MYKI_READER_BLOCK = registerBlock("mykireader", new MykiReaderBlock());

    public static <B extends Block> B registerBlock(String name, B block) {
        return Registry.register(Registries.BLOCK, new Identifier(krismod.krismod2.Krismod2.MOD_ID, name), block);
    }
}