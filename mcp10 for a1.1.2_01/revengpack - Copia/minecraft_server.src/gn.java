// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class gn extends ff
{

    protected gn(int i, int j)
    {
        super(i, iq.i);
        bb = j;
        a(true);
        float f1 = 0.2F;
        a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f1 * 3F, 0.5F + f1);
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        return b(dy1.a(i, j - 1, k));
    }

    protected boolean b(int i)
    {
        return i == ff.v.bc || i == ff.w.bc || i == ff.aB.bc;
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        super.b(dy1, i, j, k, l);
        g(dy1, i, j, k);
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        g(dy1, i, j, k);
    }

    protected final void g(dy dy1, int i, int j, int k)
    {
        if(!f(dy1, i, j, k))
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
        }
    }

    public boolean f(dy dy1, int i, int j, int k)
    {
        return (dy1.h(i, j, k) >= 8 || dy1.g(i, j, k)) && b(dy1.a(i, j - 1, k));
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        return null;
    }

    public boolean b()
    {
        return false;
    }

    public int a()
    {
        return 1;
    }
}
