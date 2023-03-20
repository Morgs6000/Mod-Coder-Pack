// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class fa extends cs
{

    private java.lang.Class a;
    private boolean b;

    protected fa(int i, java.lang.Class class1, boolean flag)
    {
        super(i, iq.c);
        b = flag;
        bb = 4;
        a = class1;
        float f = 0.25F;
        float f1 = 1.0F;
        a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        return null;
    }

    public void a(hq hq1, int i, int j, int k)
    {
        if(b)
            return;
        int l = hq1.b(i, j, k);
        float f = 0.28125F;
        float f1 = 0.78125F;
        float f2 = 0.0F;
        float f3 = 1.0F;
        float f4 = 0.125F;
        a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        if(l == 2)
            a(f2, f, 1.0F - f4, f3, f1, 1.0F);
        if(l == 3)
            a(f2, f, 0.0F, f3, f1, f4);
        if(l == 4)
            a(1.0F - f4, f, f2, 1.0F, f1, f3);
        if(l == 5)
            a(0.0F, f, f2, f4, f1, f3);
    }

    public int a()
    {
        return -1;
    }

    public boolean b()
    {
        return false;
    }

    protected as a_()
    {
        try
        {
            return (as)a.newInstance();
        }
        catch(java.lang.Exception exception)
        {
            throw new RuntimeException(((java.lang.Throwable) (exception)));
        }
    }

    public int a(int i, java.util.Random random)
    {
        return ez.as.aS;
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        boolean flag = false;
        if(b)
        {
            if(!dy1.c(i, j - 1, k).a())
                flag = true;
        } else
        {
            int i1 = dy1.b(i, j, k);
            flag = true;
            if(i1 == 2 && dy1.c(i, j, k + 1).a())
                flag = false;
            if(i1 == 3 && dy1.c(i, j, k - 1).a())
                flag = false;
            if(i1 == 4 && dy1.c(i + 1, j, k).a())
                flag = false;
            if(i1 == 5 && dy1.c(i - 1, j, k).a())
                flag = false;
        }
        if(flag)
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
        }
        super.b(dy1, i, j, k, l);
    }
}
