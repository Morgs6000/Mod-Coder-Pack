// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class nx extends di
{

    public nx(int i)
    {
        super(i);
        aT = 1;
        aU = 64;
    }

    public boolean a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
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
        int i1 = cn1.a(i, j, k);
        if(i1 == 0)
        {
            cn1.a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, b.nextFloat() * 0.4F + 0.8F);
            cn1.d(i, j, k, ly.as.bc);
        }
        ev1.b(1);
        return true;
    }
}
