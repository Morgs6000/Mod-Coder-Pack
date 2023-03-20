// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Comparator;

public class fb
    implements Comparator
{

    public fb(kh kh)
    {
        field_1594_a = kh;
    }

    public int func_1063_a(bn bn1, bn bn2)
    {
        return bn1.func_1202_a(field_1594_a) >= bn2.func_1202_a(field_1594_a) ? 1 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return func_1063_a((bn)obj, (bn)obj1);
    }

    private kh field_1594_a;
}
