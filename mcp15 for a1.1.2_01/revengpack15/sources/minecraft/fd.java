// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class fd extends ly
{

    protected fd(int i, int j)
    {
        super(i, j, gb.field_1319_s);
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
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

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_600_a(i, j - 1, k);
        if(l == 0 || !ly.field_345_n[l].func_217_b())
        {
            return false;
        } else
        {
            return cn1.func_599_f(i, j - 1, k).func_880_c();
        }
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        func_314_h(cn1, i, j, k);
    }

    private boolean func_314_h(cn cn1, int i, int j, int k)
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

    public void func_220_a_(cn cn1, int i, int j, int k, int l)
    {
        int i1 = di.field_308_aB.field_291_aS;
        float f = 0.7F;
        double d = (double)(cn1.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d1 = (double)(cn1.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d2 = (double)(cn1.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        dx dx1 = new dx(cn1, (double)i + d, (double)j + d1, (double)k + d2, new ev(i1));
        dx1.field_805_c = 10;
        cn1.func_674_a(dx1);
        cn1.func_690_d(i, j, k, 0);
    }

    public int func_240_a(int i, Random random)
    {
        return di.field_308_aB.field_291_aS;
    }

    public int func_229_a(Random random)
    {
        return 0;
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        if(cn1.func_641_a(by.Block, i, j, k) > 11)
        {
            func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
            cn1.func_690_d(i, j, k, 0);
        }
    }

    public boolean func_260_c(nm nm1, int i, int j, int k, int l)
    {
        gb gb1 = nm1.func_599_f(i, j, k);
        if(l == 1)
        {
            return true;
        }
        if(gb1 == field_356_bn)
        {
            return false;
        } else
        {
            return super.func_260_c(nm1, i, j, k, l);
        }
    }
}
