// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class hv extends jp
{

    protected hv(int i, gb gb1)
    {
        super(i, gb1);
        field_460_a = 0;
        field_459_b = new boolean[4];
        field_461_c = new int[4];
    }

    private void func_294_j(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_602_e(i, j, k);
        cn1.func_643_a(i, j, k, field_376_bc + 1, l);
        cn1.func_701_b(i, j, k, i, j, k);
        cn1.func_665_h(i, j, k);
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        int l = func_290_h(cn1, i, j, k);
        boolean flag = true;
        if(l > 0)
        {
            int i1 = -100;
            field_460_a = 0;
            i1 = func_296_f(cn1, i - 1, j, k, i1);
            i1 = func_296_f(cn1, i + 1, j, k, i1);
            i1 = func_296_f(cn1, i, j, k - 1, i1);
            i1 = func_296_f(cn1, i, j, k + 1, i1);
            int j1 = i1 + field_458_d;
            if(j1 >= 8 || i1 < 0)
            {
                j1 = -1;
            }
            if(func_290_h(cn1, i, j + 1, k) >= 0)
            {
                int l1 = func_290_h(cn1, i, j + 1, k);
                if(l1 >= 8)
                {
                    j1 = l1;
                } else
                {
                    j1 = l1 + 8;
                }
            }
            if(field_460_a >= 2 && field_356_bn == gb.field_1332_f)
            {
                if(cn1.func_601_g(i, j - 1, k))
                {
                    j1 = 0;
                } else
                if(cn1.func_599_f(i, j - 1, k) == field_356_bn && cn1.func_602_e(i, j, k) == 0)
                {
                    j1 = 0;
                }
            }
            if(field_356_bn == gb.field_1331_g && l < 8 && j1 < 8 && j1 > l && random.nextInt(4) != 0)
            {
                j1 = l;
                flag = false;
            }
            if(j1 != l)
            {
                l = j1;
                if(l < 0)
                {
                    cn1.func_690_d(i, j, k, 0);
                } else
                {
                    cn1.func_691_b(i, j, k, l);
                    cn1.func_681_h(i, j, k, field_376_bc);
                    cn1.func_611_g(i, j, k, field_376_bc);
                }
            } else
            if(flag)
            {
                func_294_j(cn1, i, j, k);
            }
        } else
        {
            func_294_j(cn1, i, j, k);
        }
        if(func_298_m(cn1, i, j - 1, k))
        {
            if(l >= 8)
            {
                cn1.func_688_b(i, j - 1, k, field_376_bc, l);
            } else
            {
                cn1.func_688_b(i, j - 1, k, field_376_bc, l + 8);
            }
        } else
        if(l >= 0 && (l == 0 || func_295_l(cn1, i, j - 1, k)))
        {
            boolean aflag[] = func_297_k(cn1, i, j, k);
            int k1 = l + field_458_d;
            if(l >= 8)
            {
                k1 = 1;
            }
            if(k1 >= 8)
            {
                return;
            }
            if(aflag[0])
            {
                func_299_g(cn1, i - 1, j, k, k1);
            }
            if(aflag[1])
            {
                func_299_g(cn1, i + 1, j, k, k1);
            }
            if(aflag[2])
            {
                func_299_g(cn1, i, j, k - 1, k1);
            }
            if(aflag[3])
            {
                func_299_g(cn1, i, j, k + 1, k1);
            }
        }
    }

    private void func_299_g(cn cn1, int i, int j, int k, int l)
    {
        if(func_298_m(cn1, i, j, k))
        {
            int i1 = cn1.func_600_a(i, j, k);
            if(i1 > 0)
            {
                if(field_356_bn == gb.field_1331_g)
                {
                    func_292_i(cn1, i, j, k);
                } else
                {
                    ly.field_345_n[i1].func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
                }
            }
            cn1.func_688_b(i, j, k, field_376_bc, l);
        }
    }

    private int func_300_a(cn cn1, int i, int j, int k, int l, int i1)
    {
        int j1 = 1000;
        for(int k1 = 0; k1 < 4; k1++)
        {
            if(k1 == 0 && i1 == 1 || k1 == 1 && i1 == 0 || k1 == 2 && i1 == 3 || k1 == 3 && i1 == 2)
            {
                continue;
            }
            int l1 = i;
            int i2 = j;
            int j2 = k;
            if(k1 == 0)
            {
                l1--;
            }
            if(k1 == 1)
            {
                l1++;
            }
            if(k1 == 2)
            {
                j2--;
            }
            if(k1 == 3)
            {
                j2++;
            }
            if(func_295_l(cn1, l1, i2, j2) || cn1.func_599_f(l1, i2, j2) == field_356_bn && cn1.func_602_e(l1, i2, j2) == 0)
            {
                continue;
            }
            if(!func_295_l(cn1, l1, i2 - 1, j2))
            {
                return l;
            }
            if(l >= 4)
            {
                continue;
            }
            int k2 = func_300_a(cn1, l1, i2, j2, l + 1, k1);
            if(k2 < j1)
            {
                j1 = k2;
            }
        }

        return j1;
    }

    private boolean[] func_297_k(cn cn1, int i, int j, int k)
    {
        for(int l = 0; l < 4; l++)
        {
            field_461_c[l] = 1000;
            int j1 = i;
            int i2 = j;
            int j2 = k;
            if(l == 0)
            {
                j1--;
            }
            if(l == 1)
            {
                j1++;
            }
            if(l == 2)
            {
                j2--;
            }
            if(l == 3)
            {
                j2++;
            }
            if(func_295_l(cn1, j1, i2, j2) || cn1.func_599_f(j1, i2, j2) == field_356_bn && cn1.func_602_e(j1, i2, j2) == 0)
            {
                continue;
            }
            if(!func_295_l(cn1, j1, i2 - 1, j2))
            {
                field_461_c[l] = 0;
            } else
            {
                field_461_c[l] = func_300_a(cn1, j1, i2, j2, 1, l);
            }
        }

        int i1 = field_461_c[0];
        for(int k1 = 1; k1 < 4; k1++)
        {
            if(field_461_c[k1] < i1)
            {
                i1 = field_461_c[k1];
            }
        }

        for(int l1 = 0; l1 < 4; l1++)
        {
            field_459_b[l1] = field_461_c[l1] == i1;
        }

        return field_459_b;
    }

    private boolean func_295_l(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_600_a(i, j, k);
        if(l == ly.field_442_aF.field_376_bc || l == ly.field_435_aM.field_376_bc || l == ly.field_443_aE.field_376_bc || l == ly.field_441_aG.field_376_bc || l == ly.field_423_aY.field_376_bc)
        {
            return true;
        }
        if(l == 0)
        {
            return false;
        }
        gb gb1 = ly.field_345_n[l].field_356_bn;
        return gb1.func_878_a();
    }

    protected int func_296_f(cn cn1, int i, int j, int k, int l)
    {
        int i1 = func_290_h(cn1, i, j, k);
        if(i1 < 0)
        {
            return l;
        }
        if(i1 == 0)
        {
            field_460_a++;
        }
        if(i1 >= 8)
        {
            i1 = 0;
        }
        return l >= 0 && i1 >= l ? l : i1;
    }

    private boolean func_298_m(cn cn1, int i, int j, int k)
    {
        gb gb1 = cn1.func_599_f(i, j, k);
        if(gb1 == field_356_bn)
        {
            return false;
        }
        if(gb1 == gb.field_1331_g)
        {
            return false;
        } else
        {
            return !func_295_l(cn1, i, j, k);
        }
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        super.func_235_e(cn1, i, j, k);
        if(cn1.func_600_a(i, j, k) == field_376_bc)
        {
            cn1.func_681_h(i, j, k, field_376_bc);
        }
    }

    int field_460_a;
    boolean field_459_b[];
    int field_461_c[];
}
