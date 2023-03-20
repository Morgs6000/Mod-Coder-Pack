// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ci
    implements nm
{

    public ci(cn cn1, int i, int j, int k, int l, int i1, int j1)
    {
        field_1061_d = cn1;
        field_1060_a = i >> 4;
        field_1059_b = k >> 4;
        int k1 = l >> 4;
        int l1 = j1 >> 4;
        field_1062_c = new ga[(k1 - field_1060_a) + 1][(l1 - field_1059_b) + 1];
        for(int i2 = field_1060_a; i2 <= k1; i2++)
        {
            for(int j2 = field_1059_b; j2 <= l1; j2++)
            {
                field_1062_c[i2 - field_1060_a][j2 - field_1059_b] = cn1.func_704_b(i2, j2);
            }

        }

    }

    public int func_600_a(int i, int j, int k)
    {
        if(j < 0)
        {
            return 0;
        }
        if(j >= 128)
        {
            return 0;
        } else
        {
            int l = (i >> 4) - field_1060_a;
            int i1 = (k >> 4) - field_1059_b;
            return field_1062_c[l][i1].func_1008_a(i & 0xf, j, k & 0xf);
        }
    }

    public ic func_603_b(int i, int j, int k)
    {
        int l = (i >> 4) - field_1060_a;
        int i1 = (k >> 4) - field_1059_b;
        return field_1062_c[l][i1].func_1002_d(i & 0xf, j, k & 0xf);
    }

    public float func_598_c(int i, int j, int k)
    {
        return cn.field_1042_i[func_715_d(i, j, k)];
    }

    public int func_715_d(int i, int j, int k)
    {
        return func_716_a(i, j, k, true);
    }

    public int func_716_a(int i, int j, int k, boolean flag)
    {
        if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return 15;
        }
        if(flag)
        {
            int l = func_600_a(i, j, k);
            if(l == ly.field_410_al.field_376_bc || l == ly.field_446_aB.field_376_bc)
            {
                int k1 = func_716_a(i, j + 1, k, false);
                int i2 = func_716_a(i + 1, j, k, false);
                int j2 = func_716_a(i - 1, j, k, false);
                int k2 = func_716_a(i, j, k + 1, false);
                int l2 = func_716_a(i, j, k - 1, false);
                if(i2 > k1)
                {
                    k1 = i2;
                }
                if(j2 > k1)
                {
                    k1 = j2;
                }
                if(k2 > k1)
                {
                    k1 = k2;
                }
                if(l2 > k1)
                {
                    k1 = l2;
                }
                return k1;
            }
        }
        if(j < 0)
        {
            return 0;
        }
        if(j >= 128)
        {
            int i1 = 15 - field_1061_d.field_1046_e;
            if(i1 < 0)
            {
                i1 = 0;
            }
            return i1;
        } else
        {
            int j1 = (i >> 4) - field_1060_a;
            int l1 = (k >> 4) - field_1059_b;
            return field_1062_c[j1][l1].func_1019_c(i & 0xf, j, k & 0xf, field_1061_d.field_1046_e);
        }
    }

    public int func_602_e(int i, int j, int k)
    {
        if(j < 0)
        {
            return 0;
        }
        if(j >= 128)
        {
            return 0;
        } else
        {
            int l = (i >> 4) - field_1060_a;
            int i1 = (k >> 4) - field_1059_b;
            return field_1062_c[l][i1].func_1021_b(i & 0xf, j, k & 0xf);
        }
    }

    public gb func_599_f(int i, int j, int k)
    {
        int l = func_600_a(i, j, k);
        if(l == 0)
        {
            return gb.field_1337_a;
        } else
        {
            return ly.field_345_n[l].field_356_bn;
        }
    }

    public boolean func_601_g(int i, int j, int k)
    {
        ly ly1 = ly.field_345_n[func_600_a(i, j, k)];
        if(ly1 == null)
        {
            return false;
        } else
        {
            return ly1.func_217_b();
        }
    }

    private int field_1060_a;
    private int field_1059_b;
    private ga field_1062_c[][];
    private cn field_1061_d;
}
