// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class hs
    implements gh
{

    private java.lang.String a;
    private gh b;
    private gh c;

    public hs(java.lang.String s, gh gh1, gh gh2)
    {
        a = s;
        b = gh1;
        c = gh2;
    }

    public int c()
    {
        return b.c() + c.c();
    }

    public java.lang.String d()
    {
        return a;
    }

    public ev c(int i)
    {
        if(i >= b.c())
            return c.c(i - b.c());
        else
            return b.c(i);
    }

    public ev a(int i, int j)
    {
        if(i >= b.c())
            return c.a(i - b.c(), j);
        else
            return b.a(i, j);
    }

    public void a(int i, ev ev)
    {
        if(i >= b.c())
            c.a(i - b.c(), ev);
        else
            b.a(i, ev);
    }

    public int e()
    {
        return b.e();
    }

    public void j_()
    {
        b.j_();
        c.j_();
    }
}
