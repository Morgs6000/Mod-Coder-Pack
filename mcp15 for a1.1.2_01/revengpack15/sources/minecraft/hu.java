// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class hu extends ly
{

    protected hu(int i, int j)
    {
        super(i, j, gb.field_1324_n);
        func_253_b(true);
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        return null;
    }

    public int func_206_a()
    {
        return 20;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
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
        return cn1.func_601_g(i, j, k + 1);
    }

    public void func_258_d(cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_602_e(i, j, k);
        int j1 = i1 & 8;
        i1 &= 7;
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
        }
        func_305_h(cn1, i, j, k);
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        if(func_305_h(cn1, i, j, k))
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
            if(flag)
            {
                func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
                cn1.func_690_d(i, j, k, 0);
            }
        }
    }

    private boolean func_305_h(cn cn1, int i, int j, int k)
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
        int l = nm1.func_602_e(i, j, k);
        int i1 = l & 7;
        boolean flag = (l & 8) > 0;
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.1875F;
        float f3 = 0.125F;
        if(flag)
        {
            f3 = 0.0625F;
        }
        if(i1 == 1)
        {
            func_213_a(0.0F, f, 0.5F - f2, f3, f1, 0.5F + f2);
        } else
        if(i1 == 2)
        {
            func_213_a(1.0F - f3, f, 0.5F - f2, 1.0F, f1, 0.5F + f2);
        } else
        if(i1 == 3)
        {
            func_213_a(0.5F - f2, f, 0.0F, 0.5F + f2, f1, f3);
        } else
        if(i1 == 4)
        {
            func_213_a(0.5F - f2, f, 1.0F - f3, 0.5F + f2, f1, 1.0F);
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
        if(j1 == 0)
        {
            return true;
        }
        cn1.func_691_b(i, j, k, i1 + j1);
        cn1.func_701_b(i, j, k, i, j, k);
        cn1.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.click", 0.3F, 0.6F);
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
        cn1.func_681_h(i, j, k, field_376_bc);
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

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        int l = cn1.func_602_e(i, j, k);
        if((l & 8) == 0)
        {
            return;
        }
        cn1.func_691_b(i, j, k, l & 7);
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
        cn1.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.click", 0.3F, 0.5F);
        cn1.func_701_b(i, j, k, i, j, k);
    }

    public void func_237_e()
    {
        float f = 0.1875F;
        float f1 = 0.125F;
        float f2 = 0.125F;
        func_213_a(0.5F - f, 0.5F - f1, 0.5F - f2, 0.5F + f, 0.5F + f1, 0.5F + f2);
    }
}
