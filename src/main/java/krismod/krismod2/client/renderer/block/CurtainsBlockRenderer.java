package krismod.krismod2.client.renderer.block;

import krismod.krismod2.block.entity.CurtainsBlockEntity;
import krismod.krismod2.client.model.block.CurtainsBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class CurtainsBlockRenderer extends GeoBlockRenderer<CurtainsBlockEntity> {
    public CurtainsBlockRenderer() { super(new CurtainsBlockModel()); }
}
