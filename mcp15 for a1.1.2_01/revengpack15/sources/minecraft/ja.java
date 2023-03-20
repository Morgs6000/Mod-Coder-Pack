// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;

public class ja extends bh
{

    public ja(bh bh1, String s, String s1, int i)
    {
        field_961_a = bh1;
        field_964_h = s;
        field_963_i = s1;
        field_962_j = i;
    }

    public void func_575_a()
    {
        field_949_e.add(new o(0, (field_951_c / 2 - 155) + 0, field_950_d / 6 + 96, "Yes"));
        field_949_e.add(new o(1, (field_951_c / 2 - 155) + 160, field_950_d / 6 + 96, "No"));
    }

    protected void func_572_a(fk fk1)
    {
        field_961_a.func_568_a(fk1.field_938_f == 0, field_962_j);
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, field_964_h, field_951_c / 2, 70, 0xffffff);
        func_548_a(field_947_g, field_963_i, field_951_c / 2, 90, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private bh field_961_a;
    private String field_964_h;
    private String field_963_i;
    private int field_962_j;
}
