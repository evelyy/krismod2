package krismod.krismod2.client.renderer;

import krismod.krismod2.block.CurtainsBlock;
import krismod.krismod2.block.entity.CurtainsBlockEntity;
import krismod.krismod2.block.entity.TestBlockEntity;
import krismod.krismod2.client.model.block.CurtainsBlockModel;
import krismod.krismod2.client.model.block.TestBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class CurtainsBlockRenderer extends GeoBlockRenderer<CurtainsBlockEntity> {
    public CurtainsBlockRenderer() { super(new CurtainsBlockModel()); }
}
