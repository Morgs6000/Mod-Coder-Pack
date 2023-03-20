// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class kf extends ly
{

    public kf(int i, int j)
    {
        super(i, j, gb.field_1324_n);
        field_453_a = true;
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    }

    public int func_232_a(int i, int j)
    {
        return field_378_bb + (j <= 0 ? 0 : 16);
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        return null;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 5;
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        return cn1.func_601_g(i, j - 1, k);
    }

    private void func_280_h(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_602_e(i, j, k);
        int i1 = 0;
        field_453_a = false;
        boolean flag = cn1.func_625_o(i, j, k);
        field_453_a = true;
        if(flag)
        {
            i1 = 15;
        } else
        {
            for(int j1 = 0; j1 < 4; j1++)
            {
                int l1 = i;
                int j2 = k;
                if(j1 == 0)
                {
                    l1--;
                }
                if(j1 == 1)
                {
                    l1++;
                }
                if(j1 == 2)
                {
                    j2--;
                }
                if(j1 == 3)
                {
                    j2++;
                }
                i1 = func_281_g(cn1, l1, j, j2, i1);
                if(cn1.func_601_g(l1, j, j2) && !cn1.func_601_g(i, j + 1, k))
                {
                    i1 = func_281_g(cn1, l1, j + 1, j2, i1);
                    continue;
                }
                if(!cn1.func_601_g(l1, j, j2))
                {
                    i1 = func_281_g(cn1, l1, j - 1, j2, i1);
                }
            }

            if(i1 > 0)
            {
                i1--;
            } else
            {
                i1 = 0;
            }
        }
        if(l != i1)
        {
            cn1.func_691_b(i, j, k, i1);
            cn1.func_701_b(i, j, k, i, j, k);
            if(i1 > 0)
            {
                i1--;
            }
            for(int k1 = 0; k1 < 4; k1++)
            {
                int i2 = i;
                int k2 = k;
                int l2 = j - 1;
                if(k1 == 0)
                {
                    i2--;
                }
                if(k1 == 1)
                {
                    i2++;
                }
                if(k1 == 2)
                {
                    k2--;
                }
                if(k1 == 3)
                {
                    k2++;
                }
                if(cn1.func_601_g(i2, j, k2))
                {
                    l2 += 2;
                }
                int i3 = func_281_g(cn1, i2, j, k2, -1);
                if(i3 >= 0 && i3 != i1)
                {
                    func_280_h(cn1, i2, j, k2);
                }
                i3 = func_281_g(cn1, i2, l2, k2, -1);
                if(i3 >= 0 && i3 != i1)
                {
                    func_280_h(cn1, i2, l2, k2);
                }
            }

            if(l == 0 || i1 == 0)
            {
                cn1.func_611_g(i, j, k, field_376_bc);
                cn1.func_611_g(i - 1, j, k, field_376_bc);
                cn1.func_611_g(i + 1, j, k, field_376_bc);
                cn1.func_611_g(i, j, k - 1, field_376_bc);
                cn1.func_611_g(i, j, k + 1, field_376_bc);
                cn1.func_611_g(i, j - 1, k, field_376_bc);
                cn1.func_611_g(i, j + 1, k, field_376_bc);
            }
        }
    }

    private void func_282_i(cn cn1, int i, int j, int k)
    {
        if(cn1.func_600_a(i, j, k) != field_376_bc)
        {
            return;
        } else
        {
            cn1.func_611_g(i, j, k, field_376_bc);
            cn1.func_611_g(i - 1, j, k, field_376_bc);
            cn1.func_611_g(i + 1, j, k, field_376_bc);
            cn1.func_611_g(i, j, k - 1, field_376_bc);
            cn1.func_611_g(i, j, k + 1, field_376_bc);
            cn1.func_611_g(i, j - 1, k, field_376_bc);
            cn1.func_611_g(i, j + 1, k, field_376_bc);
            return;
        }
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        super.func_235_e(cn1, i, j, k);
        func_280_h(cn1, i, j, k);
        cn1.func_611_g(i, j + 1, k, field_376_bc);
        cn1.func_611_g(i, j - 1, k, field_376_bc);
        func_282_i(cn1, i - 1, j, k);
        func_282_i(cn1, i + 1, j, k);
        func_282_i(cn1, i, j, k - 1);
        func_282_i(cn1, i, j, k + 1);
        if(cn1.func_601_g(i - 1, j, k))
        {
            func_282_i(cn1, i - 1, j + 1, k);
        } else
        {
            func_282_i(cn1, i - 1, j - 1, k);
        }
        if(cn1.func_601_g(i + 1, j, k))
        {
            func_282_i(cn1, i + 1, j + 1, k);
        } else
        {
            func_282_i(cn1, i + 1, j - 1, k);
        }
        if(cn1.func_601_g(i, j, k - 1))
        {
            func_282_i(cn1, i, j + 1, k - 1);
        } else
        {
            func_282_i(cn1, i, j - 1, k - 1);
        }
        if(cn1.func_601_g(i, j, k + 1))
        {
            func_282_i(cn1, i, j + 1, k + 1);
        } else
        {
            func_282_i(cn1, i, j - 1, k + 1);
        }
    }

    public void func_214_b(cn cn1, int i, int j, int k)
    {
        super.func_214_b(cn1, i, j, k);
        cn1.func_611_g(i, j + 1, k, field_376_bc);
        cn1.func_611_g(i, j - 1, k, field_376_bc);
        func_280_h(cn1, i, j, k);
        func_282_i(cn1, i - 1, j, k);
        func_282_i(cn1, i + 1, j, k);
        func_282_i(cn1, i, j, k - 1);
        func_282_i(cn1, i, j, k + 1);
        if(cn1.func_601_g(i - 1, j, k))
        {
            func_282_i(cn1, i - 1, j + 1, k);
        } else
        {
            func_282_i(cn1, i - 1, j - 1, k);
        }
        if(cn1.func_601_g(i + 1, j, k))
        {
            func_282_i(cn1, i + 1, j + 1, k);
        } else
        {
            func_282_i(cn1, i + 1, j - 1, k);
        }
        if(cn1.func_601_g(i, j, k - 1))
        {
            func_282_i(cn1, i, j + 1, k - 1);
        } else
        {
            func_282_i(cn1, i, j - 1, k - 1);
        }
        if(cn1.func_601_g(i, j, k + 1))
        {
            func_282_i(cn1, i, j + 1, k + 1);
        } else
        {
            func_282_i(cn1, i, j - 1, k + 1);
        }
    }

    private int func_281_g(cn cn1, int i, int j, int k, int l)
    {
        if(cn1.func_600_a(i, j, k) != field_376_bc)
        {
            return l;
        }
        int i1 = cn1.func_602_e(i, j, k);
        if(i1 > l)
        {
            return i1;
        } else
        {
            return l;
        }
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_602_e(i, j, k);
        boolean flag = func_243_a(cn1, i, j, k);
        if(!flag)
        {
            func_259_b_(cn1, i, j, k, i1);
            cn1.func_690_d(i, j, k, 0);
        } else
        {
            func_280_h(cn1, i, j, k);
        }
        super.func_226_a(cn1, i, j, k, l);
    }

    public int func_240_a(int i, Random random)
    {
        return di.field_309_aA.field_291_aS;
    }

    public boolean func_228_c(cn cn1, int i, int j, int k, int l)
    {
        if(!field_453_a)
        {
            return false;
        } else
        {
            return func_231_b(cn1, i, j, k, l);
        }
    }

    public boolean func_231_b(nm nm1, int i, int j, int k, int l)
    {
        if(!field_453_a)
        {
            return false;
        }
        if(nm1.func_602_e(i, j, k) == 0)
        {
            return false;
        }
        if(l == 1)
        {
            return true;
        }
        boolean flag = func_279_b(nm1, i - 1, j, k) || !nm1.func_601_g(i - 1, j, k) && func_279_b(nm1, i - 1, j - 1, k);
        boolean flag1 = func_279_b(nm1, i + 1, j, k) || !nm1.func_601_g(i + 1, j, k) && func_279_b(nm1, i + 1, j - 1, k);
        boolean flag2 = func_279_b(nm1, i, j, k - 1) || !nm1.func_601_g(i, j, k - 1) && func_279_b(nm1, i, j - 1, k - 1);
        boolean flag3 = func_279_b(nm1, i, j, k + 1) || !nm1.func_601_g(i, j, k + 1) && func_279_b(nm1, i, j - 1, k + 1);
        if(!nm1.func_601_g(i, j + 1, k))
        {
            if(nm1.func_601_g(i - 1, j, k) && func_279_b(nm1, i - 1, j + 1, k))
            {
                flag = true;
            }
            if(nm1.func_601_g(i + 1, j, k) && func_279_b(nm1, i + 1, j + 1, k))
            {
                flag1 = true;
            }
            if(nm1.func_601_g(i, j, k - 1) && func_279_b(nm1, i, j + 1, k - 1))
            {
                flag2 = true;
            }
            if(nm1.func_601_g(i, j, k + 1) && func_279_b(nm1, i, j + 1, k + 1))
            {
                flag3 = true;
            }
        }
        if(!flag2 && !flag1 && !flag && !flag3 && l >= 2 && l <= 5)
        {
            return true;
        }
        if(l == 2 && flag2 && !flag && !flag1)
        {
            return true;
        }
        if(l == 3 && flag3 && !flag && !flag1)
        {
            return true;
        }
        if(l == 4 && flag && !flag2 && !flag3)
        {
            return true;
        }
        return l == 5 && flag1 && !flag2 && !flag3;
    }

    public boolean func_209_d()
    {
        return field_453_a;
    }

    public void func_247_b(cn cn1, int i, int j, int k, Random random)
    {
        if(cn1.func_602_e(i, j, k) > 0)
        {
            double d = (double)i + 0.5D + ((double)random.nextFloat() - 0.5D) * 0.20000000000000001D;
            double d1 = (float)j + 0.0625F;
            double d2 = (double)k + 0.5D + ((double)random.nextFloat() - 0.5D) * 0.20000000000000001D;
            cn1.func_694_a("reddust", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

    public static boolean func_279_b(nm nm1, int i, int j, int k)
    {
        int l = nm1.func_600_a(i, j, k);
        if(l == ly.field_394_aw.field_376_bc)
        {
            return true;
        }
        if(l == 0)
        {
            return false;
        }
        return ly.field_345_n[l].func_209_d();
    }

    private boolean field_453_a;
}
