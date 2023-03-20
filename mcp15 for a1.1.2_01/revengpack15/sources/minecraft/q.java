// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class q extends ly
{

    public q(int i, int j)
    {
        super(i, j, gb.field_1322_p);
    }

    public int func_218_a(int i)
    {
        if(i == 0)
        {
            return field_378_bb + 2;
        }
        if(i == 1)
        {
            return field_378_bb + 1;
        } else
        {
            return field_378_bb;
        }
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        if(l > 0 && ly.field_345_n[l].func_209_d() && cn1.func_625_o(i, j, k))
        {
            func_252_b(cn1, i, j, k, 0);
            cn1.func_690_d(i, j, k, 0);
        }
    }

    public int func_229_a(Random random)
    {
        return 0;
    }

    public void func_239_c(cn cn1, int i, int j, int k)
    {
        jd jd1 = new jd(cn1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
        jd1.field_689_a = cn1.field_1037_n.nextInt(jd1.field_689_a / 4) + jd1.field_689_a / 8;
        cn1.func_674_a(jd1);
    }

    public void func_252_b(cn cn1, int i, int j, int k, int l)
    {
        jd jd1 = new jd(cn1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
        cn1.func_674_a(jd1);
        cn1.func_623_a(jd1, "random.fuse", 1.0F, 1.0F);
    }
}
