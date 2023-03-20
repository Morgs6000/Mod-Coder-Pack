// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class gj extends ak
{

    public gj()
    {
    }

    public void func_147_a(kh kh1, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        func_146_a(kh1.field_601_au, d - kh1.field_638_aI, d1 - kh1.field_637_aJ, d2 - kh1.field_636_aK);
        GL11.glPopMatrix();
    }
}
