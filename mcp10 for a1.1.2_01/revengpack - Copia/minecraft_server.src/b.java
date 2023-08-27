// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class b extends cs
{

    private java.util.Random a;

    protected b(int i)
    {
        super(i, iq.c);
        a = new Random();
        bb = 26;
    }

    public int a(int i)
    {
        if(i == 1)
            return bb - 1;
        if(i == 0)
            return bb - 1;
        if(i == 3)
            return bb + 1;
        else
            return bb;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        int l = 0;
        if(dy1.a(i - 1, j, k) == bc)
            l++;
        if(dy1.a(i + 1, j, k) == bc)
            l++;
        if(dy1.a(i, j, k - 1) == bc)
            l++;
        if(dy1.a(i, j, k + 1) == bc)
            l++;
        if(l > 1)
            return false;
        if(g(dy1, i - 1, j, k))
            return false;
        if(g(dy1, i + 1, j, k))
            return false;
        if(g(dy1, i, j, k - 1))
            return false;
        return !g(dy1, i, j, k + 1);
    }

    private boolean g(dy dy1, int i, int j, int k)
    {
        if(dy1.a(i, j, k) != bc)
            return false;
        if(dy1.a(i - 1, j, k) == bc)
            return true;
        if(dy1.a(i + 1, j, k) == bc)
            return true;
        if(dy1.a(i, j, k - 1) == bc)
            return true;
        return dy1.a(i, j, k + 1) == bc;
    }

    public void b(dy dy1, int i, int j, int k)
    {
        hb hb1 = (hb)dy1.k(i, j, k);
label0:
        for(int l = 0; l < ((iw) (hb1)).a(); l++)
        {
            gp gp1 = ((iw) (hb1)).a(l);
            if(gp1 == null)
                continue;
            float f = a.nextFloat() * 0.8F + 0.1F;
            float f1 = a.nextFloat() * 0.8F + 0.1F;
            float f2 = a.nextFloat() * 0.8F + 0.1F;
            do
            {
                if(gp1.a <= 0)
                    continue label0;
                int i1 = a.nextInt(21) + 10;
                if(i1 > gp1.a)
                    i1 = gp1.a;
                gp1.a -= i1;
                fn fn1 = new fn(dy1, (float)i + f, (float)j + f1, (float)k + f2, new gp(gp1.c, i1, gp1.d));
                float f3 = 0.05F;
                fn1.o = (float)a.nextGaussian() * f3;
                fn1.p = (float)a.nextGaussian() * f3 + 0.2F;
                fn1.q = (float)a.nextGaussian() * f3;
                dy1.a(((dj) (fn1)));
            } while(true);
        }

        super.b(dy1, i, j, k);
    }

    public boolean a(dy dy1, int i, int j, int k, fc fc1)
    {
        java.lang.Object obj = ((java.lang.Object) ((hb)dy1.k(i, j, k)));
        if(dy1.d(i, j + 1, k))
            return true;
        if(dy1.a(i - 1, j, k) == bc && dy1.d(i - 1, j + 1, k))
            return true;
        if(dy1.a(i + 1, j, k) == bc && dy1.d(i + 1, j + 1, k))
            return true;
        if(dy1.a(i, j, k - 1) == bc && dy1.d(i, j + 1, k - 1))
            return true;
        if(dy1.a(i, j, k + 1) == bc && dy1.d(i, j + 1, k + 1))
            return true;
        if(dy1.a(i - 1, j, k) == bc)
            obj = ((java.lang.Object) (new ah("Large chest", ((iw) ((hb)dy1.k(i - 1, j, k))), ((iw) (obj)))));
        if(dy1.a(i + 1, j, k) == bc)
            obj = ((java.lang.Object) (new ah("Large chest", ((iw) (obj)), ((iw) ((hb)dy1.k(i + 1, j, k))))));
        if(dy1.a(i, j, k - 1) == bc)
            obj = ((java.lang.Object) (new ah("Large chest", ((iw) ((hb)dy1.k(i, j, k - 1))), ((iw) (obj)))));
        if(dy1.a(i, j, k + 1) == bc)
            obj = ((java.lang.Object) (new ah("Large chest", ((iw) (obj)), ((iw) ((hb)dy1.k(i, j, k + 1))))));
        fc1.a(((iw) (obj)));
        return true;
    }

    protected as a_()
    {
        return ((as) (new hb()));
    }
}
