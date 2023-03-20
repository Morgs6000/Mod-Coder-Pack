// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class dt extends mq
{

    protected dt(int i, int j)
    {
        super(i, j);
        float f = 0.4F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        super.func_208_a(cn1, i, j, k, random);
        if(cn1.func_618_j(i, j + 1, k) >= 9 && random.nextInt(5) == 0)
        {
            int l = cn1.func_602_e(i, j, k);
            if(l < 15)
            {
                cn1.func_691_b(i, j, k, l + 1);
            } else
            {
                cn1.func_634_a(i, j, k, 0);
                Object obj = new oa();
                if(random.nextInt(10) == 0)
                {
                    obj = new ej();
                }
                if(!((ik) (obj)).func_516_a(cn1, random, i, j, k))
                {
                    cn1.func_634_a(i, j, k, field_376_bc);
                }
            }
        }
    }
}
