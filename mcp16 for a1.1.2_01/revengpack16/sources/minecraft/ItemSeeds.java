// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemSeeds extends Item
{

    public ItemSeeds(int i, int j)
    {
        super(i);
        field_318_a = j;
    }

    public boolean func_192_a(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        if(l != 1)
        {
            return false;
        }
        int i1 = world.func_600_a(i, j, k);
        if(i1 == Block.tilledField.blockID)
        {
            world.func_690_d(i, j + 1, k, field_318_a);
            itemstack.stackSize--;
            return true;
        } else
        {
            return false;
        }
    }

    private int field_318_a;
}
