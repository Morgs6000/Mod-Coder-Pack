// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class nh extends java.lang.Thread
{

    final ii a;

    nh(ii ii1)
    {
        a = ii1;
        super();
    }

    public void run()
    {
        try
        {
            java.lang.Thread.sleep(5000L);
            if(ii.e(a).isAlive())
                try
                {
                    ii.e(a).stop();
                }
                catch(java.lang.Throwable throwable) { }
            if(ii.f(a).isAlive())
                try
                {
                    ii.f(a).stop();
                }
                catch(java.lang.Throwable throwable1) { }
        }
        catch(java.lang.InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }
}
