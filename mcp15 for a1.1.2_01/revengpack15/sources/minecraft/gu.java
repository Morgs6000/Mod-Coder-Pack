// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class gu
    implements gh
{

    public gu(ar ar1, int i, int j)
    {
        field_839_b = i * j;
        field_840_a = new ev[field_839_b];
        field_841_c = ar1;
    }

    public gu(ar ar1, ev aev[])
    {
        field_839_b = aev.length;
        field_840_a = aev;
        field_841_c = ar1;
    }

    public int func_469_c()
    {
        return field_839_b;
    }

    public ev func_468_c(int i)
    {
        return field_840_a[i];
    }

    public String func_471_d()
    {
        return "Crafting";
    }

    public ev func_473_a(int i, int j)
    {
        if(field_840_a[i] != null)
        {
            if(field_840_a[i].field_1615_a <= j)
            {
                ev ev1 = field_840_a[i];
                field_840_a[i] = null;
                field_841_c.func_1103_a(this);
                return ev1;
            }
            ev ev2 = field_840_a[i].func_1085_a(j);
            if(field_840_a[i].field_1615_a == 0)
            {
                field_840_a[i] = null;
            }
            field_841_c.func_1103_a(this);
            return ev2;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ev ev1)
    {
        field_840_a[i] = ev1;
        field_841_c.func_1103_a(this);
    }

    public int func_470_e()
    {
        return 64;
    }

    public void func_474_j_()
    {
    }

    private ev field_840_a[];
    private int field_839_b;
    private ar field_841_c;
}
