// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class cj extends bh
{

    public cj(String s, String s1)
    {
        field_992_a = s;
        field_993_h = s1;
    }

    public void func_570_g()
    {
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_575_a()
    {
        field_949_e.clear();
        field_949_e.add(new fk(0, field_951_c / 2 - 100, field_950_d / 4 + 120 + 12, "Back to title screen"));
    }

    protected void func_572_a(fk fk1)
    {
        if(fk1.field_938_f == 0)
        {
            field_945_b.func_128_a(new cx());
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, field_992_a, field_951_c / 2, field_950_d / 2 - 50, 0xffffff);
        func_548_a(field_947_g, field_993_h, field_951_c / 2, field_950_d / 2 - 10, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private String field_992_a;
    private String field_993_h;
}
