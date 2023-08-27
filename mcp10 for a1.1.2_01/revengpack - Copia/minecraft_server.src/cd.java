// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class cd
{

    private final a b[];
    public final int a;
    private int c;

    public cd(a aa[])
    {
        b = aa;
        a = aa.length;
    }

    public void a()
    {
        c++;
    }

    public boolean b()
    {
        return c >= b.length;
    }

    public aw a(dj dj1)
    {
        double d = (double)b[c].a + (double)(int)(dj1.D + 1.0F) * 0.5D;
        double d1 = b[c].b;
        double d2 = (double)b[c].c + (double)(int)(dj1.D + 1.0F) * 0.5D;
        return aw.b(d, d1, d2);
    }
}
