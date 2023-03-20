// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class cg extends ik
{

    public cg()
    {
    }

    public boolean func_516_a(cn cn1, Random random, int i, int j, int k)
    {
        byte byte0 = 3;
        int l = random.nextInt(2) + 2;
        int i1 = random.nextInt(2) + 2;
        int j1 = 0;
        for(int k1 = i - l - 1; k1 <= i + l + 1; k1++)
        {
            for(int j2 = j - 1; j2 <= j + byte0 + 1; j2++)
            {
                for(int i3 = k - i1 - 1; i3 <= k + i1 + 1; i3++)
                {
                    gb gb1 = cn1.func_599_f(k1, j2, i3);
                    if(j2 == j - 1 && !gb1.func_878_a())
                    {
                        return false;
                    }
                    if(j2 == j + byte0 + 1 && !gb1.func_878_a())
                    {
                        return false;
                    }
                    if((k1 == i - l - 1 || k1 == i + l + 1 || i3 == k - i1 - 1 || i3 == k + i1 + 1) && j2 == j && cn1.func_600_a(k1, j2, i3) == 0 && cn1.func_600_a(k1, j2 + 1, i3) == 0)
                    {
                        j1++;
                    }
                }

            }

        }

        if(j1 < 1 || j1 > 5)
        {
            return false;
        }
        for(int l1 = i - l - 1; l1 <= i + l + 1; l1++)
        {
            for(int k2 = j + byte0; k2 >= j - 1; k2--)
            {
                for(int j3 = k - i1 - 1; j3 <= k + i1 + 1; j3++)
                {
                    if(l1 == i - l - 1 || k2 == j - 1 || j3 == k - i1 - 1 || l1 == i + l + 1 || k2 == j + byte0 + 1 || j3 == k + i1 + 1)
                    {
                        if(k2 >= 0 && !cn1.func_599_f(l1, k2 - 1, j3).func_878_a())
                        {
                            cn1.func_690_d(l1, k2, j3, 0);
                            continue;
                        }
                        if(!cn1.func_599_f(l1, k2, j3).func_878_a())
                        {
                            continue;
                        }
                        if(k2 == j - 1 && random.nextInt(4) != 0)
                        {
                            cn1.func_690_d(l1, k2, j3, ly.field_406_ap.field_376_bc);
                        } else
                        {
                            cn1.func_690_d(l1, k2, j3, ly.field_335_x.field_376_bc);
                        }
                    } else
                    {
                        cn1.func_690_d(l1, k2, j3, 0);
                    }
                }

            }

        }

        for(int i2 = 0; i2 < 2; i2++)
        {
label0:
            for(int l2 = 0; l2 < 3; l2++)
            {
                int k3 = (i + random.nextInt(l * 2 + 1)) - l;
                int l3 = j;
                int i4 = (k + random.nextInt(i1 * 2 + 1)) - i1;
                if(cn1.func_600_a(k3, l3, i4) != 0)
                {
                    continue;
                }
                int j4 = 0;
                if(cn1.func_599_f(k3 - 1, l3, i4).func_878_a())
                {
                    j4++;
                }
                if(cn1.func_599_f(k3 + 1, l3, i4).func_878_a())
                {
                    j4++;
                }
                if(cn1.func_599_f(k3, l3, i4 - 1).func_878_a())
                {
                    j4++;
                }
                if(cn1.func_599_f(k3, l3, i4 + 1).func_878_a())
                {
                    j4++;
                }
                if(j4 != 1)
                {
                    continue;
                }
                cn1.func_690_d(k3, l3, i4, ly.field_396_av.field_376_bc);
                fe fe1 = (fe)cn1.func_603_b(k3, l3, i4);
                int k4 = 0;
                do
                {
                    if(k4 >= 8)
                    {
                        break label0;
                    }
                    ev ev1 = func_530_a(random);
                    if(ev1 != null)
                    {
                        fe1.func_472_a(random.nextInt(fe1.func_469_c()), ev1);
                    }
                    k4++;
                } while(true);
            }

        }

        cn1.func_690_d(i, j, k, ly.field_400_at.field_376_bc);
        bd bd1 = (bd)cn1.func_603_b(i, j, k);
        bd1.field_828_b = func_531_b(random);
        return true;
    }

    private ev func_530_a(Random random)
    {
        int i = random.nextInt(11);
        if(i == 0)
        {
            return new ev(di.field_254_ay);
        }
        if(i == 1)
        {
            return new ev(di.field_223_m, random.nextInt(4) + 1);
        }
        if(i == 2)
        {
            return new ev(di.field_242_S);
        }
        if(i == 3)
        {
            return new ev(di.field_243_R, random.nextInt(4) + 1);
        }
        if(i == 4)
        {
            return new ev(di.field_250_K, random.nextInt(4) + 1);
        }
        if(i == 5)
        {
            return new ev(di.field_253_I, random.nextInt(4) + 1);
        }
        if(i == 6)
        {
            return new ev(di.field_262_au);
        }
        if(i == 7 && random.nextInt(100) == 0)
        {
            return new ev(di.field_269_ar);
        }
        if(i == 8 && random.nextInt(2) == 0)
        {
            return new ev(di.field_309_aA, random.nextInt(4) + 1);
        }
        if(i == 9 && random.nextInt(10) == 0)
        {
            return new ev(di.field_233_c[di.field_293_aQ.field_291_aS + random.nextInt(2)]);
        } else
        {
            return null;
        }
    }

    private String func_531_b(Random random)
    {
        int i = random.nextInt(4);
        if(i == 0)
        {
            return "Skeleton";
        }
        if(i == 1)
        {
            return "Zombie";
        }
        if(i == 2)
        {
            return "Zombie";
        }
        if(i == 3)
        {
            return "Spider";
        } else
        {
            return "";
        }
    }
}
