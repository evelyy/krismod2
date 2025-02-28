package krismod.krismod2.client.renderer;

import krismod.krismod2.block.entity.OldShelfBlockEntity;
import krismod.krismod2.client.model.block.OldShelfModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class OldShelfRenderer extends GeoBlockRenderer<OldShelfBlockEntity> {
    public OldShelfRenderer() { super(new OldShelfModel()); }
}
