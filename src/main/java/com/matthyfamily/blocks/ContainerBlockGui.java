package com.matthyfamily.blocks;

import com.matthyfamily.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public class ContainerBlockGui extends GuiContainer {
    public static final int WIDTH = 358;
    public static final int HEIGHT = 303;

    private static final ResourceLocation background = new ResourceLocation(Reference.MODID, "textures/gui/formula_reconstructor.png");

    public ContainerBlockGui(FormulaReconstructorTileEntity tileEntity, ContainerBlock container) {
        super(container);
        xSize = WIDTH;
        ySize = HEIGHT;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(background);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
