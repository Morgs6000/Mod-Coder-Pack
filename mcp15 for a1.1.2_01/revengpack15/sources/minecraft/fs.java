// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Comparator;

class fs
    implements Comparator
{

    fs(dw dw1)
    {
        super();
        field_1557_a = dw1;
    }

    public int func_1040_a(bv bv1, bv bv2)
    {
        if(bv2.func_1184_a() < bv1.func_1184_a())
        {
            return -1;
        }
        return bv2.func_1184_a() <= bv1.func_1184_a() ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return func_1040_a((bv)obj, (bv)obj1);
    }

    final dw field_1557_a; /* synthetic field */
}
