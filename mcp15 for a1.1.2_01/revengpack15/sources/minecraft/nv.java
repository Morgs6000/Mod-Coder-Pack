// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class nv extends bh
{

    public nv(ob ob1)
    {
        field_999_a = "Edit sign message:";
        field_1000_j = 0;
        field_1002_h = ob1;
    }

    public void func_575_a()
    {
        field_949_e.clear();
        Keyboard.enableRepeatEvents(true);
        field_949_e.add(new fk(0, field_951_c / 2 - 100, field_950_d / 4 + 120, "Done"));
    }

    public void func_576_h()
    {
        Keyboard.enableRepeatEvents(false);
    }

    public void func_570_g()
    {
        field_1001_i++;
    }

    protected void func_572_a(fk fk1)
    {
        if(!fk1.field_937_g)
        {
            return;
        }
        if(fk1.field_938_f == 0)
        {
            field_1002_h.func_474_j_();
            field_945_b.func_128_a(null);
        }
    }

    protected void func_580_a(char c, int i)
    {
        if(i == 200)
        {
            field_1000_j = field_1000_j - 1 & 3;
        }
        if(i == 208 || i == 28)
        {
            field_1000_j = field_1000_j + 1 & 3;
        }
        if(i == 14 && field_1002_h.field_826_a[field_1000_j].length() > 0)
        {
            field_1002_h.field_826_a[field_1000_j] = field_1002_h.field_826_a[field_1000_j].substring(0, field_1002_h.field_826_a[field_1000_j].length() - 1);
        }
        if(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~\u2302\307\374\351\342\344\340\345\347\352\353\350\357\356\354\304\305\311\346\306\364\366\362\373\371\377\326\334\370\243\330\327\u0192\341\355\363\372\361\321\252\272\277\256\254\275\274\241\253\273".indexOf(c) >= 0 && field_1002_h.field_826_a[field_1000_j].length() < 15)
        {
        	field_1002_h.field_826_a[field_1000_j] += c;
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, field_999_a, field_951_c / 2, 40, 0xffffff);
        GL11.glPushMatrix();
        GL11.glTranslatef(field_951_c / 2, field_950_d / 2, 50F);
        float f1 = 93.75F;
        GL11.glScalef(-f1, -f1, -f1);
        GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
        ly ly1 = field_1002_h.func_478_g();
        if(ly1 == ly.field_443_aE)
        {
            float f2 = (float)(field_1002_h.func_479_f() * 360) / 16F;
            GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
        } else
        {
            int k = field_1002_h.func_479_f();
            float f3 = 0.0F;
            if(k == 2)
            {
                f3 = 180F;
            }
            if(k == 4)
            {
                f3 = 90F;
            }
            if(k == 5)
            {
                f3 = -90F;
            }
            GL11.glRotatef(f3, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
        }
        if((field_1001_i / 6) % 2 == 0)
        {
            field_1002_h.field_825_b = field_1000_j;
        }
        fz.field_1554_a.func_1032_a(field_1002_h, -0.5D, -0.75D, -0.5D, 0.0F);
        field_1002_h.field_825_b = -1;
        GL11.glPopMatrix();
        super.func_571_a(i, j, f);
    }

    protected String field_999_a;
    private ob field_1002_h;
    private int field_1001_i;
    private int field_1000_j;
}
