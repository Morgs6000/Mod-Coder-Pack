// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemSign extends Item
{

    public ItemSign(int i)
    {
        super(i);
        maxDmg = 64;
        maxStackSize = 1;
    }

    public boolean func_192_a(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        if(l == 0)
        {
            return false;
        }
        if(!world.func_599_f(i, j, k).func_878_a())
        {
            return false;
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
        if(!Block.pressurePlateWoodActive.func_243_a(world, i, j, k))
        {
            return false;
        }
        if(l == 1)
        {
            world.func_688_b(i, j, k, Block.pressurePlateWoodActive.blockID, MathHelper.func_1108_b((double)(((entityplayer.rotationYaw + 180F) * 16F) / 360F) + 0.5D) & 0xf);
        } else
        {
            world.func_688_b(i, j, k, Block.pressurePlateWoodIdle.blockID, l);
        }
        itemstack.stackSize--;
        entityplayer.func_455_a((TileEntitySign)world.func_603_b(i, j, k));
        return true;
    }
}
