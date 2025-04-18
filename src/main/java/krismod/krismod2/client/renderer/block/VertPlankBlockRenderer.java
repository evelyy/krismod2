package krismod.krismod2.client.renderer.block;

import krismod.krismod2.block.entity.VertPlankBlockEntity;
import krismod.krismod2.client.model.block.VertPlankBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class VertPlankBlockRenderer extends GeoBlockRenderer<VertPlankBlockEntity> {
    public VertPlankBlockRenderer() { super(new VertPlankBlockModel()); }
}
