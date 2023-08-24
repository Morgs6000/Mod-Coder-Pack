package net.minecraft.src.creativetab;

final class CreativeTabTransport extends CreativeTabs {
    CreativeTabTransport(int par1, String par2Str) {
        super(par1, par2Str);
    }

    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {
        return Block.railPowered.blockID;
    }
}
