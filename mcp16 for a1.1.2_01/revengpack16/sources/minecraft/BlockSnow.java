// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockSnow extends Block
{

    protected BlockSnow(int i, int j)
    {
        super(i, j, Material.snow);
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        func_253_b(true);
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
        int l = world.func_600_a(i, j - 1, k);
        if(l == 0 || !Block.allBlocks[l].func_217_b())
        {
            return false;
        } else
        {
            return world.func_599_f(i, j - 1, k).func_880_c();
        }
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        func_314_h(world, i, j, k);
    }

    private boolean func_314_h(World world, int i, int j, int k)
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

    public void func_220_a_(World world, int i, int j, int k, int l)
    {
        int i1 = Item.snowball.swiftedIndex;
        float f = 0.7F;
        double d = (double)(world.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d1 = (double)(world.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d2 = (double)(world.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(world, (double)i + d, (double)j + d1, (double)k + d2, new ItemStack(i1));
        entityitem.field_805_c = 10;
        world.func_674_a(entityitem);
        world.func_690_d(i, j, k, 0);
    }

    public int func_240_a(int i, Random random)
    {
        return Item.snowball.swiftedIndex;
    }

    public int func_229_a(Random random)
    {
        return 0;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        if(world.func_641_a(EnumSkyBlock.Block, i, j, k) > 11)
        {
            func_259_b_(world, i, j, k, world.func_602_e(i, j, k));
            world.func_690_d(i, j, k, 0);
        }
    }

    public boolean func_260_c(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        Material material = iblockaccess.func_599_f(i, j, k);
        if(l == 1)
        {
            return true;
        }
        if(material == this.material)
        {
            return false;
        } else
        {
            return super.func_260_c(iblockaccess, i, j, k, l);
        }
    }
}
