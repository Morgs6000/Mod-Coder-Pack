// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class CraftingInventoryWorkbenchCB extends CraftingInventoryCB
{

    public CraftingInventoryWorkbenchCB()
    {
        craftMatrix = new InventoryCrafting(this, 3, 3);
        craftResult = new InventoryCraftResult();
    }

    public void func_1103_a(IInventory iinventory)
    {
        int ai[] = new int[9];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int k = i + j * 3;
                ItemStack itemstack = craftMatrix.func_468_c(k);
                if(itemstack == null)
                {
                    ai[k] = -1;
                } else
                {
                    ai[k] = itemstack.itemID;
                }
            }

        }

        craftResult.func_472_a(0, CraftingManager.func_1120_a().func_1119_a(ai));
    }

    public void func_1104_a(EntityPlayer entityplayer)
    {
        super.func_1104_a(entityplayer);
        for(int i = 0; i < 9; i++)
        {
            ItemStack itemstack = craftMatrix.func_468_c(i);
            if(itemstack != null)
            {
                entityplayer.func_449_a(itemstack);
            }
        }

    }

    public InventoryCrafting craftMatrix;
    public IInventory craftResult;
}
