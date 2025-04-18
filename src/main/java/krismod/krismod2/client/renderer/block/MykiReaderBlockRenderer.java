package krismod.krismod2.client.renderer.block;

import krismod.krismod2.block.entity.MykiReaderBlockEntity;
import krismod.krismod2.client.model.block.MykiReaderBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class MykiReaderBlockRenderer extends GeoBlockRenderer<MykiReaderBlockEntity> {
    public MykiReaderBlockRenderer() { super(new MykiReaderBlockModel()); }
}
