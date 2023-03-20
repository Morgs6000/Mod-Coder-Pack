// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class ha extends ff
{

    protected ha(int i, int j)
    {
        super(i, j, iq.s);
        a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        a(true);
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        return null;
    }

    public boolean b()
    {
        return false;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        int l = dy1.a(i, j - 1, k);
        if(l == 0 || !ff.n[l].b())
            return false;
        else
            return dy1.c(i, j - 1, k).c();
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        g(dy1, i, j, k);
    }

    private boolean g(dy dy1, int i, int j, int k)
    {
        if(!a(dy1, i, j, k))
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public int a(int i, java.util.Random random)
    {
        return ez.aB.aS;
    }

    public int a(java.util.Random random)
    {
        return 0;
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        if(dy1.a(cy.b, i, j, k) > 11)
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
        }
    }

    public boolean a(hq hq1, int i, int j, int k, int l)
    {
        iq iq1 = hq1.c(i, j, k);
        if(l == 1)
            return true;
        if(iq1 == bn)
            return false;
        else
            return super.a(hq1, i, j, k, l);
    }
}
