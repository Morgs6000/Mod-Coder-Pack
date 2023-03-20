// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class u extends ff
{

    protected u(int i, int j)
    {
        super(i, j, iq.t);
        a(true);
    }

    public int a(int i, java.util.Random random)
    {
        return ez.aB.aS;
    }

    public int a(java.util.Random random)
    {
        return 4;
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        if(dy1.a(cy.b, i, j, k) > 11)
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
        }
    }
}
