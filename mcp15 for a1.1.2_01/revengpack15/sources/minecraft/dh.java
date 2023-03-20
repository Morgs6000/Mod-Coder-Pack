// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class dh extends ly
{

    public dh(int i, int j)
    {
        super(i, j, gb.field_1325_m);
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        cn1.func_681_h(i, j, k, field_376_bc);
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        cn1.func_681_h(i, j, k, field_376_bc);
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        func_315_h(cn1, i, j, k);
    }

    private void func_315_h(cn cn1, int i, int j, int k)
    {
        int l = i;
        int i1 = j;
        int j1 = k;
        if(func_316_a_(cn1, l, i1 - 1, j1) && i1 >= 0)
        {
            ff ff1 = new ff(cn1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, field_376_bc);
            if(field_466_a)
            {
                while(!ff1.field_646_aA) 
                {
                    ff1.func_370_e_();
                }
            } else
            {
                cn1.func_674_a(ff1);
            }
        }
    }

    public int func_206_a()
    {
        return 3;
    }

    public static boolean func_316_a_(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_600_a(i, j, k);
        if(l == 0)
        {
            return true;
        }
        if(l == ly.field_402_as.field_376_bc)
        {
            return true;
        }
        gb gb1 = ly.field_345_n[l].field_356_bn;
        if(gb1 == gb.field_1332_f)
        {
            return true;
        }
        return gb1 == gb.field_1331_g;
    }

    public static boolean field_466_a = false;

}
