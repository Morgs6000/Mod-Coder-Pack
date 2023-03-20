// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class Slot
{

    public Slot(IInventory iinventory, int i)
    {
        inventory = iinventory;
        slotIndex = i;
    }

    public void func_778_a()
    {
        func_779_d();
    }

    public boolean func_780_a(ItemStack itemstack)
    {
        return true;
    }

    public ItemStack func_777_b()
    {
        return inventory.func_468_c(slotIndex);
    }

    public void func_776_b(ItemStack itemstack)
    {
        inventory.func_472_a(slotIndex, itemstack);
        func_779_d();
    }

    public int func_775_c()
    {
        return -1;
    }

    public void func_779_d()
    {
        inventory.func_474_j_();
    }

    public final int slotIndex;
    public final IInventory inventory;
}
