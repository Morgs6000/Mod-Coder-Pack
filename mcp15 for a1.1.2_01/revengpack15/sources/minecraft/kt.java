// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class kt extends ak
{

    public kt()
    {
        field_190_b = 0.5F;
        field_195_d = new hj();
    }

    public void func_152_a(oc oc1, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        double d3 = oc1.field_638_aI + (oc1.field_611_ak - oc1.field_638_aI) * (double)f1;
        double d4 = oc1.field_637_aJ + (oc1.field_610_al - oc1.field_637_aJ) * (double)f1;
        double d5 = oc1.field_636_aK + (oc1.field_609_am - oc1.field_636_aK) * (double)f1;
        double d6 = 0.30000001192092896D;
        aj aj1 = oc1.func_514_g(d3, d4, d5);
        float f2 = oc1.field_602_at + (oc1.field_604_ar - oc1.field_602_at) * f1;
        if(aj1 != null)
        {
            aj aj2 = oc1.func_515_a(d3, d4, d5, d6);
            aj aj3 = oc1.func_515_a(d3, d4, d5, -d6);
            if(aj2 == null)
            {
                aj2 = aj1;
            }
            if(aj3 == null)
            {
                aj3 = aj1;
            }
            d += aj1.field_1776_a - d3;
            d1 += (aj2.field_1775_b + aj3.field_1775_b) / 2D - d4;
            d2 += aj1.field_1779_c - d5;
            aj aj4 = aj3.func_1257_c(-aj2.field_1776_a, -aj2.field_1775_b, -aj2.field_1779_c);
            if(aj4.func_1253_c() != 0.0D)
            {
                aj4 = aj4.func_1252_b();
                f = (float)((Math.atan2(aj4.field_1779_c, aj4.field_1776_a) * 180D) / 3.1415926535897931D);
                f2 = (float)(Math.atan(aj4.field_1775_b) * 73D);
            }
        }
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(180F - f, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-f2, 0.0F, 0.0F, 1.0F);
        float f3 = (float)oc1.field_863_b - f1;
        float f4 = (float)oc1.field_864_a - f1;
        if(f4 < 0.0F)
        {
            f4 = 0.0F;
        }
        if(f3 > 0.0F)
        {
            GL11.glRotatef(((eo.func_1106_a(f3) * f3 * f4) / 10F) * (float)oc1.field_862_c, 1.0F, 0.0F, 0.0F);
        }
        if(oc1.field_861_d != 0)
        {
            func_151_a("/terrain.png");
            float f5 = 0.75F;
            GL11.glScalef(f5, f5, f5);
            GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
            GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
            if(oc1.field_861_d == 1)
            {
                (new bc()).func_1227_a(ly.field_396_av);
            } else
            if(oc1.field_861_d == 2)
            {
                (new bc()).func_1227_a(ly.field_445_aC);
            }
            GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.3125F, 0.0F);
            GL11.glScalef(1.0F / f5, 1.0F / f5, 1.0F / f5);
        }
        func_151_a("/item/cart.png");
        GL11.glScalef(-1F, -1F, 1.0F);
        field_195_d.func_864_b(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    public void func_147_a(kh kh, double d, double d1, double d2, 
            float f, float f1)
    {
        func_152_a((oc)kh, d, d1, d2, f, f1);
    }

    protected fo field_195_d;
}
