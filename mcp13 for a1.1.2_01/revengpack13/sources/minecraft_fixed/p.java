// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class p extends ly
{

    protected p(int i, int j)
    {
        super(i, j, gb.t);
        b(true);
    }

    public int a(int i, java.util.Random random)
    {
        return di.aB.aS;
    }

    public int a(java.util.Random random)
    {
        return 4;
    }

    public void a(cn cn1, int i, int j, int k, java.util.Random random)
    {
        if(cn1.a(by.b, i, j, k) > 11)
        {
            b_(cn1, i, j, k, cn1.e(i, j, k));
            cn1.d(i, j, k, 0);
        }
    }
}
