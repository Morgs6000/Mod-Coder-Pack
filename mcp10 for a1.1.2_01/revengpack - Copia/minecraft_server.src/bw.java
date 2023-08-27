// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class bw
{

    public bw()
    {
    }

    public void a(dy dy1, dj dj1, double d, double d1, double d2, float f)
    {
        dy1.a(d, d1, d2, "random.explode", 4F, (1.0F + (dy1.m.nextFloat() - dy1.m.nextFloat()) * 0.2F) * 0.7F);
        java.util.HashSet hashset = new HashSet();
        float f1 = f;
        int i = 16;
        for(int j = 0; j < i; j++)
        {
            for(int l = 0; l < i; l++)
            {
label0:
                for(int j1 = 0; j1 < i; j1++)
                {
                    if(j != 0 && j != i - 1 && l != 0 && l != i - 1 && j1 != 0 && j1 != i - 1)
                        continue;
                    double d3 = ((float)j / ((float)i - 1.0F)) * 2.0F - 1.0F;
                    double d4 = ((float)l / ((float)i - 1.0F)) * 2.0F - 1.0F;
                    double d5 = ((float)j1 / ((float)i - 1.0F)) * 2.0F - 1.0F;
                    double d6 = java.lang.Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
                    d3 /= d6;
                    d4 /= d6;
                    d5 /= d6;
                    float f2 = f * (0.7F + dy1.m.nextFloat() * 0.6F);
                    double d8 = d;
                    double d10 = d1;
                    double d12 = d2;
                    float f3 = 0.3F;
                    do
                    {
                        if(f2 <= 0.0F)
                            continue label0;
                        int j4 = gj.b(d8);
                        int k4 = gj.b(d10);
                        int l4 = gj.b(d12);
                        int i5 = dy1.a(j4, k4, l4);
                        if(i5 > 0)
                            f2 -= (ff.n[i5].a(dj1) + 0.3F) * f3;
                        if(f2 > 0.0F)
                            ((java.util.Set) (hashset)).add(((java.lang.Object) (new gs(j4, k4, l4))));
                        d8 += d3 * (double)f3;
                        d10 += d4 * (double)f3;
                        d12 += d5 * (double)f3;
                        f2 -= f3 * 0.75F;
                    } while(true);
                }

            }

        }

        f *= 2.0F;
        int k = gj.b(d - (double)f - 1.0D);
        int i1 = gj.b(d + (double)f + 1.0D);
        int k1 = gj.b(d1 - (double)f - 1.0D);
        int l1 = gj.b(d1 + (double)f + 1.0D);
        int i2 = gj.b(d2 - (double)f - 1.0D);
        int j2 = gj.b(d2 + (double)f + 1.0D);
        java.util.List list = dy1.b(dj1, dg.b(k, k1, i2, i1, l1, j2));
        aw aw1 = aw.b(d, d1, d2);
        for(int k2 = 0; k2 < list.size(); k2++)
        {
            dj dj2 = (dj)list.get(k2);
            double d7 = dj2.e(d, d1, d2) / (double)f;
            if(d7 <= 1.0D)
            {
                double d9 = dj2.l - d;
                double d11 = dj2.m - d1;
                double d13 = dj2.n - d2;
                double d15 = gj.a(d9 * d9 + d11 * d11 + d13 * d13);
                d9 /= d15;
                d11 /= d15;
                d13 /= d15;
                double d17 = dy1.a(aw1, dj2.v);
                double d19 = (1.0D - d7) * d17;
                dj2.a(dj1, (int)(((d19 * d19 + d19) / 2D) * 8D * (double)f + 1.0D));
                double d21 = d19;
                dj2.o += d9 * d21;
                dj2.p += d11 * d21;
                dj2.q += d13 * d21;
            }
        }

        f = f1;
        java.util.ArrayList arraylist = new ArrayList();
        ((java.util.List) (arraylist)).addAll(((java.util.Collection) (hashset)));
        for(int l2 = ((java.util.List) (arraylist)).size() - 1; l2 >= 0; l2--)
        {
            gs gs1 = (gs)((java.util.List) (arraylist)).get(l2);
            int i3 = gs1.a;
            int j3 = gs1.b;
            int k3 = gs1.c;
            int l3 = dy1.a(i3, j3, k3);
            for(int i4 = 0; i4 < 1; i4++)
            {
                double d14 = (float)i3 + dy1.m.nextFloat();
                double d16 = (float)j3 + dy1.m.nextFloat();
                double d18 = (float)k3 + dy1.m.nextFloat();
                double d20 = d14 - d;
                double d22 = d16 - d1;
                double d23 = d18 - d2;
                double d24 = gj.a(d20 * d20 + d22 * d22 + d23 * d23);
                d20 /= d24;
                d22 /= d24;
                d23 /= d24;
                double d25 = 0.5D / (d24 / (double)f + 0.10000000000000001D);
                d25 *= dy1.m.nextFloat() * dy1.m.nextFloat() + 0.3F;
                d20 *= d25;
                d22 *= d25;
                d23 *= d25;
                dy1.a("explode", (d14 + d * 1.0D) / 2D, (d16 + d1 * 1.0D) / 2D, (d18 + d2 * 1.0D) / 2D, d20, d22, d23);
                dy1.a("smoke", d14, d16, d18, d20, d22, d23);
            }

            if(l3 > 0)
            {
                ff.n[l3].a(dy1, i3, j3, k3, dy1.b(i3, j3, k3), 0.3F);
                dy1.d(i3, j3, k3, 0);
                ff.n[l3].c(dy1, i3, j3, k3);
            }
        }

    }
}
