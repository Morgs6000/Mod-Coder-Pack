// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class fj extends gn
{

    protected fj(int i, int j)
    {
        super(i, j);
        float f = 0.4F;
        a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        super.a(dy1, i, j, k, random);
        if(dy1.h(i, j + 1, k) >= 9 && random.nextInt(5) == 0)
        {
            int l = dy1.b(i, j, k);
            if(l < 15)
            {
                dy1.b(i, j, k, l + 1);
            } else
            {
                dy1.a(i, j, k, 0);
                java.lang.Object obj = ((java.lang.Object) (new ic()));
                if(random.nextInt(10) == 0)
                    obj = ((java.lang.Object) (new gi()));
                if(!((bc) (obj)).a(dy1, random, i, j, k))
                    dy1.a(i, j, k, bc);
            }
        }
    }
}
