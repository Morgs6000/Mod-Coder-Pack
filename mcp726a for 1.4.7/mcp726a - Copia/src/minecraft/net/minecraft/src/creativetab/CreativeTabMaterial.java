package net.minecraft.src.creativetab;

final class CreativeTabMaterial extends CreativeTabs {
    CreativeTabMaterial(int par1, String par2Str) {
        super(par1, par2Str);
    }

    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {
        return Item.stick.itemID;
    }
}
