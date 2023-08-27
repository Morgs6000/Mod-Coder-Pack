// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ep
{

    private hq a;
    private iffix b;
    private hf c;
    private a d[];

    public ep(hq hq1)
    {
        b = new iffix();
        c = new hf();
        d = new a[32];
        a = hq1;
    }

    public cd a(dj dj1, dj dj2, float f)
    {
        return a(dj1, dj2.l, dj2.v.b, dj2.n, f);
    }

    public cd a(dj dj1, int i, int j, int k, float f)
    {
        return a(dj1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, f);
    }

    private cd a(dj dj1, double d1, double d2, double d3, 
            float f)
    {
        b.a();
        c.a();
        a a1 = a(gj.b(dj1.v.a), gj.b(dj1.v.b), gj.b(dj1.v.c));
        a a2 = a(gj.b(d1 - (double)(dj1.D / 2.0F)), gj.b(d2), gj.b(d3 - (double)(dj1.D / 2.0F)));
        a a3 = new a(gj.d(dj1.D + 1.0F), gj.d(dj1.E + 1.0F), gj.d(dj1.D + 1.0F));
        cd cd1 = a(dj1, a1, a2, a3, f);
        return cd1;
    }

    private cd a(dj dj1, a a1, a a2, a a3, float f)
    {
        a1.f = 0.0F;
        a1.g = a1.a(a2);
        a1.h = a1.g;
        b.a();
        b.a(a1);
        a a4 = a1;
        while(!b.c()) 
        {
            a a5 = b.b();
            if(a5.d == a2.d)
                return a(a1, a2);
            if(a5.a(a2) < a4.a(a2))
                a4 = a5;
            a5.j = true;
            int i = b(dj1, a5, a3, a2, f);
            int j = 0;
            while(j < i) 
            {
                a a6 = d[j];
                float f1 = a5.f + a5.a(a6);
                if(!a6.a() || f1 < a6.f)
                {
                    a6.i = a5;
                    a6.f = f1;
                    a6.g = a6.a(a2);
                    if(a6.a())
                    {
                        b.a(a6, a6.f + a6.g);
                    } else
                    {
                        a6.h = a6.f + a6.g;
                        b.a(a6);
                    }
                }
                j++;
            }
        }
        if(a4 == a1)
            return null;
        else
            return a(a1, a4);
    }

    private int b(dj dj1, a a1, a a2, a a3, float f)
    {
        int i = 0;
        int j = 0;
        if(a(dj1, a1.a, a1.b + 1, a1.c, a2) > 0)
            j = 1;
        a a4 = a(dj1, a1.a, a1.b, a1.c + 1, a2, j);
        a a5 = a(dj1, a1.a - 1, a1.b, a1.c, a2, j);
        a a6 = a(dj1, a1.a + 1, a1.b, a1.c, a2, j);
        a a7 = a(dj1, a1.a, a1.b, a1.c - 1, a2, j);
        if(a4 != null && !a4.j && a4.a(a3) < f)
            d[i++] = a4;
        if(a5 != null && !a5.j && a5.a(a3) < f)
            d[i++] = a5;
        if(a6 != null && !a6.j && a6.a(a3) < f)
            d[i++] = a6;
        if(a7 != null && !a7.j && a7.a(a3) < f)
            d[i++] = a7;
        return i;
    }

    private a a(dj dj1, int i, int j, int k, a a1, int l)
    {
        a a2 = null;
        if(a(dj1, i, j, k, a1) > 0)
            a2 = a(i, j, k);
        if(a2 == null && a(dj1, i, j + l, k, a1) > 0)
        {
            a2 = a(i, j + l, k);
            j += l;
        }
        if(a2 != null)
        {
            int i1 = 0;
            for(int j1 = 0; j > 0 && (j1 = a(dj1, i, j - 1, k, a1)) > 0; j--)
            {
                if(j1 < 0)
                    return null;
                if(++i1 >= 4)
                    return null;
            }

            if(j > 0)
                a2 = a(i, j, k);
        }
        return a2;
    }

    private final a a(int i, int j, int k)
    {
        int l = i | j << 10 | k << 20;
        a a1 = (a)c.a(l);
        if(a1 == null)
        {
            a1 = new a(i, j, k);
            c.a(l, ((java.lang.Object) (a1)));
        }
        return a1;
    }

    private int a(dj dj1, int i, int j, int k, a a1)
    {
        for(int l = i; l < i + a1.a; l++)
        {
            for(int i1 = j; i1 < j + a1.b; i1++)
            {
                for(int j1 = k; j1 < k + a1.c; j1++)
                {
                    iq iq1 = a.c(i, j, k);
                    if(iq1.c())
                        return 0;
                    if(iq1 == iq.f || iq1 == iq.g)
                        return -1;
                }

            }

        }

        return 1;
    }

    private cd a(a a1, a a2)
    {
        int i = 1;
        for(a a3 = a2; a3.i != null; a3 = a3.i)
            i++;

        a aa[] = new a[i];
        a a4 = a2;
        for(aa[--i] = a4; a4.i != null; aa[--i] = a4)
            a4 = a4.i;

        return new cd(aa);
    }
}
