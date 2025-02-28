package krismod.krismod2.registry;

import krismod.krismod2.Krismod2;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.GeckoLib;

public class ItemRegistry {
    public static final BlockItem MYKI_READER = registerItem("myki_reader", new BlockItem(BlockRegistry.MYKI_READER, new Item.Settings()));
    public static final BlockItem OLD_SHELF = registerItem("old_shelf", new BlockItem(BlockRegistry.OLD_SHELF, new Item.Settings()));
    public static final BlockItem TEST_BLOCK = registerItem("test_block", new BlockItem(BlockRegistry.TEST_BLOCK, new Item.Settings()));
    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Krismod2.MOD_ID, "test"), FabricItemGroup
            .builder()
            .displayName(Text.translatable("itemGroup.krismod2.test"))
            .icon(() -> new ItemStack(ItemRegistry.MYKI_READER))
            .entries((enabledFeatures, entries) -> {
                entries.add(ItemRegistry.MYKI_READER);
                entries.add(ItemRegistry.OLD_SHELF);
                entries.add(ItemRegistry.TEST_BLOCK);
            }).build());

    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(Krismod2.MOD_ID, name), item);
    }
}
