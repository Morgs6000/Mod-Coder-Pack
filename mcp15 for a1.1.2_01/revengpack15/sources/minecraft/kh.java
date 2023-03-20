// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public abstract class kh
{

    public kh(cn cn1)
    {
        field_620_ab = field_655_a++;
        field_619_ac = 1.0D;
        field_618_ad = false;
        field_600_av = false;
        field_597_ay = false;
        field_596_az = true;
        field_646_aA = false;
        field_645_aB = 0.0F;
        field_644_aC = 0.6F;
        field_643_aD = 1.8F;
        field_642_aE = 0.0F;
        field_641_aF = 0.0F;
        field_640_aG = true;
        field_639_aH = 0.0F;
        field_653_b = 1;
        field_635_aL = 0.0F;
        field_634_aM = 0.0F;
        field_633_aN = false;
        field_632_aO = 0.0F;
        field_631_aP = false;
        field_630_aQ = new Random();
        field_629_aR = 0;
        field_628_aS = 1;
        field_627_aT = 0;
        field_626_aU = 300;
        field_625_aV = false;
        field_624_aW = 0;
        field_623_aX = 300;
        field_651_c = true;
        field_621_aZ = false;
        field_615_ag = cn1;
        func_347_a(0.0D, 0.0D, 0.0D);
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof kh)
        {
            return ((kh)obj).field_620_ab == field_620_ab;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return field_620_ab;
    }

    protected void func_374_q()
    {
        if(field_615_ag == null)
        {
            return;
        }
        do
        {
            if(field_610_al <= 0.0D)
            {
                break;
            }
            func_347_a(field_611_ak, field_610_al, field_609_am);
            if(field_615_ag.func_697_a(this, field_601_au).size() == 0)
            {
                break;
            }
            field_610_al++;
        } while(true);
        field_608_an = field_607_ao = field_606_ap = 0.0D;
        field_604_ar = 0.0F;
    }

    public void func_395_F()
    {
        field_646_aA = true;
    }

    protected void func_371_a(float f1, float f2)
    {
        field_644_aC = f1;
        field_643_aD = f2;
    }

    protected void func_376_c(float f1, float f2)
    {
        field_605_aq = f1;
        field_604_ar = f2;
    }

    public void func_347_a(double d, double d1, double d2)
    {
        field_611_ak = d;
        field_610_al = d1;
        field_609_am = d2;
        float f1 = field_644_aC / 2.0F;
        float f2 = field_643_aD;
        field_601_au.func_1165_c(d - (double)f1, (d1 - (double)field_645_aB) + (double)field_635_aL, d2 - (double)f1, d + (double)f1, (d1 - (double)field_645_aB) + (double)field_635_aL + (double)f2, d2 + (double)f1);
    }

    public void func_346_d(float f1, float f2)
    {
        float f3 = field_604_ar;
        float f4 = field_605_aq;
        field_605_aq += (double)f1 * 0.14999999999999999D;
        field_604_ar -= (double)f2 * 0.14999999999999999D;
        if(field_604_ar < -90F)
        {
            field_604_ar = -90F;
        }
        if(field_604_ar > 90F)
        {
            field_604_ar = 90F;
        }
        field_602_at += field_604_ar - f3;
        field_603_as += field_605_aq - f4;
    }

    public void func_370_e_()
    {
        func_391_y();
    }

    public void func_391_y()
    {
        if(field_616_af != null && field_616_af.field_646_aA)
        {
            field_616_af = null;
        }
        field_629_aR++;
        field_642_aE = field_641_aF;
        field_614_ah = field_611_ak;
        field_613_ai = field_610_al;
        field_612_aj = field_609_am;
        field_602_at = field_604_ar;
        field_603_as = field_605_aq;
        if(func_397_g_())
        {
            if(!field_625_aV && !field_651_c)
            {
                float f1 = eo.func_1109_a(field_608_an * field_608_an * 0.20000000298023224D + field_607_ao * field_607_ao + field_606_ap * field_606_ap * 0.20000000298023224D) * 0.2F;
                if(f1 > 1.0F)
                {
                    f1 = 1.0F;
                }
                field_615_ag.func_623_a(this, "random.splash", f1, 1.0F + (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.4F);
                float f2 = eo.b(field_601_au.field_1697_b);
                for(int i = 0; (float)i < 1.0F + field_644_aC * 20F; i++)
                {
                    float f3 = (field_630_aQ.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    float f5 = (field_630_aQ.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    field_615_ag.func_694_a("bubble", field_611_ak + (double)f3, f2 + 1.0F, field_609_am + (double)f5, field_608_an, field_607_ao - (double)(field_630_aQ.nextFloat() * 0.2F), field_606_ap);
                }

                for(int j = 0; (float)j < 1.0F + field_644_aC * 20F; j++)
                {
                    float f4 = (field_630_aQ.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    float f6 = (field_630_aQ.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    field_615_ag.func_694_a("splash", field_611_ak + (double)f4, f2 + 1.0F, field_609_am + (double)f6, field_608_an, field_607_ao, field_606_ap);
                }

            }
            field_639_aH = 0.0F;
            field_625_aV = true;
            field_627_aT = 0;
        } else
        {
            field_625_aV = false;
        }
        if(field_627_aT > 0)
        {
            if(field_627_aT % 20 == 0)
            {
                func_396_a(null, 1);
            }
            field_627_aT--;
        }
        if(func_359_G())
        {
            func_396_a(null, 10);
            field_627_aT = 600;
        }
        if(field_610_al < -64D)
        {
            func_369_E();
        }
        field_651_c = false;
    }

    protected void func_369_E()
    {
        func_395_F();
    }

    public boolean func_403_b(double d, double d1, double d2)
    {
        cf cf1 = field_601_au.func_1166_c(d, d1, d2);
        List list = field_615_ag.func_697_a(this, cf1);
        if(list.size() > 0)
        {
            return false;
        }
        return !field_615_ag.func_662_b(cf1);
    }

    public void func_349_c(double d, double d1, double d2)
    {
        if(field_633_aN)
        {
            field_601_au.func_1174_d(d, d1, d2);
            field_611_ak = (field_601_au.field_1698_a + field_601_au.field_1703_d) / 2D;
            field_610_al = (field_601_au.field_1697_b + (double)field_645_aB) - (double)field_635_aL;
            field_609_am = (field_601_au.field_1704_c + field_601_au.field_1701_f) / 2D;
            return;
        }
        double d3 = field_611_ak;
        double d4 = field_609_am;
        double d5 = d;
        double d6 = d1;
        double d7 = d2;
        cf cf1 = field_601_au.func_1160_c();
        boolean flag = field_600_av && func_381_o();
        if(flag)
        {
            double d8 = 0.050000000000000003D;
            for(; d != 0.0D && field_615_ag.func_697_a(this, field_601_au.func_1166_c(d, -1D, 0.0D)).size() == 0; d5 = d)
            {
                if(d < d8 && d >= -d8)
                {
                    d = 0.0D;
                    continue;
                }
                if(d > 0.0D)
                {
                    d -= d8;
                } else
                {
                    d += d8;
                }
            }

            for(; d2 != 0.0D && field_615_ag.func_697_a(this, field_601_au.func_1166_c(0.0D, -1D, d2)).size() == 0; d7 = d2)
            {
                if(d2 < d8 && d2 >= -d8)
                {
                    d2 = 0.0D;
                    continue;
                }
                if(d2 > 0.0D)
                {
                    d2 -= d8;
                } else
                {
                    d2 += d8;
                }
            }

        }
        List list = field_615_ag.func_697_a(this, field_601_au.func_1170_a(d, d1, d2));
        for(int i = 0; i < list.size(); i++)
        {
            d1 = ((cf)list.get(i)).func_1172_b(field_601_au, d1);
        }

        field_601_au.func_1174_d(0.0D, d1, 0.0D);
        if(!field_596_az && d6 != d1)
        {
            d = d1 = d2 = 0.0D;
        }
        boolean flag1 = field_600_av || d6 != d1 && d6 < 0.0D;
        for(int j = 0; j < list.size(); j++)
        {
            d = ((cf)list.get(j)).func_1163_a(field_601_au, d);
        }

        field_601_au.func_1174_d(d, 0.0D, 0.0D);
        if(!field_596_az && d5 != d)
        {
            d = d1 = d2 = 0.0D;
        }
        for(int k = 0; k < list.size(); k++)
        {
            d2 = ((cf)list.get(k)).func_1162_c(field_601_au, d2);
        }

        field_601_au.func_1174_d(0.0D, 0.0D, d2);
        if(!field_596_az && d7 != d2)
        {
            d = d1 = d2 = 0.0D;
        }
        if(field_634_aM > 0.0F && flag1 && field_635_aL < 0.05F && (d5 != d || d7 != d2))
        {
            double d9 = d;
            double d11 = d1;
            double d13 = d2;
            d = d5;
            d1 = field_634_aM;
            d2 = d7;
            cf cf2 = field_601_au.func_1160_c();
            field_601_au.func_1171_b(cf1);
            List list1 = field_615_ag.func_697_a(this, field_601_au.func_1170_a(d, d1, d2));
            for(int j2 = 0; j2 < list1.size(); j2++)
            {
                d1 = ((cf)list1.get(j2)).func_1172_b(field_601_au, d1);
            }

            field_601_au.func_1174_d(0.0D, d1, 0.0D);
            if(!field_596_az && d6 != d1)
            {
                d = d1 = d2 = 0.0D;
            }
            for(int k2 = 0; k2 < list1.size(); k2++)
            {
                d = ((cf)list1.get(k2)).func_1163_a(field_601_au, d);
            }

            field_601_au.func_1174_d(d, 0.0D, 0.0D);
            if(!field_596_az && d5 != d)
            {
                d = d1 = d2 = 0.0D;
            }
            for(int l2 = 0; l2 < list1.size(); l2++)
            {
                d2 = ((cf)list1.get(l2)).func_1162_c(field_601_au, d2);
            }

            field_601_au.func_1174_d(0.0D, 0.0D, d2);
            if(!field_596_az && d7 != d2)
            {
                d = d1 = d2 = 0.0D;
            }
            if(d9 * d9 + d13 * d13 >= d * d + d2 * d2)
            {
                d = d9;
                d1 = d11;
                d2 = d13;
                field_601_au.func_1171_b(cf2);
            } else
            {
                field_635_aL += 0.5D;
            }
        }
        field_611_ak = (field_601_au.field_1698_a + field_601_au.field_1703_d) / 2D;
        field_610_al = (field_601_au.field_1697_b + (double)field_645_aB) - (double)field_635_aL;
        field_609_am = (field_601_au.field_1704_c + field_601_au.field_1701_f) / 2D;
        field_599_aw = d5 != d || d7 != d2;
        field_598_ax = d6 != d1;
        field_600_av = d6 != d1 && d6 < 0.0D;
        field_597_ay = field_599_aw || field_598_ax;
        if(field_600_av)
        {
            if(field_639_aH > 0.0F)
            {
                func_400_c(field_639_aH);
                field_639_aH = 0.0F;
            }
        } else
        if(d1 < 0.0D)
        {
            field_639_aH -= d1;
        }
        if(d5 != d)
        {
            field_608_an = 0.0D;
        }
        if(d6 != d1)
        {
            field_607_ao = 0.0D;
        }
        if(d7 != d2)
        {
            field_606_ap = 0.0D;
        }
        double d10 = field_611_ak - d3;
        double d12 = field_609_am - d4;
        field_641_aF += (double)eo.func_1109_a(d10 * d10 + d12 * d12) * 0.59999999999999998D;
        if(field_640_aG && !flag)
        {
            int l = eo.b(field_611_ak);
            int j1 = eo.b(field_610_al - 0.20000000298023224D - (double)field_645_aB);
            int l1 = eo.b(field_609_am);
            int i3 = field_615_ag.func_600_a(l, j1, l1);
            if(field_641_aF > (float)field_653_b && i3 > 0)
            {
                field_653_b++;
                bb bb1 = ly.field_345_n[i3].field_358_bl;
                if(field_615_ag.func_600_a(l, j1 + 1, l1) == ly.field_428_aT.field_376_bc)
                {
                    bb1 = ly.field_428_aT.field_358_bl;
                    field_615_ag.func_623_a(this, bb1.func_1145_d(), bb1.func_1147_b() * 0.15F, bb1.func_1144_c());
                } else
                if(!ly.field_345_n[i3].field_356_bn.func_879_d())
                {
                    field_615_ag.func_623_a(this, bb1.func_1145_d(), bb1.func_1147_b() * 0.15F, bb1.func_1144_c());
                }
                ly.field_345_n[i3].func_254_a(field_615_ag, l, j1, l1, this);
            }
        }
        int i1 = eo.b(field_601_au.field_1698_a);
        int k1 = eo.b(field_601_au.field_1697_b);
        int i2 = eo.b(field_601_au.field_1704_c);
        int j3 = eo.b(field_601_au.field_1703_d);
        int k3 = eo.b(field_601_au.field_1702_e);
        int l3 = eo.b(field_601_au.field_1701_f);
        for(int i4 = i1; i4 <= j3; i4++)
        {
            for(int j4 = k1; j4 <= k3; j4++)
            {
                for(int k4 = i2; k4 <= l3; k4++)
                {
                    int l4 = field_615_ag.func_600_a(i4, j4, k4);
                    if(l4 > 0)
                    {
                        ly.field_345_n[l4].func_236_b(field_615_ag, i4, j4, k4, this);
                    }
                }

            }

        }

        field_635_aL *= 0.4F;
        boolean flag2 = func_397_g_();
        if(field_615_ag.func_605_c(field_601_au))
        {
            func_355_a(1);
            if(!flag2)
            {
                field_627_aT++;
                if(field_627_aT == 0)
                {
                    field_627_aT = 300;
                }
            }
        } else
        if(field_627_aT <= 0)
        {
            field_627_aT = -field_628_aS;
        }
        if(flag2 && field_627_aT > 0)
        {
            field_615_ag.func_623_a(this, "random.fizz", 0.7F, 1.6F + (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.4F);
            field_627_aT = -field_628_aS;
        }
    }

    public boolean func_381_o()
    {
        return false;
    }

    public cf func_372_f_()
    {
        return null;
    }

    protected void func_355_a(int i)
    {
        func_396_a(null, i);
    }

    protected void func_400_c(float f1)
    {
    }

    public boolean func_397_g_()
    {
        return field_615_ag.func_682_a(field_601_au.func_1177_b(0.0D, -0.40000000596046448D, 0.0D), gb.field_1332_f, this);
    }

    public boolean func_393_a(gb gb1)
    {
        double d = field_610_al + (double)func_373_s();
        int i = eo.b(field_611_ak);
        int j = eo.func_1110_d(eo.b(d));
        int k = eo.b(field_609_am);
        int l = field_615_ag.func_600_a(i, j, k);
        if(l != 0 && ly.field_345_n[l].field_356_bn == gb1)
        {
            float f1 = jp.func_288_b(field_615_ag.func_602_e(i, j, k)) - 0.1111111F;
            float f2 = (float)(j + 1) - f1;
            return d < (double)f2;
        } else
        {
            return false;
        }
    }

    protected float func_373_s()
    {
        return 0.0F;
    }

    public boolean func_359_G()
    {
        return field_615_ag.func_689_a(field_601_au.func_1177_b(0.0D, -0.40000000596046448D, 0.0D), gb.field_1331_g);
    }

    public void func_351_a(float f1, float f2, float f3)
    {
        float f4 = eo.func_1113_c(f1 * f1 + f2 * f2);
        if(f4 < 0.01F)
        {
            return;
        }
        if(f4 < 1.0F)
        {
            f4 = 1.0F;
        }
        f4 = f3 / f4;
        f1 *= f4;
        f2 *= f4;
        float f5 = eo.func_1106_a((field_605_aq * 3.141593F) / 180F);
        float f6 = eo.func_1114_b((field_605_aq * 3.141593F) / 180F);
        field_608_an += f1 * f6 - f2 * f5;
        field_606_ap += f2 * f6 + f1 * f5;
    }

    public float func_382_a(float f1)
    {
        int i = eo.b(field_611_ak);
        double d = (field_601_au.field_1702_e - field_601_au.field_1697_b) * 0.66000000000000003D;
        int j = eo.b((field_610_al - (double)field_645_aB) + d);
        int k = eo.b(field_609_am);
        return field_615_ag.func_598_c(i, j, k);
    }

    public void func_398_a(cn cn1)
    {
        field_615_ag = cn1;
    }

    public void func_399_b(double d, double d1, double d2, float f1, 
            float f2)
    {
        field_614_ah = field_611_ak = d;
        field_613_ai = field_610_al = d1;
        field_612_aj = field_609_am = d2;
        field_605_aq = f1;
        field_604_ar = f2;
        field_635_aL = 0.0F;
        double d3 = field_603_as - f1;
        if(d3 < -180D)
        {
            field_603_as += 360F;
        }
        if(d3 >= 180D)
        {
            field_603_as -= 360F;
        }
        func_347_a(field_611_ak, field_610_al, field_609_am);
    }

    public void func_365_c(double d, double d1, double d2, float f1, 
            float f2)
    {
        field_614_ah = field_611_ak = d;
        field_613_ai = field_610_al = d1 + (double)field_645_aB;
        field_612_aj = field_609_am = d2;
        field_605_aq = f1;
        field_604_ar = f2;
        func_347_a(field_611_ak, field_610_al, field_609_am);
    }

    public float func_379_d(kh kh1)
    {
        float f1 = (float)(field_611_ak - kh1.field_611_ak);
        float f2 = (float)(field_610_al - kh1.field_610_al);
        float f3 = (float)(field_609_am - kh1.field_609_am);
        return eo.func_1113_c(f1 * f1 + f2 * f2 + f3 * f3);
    }

    public double func_360_d(double d, double d1, double d2)
    {
        double d3 = field_611_ak - d;
        double d4 = field_610_al - d1;
        double d5 = field_609_am - d2;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public double func_361_e(double d, double d1, double d2)
    {
        double d3 = field_611_ak - d;
        double d4 = field_610_al - d1;
        double d5 = field_609_am - d2;
        return (double)eo.func_1109_a(d3 * d3 + d4 * d4 + d5 * d5);
    }

    public double func_387_e(kh kh1)
    {
        double d = field_611_ak - kh1.field_611_ak;
        double d1 = field_610_al - kh1.field_610_al;
        double d2 = field_609_am - kh1.field_609_am;
        return d * d + d1 * d1 + d2 * d2;
    }

    public void func_362_b(dm dm)
    {
    }

    public void func_380_f(kh kh1)
    {
        if(kh1.field_617_ae == this || kh1.field_616_af == this)
        {
            return;
        }
        double d = kh1.field_611_ak - field_611_ak;
        double d1 = kh1.field_609_am - field_609_am;
        double d2 = eo.func_1107_a(d, d1);
        if(d2 >= 0.0099999997764825821D)
        {
            d2 = eo.func_1109_a(d2);
            d /= d2;
            d1 /= d2;
            double d3 = 1.0D / d2;
            if(d3 > 1.0D)
            {
                d3 = 1.0D;
            }
            d *= d3;
            d1 *= d3;
            d *= 0.05000000074505806D;
            d1 *= 0.05000000074505806D;
            d *= 1.0F - field_632_aO;
            d1 *= 1.0F - field_632_aO;
            func_348_f(-d, 0.0D, -d1);
            kh1.func_348_f(d, 0.0D, d1);
        }
    }

    public void func_348_f(double d, double d1, double d2)
    {
        field_608_an += d;
        field_607_ao += d1;
        field_606_ap += d2;
    }

    public boolean func_396_a(kh kh1, int i)
    {
        return false;
    }

    public boolean func_401_c_()
    {
        return false;
    }

    public boolean func_385_d_()
    {
        return false;
    }

    public void func_364_b(kh kh1, int i)
    {
    }

    public boolean func_390_a(aj aj1)
    {
        double d = field_611_ak - aj1.field_1776_a;
        double d1 = field_610_al - aj1.field_1775_b;
        double d2 = field_609_am - aj1.field_1779_c;
        double d3 = d * d + d1 * d1 + d2 * d2;
        return func_384_a(d3);
    }

    public boolean func_384_a(double d)
    {
        double d1 = field_601_au.func_1164_b();
        d1 *= 64D * field_619_ac;
        return d < d1 * d1;
    }

    public String func_356_x()
    {
        return null;
    }

    public boolean func_358_c(hm hm1)
    {
        String s = func_389_H();
        if(field_646_aA || s == null)
        {
            return false;
        } else
        {
            hm1.func_754_a("id", s);
            func_363_d(hm1);
            return true;
        }
    }

    public void func_363_d(hm hm1)
    {
        hm1.func_762_a("Pos", func_375_a(new double[] {
            field_611_ak, field_610_al, field_609_am
        }));
        hm1.func_762_a("Motion", func_375_a(new double[] {
            field_608_an, field_607_ao, field_606_ap
        }));
        hm1.func_762_a("Rotation", func_377_a(new float[] {
            field_605_aq, field_604_ar
        }));
        hm1.func_744_a("FallDistance", field_639_aH);
        hm1.func_749_a("Fire", (short)field_627_aT);
        hm1.func_749_a("Air", (short)field_623_aX);
        hm1.func_748_a("OnGround", field_600_av);
        func_352_a(hm1);
    }

    public void func_368_e(hm hm1)
    {
        ki ki1 = hm1.func_753_l("Pos");
        ki ki2 = hm1.func_753_l("Motion");
        ki ki3 = hm1.func_753_l("Rotation");
        func_347_a(0.0D, 0.0D, 0.0D);
        field_608_an = ((kr)ki2.func_741_a(0)).field_1089_a;
        field_607_ao = ((kr)ki2.func_741_a(1)).field_1089_a;
        field_606_ap = ((kr)ki2.func_741_a(2)).field_1089_a;
        field_614_ah = field_638_aI = field_611_ak = ((kr)ki1.func_741_a(0)).field_1089_a;
        field_613_ai = field_637_aJ = field_610_al = ((kr)ki1.func_741_a(1)).field_1089_a;
        field_612_aj = field_636_aK = field_609_am = ((kr)ki1.func_741_a(2)).field_1089_a;
        field_603_as = field_605_aq = ((f)ki3.func_741_a(0)).field_1097_a;
        field_602_at = field_604_ar = ((f)ki3.func_741_a(1)).field_1097_a;
        field_639_aH = hm1.func_752_g("FallDistance");
        field_627_aT = hm1.func_745_d("Fire");
        field_623_aX = hm1.func_745_d("Air");
        field_600_av = hm1.func_760_m("OnGround");
        func_347_a(field_611_ak, field_610_al, field_609_am);
        func_357_b(hm1);
    }

    protected final String func_389_H()
    {
        return ew.func_1083_b(this);
    }

    protected abstract void func_357_b(hm hm1);

    protected abstract void func_352_a(hm hm1);

    protected ki func_375_a(double ad[])
    {
        ki ki1 = new ki();
        double ad1[] = ad;
        int i = ad1.length;
        for(int j = 0; j < i; j++)
        {
            double d = ad1[j];
            ki1.func_742_a(new kr(d));
        }

        return ki1;
    }

    protected ki func_377_a(float af[])
    {
        ki ki1 = new ki();
        float af1[] = af;
        int i = af1.length;
        for(int j = 0; j < i; j++)
        {
            float f1 = af1[j];
            ki1.func_742_a(new f(f1));
        }

        return ki1;
    }

    public float func_392_h_()
    {
        return field_643_aD / 2.0F;
    }

    public dx func_367_b(int i, int j)
    {
        return func_394_a(i, j, 0.0F);
    }

    public dx func_394_a(int i, int j, float f1)
    {
        dx dx1 = new dx(field_615_ag, field_611_ak, field_610_al + (double)f1, field_609_am, new ev(i, j));
        dx1.field_805_c = 10;
        field_615_ag.func_674_a(dx1);
        return dx1;
    }

    public boolean func_354_B()
    {
        return !field_646_aA;
    }

    public boolean func_345_I()
    {
        int i = eo.b(field_611_ak);
        int j = eo.b(field_610_al + (double)func_373_s());
        int k = eo.b(field_609_am);
        return field_615_ag.func_601_g(i, j, k);
    }

    public boolean func_353_a(dm dm)
    {
        return false;
    }

    public cf func_383_b_(kh kh1)
    {
        return null;
    }

    public void func_350_p()
    {
        if(field_616_af.field_646_aA)
        {
            field_616_af = null;
            return;
        }
        field_608_an = 0.0D;
        field_607_ao = 0.0D;
        field_606_ap = 0.0D;
        func_370_e_();
        field_616_af.func_366_i_();
        field_647_e += field_616_af.field_605_aq - field_616_af.field_603_as;
        field_649_d += field_616_af.field_604_ar - field_616_af.field_602_at;
        for(; field_647_e >= 180D; field_647_e -= 360D) { }
        for(; field_647_e < -180D; field_647_e += 360D) { }
        for(; field_649_d >= 180D; field_649_d -= 360D) { }
        for(; field_649_d < -180D; field_649_d += 360D) { }
        double d = field_647_e * 0.5D;
        double d1 = field_649_d * 0.5D;
        float f1 = 10F;
        if(d > (double)f1)
        {
            d = f1;
        }
        if(d < (double)(-f1))
        {
            d = -f1;
        }
        if(d1 > (double)f1)
        {
            d1 = f1;
        }
        if(d1 < (double)(-f1))
        {
            d1 = -f1;
        }
        field_647_e -= d;
        field_649_d -= d1;
        field_605_aq += d;
        field_604_ar += d1;
    }

    protected void func_366_i_()
    {
        field_617_ae.func_347_a(field_611_ak, field_610_al + func_402_h() + field_617_ae.func_388_v(), field_609_am);
    }

    public double func_388_v()
    {
        return (double)field_645_aB;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.75D;
    }

    public void func_386_g(kh kh1)
    {
        field_649_d = 0.0D;
        field_647_e = 0.0D;
        if(field_616_af == kh1)
        {
            field_616_af.field_617_ae = null;
            field_616_af = null;
            func_365_c(kh1.field_611_ak, kh1.field_601_au.field_1697_b + (double)kh1.field_643_aD, kh1.field_609_am, field_605_aq, field_604_ar);
            return;
        }
        if(field_616_af != null)
        {
            field_616_af.field_617_ae = null;
        }
        if(kh1.field_617_ae != null)
        {
            kh1.field_617_ae.field_616_af = null;
        }
        field_616_af = kh1;
        kh1.field_617_ae = this;
    }

    public void func_378_a(double d, double d1, double d2, float f1, 
            float f2, int i)
    {
        func_347_a(d, d1, d2);
        func_376_c(f1, f2);
    }

    private static int field_655_a = 0;
    public int field_620_ab;
    public double field_619_ac;
    public boolean field_618_ad;
    public kh field_617_ae;
    public kh field_616_af;
    protected cn field_615_ag;
    public double field_614_ah;
    public double field_613_ai;
    public double field_612_aj;
    public double field_611_ak;
    public double field_610_al;
    public double field_609_am;
    public double field_608_an;
    public double field_607_ao;
    public double field_606_ap;
    public float field_605_aq;
    public float field_604_ar;
    public float field_603_as;
    public float field_602_at;
    public final cf field_601_au = cf.func_1168_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
    public boolean field_600_av;
    public boolean field_599_aw;
    public boolean field_598_ax;
    public boolean field_597_ay;
    public boolean field_596_az;
    public boolean field_646_aA;
    public float field_645_aB;
    public float field_644_aC;
    public float field_643_aD;
    public float field_642_aE;
    public float field_641_aF;
    protected boolean field_640_aG;
    protected float field_639_aH;
    private int field_653_b;
    public double field_638_aI;
    public double field_637_aJ;
    public double field_636_aK;
    public float field_635_aL;
    public float field_634_aM;
    public boolean field_633_aN;
    public float field_632_aO;
    public boolean field_631_aP;
    protected Random field_630_aQ;
    public int field_629_aR;
    public int field_628_aS;
    public int field_627_aT;
    protected int field_626_aU;
    protected boolean field_625_aV;
    public int field_624_aW;
    public int field_623_aX;
    private boolean field_651_c;
    public String field_622_aY;
    private double field_649_d;
    private double field_647_e;
    public boolean field_621_aZ;
    public int field_657_ba;
    public int field_656_bb;
    public int field_654_bc;
    public int field_652_bd;
    public int field_650_be;
    public int field_648_bf;

}
