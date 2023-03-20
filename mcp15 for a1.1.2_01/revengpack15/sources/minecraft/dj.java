// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class dj extends ak
{

    public dj()
    {
        field_197_d = new bc();
        field_190_b = 0.5F;
    }

    public void func_156_a(ff ff1, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        func_151_a("/terrain.png");
        ly ly1 = ly.field_345_n[ff1.field_799_a];
        cn cn = ff1.func_465_i();
        GL11.glDisable(2896);
        field_197_d.func_1243_a(ly1, cn, eo.b(ff1.field_611_ak), eo.b(ff1.field_610_al), eo.b(ff1.field_609_am));
        GL11.glEnable(2896);
        GL11.glPopMatrix();
    }

    public void func_147_a(kh kh, double d, double d1, double d2, 
            float f, float f1)
    {
        func_156_a((ff)kh, d, d1, d2, f, f1);
    }

    private bc field_197_d;
}
