// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class dk extends bc
{

    public dk()
    {
    }

    public boolean a(dy dy1, java.util.Random random, int i, int j, int k)
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
                    iq iq1 = dy1.c(k1, j2, i3);
                    if(j2 == j - 1 && !iq1.a())
                        return false;
                    if(j2 == j + byte0 + 1 && !iq1.a())
                        return false;
                    if((k1 == i - l - 1 || k1 == i + l + 1 || i3 == k - i1 - 1 || i3 == k + i1 + 1) && j2 == j && dy1.a(k1, j2, i3) == 0 && dy1.a(k1, j2 + 1, i3) == 0)
                        j1++;
                }

            }

        }

        if(j1 < 1 || j1 > 5)
            return false;
        for(int l1 = i - l - 1; l1 <= i + l + 1; l1++)
        {
            for(int k2 = j + byte0; k2 >= j - 1; k2--)
            {
                for(int j3 = k - i1 - 1; j3 <= k + i1 + 1; j3++)
                    if(l1 == i - l - 1 || k2 == j - 1 || j3 == k - i1 - 1 || l1 == i + l + 1 || k2 == j + byte0 + 1 || j3 == k + i1 + 1)
                    {
                        if(k2 >= 0 && !dy1.c(l1, k2 - 1, j3).a())
                        {
                            dy1.d(l1, k2, j3, 0);
                            continue;
                        }
                        if(!dy1.c(l1, k2, j3).a())
                            continue;
                        if(k2 == j - 1 && random.nextInt(4) != 0)
                            dy1.d(l1, k2, j3, ff.ap.bc);
                        else
                            dy1.d(l1, k2, j3, ff.x.bc);
                    } else
                    {
                        dy1.d(l1, k2, j3, 0);
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
                if(dy1.a(k3, l3, i4) != 0)
                    continue;
                int j4 = 0;
                if(dy1.c(k3 - 1, l3, i4).a())
                    j4++;
                if(dy1.c(k3 + 1, l3, i4).a())
                    j4++;
                if(dy1.c(k3, l3, i4 - 1).a())
                    j4++;
                if(dy1.c(k3, l3, i4 + 1).a())
                    j4++;
                if(j4 != 1)
                    continue;
                dy1.d(k3, l3, i4, ff.av.bc);
                hb hb1 = (hb)dy1.k(k3, l3, i4);
                int k4 = 0;
                do
                {
                    if(k4 >= 8)
                        break label0;
                    gp gp1 = a(random);
                    if(gp1 != null)
                        hb1.a(random.nextInt(hb1.a()), gp1);
                    k4++;
                } while(true);
            }

        }

        dy1.d(i, j, k, ff.at.bc);
        bs bs1 = (bs)dy1.k(i, j, k);
        bs1.f = b(random);
        return true;
    }

    private gp a(java.util.Random random)
    {
        int i = random.nextInt(11);
        if(i == 0)
            return new gp(ez.ay);
        if(i == 1)
            return new gp(ez.m, random.nextInt(4) + 1);
        if(i == 2)
            return new gp(ez.S);
        if(i == 3)
            return new gp(ez.R, random.nextInt(4) + 1);
        if(i == 4)
            return new gp(ez.K, random.nextInt(4) + 1);
        if(i == 5)
            return new gp(ez.I, random.nextInt(4) + 1);
        if(i == 6)
            return new gp(ez.au);
        if(i == 7 && random.nextInt(100) == 0)
            return new gp(ez.ar);
        if(i == 8 && random.nextInt(2) == 0)
            return new gp(ez.aA, random.nextInt(4) + 1);
        if(i == 9 && random.nextInt(10) == 0)
            return new gp(ez.c[ez.aQ.aS + random.nextInt(2)]);
        else
            return null;
    }

    private java.lang.String b(java.util.Random random)
    {
        int i = random.nextInt(4);
        if(i == 0)
            return "Skeleton";
        if(i == 1)
            return "Zombie";
        if(i == 2)
            return "Zombie";
        if(i == 3)
            return "Spider";
        else
            return "";
    }
}
