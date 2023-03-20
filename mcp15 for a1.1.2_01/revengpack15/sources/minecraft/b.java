// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class b extends jt
{

    protected b(int i)
    {
        super(i, gb.field_1335_c);
        field_457_a = new Random();
        field_378_bb = 26;
    }

    public int func_211_a(nm nm1, int i, int j, int k, int l)
    {
        if(l == 1)
        {
            return field_378_bb - 1;
        }
        if(l == 0)
        {
            return field_378_bb - 1;
        }
        int i1 = nm1.func_600_a(i, j, k - 1);
        int j1 = nm1.func_600_a(i, j, k + 1);
        int k1 = nm1.func_600_a(i - 1, j, k);
        int l1 = nm1.func_600_a(i + 1, j, k);
        if(i1 == field_376_bc || j1 == field_376_bc)
        {
            if(l == 2 || l == 3)
            {
                return field_378_bb;
            }
            int i2 = 0;
            if(i1 == field_376_bc)
            {
                i2 = -1;
            }
            int k2 = nm1.func_600_a(i - 1, j, i1 != field_376_bc ? k + 1 : k - 1);
            int i3 = nm1.func_600_a(i + 1, j, i1 != field_376_bc ? k + 1 : k - 1);
            if(l == 4)
            {
                i2 = -1 - i2;
            }
            byte byte1 = 5;
            if((ly.field_343_p[k1] || ly.field_343_p[k2]) && !ly.field_343_p[l1] && !ly.field_343_p[i3])
            {
                byte1 = 5;
            }
            if((ly.field_343_p[l1] || ly.field_343_p[i3]) && !ly.field_343_p[k1] && !ly.field_343_p[k2])
            {
                byte1 = 4;
            }
            return (l != byte1 ? field_378_bb + 32 : field_378_bb + 16) + i2;
        }
        if(k1 == field_376_bc || l1 == field_376_bc)
        {
            if(l == 4 || l == 5)
            {
                return field_378_bb;
            }
            int j2 = 0;
            if(k1 == field_376_bc)
            {
                j2 = -1;
            }
            int l2 = nm1.func_600_a(k1 != field_376_bc ? i + 1 : i - 1, j, k - 1);
            int j3 = nm1.func_600_a(k1 != field_376_bc ? i + 1 : i - 1, j, k + 1);
            if(l == 3)
            {
                j2 = -1 - j2;
            }
            byte byte2 = 3;
            if((ly.field_343_p[i1] || ly.field_343_p[l2]) && !ly.field_343_p[j1] && !ly.field_343_p[j3])
            {
                byte2 = 3;
            }
            if((ly.field_343_p[j1] || ly.field_343_p[j3]) && !ly.field_343_p[i1] && !ly.field_343_p[l2])
            {
                byte2 = 2;
            }
            return (l != byte2 ? field_378_bb + 32 : field_378_bb + 16) + j2;
        }
        byte byte0 = 3;
        if(ly.field_343_p[i1] && !ly.field_343_p[j1])
        {
            byte0 = 3;
        }
        if(ly.field_343_p[j1] && !ly.field_343_p[i1])
        {
            byte0 = 2;
        }
        if(ly.field_343_p[k1] && !ly.field_343_p[l1])
        {
            byte0 = 5;
        }
        if(ly.field_343_p[l1] && !ly.field_343_p[k1])
        {
            byte0 = 4;
        }
        return l != byte0 ? field_378_bb : field_378_bb + 1;
    }

    public int func_218_a(int i)
    {
        if(i == 1)
        {
            return field_378_bb - 1;
        }
        if(i == 0)
        {
            return field_378_bb - 1;
        }
        if(i == 3)
        {
            return field_378_bb + 1;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        int l = 0;
        if(cn1.func_600_a(i - 1, j, k) == field_376_bc)
        {
            l++;
        }
        if(cn1.func_600_a(i + 1, j, k) == field_376_bc)
        {
            l++;
        }
        if(cn1.func_600_a(i, j, k - 1) == field_376_bc)
        {
            l++;
        }
        if(cn1.func_600_a(i, j, k + 1) == field_376_bc)
        {
            l++;
        }
        if(l > 1)
        {
            return false;
        }
        if(func_286_h(cn1, i - 1, j, k))
        {
            return false;
        }
        if(func_286_h(cn1, i + 1, j, k))
        {
            return false;
        }
        if(func_286_h(cn1, i, j, k - 1))
        {
            return false;
        }
        return !func_286_h(cn1, i, j, k + 1);
    }

    private boolean func_286_h(cn cn1, int i, int j, int k)
    {
        if(cn1.func_600_a(i, j, k) != field_376_bc)
        {
            return false;
        }
        if(cn1.func_600_a(i - 1, j, k) == field_376_bc)
        {
            return true;
        }
        if(cn1.func_600_a(i + 1, j, k) == field_376_bc)
        {
            return true;
        }
        if(cn1.func_600_a(i, j, k - 1) == field_376_bc)
        {
            return true;
        }
        return cn1.func_600_a(i, j, k + 1) == field_376_bc;
    }

    public void func_214_b(cn cn1, int i, int j, int k)
    {
        fe fe1 = (fe)cn1.func_603_b(i, j, k);
label0:
        for(int l = 0; l < fe1.func_469_c(); l++)
        {
            ev ev1 = fe1.func_468_c(l);
            if(ev1 == null)
            {
                continue;
            }
            float f = field_457_a.nextFloat() * 0.8F + 0.1F;
            float f1 = field_457_a.nextFloat() * 0.8F + 0.1F;
            float f2 = field_457_a.nextFloat() * 0.8F + 0.1F;
            do
            {
                if(ev1.field_1615_a <= 0)
                {
                    continue label0;
                }
                int i1 = field_457_a.nextInt(21) + 10;
                if(i1 > ev1.field_1615_a)
                {
                    i1 = ev1.field_1615_a;
                }
                ev1.field_1615_a -= i1;
                dx dx1 = new dx(cn1, (float)i + f, (float)j + f1, (float)k + f2, new ev(ev1.field_1617_c, i1, ev1.field_1616_d));
                float f3 = 0.05F;
                dx1.field_608_an = (float)field_457_a.nextGaussian() * f3;
                dx1.field_607_ao = (float)field_457_a.nextGaussian() * f3 + 0.2F;
                dx1.field_606_ap = (float)field_457_a.nextGaussian() * f3;
                cn1.func_674_a(dx1);
            } while(true);
        }

        super.func_214_b(cn1, i, j, k);
    }

    public boolean func_250_a(cn cn1, int i, int j, int k, dm dm1)
    {
        Object obj = (fe)cn1.func_603_b(i, j, k);
        if(cn1.func_601_g(i, j + 1, k))
        {
            return true;
        }
        if(cn1.func_600_a(i - 1, j, k) == field_376_bc && cn1.func_601_g(i - 1, j + 1, k))
        {
            return true;
        }
        if(cn1.func_600_a(i + 1, j, k) == field_376_bc && cn1.func_601_g(i + 1, j + 1, k))
        {
            return true;
        }
        if(cn1.func_600_a(i, j, k - 1) == field_376_bc && cn1.func_601_g(i, j + 1, k - 1))
        {
            return true;
        }
        if(cn1.func_600_a(i, j, k + 1) == field_376_bc && cn1.func_601_g(i, j + 1, k + 1))
        {
            return true;
        }
        if(cn1.func_600_a(i - 1, j, k) == field_376_bc)
        {
            obj = new hs("Large chest", (fe)cn1.func_603_b(i - 1, j, k), ((gh) (obj)));
        }
        if(cn1.func_600_a(i + 1, j, k) == field_376_bc)
        {
            obj = new hs("Large chest", ((gh) (obj)), (fe)cn1.func_603_b(i + 1, j, k));
        }
        if(cn1.func_600_a(i, j, k - 1) == field_376_bc)
        {
            obj = new hs("Large chest", (fe)cn1.func_603_b(i, j, k - 1), ((gh) (obj)));
        }
        if(cn1.func_600_a(i, j, k + 1) == field_376_bc)
        {
            obj = new hs("Large chest", ((gh) (obj)), (fe)cn1.func_603_b(i, j, k + 1));
        }
        dm1.func_452_a(((gh) (obj)));
        return true;
    }

    protected ic func_283_a_()
    {
        return new fe();
    }

    private Random field_457_a;
}
