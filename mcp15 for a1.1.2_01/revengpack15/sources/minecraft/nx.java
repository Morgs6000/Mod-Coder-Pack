// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class nx extends di
{

    public nx(int i)
    {
        super(i);
        field_290_aT = 1;
        field_289_aU = 64;
    }

    public boolean func_192_a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        if(l == 0)
        {
            j--;
        }
        if(l == 1)
        {
            j++;
        }
        if(l == 2)
        {
            k--;
        }
        if(l == 3)
        {
            k++;
        }
        if(l == 4)
        {
            i--;
        }
        if(l == 5)
        {
            i++;
        }
        int i1 = cn1.func_600_a(i, j, k);
        if(i1 == 0)
        {
            cn1.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, field_234_b.nextFloat() * 0.4F + 0.8F);
            cn1.func_690_d(i, j, k, ly.field_402_as.field_376_bc);
        }
        ev1.func_1101_b(1);
        return true;
    }
}
