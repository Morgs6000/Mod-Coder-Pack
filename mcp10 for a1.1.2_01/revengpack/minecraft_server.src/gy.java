// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class gy extends ff
{

    private boolean a;

    protected gy(int i, int j, iq iq, boolean flag)
    {
        super(i, j, iq);
        a = flag;
    }

    public boolean b()
    {
        return false;
    }

    public boolean a(hq hq1, int i, int j, int k, int l)
    {
        int i1 = hq1.a(i, j, k);
        if(!a && i1 == bc)
            return false;
        else
            return super.a(hq1, i, j, k, l);
    }
}
