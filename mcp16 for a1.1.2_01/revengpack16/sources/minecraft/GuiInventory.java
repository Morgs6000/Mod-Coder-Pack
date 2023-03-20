// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiInventory extends GuiContainer
{

    public GuiInventory(IInventory iinventory, ItemStack aitemstack[])
    {
        field_948_f = true;
        field_977_j = new CraftingInventoryPlayerCB(aitemstack);
        field_973_i.add(new SlotCrafting(this, field_977_j.craftMatrix, field_977_j.craftResult, 0, 144, 36));
        for(int i = 0; i < 2; i++)
        {
            for(int i1 = 0; i1 < 2; i1++)
            {
                field_973_i.add(new SlotInventory(this, field_977_j.craftMatrix, i1 + i * 2, 88 + i1 * 18, 26 + i * 18));
            }

        }

        for(int j = 0; j < 4; j++)
        {
            int j1 = j;
            field_973_i.add(new SlotArmor(this, this, iinventory, iinventory.func_469_c() - 1 - j, 8, 8 + j * 18, j1));
        }

        for(int k = 0; k < 3; k++)
        {
            for(int k1 = 0; k1 < 9; k1++)
            {
                field_973_i.add(new SlotInventory(this, iinventory, k1 + (k + 1) * 9, 8 + k1 * 18, 84 + k * 18));
            }

        }

        for(int l = 0; l < 9; l++)
        {
            field_973_i.add(new SlotInventory(this, iinventory, l, 8 + l * 18, 142));
        }

    }

    protected void func_587_j()
    {
        field_947_g.func_873_b("Crafting", 86, 16, 0x404040);
    }

    public void func_571_a(int i, int j, float f)
    {
        super.func_571_a(i, j, f);
        xSize_lo = i;
        ySize_lo = j;
    }

    protected void func_589_a(float f)
    {
        int i = mc.field_171_n.func_1070_a("/gui/inventory.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.field_171_n.func_1076_b(i);
        int j = (width - xSize_ee) / 2;
        int k = (height - ySize_ee) / 2;
        func_550_b(j, k, 0, 0, xSize_ee, ySize_ee);
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef(j + 51, k + 75, 50F);
        float f1 = 30F;
        GL11.glScalef(-f1, f1, f1);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        float f2 = mc.field_178_g.field_735_n;
        float f3 = mc.field_178_g.rotationYaw;
        float f4 = mc.field_178_g.rotationPitch;
        float f5 = (float)(j + 51) - xSize_lo;
        float f6 = (float)((k + 75) - 50) - ySize_lo;
        GL11.glRotatef(135F, 0.0F, 1.0F, 0.0F);
        RenderHelper.func_1158_b();
        GL11.glRotatef(-135F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-(float)Math.atan(f6 / 40F) * 20F, 1.0F, 0.0F, 0.0F);
        mc.field_178_g.field_735_n = (float)Math.atan(f5 / 40F) * 20F;
        mc.field_178_g.rotationYaw = (float)Math.atan(f5 / 40F) * 40F;
        mc.field_178_g.rotationPitch = -(float)Math.atan(f6 / 40F) * 20F;
        GL11.glTranslatef(0.0F, mc.field_178_g.field_645_aB, 0.0F);
        RenderManager.field_1233_a.func_853_a(mc.field_178_g, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        mc.field_178_g.field_735_n = f2;
        mc.field_178_g.rotationYaw = f3;
        mc.field_178_g.rotationPitch = f4;
        GL11.glPopMatrix();
        RenderHelper.func_1159_a();
        GL11.glDisable(32826);
    }

    private CraftingInventoryPlayerCB field_977_j;
    private float xSize_lo;
    private float ySize_lo;
}
