// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import org.lwjgl.opengl.GL11;

public class in extends ex
{

    private jk b;

    public in()
    {
        b = new jk();
    }

    public void a(ob ob1, double d, double d1, double d2, 
            float f)
    {
        ly ly1 = ob1.g();
        org.lwjgl.opengl.GL11.glPushMatrix();
        float f1 = 0.6666667F;
        if(ly1 == ly.aE)
        {
            org.lwjgl.opengl.GL11.glTranslatef((float)d + 0.5F, (float)d1 + 0.75F * f1, (float)d2 + 0.5F);
            float f2 = (float)(ob1.f() * 360) / 16F;
            org.lwjgl.opengl.GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
            b.b.h = true;
        } else
        {
            int i = ob1.f();
            float f3 = 0.0F;
            if(i == 2)
                f3 = 180F;
            if(i == 4)
                f3 = 90F;
            if(i == 5)
                f3 = -90F;
            org.lwjgl.opengl.GL11.glTranslatef((float)d + 0.5F, (float)d1 + 0.75F * f1, (float)d2 + 0.5F);
            org.lwjgl.opengl.GL11.glRotatef(-f3, 0.0F, 1.0F, 0.0F);
            org.lwjgl.opengl.GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
            b.b.h = false;
        }
        a("/item/sign.png");
        org.lwjgl.opengl.GL11.glPushMatrix();
        org.lwjgl.opengl.GL11.glScalef(f1, -f1, -f1);
        b.a();
        org.lwjgl.opengl.GL11.glPopMatrix();
        kd kd1 = a();
        float f4 = 0.01666667F * f1;
        org.lwjgl.opengl.GL11.glTranslatef(0.0F, 0.5F * f1, 0.07F * f1);
        org.lwjgl.opengl.GL11.glScalef(f4, -f4, f4);
        org.lwjgl.opengl.GL11.glNormal3f(0.0F, 0.0F, -1F * f4);
        org.lwjgl.opengl.GL11.glDepthMask(false);
        int j = 0;
        for(int k = 0; k < ob1.a.length; k++)
        {
            java.lang.String s = ob1.a[k];
            if(k == ob1.b)
            {
                s = (new StringBuilder()).append("> ").append(s).append(" <").toString();
                kd1.b(s, -kd1.a(s) / 2, k * 10 - ob1.a.length * 5, j);
            } else
            {
                kd1.b(s, -kd1.a(s) / 2, k * 10 - ob1.a.length * 5, j);
            }
        }

        org.lwjgl.opengl.GL11.glDepthMask(true);
        org.lwjgl.opengl.GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        org.lwjgl.opengl.GL11.glPopMatrix();
    }

    public void a(ic ic, double d, double d1, double d2, float f)
    {
        a((ob)ic, d, d1, d2, f);
    }
}
