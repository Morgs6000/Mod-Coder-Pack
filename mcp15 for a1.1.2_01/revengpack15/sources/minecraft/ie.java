// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class ie extends bh
{

    public ie()
    {
        field_966_a = 0;
        field_967_h = 0;
    }

    public void func_575_a()
    {
        field_966_a = 0;
        field_949_e.clear();
        field_949_e.add(new fk(1, field_951_c / 2 - 100, field_950_d / 4 + 48, "Save and quit to title"));
        if(field_945_b.func_124_j())
        {
            ((fk)field_949_e.get(0)).field_939_e = "Disconnect";
        }
        field_949_e.add(new fk(4, field_951_c / 2 - 100, field_950_d / 4 + 24, "Back to game"));
        field_949_e.add(new fk(0, field_951_c / 2 - 100, field_950_d / 4 + 96, "Options..."));
    }

    protected void func_572_a(fk fk1)
    {
        if(fk1.field_938_f == 0)
        {
            field_945_b.func_128_a(new ay(this, field_945_b.field_160_y));
        }
        if(fk1.field_938_f == 1)
        {
            if(field_945_b.func_124_j())
            {
                field_945_b.field_180_e.func_660_k();
            }
            field_945_b.func_134_a(null);
            field_945_b.func_128_a(new cx());
        }
        if(fk1.field_938_f == 4)
        {
            field_945_b.func_128_a(null);
            field_945_b.func_123_e();
        }
    }

    public void func_570_g()
    {
        super.func_570_g();
        field_967_h++;
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        boolean flag = !field_945_b.field_180_e.func_650_a(field_966_a++);
        if(flag || field_967_h < 20)
        {
            float f1 = ((float)(field_967_h % 10) + f) / 10F;
            f1 = eo.func_1106_a(f1 * 3.141593F * 2.0F) * 0.2F + 0.8F;
            int k = (int)(255F * f1);
            func_547_b(field_947_g, "Saving level..", 8, field_950_d - 16, k << 16 | k << 8 | k);
        }
        func_548_a(field_947_g, "Game menu", field_951_c / 2, 40, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private int field_966_a;
    private int field_967_h;
}
