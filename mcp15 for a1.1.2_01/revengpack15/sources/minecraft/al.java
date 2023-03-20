// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class al extends ly
{

    protected al(int i, int j, js js1)
    {
        super(i, j, gb.field_1334_d);
        field_467_a = js1;
        func_253_b(true);
        float f = 0.0625F;
        func_213_a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
    }

    public int func_206_a()
    {
        return 20;
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

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        return cn1.func_601_g(i, j - 1, k);
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        boolean flag = false;
        if(!cn1.func_601_g(i, j - 1, k))
        {
            flag = true;
        }
        if(flag)
        {
            func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
            cn1.func_690_d(i, j, k, 0);
        }
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        if(cn1.func_602_e(i, j, k) == 0)
        {
            return;
        } else
        {
            func_318_h(cn1, i, j, k);
            return;
        }
    }

    public void func_236_b(cn cn1, int i, int j, int k, kh kh)
    {
        if(cn1.func_602_e(i, j, k) == 1)
        {
            return;
        } else
        {
            func_318_h(cn1, i, j, k);
            return;
        }
    }

    private void func_318_h(cn cn1, int i, int j, int k)
    {
        boolean flag = cn1.func_602_e(i, j, k) == 1;
        boolean flag1 = false;
        float f = 0.125F;
        List list = null;
        if(field_467_a == js.everything)
        {
            list = cn1.func_659_b(null, cf.func_1161_b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (double)j + 0.25D, (float)(k + 1) - f));
        }
        if(field_467_a == js.mobs)
        {
            list = cn1.func_657_a(ge.class, cf.func_1161_b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (double)j + 0.25D, (float)(k + 1) - f));
        }
        if(field_467_a == js.players)
        {
            list = cn1.func_657_a(dm.class, cf.func_1161_b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (double)j + 0.25D, (float)(k + 1) - f));
        }
        if(list.size() > 0)
        {
            flag1 = true;
        }
        if(flag1 && !flag)
        {
            cn1.func_691_b(i, j, k, 1);
            cn1.func_611_g(i, j, k, field_376_bc);
            cn1.func_611_g(i, j - 1, k, field_376_bc);
            cn1.func_701_b(i, j, k, i, j, k);
            cn1.func_684_a((double)i + 0.5D, (double)j + 0.10000000000000001D, (double)k + 0.5D, "random.click", 0.3F, 0.6F);
        }
        if(!flag1 && flag)
        {
            cn1.func_691_b(i, j, k, 0);
            cn1.func_611_g(i, j, k, field_376_bc);
            cn1.func_611_g(i, j - 1, k, field_376_bc);
            cn1.func_701_b(i, j, k, i, j, k);
            cn1.func_684_a((double)i + 0.5D, (double)j + 0.10000000000000001D, (double)k + 0.5D, "random.click", 0.3F, 0.5F);
        }
        if(flag1)
        {
            cn1.func_681_h(i, j, k, field_376_bc);
        }
    }

    public void func_214_b(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_602_e(i, j, k);
        if(l > 0)
        {
            cn1.func_611_g(i, j, k, field_376_bc);
            cn1.func_611_g(i, j - 1, k, field_376_bc);
        }
        super.func_214_b(cn1, i, j, k);
    }

    public void func_238_a(nm nm1, int i, int j, int k)
    {
        boolean flag = nm1.func_602_e(i, j, k) == 1;
        float f = 0.0625F;
        if(flag)
        {
            func_213_a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
        } else
        {
            func_213_a(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
        }
    }

    public boolean func_231_b(nm nm1, int i, int j, int k, int l)
    {
        return nm1.func_602_e(i, j, k) > 0;
    }

    public boolean func_228_c(cn cn1, int i, int j, int k, int l)
    {
        if(cn1.func_602_e(i, j, k) == 0)
        {
            return false;
        } else
        {
            return l == 1;
        }
    }

    public boolean func_209_d()
    {
        return true;
    }

    public void func_237_e()
    {
        float f = 0.5F;
        float f1 = 0.125F;
        float f2 = 0.5F;
        func_213_a(0.5F - f, 0.5F - f1, 0.5F - f2, 0.5F + f, 0.5F + f1, 0.5F + f2);
    }

    private js field_467_a;
}
