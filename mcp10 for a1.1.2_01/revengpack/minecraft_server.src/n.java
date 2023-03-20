// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class n extends gy
{

    public n(int i, int j)
    {
        super(i, j, iq.r, false);
        bo = 0.98F;
        a(true);
    }

    public boolean a(hq hq, int i, int j, int k, int l)
    {
        return super.a(hq, i, j, k, 1 - l);
    }

    public void b(dy dy1, int i, int j, int k)
    {
        iq iq1 = dy1.c(i, j - 1, k);
        if(iq1.c() || iq1.d())
            dy1.d(i, j, k, ff.B.bc);
    }

    public int a(java.util.Random random)
    {
        return 0;
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        if(dy1.a(cy.b, i, j, k) > 11 - ff.r[bc])
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, ff.C.bc);
        }
    }
}
