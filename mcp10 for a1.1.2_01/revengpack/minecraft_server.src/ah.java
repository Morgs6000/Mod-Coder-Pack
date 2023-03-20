// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ah
    implements iw
{

    private java.lang.String a;
    private iw b;
    private iw c;

    public ah(java.lang.String s, iw iw1, iw iw2)
    {
        a = s;
        b = iw1;
        c = iw2;
    }

    public int a()
    {
        return b.a() + c.a();
    }

    public gp a(int i)
    {
        if(i >= b.a())
            return c.a(i - b.a());
        else
            return b.a(i);
    }
}
