// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.util.Random;

public class BlockCrops extends BlockFlower
{

    protected BlockCrops(int i, int j)
    {
        super(i, j);
        field_378_bb = j;
        func_253_b(true);
        float f = 0.5F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    }

    protected boolean func_269_b(int i)
    {
        return i == Block.tilledField.blockID;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        super.func_208_a(world, i, j, k, random);
        if(world.func_618_j(i, j + 1, k) >= 9)
        {
            int l = world.func_602_e(i, j, k);
            if(l < 7)
            {
                float f = func_270_i(world, i, j, k);
                if(random.nextInt((int)(100F / f)) == 0)
                {
                    l++;
                    world.func_691_b(i, j, k, l);
                }
            }
        }
    }

    private float func_270_i(World world, int i, int j, int k)
    {
        float f = 1.0F;
        int l = world.func_600_a(i, j, k - 1);
        int i1 = world.func_600_a(i, j, k + 1);
        int j1 = world.func_600_a(i - 1, j, k);
        int k1 = world.func_600_a(i + 1, j, k);
        int l1 = world.func_600_a(i - 1, j, k - 1);
        int i2 = world.func_600_a(i + 1, j, k - 1);
        int j2 = world.func_600_a(i + 1, j, k + 1);
        int k2 = world.func_600_a(i - 1, j, k + 1);
        boolean flag = j1 == blockID || k1 == blockID;
        boolean flag1 = l == blockID || i1 == blockID;
        boolean flag2 = l1 == blockID || i2 == blockID || j2 == blockID || k2 == blockID;
        for(int l2 = i - 1; l2 <= i + 1; l2++)
        {
            for(int i3 = k - 1; i3 <= k + 1; i3++)
            {
                int j3 = world.func_600_a(l2, j - 1, i3);
                float f1 = 0.0F;
                if(j3 == Block.tilledField.blockID)
                {
                    f1 = 1.0F;
                    if(world.func_602_e(l2, j - 1, i3) > 0)
                    {
                        f1 = 3F;
                    }
                }
                if(l2 != i || i3 != k)
                {
                    f1 /= 4F;
                }
                f += f1;
            }

        }

        if(flag2 || flag && flag1)
        {
            f /= 2.0F;
        }
        return f;
    }

    public int func_232_a(int i, int j)
    {
        if(j < 0)
        {
            j = 7;
        }
        return field_378_bb + j;
    }

    public int func_210_f()
    {
        return 6;
    }

    public void func_252_b(World world, int i, int j, int k, int l)
    {
        super.func_252_b(world, i, j, k, l);
        for(int i1 = 0; i1 < 3; i1++)
        {
            if(world.field_1037_n.nextInt(15) <= l)
            {
                float f = 0.7F;
                float f1 = world.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                float f2 = world.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                float f3 = world.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                EntityItem entityitem = new EntityItem(world, (float)i + f1, (float)j + f2, (float)k + f3, new ItemStack(Item.seeds));
                entityitem.field_805_c = 10;
                world.func_674_a(entityitem);
            }
        }

    }

    public int func_240_a(int i, Random random)
    {
        System.out.println((new StringBuilder()).append("Get resource: ").append(i).toString());
        if(i == 7)
        {
            return Item.wheat.swiftedIndex;
        } else
        {
            return -1;
        }
    }

    public int func_229_a(Random random)
    {
        return 1;
    }
}
