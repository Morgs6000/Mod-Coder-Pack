// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.net.*;
import java.util.Random;
//import net.minecraft.client.Minecraft;

public class gy extends lb
{

    public gy(Minecraft minecraft, String s, int i) throws UnknownHostException, IOException
    {
        field_1214_c = false;
        field_1210_g = false;
        field_1208_b = new Random();
        field_1212_e = minecraft;
        Socket socket = new Socket(InetAddress.getByName(s), i);
        field_1213_d = new ii(socket, "Client", this);
    }

    public void func_848_a()
    {
        if(field_1214_c)
        {
            return;
        } else
        {
            field_1213_d.func_967_a();
            return;
        }
    }

    public void func_840_a(hp hp1)
    {
        field_1212_e.field_183_b = new nj(field_1212_e, this);
        field_1211_f = new gs(this);
        field_1211_f.field_1026_y = true;
        field_1212_e.func_134_a(field_1211_f);
        field_1212_e.func_128_a(new dg(this));
    }

    public void func_832_a(ha ha1)
    {
        double d = (double)ha1.field_530_b / 32D;
        double d1 = (double)ha1.field_529_c / 32D;
        double d2 = (double)ha1.field_528_d / 32D;
        dx dx1 = new dx(field_1211_f, d, d1, d2, new ev(ha1.field_524_h, ha1.field_523_i));
        dx1.field_608_an = (double)ha1.field_527_e / 128D;
        dx1.field_607_ao = (double)ha1.field_526_f / 128D;
        dx1.field_606_ap = (double)ha1.field_525_g / 128D;
        dx1.field_652_bd = ha1.field_530_b;
        dx1.field_650_be = ha1.field_529_c;
        dx1.field_648_bf = ha1.field_528_d;
        field_1211_f.func_712_a(ha1.field_531_a, dx1);
    }

    public void func_835_a(kj kj1)
    {
        double d = (double)kj1.field_499_b / 32D;
        double d1 = (double)kj1.field_503_c / 32D;
        double d2 = (double)kj1.field_502_d / 32D;
        kh obj = null;
        if(kj1.field_501_e == 10)
        {
            obj = new oc(field_1211_f, d, d1, d2, 0);
        }
        if(kj1.field_501_e == 11)
        {
            obj = new oc(field_1211_f, d, d1, d2, 1);
        }
        if(kj1.field_501_e == 12)
        {
            obj = new oc(field_1211_f, d, d1, d2, 2);
        }
        if(kj1.field_501_e == 1)
        {
            obj = new dc(field_1211_f, d, d1, d2);
        }
        if(obj != null)
        {
            obj.field_652_bd = kj1.field_499_b;
            obj.field_650_be = kj1.field_503_c;
            obj.field_648_bf = kj1.field_502_d;
            obj.field_605_aq = 0.0F;
            obj.field_604_ar = 0.0F;
            obj.field_620_ab = kj1.field_500_a;
            field_1211_f.func_712_a(kj1.field_500_a, ((kh) (obj)));
        }
    }

    public void func_820_a(gp gp1)
    {
        double d = (double)gp1.field_540_c / 32D;
        double d1 = (double)gp1.field_539_d / 32D;
        double d2 = (double)gp1.field_538_e / 32D;
        float f = (float)(gp1.field_537_f * 360) / 256F;
        float f1 = (float)(gp1.field_536_g * 360) / 256F;
        nt nt1 = new nt(field_1212_e.field_180_e, gp1.field_533_b);
        nt1.field_652_bd = gp1.field_540_c;
        nt1.field_650_be = gp1.field_539_d;
        nt1.field_648_bf = gp1.field_538_e;
        int i = gp1.field_535_h;
        if(i == 0)
        {
            nt1.field_778_b.field_843_a[nt1.field_778_b.field_847_d] = null;
        } else
        {
            nt1.field_778_b.field_843_a[nt1.field_778_b.field_847_d] = new ev(i);
        }
        nt1.func_399_b(d, d1, d2, f, f1);
        field_1211_f.func_712_a(gp1.field_534_a, nt1);
    }

