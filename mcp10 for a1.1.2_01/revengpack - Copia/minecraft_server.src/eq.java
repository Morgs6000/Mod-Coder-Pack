// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class eq extends bc
{

    public eq()
    {
    }

    public boolean a(dy dy1, java.util.Random random, int i, int j, int k)
    {
        for(int l = 0; l < 10; l++)
        {
            int i1 = (i + random.nextInt(8)) - random.nextInt(8);
            int j1 = (j + random.nextInt(4)) - random.nextInt(4);
            int k1 = (k + random.nextInt(8)) - random.nextInt(8);
            if(dy1.a(i1, j1, k1) != 0)
                continue;
            int l1 = 1 + random.nextInt(random.nextInt(3) + 1);
            for(int i2 = 0; i2 < l1; i2++)
                if(ff.aW.f(dy1, i1, j1 + i2, k1))
                    dy1.a(i1, j1 + i2, k1, ff.aW.bc);

        }

        return true;
    }
}
