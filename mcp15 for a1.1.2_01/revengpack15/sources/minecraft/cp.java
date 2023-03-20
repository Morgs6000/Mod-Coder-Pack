// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class cp extends ak
{

    public cp()
    {
        field_190_b = 0.5F;
        field_198_d = new cl();
    }

    public void func_157_a(dc dc1, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(180F - f, 0.0F, 1.0F, 0.0F);
        float f2 = (float)dc1.field_806_b - f1;
        float f3 = (float)dc1.field_807_a - f1;
        if(f3 < 0.0F)
        {
            f3 = 0.0F;
        }
        if(f2 > 0.0F)
        {
            GL11.glRotatef(((eo.func_1106_a(f2) * f2 * f3) / 10F) * (float)dc1.field_808_c, 1.0F, 0.0F, 0.0F);
        }
        func_151_a("/terrain.png");
        float f4 = 0.75F;
        GL11.glScalef(f4, f4, f4);
        GL11.glScalef(1.0F / f4, 1.0F / f4, 1.0F / f4);
        func_151_a("/item/boat.png");
        GL11.glScalef(-1F, -1F, 1.0F);
        field_198_d.func_864_b(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    public void func_147_a(kh kh, double d, double d1, double d2, 
            float f, float f1)
    {
        func_157_a((dc)kh, d, d1, d2, f, f1);
    }

    protected fo field_198_d;
}