    public void func_829_a(jl jl1)
    {
        kh kh1 = field_1211_f.func_709_b(jl1.field_509_a);
        if(kh1 == null)
        {
            return;
        } else
        {
            kh1.field_652_bd = jl1.field_508_b;
            kh1.field_650_be = jl1.field_513_c;
            kh1.field_648_bf = jl1.field_512_d;
            double d = (double)kh1.field_652_bd / 32D;
            double d1 = (double)kh1.field_650_be / 32D;
            double d2 = (double)kh1.field_648_bf / 32D;
            float f = (float)(jl1.field_511_e * 360) / 256F;
            float f1 = (float)(jl1.field_510_f * 360) / 256F;
            kh1.func_378_a(d, d1, d2, f, f1, 3);
            return;
        }
    }

    public void func_827_a(lq lq1)
    {
        kh kh1 = field_1211_f.func_709_b(lq1.field_485_a);
        if(kh1 == null)
        {
            return;
        } else
        {
            kh1.field_652_bd += lq1.field_484_b;
            kh1.field_650_be += lq1.field_490_c;
            kh1.field_648_bf += lq1.field_489_d;
            double d = (double)kh1.field_652_bd / 32D;
            double d1 = (double)kh1.field_650_be / 32D;
            double d2 = (double)kh1.field_648_bf / 32D;
            float f = lq1.field_486_g ? (float)(lq1.field_488_e * 360) / 256F : kh1.field_605_aq;
            float f1 = lq1.field_486_g ? (float)(lq1.field_487_f * 360) / 256F : kh1.field_604_ar;
            kh1.func_378_a(d, d1, d2, f, f1, 3);
            return;
        }
    }

    public void func_839_a(ju ju1)
    {
        field_1211_f.func_710_c(ju1.field_507_a);
    }

    public void func_837_a(eh eh1)
    {
        bi bi1 = field_1212_e.field_178_g;
        double d = ((dm) (bi1)).field_611_ak;
        double d1 = ((dm) (bi1)).field_610_al;
        double d2 = ((dm) (bi1)).field_609_am;
        float f = ((dm) (bi1)).field_605_aq;
        float f1 = ((dm) (bi1)).field_604_ar;
        if(eh1.field_554_h)
        {
            d = eh1.field_561_a;
            d1 = eh1.field_560_b;
            d2 = eh1.field_559_c;
        }
        if(eh1.field_553_i)
        {
            f = eh1.field_557_e;
            f1 = eh1.field_556_f;
        }
        bi1.field_635_aL = 0.0F;
        bi1.field_608_an = bi1.field_607_ao = bi1.field_606_ap = 0.0D;
        bi1.func_399_b(d, d1, d2, f, f1);
        eh1.field_561_a = ((dm) (bi1)).field_611_ak;
        eh1.field_560_b = ((dm) (bi1)).field_601_au.field_1697_b;
        eh1.field_559_c = ((dm) (bi1)).field_609_am;
        eh1.field_558_d = ((dm) (bi1)).field_610_al;
        field_1213_d.func_972_a(eh1);
        if(!field_1210_g)
        {
            field_1212_e.field_178_g.field_614_ah = field_1212_e.field_178_g.field_611_ak;
            field_1212_e.field_178_g.field_613_ai = field_1212_e.field_178_g.field_610_al;
            field_1212_e.field_178_g.field_612_aj = field_1212_e.field_178_g.field_609_am;
            field_1210_g = true;
            field_1212_e.func_128_a(null);
        }
    }

    public void func_826_a(ka ka1)
    {
        field_1211_f.func_713_a(ka1.field_505_a, ka1.field_504_b, ka1.field_506_c);
    }

