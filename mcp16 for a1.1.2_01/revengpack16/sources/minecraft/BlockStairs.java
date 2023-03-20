// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.Random;

public class BlockStairs extends Block
{

    protected BlockStairs(int i, Block block)
    {
        super(i, block.field_378_bb, block.material);
        field_452_a = block;
        func_222_c(block.field_374_bd);
        func_219_b(block.hardness / 3F);
        func_248_a(block.stepSound);
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 10;
    }

    public boolean func_260_c(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return super.func_260_c(iblockaccess, i, j, k, l);
    }

    public void func_230_a(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, ArrayList arraylist)
    {
        int l = world.func_602_e(i, j, k);
        if(l == 0)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
            super.func_230_a(world, i, j, k, axisalignedbb, arraylist);
            func_213_a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.func_230_a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 1)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.func_230_a(world, i, j, k, axisalignedbb, arraylist);
            func_213_a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.func_230_a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 2)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.func_230_a(world, i, j, k, axisalignedbb, arraylist);
            func_213_a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.func_230_a(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 3)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.func_230_a(world, i, j, k, axisalignedbb, arraylist);
            func_213_a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.func_230_a(world, i, j, k, axisalignedbb, arraylist);
        }
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        if(world.field_1026_y)
        {
            return;
        }
        if(world.func_599_f(i, j + 1, k).func_878_a())
        {
            world.func_690_d(i, j, k, field_452_a.blockID);
        } else
        {
            func_276_h(world, i, j, k);
            func_276_h(world, i + 1, j - 1, k);
            func_276_h(world, i - 1, j - 1, k);
            func_276_h(world, i, j - 1, k - 1);
            func_276_h(world, i, j - 1, k + 1);
            func_276_h(world, i + 1, j + 1, k);
            func_276_h(world, i - 1, j + 1, k);
            func_276_h(world, i, j + 1, k - 1);
            func_276_h(world, i, j + 1, k + 1);
        }
        field_452_a.func_226_a(world, i, j, k, l);
    }

    private void func_276_h(World world, int i, int j, int k)
    {
        if(!func_278_j(world, i, j, k))
        {
            return;
        }
        byte byte0 = -1;
        if(func_278_j(world, i + 1, j + 1, k))
        {
            byte0 = 0;
        }
        if(func_278_j(world, i - 1, j + 1, k))
        {
            byte0 = 1;
        }
        if(func_278_j(world, i, j + 1, k + 1))
        {
            byte0 = 2;
        }
        if(func_278_j(world, i, j + 1, k - 1))
        {
            byte0 = 3;
        }
        if(byte0 < 0)
        {
            if(func_277_i(world, i + 1, j, k) && !func_277_i(world, i - 1, j, k))
            {
                byte0 = 0;
            }
            if(func_277_i(world, i - 1, j, k) && !func_277_i(world, i + 1, j, k))
            {
                byte0 = 1;
            }
            if(func_277_i(world, i, j, k + 1) && !func_277_i(world, i, j, k - 1))
            {
                byte0 = 2;
            }
            if(func_277_i(world, i, j, k - 1) && !func_277_i(world, i, j, k + 1))
            {
                byte0 = 3;
            }
        }
        if(byte0 < 0)
        {
            if(func_278_j(world, i - 1, j - 1, k))
            {
                byte0 = 0;
            }
            if(func_278_j(world, i + 1, j - 1, k))
            {
                byte0 = 1;
            }
            if(func_278_j(world, i, j - 1, k - 1))
            {
                byte0 = 2;
            }
            if(func_278_j(world, i, j - 1, k + 1))
            {
                byte0 = 3;
            }
        }
        if(byte0 >= 0)
        {
            world.func_691_b(i, j, k, byte0);
        }
    }

    private boolean func_277_i(World world, int i, int j, int k)
    {
        return world.func_599_f(i, j, k).func_878_a();
    }

    private boolean func_278_j(World world, int i, int j, int k)
    {
        int l = world.func_600_a(i, j, k);
        if(l == 0)
        {
            return false;
        } else
        {
            return Block.allBlocks[l].func_210_f() == 10;
        }
    }

    public void func_247_b(World world, int i, int j, int k, Random random)
    {
        field_452_a.func_247_b(world, i, j, k, random);
    }

    public void func_233_b(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        field_452_a.func_233_b(world, i, j, k, entityplayer);
    }

    public void func_252_b(World world, int i, int j, int k, int l)
    {
        field_452_a.func_252_b(world, i, j, k, l);
    }

    public float func_241_c(IBlockAccess iblockaccess, int i, int j, int k)
    {
        return field_452_a.func_241_c(iblockaccess, i, j, k);
    }

    public float func_227_a(Entity entity)
    {
        return field_452_a.func_227_a(entity);
    }

    public int func_234_g()
    {
        return field_452_a.func_234_g();
    }

    public int func_240_a(int i, Random random)
    {
        return field_452_a.func_240_a(i, random);
    }

    public int func_229_a(Random random)
    {
        return field_452_a.func_229_a(random);
    }

    public int func_232_a(int i, int j)
    {
        return field_452_a.func_232_a(i, j);
    }

    public int func_218_a(int i)
    {
        return field_452_a.func_218_a(i);
    }

    public int func_211_a(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return field_452_a.func_211_a(iblockaccess, i, j, k, l);
    }

    public int func_206_a()
    {
        return field_452_a.func_206_a();
    }

    public AxisAlignedBB func_246_f(World world, int i, int j, int k)
    {
        return field_452_a.func_246_f(world, i, j, k);
    }

    public void func_257_a(World world, int i, int j, int k, Entity entity, Vec3D vec3d)
    {
        field_452_a.func_257_a(world, i, j, k, entity, vec3d);
    }

    public boolean func_245_h()
    {
        return field_452_a.func_245_h();
    }

    public boolean func_224_a(int i, boolean flag)
    {
        return field_452_a.func_224_a(i, flag);
    }

    public boolean func_243_a(World world, int i, int j, int k)
    {
        return field_452_a.func_243_a(world, i, j, k);
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        func_226_a(world, i, j, k, 0);
        field_452_a.func_235_e(world, i, j, k);
    }

    public void func_214_b(World world, int i, int j, int k)
    {
        field_452_a.func_214_b(world, i, j, k);
    }

    public void func_216_a(World world, int i, int j, int k, int l, float f)
    {
        field_452_a.func_216_a(world, i, j, k, l, f);
    }

    public void func_259_b_(World world, int i, int j, int k, int l)
    {
        field_452_a.func_259_b_(world, i, j, k, l);
    }

    public void func_254_a(World world, int i, int j, int k, Entity entity)
    {
        field_452_a.func_254_a(world, i, j, k, entity);
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        field_452_a.func_208_a(world, i, j, k, random);
    }

    public boolean func_250_a(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        return field_452_a.func_250_a(world, i, j, k, entityplayer);
    }

    public void func_239_c(World world, int i, int j, int k)
    {
        field_452_a.func_239_c(world, i, j, k);
    }

    private Block field_452_a;
}
