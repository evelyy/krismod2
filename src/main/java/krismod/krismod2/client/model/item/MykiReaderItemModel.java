package krismod.krismod2.client.model.item;

import krismod.krismod2.Krismod2;
import krismod.krismod2.item.MykiReaderItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MykiReaderItemModel extends GeoModel<MykiReaderItem> {
    @Override
    public Identifier getModelResource(MykiReaderItem animatable) {
        return new Identifier(Krismod2.MOD_ID, "geo/block/myki_reader.geo.json");
    }

    @Override
    public Identifier getTextureResource(MykiReaderItem animatable) {
        return new Identifier(Krismod2.MOD_ID, "textures/block/myki_reader.png");
    }

    @Override
    public Identifier getAnimationResource(MykiReaderItem animatable) {
        return null;
    }
}
