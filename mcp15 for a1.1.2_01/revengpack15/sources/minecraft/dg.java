// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;

public class dg extends bh
{

    public dg(gy gy1)
    {
        field_984_h = 0;
        field_983_a = gy1;
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_575_a()
    {
        field_949_e.clear();
    }

    public void func_570_g()
    {
        field_984_h++;
        if(field_984_h % 20 == 0)
        {
            field_983_a.func_847_a(new gi());
        }
        if(field_983_a != null)
        {
            field_983_a.func_848_a();
        }
    }

    protected void func_572_a(fk fk)
    {
    }

    public void func_571_a(int i, int j, float f)
    {
        func_579_b(0);
        func_548_a(field_947_g, "Downloading terrain", field_951_c / 2, field_950_d / 2 - 50, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private gy field_983_a;
    private int field_984_h;
}
