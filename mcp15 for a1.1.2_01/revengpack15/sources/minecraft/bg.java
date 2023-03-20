// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;

public class bg extends mj
{

    public int func_232_a(int i, int j)
    {
        if(i == 1)
        {
            return ly.field_394_aw.func_232_a(i, j);
        } else
        {
            return super.func_232_a(i, j);
        }
    }

    private boolean func_273_a(cn cn1, int i, int j, int k, boolean flag)
    {
        if(flag)
        {
            field_450_b.add(new np(i, j, k, cn1.field_1048_c));
        }
        int l = 0;
        for(int i1 = 0; i1 < field_450_b.size(); i1++)
        {
            np np1 = (np)field_450_b.get(i1);
            if(np1.field_1009_a == i && np1.field_1008_b == j && np1.field_1011_c == k && ++l >= 8)
            {
                return true;
            }
        }

        return false;
    }

    protected bg(int i, int j, boolean flag)
    {
        super(i, j);
        field_451_a = false;
        field_451_a = flag;
        func_253_b(true);
    }

    public int func_206_a()
    {
        return 2;
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        if(cn1.func_602_e(i, j, k) == 0)
        {
            super.func_235_e(cn1, i, j, k);
        }
        if(field_451_a)
        {
            cn1.func_611_g(i, j - 1, k, field_376_bc);
            cn1.func_611_g(i, j + 1, k, field_376_bc);
            cn1.func_611_g(i - 1, j, k, field_376_bc);
            cn1.func_611_g(i + 1, j, k, field_376_bc);
            cn1.func_611_g(i, j, k - 1, field_376_bc);
            cn1.func_611_g(i, j, k + 1, field_376_bc);
        }
    }

    public void func_214_b(cn cn1, int i, int j, int k)
    {
        if(field_451_a)
        {
            cn1.func_611_g(i, j - 1, k, field_376_bc);
            cn1.func_611_g(i, j + 1, k, field_376_bc);
            cn1.func_611_g(i - 1, j, k, field_376_bc);
            cn1.func_611_g(i + 1, j, k, field_376_bc);
            cn1.func_611_g(i, j, k - 1, field_376_bc);
            cn1.func_611_g(i, j, k + 1, field_376_bc);
        }
    }

    public boolean func_231_b(nm nm1, int i, int j, int k, int l)
    {
        if(!field_451_a)
        {
            return false;
        }
        int i1 = nm1.func_602_e(i, j, k);
        if(i1 == 5 && l == 1)
        {
            return false;
        }
        if(i1 == 3 && l == 3)
        {
            return false;
        }
        if(i1 == 4 && l == 2)
        {
            return false;
        }
        if(i1 == 1 && l == 5)
        {
            return false;
        }
        return i1 != 2 || l != 4;
    }

    private boolean func_272_h(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_602_e(i, j, k);
        if(l == 5 && cn1.func_706_k(i, j - 1, k, 0))
        {
            return true;
        }
        if(l == 3 && cn1.func_706_k(i, j, k - 1, 2))
        {
            return true;
        }
        if(l == 4 && cn1.func_706_k(i, j, k + 1, 3))
        {
            return true;
        }
        if(l == 1 && cn1.func_706_k(i - 1, j, k, 4))
        {
            return true;
        }
        return l == 2 && cn1.func_706_k(i + 1, j, k, 5);
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        boolean flag = func_272_h(cn1, i, j, k);
        for(; field_450_b.size() > 0 && cn1.field_1048_c - ((np)field_450_b.get(0)).field_1010_d > 100L; field_450_b.remove(0)) { }
        if(field_451_a)
        {
            if(flag)
            {
                cn1.func_688_b(i, j, k, ly.field_431_aQ.field_376_bc, cn1.func_602_e(i, j, k));
                if(func_273_a(cn1, i, j, k, true))
                {
                    cn1.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, "random.fizz", 0.5F, 2.6F + (cn1.field_1037_n.nextFloat() - cn1.field_1037_n.nextFloat()) * 0.8F);
                    for(int l = 0; l < 5; l++)
                    {
                        double d = (double)i + random.nextDouble() * 0.59999999999999998D + 0.20000000000000001D;
                        double d1 = (double)j + random.nextDouble() * 0.59999999999999998D + 0.20000000000000001D;
                        double d2 = (double)k + random.nextDouble() * 0.59999999999999998D + 0.20000000000000001D;
                        cn1.func_694_a("smoke", d, d1, d2, 0.0D, 0.0D, 0.0D);
                    }

                }
            }
        } else
        if(!flag && !func_273_a(cn1, i, j, k, false))
        {
            cn1.func_688_b(i, j, k, ly.field_430_aR.field_376_bc, cn1.func_602_e(i, j, k));
        }
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        super.func_226_a(cn1, i, j, k, l);
        cn1.func_681_h(i, j, k, field_376_bc);
    }

    public boolean func_228_c(cn cn1, int i, int j, int k, int l)
    {
        if(l == 0)
        {
            return func_231_b(cn1, i, j, k, l);
        } else
        {
            return false;
        }
    }

    public int func_240_a(int i, Random random)
    {
        return ly.field_430_aR.field_376_bc;
    }

    public boolean func_209_d()
    {
        return true;
    }

    public void func_247_b(cn cn1, int i, int j, int k, Random random)
    {
        if(!field_451_a)
        {
            return;
        }
        int l = cn1.func_602_e(i, j, k);
        double d = (double)((float)i + 0.5F) + (double)(random.nextFloat() - 0.5F) * 0.20000000000000001D;
        double d1 = (double)((float)j + 0.7F) + (double)(random.nextFloat() - 0.5F) * 0.20000000000000001D;
        double d2 = (double)((float)k + 0.5F) + (double)(random.nextFloat() - 0.5F) * 0.20000000000000001D;
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;
        if(l == 1)
        {
            cn1.func_694_a("reddust", d - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 2)
        {
            cn1.func_694_a("reddust", d + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 3)
        {
            cn1.func_694_a("reddust", d, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 4)
        {
            cn1.func_694_a("reddust", d, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
        } else
        {
            cn1.func_694_a("reddust", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

    private boolean field_451_a;
    private static List field_450_b = new ArrayList();

}
