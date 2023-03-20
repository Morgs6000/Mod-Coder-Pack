// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockFire extends Block
{

    protected BlockFire(int i, int j)
    {
        super(i, j, Material.fire);
        field_449_a = new int[256];
        field_448_b = new int[256];
        func_264_a(Block.planks.blockID, 5, 20);
        func_264_a(Block.wood.blockID, 5, 5);
        func_264_a(Block.leaves.blockID, 30, 60);
        func_264_a(Block.bookShelf.blockID, 30, 20);
        func_264_a(Block.tnt.blockID, 15, 100);
        func_264_a(Block.cloth.blockID, 30, 60);
        func_253_b(true);
    }

    private void func_264_a(int i, int j, int k)
    {
        field_449_a[i] = j;
        field_448_b[i] = k;
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

    public int func_210_f()
    {
        return 3;
    }

    public int func_229_a(Random random)
    {
        return 0;
    }

    public int func_206_a()
    {
        return 10;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        int l = world.func_602_e(i, j, k);
        if(l < 15)
        {
            world.func_691_b(i, j, k, l + 1);
            world.func_681_h(i, j, k, blockID);
        }
        if(!func_263_h(world, i, j, k))
        {
            if(!world.func_601_g(i, j - 1, k) || l > 3)
            {
                world.func_690_d(i, j, k, 0);
            }
            return;
        }
        if(!func_261_b(world, i, j - 1, k) && l == 15 && random.nextInt(4) == 0)
        {
            world.func_690_d(i, j, k, 0);
            return;
        }
        if(l % 2 == 0 && l > 2)
        {
            func_266_a(world, i + 1, j, k, 300, random);
            func_266_a(world, i - 1, j, k, 300, random);
            func_266_a(world, i, j - 1, k, 200, random);
            func_266_a(world, i, j + 1, k, 250, random);
            func_266_a(world, i, j, k - 1, 300, random);
            func_266_a(world, i, j, k + 1, 300, random);
            for(int i1 = i - 1; i1 <= i + 1; i1++)
            {
                for(int j1 = k - 1; j1 <= k + 1; j1++)
                {
                    for(int k1 = j - 1; k1 <= j + 4; k1++)
                    {
                        if(i1 == i && k1 == j && j1 == k)
                        {
                            continue;
                        }
                        int l1 = 100;
                        if(k1 > j + 1)
                        {
                            l1 += (k1 - (j + 1)) * 100;
                        }
                        int i2 = func_262_i(world, i1, k1, j1);
                        if(i2 > 0 && random.nextInt(l1) <= i2)
                        {
                            world.func_690_d(i1, k1, j1, blockID);
                        }
                    }

                }

            }

        }
    }

    private void func_266_a(World world, int i, int j, int k, int l, Random random)
    {
        int i1 = field_448_b[world.func_600_a(i, j, k)];
        if(random.nextInt(l) < i1)
        {
            boolean flag = world.func_600_a(i, j, k) == Block.tnt.blockID;
            if(random.nextInt(2) == 0)
            {
                world.func_690_d(i, j, k, blockID);
            } else
            {
                world.func_690_d(i, j, k, 0);
            }
            if(flag)
            {
                Block.tnt.func_252_b(world, i, j, k, 0);
            }
        }
    }

    private boolean func_263_h(World world, int i, int j, int k)
    {
        if(func_261_b(world, i + 1, j, k))
        {
            return true;
        }
        if(func_261_b(world, i - 1, j, k))
        {
            return true;
        }
        if(func_261_b(world, i, j - 1, k))
        {
            return true;
        }
        if(func_261_b(world, i, j + 1, k))
        {
            return true;
        }
        if(func_261_b(world, i, j, k - 1))
        {
            return true;
        }
        return func_261_b(world, i, j, k + 1);
    }

    private int func_262_i(World world, int i, int j, int k)
    {
        int l = 0;
        if(world.func_600_a(i, j, k) != 0)
        {
            return 0;
        } else
        {
            l = func_265_g(world, i + 1, j, k, l);
            l = func_265_g(world, i - 1, j, k, l);
            l = func_265_g(world, i, j - 1, k, l);
            l = func_265_g(world, i, j + 1, k, l);
            l = func_265_g(world, i, j, k - 1, l);
            l = func_265_g(world, i, j, k + 1, l);
            return l;
        }
    }

    public boolean func_245_h()
    {
        return false;
    }

    public boolean func_261_b(IBlockAccess iblockaccess, int i, int j, int k)
    {
        return field_449_a[iblockaccess.func_600_a(i, j, k)] > 0;
    }

    public int func_265_g(World world, int i, int j, int k, int l)
    {
        int i1 = field_449_a[world.func_600_a(i, j, k)];
        if(i1 > l)
        {
            return i1;
        } else
        {
            return l;
        }
    }

    public boolean func_243_a(World world, int i, int j, int k)
    {
        return world.func_601_g(i, j - 1, k) || func_263_h(world, i, j, k);
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        if(!world.func_601_g(i, j - 1, k) && !func_263_h(world, i, j, k))
        {
            world.func_690_d(i, j, k, 0);
            return;
        } else
        {
            return;
        }
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        if(!world.func_601_g(i, j - 1, k) && !func_263_h(world, i, j, k))
        {
            world.func_690_d(i, j, k, 0);
            return;
        } else
        {
            world.func_681_h(i, j, k, blockID);
            return;
        }
    }

    public void func_247_b(World world, int i, int j, int k, Random random)
    {
        if(random.nextInt(24) == 0)
        {
            world.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, "fire.fire", 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F);
        }
        if(world.func_601_g(i, j - 1, k) || Block.fire.func_261_b(world, i, j - 1, k))
        {
            for(int l = 0; l < 3; l++)
            {
                float f = (float)i + random.nextFloat();
                float f6 = (float)j + random.nextFloat() * 0.5F + 0.5F;
                float f12 = (float)k + random.nextFloat();
                world.func_694_a("largesmoke", f, f6, f12, 0.0D, 0.0D, 0.0D);
            }

        } else
        {
            if(Block.fire.func_261_b(world, i - 1, j, k))
            {
                for(int i1 = 0; i1 < 2; i1++)
                {
                    float f1 = (float)i + random.nextFloat() * 0.1F;
                    float f7 = (float)j + random.nextFloat();
                    float f13 = (float)k + random.nextFloat();
                    world.func_694_a("largesmoke", f1, f7, f13, 0.0D, 0.0D, 0.0D);
                }

            }
            if(Block.fire.func_261_b(world, i + 1, j, k))
            {
                for(int j1 = 0; j1 < 2; j1++)
                {
                    float f2 = (float)(i + 1) - random.nextFloat() * 0.1F;
                    float f8 = (float)j + random.nextFloat();
                    float f14 = (float)k + random.nextFloat();
                    world.func_694_a("largesmoke", f2, f8, f14, 0.0D, 0.0D, 0.0D);
                }

            }
            if(Block.fire.func_261_b(world, i, j, k - 1))
            {
                for(int k1 = 0; k1 < 2; k1++)
                {
                    float f3 = (float)i + random.nextFloat();
                    float f9 = (float)j + random.nextFloat();
                    float f15 = (float)k + random.nextFloat() * 0.1F;
                    world.func_694_a("largesmoke", f3, f9, f15, 0.0D, 0.0D, 0.0D);
                }

            }
            if(Block.fire.func_261_b(world, i, j, k + 1))
            {
                for(int l1 = 0; l1 < 2; l1++)
                {
                    float f4 = (float)i + random.nextFloat();
                    float f10 = (float)j + random.nextFloat();
                    float f16 = (float)(k + 1) - random.nextFloat() * 0.1F;
                    world.func_694_a("largesmoke", f4, f10, f16, 0.0D, 0.0D, 0.0D);
                }

            }
            if(Block.fire.func_261_b(world, i, j + 1, k))
            {
                for(int i2 = 0; i2 < 2; i2++)
                {
                    float f5 = (float)i + random.nextFloat();
                    float f11 = (float)(j + 1) - random.nextFloat() * 0.1F;
                    float f17 = (float)k + random.nextFloat();
                    world.func_694_a("largesmoke", f5, f11, f17, 0.0D, 0.0D, 0.0D);
                }

            }
        }
    }

    private int field_449_a[];
    private int field_448_b[];
}
