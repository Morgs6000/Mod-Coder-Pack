// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class cv extends ly
{

    protected cv(int i, int j)
    {
        super(i, j, gb.field_1335_c);
    }

    public int func_218_a(int i)
    {
        return field_378_bb + (i != 1 ? 0 : 1);
    }

    public boolean func_250_a(cn cn1, int i, int j, int k, dm dm)
    {
        int l = cn1.func_602_e(i, j, k);
        if(l > 0)
        {
            func_317_e(cn1, i, j, k, l);
            return true;
        } else
        {
            return false;
        }
    }

    public void func_317_e(cn cn1, int i, int j, int k, int l)
    {
        cn1.func_670_a(null, i, j, k);
        cn1.func_691_b(i, j, k, 0);
        int i1 = (di.field_293_aQ.field_291_aS + l) - 1;
        float f = 0.7F;
        double d = (double)(cn1.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d1 = (double)(cn1.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.20000000000000001D + 0.59999999999999998D;
        double d2 = (double)(cn1.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        dx dx1 = new dx(cn1, (double)i + d, (double)j + d1, (double)k + d2, new ev(i1));
        dx1.field_805_c = 10;
        cn1.func_674_a(dx1);
    }

    public void func_216_a(cn cn1, int i, int j, int k, int l, float f)
    {
        if(cn1.field_1026_y)
        {
            return;
        }
        if(l > 0)
        {
            func_317_e(cn1, i, j, k, l);
        }
        super.func_216_a(cn1, i, j, k, l, f);
    }
}
