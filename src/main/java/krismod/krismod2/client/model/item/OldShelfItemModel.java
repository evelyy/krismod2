package krismod.krismod2.client.model.item;

import krismod.krismod2.Krismod2;
import krismod.krismod2.item.OldShelfItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class OldShelfItemModel extends GeoModel<OldShelfItem> {
    @Override
    public Identifier getModelResource(OldShelfItem animatable) {
        return new Identifier(Krismod2.MOD_ID, "geo/block/old_shelf.geo.json");
    }

    @Override
    public Identifier getTextureResource(OldShelfItem animatable) {
        return new Identifier(Krismod2.MOD_ID, "texture/block/old_shelf_brown.png");
    }

    @Override
    public Identifier getAnimationResource(OldShelfItem animatable) {
        return null;
    }
}
