// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ke extends ic
    implements gh
{

    public ke()
    {
        field_833_a = new ev[3];
        field_832_b = 0;
        field_835_c = 0;
        field_834_d = 0;
    }

    public int func_469_c()
    {
        return field_833_a.length;
    }

    public ev func_468_c(int i)
    {
        return field_833_a[i];
    }

    public ev func_473_a(int i, int j)
    {
        if(field_833_a[i] != null)
        {
            if(field_833_a[i].field_1615_a <= j)
            {
                ev ev1 = field_833_a[i];
                field_833_a[i] = null;
                return ev1;
            }
            ev ev2 = field_833_a[i].func_1085_a(j);
            if(field_833_a[i].field_1615_a == 0)
            {
                field_833_a[i] = null;
            }
            return ev2;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ev ev1)
    {
        field_833_a[i] = ev1;
        if(ev1 != null && ev1.field_1615_a > func_470_e())
        {
            ev1.field_1615_a = func_470_e();
        }
    }

    public String func_471_d()
    {
        return "Chest";
    }

    public void func_482_a(hm hm1)
    {
        super.func_482_a(hm1);
        ki ki1 = hm1.func_753_l("Items");
        field_833_a = new ev[func_469_c()];
        for(int i = 0; i < ki1.func_740_c(); i++)
        {
            hm hm2 = (hm)ki1.func_741_a(i);
            byte byte0 = hm2.func_746_c("Slot");
            if(byte0 >= 0 && byte0 < field_833_a.length)
            {
                field_833_a[byte0] = new ev(hm2);
            }
        }

        field_832_b = hm1.func_745_d("BurnTime");
        field_834_d = hm1.func_745_d("CookTime");
        field_835_c = func_488_a(field_833_a[1]);
    }

    public void func_481_b(hm hm1)
    {
        super.func_481_b(hm1);
        hm1.func_749_a("BurnTime", (short)field_832_b);
        hm1.func_749_a("CookTime", (short)field_834_d);
        ki ki1 = new ki();
        for(int i = 0; i < field_833_a.length; i++)
        {
            if(field_833_a[i] != null)
            {
                hm hm2 = new hm();
                hm2.func_761_a("Slot", (byte)i);
                field_833_a[i].func_1086_a(hm2);
                ki1.func_742_a(hm2);
            }
        }

        hm1.func_762_a("Items", ki1);
    }

    public int func_470_e()
    {
        return 64;
    }

    public int func_490_a(int i)
    {
        return (field_834_d * i) / 200;
    }

    public int func_489_b(int i)
    {
        if(field_835_c == 0)
        {
            field_835_c = 200;
        }
        return (field_832_b * i) / field_835_c;
    }

    public boolean func_485_a()
    {
        return field_832_b > 0;
    }

    public void func_475_b()
    {
        boolean flag = field_832_b > 0;
        boolean flag1 = false;
        if(field_832_b > 0)
        {
            field_832_b--;
        }
        if(!field_824_e.field_1026_y)
        {
            if(field_832_b == 0 && func_491_j())
            {
                field_835_c = field_832_b = func_488_a(field_833_a[1]);
                if(field_832_b > 0)
                {
                    flag1 = true;
                    if(field_833_a[1] != null)
                    {
                        field_833_a[1].field_1615_a--;
                        if(field_833_a[1].field_1615_a == 0)
                        {
                            field_833_a[1] = null;
                        }
                    }
                }
            }
            if(func_485_a() && func_491_j())
            {
                field_834_d++;
                if(field_834_d == 200)
                {
                    field_834_d = 0;
                    func_487_i();
                    flag1 = true;
                }
            } else
            {
                field_834_d = 0;
            }
            if(flag != (field_832_b > 0))
            {
                flag1 = true;
                ku.func_285_a(field_832_b > 0, field_824_e, field_823_f, field_822_g, field_821_h);
            }
        }
        if(flag1)
        {
            func_474_j_();
        }
    }

    private boolean func_491_j()
    {
        if(field_833_a[0] == null)
        {
            return false;
        }
        int i = func_486_d(field_833_a[0].func_1091_a().field_291_aS);
        if(i < 0)
        {
            return false;
        }
        if(field_833_a[2] == null)
        {
            return true;
        }
        if(field_833_a[2].field_1617_c != i)
        {
            return false;
        }
        if(field_833_a[2].field_1615_a < func_470_e() && field_833_a[2].field_1615_a < field_833_a[2].func_1089_c())
        {
            return true;
        }
        return field_833_a[2].field_1615_a < di.field_233_c[i].func_200_b();
    }

    public void func_487_i()
    {
        if(!func_491_j())
        {
            return;
        }
        int i = func_486_d(field_833_a[0].func_1091_a().field_291_aS);
        if(field_833_a[2] == null)
        {
            field_833_a[2] = new ev(i, 1);
        } else
        if(field_833_a[2].field_1617_c == i)
        {
            field_833_a[2].field_1615_a++;
        }
        field_833_a[0].field_1615_a--;
        if(field_833_a[0].field_1615_a <= 0)
        {
            field_833_a[0] = null;
        }
    }

    private int func_486_d(int i)
    {
        if(i == ly.field_388_I.field_376_bc)
        {
            return di.field_223_m.field_291_aS;
        }
        if(i == ly.field_390_H.field_376_bc)
        {
            return di.field_222_n.field_291_aS;
        }
        if(i == ly.field_391_ax.field_376_bc)
        {
            return di.field_224_l.field_291_aS;
        }
        if(i == ly.field_393_F.field_376_bc)
        {
            return ly.field_382_N.field_376_bc;
        }
        if(i == di.field_272_ao.field_291_aS)
        {
            return di.field_271_ap.field_291_aS;
        }
        if(i == ly.field_335_x.field_376_bc)
        {
            return ly.field_338_u.field_376_bc;
        }
        if(i == di.field_303_aG.field_291_aS)
        {
            return di.field_304_aF.field_291_aS;
        } else
        {
            return -1;
        }
    }

    private int func_488_a(ev ev1)
    {
        if(ev1 == null)
        {
            return 0;
        }
        int i = ev1.func_1091_a().field_291_aS;
        if(i < 256 && ly.field_345_n[i].field_356_bn == gb.field_1335_c)
        {
            return 300;
        }
        if(i == di.field_266_B.field_291_aS)
        {
            return 100;
        }
        if(i == di.field_225_k.field_291_aS)
        {
            return 1600;
        }
        return i != di.field_258_aw.field_291_aS ? 0 : 20000;
    }

    private ev field_833_a[];
    private int field_832_b;
    private int field_835_c;
    private int field_834_d;
}
