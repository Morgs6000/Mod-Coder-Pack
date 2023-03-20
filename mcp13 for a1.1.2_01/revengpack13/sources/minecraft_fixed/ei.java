// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import org.lwjgl.opengl.GL11;

public class ei extends ak
{

    public ei()
    {
    }

    public void a(ao ao1, double d, double d1, double d2, 
            float f, float f1)
    {
        org.lwjgl.opengl.GL11.glPushMatrix();
        org.lwjgl.opengl.GL11.glTranslatef((float)d, (float)d1, (float)d2);
        org.lwjgl.opengl.GL11.glEnable(32826);
        org.lwjgl.opengl.GL11.glScalef(0.5F, 0.5F, 0.5F);
        int i = di.aB.a(((ev) (null)));
        a("/gui/items.png");
        ho ho1 = ho.a;
        float f2 = (float)((i % 16) * 16 + 0) / 256F;
        float f3 = (float)((i % 16) * 16 + 16) / 256F;
        float f4 = (float)((i / 16) * 16 + 0) / 256F;
        float f5 = (float)((i / 16) * 16 + 16) / 256F;
        float f6 = 1.0F;
        float f7 = 0.5F;
        float f8 = 0.25F;
        org.lwjgl.opengl.GL11.glRotatef(180F - a.i, 0.0F, 1.0F, 0.0F);
        org.lwjgl.opengl.GL11.glRotatef(-a.j, 1.0F, 0.0F, 0.0F);
        ho1.b();
        ho1.b(0.0F, 1.0F, 0.0F);
        ho1.a(0.0F - f7, 0.0F - f8, 0.0D, f2, f5);
        ho1.a(f6 - f7, 0.0F - f8, 0.0D, f3, f5);
        ho1.a(f6 - f7, 1.0F - f8, 0.0D, f3, f4);
        ho1.a(0.0F - f7, 1.0F - f8, 0.0D, f2, f4);
        ho1.a();
        org.lwjgl.opengl.GL11.glDisable(32826);
        org.lwjgl.opengl.GL11.glPopMatrix();
    }

    public void a(kh kh, double d, double d1, double d2, float f, float f1)
    {
        a((ao)kh, d, d1, d2, f, f1);
    }
}
