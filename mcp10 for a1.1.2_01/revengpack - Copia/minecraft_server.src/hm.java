// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class hm extends java.lang.Thread
{

    final bb a;

    hm(bb bb1)
    {
        super();
        a = bb1;
    }

    public void run()
    {
        try
        {
            java.lang.Thread.sleep(2000L);
            if(bb.a(a))
            {
                bb.f(a).interrupt();
                a.a("Connection closed");
            }
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
