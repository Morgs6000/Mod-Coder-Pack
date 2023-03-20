// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiFurnace extends GuiContainer
{

    public GuiFurnace(InventoryPlayer inventoryplayer, TileEntityFurnace tileentityfurnace)
    {
        field_978_j = tileentityfurnace;
        field_973_i.add(new SlotInventory(this, tileentityfurnace, 0, 56, 17));
        field_973_i.add(new SlotInventory(this, tileentityfurnace, 1, 56, 53));
        field_973_i.add(new SlotInventory(this, tileentityfurnace, 2, 116, 35));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                field_973_i.add(new SlotInventory(this, inventoryplayer, k + (i + 1) * 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            field_973_i.add(new SlotInventory(this, inventoryplayer, j, 8 + j * 18, 142));
        }

    }

    protected void func_587_j()
    {
        field_947_g.func_873_b("Furnace", 60, 6, 0x404040);
        field_947_g.func_873_b("Inventory", 8, (ySize_ee - 96) + 2, 0x404040);
    }

    protected void func_589_a(float f)
    {
        int i = mc.field_171_n.func_1070_a("/gui/furnace.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.field_171_n.func_1076_b(i);
        int j = (width - xSize_ee) / 2;
        int k = (height - ySize_ee) / 2;
        func_550_b(j, k, 0, 0, xSize_ee, ySize_ee);
        if(field_978_j.func_485_a())
        {
            int l = field_978_j.func_489_b(12);
            func_550_b(j + 56, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
        }
        int i1 = field_978_j.func_490_a(24);
        func_550_b(j + 79, k + 34, 176, 14, i1 + 1, 16);
    }

    private TileEntityFurnace field_978_j;
}
