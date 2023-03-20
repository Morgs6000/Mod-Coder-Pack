// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ff extends kh
{

    public ff(cn cn1)
    {
        super(cn1);
        field_798_b = 0;
    }

    public ff(cn cn1, float f, float f1, float f2, int i)
    {
        super(cn1);
        field_798_b = 0;
        field_799_a = i;
        field_618_ad = true;
        func_371_a(0.98F, 0.98F);
        field_645_aB = field_643_aD / 2.0F;
        func_347_a(f, f1, f2);
        field_608_an = 0.0D;
        field_607_ao = 0.0D;
        field_606_ap = 0.0D;
        field_640_aG = false;
        field_614_ah = f;
        field_613_ai = f1;
        field_612_aj = f2;
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public void func_370_e_()
    {
        if(field_799_a == 0)
        {
            func_395_F();
            return;
        }
        field_614_ah = field_611_ak;
        field_613_ai = field_610_al;
        field_612_aj = field_609_am;
        field_798_b++;
        field_607_ao -= 0.039999999105930328D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98000001907348633D;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= 0.98000001907348633D;
        int i = eo.b(field_611_ak);
        int j = eo.b(field_610_al);
        int k = eo.b(field_609_am);
        if(field_615_ag.func_600_a(i, j, k) == field_799_a)
        {
            field_615_ag.func_690_d(i, j, k, 0);
        }
        if(field_600_av)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
            field_607_ao *= -0.5D;
            func_395_F();
            if(!field_615_ag.func_695_a(field_799_a, i, j, k, true) || !field_615_ag.func_690_d(i, j, k, field_799_a))
            {
                func_367_b(field_799_a, 1);
            }
        } else
        if(field_798_b > 100)
        {
            func_367_b(field_799_a, 1);
            func_395_F();
        }
    }

    protected void func_352_a(hm hm1)
    {
        hm1.func_761_a("Tile", (byte)field_799_a);
    }

    protected void func_357_b(hm hm1)
    {
        field_799_a = hm1.func_746_c("Tile") & 0xff;
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public cn func_465_i()
    {
        return field_615_ag;
    }

    public int field_799_a;
    public int field_798_b;
}
