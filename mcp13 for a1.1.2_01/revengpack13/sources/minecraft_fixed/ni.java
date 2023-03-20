// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class ni extends java.lang.Thread
{

    final ii a;

    ni(ii ii1, java.lang.String s)
    {
        super(s);
        a = ii1;
    }

    public void run()
    {
        synchronized(ii.a)
        {
            ii.b++;
        }
	    try
        {
        for(; ii.a(a) && !ii.b(a); ii.c(a));
	    }
	    finally
        {
        synchronized(ii.a)
        {
            ii.b--;
        }
	    }
    }
}
