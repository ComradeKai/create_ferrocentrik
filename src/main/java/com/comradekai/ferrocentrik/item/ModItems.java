package com.comradekai.ferrocentrik.item;

import com.comradekai.ferrocentrik.Ferrocentrik;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(Ferrocentrik.MODID);

    // Basic ingredients
    public static final DeferredHolder<Item, Item> TREATED_TARP = ITEMS.register("treated_tarp",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAST_IRON_SHEET = ITEMS.register("cast_iron_sheet",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
