// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class lo extends ee
{

    public lo(gh gh1, ev aev[])
    {
        field_948_f = true;
        field_977_j = new n(aev);
        field_973_i.add(new an(this, field_977_j.field_1620_a, field_977_j.field_1619_b, 0, 144, 36));
        for(int j = 0; j < 2; j++)
        {
            for(int j1 = 0; j1 < 2; j1++)
            {
                field_973_i.add(new mm(this, field_977_j.field_1620_a, j1 + j * 2, 88 + j1 * 18, 26 + j * 18));
            }

        }

        for(int k = 0; k < 4; k++)
        {
            int k1 = k;
            field_973_i.add(new lj(this, this, gh1, gh1.func_469_c() - 1 - k, 8, 8 + k * 18, k1));
        }

        for(int l = 0; l < 3; l++)
        {
            for(int l1 = 0; l1 < 9; l1++)
            {
                field_973_i.add(new mm(this, gh1, l1 + (l + 1) * 9, 8 + l1 * 18, 84 + l * 18));
            }

        }

        for(int i1 = 0; i1 < 9; i1++)
        {
            field_973_i.add(new mm(this, gh1, i1, 8 + i1 * 18, 142));
        }

    }

    protected void func_587_j()
    {
        field_947_g.func_873_b("Crafting", 86, 16, 0x404040);
    }

    public void func_571_a(int j, int k, float f)
    {
        super.func_571_a(j, k, f);
        field_976_l = j;
        field_975_m = k;
    }

    protected void func_589_a(float f)
    {
        int j = field_945_b.field_171_n.func_1070_a("/gui/inventory.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_171_n.func_1076_b(j);
        int k = (field_951_c - field_971_a) / 2;
        int l = (field_950_d - field_974_h) / 2;
        func_550_b(k, l, 0, 0, field_971_a, field_974_h);
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef(k + 51, l + 75, 50F);
        float f1 = 30F;
        GL11.glScalef(-f1, f1, f1);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        float f2 = field_945_b.field_178_g.field_735_n;
        float f3 = field_945_b.field_178_g.field_605_aq;
        float f4 = field_945_b.field_178_g.field_604_ar;
        float f5 = (float)(k + 51) - field_976_l;
        float f6 = (float)((l + 75) - 50) - field_975_m;
        GL11.glRotatef(135F, 0.0F, 1.0F, 0.0F);
        i.func_1158_b();
        GL11.glRotatef(-135F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-(float)Math.atan(f6 / 40F) * 20F, 1.0F, 0.0F, 0.0F);
        field_945_b.field_178_g.field_735_n = (float)Math.atan(f5 / 40F) * 20F;
        field_945_b.field_178_g.field_605_aq = (float)Math.atan(f5 / 40F) * 40F;
        field_945_b.field_178_g.field_604_ar = -(float)Math.atan(f6 / 40F) * 20F;
        GL11.glTranslatef(0.0F, field_945_b.field_178_g.field_645_aB, 0.0F);
        kx.field_1233_a.func_853_a(field_945_b.field_178_g, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        field_945_b.field_178_g.field_735_n = f2;
        field_945_b.field_178_g.field_605_aq = f3;
        field_945_b.field_178_g.field_604_ar = f4;
        GL11.glPopMatrix();
        i.func_1159_a();
        GL11.glDisable(32826);
    }

    private n field_977_j;
    private float field_976_l;
    private float field_975_m;
}
