// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;

public class fh extends ly
{

    public fh(int i, int j)
    {
        super(i, j, gb.field_1335_c);
    }

    public void func_230_a(cn cn1, int i, int j, int k, cf cf1, ArrayList arraylist)
    {
        arraylist.add(cf.func_1161_b(i, j, k, i + 1, (double)j + 1.5D, k + 1));
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        if(cn1.func_600_a(i, j - 1, k) == field_376_bc)
        {
            return false;
        }
        if(!cn1.func_599_f(i, j - 1, k).func_878_a())
        {
            return false;
        } else
        {
            return super.func_243_a(cn1, i, j, k);
        }
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 11;
    }
}
