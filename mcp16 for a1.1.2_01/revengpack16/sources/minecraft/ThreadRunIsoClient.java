// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class ThreadRunIsoClient extends Thread
{

    ThreadRunIsoClient(IsoListener isolistener)
    {
        field_1197_a = isolistener;
    }

    public void run()
    {
        while(IsoListener.func_1271_a(field_1197_a)) 
        {
            field_1197_a.func_1265_d();
            try
            {
                Thread.sleep(1L);
            }
            catch(Exception exception) { }
        }
    }

    final IsoListener field_1197_a; /* synthetic field */
}
