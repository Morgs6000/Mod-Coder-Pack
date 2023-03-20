// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class gz extends ff
{

    protected gz(int i)
    {
        super(i, iq.b);
        bb = 3;
        a(true);
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        if(dy1.h(i, j + 1, k) < 4 && dy1.c(i, j + 1, k).b())
        {
            if(random.nextInt(4) != 0)
                return;
            dy1.d(i, j, k, ff.w.bc);
        } else
        if(dy1.h(i, j + 1, k) >= 9)
        {
            int l = (i + random.nextInt(3)) - 1;
            int i1 = (j + random.nextInt(5)) - 3;
            int j1 = (k + random.nextInt(3)) - 1;
            if(dy1.a(l, i1, j1) == ff.w.bc && dy1.h(l, i1 + 1, j1) >= 4 && !dy1.c(l, i1 + 1, j1).b())
                dy1.d(l, i1, j1, ff.v.bc);
        }
    }

    public int a(int i, java.util.Random random)
    {
        return ff.w.a(0, random);
    }
}
