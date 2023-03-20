// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class InventoryCrafting
    implements IInventory
{

    public InventoryCrafting(CraftingInventoryCB craftinginventorycb, int i, int j)
    {
        nbrSlots = i * j;
        stackList = new ItemStack[nbrSlots];
        eventHandler = craftinginventorycb;
    }

    public InventoryCrafting(CraftingInventoryCB craftinginventorycb, ItemStack aitemstack[])
    {
        nbrSlots = aitemstack.length;
        stackList = aitemstack;
        eventHandler = craftinginventorycb;
    }

    public int func_469_c()
    {
        return nbrSlots;
    }

    public ItemStack func_468_c(int i)
    {
        return stackList[i];
    }

    public String func_471_d()
    {
        return "Crafting";
    }

    public ItemStack func_473_a(int i, int j)
    {
        if(stackList[i] != null)
        {
            if(stackList[i].stackSize <= j)
            {
                ItemStack itemstack = stackList[i];
                stackList[i] = null;
                eventHandler.func_1103_a(this);
                return itemstack;
            }
            ItemStack itemstack1 = stackList[i].func_1085_a(j);
            if(stackList[i].stackSize == 0)
            {
                stackList[i] = null;
            }
            eventHandler.func_1103_a(this);
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ItemStack itemstack)
    {
        stackList[i] = itemstack;
        eventHandler.func_1103_a(this);
    }

    public int func_470_e()
    {
        return 64;
    }

    public void func_474_j_()
    {
    }

    private ItemStack stackList[];
    private int nbrSlots;
    private CraftingInventoryCB eventHandler;
}
