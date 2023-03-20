// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemSoup extends ItemFood
{

    public ItemSoup(int i, int j)
    {
        super(i, j);
    }

    public ItemStack func_193_a(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        super.func_193_a(itemstack, world, entityplayer);
        return new ItemStack(Item.bowlEmpty);
    }
}
