// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class al extends cp
{

    private static ff aX[];
    private int aY;

    public al(int i, int j)
    {
        super(i, 2, j, aX);
        aY = j;
    }

    public boolean a(ff ff1)
    {
        if(ff1 == ff.aq)
            return aY == 3;
        if(ff1 == ff.ay || ff1 == ff.ax)
            return aY >= 2;
        if(ff1 == ff.ai || ff1 == ff.H)
            return aY >= 2;
        if(ff1 == ff.aj || ff1 == ff.I)
            return aY >= 1;
        if(ff1 == ff.aO || ff1 == ff.aP)
            return aY >= 2;
        if(ff1.bn == iq.d)
            return true;
        return ff1.bn == iq.e;
    }

    static 
    {
        aX = (new ff[] {
            ff.x, ff.ak, ff.al, ff.u, ff.ap, ff.I, ff.aj, ff.J, ff.ai, ff.H, 
            ff.ax, ff.ay, ff.aU
        });
    }
}
