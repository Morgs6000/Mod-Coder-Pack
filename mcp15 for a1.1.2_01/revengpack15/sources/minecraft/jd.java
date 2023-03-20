// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class jd extends kh
{

    public jd(cn cn1)
    {
        super(cn1);
        field_689_a = 0;
        field_618_ad = true;
        func_371_a(0.98F, 0.98F);
        field_645_aB = field_643_aD / 2.0F;
    }

    public jd(cn cn1, float f, float f1, float f2)
    {
        this(cn1);
        func_347_a(f, f1, f2);
        float f3 = (float)(Math.random() * 3.1415927410125732D * 2D);
        field_608_an = -eo.func_1106_a((f3 * 3.141593F) / 180F) * 0.02F;
        field_607_ao = 0.20000000298023224D;
        field_606_ap = -eo.func_1114_b((f3 * 3.141593F) / 180F) * 0.02F;
        field_640_aG = false;
        field_689_a = 80;
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
        field_614_ah = field_611_ak;
        field_613_ai = field_610_al;
        field_612_aj = field_609_am;
        field_607_ao -= 0.039999999105930328D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98000001907348633D;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= 0.98000001907348633D;
        if(field_600_av)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
            field_607_ao *= -0.5D;
        }
        if(field_689_a-- <= 0)
        {
            func_395_F();
            func_409_i();
        } else
        {
            field_615_ag.func_694_a("smoke", field_611_ak, field_610_al + 0.5D, field_609_am, 0.0D, 0.0D, 0.0D);
        }
    }

    private void func_409_i()
    {
        float f = 4F;
        field_615_ag.func_676_a(null, field_611_ak, field_610_al, field_609_am, f);
    }

    protected void func_352_a(hm hm1)
    {
        hm1.func_761_a("Fuse", (byte)field_689_a);
    }

    protected void func_357_b(hm hm1)
    {
        field_689_a = hm1.func_746_c("Fuse");
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public int field_689_a;
}
