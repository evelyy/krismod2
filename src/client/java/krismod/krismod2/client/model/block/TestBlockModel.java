package krismod.krismod2.client.model.block;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.entity.TestBlockEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class TestBlockModel extends DefaultedBlockGeoModel<TestBlockEntity> {
    private final Identifier model = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "testblock"));
    private final Identifier texture = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "testblock"));
    private final Identifier anim = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "testblock"));

    public TestBlockModel() { super(new Identifier(Krismod2.MOD_ID, "testblock")); }

    @Override
    public Identifier getModelResource(TestBlockEntity animatable) {
        return model;
    }
//    @Override
//    public Identifier getTextureResource(TestBlockEntity animatable) { return texture; }
    @Override
    public RenderLayer getRenderType(TestBlockEntity animatable, Identifier texture) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }

}