    public void func_824_a(na na1)
    {
        ga ga1 = field_1211_f.func_704_b(na1.field_479_a, na1.field_478_b);
        int i = na1.field_479_a * 16;
        int j = na1.field_478_b * 16;
        for(int k = 0; k < na1.field_480_f; k++)
        {
            short word0 = na1.field_483_c[k];
            int l = na1.field_482_d[k] & 0xff;
            byte byte0 = na1.field_481_e[k];
            int i1 = word0 >> 12 & 0xf;
            int j1 = word0 >> 8 & 0xf;
            int k1 = word0 & 0xff;
            ga1.func_1010_a(i1, k1, j1, l, byte0);
            field_1211_f.func_711_c(i1 + i, k1, j1 + j, i1 + i, k1, j1 + j);
            field_1211_f.func_701_b(i1 + i, k1, j1 + j, i1 + i, k1, j1 + j);
        }

    }

    public void func_833_a(bz bz1)
    {
        field_1211_f.func_711_c(bz1.field_573_a, bz1.field_572_b, bz1.field_579_c, (bz1.field_573_a + bz1.field_578_d) - 1, (bz1.field_572_b + bz1.field_577_e) - 1, (bz1.field_579_c + bz1.field_576_f) - 1);
        field_1211_f.func_693_a(bz1.field_573_a, bz1.field_572_b, bz1.field_579_c, bz1.field_578_d, bz1.field_577_e, bz1.field_576_f, bz1.field_575_g);
    }

    public void func_822_a(li li1)
    {
        field_1211_f.func_714_c(li1.field_492_a, li1.field_491_b, li1.field_495_c, li1.field_494_d, li1.field_493_e);
    }

    public void func_844_a(oh oh1)
    {
        field_1213_d.func_974_a("Got kicked");
        field_1214_c = true;
        field_1212_e.func_134_a(null);
        field_1212_e.func_128_a(new cj("Disconnected by server", oh1.field_582_a));
    }

    public void func_823_a(String s)
    {
        if(field_1214_c)
        {
            return;
        } else
        {
            field_1214_c = true;
            field_1212_e.func_134_a(null);
            field_1212_e.func_128_a(new cj("Connection lost", s));
            return;
        }
    }

    public void func_847_a(fn fn)
    {
        if(field_1214_c)
        {
            return;
        } else
        {
            field_1213_d.func_972_a(fn);
            return;
        }
    }

