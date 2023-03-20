// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class mn extends bh
{

    public mn(Minecraft minecraft, String s, int i)
    {
        field_953_h = false;
        minecraft.func_134_a(null);
        (new nc(this, minecraft, s, i)).start();
    }

    public void func_570_g()
    {
        if(field_952_a != null)
        {
            field_952_a.func_848_a();
        }
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_575_a()
    {
        field_949_e.clear();
        field_949_e.add(new fk(0, field_951_c / 2 - 100, field_950_d / 4 + 120 + 12, "Cancel"));
    }

    protected void func_572_a(fk fk1)
    {
        if(fk1.field_938_f == 0)
        {
            field_953_h = true;
            if(field_952_a != null)
            {
                field_952_a.func_849_b();
            }
            field_945_b.func_128_a(new cx());
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        if(field_952_a == null)
        {
            func_548_a(field_947_g, "Connecting to the server...", field_951_c / 2, field_950_d / 2 - 50, 0xffffff);
            func_548_a(field_947_g, "", field_951_c / 2, field_950_d / 2 - 10, 0xffffff);
        } else
        {
            func_548_a(field_947_g, "Logging in...", field_951_c / 2, field_950_d / 2 - 50, 0xffffff);
            func_548_a(field_947_g, field_952_a.field_1209_a, field_951_c / 2, field_950_d / 2 - 10, 0xffffff);
        }
        super.func_571_a(i, j, f);
    }

    static gy func_582_a(mn mn1, gy gy1)
    {
        return mn1.field_952_a = gy1;
    }

    static boolean func_581_a(mn mn1)
    {
        return mn1.field_953_h;
    }

    static gy func_583_b(mn mn1)
    {
        return mn1.field_952_a;
    }

    private gy field_952_a;
    private boolean field_953_h;
}
