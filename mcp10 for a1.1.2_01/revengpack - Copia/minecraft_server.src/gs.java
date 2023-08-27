// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class gs
{

    public final int a;
    public final int b;
    public final int c;

    public gs(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public boolean equals(java.lang.Object obj)
    {
        if(obj instanceof gs)
        {
            gs gs1 = (gs)obj;
            return gs1.a == a && gs1.b == b && gs1.c == c;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a * 0x88f9fa + b * 0xef88b + c;
    }
}
