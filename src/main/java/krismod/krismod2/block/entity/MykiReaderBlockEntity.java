package krismod.krismod2.block.entity;

import krismod.krismod2.Krismod2;
import krismod.krismod2.registry.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class MykiReaderBlockEntity extends BlockEntity implements GeoBlockEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    protected static final RawAnimation MYKI_READER_ANIMS = RawAnimation.begin().thenPlay("myki.open").thenPlay("myki.idle").thenPlay("myki.close");

    public MykiReaderBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityRegistry.MYKI_READER, pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        // put stuff here to animate lol
        controllers.add(new AnimationController<>(this, state -> {
            boolean isOpen = this.getCachedState().get(Properties.OPEN);
            if (isOpen) {
                return state.setAndContinue(MYKI_READER_ANIMS);
            }
//            if (!isOpen) {
//                return state;
//            }
            return PlayState.CONTINUE;
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() { return this.cache; }
}
