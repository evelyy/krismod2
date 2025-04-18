package krismod.krismod2.registry;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.*;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {
    public static final OldShelfBlock OLD_SHELF_BLOCK = registerBlock("old_shelf", new OldShelfBlock());
    public static final MykiReaderBlock MYKI_READER_BLOCK = registerBlock("myki_reader", new MykiReaderBlock());

    public static <B extends Block> B registerBlock(String name, B block) {
        return Registry.register(Registries.BLOCK, new Identifier(Krismod2.MOD_ID, name), block);
    }
}
