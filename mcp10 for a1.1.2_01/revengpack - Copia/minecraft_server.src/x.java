// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class x extends cn
{

    protected x(int k, iq iq1)
    {
        super(k, iq1);
        a(false);
        if(iq1 == iq.g)
            a(true);
    }

    public void b(dy dy1, int k, int l, int i1, int j1)
    {
        super.b(dy1, k, l, i1, j1);
        if(dy1.a(k, l, i1) == bc)
            i(dy1, k, l, i1);
    }

    private void i(dy dy1, int k, int l, int i1)
    {
        int j1 = dy1.b(k, l, i1);
        dy1.h = true;
        dy1.a(k, l, i1, bc - 1, j1);
        dy1.b(k, l, i1, k, l, i1);
        dy1.h(k, l, i1, bc - 1);
        dy1.h = false;
    }

    public void a(dy dy1, int k, int l, int i1, java.util.Random random)
    {
        if(bn == iq.g)
        {
            int j1 = random.nextInt(3);
            for(int k1 = 0; k1 < j1; k1++)
            {
                k += random.nextInt(3) - 1;
                l++;
                i1 += random.nextInt(3) - 1;
                int l1 = dy1.a(k, l, i1);
                if(l1 == 0)
                {
                    if(j(dy1, k - 1, l, i1) || j(dy1, k + 1, l, i1) || j(dy1, k, l, i1 - 1) || j(dy1, k, l, i1 + 1) || j(dy1, k, l - 1, i1) || j(dy1, k, l + 1, i1))
                    {
                        dy1.d(k, l, i1, ff.as.bc);
                        return;
                    }
                    continue;
                }
                if(ff.n[l1].bn.c())
                    return;
            }

        }
    }

    private boolean j(dy dy1, int k, int l, int i1)
    {
        return dy1.c(k, l, i1).e();
    }
}
