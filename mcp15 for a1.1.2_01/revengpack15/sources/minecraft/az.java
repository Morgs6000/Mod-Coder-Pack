// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.lang.reflect.Constructor;
import java.util.*;

public class az
{

    public az(int i, Class class1, Class aclass[])
    {
        field_1684_d = new HashSet();
        field_1683_a = i;
        field_1682_b = class1;
        field_1685_c = aclass;
    }

    public void func_1150_a(cn cn1)
    {
        int i = cn1.func_621_b(field_1682_b);
        if(i < field_1683_a)
        {
            for(int j = 0; j < 3; j++)
            {
                func_1149_a(cn1, 1, null);
            }

        }
    }

    protected mt func_1151_a(cn cn1, int i, int j)
    {
        int k = i + cn1.field_1037_n.nextInt(16);
        int l = cn1.field_1037_n.nextInt(128);
        int i1 = j + cn1.field_1037_n.nextInt(16);
        return new mt(k, l, i1);
    }

    private int func_1149_a(cn cn1, int i, nu nu)
    {
        field_1684_d.clear();
        for(int j = 0; j < cn1.field_1040_k.size(); j++)
        {
            dm dm1 = (dm)cn1.field_1040_k.get(j);
            int l = eo.b(dm1.field_611_ak / 16D);
            int i1 = eo.b(dm1.field_609_am / 16D);
            byte byte0 = 4;
            for(int k1 = -byte0; k1 <= byte0; k1++)
            {
                for(int i2 = -byte0; i2 <= byte0; i2++)
                {
                    field_1684_d.add(new ol(k1 + l, i2 + i1));
                }

            }

        }

        int k = 0;
        Iterator iterator = field_1684_d.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            ol ol1 = (ol)iterator.next();
            if(cn1.field_1037_n.nextInt(10) == 0)
            {
                int j1 = cn1.field_1037_n.nextInt(field_1685_c.length);
                mt mt1 = func_1151_a(cn1, ol1.field_189_a * 16, ol1.field_188_b * 16);
                int l1 = mt1.field_1111_a;
                int j2 = mt1.field_1110_b;
                int k2 = mt1.field_1112_c;
                if(cn1.func_601_g(l1, j2, k2))
                {
                    return 0;
                }
                if(cn1.func_599_f(l1, j2, k2) != gb.field_1337_a)
                {
                    return 0;
                }
                int l2 = 0;
                while(l2 < 3) 
                {
                    int i3 = l1;
                    int j3 = j2;
                    int k3 = k2;
                    byte byte1 = 6;
                    for(int l3 = 0; l3 < 2; l3++)
                    {
                        i3 += cn1.field_1037_n.nextInt(byte1) - cn1.field_1037_n.nextInt(byte1);
                        j3 += cn1.field_1037_n.nextInt(1) - cn1.field_1037_n.nextInt(1);
                        k3 += cn1.field_1037_n.nextInt(byte1) - cn1.field_1037_n.nextInt(byte1);
                        if(!cn1.func_601_g(i3, j3 - 1, k3) || cn1.func_601_g(i3, j3, k3) || cn1.func_599_f(i3, j3, k3).func_879_d() || cn1.func_601_g(i3, j3 + 1, k3))
                        {
                            continue;
                        }
                        float f = (float)i3 + 0.5F;
                        float f1 = j3;
                        float f2 = (float)k3 + 0.5F;
                        if(cn1.func_683_a(f, f1, f2, 24D) != null)
                        {
                            continue;
                        }
                        float f3 = f - (float)cn1.field_1036_o;
                        float f4 = f1 - (float)cn1.field_1035_p;
                        float f5 = f2 - (float)cn1.field_1034_q;
                        float f6 = f3 * f3 + f4 * f4 + f5 * f5;
                        if(f6 < 576F)
                        {
                            continue;
                        }
                        ge ge1;
                        try
                        {
                            ge1 = (ge)field_1685_c[j1].getConstructor(new Class[] {
                                cn.class
                            }).newInstance(new Object[] {
                                cn1
                            });
                        }
                        catch(Exception exception)
                        {
                            exception.printStackTrace();
                            return k;
                        }
                        ge1.func_365_c(f, f1, f2, cn1.field_1037_n.nextFloat() * 360F, 0.0F);
                        if(!ge1.func_433_a())
                        {
                            continue;
                        }
                        k++;
                        cn1.func_674_a(ge1);
                        if((ge1 instanceof ax) && cn1.field_1037_n.nextInt(100) == 0)
                        {
                            cw cw1 = new cw(cn1);
                            cw1.func_365_c(f, f1, f2, ge1.field_605_aq, 0.0F);
                            cn1.func_674_a(cw1);
                            cw1.func_386_g(ge1);
                        }
                    }

                    l2++;
                }
            }
        } while(true);
        return k;
    }

    private int field_1683_a;
    private Class field_1682_b;
    private Class field_1685_c[];
    private Set field_1684_d;
}
