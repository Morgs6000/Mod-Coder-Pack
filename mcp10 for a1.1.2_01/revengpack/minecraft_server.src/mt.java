// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class mt
{

    public final int a;
    public final int b;
    public final int c;

    public mt(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public boolean equals(java.lang.Object obj)
    {
        if(obj instanceof mt)
        {
            mt mt1 = (mt)obj;
            return mt1.a == a && mt1.b == b && mt1.c == c;
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
