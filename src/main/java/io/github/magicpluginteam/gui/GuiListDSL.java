package io.github.magicpluginteam.gui;

import io.github.magicpluginteam.gui.utils.Function4;
import io.github.magicpluginteam.gui.utils.Pair;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class GuiListDSL<T> {

    private final GuiList<T> guiList;


    public GuiListDSL(GuiList<T> guiList) {
        this.guiList = guiList;
    }

    public GuiListDSL<T> setIndex(int index) {
        guiList.setIndex(index);
        return this;
    }

    public int getIndex() {
        return guiList.getIndex();
    }

    public GuiListDSL<T> onClick(Function4<Integer, Integer, Pair<ItemStack, T>, InventoryClickEvent> onClick) {
        guiList.onClick(onClick);
        return this;
    }


}
