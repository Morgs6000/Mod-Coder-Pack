// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class mj extends ly
{

    protected mj(int i, int j)
    {
        super(i, j, gb.field_1324_n);
        func_253_b(true);
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
        return 2;
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        if(cn1.func_601_g(i - 1, j, k))
        {
            return true;
        }
        if(cn1.func_601_g(i + 1, j, k))
        {
            return true;
        }
        if(cn1.func_601_g(i, j, k - 1))
        {
            return true;
        }
        if(cn1.func_601_g(i, j, k + 1))
        {
            return true;
        }
        return cn1.func_601_g(i, j - 1, k);
    }

    public void func_258_d(cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_602_e(i, j, k);
        if(l == 1 && cn1.func_601_g(i, j - 1, k))
        {
            i1 = 5;
        }
        if(l == 2 && cn1.func_601_g(i, j, k + 1))
        {
            i1 = 4;
        }
        if(l == 3 && cn1.func_601_g(i, j, k - 1))
        {
            i1 = 3;
        }
        if(l == 4 && cn1.func_601_g(i + 1, j, k))
        {
            i1 = 2;
        }
        if(l == 5 && cn1.func_601_g(i - 1, j, k))
        {
            i1 = 1;
        }
        cn1.func_691_b(i, j, k, i1);
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        super.func_208_a(cn1, i, j, k, random);
        if(cn1.func_602_e(i, j, k) == 0)
        {
            func_235_e(cn1, i, j, k);
        }
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        if(cn1.func_601_g(i - 1, j, k))
        {
            cn1.func_691_b(i, j, k, 1);
        } else
        if(cn1.func_601_g(i + 1, j, k))
        {
            cn1.func_691_b(i, j, k, 2);
        } else
        if(cn1.func_601_g(i, j, k - 1))
        {
            cn1.func_691_b(i, j, k, 3);
        } else
        if(cn1.func_601_g(i, j, k + 1))
        {
            cn1.func_691_b(i, j, k, 4);
        } else
        if(cn1.func_601_g(i, j - 1, k))
        {
            cn1.func_691_b(i, j, k, 5);
        }
        func_271_h(cn1, i, j, k);
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        if(func_271_h(cn1, i, j, k))
        {
            int i1 = cn1.func_602_e(i, j, k);
            boolean flag = false;
            if(!cn1.func_601_g(i - 1, j, k) && i1 == 1)
            {
                flag = true;
            }
            if(!cn1.func_601_g(i + 1, j, k) && i1 == 2)
            {
                flag = true;
            }
            if(!cn1.func_601_g(i, j, k - 1) && i1 == 3)
            {
                flag = true;
            }
            if(!cn1.func_601_g(i, j, k + 1) && i1 == 4)
            {
                flag = true;
            }
            if(!cn1.func_601_g(i, j - 1, k) && i1 == 5)
            {
                flag = true;
            }
            if(flag)
            {
                func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
                cn1.func_690_d(i, j, k, 0);
            }
        }
    }

    private boolean func_271_h(cn cn1, int i, int j, int k)
    {
        if(!func_243_a(cn1, i, j, k))
        {
            func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
            cn1.func_690_d(i, j, k, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public mf func_255_a(cn cn1, int i, int j, int k, aj aj, aj aj1)
    {
        int l = cn1.func_602_e(i, j, k) & 7;
        float f = 0.15F;
        if(l == 1)
        {
            func_213_a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
        } else
        if(l == 2)
        {
            func_213_a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
        } else
        if(l == 3)
        {
            func_213_a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
        } else
        if(l == 4)
        {
            func_213_a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
        } else
        {
            float f1 = 0.1F;
            func_213_a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
        return super.func_255_a(cn1, i, j, k, aj, aj1);
    }

    public void func_247_b(cn cn1, int i, int j, int k, Random random)
    {
        int l = cn1.func_602_e(i, j, k);
        double d = (float)i + 0.5F;
        double d1 = (float)j + 0.7F;
        double d2 = (float)k + 0.5F;
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;
        if(l == 1)
        {
            cn1.func_694_a("smoke", d - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            cn1.func_694_a("flame", d - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 2)
        {
            cn1.func_694_a("smoke", d + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            cn1.func_694_a("flame", d + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 3)
        {
            cn1.func_694_a("smoke", d, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
            cn1.func_694_a("flame", d, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 4)
        {
            cn1.func_694_a("smoke", d, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
            cn1.func_694_a("flame", d, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
        } else
        {
            cn1.func_694_a("smoke", d, d1, d2, 0.0D, 0.0D, 0.0D);
            cn1.func_694_a("flame", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }
}
