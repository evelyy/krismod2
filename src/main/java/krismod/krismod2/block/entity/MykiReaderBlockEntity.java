package krismod.krismod2.block.entity;

import krismod.krismod2.registry.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import static krismod.krismod2.block.MykiReaderBlock.OPEN;

public class MykiReaderBlockEntity extends BlockEntity implements GeoBlockEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    protected static final RawAnimation MYKI_READER_ANIMS = RawAnimation.begin().thenPlay("myki.open").thenPlay("myki.close");

    public MykiReaderBlockEntity(BlockPos pos, BlockState state) { super(BlockEntityRegistry.MYKI_READER, pos, state); }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, state -> {
            if (this.getCachedState().get(OPEN)) {
                    return state.setAndContinue(MYKI_READER_ANIMS);
                }
            return PlayState.CONTINUE;
        }));
    }
    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
