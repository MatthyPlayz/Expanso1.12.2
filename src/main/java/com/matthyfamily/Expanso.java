package com.matthyfamily;

import com.matthyfamily.init.ModBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MODID, name=Reference.MODNAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class Expanso {
    @Mod.Instance
    public static Expanso instance;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.MODID + ":preInit");
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiProxy());
        System.out.println(Reference.MODID + ":init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.MODID + ":postInit");
    }

}