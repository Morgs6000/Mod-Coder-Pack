// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class BlockPressurePlate extends Block
{

    protected BlockPressurePlate(int i, int j, EnumMobType enummobtype)
    {
        super(i, j, Material.rock);
        field_467_a = enummobtype;
        func_253_b(true);
        float f = 0.0625F;
        func_213_a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
    }

    public int func_206_a()
    {
        return 20;
    }

    public AxisAlignedBB func_221_d(World world, int i, int j, int k)
    {
        return null;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_243_a(World world, int i, int j, int k)
    {
        return world.func_601_g(i, j - 1, k);
    }

    public void func_235_e(World world, int i, int j, int k)
    {
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        boolean flag = false;
        if(!world.func_601_g(i, j - 1, k))
        {
            flag = true;
        }
        if(flag)
        {
            func_259_b_(world, i, j, k, world.func_602_e(i, j, k));
            world.func_690_d(i, j, k, 0);
        }
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        if(world.func_602_e(i, j, k) == 0)
        {
            return;
        } else
        {
            func_318_h(world, i, j, k);
            return;
        }
    }

    public void func_236_b(World world, int i, int j, int k, Entity entity)
    {
        if(world.func_602_e(i, j, k) == 1)
        {
            return;
        } else
        {
            func_318_h(world, i, j, k);
            return;
        }
    }

    private void func_318_h(World world, int i, int j, int k)
    {
        boolean flag = world.func_602_e(i, j, k) == 1;
        boolean flag1 = false;
        float f = 0.125F;
        List list = null;
        if(field_467_a == EnumMobType.everything)
        {
            list = world.func_659_b(null, AxisAlignedBB.func_1161_b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (double)j + 0.25D, (float)(k + 1) - f));
        }
        if(field_467_a == EnumMobType.mobs)
        {
            list = world.func_657_a(EntityLiving.class, AxisAlignedBB.func_1161_b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (double)j + 0.25D, (float)(k + 1) - f));
        }
        if(field_467_a == EnumMobType.players)
        {
            list = world.func_657_a(EntityPlayer.class, AxisAlignedBB.func_1161_b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (double)j + 0.25D, (float)(k + 1) - f));
        }
        if(list.size() > 0)
        {
            flag1 = true;
        }
        if(flag1 && !flag)
        {
            world.func_691_b(i, j, k, 1);
            world.func_611_g(i, j, k, blockID);
            world.func_611_g(i, j - 1, k, blockID);
            world.func_701_b(i, j, k, i, j, k);
            world.func_684_a((double)i + 0.5D, (double)j + 0.10000000000000001D, (double)k + 0.5D, "random.click", 0.3F, 0.6F);
        }
        if(!flag1 && flag)
        {
            world.func_691_b(i, j, k, 0);
            world.func_611_g(i, j, k, blockID);
            world.func_611_g(i, j - 1, k, blockID);
            world.func_701_b(i, j, k, i, j, k);
            world.func_684_a((double)i + 0.5D, (double)j + 0.10000000000000001D, (double)k + 0.5D, "random.click", 0.3F, 0.5F);
        }
        if(flag1)
        {
            world.func_681_h(i, j, k, blockID);
        }
    }

    public void func_214_b(World world, int i, int j, int k)
    {
        int l = world.func_602_e(i, j, k);
        if(l > 0)
        {
            world.func_611_g(i, j, k, blockID);
            world.func_611_g(i, j - 1, k, blockID);
        }
        super.func_214_b(world, i, j, k);
    }

    public void func_238_a(IBlockAccess iblockaccess, int i, int j, int k)
    {
        boolean flag = iblockaccess.func_602_e(i, j, k) == 1;
        float f = 0.0625F;
        if(flag)
        {
            func_213_a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
        } else
        {
            func_213_a(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
        }
    }

    public boolean func_231_b(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return iblockaccess.func_602_e(i, j, k) > 0;
    }

    public boolean func_228_c(World world, int i, int j, int k, int l)
    {
        if(world.func_602_e(i, j, k) == 0)
        {
            return false;
        } else
        {
            return l == 1;
        }
    }

    public boolean func_209_d()
    {
        return true;
    }

    public void func_237_e()
    {
        float f = 0.5F;
        float f1 = 0.125F;
        float f2 = 0.5F;
        func_213_a(0.5F - f, 0.5F - f1, 0.5F - f2, 0.5F + f, 0.5F + f1, 0.5F + f2);
    }

    private EnumMobType field_467_a;
}
