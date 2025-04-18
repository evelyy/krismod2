package krismod.krismod2.registry;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.OldShelfBlock;
import krismod.krismod2.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemRegistry {
    public static final OldShelfItem OLD_SHELF_ITEM = registerItem("old_shelf", new OldShelfItem(BlockRegistry.OLD_SHELF_BLOCK, new Item.Settings()));
    public static final MykiReaderItem MYKI_READER_ITEM = registerItem("myki_reader", new MykiReaderItem(BlockRegistry.MYKI_READER_BLOCK, new Item.Settings()));

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Krismod2.MOD_ID, "krismod"), FabricItemGroup
            .builder()
            .displayName(Text.translatable("itemGroup.krismod2.krismod"))
            .icon(() -> new ItemStack(ItemRegistry.OLD_SHELF_ITEM))
            .entries((enabledFeatures, entries) -> {
                entries.add(ItemRegistry.OLD_SHELF_ITEM);
                entries.add(ItemRegistry.MYKI_READER_ITEM);
            }).build());

    private static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(Krismod2.MOD_ID, name), item);
    }
}
