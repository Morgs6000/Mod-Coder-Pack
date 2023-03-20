// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class SlotArmor extends SlotInventory
{

    SlotArmor(GuiInventory guiinventory, GuiContainer guicontainer, IInventory iinventory, int i, int j, int k, int l)
    {
        super(guicontainer, iinventory, i, j, k);
        field_1123_d = guiinventory;
        field_1124_c = l;
    }

    public boolean func_780_a(ItemStack itemstack)
    {
        if(itemstack.func_1091_a() instanceof ItemArmor)
        {
            return ((ItemArmor)itemstack.func_1091_a()).field_313_aX == field_1124_c;
        } else
        {
            return false;
        }
    }

    public int func_775_c()
    {
        return 15 + field_1124_c * 16;
    }

    final int field_1124_c; /* synthetic field */
    final GuiInventory field_1123_d; /* synthetic field */
}
