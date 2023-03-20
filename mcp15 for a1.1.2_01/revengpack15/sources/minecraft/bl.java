// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class bl
{

    public bl(a aa[])
    {
        field_1764_b = aa;
        field_1765_a = aa.length;
    }

    public void func_1206_a()
    {
        field_1766_c++;
    }

    public boolean func_1207_b()
    {
        return field_1766_c >= field_1764_b.length;
    }

    public aj func_1205_a(kh kh1)
    {
        double d = (double)field_1764_b[field_1766_c].field_1718_a + (double)(int)(kh1.field_644_aC + 1.0F) * 0.5D;
        double d1 = field_1764_b[field_1766_c].field_1717_b;
        double d2 = (double)field_1764_b[field_1766_c].field_1716_c + (double)(int)(kh1.field_644_aC + 1.0F) * 0.5D;
        return aj.func_1248_b(d, d1, d2);
    }

    private final a field_1764_b[];
    public final int field_1765_a;
    private int field_1766_c;
}
