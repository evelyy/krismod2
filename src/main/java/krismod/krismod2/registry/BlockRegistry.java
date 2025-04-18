package krismod.krismod2.registry;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.*;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {
    public static final MykiReaderBlock MYKI_READER = registerBlock("mykireader", new MykiReaderBlock());
    public static final OldShelfBlock OLD_SHELF = registerBlock("oldshelf", new OldShelfBlock());
    public static final CurtainsBlock CURTAINS_TEST = registerBlock("curtainstest", new CurtainsBlock());
    public static final VertPlankBlock VERT_WOOD_PLANKS = registerBlock("vert-wood-planks", new VertPlankBlock());

    public static <B extends Block> B registerBlock(String name, B block) {
        return Registry.register(Registries.BLOCK, new Identifier(Krismod2.MOD_ID, name), block);
    }
}