// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class hz extends ez
{

    public hz(int i)
    {
        super(i);
        aT = 1;
        aU = 64;
    }

    public boolean a(gp gp1, fc fc, dy dy1, int i, int j, int k, int l)
    {
        if(l == 0)
            j--;
        if(l == 1)
            j++;
        if(l == 2)
            k--;
        if(l == 3)
            k++;
        if(l == 4)
            i--;
        if(l == 5)
            i++;
        int i1 = dy1.a(i, j, k);
        if(i1 == 0)
        {
            dy1.a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, b.nextFloat() * 0.4F + 0.8F);
            dy1.d(i, j, k, ff.as.bc);
        }
        gp1.a(1);
        return true;
    }
}
