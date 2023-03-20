// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class gl extends bc
{

    public gl()
    {
    }

    public boolean a(dy dy1, java.util.Random random, int i, int j, int k)
    {
        for(int l = 0; l < 20; l++)
        {
            int i1 = (i + random.nextInt(4)) - random.nextInt(4);
            int j1 = j;
            int k1 = (k + random.nextInt(4)) - random.nextInt(4);
            if(dy1.a(i1, j1, k1) != 0 || dy1.c(i1 - 1, j1 - 1, k1) != iq.f && dy1.c(i1 + 1, j1 - 1, k1) != iq.f && dy1.c(i1, j1 - 1, k1 - 1) != iq.f && dy1.c(i1, j1 - 1, k1 + 1) != iq.f)
                continue;
            int l1 = 2 + random.nextInt(random.nextInt(3) + 1);
            for(int i2 = 0; i2 < l1; i2++)
                if(ff.aY.f(dy1, i1, j1 + i2, k1))
                    dy1.a(i1, j1 + i2, k1, ff.aY.bc);

        }

        return true;
    }
}
