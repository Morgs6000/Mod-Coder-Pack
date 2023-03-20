// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;

public class jc extends kh
{

    public jc(cn cn1)
    {
        super(cn1);
        field_695_c = 0;
        field_691_a = 0;
        field_645_aB = 0.0F;
        func_371_a(0.5F, 0.5F);
    }

    public jc(cn cn1, int i, int j, int k, int l)
    {
        this(cn1);
        field_694_d = i;
        field_693_e = j;
        field_692_f = k;
        ArrayList arraylist = new ArrayList();
        er aer[] = er.values();
        int i1 = aer.length;
        for(int j1 = 0; j1 < i1; j1++)
        {
            er er1 = aer[j1];
            field_690_b = er1;
            func_412_b(l);
            if(func_410_i())
            {
                arraylist.add(er1);
            }
        }

        if(arraylist.size() > 0)
        {
            field_690_b = (er)arraylist.get(field_630_aQ.nextInt(arraylist.size()));
        }
        func_412_b(l);
    }

    public void func_412_b(int i)
    {
        field_691_a = i;
        field_603_as = field_605_aq = i * 90;
        float f = field_690_b.field_1623_z;
        float f1 = field_690_b.field_1636_A;
        float f2 = field_690_b.field_1623_z;
        if(i == 0 || i == 2)
        {
            f2 = 0.5F;
        } else
        {
            f = 0.5F;
        }
        f /= 32F;
        f1 /= 32F;
        f2 /= 32F;
        float f3 = (float)field_694_d + 0.5F;
        float f4 = (float)field_693_e + 0.5F;
        float f5 = (float)field_692_f + 0.5F;
        float f6 = 0.5625F;
        if(i == 0)
        {
            f5 -= f6;
        }
        if(i == 1)
        {
            f3 -= f6;
        }
        if(i == 2)
        {
            f5 += f6;
        }
        if(i == 3)
        {
            f3 += f6;
        }
        if(i == 0)
        {
            f3 -= func_411_c(field_690_b.field_1623_z);
        }
        if(i == 1)
        {
            f5 += func_411_c(field_690_b.field_1623_z);
        }
        if(i == 2)
        {
            f3 += func_411_c(field_690_b.field_1623_z);
        }
        if(i == 3)
        {
            f5 -= func_411_c(field_690_b.field_1623_z);
        }
        f4 += func_411_c(field_690_b.field_1636_A);
        func_347_a(f3, f4, f5);
        float f7 = -0.00625F;
        field_601_au.func_1165_c(f3 - f - f7, f4 - f1 - f7, f5 - f2 - f7, f3 + f + f7, f4 + f1 + f7, f5 + f2 + f7);
    }

    private float func_411_c(int i)
    {
        if(i == 32)
        {
            return 0.5F;
        }
        return i != 64 ? 0.0F : 0.5F;
    }

    public void func_370_e_()
    {
        if(field_695_c++ == 100 && !func_410_i())
        {
            field_695_c = 0;
            func_395_F();
            field_615_ag.func_674_a(new dx(field_615_ag, field_611_ak, field_610_al, field_609_am, new ev(di.field_270_aq)));
        }
    }

    public boolean func_410_i()
    {
        if(field_615_ag.func_697_a(this, field_601_au).size() > 0)
        {
            return false;
        }
        int i = field_690_b.field_1623_z / 16;
        int j = field_690_b.field_1636_A / 16;
        int k = field_694_d;
        int l = field_693_e;
        int i1 = field_692_f;
        if(field_691_a == 0)
        {
            k = eo.b(field_611_ak - (double)((float)field_690_b.field_1623_z / 32F));
        }
        if(field_691_a == 1)
        {
            i1 = eo.b(field_609_am - (double)((float)field_690_b.field_1623_z / 32F));
        }
        if(field_691_a == 2)
        {
            k = eo.b(field_611_ak - (double)((float)field_690_b.field_1623_z / 32F));
        }
        if(field_691_a == 3)
        {
            i1 = eo.b(field_609_am - (double)((float)field_690_b.field_1623_z / 32F));
        }
        l = eo.b(field_610_al - (double)((float)field_690_b.field_1636_A / 32F));
        for(int j1 = 0; j1 < i; j1++)
        {
            for(int k1 = 0; k1 < j; k1++)
            {
                gb gb1;
                if(field_691_a == 0 || field_691_a == 2)
                {
                    gb1 = field_615_ag.func_599_f(k + j1, l + k1, field_692_f);
                } else
                {
                    gb1 = field_615_ag.func_599_f(field_694_d, l + k1, i1 + j1);
                }
                if(!gb1.func_878_a())
                {
                    return false;
                }
            }

        }

        List list = field_615_ag.func_659_b(this, field_601_au);
        for(int l1 = 0; l1 < list.size(); l1++)
        {
            if(list.get(l1) instanceof jc)
            {
                return false;
            }
        }

        return true;
    }

    public boolean func_401_c_()
    {
        return true;
    }

    public boolean func_396_a(kh kh1, int i)
    {
        func_395_F();
        field_615_ag.func_674_a(new dx(field_615_ag, field_611_ak, field_610_al, field_609_am, new ev(di.field_270_aq)));
        return true;
    }

    public void func_352_a(hm hm1)
    {
        hm1.func_761_a("Dir", (byte)field_691_a);
        hm1.func_754_a("Motive", field_690_b.field_1624_y);
        hm1.func_758_a("TileX", field_694_d);
        hm1.func_758_a("TileY", field_693_e);
        hm1.func_758_a("TileZ", field_692_f);
    }

    public void func_357_b(hm hm1)
    {
        field_691_a = hm1.func_746_c("Dir");
        field_694_d = hm1.func_756_e("TileX");
        field_693_e = hm1.func_756_e("TileY");
        field_692_f = hm1.func_756_e("TileZ");
        String s = hm1.func_755_i("Motive");
        er aer[] = er.values();
        int i = aer.length;
        for(int j = 0; j < i; j++)
        {
            er er1 = aer[j];
            if(er1.field_1624_y.equals(s))
            {
                field_690_b = er1;
            }
        }

        if(field_690_b == null)
        {
            field_690_b = er.Kebab;
        }
        func_412_b(field_691_a);
    }

    private int field_695_c;
    public int field_691_a;
    private int field_694_d;
    private int field_693_e;
    private int field_692_f;
    public er field_690_b;
}
