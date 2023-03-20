// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockRedstoneWire extends Block
{

    public BlockRedstoneWire(int i, int j)
    {
        super(i, j, Material.circuits);
        field_453_a = true;
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    }

    public int func_232_a(int i, int j)
    {
        return field_378_bb + (j <= 0 ? 0 : 16);
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
        return 5;
    }

    public boolean func_243_a(World world, int i, int j, int k)
    {
        return world.func_601_g(i, j - 1, k);
    }

    private void func_280_h(World world, int i, int j, int k)
    {
        int l = world.func_602_e(i, j, k);
        int i1 = 0;
        field_453_a = false;
        boolean flag = world.func_625_o(i, j, k);
        field_453_a = true;
        if(flag)
        {
            i1 = 15;
        } else
        {
            for(int j1 = 0; j1 < 4; j1++)
            {
                int l1 = i;
                int j2 = k;
                if(j1 == 0)
                {
                    l1--;
                }
                if(j1 == 1)
                {
                    l1++;
                }
                if(j1 == 2)
                {
                    j2--;
                }
                if(j1 == 3)
                {
                    j2++;
                }
                i1 = func_281_g(world, l1, j, j2, i1);
                if(world.func_601_g(l1, j, j2) && !world.func_601_g(i, j + 1, k))
                {
                    i1 = func_281_g(world, l1, j + 1, j2, i1);
                    continue;
                }
                if(!world.func_601_g(l1, j, j2))
                {
                    i1 = func_281_g(world, l1, j - 1, j2, i1);
                }
            }

            if(i1 > 0)
            {
                i1--;
            } else
            {
                i1 = 0;
            }
        }
        if(l != i1)
        {
            world.func_691_b(i, j, k, i1);
            world.func_701_b(i, j, k, i, j, k);
            if(i1 > 0)
            {
                i1--;
            }
            for(int k1 = 0; k1 < 4; k1++)
            {
                int i2 = i;
                int k2 = k;
                int l2 = j - 1;
                if(k1 == 0)
                {
                    i2--;
                }
                if(k1 == 1)
                {
                    i2++;
                }
                if(k1 == 2)
                {
                    k2--;
                }
                if(k1 == 3)
                {
                    k2++;
                }
                if(world.func_601_g(i2, j, k2))
                {
                    l2 += 2;
                }
                int i3 = func_281_g(world, i2, j, k2, -1);
                if(i3 >= 0 && i3 != i1)
                {
                    func_280_h(world, i2, j, k2);
                }
                i3 = func_281_g(world, i2, l2, k2, -1);
                if(i3 >= 0 && i3 != i1)
                {
                    func_280_h(world, i2, l2, k2);
                }
            }

            if(l == 0 || i1 == 0)
            {
                world.func_611_g(i, j, k, blockID);
                world.func_611_g(i - 1, j, k, blockID);
                world.func_611_g(i + 1, j, k, blockID);
                world.func_611_g(i, j, k - 1, blockID);
                world.func_611_g(i, j, k + 1, blockID);
                world.func_611_g(i, j - 1, k, blockID);
                world.func_611_g(i, j + 1, k, blockID);
            }
        }
    }

    private void func_282_i(World world, int i, int j, int k)
    {
        if(world.func_600_a(i, j, k) != blockID)
        {
            return;
        } else
        {
            world.func_611_g(i, j, k, blockID);
            world.func_611_g(i - 1, j, k, blockID);
            world.func_611_g(i + 1, j, k, blockID);
            world.func_611_g(i, j, k - 1, blockID);
            world.func_611_g(i, j, k + 1, blockID);
            world.func_611_g(i, j - 1, k, blockID);
            world.func_611_g(i, j + 1, k, blockID);
            return;
        }
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        super.func_235_e(world, i, j, k);
        func_280_h(world, i, j, k);
        world.func_611_g(i, j + 1, k, blockID);
        world.func_611_g(i, j - 1, k, blockID);
        func_282_i(world, i - 1, j, k);
        func_282_i(world, i + 1, j, k);
        func_282_i(world, i, j, k - 1);
        func_282_i(world, i, j, k + 1);
        if(world.func_601_g(i - 1, j, k))
        {
            func_282_i(world, i - 1, j + 1, k);
        } else
        {
            func_282_i(world, i - 1, j - 1, k);
        }
        if(world.func_601_g(i + 1, j, k))
        {
            func_282_i(world, i + 1, j + 1, k);
        } else
        {
            func_282_i(world, i + 1, j - 1, k);
        }
        if(world.func_601_g(i, j, k - 1))
        {
            func_282_i(world, i, j + 1, k - 1);
        } else
        {
            func_282_i(world, i, j - 1, k - 1);
        }
        if(world.func_601_g(i, j, k + 1))
        {
            func_282_i(world, i, j + 1, k + 1);
        } else
        {
            func_282_i(world, i, j - 1, k + 1);
        }
    }

    public void func_214_b(World world, int i, int j, int k)
    {
        super.func_214_b(world, i, j, k);
        world.func_611_g(i, j + 1, k, blockID);
        world.func_611_g(i, j - 1, k, blockID);
        func_280_h(world, i, j, k);
        func_282_i(world, i - 1, j, k);
        func_282_i(world, i + 1, j, k);
        func_282_i(world, i, j, k - 1);
        func_282_i(world, i, j, k + 1);
        if(world.func_601_g(i - 1, j, k))
        {
            func_282_i(world, i - 1, j + 1, k);
        } else
        {
            func_282_i(world, i - 1, j - 1, k);
        }
        if(world.func_601_g(i + 1, j, k))
        {
            func_282_i(world, i + 1, j + 1, k);
        } else
        {
            func_282_i(world, i + 1, j - 1, k);
        }
        if(world.func_601_g(i, j, k - 1))
        {
            func_282_i(world, i, j + 1, k - 1);
        } else
        {
            func_282_i(world, i, j - 1, k - 1);
        }
        if(world.func_601_g(i, j, k + 1))
        {
            func_282_i(world, i, j + 1, k + 1);
        } else
        {
            func_282_i(world, i, j - 1, k + 1);
        }
    }

    private int func_281_g(World world, int i, int j, int k, int l)
    {
        if(world.func_600_a(i, j, k) != blockID)
        {
            return l;
        }
        int i1 = world.func_602_e(i, j, k);
        if(i1 > l)
        {
            return i1;
        } else
        {
            return l;
        }
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        int i1 = world.func_602_e(i, j, k);
        boolean flag = func_243_a(world, i, j, k);
        if(!flag)
        {
            func_259_b_(world, i, j, k, i1);
            world.func_690_d(i, j, k, 0);
        } else
        {
            func_280_h(world, i, j, k);
        }
        super.func_226_a(world, i, j, k, l);
    }

    public int func_240_a(int i, Random random)
    {
        return Item.redstone.swiftedIndex;
    }

    public boolean func_228_c(World world, int i, int j, int k, int l)
    {
        if(!field_453_a)
        {
            return false;
        } else
        {
            return func_231_b(world, i, j, k, l);
        }
    }

    public boolean func_231_b(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        if(!field_453_a)
        {
            return false;
        }
        if(iblockaccess.func_602_e(i, j, k) == 0)
        {
            return false;
        }
        if(l == 1)
        {
            return true;
        }
        boolean flag = func_279_b(iblockaccess, i - 1, j, k) || !iblockaccess.func_601_g(i - 1, j, k) && func_279_b(iblockaccess, i - 1, j - 1, k);
        boolean flag1 = func_279_b(iblockaccess, i + 1, j, k) || !iblockaccess.func_601_g(i + 1, j, k) && func_279_b(iblockaccess, i + 1, j - 1, k);
        boolean flag2 = func_279_b(iblockaccess, i, j, k - 1) || !iblockaccess.func_601_g(i, j, k - 1) && func_279_b(iblockaccess, i, j - 1, k - 1);
        boolean flag3 = func_279_b(iblockaccess, i, j, k + 1) || !iblockaccess.func_601_g(i, j, k + 1) && func_279_b(iblockaccess, i, j - 1, k + 1);
        if(!iblockaccess.func_601_g(i, j + 1, k))
        {
            if(iblockaccess.func_601_g(i - 1, j, k) && func_279_b(iblockaccess, i - 1, j + 1, k))
            {
                flag = true;
            }
            if(iblockaccess.func_601_g(i + 1, j, k) && func_279_b(iblockaccess, i + 1, j + 1, k))
            {
                flag1 = true;
            }
            if(iblockaccess.func_601_g(i, j, k - 1) && func_279_b(iblockaccess, i, j + 1, k - 1))
            {
                flag2 = true;
            }
            if(iblockaccess.func_601_g(i, j, k + 1) && func_279_b(iblockaccess, i, j + 1, k + 1))
            {
                flag3 = true;
            }
        }
        if(!flag2 && !flag1 && !flag && !flag3 && l >= 2 && l <= 5)
        {
            return true;
        }
        if(l == 2 && flag2 && !flag && !flag1)
        {
            return true;
        }
        if(l == 3 && flag3 && !flag && !flag1)
        {
            return true;
        }
        if(l == 4 && flag && !flag2 && !flag3)
        {
            return true;
        }
        return l == 5 && flag1 && !flag2 && !flag3;
    }

    public boolean func_209_d()
    {
        return field_453_a;
    }

    public void func_247_b(World world, int i, int j, int k, Random random)
    {
        if(world.func_602_e(i, j, k) > 0)
        {
            double d = (double)i + 0.5D + ((double)random.nextFloat() - 0.5D) * 0.20000000000000001D;
            double d1 = (float)j + 0.0625F;
            double d2 = (double)k + 0.5D + ((double)random.nextFloat() - 0.5D) * 0.20000000000000001D;
            world.func_694_a("reddust", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

    public static boolean func_279_b(IBlockAccess iblockaccess, int i, int j, int k)
    {
        int l = iblockaccess.func_600_a(i, j, k);
        if(l == Block.redstoneWire.blockID)
        {
            return true;
        }
        if(l == 0)
        {
            return false;
        }
        return Block.allBlocks[l].func_209_d();
    }

    private boolean field_453_a;
}
