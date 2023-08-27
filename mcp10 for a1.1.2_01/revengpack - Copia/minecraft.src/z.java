// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import org.lwjgl.opengl.GL11;

public class z
{

    public byte a[];
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;

    public z(int i)
    {
        a = new byte[1024];
        c = false;
        d = 0;
        e = 1;
        f = 0;
        b = i;
    }

    public void a()
    {
    }

    public void a(ey ey1)
    {
        if(f == 0)
            org.lwjgl.opengl.GL11.glBindTexture(3553, ey1.a("/terrain.png"));
        else
        if(f == 1)
            org.lwjgl.opengl.GL11.glBindTexture(3553, ey1.a("/gui/items.png"));
    }
}
