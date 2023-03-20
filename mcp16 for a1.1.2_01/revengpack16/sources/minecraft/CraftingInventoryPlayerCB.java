// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class CraftingInventoryPlayerCB extends CraftingInventoryCB
{

    public CraftingInventoryPlayerCB(ItemStack aitemstack[])
    {
        craftResult = new InventoryCraftResult();
        craftMatrix = new InventoryCrafting(this, aitemstack);
        func_1103_a(craftMatrix);
    }

    public void func_1103_a(IInventory iinventory)
    {
        int ai[] = new int[9];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int k = -1;
                if(i < 2 && j < 2)
                {
                    ItemStack itemstack = craftMatrix.func_468_c(i + j * 2);
                    if(itemstack != null)
                    {
                        k = itemstack.itemID;
                    }
                }
                ai[i + j * 3] = k;
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
