// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class kg extends kh
{

    public kg(cn cn1)
    {
        super(cn1);
        field_687_b = -1;
        field_686_c = -1;
        field_685_d = -1;
        field_684_e = 0;
        field_683_f = false;
        field_688_a = 0;
        field_680_i = 0;
        func_371_a(0.5F, 0.5F);
    }

    public kg(cn cn1, ge ge1)
    {
        super(cn1);
        field_687_b = -1;
        field_686_c = -1;
        field_685_d = -1;
        field_684_e = 0;
        field_683_f = false;
        field_688_a = 0;
        field_680_i = 0;
        field_682_g = ge1;
        func_371_a(0.5F, 0.5F);
        func_365_c(ge1.field_611_ak, ge1.field_610_al, ge1.field_609_am, ge1.field_605_aq, ge1.field_604_ar);
        field_611_ak -= eo.func_1114_b((field_605_aq / 180F) * 3.141593F) * 0.16F;
        field_610_al -= 0.10000000149011612D;
        field_609_am -= eo.func_1106_a((field_605_aq / 180F) * 3.141593F) * 0.16F;
        func_347_a(field_611_ak, field_610_al, field_609_am);
        field_645_aB = 0.0F;
        field_608_an = -eo.func_1106_a((field_605_aq / 180F) * 3.141593F) * eo.func_1114_b((field_604_ar / 180F) * 3.141593F);
        field_606_ap = eo.func_1114_b((field_605_aq / 180F) * 3.141593F) * eo.func_1114_b((field_604_ar / 180F) * 3.141593F);
        field_607_ao = -eo.func_1106_a((field_604_ar / 180F) * 3.141593F);
        func_408_a(field_608_an, field_607_ao, field_606_ap, 1.5F, 1.0F);
    }

    public void func_408_a(double d, double d1, double d2, float f, 
            float f1)
    {
        float f2 = eo.func_1109_a(d * d + d1 * d1 + d2 * d2);
        d /= f2;
        d1 /= f2;
        d2 /= f2;
        d += field_630_aQ.nextGaussian() * 0.0074999998323619366D * (double)f1;
        d1 += field_630_aQ.nextGaussian() * 0.0074999998323619366D * (double)f1;
        d2 += field_630_aQ.nextGaussian() * 0.0074999998323619366D * (double)f1;
        d *= f;
        d1 *= f;
        d2 *= f;
        field_608_an = d;
        field_607_ao = d1;
        field_606_ap = d2;
        float f3 = eo.func_1109_a(d * d + d2 * d2);
        field_603_as = field_605_aq = (float)((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
        field_602_at = field_604_ar = (float)((Math.atan2(d1, f3) * 180D) / 3.1415927410125732D);
        field_681_h = 0;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_688_a > 0)
        {
            field_688_a--;
        }
        if(field_683_f)
        {
            int i = field_615_ag.func_600_a(field_687_b, field_686_c, field_685_d);
            if(i != field_684_e)
            {
                field_683_f = false;
                field_608_an *= field_630_aQ.nextFloat() * 0.2F;
                field_607_ao *= field_630_aQ.nextFloat() * 0.2F;
                field_606_ap *= field_630_aQ.nextFloat() * 0.2F;
                field_681_h = 0;
                field_680_i = 0;
            } else
            {
                field_681_h++;
                if(field_681_h == 1200)
                {
                    func_395_F();
                }
                return;
            }
        } else
        {
            field_680_i++;
        }
        aj aj1 = aj.func_1248_b(field_611_ak, field_610_al, field_609_am);
        aj aj2 = aj.func_1248_b(field_611_ak + field_608_an, field_610_al + field_607_ao, field_609_am + field_606_ap);
        mf mf1 = field_615_ag.func_645_a(aj1, aj2);
        aj1 = aj.func_1248_b(field_611_ak, field_610_al, field_609_am);
        aj2 = aj.func_1248_b(field_611_ak + field_608_an, field_610_al + field_607_ao, field_609_am + field_606_ap);
        if(mf1 != null)
        {
            aj2 = aj.func_1248_b(mf1.field_1169_f.field_1776_a, mf1.field_1169_f.field_1775_b, mf1.field_1169_f.field_1779_c);
        }
        kh kh1 = null;
        List list = field_615_ag.func_659_b(this, field_601_au.func_1170_a(field_608_an, field_607_ao, field_606_ap).func_1177_b(1.0D, 1.0D, 1.0D));
        double d = 0.0D;
        for(int j = 0; j < list.size(); j++)
        {
            kh kh2 = (kh)list.get(j);
            if(!kh2.func_401_c_() || kh2 == field_682_g && field_680_i < 5)
            {
                continue;
            }
            float f3 = 0.3F;
            cf cf1 = kh2.field_601_au.func_1177_b(f3, f3, f3);
            mf mf2 = cf1.func_1169_a(aj1, aj2);
            if(mf2 == null)
            {
                continue;
            }
            double d1 = aj1.func_1251_c(mf2.field_1169_f);
            if(d1 < d || d == 0.0D)
            {
                kh1 = kh2;
                d = d1;
            }
        }

        if(kh1 != null)
        {
            mf1 = new mf(kh1);
        }
        if(mf1 != null)
        {
            if(mf1.field_1168_g != null)
            {
                if(mf1.field_1168_g.func_396_a(field_682_g, 4))
                {
                    field_615_ag.func_623_a(this, "random.drr", 1.0F, 1.2F / (field_630_aQ.nextFloat() * 0.2F + 0.9F));
                    func_395_F();
                } else
                {
                    field_608_an *= -0.10000000149011612D;
                    field_607_ao *= -0.10000000149011612D;
                    field_606_ap *= -0.10000000149011612D;
                    field_605_aq += 180F;
                    field_603_as += 180F;
                    field_680_i = 0;
                }
            } else
            {
                field_687_b = mf1.field_1166_b;
                field_686_c = mf1.field_1172_c;
                field_685_d = mf1.field_1171_d;
                field_684_e = field_615_ag.func_600_a(field_687_b, field_686_c, field_685_d);
                field_608_an = (float)(mf1.field_1169_f.field_1776_a - field_611_ak);
                field_607_ao = (float)(mf1.field_1169_f.field_1775_b - field_610_al);
                field_606_ap = (float)(mf1.field_1169_f.field_1779_c - field_609_am);
                float f = eo.func_1109_a(field_608_an * field_608_an + field_607_ao * field_607_ao + field_606_ap * field_606_ap);
                field_611_ak -= (field_608_an / (double)f) * 0.05000000074505806D;
                field_610_al -= (field_607_ao / (double)f) * 0.05000000074505806D;
                field_609_am -= (field_606_ap / (double)f) * 0.05000000074505806D;
                field_615_ag.func_623_a(this, "random.drr", 1.0F, 1.2F / (field_630_aQ.nextFloat() * 0.2F + 0.9F));
                field_683_f = true;
                field_688_a = 7;
            }
        }
        field_611_ak += field_608_an;
        field_610_al += field_607_ao;
        field_609_am += field_606_ap;
        float f1 = eo.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap);
        field_605_aq = (float)((Math.atan2(field_608_an, field_606_ap) * 180D) / 3.1415927410125732D);
        for(field_604_ar = (float)((Math.atan2(field_607_ao, f1) * 180D) / 3.1415927410125732D); field_604_ar - field_602_at < -180F; field_602_at -= 360F) { }
        for(; field_604_ar - field_602_at >= 180F; field_602_at += 360F) { }
        for(; field_605_aq - field_603_as < -180F; field_603_as -= 360F) { }
        for(; field_605_aq - field_603_as >= 180F; field_603_as += 360F) { }
        field_604_ar = field_602_at + (field_604_ar - field_602_at) * 0.2F;
        field_605_aq = field_603_as + (field_605_aq - field_603_as) * 0.2F;
        float f2 = 0.99F;
        float f4 = 0.03F;
        if(func_397_g_())
        {
            for(int k = 0; k < 4; k++)
            {
                float f5 = 0.25F;
                field_615_ag.func_694_a("bubble", field_611_ak - field_608_an * (double)f5, field_610_al - field_607_ao * (double)f5, field_609_am - field_606_ap * (double)f5, field_608_an, field_607_ao, field_606_ap);
            }

            f2 = 0.8F;
        }
        field_608_an *= f2;
        field_607_ao *= f2;
        field_606_ap *= f2;
        field_607_ao -= f4;
        func_347_a(field_611_ak, field_610_al, field_609_am);
    }

    public void func_352_a(hm hm1)
    {
        hm1.func_749_a("xTile", (short)field_687_b);
        hm1.func_749_a("yTile", (short)field_686_c);
        hm1.func_749_a("zTile", (short)field_685_d);
        hm1.func_761_a("inTile", (byte)field_684_e);
        hm1.func_761_a("shake", (byte)field_688_a);
        hm1.func_761_a("inGround", (byte)(field_683_f ? 1 : 0));
    }

    public void func_357_b(hm hm1)
    {
        field_687_b = hm1.func_745_d("xTile");
        field_686_c = hm1.func_745_d("yTile");
        field_685_d = hm1.func_745_d("zTile");
        field_684_e = hm1.func_746_c("inTile") & 0xff;
        field_688_a = hm1.func_746_c("shake") & 0xff;
        field_683_f = hm1.func_746_c("inGround") == 1;
    }

    public void func_362_b(dm dm1)
    {
        if(field_683_f && field_682_g == dm1 && field_688_a <= 0 && dm1.field_778_b.func_504_a(new ev(di.field_226_j.field_291_aS, 1)))
        {
            field_615_ag.func_623_a(this, "random.pop", 0.2F, ((field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            dm1.func_443_a_(this, 1);
            func_395_F();
        }
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    private int field_687_b;
    private int field_686_c;
    private int field_685_d;
    private int field_684_e;
    private boolean field_683_f;
    public int field_688_a;
    private ge field_682_g;
    private int field_681_h;
    private int field_680_i;
}
