// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class jf
    implements Comparable
{

    public jf(int i, int j, int k, int l)
    {
        field_1362_g = field_1363_f++;
        field_1361_a = i;
        field_1360_b = j;
        field_1366_c = k;
        field_1365_d = l;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof jf)
        {
            jf jf1 = (jf)obj;
            return field_1361_a == jf1.field_1361_a && field_1360_b == jf1.field_1360_b && field_1366_c == jf1.field_1366_c && field_1365_d == jf1.field_1365_d;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return (field_1361_a * 128 * 1024 + field_1366_c * 128 + field_1360_b) * 256 + field_1365_d;
    }

    public jf func_900_a(long l)
    {
        field_1364_e = l;
        return this;
    }

    public int func_899_a(jf jf1)
    {
        if(field_1364_e < jf1.field_1364_e)
        {
            return -1;
        }
        if(field_1364_e > jf1.field_1364_e)
        {
            return 1;
        }
        if(field_1362_g < jf1.field_1362_g)
        {
            return -1;
        }
        return field_1362_g <= jf1.field_1362_g ? 0 : 1;
    }

    public int compareTo(Object obj)
    {
        return func_899_a((jf)obj);
    }

    private static long field_1363_f = 0L;
    public int field_1361_a;
    public int field_1360_b;
    public int field_1366_c;
    public int field_1365_d;
    public long field_1364_e;
    private long field_1362_g;

}
