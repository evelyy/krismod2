package krismod.krismod2.client.model.block;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.entity.CurtainsBlockEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class CurtainsBlockModel extends DefaultedBlockGeoModel<CurtainsBlockEntity> {
    private final Identifier model = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "curtains_test"));
    private final Identifier texture = buildFormattedTexturePath(new Identifier(Krismod2.MOD_ID, "curtain"));
//    private final Identifier anim = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "testblock"));

    public CurtainsBlockModel() { super(new Identifier(Krismod2.MOD_ID, "curtains_test")); }

    @Override
    public Identifier getModelResource(CurtainsBlockEntity animatable) {
        return model;
    }
    @Override
    public Identifier getTextureResource(CurtainsBlockEntity animatable) { return texture; }
    @Override
    public RenderLayer getRenderType(CurtainsBlockEntity animatable, Identifier texture) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }

}