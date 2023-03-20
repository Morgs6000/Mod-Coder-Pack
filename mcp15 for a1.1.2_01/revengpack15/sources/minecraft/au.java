// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class au extends bh
{

    public au()
    {
    }

    public void func_575_a()
    {
        field_949_e.clear();
        field_949_e.add(new fk(1, field_951_c / 2 - 100, field_950_d / 4 + 72, "Respawn"));
        field_949_e.add(new fk(2, field_951_c / 2 - 100, field_950_d / 4 + 96, "Title menu"));
        if(field_945_b.field_176_i == null)
        {
            ((fk)field_949_e.get(1)).field_937_g = false;
        }
    }

    protected void func_580_a(char c, int i)
    {
    }

    protected void func_572_a(fk fk1)
    {
        if(fk1.field_938_f != 0);
        if(fk1.field_938_f == 1)
        {
            field_945_b.func_126_o();
            field_945_b.func_128_a(null);
        }
        if(fk1.field_938_f == 2)
        {
            field_945_b.func_134_a(null);
            field_945_b.func_128_a(new cx());
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_549_a(0, 0, field_951_c, field_950_d, 0x60500000, 0xa0803030);
        GL11.glPushMatrix();
        GL11.glScalef(2.0F, 2.0F, 2.0F);
        func_548_a(field_947_g, "Game over!", field_951_c / 2 / 2, 30, 0xffffff);
        GL11.glPopMatrix();
        func_548_a(field_947_g, (new StringBuilder()).append("Score: &e").append(field_945_b.field_178_g.func_447_r()).toString(), field_951_c / 2, 100, 0xffffff);
        super.func_571_a(i, j, f);
    }

    public boolean func_577_b()
    {
        return false;
    }
}
