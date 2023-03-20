// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockFurnace extends BlockContainer
{

    protected BlockFurnace(int i, boolean flag)
    {
        super(i, Material.rock);
        field_456_a = flag;
        field_378_bb = 45;
    }

    public int func_240_a(int i, Random random)
    {
        return Block.stoneOvenIdle.blockID;
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        super.func_235_e(world, i, j, k);
        func_284_h(world, i, j, k);
    }

    private void func_284_h(World world, int i, int j, int k)
    {
        int l = world.func_600_a(i, j, k - 1);
        int i1 = world.func_600_a(i, j, k + 1);
        int j1 = world.func_600_a(i - 1, j, k);
        int k1 = world.func_600_a(i + 1, j, k);
        byte byte0 = 3;
        if(Block.field_343_p[l] && !Block.field_343_p[i1])
        {
            byte0 = 3;
        }
        if(Block.field_343_p[i1] && !Block.field_343_p[l])
        {
            byte0 = 2;
        }
        if(Block.field_343_p[j1] && !Block.field_343_p[k1])
        {
            byte0 = 5;
        }
        if(Block.field_343_p[k1] && !Block.field_343_p[j1])
        {
            byte0 = 4;
        }
        world.func_691_b(i, j, k, byte0);
    }

    public int func_211_a(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        if(l == 1)
        {
            return Block.stone.field_378_bb;
        }
        if(l == 0)
        {
            return Block.stone.field_378_bb;
        }
        int i1 = iblockaccess.func_602_e(i, j, k);
        if(l != i1)
        {
            return field_378_bb;
        }
        if(field_456_a)
        {
            return field_378_bb + 16;
        } else
        {
            return field_378_bb - 1;
        }
    }

    public void func_247_b(World world, int i, int j, int k, Random random)
    {
        if(!field_456_a)
        {
            return;
        }
        int l = world.func_602_e(i, j, k);
        float f = (float)i + 0.5F;
        float f1 = (float)j + 0.0F + (random.nextFloat() * 6F) / 16F;
        float f2 = (float)k + 0.5F;
        float f3 = 0.52F;
        float f4 = random.nextFloat() * 0.6F - 0.3F;
        if(l == 4)
        {
            world.func_694_a("smoke", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
            world.func_694_a("flame", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 5)
        {
            world.func_694_a("smoke", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
            world.func_694_a("flame", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 2)
        {
            world.func_694_a("smoke", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
            world.func_694_a("flame", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 3)
        {
            world.func_694_a("smoke", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
            world.func_694_a("flame", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
        }
    }

    public int func_218_a(int i)
    {
        if(i == 1)
        {
            return Block.stone.blockID;
        }
        if(i == 0)
        {
            return Block.stone.blockID;
        }
        if(i == 3)
        {
            return field_378_bb - 1;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_250_a(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        TileEntityFurnace tileentityfurnace = (TileEntityFurnace)world.func_603_b(i, j, k);
        entityplayer.func_453_a(tileentityfurnace);
        return true;
    }

    public static void func_285_a(boolean flag, World world, int i, int j, int k)
    {
        int l = world.func_602_e(i, j, k);
        TileEntity tileentity = world.func_603_b(i, j, k);
        if(flag)
        {
            world.func_690_d(i, j, k, Block.stoneOvenActive.blockID);
        } else
        {
            world.func_690_d(i, j, k, Block.stoneOvenIdle.blockID);
        }
        world.func_691_b(i, j, k, l);
        world.func_654_a(i, j, k, tileentity);
    }

    protected TileEntity func_283_a_()
    {
        return new TileEntityFurnace();
    }

    private final boolean field_456_a;
}
