// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemSword extends Item
{

    public ItemSword(int i, int j)
    {
        super(i);
        maxStackSize = 1;
        maxDmg = 32 << j;
        if(j == 3)
        {
            maxDmg *= 4;
        }
        field_319_a = 4 + j * 2;
    }

    public float func_204_a(ItemStack itemstack, Block block)
    {
        return 1.5F;
    }

    public void func_202_a(ItemStack itemstack, EntityLiving entityliving)
    {
        itemstack.func_1101_b(1);
    }

    public void func_203_a(ItemStack itemstack, int i, int j, int k, int l)
    {
        itemstack.func_1101_b(2);
    }

    public int func_198_a(Entity entity)
    {
        return field_319_a;
    }

    public boolean func_194_a()
    {
        return true;
    }

    private int field_319_a;
}
