package com.dennisbonke.testmod.interfaces;

/**
 * Created by Dennisbonke on 14-2-2015.
 */
public interface IProxy {

    public abstract void Init();

    public abstract void registerRenderers();

    public abstract void registerSounds();

    public abstract void registerTileEntities();

    public abstract void registerEventHandlers();

}
