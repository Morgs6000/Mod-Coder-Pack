// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class bv
{

    public bv(int i, int j, int ai[], ev ev1)
    {
        field_1724_a = ev1.field_1617_c;
        field_1723_b = i;
        field_1727_c = j;
        field_1726_d = ai;
        field_1725_e = ev1;
    }

    public boolean func_1182_a(int ai[])
    {
        for(int i = 0; i <= 3 - field_1723_b; i++)
        {
            for(int j = 0; j <= 3 - field_1727_c; j++)
            {
                if(func_1185_a(ai, i, j, true))
                {
                    return true;
                }
                if(func_1185_a(ai, i, j, false))
                {
                    return true;
                }
            }

        }

        return false;
    }

    private boolean func_1185_a(int ai[], int i, int j, boolean flag)
    {
        for(int k = 0; k < 3; k++)
        {
            for(int l = 0; l < 3; l++)
            {
                int i1 = k - i;
                int j1 = l - j;
                int k1 = -1;
                if(i1 >= 0 && j1 >= 0 && i1 < field_1723_b && j1 < field_1727_c)
                {
                    if(flag)
                    {
                        k1 = field_1726_d[(field_1723_b - i1 - 1) + j1 * field_1723_b];
                    } else
                    {
                        k1 = field_1726_d[i1 + j1 * field_1723_b];
                    }
                }
                if(ai[k + l * 3] != k1)
                {
                    return false;
                }
            }

        }

        return true;
    }

    public ev func_1183_b(int ai[])
    {
        return new ev(field_1725_e.field_1617_c, field_1725_e.field_1615_a);
    }

    public int func_1184_a()
    {
        return field_1723_b * field_1727_c;
    }

    private int field_1723_b;
    private int field_1727_c;
    private int field_1726_d[];
    private ev field_1725_e;
    public final int field_1724_a;
}
