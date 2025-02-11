import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import software.bernie.example.registry.BlockEntityRegistry;


public class MykiReaderBlock extends FacingBlock implements BlockEntityProvider {
    public MykiReaderBlock() { super(AbstractBlock.Settings.create().nonOpaque()); }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {

    }
}