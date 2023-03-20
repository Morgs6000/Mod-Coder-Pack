// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class nk extends java.lang.Thread
{

    final ii a;

    nk(ii ii1, java.lang.String s)
    {
        a = ii1;
        super(s);
    }

    public void run()
    {
        synchronized(ii.a)
        {
            ii.c++;
        }
        for(; ii.a(a); ii.d(a));
        synchronized(ii.a)
        {
            ii.c--;
        }
        break MISSING_BLOCK_LABEL_105;
        java.lang.Exception exception2;
        exception2;
        synchronized(ii.a)
        {
            ii.c--;
        }
        throw exception2;
    }
}
