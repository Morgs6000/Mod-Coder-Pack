// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
//import net.minecraft.client.Minecraft;

public class bi extends dm
{

    public bi(Minecraft minecraft, cn cn, dl dl1)
    {
        super(cn);
        field_788_bg = minecraft;
        if(dl1 != null && dl1.field_1666_b != null && dl1.field_1666_b.length() > 0)
        {
            field_622_aY = (new StringBuilder()).append("http://www.minecraft.net/skin/").append(dl1.field_1666_b).append(".png").toString();
            System.out.println((new StringBuilder()).append("Loading texture ").append(field_622_aY).toString());
        }
        field_771_i = dl1.field_1666_b;
    }

    public void func_418_b_()
    {
        super.func_418_b_();
        field_700_V = field_787_a.field_1174_a;
        field_699_W = field_787_a.field_1173_b;
        field_697_Y = field_787_a.field_1176_d;
    }

    public void func_425_j()
    {
        field_787_a.func_797_a(this);
        if(field_787_a.field_1175_e && field_635_aL < 0.2F)
        {
            field_635_aL = 0.2F;
        }
        super.func_425_j();
    }

    public void func_458_k()
    {
        field_787_a.func_798_a();
    }

    public void func_460_a(int i, boolean flag)
    {
        field_787_a.func_796_a(i, flag);
    }

    public void func_352_a(hm hm1)
    {
        super.func_352_a(hm1);
        hm1.func_758_a("Score", field_776_d);
    }

    public void func_357_b(hm hm1)
    {
        super.func_357_b(hm1);
        field_776_d = hm1.func_756_e("Score");
    }

    public void func_452_a(gh gh)
    {
        field_788_bg.func_128_a(new ea(field_778_b, gh));
    }

    public void func_455_a(ob ob)
    {
        field_788_bg.func_128_a(new nv(ob));
    }

    public void func_445_l()
    {
        field_788_bg.func_128_a(new hx(field_778_b));
    }

    public void func_453_a(ke ke)
    {
        field_788_bg.func_128_a(new id(field_778_b, ke));
    }

    public void func_463_a(kh kh1)
    {
        int i = field_778_b.func_502_a(kh1);
        if(i > 0)
        {
            kh1.func_396_a(this, i);
            ev ev1 = func_442_t();
            if(ev1 != null && (kh1 instanceof ge))
            {
                ev1.func_1092_a((ge)kh1);
                if(ev1.field_1615_a <= 0)
                {
                    ev1.func_1097_a(this);
                    func_448_u();
                }
            }
        }
    }

    public void func_443_a_(kh kh1, int i)
    {
        field_788_bg.field_177_h.func_1192_a(new cd(field_788_bg.field_180_e, kh1, this, -0.5F));
    }

    public int func_459_m()
    {
        return field_778_b.func_506_f();
    }

    public void func_456_a_(kh kh1)
    {
        if(kh1.func_353_a(this))
        {
            return;
        }
        ev ev1 = func_442_t();
        if(ev1 != null && (kh1 instanceof ge))
        {
            ev1.func_1100_b((ge)kh1);
            if(ev1.field_1615_a <= 0)
            {
                ev1.func_1097_a(this);
                func_448_u();
            }
        }
    }

    public void func_461_a(String s)
    {
    }

    public void func_462_n()
    {
    }

    public boolean func_381_o()
    {
        return field_787_a.field_1175_e;
    }

    public lv field_787_a;
    private Minecraft field_788_bg;
}
