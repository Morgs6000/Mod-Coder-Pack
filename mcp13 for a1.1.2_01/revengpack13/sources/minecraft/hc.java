// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


final class hc
{

    public final int a;
    public final int b;

    public hc(int i, int j)
    {
        a = i;
        b = j;
    }

    public boolean equals(java.lang.Object obj)
    {
        if(obj instanceof hc)
        {
            hc hc1 = (hc)obj;
            return a == hc1.a && b == hc1.b;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a << 16 ^ b;
    }
}
