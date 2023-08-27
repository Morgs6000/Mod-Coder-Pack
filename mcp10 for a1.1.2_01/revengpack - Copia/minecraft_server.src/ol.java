// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ol
{

    public int a;
    public int b;

    public ol(int i, int j)
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
        ol ol1 = (ol)obj;
        return ol1.a == a && ol1.b == b;
    }
}
