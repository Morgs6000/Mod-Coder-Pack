// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class ey extends ff
{

    public static boolean a = false;

    public ey(int i, int j)
    {
        super(i, j, iq.m);
    }

    public void e(dy dy1, int i, int j, int k)
    {
        dy1.h(i, j, k, bc);
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        dy1.h(i, j, k, bc);
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        h(dy1, i, j, k);
    }

    private void h(dy dy1, int i, int j, int k)
    {
        int l = i;
        int i1 = j;
        int j1 = k;
        if(ey.g(dy1, l, i1 - 1, j1) && i1 >= 0)
        {
            hc hc1 = new hc(dy1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, bc);
            if(a)
                while(!hc1.B) 
                    hc1.b_();
            else
                dy1.a(((dj) (hc1)));
        }
    }

    public int c()
    {
        return 3;
    }

    public static boolean g(dy dy1, int i, int j, int k)
    {
        int l = dy1.a(i, j, k);
        if(l == 0)
            return true;
        if(l == ff.as.bc)
            return true;
        iq iq1 = ff.n[l].bn;
        if(iq1 == iq.f)
            return true;
        return iq1 == iq.g;
    }

}
