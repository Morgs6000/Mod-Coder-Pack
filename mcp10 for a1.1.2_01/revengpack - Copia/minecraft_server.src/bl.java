// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class bl
{

    private int a;
    private java.lang.Class b;
    private java.lang.Class c[];
    private java.util.Set d;

    public bl(int i, java.lang.Class class1, java.lang.Class aclass[])
    {
        d = ((java.util.Set) (new HashSet()));
        a = i;
        b = class1;
        c = aclass;
    }

    public void a(dy dy1)
    {
        int i = dy1.a(b);
        if(i < a)
        {
            for(int j = 0; j < 3; j++)
                a(dy1, 1, ((hw) (null)));

        }
    }

    protected gs a(dy dy1, int i, int j)
    {
        int k = i + dy1.m.nextInt(16);
        int l = dy1.m.nextInt(128);
        int i1 = j + dy1.m.nextInt(16);
        return new gs(k, l, i1);
    }

    private int a(dy dy1, int i, hw hw)
    {
        d.clear();
        for(int j = 0; j < dy1.k.size(); j++)
        {
            fc fc1 = (fc)dy1.k.get(j);
            int l = gj.b(fc1.l / 16D);
            int i1 = gj.b(fc1.n / 16D);
            byte byte0 = 4;
            for(int k1 = -byte0; k1 <= byte0; k1++)
            {
                for(int i2 = -byte0; i2 <= byte0; i2++)
                    d.add(((java.lang.Object) (new iy(k1 + l, i2 + i1))));

            }

        }

        int k = 0;
        java.util.Iterator iterator = d.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            iy iy1 = (iy)iterator.next();
            if(dy1.m.nextInt(10) == 0)
            {
                int j1 = dy1.m.nextInt(c.length);
                gs gs1 = a(dy1, iy1.a * 16, iy1.b * 16);
                int l1 = gs1.a;
                int j2 = gs1.b;
                int k2 = gs1.c;
                if(dy1.d(l1, j2, k2))
                    return 0;
                if(dy1.c(l1, j2, k2) != iq.a)
                    return 0;
                int l2 = 0;
                while(l2 < 3) 
                {
                    int i3 = l1;
                    int j3 = j2;
                    int k3 = k2;
                    byte byte1 = 6;
                    for(int l3 = 0; l3 < 2; l3++)
                    {
                        i3 += dy1.m.nextInt(((int) (byte1))) - dy1.m.nextInt(((int) (byte1)));
                        j3 += dy1.m.nextInt(1) - dy1.m.nextInt(1);
                        k3 += dy1.m.nextInt(((int) (byte1))) - dy1.m.nextInt(((int) (byte1)));
                        if(!dy1.d(i3, j3 - 1, k3) || dy1.d(i3, j3, k3) || dy1.c(i3, j3, k3).d() || dy1.d(i3, j3 + 1, k3))
                            continue;
                        float f = (float)i3 + 0.5F;
                        float f1 = j3;
                        float f2 = (float)k3 + 0.5F;
                        if(dy1.a(f, f1, f2, 24D) != null)
                            continue;
                        float f3 = f - (float)dy1.n;
                        float f4 = f1 - (float)dy1.o;
                        float f5 = f2 - (float)dy1.p;
                        float f6 = f3 * f3 + f4 * f4 + f5 * f5;
                        if(f6 < 576F)
                            continue;
                        is is1;
                        try
                        {
                            is1 = (is)c[j1].getConstructor(new java.lang.Class[] {
                                dy.class
                            }).newInstance(new java.lang.Object[] {
                                dy1
                            });
                        }
                        catch(java.lang.Exception exception)
                        {
                            exception.printStackTrace();
                            return k;
                        }
                        is1.c(f, f1, f2, dy1.m.nextFloat() * 360F, 0.0F);
                        if(!is1.a())
                            continue;
                        k++;
                        dy1.a(((dj) (is1)));
                        if((is1 instanceof bk) && dy1.m.nextInt(100) == 0)
                        {
                            ek ek1 = new ek(dy1);
                            ek1.c(f, f1, f2, is1.r, 0.0F);
                            dy1.a(((dj) (ek1)));
                            ek1.e(((dj) (is1)));
                        }
                    }

                    l2++;
                }
            }
        } while(true);
        return k;
    }
}
