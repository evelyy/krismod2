package krismod.krismod2.client.model.block;

import krismod.krismod2.Krismod2;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class OldShelfBlockModel extends DefaultedBlockGeoModel {
    private final Identifier OLD_SHELF_MODEL = new Identifier(Krismod2.MOD_ID, "geo/block/old_shelf.geo.json");
    private final Identifier OLD_SHELF_TEXTURE = new Identifier(Krismod2.MOD_ID, "texture/block/old_shelf_brown.png");

    public OldShelfBlockModel() {
        super(new Identifier(Krismod2.MOD_ID, "old_shelf"));
        super.withAltTexture(new Identifier(Krismod2.MOD_ID, "old_shelf_brown"));
    }

    @Override
    public Identifier getModelResource(GeoAnimatable animatable) {
        return this.OLD_SHELF_MODEL;
    }

    @Override
    public Identifier getTextureResource(GeoAnimatable animatable) {
        return this.OLD_SHELF_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(GeoAnimatable animatable) {
        return null;
    }

    @Override
    public RenderLayer getRenderType(GeoAnimatable animatable, Identifier texture) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }
}
