// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class y extends bs
{

    private static ly aX[];
    private int aY;

    public y(int i, int j)
    {
        super(i, 2, j, aX);
        aY = j;
    }

    public boolean a(ly ly1)
    {
        if(ly1 == ly.aq)
            return aY == 3;
        if(ly1 == ly.ay || ly1 == ly.ax)
            return aY >= 2;
        if(ly1 == ly.ai || ly1 == ly.H)
            return aY >= 2;
        if(ly1 == ly.aj || ly1 == ly.I)
            return aY >= 1;
        if(ly1 == ly.aO || ly1 == ly.aP)
            return aY >= 2;
        if(ly1.bn == gb.d)
            return true;
        return ly1.bn == gb.e;
    }

    static 
    {
        aX = (new ly[] {
            ly.x, ly.ak, ly.al, ly.u, ly.ap, ly.I, ly.aj, ly.J, ly.ai, ly.H, 
            ly.ax, ly.ay, ly.aU
        });
    }
}
