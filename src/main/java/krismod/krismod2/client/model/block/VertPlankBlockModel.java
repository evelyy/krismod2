package krismod.krismod2.client.model.block;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.entity.VertPlankBlockEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class VertPlankBlockModel extends DefaultedBlockGeoModel<VertPlankBlockEntity> {
    private final Identifier model = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "vert-wood-planks"));
    private final Identifier texture = buildFormattedTexturePath(new Identifier(Krismod2.MOD_ID, "vert-wood-planks"));

    public VertPlankBlockModel() { super(new Identifier(Krismod2.MOD_ID, "vert-wood-planks")); }

    @Override
    public Identifier getModelResource(VertPlankBlockEntity animatable) {
        return this.model;
    }
    @Override
    public Identifier getTextureResource(VertPlankBlockEntity animatable) { return this.texture; }
    @Override
    public RenderLayer getRenderType(VertPlankBlockEntity animatable, Identifier texture) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }

}