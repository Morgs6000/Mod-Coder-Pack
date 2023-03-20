// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class gd extends lv
{

    public gd(fr fr1)
    {
        field_1179_f = new boolean[10];
        field_1178_g = fr1;
    }

    public void func_796_a(int i, boolean flag)
    {
        byte byte0 = -1;
        if(i == field_1178_g.field_1575_j.field_1370_b)
        {
            byte0 = 0;
        }
        if(i == field_1178_g.field_1573_l.field_1370_b)
        {
            byte0 = 1;
        }
        if(i == field_1178_g.field_1574_k.field_1370_b)
        {
            byte0 = 2;
        }
        if(i == field_1178_g.field_1572_m.field_1370_b)
        {
            byte0 = 3;
        }
        if(i == field_1178_g.field_1571_n.field_1370_b)
        {
            byte0 = 4;
        }
        if(i == field_1178_g.field_1565_s.field_1370_b)
        {
            byte0 = 5;
        }
        if(byte0 >= 0)
        {
            field_1179_f[byte0] = flag;
        }
    }

    public void func_798_a()
    {
        for(int i = 0; i < 10; i++)
        {
            field_1179_f[i] = false;
        }

    }

    public void func_797_a(dm dm)
    {
        field_1174_a = 0.0F;
        field_1173_b = 0.0F;
        if(field_1179_f[0])
        {
            field_1173_b++;
        }
        if(field_1179_f[1])
        {
            field_1173_b--;
        }
        if(field_1179_f[2])
        {
            field_1174_a++;
        }
        if(field_1179_f[3])
        {
            field_1174_a--;
        }
        field_1176_d = field_1179_f[4];
        field_1175_e = field_1179_f[5];
        if(field_1175_e)
        {
            field_1174_a *= 0.29999999999999999D;
            field_1173_b *= 0.29999999999999999D;
        }
    }

    private boolean field_1179_f[];
    private fr field_1178_g;
}
