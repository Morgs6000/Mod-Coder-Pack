// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class lj extends mm
{

    final int c;
    final lo d;

    lj(lo lo1, ee ee, gh gh, int i, int j, int k, int l)
    {
        d = lo1;
        c = l;
        super(ee, gh, i, j, k);
    }

    public boolean a(ev ev1)
    {
        if(ev1.a() instanceof mr)
            return ((mr)ev1.a()).aX == c;
        else
            return false;
    }

    public int c()
    {
        return 15 + c * 16;
    }
}
