// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class gq extends cp
{

    private static ff aX[];

    public gq(int i, int j)
    {
        super(i, 1, j, aX);
    }

    public boolean a(ff ff1)
    {
        if(ff1 == ff.aT)
            return true;
        return ff1 == ff.aV;
    }

    static 
    {
        aX = (new ff[] {
            ff.v, ff.w, ff.F, ff.G, ff.aT, ff.aV, ff.aX
        });
    }
}
