package com.comradekai.ferrocentrik.item;

import com.comradekai.ferrocentrik.Ferrocentrik;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Ferrocentrik.MODID);

    // Basic ingredients
    public static final DeferredHolder<Item, Item> TREATED_TARP = ITEMS.register("treated_tarp",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAST_IRON_SHEET = ITEMS.register("cast_iron_sheet",
            () -> new Item(new Item.Properties()));

    // Sequenced Assembly
    public static final DeferredHolder<Item, Item>
            INCOMPLETE_MACHINE_CASING = ITEMS.registerItem("incomplete_machine_casing",
            (properties) -> {
                return new SequencedAssemblyItem(properties);
        }
    );

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
