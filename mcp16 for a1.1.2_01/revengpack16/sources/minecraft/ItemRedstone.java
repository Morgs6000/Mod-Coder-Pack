// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemRedstone extends Item
{

    public ItemRedstone(int i)
    {
        super(i);
    }

    public boolean func_192_a(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        if(l == 0)
        {
            j--;
        }
        if(l == 1)
        {
            j++;
        }
        if(l == 2)
        {
            k--;
        }
        if(l == 3)
        {
            k++;
        }
        if(l == 4)
        {
            i--;
        }
        if(l == 5)
        {
            i++;
        }
        if(world.func_600_a(i, j, k) != 0)
        {
            return false;
        }
        if(Block.redstoneWire.func_243_a(world, i, j, k))
        {
            itemstack.stackSize--;
            world.func_690_d(i, j, k, Block.redstoneWire.blockID);
        }
        return true;
    }
}
