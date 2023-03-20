// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockJukeBox extends Block
{

    protected BlockJukeBox(int i, int j)
    {
        super(i, j, Material.wood);
    }

    public int func_218_a(int i)
    {
        return field_378_bb + (i != 1 ? 0 : 1);
    }

    public boolean func_250_a(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        int l = world.func_602_e(i, j, k);
        if(l > 0)
        {
            func_317_e(world, i, j, k, l);
            return true;
        } else
        {
            return false;
        }
    }

    public void func_317_e(World world, int i, int j, int k, int l)
    {
        world.func_670_a(null, i, j, k);
        world.func_691_b(i, j, k, 0);
        int i1 = (Item.record13.swiftedIndex + l) - 1;
        float f = 0.7F;
        double d = (double)(world.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d1 = (double)(world.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.20000000000000001D + 0.59999999999999998D;
        double d2 = (double)(world.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(world, (double)i + d, (double)j + d1, (double)k + d2, new ItemStack(i1));
        entityitem.field_805_c = 10;
        world.func_674_a(entityitem);
    }

    public void func_216_a(World world, int i, int j, int k, int l, float f)
    {
        if(world.field_1026_y)
        {
            return;
        }
        if(l > 0)
        {
            func_317_e(world, i, j, k, l);
        }
        super.func_216_a(world, i, j, k, l, f);
    }
}
