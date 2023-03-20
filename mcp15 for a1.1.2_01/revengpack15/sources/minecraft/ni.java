// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class ni extends Thread
{

    ni(ii ii1, String s)
    {
        super(s);
        field_1085_a = ii1;
    }

    public void run()
    {
        synchronized(ii.field_1478_a)
        {
            ii.field_1477_b++;
        }
        try
        {
            for(; ii.func_971_a(field_1085_a) && !ii.func_968_b(field_1085_a); ii.func_966_c(field_1085_a)) { }
        }
        finally
        {
            synchronized(ii.field_1478_a)
            {
                ii.field_1477_b--;
            }
        }
    }

    final ii field_1085_a; /* synthetic field */
}
