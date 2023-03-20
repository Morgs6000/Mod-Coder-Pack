// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class ia extends ez
{

    public ia(int i, int j)
    {
        super(i);
        aT = 1;
        aU = 32 << j;
    }

    public boolean a(gp gp1, fc fc, dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.a(i, j, k);
        iq iq1 = dy1.c(i, j + 1, k);
        if(!iq1.a() && i1 == ff.v.bc || i1 == ff.w.bc)
        {
            ff ff1 = ff.aB;
            dy1.a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, ff1.bl.c(), (ff1.bl.a() + 1.0F) / 2.0F, ff1.bl.b() * 0.8F);
            dy1.d(i, j, k, ff1.bc);
            gp1.a(1);
            if(dy1.m.nextInt(8) == 0 && i1 == ff.v.bc)
            {
                int j1 = 1;
                for(int k1 = 0; k1 < j1; k1++)
                {
                    float f = 0.7F;
                    float f1 = dy1.m.nextFloat() * f + (1.0F - f) * 0.5F;
                    float f2 = 1.2F;
                    float f3 = dy1.m.nextFloat() * f + (1.0F - f) * 0.5F;
                    fn fn1 = new fn(dy1, (float)i + f1, (float)j + f2, (float)k + f3, new gp(ez.Q));
                    fn1.ad = 10;
                    dy1.a(((dj) (fn1)));
                }

            }
            return true;
        } else
        {
            return false;
        }
    }
}
