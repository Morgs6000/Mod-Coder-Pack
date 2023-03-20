// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class iy
{

    public iy(int i, int j)
    {
        field_1367_b = i;
        field_1369_c = j;
        for(field_1368_a = 1; field_1367_b / (field_1368_a + 1) >= 320 && field_1369_c / (field_1368_a + 1) >= 240; field_1368_a++) { }
        field_1367_b = field_1367_b / field_1368_a;
        field_1369_c = field_1369_c / field_1368_a;
    }

    public int func_903_a()
    {
        return field_1367_b;
    }

    public int func_902_b()
    {
        return field_1369_c;
    }

    private int field_1367_b;
    private int field_1369_c;
    public int field_1368_a;
}
