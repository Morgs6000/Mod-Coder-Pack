// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ir
{

    public float a;
    private double f;
    public int b;
    public float c;
    public float d;
    public float e;
    private long g;
    private long h;
    private double i;

    public ir(float f1)
    {
        d = 1.0F;
        e = 0.0F;
        i = 1.0D;
        a = f1;
        g = java.lang.System.currentTimeMillis();
        h = java.lang.System.nanoTime() / 0xf4240L;
    }

    public void a()
    {
        long l = java.lang.System.currentTimeMillis();
        long l1 = l - g;
        long l2 = java.lang.System.nanoTime() / 0xf4240L;
        if(l1 > 1000L)
        {
            long l3 = l2 - h;
            double d2 = (double)l1 / (double)l3;
            i += (d2 - i) * 0.20000000298023224D;
            g = l;
            h = l2;
        }
        if(l1 < 0L)
        {
            g = l;
            h = l2;
        }
        double d1 = (double)l2 / 1000D;
        double d3 = (d1 - f) * i;
        f = d1;
        if(d3 < 0.0D)
            d3 = 0.0D;
        if(d3 > 1.0D)
            d3 = 1.0D;
        e += ((float) (d3 * (double)d * (double)a));
        b = (int)e;
        e -= b;
        if(b > 10)
            b = 10;
        c = e;
    }
}
