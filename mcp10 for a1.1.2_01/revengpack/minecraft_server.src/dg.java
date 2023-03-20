// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.List;

public class dg
{

    private static java.util.List g = new ArrayList();
    private static int h = 0;
    public double a;
    public double b;
    public double c;
    public double d;
    public double e;
    public double f;

    public static dg a(double d1, double d2, double d3, double d4, 
            double d5, double d6)
    {
        return new dg(d1, d2, d3, d4, d5, d6);
    }

    public static void a()
    {
        h = 0;
    }

    public static dg b(double d1, double d2, double d3, double d4, 
            double d5, double d6)
    {
        if(h >= g.size())
            g.add(((java.lang.Object) (dg.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D))));
        return ((dg)g.get(h++)).c(d1, d2, d3, d4, d5, d6);
    }

    private dg(double d1, double d2, double d3, double d4, double d5, double d6)
    {
        a = d1;
        b = d2;
        c = d3;
        d = d4;
        e = d5;
        f = d6;
    }

    public dg c(double d1, double d2, double d3, double d4, double d5, double d6)
    {
        a = d1;
        b = d2;
        c = d3;
        d = d4;
        e = d5;
        f = d6;
        return this;
    }

    public dg a(double d1, double d2, double d3)
    {
        double d4 = a;
        double d5 = b;
        double d6 = c;
        double d7 = d;
        double d8 = e;
        double d9 = f;
        if(d1 < 0.0D)
            d4 += d1;
        if(d1 > 0.0D)
            d7 += d1;
        if(d2 < 0.0D)
            d5 += d2;
        if(d2 > 0.0D)
            d8 += d2;
        if(d3 < 0.0D)
            d6 += d3;
        if(d3 > 0.0D)
            d9 += d3;
        return dg.b(d4, d5, d6, d7, d8, d9);
    }

    public dg b(double d1, double d2, double d3)
    {
        double d4 = a - d1;
        double d5 = b - d2;
        double d6 = c - d3;
        double d7 = d + d1;
        double d8 = e + d2;
        double d9 = f + d3;
        return dg.b(d4, d5, d6, d7, d8, d9);
    }

    public dg c(double d1, double d2, double d3)
    {
        return dg.b(a + d1, b + d2, c + d3, d + d1, e + d2, f + d3);
    }

    public double a(dg dg1, double d1)
    {
        if(dg1.e <= b || dg1.b >= e)
            return d1;
        if(dg1.f <= c || dg1.c >= f)
            return d1;
        if(d1 > 0.0D && dg1.d <= a)
        {
            double d2 = a - dg1.d;
            if(d2 < d1)
                d1 = d2;
        }
        if(d1 < 0.0D && dg1.a >= d)
        {
            double d3 = d - dg1.a;
            if(d3 > d1)
                d1 = d3;
        }
        return d1;
    }

    public double b(dg dg1, double d1)
    {
        if(dg1.d <= a || dg1.a >= d)
            return d1;
        if(dg1.f <= c || dg1.c >= f)
            return d1;
        if(d1 > 0.0D && dg1.e <= b)
        {
            double d2 = b - dg1.e;
            if(d2 < d1)
                d1 = d2;
        }
        if(d1 < 0.0D && dg1.b >= e)
        {
            double d3 = e - dg1.b;
            if(d3 > d1)
                d1 = d3;
        }
        return d1;
    }

    public double c(dg dg1, double d1)
    {
        if(dg1.d <= a || dg1.a >= d)
            return d1;
        if(dg1.e <= b || dg1.b >= e)
            return d1;
        if(d1 > 0.0D && dg1.f <= c)
        {
            double d2 = c - dg1.f;
            if(d2 < d1)
                d1 = d2;
        }
        if(d1 < 0.0D && dg1.c >= f)
        {
            double d3 = f - dg1.c;
            if(d3 > d1)
                d1 = d3;
        }
        return d1;
    }

    public boolean a(dg dg1)
    {
        if(dg1.d <= a || dg1.a >= d)
            return false;
        if(dg1.e <= b || dg1.b >= e)
            return false;
        return dg1.f > c && dg1.c < f;
    }

    public dg d(double d1, double d2, double d3)
    {
        a += d1;
        b += d2;
        c += d3;
        d += d1;
        e += d2;
        f += d3;
        return this;
    }

    public dg e(double d1, double d2, double d3)
    {
        double d4 = a;
        double d5 = b;
        double d6 = c;
        double d7 = d;
        double d8 = e;
        double d9 = f;
        if(d1 < 0.0D)
            d4 -= d1;
        if(d1 > 0.0D)
            d7 -= d1;
        if(d2 < 0.0D)
            d5 -= d2;
        if(d2 > 0.0D)
            d8 -= d2;
        if(d3 < 0.0D)
            d6 -= d3;
        if(d3 > 0.0D)
            d9 -= d3;
        return dg.b(d4, d5, d6, d7, d8, d9);
    }

    public dg b()
    {
        return dg.b(a, b, c, d, e, f);
    }

    public fr a(aw aw1, aw aw2)
    {
        aw aw3 = aw1.a(aw2, a);
        aw aw4 = aw1.a(aw2, d);
        aw aw5 = aw1.b(aw2, b);
        aw aw6 = aw1.b(aw2, e);
        aw aw7 = aw1.c(aw2, c);
        aw aw8 = aw1.c(aw2, f);
        if(!a(aw3))
            aw3 = null;
        if(!a(aw4))
            aw4 = null;
        if(!b(aw5))
            aw5 = null;
        if(!b(aw6))
            aw6 = null;
        if(!c(aw7))
            aw7 = null;
        if(!c(aw8))
            aw8 = null;
        aw aw9 = null;
        if(aw3 != null && (aw9 == null || aw1.b(aw3) < aw1.b(aw9)))
            aw9 = aw3;
        if(aw4 != null && (aw9 == null || aw1.b(aw4) < aw1.b(aw9)))
            aw9 = aw4;
        if(aw5 != null && (aw9 == null || aw1.b(aw5) < aw1.b(aw9)))
            aw9 = aw5;
        if(aw6 != null && (aw9 == null || aw1.b(aw6) < aw1.b(aw9)))
            aw9 = aw6;
        if(aw7 != null && (aw9 == null || aw1.b(aw7) < aw1.b(aw9)))
            aw9 = aw7;
        if(aw8 != null && (aw9 == null || aw1.b(aw8) < aw1.b(aw9)))
            aw9 = aw8;
        if(aw9 == null)
            return null;
        byte byte0 = -1;
        if(aw9 == aw3)
            byte0 = 4;
        if(aw9 == aw4)
            byte0 = 5;
        if(aw9 == aw5)
            byte0 = 0;
        if(aw9 == aw6)
            byte0 = 1;
        if(aw9 == aw7)
            byte0 = 2;
        if(aw9 == aw8)
            byte0 = 3;
        return new fr(0, 0, 0, ((int) (byte0)), aw9);
    }

    private boolean a(aw aw1)
    {
        if(aw1 == null)
            return false;
        else
            return aw1.b >= b && aw1.b <= e && aw1.c >= c && aw1.c <= f;
    }

    private boolean b(aw aw1)
    {
        if(aw1 == null)
            return false;
        else
            return aw1.a >= a && aw1.a <= d && aw1.c >= c && aw1.c <= f;
    }

    private boolean c(aw aw1)
    {
        if(aw1 == null)
            return false;
        else
            return aw1.a >= a && aw1.a <= d && aw1.b >= b && aw1.b <= e;
    }

    public void b(dg dg1)
    {
        a = dg1.a;
        b = dg1.b;
        c = dg1.c;
        d = dg1.d;
        e = dg1.e;
        f = dg1.f;
    }

}
