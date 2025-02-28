package krismod.krismod2.client.renderer;

import krismod.krismod2.block.entity.TestBlockEntity;
import krismod.krismod2.client.model.block.TestBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class TestBlockRenderer extends GeoBlockRenderer<TestBlockEntity> {
    public TestBlockRenderer() { super(new TestBlockModel()); }
}
