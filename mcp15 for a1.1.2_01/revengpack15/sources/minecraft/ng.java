// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ng extends ly
{

    protected ng(int i)
    {
        super(i, gb.field_1328_j);
        field_378_bb = 48;
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        byte byte0 = 2;
        for(int l = i - byte0; l <= i + byte0; l++)
        {
            for(int i1 = j - byte0; i1 <= j + byte0; i1++)
            {
                for(int j1 = k - byte0; j1 <= k + byte0; j1++)
                {
                    if(cn1.func_599_f(l, i1, j1) != gb.field_1332_f);
                }

            }

        }

    }

    public void func_214_b(cn cn1, int i, int j, int k)
    {
        byte byte0 = 2;
        for(int l = i - byte0; l <= i + byte0; l++)
        {
            for(int i1 = j - byte0; i1 <= j + byte0; i1++)
            {
                for(int j1 = k - byte0; j1 <= k + byte0; j1++)
                {
                    cn1.func_611_g(l, i1, j1, cn1.func_600_a(l, i1, j1));
                }

            }

        }

    }
}
