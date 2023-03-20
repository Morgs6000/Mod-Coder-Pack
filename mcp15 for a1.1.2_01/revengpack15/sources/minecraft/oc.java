// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class oc extends kh
    implements gh
{

    public oc(cn cn1)
    {
        super(cn1);
        field_857_h = new ev[36];
        field_864_a = 0;
        field_863_b = 0;
        field_862_c = 1;
        field_856_i = false;
        field_618_ad = true;
        func_371_a(0.98F, 0.7F);
        field_645_aB = field_643_aD / 2.0F;
        field_640_aG = false;
    }

    public cf func_383_b_(kh kh1)
    {
        return kh1.field_601_au;
    }

    public cf func_372_f_()
    {
        return field_601_au;
    }

    public boolean func_385_d_()
    {
        return true;
    }

    public oc(cn cn1, double d, double d1, double d2, 
            int i)
    {
        this(cn1);
        func_347_a(d, d1 + (double)field_645_aB, d2);
        field_608_an = 0.0D;
        field_607_ao = 0.0D;
        field_606_ap = 0.0D;
        field_614_ah = d;
        field_613_ai = d1;
        field_612_aj = d2;
        field_861_d = i;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.0D - 0.30000001192092896D;
    }

    public boolean func_396_a(kh kh1, int i)
    {
        field_862_c = -field_862_c;
        field_863_b = 10;
        field_864_a += i * 10;
        if(field_864_a > 40)
        {
            func_394_a(di.field_256_ax.field_291_aS, 1, 0.0F);
            if(field_861_d == 1)
            {
                func_394_a(ly.field_396_av.field_376_bc, 1, 0.0F);
            } else
            if(field_861_d == 2)
            {
                func_394_a(ly.field_445_aC.field_376_bc, 1, 0.0F);
            }
            func_395_F();
        }
        return true;
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public void func_395_F()
    {
label0:
        for(int i = 0; i < func_469_c(); i++)
        {
            ev ev1 = func_468_c(i);
            if(ev1 == null)
            {
                continue;
            }
            float f = field_630_aQ.nextFloat() * 0.8F + 0.1F;
            float f1 = field_630_aQ.nextFloat() * 0.8F + 0.1F;
            float f2 = field_630_aQ.nextFloat() * 0.8F + 0.1F;
            do
            {
                if(ev1.field_1615_a <= 0)
                {
                    continue label0;
                }
                int j = field_630_aQ.nextInt(21) + 10;
                if(j > ev1.field_1615_a)
                {
                    j = ev1.field_1615_a;
                }
                ev1.field_1615_a -= j;
                dx dx1 = new dx(field_615_ag, field_611_ak + (double)f, field_610_al + (double)f1, field_609_am + (double)f2, new ev(ev1.field_1617_c, j, ev1.field_1616_d));
                float f3 = 0.05F;
                dx1.field_608_an = (float)field_630_aQ.nextGaussian() * f3;
                dx1.field_607_ao = (float)field_630_aQ.nextGaussian() * f3 + 0.2F;
                dx1.field_606_ap = (float)field_630_aQ.nextGaussian() * f3;
                field_615_ag.func_674_a(dx1);
            } while(true);
        }

        super.func_395_F();
    }

    public void func_370_e_()
    {
        if(field_615_ag.field_1026_y)
        {
            if(field_854_k > 0)
            {
                double d = field_611_ak + (field_853_l - field_611_ak) / (double)field_854_k;
                double d1 = field_610_al + (field_852_m - field_610_al) / (double)field_854_k;
                double d3 = field_609_am + (field_851_n - field_609_am) / (double)field_854_k;
                double d4;
                for(d4 = field_850_o - (double)field_605_aq; d4 < -180D; d4 += 360D) { }
                for(; d4 >= 180D; d4 -= 360D) { }
                field_605_aq += d4 / (double)field_854_k;
                field_604_ar += (field_849_p - (double)field_604_ar) / (double)field_854_k;
                field_854_k--;
                func_347_a(d, d1, d3);
                func_376_c(field_605_aq, field_604_ar);
            } else
            {
                func_347_a(field_611_ak, field_610_al, field_609_am);
                func_376_c(field_605_aq, field_604_ar);
            }
            return;
        }
        if(field_863_b > 0)
        {
            field_863_b--;
        }
        if(field_864_a > 0)
        {
            field_864_a--;
        }
        field_614_ah = field_611_ak;
        field_613_ai = field_610_al;
        field_612_aj = field_609_am;
        field_607_ao -= 0.039999999105930328D;
        int i = eo.b(field_611_ak);
        int j = eo.b(field_610_al);
        int k = eo.b(field_609_am);
        if(field_615_ag.func_600_a(i, j - 1, k) == ly.field_440_aH.field_376_bc)
        {
            j--;
        }
        double d2 = 0.40000000000000002D;
        boolean flag = false;
        double d5 = 0.0078125D;
        if(field_615_ag.func_600_a(i, j, k) == ly.field_440_aH.field_376_bc)
        {
            aj aj1 = func_514_g(field_611_ak, field_610_al, field_609_am);
            int l = field_615_ag.func_602_e(i, j, k);
            field_610_al = j;
            if(l >= 2 && l <= 5)
            {
                field_610_al = j + 1;
            }
            if(l == 2)
            {
                field_608_an -= d5;
            }
            if(l == 3)
            {
                field_608_an += d5;
            }
            if(l == 4)
            {
                field_606_ap += d5;
            }
            if(l == 5)
            {
                field_606_ap -= d5;
            }
            int ai[][] = field_855_j[l];
            double d8 = ai[1][0] - ai[0][0];
            double d10 = ai[1][2] - ai[0][2];
            double d11 = Math.sqrt(d8 * d8 + d10 * d10);
            double d12 = field_608_an * d8 + field_606_ap * d10;
            if(d12 < 0.0D)
            {
                d8 = -d8;
                d10 = -d10;
            }
            double d13 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap);
            field_608_an = (d13 * d8) / d11;
            field_606_ap = (d13 * d10) / d11;
            double d16 = 0.0D;
            double d17 = (double)i + 0.5D + (double)ai[0][0] * 0.5D;
            double d18 = (double)k + 0.5D + (double)ai[0][2] * 0.5D;
            double d19 = (double)i + 0.5D + (double)ai[1][0] * 0.5D;
            double d20 = (double)k + 0.5D + (double)ai[1][2] * 0.5D;
            d8 = d19 - d17;
            d10 = d20 - d18;
            if(d8 == 0.0D)
            {
                field_611_ak = (double)i + 0.5D;
                d16 = field_609_am - (double)k;
            } else
            if(d10 == 0.0D)
            {
                field_609_am = (double)k + 0.5D;
                d16 = field_611_ak - (double)i;
            } else
            {
                double d21 = field_611_ak - d17;
                double d23 = field_609_am - d18;
                double d25 = (d21 * d8 + d23 * d10) * 2D;
                d16 = d25;
            }
            field_611_ak = d17 + d8 * d16;
            field_609_am = d18 + d10 * d16;
            func_347_a(field_611_ak, field_610_al + (double)field_645_aB, field_609_am);
            double d22 = field_608_an;
            double d24 = field_606_ap;
            if(field_617_ae != null)
            {
                d22 *= 0.75D;
                d24 *= 0.75D;
            }
            if(d22 < -d2)
            {
                d22 = -d2;
            }
            if(d22 > d2)
            {
                d22 = d2;
            }
            if(d24 < -d2)
            {
                d24 = -d2;
            }
            if(d24 > d2)
            {
                d24 = d2;
            }
            func_349_c(d22, 0.0D, d24);
            if(ai[0][1] != 0 && eo.b(field_611_ak) - i == ai[0][0] && eo.b(field_609_am) - k == ai[0][2])
            {
                func_347_a(field_611_ak, field_610_al + (double)ai[0][1], field_609_am);
            } else
            if(ai[1][1] != 0 && eo.b(field_611_ak) - i == ai[1][0] && eo.b(field_609_am) - k == ai[1][2])
            {
                func_347_a(field_611_ak, field_610_al + (double)ai[1][1], field_609_am);
            }
            if(field_617_ae != null)
            {
                field_608_an *= 0.99699997901916504D;
                field_607_ao *= 0.0D;
                field_606_ap *= 0.99699997901916504D;
            } else
            {
                if(field_861_d == 2)
                {
                    double d26 = eo.func_1109_a(field_859_f * field_859_f + field_858_g * field_858_g);
                    if(d26 > 0.01D)
                    {
                        flag = true;
                        field_859_f /= d26;
                        field_858_g /= d26;
                        double d28 = 0.040000000000000001D;
                        field_608_an *= 0.80000001192092896D;
                        field_607_ao *= 0.0D;
                        field_606_ap *= 0.80000001192092896D;
                        field_608_an += field_859_f * d28;
                        field_606_ap += field_858_g * d28;
                    } else
                    {
                        field_608_an *= 0.89999997615814209D;
                        field_607_ao *= 0.0D;
                        field_606_ap *= 0.89999997615814209D;
                    }
                }
                field_608_an *= 0.95999997854232788D;
                field_607_ao *= 0.0D;
                field_606_ap *= 0.95999997854232788D;
            }
            aj aj2 = func_514_g(field_611_ak, field_610_al, field_609_am);
            if(aj2 != null && aj1 != null)
            {
                double d27 = (aj1.field_1775_b - aj2.field_1775_b) * 0.050000000000000003D;
                double d14 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap);
                if(d14 > 0.0D)
                {
                    field_608_an = (field_608_an / d14) * (d14 + d27);
                    field_606_ap = (field_606_ap / d14) * (d14 + d27);
                }
                func_347_a(field_611_ak, aj2.field_1775_b, field_609_am);
            }
            int j1 = eo.b(field_611_ak);
            int k1 = eo.b(field_609_am);
            if(j1 != i || k1 != k)
            {
                double d15 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap);
                field_608_an = d15 * (double)(j1 - i);
                field_606_ap = d15 * (double)(k1 - k);
            }
            if(field_861_d == 2)
            {
                double d29 = eo.func_1109_a(field_859_f * field_859_f + field_858_g * field_858_g);
                if(d29 > 0.01D && field_608_an * field_608_an + field_606_ap * field_606_ap > 0.001D)
                {
                    field_859_f /= d29;
                    field_858_g /= d29;
                    if(field_859_f * field_608_an + field_858_g * field_606_ap < 0.0D)
                    {
                        field_859_f = 0.0D;
                        field_858_g = 0.0D;
                    } else
                    {
                        field_859_f = field_608_an;
                        field_858_g = field_606_ap;
                    }
                }
            }
        } else
        {
            if(field_608_an < -d2)
            {
                field_608_an = -d2;
            }
            if(field_608_an > d2)
            {
                field_608_an = d2;
            }
            if(field_606_ap < -d2)
            {
                field_606_ap = -d2;
            }
            if(field_606_ap > d2)
            {
                field_606_ap = d2;
            }
            if(field_600_av)
            {
                field_608_an *= 0.5D;
                field_607_ao *= 0.5D;
                field_606_ap *= 0.5D;
            }
            func_349_c(field_608_an, field_607_ao, field_606_ap);
            if(!field_600_av)
            {
                field_608_an *= 0.94999998807907104D;
                field_607_ao *= 0.94999998807907104D;
                field_606_ap *= 0.94999998807907104D;
            }
        }
        field_604_ar = 0.0F;
        double d6 = field_614_ah - field_611_ak;
        double d7 = field_612_aj - field_609_am;
        if(d6 * d6 + d7 * d7 > 0.001D)
        {
            field_605_aq = (float)((Math.atan2(d7, d6) * 180D) / 3.1415926535897931D);
            if(field_856_i)
            {
                field_605_aq += 180F;
            }
        }
        double d9;
        for(d9 = field_605_aq - field_603_as; d9 >= 180D; d9 -= 360D) { }
        for(; d9 < -180D; d9 += 360D) { }
        if(d9 < -170D || d9 >= 170D)
        {
            field_605_aq += 180F;
            field_856_i = !field_856_i;
        }
        func_376_c(field_605_aq, field_604_ar);
        List list = field_615_ag.func_659_b(this, field_601_au.func_1177_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int i1 = 0; i1 < list.size(); i1++)
            {
                kh kh1 = (kh)list.get(i1);
                if(kh1 != field_617_ae && kh1.func_385_d_() && (kh1 instanceof oc))
                {
                    kh1.func_380_f(this);
                }
            }

        }
        if(field_617_ae != null && field_617_ae.field_646_aA)
        {
            field_617_ae = null;
        }
        if(flag && field_630_aQ.nextInt(4) == 0)
        {
            field_860_e--;
            if(field_860_e < 0)
            {
                field_859_f = field_858_g = 0.0D;
            }
            field_615_ag.func_694_a("largesmoke", field_611_ak, field_610_al + 0.80000000000000004D, field_609_am, 0.0D, 0.0D, 0.0D);
        }
    }

    public aj func_515_a(double d, double d1, double d2, double d3)
    {
        int i = eo.b(d);
        int j = eo.b(d1);
        int k = eo.b(d2);
        if(field_615_ag.func_600_a(i, j - 1, k) == ly.field_440_aH.field_376_bc)
        {
            j--;
        }
        if(field_615_ag.func_600_a(i, j, k) == ly.field_440_aH.field_376_bc)
        {
            int l = field_615_ag.func_602_e(i, j, k);
            d1 = j;
            if(l >= 2 && l <= 5)
            {
                d1 = j + 1;
            }
            int ai[][] = field_855_j[l];
            double d4 = ai[1][0] - ai[0][0];
            double d5 = ai[1][2] - ai[0][2];
            double d6 = Math.sqrt(d4 * d4 + d5 * d5);
            d4 /= d6;
            d5 /= d6;
            d += d4 * d3;
            d2 += d5 * d3;
            if(ai[0][1] != 0 && eo.b(d) - i == ai[0][0] && eo.b(d2) - k == ai[0][2])
            {
                d1 += ai[0][1];
            } else
            if(ai[1][1] != 0 && eo.b(d) - i == ai[1][0] && eo.b(d2) - k == ai[1][2])
            {
                d1 += ai[1][1];
            }
            return func_514_g(d, d1, d2);
        } else
        {
            return null;
        }
    }

    public aj func_514_g(double d, double d1, double d2)
    {
        int i = eo.b(d);
        int j = eo.b(d1);
        int k = eo.b(d2);
        if(field_615_ag.func_600_a(i, j - 1, k) == ly.field_440_aH.field_376_bc)
        {
            j--;
        }
        if(field_615_ag.func_600_a(i, j, k) == ly.field_440_aH.field_376_bc)
        {
            int l = field_615_ag.func_602_e(i, j, k);
            d1 = j;
            if(l >= 2 && l <= 5)
            {
                d1 = j + 1;
            }
            int ai[][] = field_855_j[l];
            double d3 = 0.0D;
            double d4 = (double)i + 0.5D + (double)ai[0][0] * 0.5D;
            double d5 = (double)j + 0.5D + (double)ai[0][1] * 0.5D;
            double d6 = (double)k + 0.5D + (double)ai[0][2] * 0.5D;
            double d7 = (double)i + 0.5D + (double)ai[1][0] * 0.5D;
            double d8 = (double)j + 0.5D + (double)ai[1][1] * 0.5D;
            double d9 = (double)k + 0.5D + (double)ai[1][2] * 0.5D;
            double d10 = d7 - d4;
            double d11 = (d8 - d5) * 2D;
            double d12 = d9 - d6;
            if(d10 == 0.0D)
            {
                d = (double)i + 0.5D;
                d3 = d2 - (double)k;
            } else
            if(d12 == 0.0D)
            {
                d2 = (double)k + 0.5D;
                d3 = d - (double)i;
            } else
            {
                double d13 = d - d4;
                double d14 = d2 - d6;
                double d15 = (d13 * d10 + d14 * d12) * 2D;
                d3 = d15;
            }
            d = d4 + d10 * d3;
            d1 = d5 + d11 * d3;
            d2 = d6 + d12 * d3;
            if(d11 < 0.0D)
            {
                d1++;
            }
            if(d11 > 0.0D)
            {
                d1 += 0.5D;
            }
            return aj.func_1248_b(d, d1, d2);
        } else
        {
            return null;
        }
    }

    protected void func_352_a(hm hm1)
    {
        hm1.func_758_a("Type", field_861_d);
        if(field_861_d == 2)
        {
            hm1.func_765_a("PushX", field_859_f);
            hm1.func_765_a("PushZ", field_858_g);
            hm1.func_749_a("Fuel", (short)field_860_e);
        } else
        if(field_861_d == 1)
        {
            ki ki1 = new ki();
            for(int i = 0; i < field_857_h.length; i++)
            {
                if(field_857_h[i] != null)
                {
                    hm hm2 = new hm();
                    hm2.func_761_a("Slot", (byte)i);
                    field_857_h[i].func_1086_a(hm2);
                    ki1.func_742_a(hm2);
                }
            }

            hm1.func_762_a("Items", ki1);
        }
    }

    protected void func_357_b(hm hm1)
    {
        field_861_d = hm1.func_756_e("Type");
        if(field_861_d == 2)
        {
            field_859_f = hm1.func_757_h("PushX");
            field_858_g = hm1.func_757_h("PushZ");
            field_860_e = hm1.func_745_d("Fuel");
        } else
        if(field_861_d == 1)
        {
            ki ki1 = hm1.func_753_l("Items");
            field_857_h = new ev[func_469_c()];
            for(int i = 0; i < ki1.func_740_c(); i++)
            {
                hm hm2 = (hm)ki1.func_741_a(i);
                int j = hm2.func_746_c("Slot") & 0xff;
                if(j >= 0 && j < field_857_h.length)
                {
                    field_857_h[j] = new ev(hm2);
                }
            }

        }
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public void func_380_f(kh kh1)
    {
        if(kh1 == field_617_ae)
        {
            return;
        }
        if((kh1 instanceof ge) && !(kh1 instanceof dm) && field_861_d == 0 && field_608_an * field_608_an + field_606_ap * field_606_ap > 0.01D && field_617_ae == null && kh1.field_616_af == null)
        {
            kh1.func_386_g(this);
        }
        double d = kh1.field_611_ak - field_611_ak;
        double d1 = kh1.field_609_am - field_609_am;
        double d2 = d * d + d1 * d1;
        if(d2 >= 9.9999997473787516E-005D)
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
            d *= 0.10000000149011612D;
            d1 *= 0.10000000149011612D;
            d *= 1.0F - field_632_aO;
            d1 *= 1.0F - field_632_aO;
            d *= 0.5D;
            d1 *= 0.5D;
            if(kh1 instanceof oc)
            {
                double d4 = kh1.field_608_an + field_608_an;
                double d5 = kh1.field_606_ap + field_606_ap;
                if(((oc)kh1).field_861_d == 2 && field_861_d != 2)
                {
                    field_608_an *= 0.20000000298023224D;
                    field_606_ap *= 0.20000000298023224D;
                    func_348_f(kh1.field_608_an - d, 0.0D, kh1.field_606_ap - d1);
                    kh1.field_608_an *= 0.69999998807907104D;
                    kh1.field_606_ap *= 0.69999998807907104D;
                } else
                if(((oc)kh1).field_861_d != 2 && field_861_d == 2)
                {
                    kh1.field_608_an *= 0.20000000298023224D;
                    kh1.field_606_ap *= 0.20000000298023224D;
                    kh1.func_348_f(field_608_an + d, 0.0D, field_606_ap + d1);
                    field_608_an *= 0.69999998807907104D;
                    field_606_ap *= 0.69999998807907104D;
                } else
                {
                    d4 /= 2D;
                    d5 /= 2D;
                    field_608_an *= 0.20000000298023224D;
                    field_606_ap *= 0.20000000298023224D;
                    func_348_f(d4 - d, 0.0D, d5 - d1);
                    kh1.field_608_an *= 0.20000000298023224D;
                    kh1.field_606_ap *= 0.20000000298023224D;
                    kh1.func_348_f(d4 + d, 0.0D, d5 + d1);
                }
            } else
            {
                func_348_f(-d, 0.0D, -d1);
                kh1.func_348_f(d / 4D, 0.0D, d1 / 4D);
            }
        }
    }

    public int func_469_c()
    {
        return 27;
    }

    public ev func_468_c(int i)
    {
        return field_857_h[i];
    }

    public ev func_473_a(int i, int j)
    {
        if(field_857_h[i] != null)
        {
            if(field_857_h[i].field_1615_a <= j)
            {
                ev ev1 = field_857_h[i];
                field_857_h[i] = null;
                return ev1;
            }
            ev ev2 = field_857_h[i].func_1085_a(j);
            if(field_857_h[i].field_1615_a == 0)
            {
                field_857_h[i] = null;
            }
            return ev2;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ev ev1)
    {
        field_857_h[i] = ev1;
        if(ev1 != null && ev1.field_1615_a > func_470_e())
        {
            ev1.field_1615_a = func_470_e();
        }
    }

    public String func_471_d()
    {
        return "Minecart";
    }

    public int func_470_e()
    {
        return 64;
    }

    public void func_474_j_()
    {
    }

    public boolean func_353_a(dm dm1)
    {
        if(field_861_d == 0)
        {
            dm1.func_386_g(this);
        } else
        if(field_861_d == 1)
        {
            dm1.func_452_a(this);
        } else
        if(field_861_d == 2)
        {
            ev ev1 = dm1.field_778_b.func_494_a();
            if(ev1 != null && ev1.field_1617_c == di.field_225_k.field_291_aS)
            {
                if(--ev1.field_1615_a == 0)
                {
                    dm1.field_778_b.func_472_a(dm1.field_778_b.field_847_d, null);
                }
                field_860_e += 1200;
            }
            field_859_f = field_611_ak - dm1.field_611_ak;
            field_858_g = field_609_am - dm1.field_609_am;
        }
        return true;
    }

    public void func_378_a(double d, double d1, double d2, float f, 
            float f1, int i)
    {
        field_853_l = d;
        field_852_m = d1;
        field_851_n = d2;
        field_850_o = f;
        field_849_p = f1;
        field_854_k = i;
    }

    private ev field_857_h[];
    public int field_864_a;
    public int field_863_b;
    public int field_862_c;
    private boolean field_856_i;
    public int field_861_d;
    public int field_860_e;
    public double field_859_f;
    public double field_858_g;
    private static final int field_855_j[][][] = {
        {
            {
                0, 0, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, -1, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, -1, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                0, -1, 1
            }
        }, {
            {
                0, -1, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                0, 0, 1
            }, {
                1, 0, 0
            }
        }, {
            {
                0, 0, 1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                1, 0, 0
            }
        }
    };
    private int field_854_k;
    private double field_853_l;
    private double field_852_m;
    private double field_851_n;
    private double field_850_o;
    private double field_849_p;

}
