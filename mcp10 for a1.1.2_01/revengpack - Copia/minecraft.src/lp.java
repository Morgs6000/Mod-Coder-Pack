// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class lp extends bk
{

    private v a[];
    private int b;

    public lp(java.util.Random random, int i)
    {
        b = i;
        a = new v[i];
        for(int j = 0; j < i; j++)
            a[j] = new v(random);

    }

    public double a(double d, double d1)
    {
        double d2 = 0.0D;
        double d3 = 1.0D;
        for(int i = 0; i < b; i++)
        {
            d2 += a[i].a(d * d3, d1 * d3) / d3;
            d3 /= 2D;
        }

        return d2;
    }

    public double[] a(double ad[], double d, double d1, double d2, 
            int i, int j, int k, double d3, double d4, 
            double d5)
    {
        if(ad == null)
        {
            ad = new double[i * j * k];
        } else
        {
            for(int l = 0; l < ad.length; l++)
                ad[l] = 0.0D;

        }
        double d6 = 1.0D;
        for(int i1 = 0; i1 < b; i1++)
        {
            a[i1].a(ad, d, d1, d2, i, j, k, d3 * d6, d4 * d6, d5 * d6, d6);
            d6 /= 2D;
        }

        return ad;
    }
}
