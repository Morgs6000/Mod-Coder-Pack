// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class InventoryLargeChest
    implements IInventory
{

    public InventoryLargeChest(String s, IInventory iinventory, IInventory iinventory1)
    {
        name = s;
        upperChest = iinventory;
        lowerChest = iinventory1;
    }

    public int func_469_c()
    {
        return upperChest.func_469_c() + lowerChest.func_469_c();
    }

    public String func_471_d()
    {
        return name;
    }

    public ItemStack func_468_c(int i)
    {
        if(i >= upperChest.func_469_c())
        {
            return lowerChest.func_468_c(i - upperChest.func_469_c());
        } else
        {
            return upperChest.func_468_c(i);
        }
    }

    public ItemStack func_473_a(int i, int j)
    {
        if(i >= upperChest.func_469_c())
        {
            return lowerChest.func_473_a(i - upperChest.func_469_c(), j);
        } else
        {
            return upperChest.func_473_a(i, j);
        }
    }

    public void func_472_a(int i, ItemStack itemstack)
    {
        if(i >= upperChest.func_469_c())
        {
            lowerChest.func_472_a(i - upperChest.func_469_c(), itemstack);
        } else
        {
            upperChest.func_472_a(i, itemstack);
        }
    }

    public int func_470_e()
    {
        return upperChest.func_470_e();
    }

    public void func_474_j_()
    {
        upperChest.func_474_j_();
        lowerChest.func_474_j_();
    }

    private String name;
    private IInventory upperChest;
    private IInventory lowerChest;
}
