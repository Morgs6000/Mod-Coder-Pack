// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class fk extends lm
{

    protected int a;
    protected int b;
    public int c;
    public int d;
    public java.lang.String e;
    public int f;
    public boolean g;
    public boolean h;

    public fk(int i, int j, int k, java.lang.String s)
    {
        this(i, j, k, 200, 20, s);
    }

    protected fk(int i, int j, int k, int l, int i1, java.lang.String s)
    {
        a = 200;
        b = 20;
        g = true;
        h = true;
        f = i;
        c = j;
        d = k;
        a = l;
        b = i1;
        e = s;
    }

    protected int a(boolean flag)
    {
        byte byte0 = 1;
        if(!g)
            byte0 = 0;
        else
        if(flag)
            byte0 = 2;
        return ((int) (byte0));
    }

    public void a(net.minecraft.client.Minecraft minecraft, int i, int j)
    {
        if(!h)
            return;
        kd kd = minecraft.o;
        org.lwjgl.opengl.GL11.glBindTexture(3553, minecraft.n.a("/gui/gui.png"));
        org.lwjgl.opengl.GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        boolean flag = i >= c && j >= d && i < c + a && j < d + b;
        int k = a(flag);
        b(c, d, 0, 46 + k * 20, a / 2, b);
        b(c + a / 2, d, 200 - a / 2, 46 + k * 20, a / 2, b);
        b(minecraft, i, j);
        if(!g)
            a(kd, e, c + a / 2, d + (b - 8) / 2, 0xffa0a0a0);
        else
        if(flag)
            a(kd, e, c + a / 2, d + (b - 8) / 2, 0xffffa0);
        else
            a(kd, e, c + a / 2, d + (b - 8) / 2, 0xe0e0e0);
    }

    protected void b(net.minecraft.client.Minecraft minecraft, int i, int j)
    {
    }

    public void a(int i, int j)
    {
    }

    public boolean c(net.minecraft.client.Minecraft minecraft, int i, int j)
    {
        return g && i >= c && j >= d && i < c + a && j < d + b;
    }
}
