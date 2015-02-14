package com.dennisbonke.testmod;

import com.dennisbonke.testmod.interfaces.IProxy;
import com.dennisbonke.testmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Dennisbonke on 14-2-2015.
 */
// 22:33 in episode 1
@Mod(name = Reference.name, modid = Reference.modid, version = Reference.version)
public class TestMod {

    @Instance(Reference.modid)
    public static TestMod instance;
    @SidedProxy(serverSide = Reference.serverProxy, clientSide = Reference.clientProxy)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {



    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

        proxy.registerRenderers();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {



    }

}
