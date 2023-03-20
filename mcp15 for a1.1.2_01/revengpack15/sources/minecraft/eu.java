// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class eu
    implements gh
{

    public eu(dm dm1)
    {
        field_843_a = new ev[37];
        field_842_b = new ev[4];
        field_848_c = new ev[4];
        field_847_d = 0;
        field_845_f = false;
        field_844_g = dm1;
    }

    public ev func_494_a()
    {
        return field_843_a[field_847_d];
    }

    private int func_505_f(int i)
    {
        for(int j = 0; j < field_843_a.length; j++)
        {
            if(field_843_a[j] != null && field_843_a[j].field_1617_c == i)
            {
                return j;
            }
        }

        return -1;
    }

    private int func_497_g(int i)
    {
        for(int j = 0; j < field_843_a.length; j++)
        {
            if(field_843_a[j] != null && field_843_a[j].field_1617_c == i && field_843_a[j].field_1615_a < field_843_a[j].func_1089_c() && field_843_a[j].field_1615_a < func_470_e())
            {
                return j;
            }
        }

        return -1;
    }

    private int func_499_j()
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] == null)
            {
                return i;
            }
        }

        return -1;
    }

    public void func_496_a(int i, boolean flag)
    {
        int j = func_505_f(i);
        if(j >= 0 && j < 9)
        {
            field_847_d = j;
            return;
        } else
        {
            return;
        }
    }

    public void func_498_a(int i)
    {
        if(i > 0)
        {
            i = 1;
        }
        if(i < 0)
        {
            i = -1;
        }
        for(field_847_d -= i; field_847_d < 0; field_847_d += 9) { }
        for(; field_847_d >= 9; field_847_d -= 9) { }
    }

    private int func_495_b(int i, int j)
    {
        int k = func_497_g(i);
        if(k < 0)
        {
            k = func_499_j();
        }
        if(k < 0)
        {
            return j;
        }
        if(field_843_a[k] == null)
        {
            field_843_a[k] = new ev(i, 0);
        }
        int l = j;
        if(l > field_843_a[k].func_1089_c() - field_843_a[k].field_1615_a)
        {
            l = field_843_a[k].func_1089_c() - field_843_a[k].field_1615_a;
        }
        if(l > func_470_e() - field_843_a[k].field_1615_a)
        {
            l = func_470_e() - field_843_a[k].field_1615_a;
        }
        if(l == 0)
        {
            return j;
        } else
        {
            j -= l;
            field_843_a[k].field_1615_a += l;
            field_843_a[k].field_1614_b = 5;
            return j;
        }
    }

    public void func_511_b()
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] != null && field_843_a[i].field_1614_b > 0)
            {
                field_843_a[i].field_1614_b--;
            }
        }

    }

    public boolean func_510_b(int i)
    {
        int j = func_505_f(i);
        if(j < 0)
        {
            return false;
        }
        if(--field_843_a[j].field_1615_a <= 0)
        {
            field_843_a[j] = null;
        }
        return true;
    }

    public boolean func_504_a(ev ev1)
    {
        if(ev1.field_1616_d == 0)
        {
            ev1.field_1615_a = func_495_b(ev1.field_1617_c, ev1.field_1615_a);
            if(ev1.field_1615_a == 0)
            {
                return true;
            }
        }
        int i = func_499_j();
        if(i >= 0)
        {
            field_843_a[i] = ev1;
            field_843_a[i].field_1614_b = 5;
            return true;
        } else
        {
            return false;
        }
    }

    public ev func_473_a(int i, int j)
    {
        ev aev[] = field_843_a;
        if(i >= field_843_a.length)
        {
            aev = field_842_b;
            i -= field_843_a.length;
        }
        if(aev[i] != null)
        {
            if(aev[i].field_1615_a <= j)
            {
                ev ev1 = aev[i];
                aev[i] = null;
                return ev1;
            }
            ev ev2 = aev[i].func_1085_a(j);
            if(aev[i].field_1615_a == 0)
            {
                aev[i] = null;
            }
            return ev2;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ev ev1)
    {
        ev aev[] = field_843_a;
        if(i >= aev.length)
        {
            i -= aev.length;
            aev = field_842_b;
        }
        if(i >= aev.length)
        {
            i -= aev.length;
            aev = field_848_c;
        }
        aev[i] = ev1;
    }

    public float func_508_a(ly ly1)
    {
        float f = 1.0F;
        if(field_843_a[field_847_d] != null)
        {
            f *= field_843_a[field_847_d].func_1098_a(ly1);
        }
        return f;
    }

    public ki func_493_a(ki ki1)
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] != null)
            {
                hm hm1 = new hm();
                hm1.func_761_a("Slot", (byte)i);
                field_843_a[i].func_1086_a(hm1);
                ki1.func_742_a(hm1);
            }
        }

        for(int j = 0; j < field_842_b.length; j++)
        {
            if(field_842_b[j] != null)
            {
                hm hm2 = new hm();
                hm2.func_761_a("Slot", (byte)(j + 100));
                field_842_b[j].func_1086_a(hm2);
                ki1.func_742_a(hm2);
            }
        }

        for(int k = 0; k < field_848_c.length; k++)
        {
            if(field_848_c[k] != null)
            {
                hm hm3 = new hm();
                hm3.func_761_a("Slot", (byte)(k + 80));
                field_848_c[k].func_1086_a(hm3);
                ki1.func_742_a(hm3);
            }
        }

        return ki1;
    }

    public void func_513_b(ki ki1)
    {
        field_843_a = new ev[36];
        field_842_b = new ev[4];
        field_848_c = new ev[4];
        for(int i = 0; i < ki1.func_740_c(); i++)
        {
            hm hm1 = (hm)ki1.func_741_a(i);
            int j = hm1.func_746_c("Slot") & 0xff;
            if(j >= 0 && j < field_843_a.length)
            {
                field_843_a[j] = new ev(hm1);
            }
            if(j >= 80 && j < field_848_c.length + 80)
            {
                field_848_c[j - 80] = new ev(hm1);
            }
            if(j >= 100 && j < field_842_b.length + 100)
            {
                field_842_b[j - 100] = new ev(hm1);
            }
        }

    }

    public int func_469_c()
    {
        return field_843_a.length + 4;
    }

    public ev func_468_c(int i)
    {
        ev aev[] = field_843_a;
        if(i >= aev.length)
        {
            i -= aev.length;
            aev = field_842_b;
        }
        if(i >= aev.length)
        {
            i -= aev.length;
            aev = field_848_c;
        }
        return aev[i];
    }

    public String func_471_d()
    {
        return "Inventory";
    }

    public int func_470_e()
    {
        return 64;
    }

    public int func_502_a(kh kh)
    {
        ev ev1 = func_468_c(field_847_d);
        if(ev1 != null)
        {
            return ev1.func_1095_a(kh);
        } else
        {
            return 1;
        }
    }

    public boolean func_509_b(ly ly1)
    {
        if(ly1.field_356_bn != gb.field_1334_d && ly1.field_356_bn != gb.field_1333_e && ly1.field_356_bn != gb.field_1318_t && ly1.field_356_bn != gb.field_1319_s)
        {
            return true;
        }
        ev ev1 = func_468_c(field_847_d);
        if(ev1 != null)
        {
            return ev1.func_1099_b(ly1);
        } else
        {
            return false;
        }
    }

    public ev func_492_d(int i)
    {
        return field_842_b[i];
    }

    public int func_506_f()
    {
        int i = 0;
        int j = 0;
        int k = 0;
        for(int l = 0; l < field_842_b.length; l++)
        {
            if(field_842_b[l] != null && (field_842_b[l].func_1091_a() instanceof mr))
            {
                int i1 = field_842_b[l].func_1094_d();
                int j1 = field_842_b[l].field_1616_d;
                int k1 = i1 - j1;
                j += k1;
                k += i1;
                int l1 = ((mr)field_842_b[l].func_1091_a()).field_312_aY;
                i += l1;
            }
        }

        if(k == 0)
        {
            return 0;
        } else
        {
            return ((i - 1) * j) / k + 1;
        }
    }

    public void func_507_e(int i)
    {
        for(int j = 0; j < field_842_b.length; j++)
        {
            if(field_842_b[j] == null || !(field_842_b[j].func_1091_a() instanceof mr))
            {
                continue;
            }
            field_842_b[j].func_1101_b(i);
            if(field_842_b[j].field_1615_a == 0)
            {
                field_842_b[j].func_1097_a(field_844_g);
                field_842_b[j] = null;
            }
        }

    }

    public void func_503_g()
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] != null)
            {
                field_844_g.func_444_a(field_843_a[i], true);
                field_843_a[i] = null;
            }
        }

        for(int j = 0; j < field_842_b.length; j++)
        {
            if(field_842_b[j] != null)
            {
                field_844_g.func_444_a(field_842_b[j], true);
                field_842_b[j] = null;
            }
        }

    }

    public void func_474_j_()
    {
        field_845_f = true;
    }

    public boolean func_500_a(eu eu1)
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(!func_501_a(eu1.field_843_a[i], field_843_a[i]))
            {
                return false;
            }
        }

        for(int j = 0; j < field_842_b.length; j++)
        {
            if(!func_501_a(eu1.field_842_b[j], field_842_b[j]))
            {
                return false;
            }
        }

        for(int k = 0; k < field_848_c.length; k++)
        {
            if(!func_501_a(eu1.field_848_c[k], field_848_c[k]))
            {
                return false;
            }
        }

        return true;
    }

    private boolean func_501_a(ev ev1, ev ev2)
    {
        if(ev1 == null && ev2 == null)
        {
            return true;
        }
        if(ev1 == null || ev2 == null)
        {
            return false;
        } else
        {
            return ev1.field_1617_c == ev2.field_1617_c && ev1.field_1615_a == ev2.field_1615_a && ev1.field_1616_d == ev2.field_1616_d;
        }
    }

    public eu func_512_i()
    {
        eu eu1 = new eu(null);
        for(int i = 0; i < field_843_a.length; i++)
        {
            eu1.field_843_a[i] = field_843_a[i] == null ? null : field_843_a[i].func_1102_e();
        }

        for(int j = 0; j < field_842_b.length; j++)
        {
            eu1.field_842_b[j] = field_842_b[j] == null ? null : field_842_b[j].func_1102_e();
        }

        for(int k = 0; k < field_848_c.length; k++)
        {
            eu1.field_848_c[k] = field_848_c[k] == null ? null : field_848_c[k].func_1102_e();
        }

        return eu1;
    }

    public ev field_843_a[];
    public ev field_842_b[];
    public ev field_848_c[];
    public int field_847_d;
    private dm field_844_g;
    public ev field_846_e;
    public boolean field_845_f;
}
