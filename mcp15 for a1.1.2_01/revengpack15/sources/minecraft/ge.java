// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class ge extends kh
{

    public ge(cn cn1)
    {
        super(cn1);
        field_739_j = 20;
        field_735_n = 0.0F;
        field_734_o = 0.0F;
        field_729_t = true;
        field_728_u = "/char.png";
        field_727_v = true;
        field_726_w = 0.0F;
        field_725_x = null;
        field_724_y = 1.0F;
        field_723_z = 0;
        field_721_A = 0.0F;
        field_720_B = false;
        field_713_I = 0.0F;
        field_712_J = 0;
        field_711_K = 0;
        field_708_N = false;
        field_707_O = -1;
        field_706_P = (float)(Math.random() * 0.89999997615814209D + 0.10000000149011612D);
        field_702_T = 0.0F;
        field_701_U = 0;
        field_697_Y = false;
        field_696_Z = 0.0F;
        field_722_aa = 0.7F;
        field_740_i = 0;
        field_717_E = 10;
        field_618_ad = true;
        field_736_m = (float)(Math.random() + 1.0D) * 0.01F;
        func_347_a(field_611_ak, field_610_al, field_609_am);
        field_738_k = (float)Math.random() * 12398F;
        field_605_aq = (float)(Math.random() * 3.1415927410125732D * 2D);
        field_737_l = 1.0F;
        field_634_aM = 0.5F;
    }

    protected boolean func_420_c(kh kh1)
    {
        return field_615_ag.func_645_a(aj.func_1248_b(field_611_ak, field_610_al + (double)func_373_s(), field_609_am), aj.func_1248_b(kh1.field_611_ak, kh1.field_610_al + (double)kh1.func_373_s(), kh1.field_609_am)) == null;
    }

    public String func_356_x()
    {
        return field_728_u;
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public boolean func_385_d_()
    {
        return !field_646_aA;
    }

    protected float func_373_s()
    {
        return field_643_aD * 0.85F;
    }

    public int func_421_b()
    {
        return 80;
    }

    public void func_391_y()
    {
        field_719_C = field_718_D;
        super.func_391_y();
        if(field_630_aQ.nextInt(1000) < field_748_a++)
        {
            field_748_a = -func_421_b();
            String s = func_423_c();
            if(s != null)
            {
                field_615_ag.func_623_a(this, s, func_413_f(), (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F);
            }
        }
        if(func_354_B() && func_345_I())
        {
            func_396_a(null, 1);
        }
        if(func_354_B() && func_393_a(gb.field_1332_f))
        {
            field_623_aX--;
            if(field_623_aX == -20)
            {
                field_623_aX = 0;
                for(int i = 0; i < 8; i++)
                {
                    float f = field_630_aQ.nextFloat() - field_630_aQ.nextFloat();
                    float f1 = field_630_aQ.nextFloat() - field_630_aQ.nextFloat();
                    float f2 = field_630_aQ.nextFloat() - field_630_aQ.nextFloat();
                    field_615_ag.func_694_a("bubble", field_611_ak + (double)f, field_610_al + (double)f1, field_609_am + (double)f2, field_608_an, field_607_ao, field_606_ap);
                }

                func_396_a(null, 2);
            }
            field_627_aT = 0;
        } else
        {
            field_623_aX = field_626_aU;
        }
        field_710_L = field_709_M;
        if(field_711_K > 0)
        {
            field_711_K--;
        }
        if(field_715_G > 0)
        {
            field_715_G--;
        }
        if(field_624_aW > 0)
        {
            field_624_aW--;
        }
        if(field_717_E <= 0)
        {
            field_712_J++;
            if(field_712_J > 20)
            {
                func_436_D();
                func_395_F();
                for(int j = 0; j < 20; j++)
                {
                    double d = field_630_aQ.nextGaussian() * 0.02D;
                    double d1 = field_630_aQ.nextGaussian() * 0.02D;
                    double d2 = field_630_aQ.nextGaussian() * 0.02D;
                    field_615_ag.func_694_a("explode", (field_611_ak + (double)(field_630_aQ.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, field_610_al + (double)(field_630_aQ.nextFloat() * field_643_aD), (field_609_am + (double)(field_630_aQ.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, d, d1, d2);
                }

            }
        }
        field_730_s = field_731_r;
        field_734_o = field_735_n;
        field_603_as = field_605_aq;
        field_602_at = field_604_ar;
    }

    public void func_415_z()
    {
        for(int i = 0; i < 20; i++)
        {
            double d = field_630_aQ.nextGaussian() * 0.02D;
            double d1 = field_630_aQ.nextGaussian() * 0.02D;
            double d2 = field_630_aQ.nextGaussian() * 0.02D;
            double d3 = 10D;
            field_615_ag.func_694_a("explode", (field_611_ak + (double)(field_630_aQ.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC - d * d3, (field_610_al + (double)(field_630_aQ.nextFloat() * field_643_aD)) - d1 * d3, (field_609_am + (double)(field_630_aQ.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC - d2 * d3, d, d1, d2);
        }

    }

    public void func_350_p()
    {
        super.func_350_p();
        field_733_p = field_732_q;
        field_732_q = 0.0F;
    }

    public void func_378_a(double d, double d1, double d2, float f, 
            float f1, int i)
    {
        field_645_aB = 0.0F;
        field_746_c = d;
        field_745_d = d1;
        field_744_e = d2;
        field_743_f = f;
        field_742_g = f1;
        field_747_b = i;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        func_425_j();
        double d = field_611_ak - field_614_ah;
        double d1 = field_609_am - field_612_aj;
        float f = eo.func_1109_a(d * d + d1 * d1);
        float f1 = field_735_n;
        float f2 = 0.0F;
        field_733_p = field_732_q;
        float f3 = 0.0F;
        if(f > 0.05F)
        {
            f3 = 1.0F;
            f2 = f * 3F;
            f1 = ((float)Math.atan2(d1, d) * 180F) / 3.141593F - 90F;
        }
        if(field_718_D > 0.0F)
        {
            f1 = field_605_aq;
        }
        if(!field_600_av)
        {
            f3 = 0.0F;
        }
        field_732_q = field_732_q + (f3 - field_732_q) * 0.3F;
        float f4;
        for(f4 = f1 - field_735_n; f4 < -180F; f4 += 360F) { }
        for(; f4 >= 180F; f4 -= 360F) { }
        field_735_n += f4 * 0.3F;
        float f5;
        for(f5 = field_605_aq - field_735_n; f5 < -180F; f5 += 360F) { }
        for(; f5 >= 180F; f5 -= 360F) { }
        boolean flag = f5 < -90F || f5 >= 90F;
        if(f5 < -75F)
        {
            f5 = -75F;
        }
        if(f5 >= 75F)
        {
            f5 = 75F;
        }
        field_735_n = field_605_aq - f5;
        if(f5 * f5 > 2500F)
        {
            field_735_n += f5 * 0.2F;
        }
        if(flag)
        {
            f2 *= -1F;
        }
        for(; field_605_aq - field_603_as < -180F; field_603_as -= 360F) { }
        for(; field_605_aq - field_603_as >= 180F; field_603_as += 360F) { }
        for(; field_735_n - field_734_o < -180F; field_734_o -= 360F) { }
        for(; field_735_n - field_734_o >= 180F; field_734_o += 360F) { }
        for(; field_604_ar - field_602_at < -180F; field_602_at -= 360F) { }
        for(; field_604_ar - field_602_at >= 180F; field_602_at += 360F) { }
        field_731_r += f2;
    }

    protected void func_371_a(float f, float f1)
    {
        super.func_371_a(f, f1);
    }

    public void func_432_b(int i)
    {
        if(field_717_E <= 0)
        {
            return;
        }
        field_717_E += i;
        if(field_717_E > 20)
        {
            field_717_E = 20;
        }
        field_624_aW = field_739_j / 2;
    }

    public boolean func_396_a(kh kh1, int i)
    {
        if(field_615_ag.field_1026_y)
        {
            i = 0;
        }
        field_701_U = 0;
        if(field_717_E <= 0)
        {
            return false;
        }
        field_704_R = 1.5F;
        if((float)field_624_aW > (float)field_739_j / 2.0F)
        {
            if(field_716_F - i >= field_717_E)
            {
                return false;
            }
            field_717_E = field_716_F - i;
        } else
        {
            field_716_F = field_717_E;
            field_624_aW = field_739_j;
            field_717_E -= i;
            field_715_G = field_714_H = 10;
        }
        field_713_I = 0.0F;
        if(kh1 != null)
        {
            double d = kh1.field_611_ak - field_611_ak;
            double d1;
            for(d1 = kh1.field_609_am - field_609_am; d * d + d1 * d1 < 0.0001D; d1 = (Math.random() - Math.random()) * 0.01D)
            {
                d = (Math.random() - Math.random()) * 0.01D;
            }

            field_713_I = (float)((Math.atan2(d1, d) * 180D) / 3.1415927410125732D) - field_605_aq;
            func_434_a(kh1, i, d, d1);
        } else
        {
            field_713_I = (int)(Math.random() * 2D) * 180;
        }
        if(field_717_E <= 0)
        {
            field_615_ag.func_623_a(this, func_428_e(), func_413_f(), (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F);
            func_419_b(kh1);
        } else
        {
            field_615_ag.func_623_a(this, func_414_d(), func_413_f(), (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F);
        }
        return true;
    }

    protected float func_413_f()
    {
        return 1.0F;
    }

    protected String func_423_c()
    {
        return null;
    }

    protected String func_414_d()
    {
        return "random.hurt";
    }

    protected String func_428_e()
    {
        return "random.hurt";
    }

    public void func_434_a(kh kh1, int i, double d, double d1)
    {
        float f = eo.func_1109_a(d * d + d1 * d1);
        float f1 = 0.4F;
        field_608_an /= 2D;
        field_607_ao /= 2D;
        field_606_ap /= 2D;
        field_608_an -= (d / (double)f) * (double)f1;
        field_607_ao += 0.40000000596046448D;
        field_606_ap -= (d1 / (double)f) * (double)f1;
        if(field_607_ao > 0.40000000596046448D)
        {
            field_607_ao = 0.40000000596046448D;
        }
    }

    public void func_419_b(kh kh1)
    {
        if(field_723_z > 0 && kh1 != null)
        {
            kh1.func_364_b(this, field_723_z);
        }
        field_708_N = true;
        int i = func_422_g();
        if(i > 0)
        {
            int j = field_630_aQ.nextInt(3);
            for(int k = 0; k < j; k++)
            {
                func_367_b(i, 1);
            }

        }
    }

    protected int func_422_g()
    {
        return 0;
    }

    protected void func_400_c(float f)
    {
        int i = (int)Math.ceil(f - 3F);
        if(i > 0)
        {
            func_396_a(null, i);
            int j = field_615_ag.func_600_a(eo.b(field_611_ak), eo.b(field_610_al - 0.20000000298023224D - (double)field_645_aB), eo.b(field_609_am));
            if(j > 0)
            {
                bb bb1 = ly.field_345_n[j].field_358_bl;
                field_615_ag.func_623_a(this, bb1.func_1145_d(), bb1.func_1147_b() * 0.5F, bb1.func_1144_c() * 0.75F);
            }
        }
    }

    public void func_435_b(float f, float f1)
    {
        if(func_397_g_())
        {
            double d = field_610_al;
            func_351_a(f, f1, 0.02F);
            func_349_c(field_608_an, field_607_ao, field_606_ap);
            field_608_an *= 0.80000001192092896D;
            field_607_ao *= 0.80000001192092896D;
            field_606_ap *= 0.80000001192092896D;
            field_607_ao -= 0.02D;
            if(field_599_aw && func_403_b(field_608_an, ((field_607_ao + 0.60000002384185791D) - field_610_al) + d, field_606_ap))
            {
                field_607_ao = 0.30000001192092896D;
            }
        } else
        if(func_359_G())
        {
            double d1 = field_610_al;
            func_351_a(f, f1, 0.02F);
            func_349_c(field_608_an, field_607_ao, field_606_ap);
            field_608_an *= 0.5D;
            field_607_ao *= 0.5D;
            field_606_ap *= 0.5D;
            field_607_ao -= 0.02D;
            if(field_599_aw && func_403_b(field_608_an, ((field_607_ao + 0.60000002384185791D) - field_610_al) + d1, field_606_ap))
            {
                field_607_ao = 0.30000001192092896D;
            }
        } else
        {
            float f2 = 0.91F;
            if(field_600_av)
            {
                f2 = 0.5460001F;
                int i = field_615_ag.func_600_a(eo.b(field_611_ak), eo.b(field_601_au.field_1697_b) - 1, eo.b(field_609_am));
                if(i > 0)
                {
                    f2 = ly.field_345_n[i].field_355_bo * 0.91F;
                }
            }
            float f3 = 0.1627714F / (f2 * f2 * f2);
            func_351_a(f, f1, field_600_av ? 0.1F * f3 : 0.02F);
            f2 = 0.91F;
            if(field_600_av)
            {
                f2 = 0.5460001F;
                int j = field_615_ag.func_600_a(eo.b(field_611_ak), eo.b(field_601_au.field_1697_b) - 1, eo.b(field_609_am));
                if(j > 0)
                {
                    f2 = ly.field_345_n[j].field_355_bo * 0.91F;
                }
            }
            if(func_429_A())
            {
                field_639_aH = 0.0F;
                if(field_607_ao < -0.14999999999999999D)
                {
                    field_607_ao = -0.14999999999999999D;
                }
            }
            func_349_c(field_608_an, field_607_ao, field_606_ap);
            if(field_599_aw && func_429_A())
            {
                field_607_ao = 0.20000000000000001D;
            }
            field_607_ao -= 0.080000000000000002D;
            field_607_ao *= 0.98000001907348633D;
            field_608_an *= f2;
            field_606_ap *= f2;
        }
        field_705_Q = field_704_R;
        double d2 = field_611_ak - field_614_ah;
        double d3 = field_609_am - field_612_aj;
        float f4 = eo.func_1109_a(d2 * d2 + d3 * d3) * 4F;
        if(f4 > 1.0F)
        {
            f4 = 1.0F;
        }
        field_704_R += (f4 - field_704_R) * 0.4F;
        field_703_S += field_704_R;
    }

    public boolean func_429_A()
    {
        int i = eo.b(field_611_ak);
        int j = eo.b(field_601_au.field_1697_b);
        int k = eo.b(field_609_am);
        return field_615_ag.func_600_a(i, j, k) == ly.field_441_aG.field_376_bc || field_615_ag.func_600_a(i, j + 1, k) == ly.field_441_aG.field_376_bc;
    }

    public void func_352_a(hm hm1)
    {
        hm1.func_749_a("Health", (short)field_717_E);
        hm1.func_749_a("HurtTime", (short)field_715_G);
        hm1.func_749_a("DeathTime", (short)field_712_J);
        hm1.func_749_a("AttackTime", (short)field_711_K);
    }

    public void func_357_b(hm hm1)
    {
        field_717_E = hm1.func_745_d("Health");
        if(!hm1.func_751_b("Health"))
        {
            field_717_E = 10;
        }
        field_715_G = hm1.func_745_d("HurtTime");
        field_712_J = hm1.func_745_d("DeathTime");
        field_711_K = hm1.func_745_d("AttackTime");
    }

    public boolean func_354_B()
    {
        return !field_646_aA && field_717_E > 0;
    }

    public void func_425_j()
    {
        if(field_747_b > 0)
        {
            double d = field_611_ak + (field_746_c - field_611_ak) / (double)field_747_b;
            double d1 = field_610_al + (field_745_d - field_610_al) / (double)field_747_b;
            double d2 = field_609_am + (field_744_e - field_609_am) / (double)field_747_b;
            double d3;
            for(d3 = field_743_f - (double)field_605_aq; d3 < -180D; d3 += 360D) { }
            for(; d3 >= 180D; d3 -= 360D) { }
            field_605_aq += d3 / (double)field_747_b;
            field_604_ar += (field_742_g - (double)field_604_ar) / (double)field_747_b;
            field_747_b--;
            func_347_a(d, d1, d2);
            func_376_c(field_605_aq, field_604_ar);
        }
        if(field_717_E <= 0)
        {
            field_697_Y = false;
            field_700_V = 0.0F;
            field_699_W = 0.0F;
            field_698_X = 0.0F;
        } else
        if(!field_720_B)
        {
            func_418_b_();
        }
        boolean flag = func_397_g_();
        boolean flag1 = func_359_G();
        if(field_697_Y)
        {
            if(flag)
            {
                field_607_ao += 0.039999999105930328D;
            } else
            if(flag1)
            {
                field_607_ao += 0.039999999105930328D;
            } else
            if(field_600_av)
            {
                func_424_C();
            }
        }
        field_700_V *= 0.98F;
        field_699_W *= 0.98F;
        field_698_X *= 0.9F;
        func_435_b(field_700_V, field_699_W);
        List list = field_615_ag.func_659_b(this, field_601_au.func_1177_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int i = 0; i < list.size(); i++)
            {
                kh kh1 = (kh)list.get(i);
                if(kh1.func_385_d_())
                {
                    kh1.func_380_f(this);
                }
            }

        }
    }

    protected void func_424_C()
    {
        field_607_ao = 0.41999998688697815D;
    }

    protected void func_418_b_()
    {
        field_701_U++;
        dm dm = field_615_ag.func_609_a(this, -1D);
        if(dm != null)
        {
            double d = ((kh) (dm)).field_611_ak - field_611_ak;
            double d1 = ((kh) (dm)).field_610_al - field_610_al;
            double d2 = ((kh) (dm)).field_609_am - field_609_am;
            double d3 = d * d + d1 * d1 + d2 * d2;
            if(d3 > 16384D)
            {
                func_395_F();
            }
            if(field_701_U > 600 && field_630_aQ.nextInt(800) == 0)
            {
                if(d3 < 1024D)
                {
                    field_701_U = 0;
                } else
                {
                    func_395_F();
                }
            }
        }
        field_700_V = 0.0F;
        field_699_W = 0.0F;
        float f = 8F;
        if(field_630_aQ.nextFloat() < 0.02F)
        {
            dm dm1 = field_615_ag.func_609_a(this, f);
            if(dm1 != null)
            {
                field_741_h = dm1;
                field_740_i = 10 + field_630_aQ.nextInt(20);
            } else
            {
                field_698_X = (field_630_aQ.nextFloat() - 0.5F) * 20F;
            }
        }
        if(field_741_h != null)
        {
            func_426_b(field_741_h, 10F);
            if(field_740_i-- <= 0 || field_741_h.field_646_aA || field_741_h.func_387_e(this) > (double)(f * f))
            {
                field_741_h = null;
            }
        } else
        {
            if(field_630_aQ.nextFloat() < 0.05F)
            {
                field_698_X = (field_630_aQ.nextFloat() - 0.5F) * 20F;
            }
            field_605_aq += field_698_X;
            field_604_ar = field_696_Z;
        }
        boolean flag = func_397_g_();
        boolean flag1 = func_359_G();
        if(flag || flag1)
        {
            field_697_Y = field_630_aQ.nextFloat() < 0.8F;
        }
    }

    public void func_426_b(kh kh1, float f)
    {
        double d = kh1.field_611_ak - field_611_ak;
        double d2 = kh1.field_609_am - field_609_am;
        double d1;
        if(kh1 instanceof ge)
        {
            ge ge1 = (ge)kh1;
            d1 = (ge1.field_610_al + (double)ge1.func_373_s()) - (field_610_al + (double)func_373_s());
        } else
        {
            d1 = (kh1.field_601_au.field_1697_b + kh1.field_601_au.field_1702_e) / 2D - (field_610_al + (double)func_373_s());
        }
        double d3 = eo.func_1109_a(d * d + d2 * d2);
        float f1 = (float)((Math.atan2(d2, d) * 180D) / 3.1415927410125732D) - 90F;
        float f2 = (float)((Math.atan2(d1, d3) * 180D) / 3.1415927410125732D);
        field_604_ar = func_417_b(field_604_ar, f2, f);
        field_605_aq = func_417_b(field_605_aq, f1, f);
    }

    private float func_417_b(float f, float f1, float f2)
    {
        float f3;
        for(f3 = f1 - f; f3 < -180F; f3 += 360F) { }
        for(; f3 >= 180F; f3 -= 360F) { }
        if(f3 > f2)
        {
            f3 = f2;
        }
        if(f3 < -f2)
        {
            f3 = -f2;
        }
        return f + f3;
    }

    public void func_436_D()
    {
    }

    public boolean func_433_a()
    {
        return field_615_ag.func_604_a(field_601_au) && field_615_ag.func_697_a(this, field_601_au).size() == 0 && !field_615_ag.func_662_b(field_601_au);
    }

    protected void func_369_E()
    {
        func_396_a(null, 4);
    }

    public float func_431_d(float f)
    {
        float f1 = field_718_D - field_719_C;
        if(f1 < 0.0F)
        {
            f1++;
        }
        return field_719_C + f1 * f;
    }

    public aj func_427_e(float f)
    {
        if(f == 1.0F)
        {
            return aj.func_1248_b(field_611_ak, field_610_al, field_609_am);
        } else
        {
            double d = field_614_ah + (field_611_ak - field_614_ah) * (double)f;
            double d1 = field_613_ai + (field_610_al - field_613_ai) * (double)f;
            double d2 = field_612_aj + (field_609_am - field_612_aj) * (double)f;
            return aj.func_1248_b(d, d1, d2);
        }
    }

    public aj func_430_f(float f)
    {
        if(f == 1.0F)
        {
            float f1 = eo.func_1114_b(-field_605_aq * 0.01745329F - 3.141593F);
            float f3 = eo.func_1106_a(-field_605_aq * 0.01745329F - 3.141593F);
            float f5 = -eo.func_1114_b(-field_604_ar * 0.01745329F);
            float f7 = eo.func_1106_a(-field_604_ar * 0.01745329F);
            return aj.func_1248_b(f3 * f5, f7, f1 * f5);
        } else
        {
            float f2 = field_602_at + (field_604_ar - field_602_at) * f;
            float f4 = field_603_as + (field_605_aq - field_603_as) * f;
            float f6 = eo.func_1114_b(-f4 * 0.01745329F - 3.141593F);
            float f8 = eo.func_1106_a(-f4 * 0.01745329F - 3.141593F);
            float f9 = -eo.func_1114_b(-f2 * 0.01745329F);
            float f10 = eo.func_1106_a(-f2 * 0.01745329F);
            return aj.func_1248_b(f8 * f9, f10, f6 * f9);
        }
    }

    public mf func_416_a(double d, float f)
    {
        aj aj1 = func_427_e(f);
        aj aj2 = func_430_f(f);
        aj aj3 = aj1.func_1257_c(aj2.field_1776_a * d, aj2.field_1775_b * d, aj2.field_1779_c * d);
        return field_615_ag.func_645_a(aj1, aj3);
    }

    public int field_739_j;
    public float field_738_k;
    public float field_737_l;
    public float field_736_m;
    public float field_735_n;
    public float field_734_o;
    protected float field_733_p;
    protected float field_732_q;
    protected float field_731_r;
    protected float field_730_s;
    protected boolean field_729_t;
    protected String field_728_u;
    protected boolean field_727_v;
    protected float field_726_w;
    protected String field_725_x;
    protected float field_724_y;
    protected int field_723_z;
    protected float field_721_A;
    public boolean field_720_B;
    public float field_719_C;
    public float field_718_D;
    public int field_717_E;
    public int field_716_F;
    private int field_748_a;
    public int field_715_G;
    public int field_714_H;
    public float field_713_I;
    public int field_712_J;
    public int field_711_K;
    public float field_710_L;
    public float field_709_M;
    protected boolean field_708_N;
    public int field_707_O;
    public float field_706_P;
    public float field_705_Q;
    public float field_704_R;
    public float field_703_S;
    private int field_747_b;
    private double field_746_c;
    private double field_745_d;
    private double field_744_e;
    private double field_743_f;
    private double field_742_g;
    float field_702_T;
    protected int field_701_U;
    protected float field_700_V;
    protected float field_699_W;
    protected float field_698_X;
    protected boolean field_697_Y;
    protected float field_696_Z;
    protected float field_722_aa;
    private kh field_741_h;
    private int field_740_i;
}
