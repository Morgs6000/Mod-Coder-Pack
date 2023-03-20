// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class a
{

    public a(int i, int j, int k)
    {
        field_1714_e = -1;
        field_1709_j = false;
        field_1718_a = i;
        field_1717_b = j;
        field_1716_c = k;
        field_1715_d = i | j << 10 | k << 20;
    }

    public float func_1180_a(a a1)
    {
        float f = a1.field_1718_a - field_1718_a;
        float f1 = a1.field_1717_b - field_1717_b;
        float f2 = a1.field_1716_c - field_1716_c;
        return eo.func_1113_c(f * f + f1 * f1 + f2 * f2);
    }

    public boolean equals(Object obj)
    {
        return ((a)obj).field_1715_d == field_1715_d;
    }

    public int hashCode()
    {
        return field_1715_d;
    }

    public boolean func_1179_a()
    {
        return field_1714_e >= 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(field_1718_a).append(", ").append(field_1717_b).append(", ").append(field_1716_c).toString();
    }

    public final int field_1718_a;
    public final int field_1717_b;
    public final int field_1716_c;
    public final int field_1715_d;
    int field_1714_e;
    float field_1713_f;
    float field_1712_g;
    float field_1711_h;
    a field_1710_i;
    public boolean field_1709_j;
}
