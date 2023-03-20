// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockMinecartTrack extends Block
{

    protected BlockMinecartTrack(int i, int j)
    {
        super(i, j, Material.circuits);
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public AxisAlignedBB func_221_d(World world, int i, int j, int k)
    {
        return null;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public MovingObjectPosition func_255_a(World world, int i, int j, int k, Vec3D vec3d, Vec3D vec3d1)
    {
        func_238_a(world, i, j, k);
        return super.func_255_a(world, i, j, k, vec3d, vec3d1);
    }

    public void func_238_a(IBlockAccess iblockaccess, int i, int j, int k)
    {
        int l = iblockaccess.func_602_e(i, j, k);
        if(l >= 2 && l <= 5)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
        } else
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        }
    }

    public int func_232_a(int i, int j)
    {
        if(j >= 6)
        {
            return field_378_bb - 16;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 9;
    }

    public int func_229_a(Random random)
    {
        return 1;
    }

    public boolean func_243_a(World world, int i, int j, int k)
    {
        return world.func_601_g(i, j - 1, k);
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        world.func_691_b(i, j, k, 15);
        func_304_h(world, i, j, k);
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        int i1 = world.func_602_e(i, j, k);
        boolean flag = false;
        if(!world.func_601_g(i, j - 1, k))
        {
            flag = true;
        }
        if(i1 == 2 && !world.func_601_g(i + 1, j, k))
        {
            flag = true;
        }
        if(i1 == 3 && !world.func_601_g(i - 1, j, k))
        {
            flag = true;
        }
        if(i1 == 4 && !world.func_601_g(i, j, k - 1))
        {
            flag = true;
        }
        if(i1 == 5 && !world.func_601_g(i, j, k + 1))
        {
            flag = true;
        }
        if(flag)
        {
            func_259_b_(world, i, j, k, world.func_602_e(i, j, k));
            world.func_690_d(i, j, k, 0);
        } else
        if(l > 0 && Block.allBlocks[l].func_209_d() && MinecartTrackLogic.func_791_a(new MinecartTrackLogic(this, world, i, j, k)) == 3)
        {
            func_304_h(world, i, j, k);
        }
    }

    private void func_304_h(World world, int i, int j, int k)
    {
        (new MinecartTrackLogic(this, world, i, j, k)).func_792_a(world.func_625_o(i, j, k));
    }
}
