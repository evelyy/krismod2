package krismod.krismod2.item;

import krismod.krismod2.Krismod2;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Krismod2.MOD_ID, name), item);
    }
}
