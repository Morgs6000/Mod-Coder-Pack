// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class es extends ik
{

    public es()
    {
    }

    public boolean func_516_a(cn cn1, Random random, int i, int j, int k)
    {
        for(int l = 0; l < 20; l++)
        {
            int i1 = (i + random.nextInt(4)) - random.nextInt(4);
            int j1 = j;
            int k1 = (k + random.nextInt(4)) - random.nextInt(4);
            if(cn1.func_600_a(i1, j1, k1) != 0 || cn1.func_599_f(i1 - 1, j1 - 1, k1) != gb.field_1332_f && cn1.func_599_f(i1 + 1, j1 - 1, k1) != gb.field_1332_f && cn1.func_599_f(i1, j1 - 1, k1 - 1) != gb.field_1332_f && cn1.func_599_f(i1, j1 - 1, k1 + 1) != gb.field_1332_f)
            {
                continue;
            }
            int l1 = 2 + random.nextInt(random.nextInt(3) + 1);
            for(int i2 = 0; i2 < l1; i2++)
            {
                if(ly.field_423_aY.func_223_g(cn1, i1, j1 + i2, k1))
                {
                    cn1.func_634_a(i1, j1 + i2, k1, ly.field_423_aY.field_376_bc);
                }
            }

        }

        return true;
    }
}
