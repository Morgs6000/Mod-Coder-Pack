// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockButton extends Block
{

    protected BlockButton(int i, int j)
    {
        super(i, j, Material.circuits);
        func_253_b(true);
    }

    public AxisAlignedBB func_221_d(World world, int i, int j, int k)
    {
        return null;
    }

    public int func_206_a()
    {
        return 20;
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
        if(world.func_601_g(i - 1, j, k))
        {
            return true;
        }
        if(world.func_601_g(i + 1, j, k))
        {
            return true;
        }
        if(world.func_601_g(i, j, k - 1))
        {
            return true;
        }
        return world.func_601_g(i, j, k + 1);
    }

    public void func_258_d(World world, int i, int j, int k, int l)
    {
        int i1 = world.func_602_e(i, j, k);
        int j1 = i1 & 8;
        i1 &= 7;
        if(l == 2 && world.func_601_g(i, j, k + 1))
        {
            i1 = 4;
        }
        if(l == 3 && world.func_601_g(i, j, k - 1))
        {
            i1 = 3;
        }
        if(l == 4 && world.func_601_g(i + 1, j, k))
        {
            i1 = 2;
        }
        if(l == 5 && world.func_601_g(i - 1, j, k))
        {
            i1 = 1;
        }
        world.func_691_b(i, j, k, i1 + j1);
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        if(world.func_601_g(i - 1, j, k))
        {
            world.func_691_b(i, j, k, 1);
        } else
        if(world.func_601_g(i + 1, j, k))
        {
            world.func_691_b(i, j, k, 2);
        } else
        if(world.func_601_g(i, j, k - 1))
        {
            world.func_691_b(i, j, k, 3);
        } else
        if(world.func_601_g(i, j, k + 1))
        {
            world.func_691_b(i, j, k, 4);
        }
        func_305_h(world, i, j, k);
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        if(func_305_h(world, i, j, k))
        {
            int i1 = world.func_602_e(i, j, k) & 7;
            boolean flag = false;
            if(!world.func_601_g(i - 1, j, k) && i1 == 1)
            {
                flag = true;
            }
            if(!world.func_601_g(i + 1, j, k) && i1 == 2)
            {
                flag = true;
            }
            if(!world.func_601_g(i, j, k - 1) && i1 == 3)
            {
                flag = true;
            }
            if(!world.func_601_g(i, j, k + 1) && i1 == 4)
            {
                flag = true;
            }
            if(flag)
            {
                func_259_b_(world, i, j, k, world.func_602_e(i, j, k));
                world.func_690_d(i, j, k, 0);
            }
        }
    }

    private boolean func_305_h(World world, int i, int j, int k)
    {
        if(!func_243_a(world, i, j, k))
        {
            func_259_b_(world, i, j, k, world.func_602_e(i, j, k));
            world.func_690_d(i, j, k, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public void func_238_a(IBlockAccess iblockaccess, int i, int j, int k)
    {
        int l = iblockaccess.func_602_e(i, j, k);
        int i1 = l & 7;
        boolean flag = (l & 8) > 0;
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.1875F;
        float f3 = 0.125F;
        if(flag)
        {
            f3 = 0.0625F;
        }
        if(i1 == 1)
        {
            func_213_a(0.0F, f, 0.5F - f2, f3, f1, 0.5F + f2);
        } else
        if(i1 == 2)
        {
            func_213_a(1.0F - f3, f, 0.5F - f2, 1.0F, f1, 0.5F + f2);
        } else
        if(i1 == 3)
        {
            func_213_a(0.5F - f2, f, 0.0F, 0.5F + f2, f1, f3);
        } else
        if(i1 == 4)
        {
            func_213_a(0.5F - f2, f, 1.0F - f3, 0.5F + f2, f1, 1.0F);
        }
    }

    public void func_233_b(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        func_250_a(world, i, j, k, entityplayer);
    }

    public boolean func_250_a(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        int l = world.func_602_e(i, j, k);
        int i1 = l & 7;
        int j1 = 8 - (l & 8);
        if(j1 == 0)
        {
            return true;
        }
        world.func_691_b(i, j, k, i1 + j1);
        world.func_701_b(i, j, k, i, j, k);
        world.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.click", 0.3F, 0.6F);
        world.func_611_g(i, j, k, blockID);
        if(i1 == 1)
        {
            world.func_611_g(i - 1, j, k, blockID);
        } else
        if(i1 == 2)
        {
            world.func_611_g(i + 1, j, k, blockID);
        } else
        if(i1 == 3)
        {
            world.func_611_g(i, j, k - 1, blockID);
        } else
        if(i1 == 4)
        {
            world.func_611_g(i, j, k + 1, blockID);
        } else
        {
            world.func_611_g(i, j - 1, k, blockID);
        }
        world.func_681_h(i, j, k, blockID);
        return true;
    }

    public void func_214_b(World world, int i, int j, int k)
    {
        int l = world.func_602_e(i, j, k);
        if((l & 8) > 0)
        {
            world.func_611_g(i, j, k, blockID);
            int i1 = l & 7;
            if(i1 == 1)
            {
                world.func_611_g(i - 1, j, k, blockID);
            } else
            if(i1 == 2)
            {
                world.func_611_g(i + 1, j, k, blockID);
            } else
            if(i1 == 3)
            {
                world.func_611_g(i, j, k - 1, blockID);
            } else
            if(i1 == 4)
            {
                world.func_611_g(i, j, k + 1, blockID);
            } else
            {
                world.func_611_g(i, j - 1, k, blockID);
            }
        }
        super.func_214_b(world, i, j, k);
    }

    public boolean func_231_b(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return (iblockaccess.func_602_e(i, j, k) & 8) > 0;
    }

    public boolean func_228_c(World world, int i, int j, int k, int l)
    {
        int i1 = world.func_602_e(i, j, k);
        if((i1 & 8) == 0)
        {
            return false;
        }
        int j1 = i1 & 7;
        if(j1 == 5 && l == 1)
        {
            return true;
        }
        if(j1 == 4 && l == 2)
        {
            return true;
        }
        if(j1 == 3 && l == 3)
        {
            return true;
        }
        if(j1 == 2 && l == 4)
        {
            return true;
        }
        return j1 == 1 && l == 5;
    }

    public boolean func_209_d()
    {
        return true;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        int l = world.func_602_e(i, j, k);
        if((l & 8) == 0)
        {
            return;
        }
        world.func_691_b(i, j, k, l & 7);
        world.func_611_g(i, j, k, blockID);
        int i1 = l & 7;
        if(i1 == 1)
        {
            world.func_611_g(i - 1, j, k, blockID);
        } else
        if(i1 == 2)
        {
            world.func_611_g(i + 1, j, k, blockID);
        } else
        if(i1 == 3)
        {
            world.func_611_g(i, j, k - 1, blockID);
        } else
        if(i1 == 4)
        {
            world.func_611_g(i, j, k + 1, blockID);
        } else
        {
            world.func_611_g(i, j - 1, k, blockID);
        }
        world.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.click", 0.3F, 0.5F);
        world.func_701_b(i, j, k, i, j, k);
    }

    public void func_237_e()
    {
        float f = 0.1875F;
        float f1 = 0.125F;
        float f2 = 0.125F;
        func_213_a(0.5F - f, 0.5F - f1, 0.5F - f2, 0.5F + f, 0.5F + f1, 0.5F + f2);
    }
}
