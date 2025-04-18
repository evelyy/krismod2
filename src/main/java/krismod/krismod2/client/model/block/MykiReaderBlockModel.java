package krismod.krismod2.client.model.block;

import krismod.krismod2.Krismod2;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class MykiReaderBlockModel extends DefaultedBlockGeoModel {
    private final Identifier MYKI_READER_MODEL = new Identifier(Krismod2.MOD_ID, "geo/block/myki_reader.geo.json");
    private final Identifier MYKI_READER_TEXTURE = new Identifier(Krismod2.MOD_ID, "textures/block/myki_reader.png");
    private final Identifier MYKI_READER_ANIMATION = new Identifier(Krismod2.MOD_ID, "animations/block/myki_reader.animation.json");

    public MykiReaderBlockModel() {
        super(new Identifier(Krismod2.MOD_ID, "myki_reader"));
    }

    @Override
    public Identifier getModelResource(GeoAnimatable animatable) {
        return this.MYKI_READER_MODEL;
    }

    @Override
    public Identifier getTextureResource(GeoAnimatable animatable) {
        return this.MYKI_READER_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(GeoAnimatable animatable) { return this.MYKI_READER_ANIMATION; }

    @Override
    public RenderLayer getRenderType(GeoAnimatable animatable, Identifier texture) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }
}
