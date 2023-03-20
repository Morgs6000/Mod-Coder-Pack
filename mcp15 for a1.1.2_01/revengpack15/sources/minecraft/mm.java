// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class mm extends dk
{

    public mm(ee ee1, gh gh, int i, int j, int k)
    {
        super(gh, i);
        field_1122_c = ee1;
        field_1121_e = j;
        field_1120_f = k;
    }

    public boolean func_781_a(int i, int j)
    {
        int k = (field_1122_c.field_951_c - field_1122_c.field_971_a) / 2;
        int l = (field_1122_c.field_950_d - field_1122_c.field_974_h) / 2;
        i -= k;
        j -= l;
        return i >= field_1121_e - 1 && i < field_1121_e + 16 + 1 && j >= field_1120_f - 1 && j < field_1120_f + 16 + 1;
    }

    private final ee field_1122_c;
    public final int field_1121_e;
    public final int field_1120_f;
}
