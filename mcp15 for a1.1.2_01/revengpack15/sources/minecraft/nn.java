// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class nn extends ik
{

    public nn(int i)
    {
        field_865_a = i;
    }

    public boolean func_516_a(cn cn1, Random random, int i, int j, int k)
    {
        if(cn1.func_600_a(i, j + 1, k) != ly.field_338_u.field_376_bc)
        {
            return false;
        }
        if(cn1.func_600_a(i, j - 1, k) != ly.field_338_u.field_376_bc)
        {
            return false;
        }
        if(cn1.func_600_a(i, j, k) != 0 && cn1.func_600_a(i, j, k) != ly.field_338_u.field_376_bc)
        {
            return false;
        }
        int l = 0;
        if(cn1.func_600_a(i - 1, j, k) == ly.field_338_u.field_376_bc)
        {
            l++;
        }
        if(cn1.func_600_a(i + 1, j, k) == ly.field_338_u.field_376_bc)
        {
            l++;
        }
        if(cn1.func_600_a(i, j, k - 1) == ly.field_338_u.field_376_bc)
        {
            l++;
        }
        if(cn1.func_600_a(i, j, k + 1) == ly.field_338_u.field_376_bc)
        {
            l++;
        }
        int i1 = 0;
        if(cn1.func_600_a(i - 1, j, k) == 0)
        {
            i1++;
        }
        if(cn1.func_600_a(i + 1, j, k) == 0)
        {
            i1++;
        }
        if(cn1.func_600_a(i, j, k - 1) == 0)
        {
            i1++;
        }
        if(cn1.func_600_a(i, j, k + 1) == 0)
        {
            i1++;
        }
        if(l == 3 && i1 == 1)
        {
            cn1.func_690_d(i, j, k, field_865_a);
        }
        return true;
    }

    private int field_865_a;
}
