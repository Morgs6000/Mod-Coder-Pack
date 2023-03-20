// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class ni extends java.lang.Thread
{

    final ii a;

    ni(ii ii1, java.lang.String s)
    {
        a = ii1;
        super(s);
    }

    public void run()
    {
        synchronized(ii.a)
        {
            ii.b++;
        }
        for(; ii.a(a) && !ii.b(a); ii.c(a));
        synchronized(ii.a)
        {
            ii.b--;
        }
        break MISSING_BLOCK_LABEL_115;
        java.lang.Exception exception2;
        exception2;
        synchronized(ii.a)
        {
            ii.b--;
        }
        throw exception2;
    }
}
