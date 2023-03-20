// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class hr extends bc
{

    private int a;

    public hr(int i)
    {
        a = i;
    }

    public boolean a(dy dy1, java.util.Random random, int i, int j, int k)
    {
        if(dy1.a(i, j + 1, k) != ff.u.bc)
            return false;
        if(dy1.a(i, j - 1, k) != ff.u.bc)
            return false;
        if(dy1.a(i, j, k) != 0 && dy1.a(i, j, k) != ff.u.bc)
            return false;
        int l = 0;
        if(dy1.a(i - 1, j, k) == ff.u.bc)
            l++;
        if(dy1.a(i + 1, j, k) == ff.u.bc)
            l++;
        if(dy1.a(i, j, k - 1) == ff.u.bc)
            l++;
        if(dy1.a(i, j, k + 1) == ff.u.bc)
            l++;
        int i1 = 0;
        if(dy1.a(i - 1, j, k) == 0)
            i1++;
        if(dy1.a(i + 1, j, k) == 0)
            i1++;
        if(dy1.a(i, j, k - 1) == 0)
            i1++;
        if(dy1.a(i, j, k + 1) == 0)
            i1++;
        if(l == 3 && i1 == 1)
            dy1.d(i, j, k, a);
        return true;
    }
}
