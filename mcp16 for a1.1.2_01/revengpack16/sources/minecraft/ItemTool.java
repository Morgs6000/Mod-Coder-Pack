// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemTool extends Item
{

    public ItemTool(int i, int j, int k, Block ablock[])
    {
        super(i);
        field_324_aY = 4F;
        field_322_a = k;
        field_325_aX = ablock;
        maxStackSize = 1;
        maxDmg = 32 << k;
        if(k == 3)
        {
            maxDmg *= 4;
        }
        field_324_aY = (k + 1) * 2;
        field_323_aZ = j + k;
    }

    public float func_204_a(ItemStack itemstack, Block block)
    {
        for(int i = 0; i < field_325_aX.length; i++)
        {
            if(field_325_aX[i] == block)
            {
                return field_324_aY;
            }
        }

        return 1.0F;
    }

    public void func_202_a(ItemStack itemstack, EntityLiving entityliving)
    {
        itemstack.func_1101_b(2);
    }

    public void func_203_a(ItemStack itemstack, int i, int j, int k, int l)
    {
        itemstack.func_1101_b(1);
    }

    public int func_198_a(Entity entity)
    {
        return field_323_aZ;
    }

    public boolean func_194_a()
    {
        return true;
    }

    private Block field_325_aX[];
    private float field_324_aY;
    private int field_323_aZ;
    protected int field_322_a;
}
