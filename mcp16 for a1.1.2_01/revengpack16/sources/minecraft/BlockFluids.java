// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public abstract class BlockFluids extends Block
{

    protected BlockFluids(int i, Material material)
    {
        super(i, (material != Material.lava ? 12 : 14) * 16 + 13, material);
        field_458_d = 1;
        float f = 0.0F;
        float f1 = 0.0F;
        if(material == Material.lava)
        {
            field_458_d = 2;
        }
        func_213_a(0.0F + f1, 0.0F + f, 0.0F + f1, 1.0F + f1, 1.0F + f, 1.0F + f1);
        func_253_b(true);
    }

    public static float func_288_b(int i)
    {
        if(i >= 8)
        {
            i = 0;
        }
        float f = (float)(i + 1) / 9F;
        return f;
    }

    public int func_218_a(int i)
    {
        if(i == 0 || i == 1)
        {
            return field_378_bb;
        } else
        {
            return field_378_bb + 1;
        }
    }

    protected int func_290_h(World world, int i, int j, int k)
    {
        if(world.func_599_f(i, j, k) != material)
        {
            return -1;
        } else
        {
            return world.func_602_e(i, j, k);
        }
    }

    protected int func_289_b(IBlockAccess iblockaccess, int i, int j, int k)
    {
        if(iblockaccess.func_599_f(i, j, k) != material)
        {
            return -1;
        }
        int l = iblockaccess.func_602_e(i, j, k);
        if(l >= 8)
        {
            l = 0;
        }
        return l;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_224_a(int i, boolean flag)
    {
        return flag && i == 0;
    }

    public boolean func_260_c(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        Material material = iblockaccess.func_599_f(i, j, k);
        if(material == this.material)
        {
            return false;
        }
        if(material == Material.ice)
        {
            return false;
        }
        if(l == 1)
        {
            return true;
        } else
        {
            return super.func_260_c(iblockaccess, i, j, k, l);
        }
    }

    public AxisAlignedBB func_221_d(World world, int i, int j, int k)
    {
        return null;
    }

    public int func_210_f()
    {
        return 4;
    }

    public int func_240_a(int i, Random random)
    {
        return 0;
    }

    public int func_229_a(Random random)
    {
        return 0;
    }

    private Vec3D func_291_e(IBlockAccess iblockaccess, int i, int j, int k)
    {
        Vec3D vec3d = Vec3D.func_1248_b(0.0D, 0.0D, 0.0D);
        int l = func_289_b(iblockaccess, i, j, k);
        for(int i1 = 0; i1 < 4; i1++)
        {
            int j1 = i;
            int k1 = j;
            int l1 = k;
            if(i1 == 0)
            {
                j1--;
            }
            if(i1 == 1)
            {
                l1--;
            }
            if(i1 == 2)
            {
                j1++;
            }
            if(i1 == 3)
            {
                l1++;
            }
            int i2 = func_289_b(iblockaccess, j1, k1, l1);
            if(i2 < 0)
            {
                if(iblockaccess.func_599_f(j1, k1, l1).func_880_c())
                {
                    continue;
                }
                i2 = func_289_b(iblockaccess, j1, k1 - 1, l1);
                if(i2 >= 0)
                {
                    int j2 = i2 - (l - 8);
                    vec3d = vec3d.func_1257_c((j1 - i) * j2, (k1 - j) * j2, (l1 - k) * j2);
                }
                continue;
            }
            if(i2 >= 0)
            {
                int k2 = i2 - l;
                vec3d = vec3d.func_1257_c((j1 - i) * k2, (k1 - j) * k2, (l1 - k) * k2);
            }
        }

        if(iblockaccess.func_602_e(i, j, k) >= 8)
        {
            boolean flag = false;
            if(flag || func_260_c(iblockaccess, i, j, k - 1, 2))
            {
                flag = true;
            }
            if(flag || func_260_c(iblockaccess, i, j, k + 1, 3))
            {
                flag = true;
            }
            if(flag || func_260_c(iblockaccess, i - 1, j, k, 4))
            {
                flag = true;
            }
            if(flag || func_260_c(iblockaccess, i + 1, j, k, 5))
            {
                flag = true;
            }
            if(flag || func_260_c(iblockaccess, i, j + 1, k - 1, 2))
            {
                flag = true;
            }
            if(flag || func_260_c(iblockaccess, i, j + 1, k + 1, 3))
            {
                flag = true;
            }
            if(flag || func_260_c(iblockaccess, i - 1, j + 1, k, 4))
            {
                flag = true;
            }
            if(flag || func_260_c(iblockaccess, i + 1, j + 1, k, 5))
            {
                flag = true;
            }
            if(flag)
            {
                vec3d = vec3d.func_1252_b().func_1257_c(0.0D, -6D, 0.0D);
            }
        }
        vec3d = vec3d.func_1252_b();
        return vec3d;
    }

    public void func_257_a(World world, int i, int j, int k, Entity entity, Vec3D vec3d)
    {
        Vec3D vec3d1 = func_291_e(world, i, j, k);
        vec3d.field_1776_a += vec3d1.field_1776_a;
        vec3d.field_1775_b += vec3d1.field_1775_b;
        vec3d.field_1779_c += vec3d1.field_1779_c;
    }

    public int func_206_a()
    {
        if(material == Material.water)
        {
            return 5;
        }
        return material != Material.lava ? 0 : 30;
    }

    public float func_241_c(IBlockAccess iblockaccess, int i, int j, int k)
    {
        float f = iblockaccess.func_598_c(i, j, k);
        float f1 = iblockaccess.func_598_c(i, j + 1, k);
        return f <= f1 ? f1 : f;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        super.func_208_a(world, i, j, k, random);
    }

    public int func_234_g()
    {
        return material != Material.water ? 0 : 1;
    }

    public void func_247_b(World world, int i, int j, int k, Random random)
    {
        if(material == Material.water && random.nextInt(64) == 0)
        {
            int l = world.func_602_e(i, j, k);
            if(l > 0 && l < 8)
            {
                world.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, "liquid.water", random.nextFloat() * 0.25F + 0.75F, random.nextFloat() * 1.0F + 0.5F);
            }
        }
        if(material == Material.lava && world.func_599_f(i, j + 1, k) == Material.air && !world.func_601_g(i, j + 1, k) && random.nextInt(100) == 0)
        {
            double d = (float)i + random.nextFloat();
            double d1 = (double)j + field_362_bj;
            double d2 = (float)k + random.nextFloat();
            world.func_694_a("lava", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

    public static double func_293_a(IBlockAccess iblockaccess, int i, int j, int k, Material material)
    {
        Vec3D vec3d = null;
        if(material == Material.water)
        {
            vec3d = ((BlockFluids)Block.waterStill).func_291_e(iblockaccess, i, j, k);
        }
        if(material == Material.lava)
        {
            vec3d = ((BlockFluids)Block.lavaStill).func_291_e(iblockaccess, i, j, k);
        }
        if(vec3d.field_1776_a == 0.0D && vec3d.field_1779_c == 0.0D)
        {
            return -1000D;
        } else
        {
            return Math.atan2(vec3d.field_1779_c, vec3d.field_1776_a) - 1.5707963267948966D;
        }
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        func_287_j(world, i, j, k);
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        func_287_j(world, i, j, k);
    }

    private void func_287_j(World world, int i, int j, int k)
    {
        if(world.func_600_a(i, j, k) != blockID)
        {
            return;
        }
        if(material == Material.lava)
        {
            boolean flag = false;
            if(flag || world.func_599_f(i, j, k - 1) == Material.water)
            {
                flag = true;
            }
            if(flag || world.func_599_f(i, j, k + 1) == Material.water)
            {
                flag = true;
            }
            if(flag || world.func_599_f(i - 1, j, k) == Material.water)
            {
                flag = true;
            }
            if(flag || world.func_599_f(i + 1, j, k) == Material.water)
            {
                flag = true;
            }
            if(flag || world.func_599_f(i, j + 1, k) == Material.water)
            {
                flag = true;
            }
            if(flag)
            {
                int l = world.func_602_e(i, j, k);
                if(l == 0)
                {
                    world.func_690_d(i, j, k, Block.obsidian.blockID);
                } else
                if(l <= 4)
                {
                    world.func_690_d(i, j, k, Block.cobblestone.blockID);
                }
                func_292_i(world, i, j, k);
            }
        }
    }

    protected void func_292_i(World world, int i, int j, int k)
    {
        world.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, "random.fizz", 0.5F, 2.6F + (world.field_1037_n.nextFloat() - world.field_1037_n.nextFloat()) * 0.8F);
        for(int l = 0; l < 8; l++)
        {
            world.func_694_a("largesmoke", (double)i + Math.random(), (double)j + 1.2D, (double)k + Math.random(), 0.0D, 0.0D, 0.0D);
        }

    }

    protected int field_458_d;
}
