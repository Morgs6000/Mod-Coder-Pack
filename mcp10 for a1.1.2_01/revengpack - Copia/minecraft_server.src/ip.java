// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class ip extends ff
{

    private boolean a;

    public ip(int i, boolean flag)
    {
        super(i, 6, iq.d);
        a = flag;
        if(!flag)
            a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        c(255);
    }

    public int a(int i)
    {
        return i > 1 ? 5 : 6;
    }

    public boolean b()
    {
        return a;
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        if(this != ff.al)
            return;
        else
            return;
    }

    public void e(dy dy1, int i, int j, int k)
    {
        if(this != ff.al)
            super.e(dy1, i, j, k);
        int l = dy1.a(i, j - 1, k);
        if(l == al.bc)
        {
            dy1.d(i, j, k, 0);
            dy1.d(i, j - 1, k, ff.ak.bc);
        }
    }

    public int a(int i, java.util.Random random)
    {
        return ff.al.bc;
    }

    public boolean a(hq hq1, int i, int j, int k, int l)
    {
        if(this != ff.al)
            super.a(hq1, i, j, k, l);
        if(l == 1)
            return true;
        if(!super.a(hq1, i, j, k, l))
            return false;
        if(l == 0)
            return true;
        else
            return hq1.a(i, j, k) != bc;
    }
}
