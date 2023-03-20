// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class nh extends Thread
{

    nh(ii ii1)
    {
        super();
        field_1086_a = ii1;
    }

    public void run()
    {
        try
        {
            Thread.sleep(5000L);
            if(ii.func_969_e(field_1086_a).isAlive())
            {
                try
                {
                    ii.func_969_e(field_1086_a).stop();
                }
                catch(Throwable throwable) { }
            }
            if(ii.func_963_f(field_1086_a).isAlive())
            {
                try
                {
                    ii.func_963_f(field_1086_a).stop();
                }
                catch(Throwable throwable1) { }
            }
        }
        catch(InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }

    final ii field_1086_a; /* synthetic field */
}
