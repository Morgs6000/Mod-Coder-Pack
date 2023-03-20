// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class ho extends java.lang.Thread
{

    final bb a;

    ho(bb bb1, java.lang.String s)
    {
        super(s);
        a = bb1;
    }

    public void run()
    {
        synchronized(bb.a)
        {
            bb.c++;
        }
	    try
        {
        for(; bb.a(a); bb.d(a));
	    }
	    finally
        {
        synchronized(bb.a)
        {
            bb.c--;
        }
	    }
    }
}
