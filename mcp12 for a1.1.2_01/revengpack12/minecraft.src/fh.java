// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;

public class fh extends ly
{

    public fh(int i, int j)
    {
        super(i, j, gb.c);
    }

    public void a(cn cn1, int i, int j, int k, cf cf1, java.util.ArrayList arraylist)
    {
        arraylist.add(((java.lang.Object) (cf.b(i, j, k, i + 1, (double)j + 1.5D, k + 1))));
    }

    public boolean a(cn cn1, int i, int j, int k)
    {
        if(cn1.a(i, j - 1, k) == bc)
            return false;
        if(!cn1.f(i, j - 1, k).a())
            return false;
        else
            return super.a(cn1, i, j, k);
    }

    public boolean b()
    {
        return false;
    }

    public boolean c()
    {
        return false;
    }

    public int f()
    {
        return 11;
    }
}
