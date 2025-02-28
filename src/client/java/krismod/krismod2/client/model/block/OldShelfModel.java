package krismod.krismod2.client.model.block;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.entity.OldShelfBlockEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class OldShelfModel extends DefaultedBlockGeoModel<OldShelfBlockEntity> {
    private final Identifier model = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "oldshelf"));
    private final Identifier texture = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "oldshelf"));
    private final Identifier anim = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "oldshelf"));

    public OldShelfModel() { super(new Identifier(Krismod2.MOD_ID, "oldshelf")); }

    @Override
    public Identifier getModelResource(OldShelfBlockEntity animatable) {
        return model;
    }
//    @Override
//    public Identifier getTextureResource(OldShelfBlockEntity animatable) { return texture; }
    @Override
    public RenderLayer getRenderType(OldShelfBlockEntity animatable, Identifier texture) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }

}