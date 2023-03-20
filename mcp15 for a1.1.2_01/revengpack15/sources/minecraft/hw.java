// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class hw extends ak
{

    public hw()
    {
        field_196_d = new bc();
        field_190_b = 0.5F;
    }

    public void func_153_a(jd jd1, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        if(((float)jd1.field_689_a - f1) + 1.0F < 10F)
        {
            float f2 = 1.0F - (((float)jd1.field_689_a - f1) + 1.0F) / 10F;
            if(f2 < 0.0F)
            {
                f2 = 0.0F;
            }
            if(f2 > 1.0F)
            {
                f2 = 1.0F;
            }
            f2 *= f2;
            f2 *= f2;
            float f4 = 1.0F + f2 * 0.3F;
            GL11.glScalef(f4, f4, f4);
        }
        float f3 = (1.0F - (((float)jd1.field_689_a - f1) + 1.0F) / 100F) * 0.8F;
        func_151_a("/terrain.png");
        field_196_d.func_1227_a(ly.field_408_an);
        if((jd1.field_689_a / 5) % 2 == 0)
        {
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 772);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, f3);
            field_196_d.func_1227_a(ly.field_408_an);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glEnable(3553);
        }
        GL11.glPopMatrix();
    }

    public void func_147_a(kh kh, double d, double d1, double d2, 
            float f, float f1)
    {
        func_153_a((jd)kh, d, d1, d2, f, f1);
    }

    private bc field_196_d;
}
