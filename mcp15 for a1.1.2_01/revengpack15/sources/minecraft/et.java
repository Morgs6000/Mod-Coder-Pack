// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class et extends ar
{

    public et()
    {
        field_1622_a = new gu(this, 3, 3);
        field_1621_b = new mw();
    }

    public void func_1103_a(gh gh1)
    {
        int ai[] = new int[9];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int k = i + j * 3;
                ev ev1 = field_1622_a.func_468_c(k);
                if(ev1 == null)
                {
                    ai[k] = -1;
                } else
                {
                    ai[k] = ev1.field_1617_c;
                }
            }

        }

        field_1621_b.func_472_a(0, dw.func_1120_a().func_1119_a(ai));
    }

    public void func_1104_a(dm dm1)
    {
        super.func_1104_a(dm1);
        for(int i = 0; i < 9; i++)
        {
            ev ev1 = field_1622_a.func_468_c(i);
            if(ev1 != null)
            {
                dm1.func_449_a(ev1);
            }
        }

    }

    public gu field_1622_a;
    public gh field_1621_b;
}
