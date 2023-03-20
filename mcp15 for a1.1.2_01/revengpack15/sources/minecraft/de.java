// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class de extends bh
{

    public de()
    {
        field_985_a = "";
        field_986_h = 0;
    }

    public void func_575_a()
    {
        Keyboard.enableRepeatEvents(true);
    }

    public void func_576_h()
    {
        Keyboard.enableRepeatEvents(false);
    }

    public void func_570_g()
    {
        field_986_h++;
    }

    protected void func_580_a(char c, int i)
    {
        if(i == 1)
        {
            field_945_b.func_128_a(null);
            return;
        }
        if(i == 28)
        {
            String s = field_985_a.trim();
            if(s.length() > 0)
            {
                field_945_b.field_178_g.func_461_a(field_985_a.trim());
            }
            field_945_b.func_128_a(null);
            return;
        }
        if(i == 14 && field_985_a.length() > 0)
        {
            field_985_a = field_985_a.substring(0, field_985_a.length() - 1);
        }
        if(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~\u2302\307\374\351\342\344\340\345\347\352\353\350\357\356\354\304\305\311\346\306\364\366\362\373\371\377\326\334\370\243\330\327\u0192\341\355\363\372\361\321\252\272\277\256\254\275\274\241\253\273".indexOf(c) >= 0 && field_985_a.length() < 100)
        	field_985_a += c;
    }

    public void func_571_a(int i, int j, float f)
    {
        func_551_a(2, field_950_d - 14, field_951_c - 2, field_950_d - 2, 0x80000000);
        func_547_b(field_947_g, (new StringBuilder()).append("> ").append(field_985_a).append((field_986_h / 6) % 2 != 0 ? "" : "_").toString(), 4, field_950_d - 12, 0xe0e0e0);
    }

    protected void func_565_a(int i, int j, int k)
    {
        if(k != 0 || field_945_b.field_164_u.field_933_a == null)
        {
            return;
        }
        if(field_985_a.length() > 0 && !field_985_a.endsWith(" "))
        {
            field_985_a += " ";
        }
        field_985_a += field_945_b.field_164_u.field_933_a;
        byte byte0 = 100;
        if(field_985_a.length() > byte0)
        {
            field_985_a = field_985_a.substring(0, byte0);
        }
    }

    private String field_985_a;
    private int field_986_h;
}
