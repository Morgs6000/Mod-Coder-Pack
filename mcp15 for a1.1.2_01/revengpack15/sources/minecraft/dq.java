// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class dq extends ek
    implements co
{

    public dq(cn cn1)
    {
        super(cn1);
        field_762_e = 2;
        field_717_E = 20;
    }

    public void func_425_j()
    {
        float f = func_382_a(1.0F);
        if(f > 0.5F)
        {
            field_701_U += 2;
        }
        super.func_425_j();
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_615_ag.field_1039_l == 0)
        {
            func_395_F();
        }
    }

    protected kh func_438_i()
    {
        dm dm = field_615_ag.func_609_a(this, 16D);
        if(dm != null && func_420_c(dm))
        {
            return dm;
        } else
        {
            return null;
        }
    }

    public boolean func_396_a(kh kh1, int i)
    {
        if(super.func_396_a(kh1, i))
        {
            if(field_617_ae == kh1 || field_616_af == kh1)
            {
                return true;
            }
            if(kh1 != this)
            {
                field_751_f = kh1;
            }
            return true;
        } else
        {
            return false;
        }
    }

    protected void func_437_a(kh kh1, float f)
    {
        if((double)f < 2.5D && kh1.field_601_au.field_1702_e > field_601_au.field_1697_b && kh1.field_601_au.field_1697_b < field_601_au.field_1702_e)
        {
            field_711_K = 20;
            kh1.func_396_a(this, field_762_e);
        }
    }

    protected float func_439_a(int i, int j, int k)
    {
        return 0.5F - field_615_ag.func_598_c(i, j, k);
    }

    public void func_352_a(hm hm)
    {
        super.func_352_a(hm);
    }

    public void func_357_b(hm hm)
    {
        super.func_357_b(hm);
    }

    public boolean func_433_a()
    {
        int i = eo.b(field_611_ak);
        int j = eo.b(field_601_au.field_1697_b);
        int k = eo.b(field_609_am);
        if(field_615_ag.func_641_a(by.Sky, i, j, k) > field_630_aQ.nextInt(32))
        {
            return false;
        } else
        {
            int l = field_615_ag.func_618_j(i, j, k);
            return l <= field_630_aQ.nextInt(8) && super.func_433_a();
        }
    }

    protected int field_762_e;
}
