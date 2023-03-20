// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Comparator;

public class gl
    implements Comparator
{

    public gl(dm dm)
    {
        field_1521_a = dm;
    }

    public int func_993_a(bn bn1, bn bn2)
    {
        boolean flag = bn1.field_1749_o;
        boolean flag1 = bn2.field_1749_o;
        if(flag && !flag1)
        {
            return 1;
        }
        if(flag1 && !flag)
        {
            return -1;
        } else
        {
            return bn1.func_1202_a(field_1521_a) >= bn2.func_1202_a(field_1521_a) ? -1 : 1;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return func_993_a((bn)obj, (bn)obj1);
    }

    private dm field_1521_a;
}
