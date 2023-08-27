// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class lh extends java.lang.Thread
{

    final ad a;

    lh(ad ad1)
    {
        super();
        a = ad1;
    }

    public void run()
    {
        while(ad.a(a)) 
        {
            a.d();
            try
            {
                java.lang.Thread.sleep(1L);
            }
            catch(java.lang.Exception exception) { }
        }
    }
}
