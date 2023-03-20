// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemFood extends Item
{

    public ItemFood(int i, int j)
    {
        super(i);
        field_332_a = j;
        maxStackSize = 1;
    }

    public ItemStack func_193_a(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        itemstack.stackSize--;
        entityplayer.func_432_b(field_332_a);
        return itemstack;
    }

    private int field_332_a;
}
