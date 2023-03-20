// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class jq extends bh
{

    public jq(bh bh1)
    {
        field_960_h = "Select world";
        field_959_i = false;
        field_958_a = bh1;
    }

    public void func_575_a()
    {
        java.io.File file = Minecraft.func_106_b();
        for(int i = 0; i < 5; i++)
        {
            hm hm1 = cn.func_629_a(file, (new StringBuilder()).append("World").append(i + 1).toString());
            if(hm1 == null)
            {
                field_949_e.add(new fk(i, field_951_c / 2 - 100, field_950_d / 6 + 24 * i, "- empty -"));
            } else
            {
                String s = (new StringBuilder()).append("World ").append(i + 1).toString();
                long l = hm1.func_764_f("SizeOnDisk");
                s = (new StringBuilder()).append(s).append(" (").append((float)(((l / 1024L) * 100L) / 1024L) / 100F).append(" MB)").toString();
                field_949_e.add(new fk(i, field_951_c / 2 - 100, field_950_d / 6 + 24 * i, s));
            }
        }

        func_585_j();
    }

    protected String func_586_d(int i)
    {
        java.io.File file = Minecraft.func_106_b();
        return cn.func_629_a(file, (new StringBuilder()).append("World").append(i).toString()) == null ? null : (new StringBuilder()).append("World").append(i).toString();
    }

    public void func_585_j()
    {
        field_949_e.add(new fk(5, field_951_c / 2 - 100, field_950_d / 6 + 120 + 12, "Delete world..."));
        field_949_e.add(new fk(6, field_951_c / 2 - 100, field_950_d / 6 + 168, "Cancel"));
    }

    protected void func_572_a(fk fk1)
    {
        if(!fk1.field_937_g)
        {
            return;
        }
        if(fk1.field_938_f < 5)
        {
            func_584_c(fk1.field_938_f + 1);
        } else
        if(fk1.field_938_f == 5)
        {
            field_945_b.func_128_a(new ib(this));
        } else
        if(fk1.field_938_f == 6)
        {
            field_945_b.func_128_a(field_958_a);
        }
    }

    public void func_584_c(int i)
    {
        field_945_b.func_128_a(null);
        if(field_959_i)
        {
            return;
        } else
        {
            field_959_i = true;
            field_945_b.field_183_b = new ia(field_945_b);
            field_945_b.func_113_b((new StringBuilder()).append("World").append(i).toString());
            field_945_b.func_128_a(null);
            return;
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, field_960_h, field_951_c / 2, 20, 0xffffff);
        super.func_571_a(i, j, f);
    }

    protected bh field_958_a;
    protected String field_960_h;
    private boolean field_959_i;
}
