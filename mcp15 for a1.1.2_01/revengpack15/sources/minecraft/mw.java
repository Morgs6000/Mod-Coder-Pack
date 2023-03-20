// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class mw
    implements gh
{

    public mw()
    {
        field_818_a = new ev[1];
    }

    public int func_469_c()
    {
        return 1;
    }

    public ev func_468_c(int i)
    {
        return field_818_a[i];
    }

    public String func_471_d()
    {
        return "Result";
    }

    public ev func_473_a(int i, int j)
    {
        if(field_818_a[i] != null)
        {
            ev ev1 = field_818_a[i];
            field_818_a[i] = null;
            return ev1;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ev ev1)
    {
        field_818_a[i] = ev1;
    }

    public int func_470_e()
    {
        return 64;
    }

    public void func_474_j_()
    {
    }

    private ev field_818_a[];
}
