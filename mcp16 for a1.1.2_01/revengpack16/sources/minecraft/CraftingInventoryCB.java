// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.List;

public class CraftingInventoryCB
{

    public CraftingInventoryCB()
    {
        field_1618_c = new ArrayList();
    }

    public void func_1104_a(EntityPlayer entityplayer)
    {
        InventoryPlayer inventoryplayer = entityplayer.field_778_b;
        if(inventoryplayer.field_846_e != null)
        {
            entityplayer.func_449_a(inventoryplayer.field_846_e);
        }
    }

    public void func_1103_a(IInventory iinventory)
    {
    }

    protected List field_1618_c;
}
