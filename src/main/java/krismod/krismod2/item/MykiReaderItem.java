package krismod.krismod2.item;

import krismod.krismod2.client.model.item.MykiReaderItemModel;
import krismod.krismod2.client.model.item.OldShelfItemModel;
import net.minecraft.block.Block;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.item.BlockItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.renderer.GeoItemRenderer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MykiReaderItem extends BlockItem implements GeoItem {
    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);

    public MykiReaderItem(Block block, Settings settings) { super(block, settings); }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoItemRenderer<MykiReaderItem> renderer = null;

            @Override
            public BuiltinModelItemRenderer getCustomRenderer() {
                if (this.renderer == null)
                    this.renderer = new GeoItemRenderer<>(new MykiReaderItemModel());

                return this.renderer;
            }
        });
    }

    @Override
    public Supplier<Object> getRenderProvider() { return this.renderProvider; }


    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {}

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() { return this.cache; }
}
