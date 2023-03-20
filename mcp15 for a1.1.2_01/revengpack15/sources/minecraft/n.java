// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class n extends ar
{

    public n(ev aev[])
    {
        field_1619_b = new mw();
        field_1620_a = new gu(this, aev);
        func_1103_a(field_1620_a);
    }

    public void func_1103_a(gh gh1)
    {
        int ai[] = new int[9];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int k = -1;
                if(i < 2 && j < 2)
                {
                    ev ev1 = field_1620_a.func_468_c(i + j * 2);
                    if(ev1 != null)
                    {
                        k = ev1.field_1617_c;
                    }
                }
                ai[i + j * 3] = k;
            }

        }

        field_1619_b.func_472_a(0, dw.func_1120_a().func_1119_a(ai));
    }

    public void func_1104_a(dm dm1)
    {
        super.func_1104_a(dm1);
        for(int i = 0; i < 9; i++)
        {
            ev ev1 = field_1620_a.func_468_c(i);
            if(ev1 != null)
            {
                dm1.func_449_a(ev1);
            }
        }

    }

    public gu field_1620_a;
    public gh field_1619_b;
}
