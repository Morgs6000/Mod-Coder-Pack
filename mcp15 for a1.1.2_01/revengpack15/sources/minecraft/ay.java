// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class ay extends bh
{

    public ay(bh bh1, fr fr1)
    {
        field_994_a = "Options";
        field_996_h = bh1;
        field_995_i = fr1;
    }

    public void func_575_a()
    {
        for(int i = 0; i < field_995_i.field_1562_v; i++)
        {
            int j = field_995_i.func_1046_b(i);
            if(j == 0)
            {
                field_949_e.add(new o(i, (field_951_c / 2 - 155) + (i % 2) * 160, field_950_d / 6 + 24 * (i >> 1), field_995_i.func_1047_d(i)));
            } else
            {
                field_949_e.add(new mo(i, (field_951_c / 2 - 155) + (i % 2) * 160, field_950_d / 6 + 24 * (i >> 1), i, field_995_i.func_1047_d(i), field_995_i.func_1049_c(i)));
            }
        }

        field_949_e.add(new fk(100, field_951_c / 2 - 100, field_950_d / 6 + 120 + 12, "Controls..."));
        field_949_e.add(new fk(200, field_951_c / 2 - 100, field_950_d / 6 + 168, "Done"));
    }

    protected void func_572_a(fk fk1)
    {
        if(!fk1.field_937_g)
        {
            return;
        }
        if(fk1.field_938_f < 100)
        {
            field_995_i.func_1045_b(fk1.field_938_f, 1);
            fk1.field_939_e = field_995_i.func_1047_d(fk1.field_938_f);
        }
        if(fk1.field_938_f == 100)
        {
            field_945_b.func_128_a(new lw(this, field_995_i));
        }
        if(fk1.field_938_f == 200)
        {
            field_945_b.func_128_a(field_996_h);
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, field_994_a, field_951_c / 2, 20, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private bh field_996_h;
    protected String field_994_a;
    private fr field_995_i;
}
