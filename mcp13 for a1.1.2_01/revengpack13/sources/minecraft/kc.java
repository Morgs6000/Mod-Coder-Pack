// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

class kc
{

    public double a;
    public double b;
    public double c;
    final cx d;

    public kc(cx cx1, int i, int j)
    {
        super();
        d = cx1;
        a = b = (double)(10 + j) + cx.j().nextDouble() * 32D + (double)i;
    }

    public void a()
    {
        b = a;
        if(a > 0.0D)
            c -= 0.59999999999999998D;
        a += c;
        c *= 0.90000000000000002D;
        if(a < 0.0D)
        {
            a = 0.0D;
            c = 0.0D;
        }
    }
}
