// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class bv
    implements java.lang.Comparable
{

    private static long f = 0L;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    private long g;

    public bv(int i, int j, int k, int l)
    {
        g = f++;
        a = i;
        b = j;
        c = k;
        d = l;
    }

    public boolean equals(java.lang.Object obj)
    {
        if(obj instanceof bv)
        {
            bv bv1 = (bv)obj;
            return a == bv1.a && b == bv1.b && c == bv1.c && d == bv1.d;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return (a * 128 * 1024 + c * 128 + b) * 256 + d;
    }

    public bv a(long l)
    {
        e = l;
        return this;
    }

    public int a(bv bv1)
    {
        if(e < bv1.e)
            return -1;
        if(e > bv1.e)
            return 1;
        if(g < bv1.g)
            return -1;
        return g <= bv1.g ? 0 : 1;
    }

    public int compareTo(java.lang.Object obj)
    {
        return a((bv)obj);
    }

}
