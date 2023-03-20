// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.List;

public class aw
{

    private static java.util.List d = new ArrayList();
    private static int e = 0;
    public double a;
    public double b;
    public double c;

    public static aw a(double d1, double d2, double d3)
    {
        return new aw(d1, d2, d3);
    }

    public static void a()
    {
        e = 0;
    }

    public static aw b(double d1, double d2, double d3)
    {
        if(e >= d.size())
            d.add(((java.lang.Object) (aw.a(0.0D, 0.0D, 0.0D))));
        return ((aw)d.get(e++)).e(d1, d2, d3);
    }

    private aw(double d1, double d2, double d3)
    {
        if(d1 == -0D)
            d1 = 0.0D;
        if(d2 == -0D)
            d2 = 0.0D;
        if(d3 == -0D)
            d3 = 0.0D;
        a = d1;
        b = d2;
        c = d3;
    }

    private aw e(double d1, double d2, double d3)
    {
        a = d1;
        b = d2;
        c = d3;
        return this;
    }

    public aw b()
    {
        double d1 = gj.a(a * a + b * b + c * c);
        if(d1 < 0.0001D)
            return aw.b(0.0D, 0.0D, 0.0D);
        else
            return aw.b(a / d1, b / d1, c / d1);
    }

    public aw c(double d1, double d2, double d3)
    {
        return aw.b(a + d1, b + d2, c + d3);
    }

    public double a(aw aw1)
    {
        double d1 = aw1.a - a;
        double d2 = aw1.b - b;
        double d3 = aw1.c - c;
        return (double)gj.a(d1 * d1 + d2 * d2 + d3 * d3);
    }

    public double b(aw aw1)
    {
        double d1 = aw1.a - a;
        double d2 = aw1.b - b;
        double d3 = aw1.c - c;
        return d1 * d1 + d2 * d2 + d3 * d3;
    }

    public double d(double d1, double d2, double d3)
    {
        double d4 = d1 - a;
        double d5 = d2 - b;
        double d6 = d3 - c;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public double c()
    {
        return (double)gj.a(a * a + b * b + c * c);
    }

    public aw a(aw aw1, double d1)
    {
        double d2 = aw1.a - a;
        double d3 = aw1.b - b;
        double d4 = aw1.c - c;
        if(d2 * d2 < 1.0000000116860974E-007D)
            return null;
        double d5 = (d1 - a) / d2;
        if(d5 < 0.0D || d5 > 1.0D)
            return null;
        else
            return aw.b(a + d2 * d5, b + d3 * d5, c + d4 * d5);
    }

    public aw b(aw aw1, double d1)
    {
        double d2 = aw1.a - a;
        double d3 = aw1.b - b;
        double d4 = aw1.c - c;
        if(d3 * d3 < 1.0000000116860974E-007D)
            return null;
        double d5 = (d1 - b) / d3;
        if(d5 < 0.0D || d5 > 1.0D)
            return null;
        else
            return aw.b(a + d2 * d5, b + d3 * d5, c + d4 * d5);
    }

    public aw c(aw aw1, double d1)
    {
        double d2 = aw1.a - a;
        double d3 = aw1.b - b;
        double d4 = aw1.c - c;
        if(d4 * d4 < 1.0000000116860974E-007D)
            return null;
        double d5 = (d1 - c) / d4;
        if(d5 < 0.0D || d5 > 1.0D)
            return null;
        else
            return aw.b(a + d2 * d5, b + d3 * d5, c + d4 * d5);
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("(").append(a).append(", ").append(b).append(", ").append(c).append(")").toString();
    }

}
