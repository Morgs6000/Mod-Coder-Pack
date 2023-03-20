// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class hs
    implements gh
{

    public hs(String s, gh gh1, gh gh2)
    {
        field_837_a = s;
        field_836_b = gh1;
        field_838_c = gh2;
    }

    public int func_469_c()
    {
        return field_836_b.func_469_c() + field_838_c.func_469_c();
    }

    public String func_471_d()
    {
        return field_837_a;
    }

    public ev func_468_c(int i)
    {
        if(i >= field_836_b.func_469_c())
        {
            return field_838_c.func_468_c(i - field_836_b.func_469_c());
        } else
        {
            return field_836_b.func_468_c(i);
        }
    }

    public ev func_473_a(int i, int j)
    {
        if(i >= field_836_b.func_469_c())
        {
            return field_838_c.func_473_a(i - field_836_b.func_469_c(), j);
        } else
        {
            return field_836_b.func_473_a(i, j);
        }
    }

    public void func_472_a(int i, ev ev)
    {
        if(i >= field_836_b.func_469_c())
        {
            field_838_c.func_472_a(i - field_836_b.func_469_c(), ev);
        } else
        {
            field_836_b.func_472_a(i, ev);
        }
    }

    public int func_470_e()
    {
        return field_836_b.func_470_e();
    }

    public void func_474_j_()
    {
        field_836_b.func_474_j_();
        field_838_c.func_474_j_();
    }

    private String field_837_a;
    private gh field_836_b;
    private gh field_838_c;
}