    public void func_834_a(bm bm1)
    {
        dx dx1 = (dx)field_1211_f.func_709_b(bm1.field_581_a);
        Object obj = (ge)field_1211_f.func_709_b(bm1.field_580_b);
        if(obj == null)
        {
            obj = field_1212_e.field_178_g;
        }
        if(dx1 != null)
        {
            field_1211_f.func_623_a(dx1, "random.pop", 0.2F, ((field_1208_b.nextFloat() - field_1208_b.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            field_1212_e.field_177_h.func_1192_a(new cd(field_1212_e.field_180_e, dx1, ((kh) (obj)), -0.5F));
            field_1211_f.func_710_c(bm1.field_581_a);
        }
    }

    public void func_841_a(dz dz1)
    {
        kh kh1 = field_1211_f.func_709_b(dz1.field_563_a);
        if(kh1 == null)
        {
            return;
        }
        dm dm1 = (dm)kh1;
        int i = dz1.field_562_b;
        if(i == 0)
        {
            dm1.field_778_b.field_843_a[dm1.field_778_b.field_847_d] = null;
        } else
        {
            dm1.field_778_b.field_843_a[dm1.field_778_b.field_847_d] = new ev(i);
        }
    }

    public void func_831_a(ij ij1)
    {
        field_1212_e.field_164_u.func_552_a(ij1.field_517_a);
    }

    public void func_825_a(hf hf1)
    {
        kh kh1 = field_1211_f.func_709_b(hf1.field_522_a);
        if(kh1 == null)
        {
            return;
        } else
        {
            dm dm1 = (dm)kh1;
            dm1.func_457_w();
            return;
        }
    }

    public void func_830_a(ld ld1)
    {
        field_1212_e.field_178_g.field_778_b.func_504_a(new ev(ld1.field_497_a, ld1.field_496_b, ld1.field_498_c));
    }

    public void func_838_a(gt gt1)
    {
        if(gt1.field_532_a.equals("-"))
        {
            func_847_a(new hp(field_1212_e.field_176_i.field_1666_b, "Password", 2));
        } else
        {
            try
            {
                URL url = new URL((new StringBuilder()).append("http://www.minecraft.net/game/joinserver.jsp?user=").append(field_1212_e.field_176_i.field_1666_b).append("&sessionId=").append(field_1212_e.field_176_i.field_1669_c).append("&serverId=").append(gt1.field_532_a).toString());
                BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(url.openStream()));
                String s = bufferedreader.readLine();
                bufferedreader.close();
                if(s.equalsIgnoreCase("ok"))
                {
                    func_847_a(new hp(field_1212_e.field_176_i.field_1666_b, "Password", 2));
                } else
                {
                    field_1213_d.func_974_a((new StringBuilder()).append("Failed to login: ").append(s).toString());
                }
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
                field_1213_d.func_974_a((new StringBuilder()).append("Internal client error: ").append(exception.toString()).toString());
            }
        }
    }

    public void func_849_b()
    {
        field_1214_c = true;
        field_1213_d.func_974_a("Closed");
    }

    public void func_828_a(ez ez1)
    {
        double d = (double)ez1.field_552_c / 32D;
        double d1 = (double)ez1.field_551_d / 32D;
        double d2 = (double)ez1.field_550_e / 32D;
        float f = (float)(ez1.field_549_f * 360) / 256F;
        float f1 = (float)(ez1.field_548_g * 360) / 256F;
        ge ge1 = (ge)ew.func_1084_a(ez1.field_546_b, field_1212_e.field_180_e);
        ge1.field_652_bd = ez1.field_552_c;
        ge1.field_650_be = ez1.field_551_d;
        ge1.field_648_bf = ez1.field_550_e;
        ge1.func_399_b(d, d1, d2, f, f1);
        ge1.field_720_B = true;
        field_1211_f.func_712_a(ez1.field_547_a, ge1);
    }

    public void func_846_a(du du1)
    {
        field_1212_e.field_180_e.func_648_a(du1.field_564_a);
    }

    public void func_843_a(m m1)
    {
        bi bi1 = field_1212_e.field_178_g;
        if(m1.field_571_a == -1)
        {
            ((dm) (bi1)).field_778_b.field_843_a = m1.field_570_b;
        }
        if(m1.field_571_a == -2)
        {
            ((dm) (bi1)).field_778_b.field_848_c = m1.field_570_b;
        }
        if(m1.field_571_a == -3)
        {
            ((dm) (bi1)).field_778_b.field_842_b = m1.field_570_b;
        }
    }

    public void func_842_a(ny ny1)
    {
        ic ic1 = field_1211_f.func_603_b(ny1.field_474_a, ny1.field_473_b, ny1.field_477_c);
        if(ic1 != null)
        {
            ic1.func_482_a(ny1.field_475_e);
            field_1211_f.func_701_b(ny1.field_474_a, ny1.field_473_b, ny1.field_477_c, ny1.field_474_a, ny1.field_473_b, ny1.field_477_c);
        }
    }

    public void func_845_a(ji ji1)
    {
        field_1211_f.field_1036_o = ji1.field_515_a;
        field_1211_f.field_1035_p = ji1.field_514_b;
        field_1211_f.field_1034_q = ji1.field_516_c;
    }

    private boolean field_1214_c;
    private ii field_1213_d;
    public String field_1209_a;
    private Minecraft field_1212_e;
    private gs field_1211_f;
    private boolean field_1210_g;
    Random field_1208_b;
}
