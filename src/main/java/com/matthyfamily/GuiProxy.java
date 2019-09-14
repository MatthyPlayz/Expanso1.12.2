package com.matthyfamily;

import com.matthyfamily.blocks.ContainerBlockGui;
import com.matthyfamily.blocks.FormulaReconstructorTileEntity;
import com.matthyfamily.blocks.ContainerBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiProxy implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof FormulaReconstructorTileEntity) {
            return new ContainerBlock(player.inventory, (FormulaReconstructorTileEntity) te);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof FormulaReconstructorTileEntity) {
            FormulaReconstructorTileEntity containerTileEntity = (FormulaReconstructorTileEntity) te;
            return new ContainerBlockGui(containerTileEntity, new ContainerBlock(player.inventory, containerTileEntity));
        }
        return null;
    }
}
