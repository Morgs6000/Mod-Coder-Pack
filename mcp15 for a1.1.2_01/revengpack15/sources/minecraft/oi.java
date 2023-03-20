// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class oi extends ly
{

    public oi(int i, boolean flag)
    {
        super(i, 6, gb.field_1334_d);
        field_469_a = flag;
        if(!flag)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        }
        func_256_d(255);
    }

    public int func_218_a(int i)
    {
        return i > 1 ? 5 : 6;
    }

    public boolean func_217_b()
    {
        return field_469_a;
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        if(this != ly.field_410_al)
        {
            return;
        } else
        {
            return;
        }
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        if(this != ly.field_410_al)
        {
            super.func_235_e(cn1, i, j, k);
        }
        int l = cn1.func_600_a(i, j - 1, k);
        if(l == field_410_al.field_376_bc)
        {
            cn1.func_690_d(i, j, k, 0);
            cn1.func_690_d(i, j - 1, k, ly.field_411_ak.field_376_bc);
        }
    }

    public int func_240_a(int i, Random random)
    {
        return ly.field_410_al.field_376_bc;
    }

    public boolean func_242_c()
    {
        return field_469_a;
    }

    public boolean func_260_c(nm nm1, int i, int j, int k, int l)
    {
        if(this != ly.field_410_al)
        {
            super.func_260_c(nm1, i, j, k, l);
        }
        if(l == 1)
        {
            return true;
        }
        if(!super.func_260_c(nm1, i, j, k, l))
        {
            return false;
        }
        if(l == 0)
        {
            return true;
        } else
        {
            return nm1.func_600_a(i, j, k) != field_376_bc;
        }
    }

    private boolean field_469_a;
}
