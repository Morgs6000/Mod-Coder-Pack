// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class ItemFlintAndSteel extends Item
{

    public ItemFlintAndSteel(int i)
    {
        super(i);
        maxStackSize = 1;
        maxDmg = 64;
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
        int i1 = world.func_600_a(i, j, k);
        if(i1 == 0)
        {
            world.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, rand.nextFloat() * 0.4F + 0.8F);
            world.func_690_d(i, j, k, Block.fire.blockID);
        }
        itemstack.func_1101_b(1);
        return true;
    }
}
