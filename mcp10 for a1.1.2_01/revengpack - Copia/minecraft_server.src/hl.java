// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class hl extends java.lang.Thread
{

    final bb a;

    hl(bb bb1)
    {
        super();
        a = bb1;
    }

    public void run()
    {
        try
        {
            java.lang.Thread.sleep(5000L);
            if(bb.e(a).isAlive())
                try
                {
                    bb.e(a).stop();
                }
                catch(java.lang.Throwable throwable) { }
            if(bb.f(a).isAlive())
                try
                {
                    bb.f(a).stop();
                }
                catch(java.lang.Throwable throwable1) { }
        }
        catch(java.lang.InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }
}
