// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class dx extends kh
{

    public dx(cn cn1, double d, double d1, double d2, 
            ev ev1)
    {
        super(cn1);
        field_800_b = 0;
        field_802_f = 5;
        field_804_d = (float)(Math.random() * 3.1415926535897931D * 2D);
        func_371_a(0.25F, 0.25F);
        field_645_aB = field_643_aD / 2.0F;
        func_347_a(d, d1, d2);
        field_801_a = ev1;
        field_605_aq = (float)(Math.random() * 360D);
        field_608_an = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
        field_607_ao = 0.20000000298023224D;
        field_606_ap = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
        field_640_aG = false;
    }

    public dx(cn cn1)
    {
        super(cn1);
        field_800_b = 0;
        field_802_f = 5;
        field_804_d = (float)(Math.random() * 3.1415926535897931D * 2D);
        func_371_a(0.25F, 0.25F);
        field_645_aB = field_643_aD / 2.0F;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_805_c > 0)
        {
            field_805_c--;
        }
        field_614_ah = field_611_ak;
        field_613_ai = field_610_al;
        field_612_aj = field_609_am;
        field_607_ao -= 0.039999999105930328D;
        if(field_615_ag.func_599_f(eo.b(field_611_ak), eo.b(field_610_al), eo.b(field_609_am)) == gb.field_1331_g)
        {
            field_607_ao = 0.20000000298023224D;
            field_608_an = (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F;
            field_606_ap = (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F;
            field_615_ag.func_623_a(this, "random.fizz", 0.4F, 2.0F + field_630_aQ.nextFloat() * 0.4F);
        }
        func_466_g(field_611_ak, field_610_al, field_609_am);
        func_397_g_();
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        float f = 0.98F;
        if(field_600_av)
        {
            f = 0.5880001F;
            int i = field_615_ag.func_600_a(eo.b(field_611_ak), eo.b(field_601_au.field_1697_b) - 1, eo.b(field_609_am));
            if(i > 0)
            {
                f = ly.field_345_n[i].field_355_bo * 0.98F;
            }
        }
        field_608_an *= f;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= f;
        if(field_600_av)
        {
            field_607_ao *= -0.5D;
        }
        field_803_e++;
        field_800_b++;
        if(field_800_b >= 6000)
        {
            func_395_F();
        }
    }

    public boolean func_397_g_()
    {
        return field_615_ag.func_682_a(field_601_au, gb.field_1332_f, this);
    }

    private boolean func_466_g(double d, double d1, double d2)
    {
        int i = eo.b(d);
        int j = eo.b(d1);
        int k = eo.b(d2);
        double d3 = d - (double)i;
        double d4 = d1 - (double)j;
        double d5 = d2 - (double)k;
        if(ly.field_343_p[field_615_ag.func_600_a(i, j, k)])
        {
            boolean flag = !ly.field_343_p[field_615_ag.func_600_a(i - 1, j, k)];
            boolean flag1 = !ly.field_343_p[field_615_ag.func_600_a(i + 1, j, k)];
            boolean flag2 = !ly.field_343_p[field_615_ag.func_600_a(i, j - 1, k)];
            boolean flag3 = !ly.field_343_p[field_615_ag.func_600_a(i, j + 1, k)];
            boolean flag4 = !ly.field_343_p[field_615_ag.func_600_a(i, j, k - 1)];
            boolean flag5 = !ly.field_343_p[field_615_ag.func_600_a(i, j, k + 1)];
            byte byte0 = -1;
            double d6 = 9999D;
            if(flag && d3 < d6)
            {
                d6 = d3;
                byte0 = 0;
            }
            if(flag1 && 1.0D - d3 < d6)
            {
                d6 = 1.0D - d3;
                byte0 = 1;
            }
            if(flag2 && d4 < d6)
            {
                d6 = d4;
                byte0 = 2;
            }
            if(flag3 && 1.0D - d4 < d6)
            {
                d6 = 1.0D - d4;
                byte0 = 3;
            }
            if(flag4 && d5 < d6)
            {
                d6 = d5;
                byte0 = 4;
            }
            if(flag5 && 1.0D - d5 < d6)
            {
                double d7 = 1.0D - d5;
                byte0 = 5;
            }
            float f = field_630_aQ.nextFloat() * 0.2F + 0.1F;
            if(byte0 == 0)
            {
                field_608_an = -f;
            }
            if(byte0 == 1)
            {
                field_608_an = f;
            }
            if(byte0 == 2)
            {
                field_607_ao = -f;
            }
            if(byte0 == 3)
            {
                field_607_ao = f;
            }
            if(byte0 == 4)
            {
                field_606_ap = -f;
            }
            if(byte0 == 5)
            {
                field_606_ap = f;
            }
        }
        return false;
    }

    protected void func_355_a(int i)
    {
        func_396_a(null, i);
    }

    public boolean func_396_a(kh kh1, int i)
    {
        field_802_f -= i;
        if(field_802_f <= 0)
        {
            func_395_F();
        }
        return false;
    }

    public void func_352_a(hm hm1)
    {
        hm1.func_749_a("Health", (byte)field_802_f);
        hm1.func_749_a("Age", (short)field_800_b);
        hm1.func_763_a("Item", field_801_a.func_1086_a(new hm()));
    }

    public void func_357_b(hm hm1)
    {
        field_802_f = hm1.func_745_d("Health") & 0xff;
        field_800_b = hm1.func_745_d("Age");
        hm hm2 = hm1.func_743_k("Item");
        field_801_a = new ev(hm2);
    }

    public void func_362_b(dm dm1)
    {
        if(field_615_ag.field_1026_y)
        {
            return;
        }
        int i = field_801_a.field_1615_a;
        if(field_805_c == 0 && dm1.field_778_b.func_504_a(field_801_a))
        {
            field_615_ag.func_623_a(this, "random.pop", 0.2F, ((field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            dm1.func_443_a_(this, i);
            func_395_F();
        }
    }

    public ev field_801_a;
    private int field_803_e;
    public int field_800_b;
    public int field_805_c;
    private int field_802_f;
    public float field_804_d;
}
