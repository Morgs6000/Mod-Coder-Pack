// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class cp extends ez
{

    private ff aX[];
    private float aY;
    private int aZ;
    protected int a;

    public cp(int i, int j, int k, ff aff[])
    {
        super(i);
        aY = 4F;
        a = k;
        aX = aff;
        aT = 1;
        aU = 32 << k;
        if(k == 3)
            aU *= 4;
        aY = (k + 1) * 2;
        aZ = j + k;
    }

    public float a(gp gp1, ff ff)
    {
        for(int i = 0; i < aX.length; i++)
            if(aX[i] == ff)
                return aY;

        return 1.0F;
    }

    public void a(gp gp1, int i, int j, int k, int l)
    {
        gp1.a(1);
    }
}
