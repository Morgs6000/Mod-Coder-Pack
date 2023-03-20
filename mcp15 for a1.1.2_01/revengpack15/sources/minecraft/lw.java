// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class lw extends bh
{

    public lw(bh bh1, fr fr1)
    {
        field_954_a = "Controls";
        field_955_j = -1;
        field_957_h = bh1;
        field_956_i = fr1;
    }

    public void func_575_a()
    {
        for(int i = 0; i < field_956_i.field_1564_t.length; i++)
        {
            field_949_e.add(new o(i, (field_951_c / 2 - 155) + (i % 2) * 160, field_950_d / 6 + 24 * (i >> 1), field_956_i.func_1043_a(i)));
        }

        field_949_e.add(new fk(200, field_951_c / 2 - 100, field_950_d / 6 + 168, "Done"));
    }

    protected void func_572_a(fk fk1)
    {
        for(int i = 0; i < field_956_i.field_1564_t.length; i++)
        {
            ((fk)field_949_e.get(i)).field_939_e = field_956_i.func_1043_a(i);
        }

        if(fk1.field_938_f == 200)
        {
            field_945_b.func_128_a(field_957_h);
        } else
        {
            field_955_j = fk1.field_938_f;
            fk1.field_939_e = (new StringBuilder()).append("> ").append(field_956_i.func_1043_a(fk1.field_938_f)).append(" <").toString();
        }
    }

    protected void func_580_a(char c, int i)
    {
        if(field_955_j >= 0)
        {
            field_956_i.func_1042_a(field_955_j, i);
            ((fk)field_949_e.get(field_955_j)).field_939_e = field_956_i.func_1043_a(field_955_j);
            field_955_j = -1;
        } else
        {
            super.func_580_a(c, i);
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, field_954_a, field_951_c / 2, 20, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private bh field_957_h;
    protected String field_954_a;
    private fr field_956_i;
    private int field_955_j;
}
