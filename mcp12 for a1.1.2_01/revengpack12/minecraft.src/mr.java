// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class mr extends di
{

    private static final int ba[] = {
        3, 8, 6, 3
    };
    private static final int bb[] = {
        11, 16, 15, 13
    };
    public final int a;
    public final int aX;
    public final int aY;
    public final int aZ;

    public mr(int i, int j, int k, int l)
    {
        super(i);
        a = j;
        aX = l;
        aZ = k;
        aY = ba[l];
        aU = bb[l] * 3 << j;
        aT = 1;
    }

}
