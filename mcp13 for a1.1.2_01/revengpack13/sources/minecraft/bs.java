// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class bs extends di
{

    private ly aX[];
    private float aY;
    private int aZ;
    protected int a;

    public bs(int i, int j, int k, ly aly[])
    {
        super(i);
        aY = 4F;
        a = k;
        aX = aly;
        aT = 1;
        aU = 32 << k;
        if(k == 3)
            aU *= 4;
        aY = (k + 1) * 2;
        aZ = j + k;
    }

    public float a(ev ev1, ly ly)
    {
        for(int i = 0; i < aX.length; i++)
            if(aX[i] == ly)
                return aY;

        return 1.0F;
    }

    public void a(ev ev1, ge ge)
    {
        ev1.b(2);
    }

    public void a(ev ev1, int i, int j, int k, int l)
    {
        ev1.b(1);
    }

    public int a(kh kh)
    {
        return aZ;
    }

    public boolean a()
    {
        return true;
    }
}
