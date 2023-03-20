// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class nk extends java.lang.Thread
{

    final ii a;

    nk(ii ii1, java.lang.String s)
    {
        super(s);
        a = ii1;
    }

    public void run()
    {
        synchronized(ii.a)
        {
            ii.c++;
        }
	    try {
        for(; ii.a(a); ii.d(a));
	    }
	    finally {
        synchronized(ii.a)
        {
            ii.c--;
        }
	    }
    }
}
