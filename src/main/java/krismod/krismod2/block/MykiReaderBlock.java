package krismod.krismod2.block;

import krismod.krismod2.Krismod2;
import krismod.krismod2.registry.BlockEntityRegistry;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MykiReaderBlock extends FacingBlock implements BlockEntityProvider {

    public MykiReaderBlock() {
        super(Settings.create().nonOpaque().strength(4.0f));
        setDefaultState(getDefaultState().with(Properties.OPEN, false));
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return BlockEntityRegistry.MYKI_READER_BLOCK.instantiate(pos, state);

    }

    @Override
    public BlockRenderType getRenderType(BlockState state) { return BlockRenderType.ENTITYBLOCK_ANIMATED; }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) { builder.add(FACING).add(Properties.OPEN); }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext context) {
        return getDefaultState().with(FACING, context.getPlayerLookDirection().getOpposite());
    }

    @Override
    public void appendTooltip(ItemStack stack, BlockView blockGetter, List<Text> tooltip, TooltipContext tooltipFlag) {
        tooltip.add(Text.translatable("block." + Krismod2.MOD_ID + ".myki_reader.tooltip"));
    }

    // anim and state on right click
    // need to implement myki card
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!state.get(Properties.OPEN)){
            world.playSound(player, pos, SoundEvents.BLOCK_ANVIL_BREAK , SoundCategory.BLOCKS, 1.0f, 1.0f);
            world.setBlockState(pos, state.with(Properties.OPEN, true));
            world.scheduleBlockTick(pos, this, 60);
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        Krismod2.LOGGER.info("closing myki!");
        world.setBlockState(pos, state.with(Properties.OPEN, false));
    }
}
