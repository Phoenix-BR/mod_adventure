package com.phoenix.testemod.setup;

import com.phoenix.testemod.testemod;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



public class registration {
    public static final net.minecraftforge.registries.DeferredRegister<Block> BLOCKS = DeferredRegister.create(net.minecraftforge.registries.ForgeRegistries.BLOCKS, testemod.MOD_ID);
    public static final net.minecraftforge.registries.DeferredRegister<net.minecraft.item.Item> ITEMS = DeferredRegister.create(net.minecraftforge.registries.ForgeRegistries.ITEMS, testemod.MOD_ID);

    public static void register(){
        net.minecraftforge.eventbus.api.IEventBus modEventBus = net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        ModItems.register();
    }
}

