// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class nk extends Thread
{

    nk(ii ii1, String s)
    {
        super(s);
        field_1063_a = ii1;
    }

    public void run()
    {
        synchronized(ii.field_1478_a)
        {
            ii.field_1476_c++;
        }
        try
        {
            for(; ii.func_971_a(field_1063_a); ii.func_965_d(field_1063_a)) { }
        }
        finally
        {
            synchronized(ii.field_1478_a)
            {
                ii.field_1476_c--;
            }
        }
    }

    final ii field_1063_a; /* synthetic field */
}
