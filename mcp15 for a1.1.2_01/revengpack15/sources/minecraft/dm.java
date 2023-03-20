// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class dm extends ge
{

    public dm(cn cn1)
    {
        super(cn1);
        field_778_b = new eu(this);
        field_777_c = 0;
        field_776_d = 0;
        field_773_g = false;
        field_772_h = 0;
        field_779_a = 0;
        field_645_aB = 1.62F;
        func_365_c((double)cn1.field_1036_o + 0.5D, cn1.field_1035_p + 1, (double)cn1.field_1034_q + 0.5D, 0.0F, 0.0F);
        field_717_E = 20;
        field_725_x = "humanoid";
        field_726_w = 180F;
        field_628_aS = 20;
        field_728_u = "/char.png";
    }

    public void func_350_p()
    {
        super.func_350_p();
        field_775_e = field_774_f;
        field_774_f = 0.0F;
    }

    public void func_374_q()
    {
        field_645_aB = 1.62F;
        func_371_a(0.6F, 1.8F);
        super.func_374_q();
        field_717_E = 20;
        field_712_J = 0;
    }

    protected void func_418_b_()
    {
        if(field_773_g)
        {
            field_772_h++;
            if(field_772_h == 8)
            {
                field_772_h = 0;
                field_773_g = false;
            }
        } else
        {
            field_772_h = 0;
        }
        field_718_D = (float)field_772_h / 8F;
    }

    public void func_425_j()
    {
        if(field_615_ag.field_1039_l == 0 && field_717_E < 20 && (field_629_aR % 20) * 4 == 0)
        {
            func_432_b(1);
        }
        field_778_b.func_511_b();
        field_775_e = field_774_f;
        super.func_425_j();
        float f = eo.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap);
        float f1 = (float)Math.atan(-field_607_ao * 0.20000000298023224D) * 15F;
        if(f > 0.1F)
        {
            f = 0.1F;
        }
        if(!field_600_av || field_717_E <= 0)
        {
            f = 0.0F;
        }
        if(field_600_av || field_717_E <= 0)
        {
            f1 = 0.0F;
        }
        field_774_f += (f - field_774_f) * 0.4F;
        field_709_M += (f1 - field_709_M) * 0.8F;
        if(field_717_E > 0)
        {
            List list = field_615_ag.func_659_b(this, field_601_au.func_1177_b(1.0D, 0.0D, 1.0D));
            if(list != null)
            {
                for(int i = 0; i < list.size(); i++)
                {
                    func_451_h((kh)list.get(i));
                }

            }
        }
    }

    private void func_451_h(kh kh1)
    {
        kh1.func_362_b(this);
    }

    public int func_447_r()
    {
        return field_776_d;
    }

    public void func_419_b(kh kh1)
    {
        func_371_a(0.2F, 0.2F);
        func_347_a(field_611_ak, field_610_al, field_609_am);
        field_607_ao = 0.10000000149011612D;
        if(field_771_i.equals("Notch"))
        {
            func_444_a(new ev(di.field_228_h, 1), true);
        }
        field_778_b.func_503_g();
        if(kh1 != null)
        {
            field_608_an = -eo.func_1114_b(((field_713_I + field_605_aq) * 3.141593F) / 180F) * 0.1F;
            field_606_ap = -eo.func_1106_a(((field_713_I + field_605_aq) * 3.141593F) / 180F) * 0.1F;
        } else
        {
            field_608_an = field_606_ap = 0.0D;
        }
        field_645_aB = 0.1F;
    }

    public void func_364_b(kh kh1, int i)
    {
        field_776_d += i;
    }

    public void func_449_a(ev ev1)
    {
        func_444_a(ev1, false);
    }

    public void func_444_a(ev ev1, boolean flag)
    {
        if(ev1 == null)
        {
            return;
        }
        dx dx1 = new dx(field_615_ag, field_611_ak, (field_610_al - 0.30000001192092896D) + (double)func_373_s(), field_609_am, ev1);
        dx1.field_805_c = 40;
        float f = 0.1F;
        if(flag)
        {
            float f2 = field_630_aQ.nextFloat() * 0.5F;
            float f4 = field_630_aQ.nextFloat() * 3.141593F * 2.0F;
            dx1.field_608_an = -eo.func_1106_a(f4) * f2;
            dx1.field_606_ap = eo.func_1114_b(f4) * f2;
            dx1.field_607_ao = 0.20000000298023224D;
        } else
        {
            float f1 = 0.3F;
            dx1.field_608_an = -eo.func_1106_a((field_605_aq / 180F) * 3.141593F) * eo.func_1114_b((field_604_ar / 180F) * 3.141593F) * f1;
            dx1.field_606_ap = eo.func_1114_b((field_605_aq / 180F) * 3.141593F) * eo.func_1114_b((field_604_ar / 180F) * 3.141593F) * f1;
            dx1.field_607_ao = -eo.func_1106_a((field_604_ar / 180F) * 3.141593F) * f1 + 0.1F;
            f1 = 0.02F;
            float f3 = field_630_aQ.nextFloat() * 3.141593F * 2.0F;
            f1 *= field_630_aQ.nextFloat();
            dx1.field_608_an += Math.cos(f3) * (double)f1;
            dx1.field_607_ao += (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.1F;
            dx1.field_606_ap += Math.sin(f3) * (double)f1;
        }
        func_446_a(dx1);
    }

    protected void func_446_a(dx dx1)
    {
        field_615_ag.func_674_a(dx1);
    }

    public float func_450_a(ly ly)
    {
        float f = field_778_b.func_508_a(ly);
        if(func_393_a(gb.field_1332_f))
        {
            f /= 5F;
        }
        if(!field_600_av)
        {
            f /= 5F;
        }
        return f;
    }

    public boolean func_454_b(ly ly)
    {
        return field_778_b.func_509_b(ly);
    }

    public void func_357_b(hm hm1)
    {
        super.func_357_b(hm1);
        ki ki1 = hm1.func_753_l("Inventory");
        field_778_b.func_513_b(ki1);
    }

    public void func_352_a(hm hm1)
    {
        super.func_352_a(hm1);
        hm1.func_762_a("Inventory", field_778_b.func_493_a(new ki()));
    }

    public void func_452_a(gh gh)
    {
    }

    public void func_445_l()
    {
    }

    public void func_443_a_(kh kh1, int i)
    {
    }

    protected float func_373_s()
    {
        return 0.12F;
    }

    public boolean func_396_a(kh kh1, int i)
    {
        field_701_U = 0;
        if(field_717_E <= 0)
        {
            return false;
        }
        if((float)field_624_aW > (float)field_739_j / 2.0F)
        {
            return false;
        }
        if((kh1 instanceof dq) || (kh1 instanceof kg))
        {
            if(field_615_ag.field_1039_l == 0)
            {
                i = 0;
            }
            if(field_615_ag.field_1039_l == 1)
            {
                i = i / 3 + 1;
            }
            if(field_615_ag.field_1039_l == 3)
            {
                i = (i * 3) / 2;
            }
        }
        int j = 25 - field_778_b.func_506_f();
        int k = i * j + field_779_a;
        field_778_b.func_507_e(i);
        i = k / 25;
        field_779_a = k % 25;
        if(i == 0)
        {
            return false;
        } else
        {
            return super.func_396_a(kh1, i);
        }
    }

    public void func_453_a(ke ke)
    {
    }

    public void func_455_a(ob ob)
    {
    }

    public void func_456_a_(kh kh1)
    {
    }

    public ev func_442_t()
    {
        return field_778_b.func_494_a();
    }

    public void func_448_u()
    {
        field_778_b.func_472_a(field_778_b.field_847_d, null);
    }

    public double func_388_v()
    {
        return (double)(field_645_aB - 0.5F);
    }

    public void func_457_w()
    {
        field_772_h = -1;
        field_773_g = true;
    }

    public eu field_778_b;
    public byte field_777_c;
    public int field_776_d;
    public float field_775_e;
    public float field_774_f;
    public boolean field_773_g;
    public int field_772_h;
    public String field_771_i;
    private int field_779_a;
}
