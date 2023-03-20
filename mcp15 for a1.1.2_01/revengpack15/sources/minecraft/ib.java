// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class ib extends jq
{

    public ib(bh bh)
    {
        super(bh);
        field_960_h = "Delete world";
    }

    public void func_585_j()
    {
        field_949_e.add(new fk(6, field_951_c / 2 - 100, field_950_d / 6 + 168, "Cancel"));
    }

    public void func_584_c(int i)
    {
        String s = func_586_d(i);
        if(s != null)
        {
            field_945_b.func_128_a(new ja(this, "Are you sure you want to delete this world?", (new StringBuilder()).append("'").append(s).append("' will be lost forever!").toString(), i));
        }
    }

    public void func_568_a(boolean flag, int i)
    {
        if(flag)
        {
            java.io.File file = Minecraft.func_106_b();
            cn.func_615_b(file, func_586_d(i));
        }
        field_945_b.func_128_a(field_958_a);
    }
}
