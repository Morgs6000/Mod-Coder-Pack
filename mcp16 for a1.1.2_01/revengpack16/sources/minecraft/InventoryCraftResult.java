// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class InventoryCraftResult
    implements IInventory
{

    public InventoryCraftResult()
    {
        stackResult = new ItemStack[1];
    }

    public int func_469_c()
    {
        return 1;
    }

    public ItemStack func_468_c(int i)
    {
        return stackResult[i];
    }

    public String func_471_d()
    {
        return "Result";
    }

    public ItemStack func_473_a(int i, int j)
    {
        if(stackResult[i] != null)
        {
            ItemStack itemstack = stackResult[i];
            stackResult[i] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ItemStack itemstack)
    {
        stackResult[i] = itemstack;
    }

    public int func_470_e()
    {
        return 64;
    }

    public void func_474_j_()
    {
    }

    private ItemStack stackResult[];
}
