// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class fe extends ic
    implements gh
{

    public fe()
    {
        field_827_a = new ev[36];
    }

    public int func_469_c()
    {
        return 27;
    }

    public ev func_468_c(int i)
    {
        return field_827_a[i];
    }

    public ev func_473_a(int i, int j)
    {
        if(field_827_a[i] != null)
        {
            if(field_827_a[i].field_1615_a <= j)
            {
                ev ev1 = field_827_a[i];
                field_827_a[i] = null;
                func_474_j_();
                return ev1;
            }
            ev ev2 = field_827_a[i].func_1085_a(j);
            if(field_827_a[i].field_1615_a == 0)
            {
                field_827_a[i] = null;
            }
            func_474_j_();
            return ev2;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ev ev1)
    {
        field_827_a[i] = ev1;
        if(ev1 != null && ev1.field_1615_a > func_470_e())
        {
            ev1.field_1615_a = func_470_e();
        }
        func_474_j_();
    }

    public String func_471_d()
    {
        return "Chest";
    }

    public void func_482_a(hm hm1)
    {
        super.func_482_a(hm1);
        ki ki1 = hm1.func_753_l("Items");
        field_827_a = new ev[func_469_c()];
        for(int i = 0; i < ki1.func_740_c(); i++)
        {
            hm hm2 = (hm)ki1.func_741_a(i);
            int j = hm2.func_746_c("Slot") & 0xff;
            if(j >= 0 && j < field_827_a.length)
            {
                field_827_a[j] = new ev(hm2);
            }
        }

    }

    public void func_481_b(hm hm1)
    {
        super.func_481_b(hm1);
        ki ki1 = new ki();
        for(int i = 0; i < field_827_a.length; i++)
        {
            if(field_827_a[i] != null)
            {
                hm hm2 = new hm();
                hm2.func_761_a("Slot", (byte)i);
                field_827_a[i].func_1086_a(hm2);
                ki1.func_742_a(hm2);
            }
        }

        hm1.func_762_a("Items", ki1);
    }

    public int func_470_e()
    {
        return 64;
    }

    private ev field_827_a[];
}
