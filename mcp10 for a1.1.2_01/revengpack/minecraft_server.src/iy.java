// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class iy
{

    public int a;
    public int b;

    public iy(int i, int j)
    {
        a = i;
        b = j;
    }

    public int hashCode()
    {
        return a << 8 | b;
    }

    public boolean equals(java.lang.Object obj)
    {
        iy iy1 = (iy)obj;
        return iy1.a == a && iy1.b == b;
    }

    public double a(dj dj1)
    {
        double d = a * 16 + 8;
        double d1 = b * 16 + 8;
        double d2 = d - dj1.l;
        double d3 = d1 - dj1.n;
        return d2 * d2 + d3 * d3;
    }
}
