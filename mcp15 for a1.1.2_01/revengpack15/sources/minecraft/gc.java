// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class gc extends bh
{

    public gc(bh bh1)
    {
        field_970_h = 0;
        field_969_i = "";
        field_968_a = bh1;
    }

    public void func_570_g()
    {
        field_970_h++;
    }

    public void func_575_a()
    {
        field_949_e.clear();
        field_949_e.add(new fk(0, field_951_c / 2 - 100, field_950_d / 4 + 96 + 12, "Connect"));
        field_949_e.add(new fk(1, field_951_c / 2 - 100, field_950_d / 4 + 120 + 12, "Cancel"));
        ((fk)field_949_e.get(0)).field_937_g = false;
    }

    protected void func_572_a(fk fk1)
    {
        if(!fk1.field_937_g)
        {
            return;
        }
        if(fk1.field_938_f == 1)
        {
            field_945_b.func_128_a(field_968_a);
        } else
        if(fk1.field_938_f == 0)
        {
            String as[] = field_969_i.split(":");
            field_945_b.func_128_a(new mn(field_945_b, as[0], as.length <= 1 ? 25565 : Integer.parseInt(as[1])));
        }
    }

    protected void func_580_a(char c, int i)
    {
        if(c == '\026')
    	{
    		String s;
    		int j;
    		s = bh.func_574_c();
    		if(s == null)
    		{
    		    s = "";
    		}
    		j = 32 - field_969_i.length();
    		if(j > s.length())
    		{
    			j = s.length();
    		}
    		if(j > 0)
    		{
    			field_969_i += s.substring(0, j);
    		}
    	}
        if(c == '\r')
        {
            func_572_a((fk)field_949_e.get(0));
        }
        if(i == 14 && field_969_i.length() > 0)
        {
            field_969_i = field_969_i.substring(0, field_969_i.length() - 1);
        }
        if(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~\u2302\307\374\351\342\344\340\345\347\352\353\350\357\356\354\304\305\311\346\306\364\366\362\373\371\377\326\334\370\243\330\327\u0192\341\355\363\372\361\321\252\272\277\256\254\275\274\241\253\273".indexOf(c) >= 0 && field_969_i.length() < 32)
        {
        	field_969_i += c;
        }
        ((fk)field_949_e.get(0)).field_937_g = field_969_i.length() > 0;
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, "Play Multiplayer", field_951_c / 2, (field_950_d / 4 - 60) + 20, 0xffffff);
        func_547_b(field_947_g, "Minecraft Multiplayer is currently not finished, but there", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 0, 0xa0a0a0);
        func_547_b(field_947_g, "is some buggy early testing going on.", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 9, 0xa0a0a0);
        func_547_b(field_947_g, "Enter the IP of a server to connect to it:", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 36, 0xa0a0a0);
        int k = field_951_c / 2 - 100;
        int l = (field_950_d / 4 - 10) + 50 + 18;
        char c = '\310';
        byte byte0 = 20;
        func_551_a(k - 1, l - 1, k + c + 1, l + byte0 + 1, 0xffa0a0a0);
        func_551_a(k, l, k + c, l + byte0, 0xff000000);
        func_547_b(field_947_g, (new StringBuilder()).append(field_969_i).append((field_970_h / 6) % 2 != 0 ? "" : "_").toString(), k + 4, l + (byte0 - 8) / 2, 0xe0e0e0);
        super.func_571_a(i, j, f);
    }

    private bh field_968_a;
    private int field_970_h;
    private String field_969_i;
}
