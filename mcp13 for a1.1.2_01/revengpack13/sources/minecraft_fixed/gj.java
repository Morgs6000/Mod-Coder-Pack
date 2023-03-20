// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import org.lwjgl.opengl.GL11;

public class gj extends ak
{

    public gj()
    {
    }

    public void a(kh kh1, double d, double d1, double d2, 
            float f, float f1)
    {
        org.lwjgl.opengl.GL11.glPushMatrix();
        gj.a(kh1.au, d - kh1.aI, d1 - kh1.aJ, d2 - kh1.aK);
        org.lwjgl.opengl.GL11.glPopMatrix();
    }
}
