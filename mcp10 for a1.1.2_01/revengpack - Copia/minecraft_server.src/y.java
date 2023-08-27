// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class y extends ff
{

    public y(int i, int j)
    {
        super(i, j, iq.p);
    }

    public int a(int i)
    {
        if(i == 0)
            return bb + 2;
        if(i == 1)
            return bb + 1;
        else
            return bb;
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        if(l > 0 && ff.n[l].d() && dy1.n(i, j, k))
        {
            a(dy1, i, j, k, 0);
            dy1.d(i, j, k, 0);
        }
    }

    public int a(java.util.Random random)
    {
        return 0;
    }

    public void c(dy dy1, int i, int j, int k)
    {
        bx bx1 = new bx(dy1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
        bx1.a = dy1.m.nextInt(bx1.a / 4) + bx1.a / 8;
        dy1.a(((dj) (bx1)));
    }

    public void a(dy dy1, int i, int j, int k, int l)
    {
        bx bx1 = new bx(dy1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
        dy1.a(((dj) (bx1)));
        dy1.a(((dj) (bx1)), "random.fuse", 1.0F, 1.0F);
    }
}
