package krismod.krismod2.client.renderer.block;

import krismod.krismod2.block.entity.OldShelfBlockEntity;
import krismod.krismod2.client.model.block.OldShelfBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class OldShelfBlockRenderer extends GeoBlockRenderer<OldShelfBlockEntity> {
    public OldShelfBlockRenderer() { super(new OldShelfBlockModel()); }
}
