package krismod.krismod2.block;

import krismod.krismod2.Krismod2;
import krismod.krismod2.registry.BlockEntityRegistry;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class MykiReaderBlock extends FacingBlock implements BlockEntityProvider {
    public MykiReaderBlock() { super(AbstractBlock.Settings.create().nonOpaque()); }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return BlockEntityRegistry.MYKI_READER.instantiate(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) { return BlockRenderType.ENTITYBLOCK_ANIMATED; }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) { builder.add(FACING); }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        return getDefaultState().with(FACING, context.getPlayerLookDirection().getOpposite());
    }

    @Override
    public void appendTooltip(ItemStack stack, BlockView blockGetter, List<Text> tooltip, TooltipContext tooltopFlag) {
        tooltip.add(Text.translatable("block." + Krismod2.MOD_ID + ".mykireader.tooltip"));

        super.appendTooltip(stack, blockGetter, tooltip, tooltopFlag);
    }
}