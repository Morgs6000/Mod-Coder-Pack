// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ol
{

    public ol(int i, int j)
    {
        field_189_a = i;
        field_188_b = j;
    }

    public int hashCode()
    {
        return field_189_a << 8 | field_188_b;
    }

    public boolean equals(Object obj)
    {
        ol ol1 = (ol)obj;
        return ol1.field_189_a == field_189_a && ol1.field_188_b == field_188_b;
    }

    public int field_189_a;
    public int field_188_b;
}
