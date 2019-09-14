package com.matthyfamily.init;

import com.matthyfamily.Reference;
import com.matthyfamily.blocks.FormulaReconstructorBlock;
import com.matthyfamily.blocks.FormulaReconstructorTileEntity;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid= Reference.MODID)
public class ModBlocks extends TileEntity {
    @GameRegistry.ObjectHolder("expanso:formula_reconstructor")
    public static FormulaReconstructorBlock formulaReconstructor;
    public static void init() {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new FormulaReconstructorBlock());
        // FormulaReconstructorTileEntity.class, Reference.MODID + "formula_reconstructor"
        // old ^0,0,0
        GameRegistry.registerTileEntity(FormulaReconstructorTileEntity.class, new ResourceLocation(Reference.MODID,"formula_reconstructor"));
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(formulaReconstructor).setRegistryName(formulaReconstructor.getRegistryName()));
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerRenders(ModelRegistryEvent event) {
        formulaReconstructor.initModel();
    }

    public static void registerRender(Item item) {

    }
}