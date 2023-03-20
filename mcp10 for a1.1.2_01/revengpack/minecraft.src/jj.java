// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.image.BufferedImage;

public class jj
{

    public java.awt.image.BufferedImage a;
    public cn b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public jj(cn cn, int i, int j)
    {
        e = false;
        f = false;
        g = 0;
        h = false;
        b = cn;
        a(i, j);
    }

    public void a(int i, int j)
    {
        e = false;
        c = i;
        d = j;
        g = 0;
        h = false;
    }

    public void a(cn cn, int i, int j)
    {
        b = cn;
        a(i, j);
    }
}
