// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class cz
{

    public cz(nm nm1)
    {
        field_1673_b = new fx();
        field_1676_c = new fi();
        field_1675_d = new a[32];
        field_1674_a = nm1;
    }

    public bl func_1137_a(kh kh1, kh kh2, float f)
    {
        return func_1130_a(kh1, kh2.field_611_ak, kh2.field_601_au.field_1697_b, kh2.field_609_am, f);
    }

    public bl func_1131_a(kh kh1, int i, int j, int k, float f)
    {
        return func_1130_a(kh1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, f);
    }

    private bl func_1130_a(kh kh1, double d, double d1, double d2, 
            float f)
    {
        field_1673_b.func_1038_a();
        field_1676_c.func_1058_a();
        a a1 = func_1136_a(eo.b(kh1.field_601_au.field_1698_a), eo.b(kh1.field_601_au.field_1697_b), eo.b(kh1.field_601_au.field_1704_c));
        a a2 = func_1136_a(eo.b(d - (double)(kh1.field_644_aC / 2.0F)), eo.b(d1), eo.b(d2 - (double)(kh1.field_644_aC / 2.0F)));
        a a3 = new a(eo.func_1110_d(kh1.field_644_aC + 1.0F), eo.func_1110_d(kh1.field_643_aD + 1.0F), eo.func_1110_d(kh1.field_644_aC + 1.0F));
        bl bl1 = func_1129_a(kh1, a1, a2, a3, f);
        return bl1;
    }

    private bl func_1129_a(kh kh1, a a1, a a2, a a3, float f)
    {
        a1.field_1713_f = 0.0F;
        a1.field_1712_g = a1.func_1180_a(a2);
        a1.field_1711_h = a1.field_1712_g;
        field_1673_b.func_1038_a();
        field_1673_b.func_1034_a(a1);
        a a4 = a1;
        while(!field_1673_b.func_1039_c()) 
        {
            a a5 = field_1673_b.func_1036_b();
            if(a5.field_1715_d == a2.field_1715_d)
            {
                return func_1134_a(a1, a2);
            }
            if(a5.func_1180_a(a2) < a4.func_1180_a(a2))
            {
                a4 = a5;
            }
            a5.field_1709_j = true;
            int i = func_1133_b(kh1, a5, a3, a2, f);
            int j = 0;
            while(j < i) 
            {
                a a6 = field_1675_d[j];
                float f1 = a5.field_1713_f + a5.func_1180_a(a6);
                if(!a6.func_1179_a() || f1 < a6.field_1713_f)
                {
                    a6.field_1710_i = a5;
                    a6.field_1713_f = f1;
                    a6.field_1712_g = a6.func_1180_a(a2);
                    if(a6.func_1179_a())
                    {
                        field_1673_b.func_1035_a(a6, a6.field_1713_f + a6.field_1712_g);
                    } else
                    {
                        a6.field_1711_h = a6.field_1713_f + a6.field_1712_g;
                        field_1673_b.func_1034_a(a6);
                    }
                }
                j++;
            }
        }
        if(a4 == a1)
        {
            return null;
        } else
        {
            return func_1134_a(a1, a4);
        }
    }

    private int func_1133_b(kh kh1, a a1, a a2, a a3, float f)
    {
        int i = 0;
        int j = 0;
        if(func_1132_a(kh1, a1.field_1718_a, a1.field_1717_b + 1, a1.field_1716_c, a2) > 0)
        {
            j = 1;
        }
        a a4 = func_1135_a(kh1, a1.field_1718_a, a1.field_1717_b, a1.field_1716_c + 1, a2, j);
        a a5 = func_1135_a(kh1, a1.field_1718_a - 1, a1.field_1717_b, a1.field_1716_c, a2, j);
        a a6 = func_1135_a(kh1, a1.field_1718_a + 1, a1.field_1717_b, a1.field_1716_c, a2, j);
        a a7 = func_1135_a(kh1, a1.field_1718_a, a1.field_1717_b, a1.field_1716_c - 1, a2, j);
        if(a4 != null && !a4.field_1709_j && a4.func_1180_a(a3) < f)
        {
            field_1675_d[i++] = a4;
        }
        if(a5 != null && !a5.field_1709_j && a5.func_1180_a(a3) < f)
        {
            field_1675_d[i++] = a5;
        }
        if(a6 != null && !a6.field_1709_j && a6.func_1180_a(a3) < f)
        {
            field_1675_d[i++] = a6;
        }
        if(a7 != null && !a7.field_1709_j && a7.func_1180_a(a3) < f)
        {
            field_1675_d[i++] = a7;
        }
        return i;
    }

    private a func_1135_a(kh kh1, int i, int j, int k, a a1, int l)
    {
        a a2 = null;
        if(func_1132_a(kh1, i, j, k, a1) > 0)
        {
            a2 = func_1136_a(i, j, k);
        }
        if(a2 == null && func_1132_a(kh1, i, j + l, k, a1) > 0)
        {
            a2 = func_1136_a(i, j + l, k);
            j += l;
        }
        if(a2 != null)
        {
            int i1 = 0;
            for(int j1 = 0; j > 0 && (j1 = func_1132_a(kh1, i, j - 1, k, a1)) > 0; j--)
            {
                if(j1 < 0)
                {
                    return null;
                }
                if(++i1 >= 4)
                {
                    return null;
                }
            }

            if(j > 0)
            {
                a2 = func_1136_a(i, j, k);
            }
        }
        return a2;
    }

    private final a func_1136_a(int i, int j, int k)
    {
        int l = i | j << 10 | k << 20;
        a a1 = (a)field_1676_c.func_1057_a(l);
        if(a1 == null)
        {
            a1 = new a(i, j, k);
            field_1676_c.func_1061_a(l, a1);
        }
        return a1;
    }

    private int func_1132_a(kh kh1, int i, int j, int k, a a1)
    {
        for(int l = i; l < i + a1.field_1718_a; l++)
        {
            for(int i1 = j; i1 < j + a1.field_1717_b; i1++)
            {
                for(int j1 = k; j1 < k + a1.field_1716_c; j1++)
                {
                    gb gb1 = field_1674_a.func_599_f(i, j, k);
                    if(gb1.func_880_c())
                    {
                        return 0;
                    }
                    if(gb1 == gb.field_1332_f || gb1 == gb.field_1331_g)
                    {
                        return -1;
                    }
                }

            }

        }

        return 1;
    }

    private bl func_1134_a(a a1, a a2)
    {
        int i = 1;
        for(a a3 = a2; a3.field_1710_i != null; a3 = a3.field_1710_i)
        {
            i++;
        }

        a aa[] = new a[i];
        a a4 = a2;
        for(aa[--i] = a4; a4.field_1710_i != null; aa[--i] = a4)
        {
            a4 = a4.field_1710_i;
        }

        return new bl(aa);
    }

    private nm field_1674_a;
    private fx field_1673_b;
    private fi field_1676_c;
    private a field_1675_d[];
}
