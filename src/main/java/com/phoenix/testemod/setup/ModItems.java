package com.phoenix.testemod.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
public class ModItems {
    public static final net.minecraftforge.fml.RegistryObject<Item> SILVER_INGOT = registration.ITEMS.register("silver_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    static void register() {
    }
}
