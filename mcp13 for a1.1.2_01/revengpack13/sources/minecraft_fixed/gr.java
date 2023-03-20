// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

//import Minecraft;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class gr
    implements nu
{

    private java.lang.String a;
    private Minecraft b;
    private java.lang.String c;
    private long d;
    private boolean e;

    public gr(Minecraft minecraft)
    {
        a = "";
        c = "";
        d = java.lang.System.currentTimeMillis();
        e = false;
        b = minecraft;
    }

    public void a(java.lang.String s)
    {
        e = false;
        c(s);
    }

    public void b(java.lang.String s)
    {
        e = true;
        c(c);
    }

    public void c(java.lang.String s)
    {
        if(!b.F)
        {
            if(e)
                return;
            else
                throw new nr();
        } else
        {
            c = s;
            iy iy1 = new iy(b.c, b.d);
            int i = iy1.a();
            int j = iy1.b();
            org.lwjgl.opengl.GL11.glClear(256);
            org.lwjgl.opengl.GL11.glMatrixMode(5889);
            org.lwjgl.opengl.GL11.glLoadIdentity();
            org.lwjgl.opengl.GL11.glOrtho(0.0D, i, j, 0.0D, 100D, 300D);
            org.lwjgl.opengl.GL11.glMatrixMode(5888);
            org.lwjgl.opengl.GL11.glLoadIdentity();
            org.lwjgl.opengl.GL11.glTranslatef(0.0F, 0.0F, -200F);
            return;
        }
    }

    public void d(java.lang.String s)
    {
        if(!b.F)
        {
            if(e)
                return;
            else
                throw new nr();
        } else
        {
            d = 0L;
            a = s;
            a(-1);
            d = 0L;
            return;
        }
    }

    public void a(int i)
    {
        if(!b.F)
            if(e)
                return;
            else
                throw new nr();
        long l = java.lang.System.currentTimeMillis();
        if(l - d < 20L)
            return;
        d = l;
        iy iy1 = new iy(b.c, b.d);
        int j = iy1.a();
        int k = iy1.b();
        org.lwjgl.opengl.GL11.glClear(256);
        org.lwjgl.opengl.GL11.glMatrixMode(5889);
        org.lwjgl.opengl.GL11.glLoadIdentity();
        org.lwjgl.opengl.GL11.glOrtho(0.0D, j, k, 0.0D, 100D, 300D);
        org.lwjgl.opengl.GL11.glMatrixMode(5888);
        org.lwjgl.opengl.GL11.glLoadIdentity();
        org.lwjgl.opengl.GL11.glTranslatef(0.0F, 0.0F, -200F);
        org.lwjgl.opengl.GL11.glClear(16640);
        ho ho1 = ho.a;
        int i1 = b.n.a("/dirt.png");
        org.lwjgl.opengl.GL11.glBindTexture(3553, i1);
        float f = 32F;
        ho1.b();
        ho1.b(0x404040);
        ho1.a(0.0D, k, 0.0D, 0.0D, (float)k / f);
        ho1.a(j, k, 0.0D, (float)j / f, (float)k / f);
        ho1.a(j, 0.0D, 0.0D, (float)j / f, 0.0D);
        ho1.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
        ho1.a();
        if(i >= 0)
        {
            byte byte0 = 100;
            byte byte1 = 2;
            int j1 = j / 2 - byte0 / 2;
            int k1 = k / 2 + 16;
            org.lwjgl.opengl.GL11.glDisable(3553);
            ho1.b();
            ho1.b(0x808080);
            ho1.a(j1, k1, 0.0D);
            ho1.a(j1, k1 + byte1, 0.0D);
            ho1.a(j1 + byte0, k1 + byte1, 0.0D);
            ho1.a(j1 + byte0, k1, 0.0D);
            ho1.b(0x80ff80);
            ho1.a(j1, k1, 0.0D);
            ho1.a(j1, k1 + byte1, 0.0D);
            ho1.a(j1 + i, k1 + byte1, 0.0D);
            ho1.a(j1 + i, k1, 0.0D);
            ho1.a();
            org.lwjgl.opengl.GL11.glEnable(3553);
        }
        b.o.a(c, (j - b.o.a(c)) / 2, k / 2 - 4 - 16, 0xffffff);
        b.o.a(a, (j - b.o.a(a)) / 2, (k / 2 - 4) + 8, 0xffffff);
        org.lwjgl.opengl.Display.update();
        try
        {
            java.lang.Thread.yield();
        }
        catch(java.lang.Exception exception) { }
    }
}
