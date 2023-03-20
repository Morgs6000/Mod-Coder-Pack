// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiCrafting extends GuiContainer
{

    public GuiCrafting(InventoryPlayer inventoryplayer)
    {
        field_979_j = new CraftingInventoryWorkbenchCB();
        field_973_i.add(new SlotCrafting(this, field_979_j.craftMatrix, field_979_j.craftResult, 0, 124, 35));
        for(int i = 0; i < 3; i++)
        {
            for(int l = 0; l < 3; l++)
            {
                field_973_i.add(new SlotInventory(this, field_979_j.craftMatrix, l + i * 3, 30 + l * 18, 17 + i * 18));
            }

        }

        for(int j = 0; j < 3; j++)
        {
            for(int i1 = 0; i1 < 9; i1++)
            {
                field_973_i.add(new SlotInventory(this, inventoryplayer, i1 + (j + 1) * 9, 8 + i1 * 18, 84 + j * 18));
            }

        }

        for(int k = 0; k < 9; k++)
        {
            field_973_i.add(new SlotInventory(this, inventoryplayer, k, 8 + k * 18, 142));
        }

    }

    public void func_576_h()
    {
        super.func_576_h();
        field_979_j.func_1104_a(mc.field_178_g);
    }

    protected void func_587_j()
    {
        field_947_g.func_873_b("Crafting", 28, 6, 0x404040);
        field_947_g.func_873_b("Inventory", 8, (ySize_ee - 96) + 2, 0x404040);
    }

    protected void func_589_a(float f)
    {
        int i = mc.field_171_n.func_1070_a("/gui/crafting.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.field_171_n.func_1076_b(i);
        int j = (width - xSize_ee) / 2;
        int k = (height - ySize_ee) / 2;
        func_550_b(j, k, 0, 0, xSize_ee, ySize_ee);
    }

    public CraftingInventoryWorkbenchCB field_979_j;
}
