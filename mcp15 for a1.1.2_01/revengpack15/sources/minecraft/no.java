// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class no extends ly
{

    protected no(int i, int j)
    {
        super(i, j, gb.field_1324_n);
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
        return 12;
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
        int j1 = i1 & 8;
        i1 &= 7;
        if(l == 1 && cn1.func_601_g(i, j - 1, k))
        {
            i1 = 5 + cn1.field_1037_n.nextInt(2);
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
        cn1.func_691_b(i, j, k, i1 + j1);
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
            cn1.func_691_b(i, j, k, 5 + cn1.field_1037_n.nextInt(2));
        }
        func_267_h(cn1, i, j, k);
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        if(func_267_h(cn1, i, j, k))
        {
            int i1 = cn1.func_602_e(i, j, k) & 7;
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

    private boolean func_267_h(cn cn1, int i, int j, int k)
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

    public void func_238_a(nm nm1, int i, int j, int k)
    {
        int l = nm1.func_602_e(i, j, k) & 7;
        float f = 0.1875F;
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
            float f1 = 0.25F;
            func_213_a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
    }

    public void func_233_b(cn cn1, int i, int j, int k, dm dm)
    {
        func_250_a(cn1, i, j, k, dm);
    }

    public boolean func_250_a(cn cn1, int i, int j, int k, dm dm)
    {
        int l = cn1.func_602_e(i, j, k);
        int i1 = l & 7;
        int j1 = 8 - (l & 8);
        cn1.func_691_b(i, j, k, i1 + j1);
        cn1.func_701_b(i, j, k, i, j, k);
        cn1.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.click", 0.3F, j1 <= 0 ? 0.5F : 0.6F);
        cn1.func_611_g(i, j, k, field_376_bc);
        if(i1 == 1)
        {
            cn1.func_611_g(i - 1, j, k, field_376_bc);
        } else
        if(i1 == 2)
        {
            cn1.func_611_g(i + 1, j, k, field_376_bc);
        } else
        if(i1 == 3)
        {
            cn1.func_611_g(i, j, k - 1, field_376_bc);
        } else
        if(i1 == 4)
        {
            cn1.func_611_g(i, j, k + 1, field_376_bc);
        } else
        {
            cn1.func_611_g(i, j - 1, k, field_376_bc);
        }
        return true;
    }

    public void func_214_b(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_602_e(i, j, k);
        if((l & 8) > 0)
        {
            cn1.func_611_g(i, j, k, field_376_bc);
            int i1 = l & 7;
            if(i1 == 1)
            {
                cn1.func_611_g(i - 1, j, k, field_376_bc);
            } else
            if(i1 == 2)
            {
                cn1.func_611_g(i + 1, j, k, field_376_bc);
            } else
            if(i1 == 3)
            {
                cn1.func_611_g(i, j, k - 1, field_376_bc);
            } else
            if(i1 == 4)
            {
                cn1.func_611_g(i, j, k + 1, field_376_bc);
            } else
            {
                cn1.func_611_g(i, j - 1, k, field_376_bc);
            }
        }
        super.func_214_b(cn1, i, j, k);
    }

    public boolean func_231_b(nm nm1, int i, int j, int k, int l)
    {
        return (nm1.func_602_e(i, j, k) & 8) > 0;
    }

    public boolean func_228_c(cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_602_e(i, j, k);
        if((i1 & 8) == 0)
        {
            return false;
        }
        int j1 = i1 & 7;
        if(j1 == 5 && l == 1)
        {
            return true;
        }
        if(j1 == 4 && l == 2)
        {
            return true;
        }
        if(j1 == 3 && l == 3)
        {
            return true;
        }
        if(j1 == 2 && l == 4)
        {
            return true;
        }
        return j1 == 1 && l == 5;
    }

    public boolean func_209_d()
    {
        return true;
    }
}
