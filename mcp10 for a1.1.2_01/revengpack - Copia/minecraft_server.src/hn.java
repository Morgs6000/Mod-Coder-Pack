// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class hn extends java.lang.Thread
{

    final bb a;

    hn(bb bb1, java.lang.String s)
    {
        super(s);
        a = bb1;
    }

    public void run()
    {
        synchronized(bb.a)
        {
            bb.b++;
        }
	    try
        {
        for(; bb.a(a) && !bb.b(a); bb.c(a));
	    }
	    finally
        {
        synchronized(bb.a)
        {
            bb.b--;
        }
	    }
    }
}
