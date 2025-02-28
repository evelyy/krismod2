package krismod.krismod2.client.model.block;

import krismod.krismod2.Krismod2;
import krismod.krismod2.block.entity.MykiReaderBlockEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class MykiReaderModel extends DefaultedBlockGeoModel<MykiReaderBlockEntity> {
    private final Identifier model = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "mykireader"));
    private final Identifier texture = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "mykireader"));
    private final Identifier anim = buildFormattedModelPath(new Identifier(Krismod2.MOD_ID, "mykireader"));

    public MykiReaderModel() { super(new Identifier(Krismod2.MOD_ID, "mykireader")); }

    @Override
    public Identifier getModelResource(MykiReaderBlockEntity animatable) {
        return model;
    }
    @Override
    public RenderLayer getRenderType(MykiReaderBlockEntity animatable, Identifier texture) {
        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }

}