// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import org.lwjgl.opengl.GL11;

public class dn extends ak
{

    protected fo d;
    protected fo e;

    public dn(fo fo1, float f)
    {
        d = fo1;
        b = f;
    }

    public void a(fo fo1)
    {
        e = fo1;
    }

    public void a(ge ge1, double d1, double d2, double d3, 
            float f, float f1)
    {
        org.lwjgl.opengl.GL11.glPushMatrix();
        org.lwjgl.opengl.GL11.glDisable(2884);
        d.k = c(ge1, f1);
        d.l = ge1.af != null;
        if(e != null)
            e.l = d.l;
        try
        {
            float f2 = ge1.o + (ge1.n - ge1.o) * f1;
            float f3 = ge1.as + (ge1.aq - ge1.as) * f1;
            float f4 = ge1.at + (ge1.ar - ge1.at) * f1;
            org.lwjgl.opengl.GL11.glTranslatef((float)d1, (float)d2, (float)d3);
            float f5 = d(ge1, f1);
            org.lwjgl.opengl.GL11.glRotatef(180F - f2, 0.0F, 1.0F, 0.0F);
            if(ge1.J > 0)
            {
                float f6 = ((((float)ge1.J + f1) - 1.0F) / 20F) * 1.6F;
                f6 = eo.c(f6);
                if(f6 > 1.0F)
                    f6 = 1.0F;
                org.lwjgl.opengl.GL11.glRotatef(f6 * a(ge1), 0.0F, 0.0F, 1.0F);
            }
            float f7 = 0.0625F;
            org.lwjgl.opengl.GL11.glEnable(32826);
            org.lwjgl.opengl.GL11.glScalef(-1F, -1F, 1.0F);
            a(ge1, f1);
            org.lwjgl.opengl.GL11.glTranslatef(0.0F, -24F * f7 - 0.0078125F, 0.0F);
            float f8 = ge1.Q + (ge1.R - ge1.Q) * f1;
            float f9 = ge1.S - ge1.R * (1.0F - f1);
            if(f8 > 1.0F)
                f8 = 1.0F;
            a(ge1.aY, ge1.x());
            org.lwjgl.opengl.GL11.glEnable(3008);
            d.b(f9, f8, f5, f3 - f2, f4, f7);
            for(int i = 0; i < 4; i++)
                if(a(ge1, i))
                {
                    e.b(f9, f8, f5, f3 - f2, f4, f7);
                    org.lwjgl.opengl.GL11.glDisable(3042);
                    org.lwjgl.opengl.GL11.glEnable(3008);
                }

            b(ge1, f1);
            float f10 = ge1.a(f1);
            int j = a(ge1, f10, f1);
            if((j >> 24 & 0xff) > 0 || ge1.G > 0 || ge1.J > 0)
            {
                org.lwjgl.opengl.GL11.glDisable(3553);
                org.lwjgl.opengl.GL11.glDisable(3008);
                org.lwjgl.opengl.GL11.glEnable(3042);
                org.lwjgl.opengl.GL11.glBlendFunc(770, 771);
                org.lwjgl.opengl.GL11.glDepthFunc(514);
                if(ge1.G > 0 || ge1.J > 0)
                {
                    org.lwjgl.opengl.GL11.glColor4f(f10, 0.0F, 0.0F, 0.4F);
                    d.b(f9, f8, f5, f3 - f2, f4, f7);
                    for(int k = 0; k < 4; k++)
                        if(a(ge1, k))
                        {
                            org.lwjgl.opengl.GL11.glColor4f(f10, 0.0F, 0.0F, 0.4F);
                            e.b(f9, f8, f5, f3 - f2, f4, f7);
                        }

                }
                if((j >> 24 & 0xff) > 0)
                {
                    float f11 = (float)(j >> 16 & 0xff) / 255F;
                    float f12 = (float)(j >> 8 & 0xff) / 255F;
                    float f13 = (float)(j & 0xff) / 255F;
                    float f14 = (float)(j >> 24 & 0xff) / 255F;
                    org.lwjgl.opengl.GL11.glColor4f(f11, f12, f13, f14);
                    d.b(f9, f8, f5, f3 - f2, f4, f7);
                    for(int l = 0; l < 4; l++)
                        if(a(ge1, l))
                        {
                            org.lwjgl.opengl.GL11.glColor4f(f11, f12, f13, f14);
                            e.b(f9, f8, f5, f3 - f2, f4, f7);
                        }

                }
                org.lwjgl.opengl.GL11.glDepthFunc(515);
                org.lwjgl.opengl.GL11.glDisable(3042);
                org.lwjgl.opengl.GL11.glEnable(3008);
                org.lwjgl.opengl.GL11.glEnable(3553);
            }
            org.lwjgl.opengl.GL11.glDisable(32826);
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        org.lwjgl.opengl.GL11.glEnable(2884);
        org.lwjgl.opengl.GL11.glPopMatrix();
    }

    protected float c(ge ge1, float f)
    {
        return ge1.d(f);
    }

    protected float d(ge ge1, float f)
    {
        return (float)ge1.aR + f;
    }

    protected void b(ge ge1, float f)
    {
    }

    protected boolean a(ge ge1, int i)
    {
        return false;
    }

    protected float a(ge ge1)
    {
        return 90F;
    }

    protected int a(ge ge1, float f, float f1)
    {
        return 0;
    }

    protected void a(ge ge1, float f)
    {
    }

    public void a(kh kh, double d1, double d2, double d3, float f, float f1)
    {
        a((ge)kh, d1, d2, d3, f, f1);
    }
}
