// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


final class ir
{

    public final int a;
    public final int b;

    public ir(int i, int j)
    {
        a = i;
        b = j;
    }

    public boolean equals(java.lang.Object obj)
    {
        if(obj instanceof ir)
        {
            ir ir1 = (ir)obj;
            return a == ir1.a && b == ir1.b;
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
