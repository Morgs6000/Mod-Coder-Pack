// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public abstract class jp extends ly
{

    protected jp(int i, gb gb1)
    {
        super(i, (gb1 != gb.field_1331_g ? 12 : 14) * 16 + 13, gb1);
        field_458_d = 1;
        float f = 0.0F;
        float f1 = 0.0F;
        if(gb1 == gb.field_1331_g)
        {
            field_458_d = 2;
        }
        func_213_a(0.0F + f1, 0.0F + f, 0.0F + f1, 1.0F + f1, 1.0F + f, 1.0F + f1);
        func_253_b(true);
    }

    public static float func_288_b(int i)
    {
        if(i >= 8)
        {
            i = 0;
        }
        float f = (float)(i + 1) / 9F;
        return f;
    }

    public int func_218_a(int i)
    {
        if(i == 0 || i == 1)
        {
            return field_378_bb;
        } else
        {
            return field_378_bb + 1;
        }
    }

    protected int func_290_h(cn cn1, int i, int j, int k)
    {
        if(cn1.func_599_f(i, j, k) != field_356_bn)
        {
            return -1;
        } else
        {
            return cn1.func_602_e(i, j, k);
        }
    }

    protected int func_289_b(nm nm1, int i, int j, int k)
    {
        if(nm1.func_599_f(i, j, k) != field_356_bn)
        {
            return -1;
        }
        int l = nm1.func_602_e(i, j, k);
        if(l >= 8)
        {
            l = 0;
        }
        return l;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_224_a(int i, boolean flag)
    {
        return flag && i == 0;
    }

    public boolean func_260_c(nm nm1, int i, int j, int k, int l)
    {
        gb gb1 = nm1.func_599_f(i, j, k);
        if(gb1 == field_356_bn)
        {
            return false;
        }
        if(gb1 == gb.field_1320_r)
        {
            return false;
        }
        if(l == 1)
        {
            return true;
        } else
        {
            return super.func_260_c(nm1, i, j, k, l);
        }
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        return null;
    }

    public int func_210_f()
    {
        return 4;
    }

    public int func_240_a(int i, Random random)
    {
        return 0;
    }

    public int func_229_a(Random random)
    {
        return 0;
    }

    private aj func_291_e(nm nm1, int i, int j, int k)
    {
        aj aj1 = aj.func_1248_b(0.0D, 0.0D, 0.0D);
        int l = func_289_b(nm1, i, j, k);
        for(int i1 = 0; i1 < 4; i1++)
        {
            int j1 = i;
            int k1 = j;
            int l1 = k;
            if(i1 == 0)
            {
                j1--;
            }
            if(i1 == 1)
            {
                l1--;
            }
            if(i1 == 2)
            {
                j1++;
            }
            if(i1 == 3)
            {
                l1++;
            }
            int i2 = func_289_b(nm1, j1, k1, l1);
            if(i2 < 0)
            {
                if(nm1.func_599_f(j1, k1, l1).func_880_c())
                {
                    continue;
                }
                i2 = func_289_b(nm1, j1, k1 - 1, l1);
                if(i2 >= 0)
                {
                    int j2 = i2 - (l - 8);
                    aj1 = aj1.func_1257_c((j1 - i) * j2, (k1 - j) * j2, (l1 - k) * j2);
                }
                continue;
            }
            if(i2 >= 0)
            {
                int k2 = i2 - l;
                aj1 = aj1.func_1257_c((j1 - i) * k2, (k1 - j) * k2, (l1 - k) * k2);
            }
        }

        if(nm1.func_602_e(i, j, k) >= 8)
        {
            boolean flag = false;
            if(flag || func_260_c(nm1, i, j, k - 1, 2))
            {
                flag = true;
            }
            if(flag || func_260_c(nm1, i, j, k + 1, 3))
            {
                flag = true;
            }
            if(flag || func_260_c(nm1, i - 1, j, k, 4))
            {
                flag = true;
            }
            if(flag || func_260_c(nm1, i + 1, j, k, 5))
            {
                flag = true;
            }
            if(flag || func_260_c(nm1, i, j + 1, k - 1, 2))
            {
                flag = true;
            }
            if(flag || func_260_c(nm1, i, j + 1, k + 1, 3))
            {
                flag = true;
            }
            if(flag || func_260_c(nm1, i - 1, j + 1, k, 4))
            {
                flag = true;
            }
            if(flag || func_260_c(nm1, i + 1, j + 1, k, 5))
            {
                flag = true;
            }
            if(flag)
            {
                aj1 = aj1.func_1252_b().func_1257_c(0.0D, -6D, 0.0D);
            }
        }
        aj1 = aj1.func_1252_b();
        return aj1;
    }

    public void func_257_a(cn cn1, int i, int j, int k, kh kh, aj aj1)
    {
        aj aj2 = func_291_e(cn1, i, j, k);
        aj1.field_1776_a += aj2.field_1776_a;
        aj1.field_1775_b += aj2.field_1775_b;
        aj1.field_1779_c += aj2.field_1779_c;
    }

    public int func_206_a()
    {
        if(field_356_bn == gb.field_1332_f)
        {
            return 5;
        }
        return field_356_bn != gb.field_1331_g ? 0 : 30;
    }

    public float func_241_c(nm nm1, int i, int j, int k)
    {
        float f = nm1.func_598_c(i, j, k);
        float f1 = nm1.func_598_c(i, j + 1, k);
        return f <= f1 ? f1 : f;
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        super.func_208_a(cn1, i, j, k, random);
    }

    public int func_234_g()
    {
        return field_356_bn != gb.field_1332_f ? 0 : 1;
    }

    public void func_247_b(cn cn1, int i, int j, int k, Random random)
    {
        if(field_356_bn == gb.field_1332_f && random.nextInt(64) == 0)
        {
            int l = cn1.func_602_e(i, j, k);
            if(l > 0 && l < 8)
            {
                cn1.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, "liquid.water", random.nextFloat() * 0.25F + 0.75F, random.nextFloat() * 1.0F + 0.5F);
            }
        }
        if(field_356_bn == gb.field_1331_g && cn1.func_599_f(i, j + 1, k) == gb.field_1337_a && !cn1.func_601_g(i, j + 1, k) && random.nextInt(100) == 0)
        {
            double d = (float)i + random.nextFloat();
            double d1 = (double)j + field_362_bj;
            double d2 = (float)k + random.nextFloat();
            cn1.func_694_a("lava", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

    public static double func_293_a(nm nm1, int i, int j, int k, gb gb1)
    {
        aj aj1 = null;
        if(gb1 == gb.field_1332_f)
        {
            aj1 = ((jp)ly.field_401_B).func_291_e(nm1, i, j, k);
        }
        if(gb1 == gb.field_1331_g)
        {
            aj1 = ((jp)ly.field_397_D).func_291_e(nm1, i, j, k);
        }
        if(aj1.field_1776_a == 0.0D && aj1.field_1779_c == 0.0D)
        {
            return -1000D;
        } else
        {
            return Math.atan2(aj1.field_1779_c, aj1.field_1776_a) - 1.5707963267948966D;
        }
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        func_287_j(cn1, i, j, k);
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        func_287_j(cn1, i, j, k);
    }

    private void func_287_j(cn cn1, int i, int j, int k)
    {
        if(cn1.func_600_a(i, j, k) != field_376_bc)
        {
            return;
        }
        if(field_356_bn == gb.field_1331_g)
        {
            boolean flag = false;
            if(flag || cn1.func_599_f(i, j, k - 1) == gb.field_1332_f)
            {
                flag = true;
            }
            if(flag || cn1.func_599_f(i, j, k + 1) == gb.field_1332_f)
            {
                flag = true;
            }
            if(flag || cn1.func_599_f(i - 1, j, k) == gb.field_1332_f)
            {
                flag = true;
            }
            if(flag || cn1.func_599_f(i + 1, j, k) == gb.field_1332_f)
            {
                flag = true;
            }
            if(flag || cn1.func_599_f(i, j + 1, k) == gb.field_1332_f)
            {
                flag = true;
            }
            if(flag)
            {
                int l = cn1.func_602_e(i, j, k);
                if(l == 0)
                {
                    cn1.func_690_d(i, j, k, ly.field_405_aq.field_376_bc);
                } else
                if(l <= 4)
                {
                    cn1.func_690_d(i, j, k, ly.field_335_x.field_376_bc);
                }
                func_292_i(cn1, i, j, k);
            }
        }
    }

    protected void func_292_i(cn cn1, int i, int j, int k)
    {
        cn1.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, "random.fizz", 0.5F, 2.6F + (cn1.field_1037_n.nextFloat() - cn1.field_1037_n.nextFloat()) * 0.8F);
        for(int l = 0; l < 8; l++)
        {
            cn1.func_694_a("largesmoke", (double)i + Math.random(), (double)j + 1.2D, (double)k + Math.random(), 0.0D, 0.0D, 0.0D);
        }

    }

    protected int field_458_d;
}
