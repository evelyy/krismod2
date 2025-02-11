package krismod.krismod2.client.renderer;

import krismod.krismod2.block.entity.MykiReaderBlockEntity;
import krismod.krismod2.client.model.block.MykiReaderModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class MykiReaderRenderer extends GeoBlockRenderer<MykiReaderBlockEntity> {
    public MykiReaderRenderer() { super(new MykiReaderModel()); }
}
