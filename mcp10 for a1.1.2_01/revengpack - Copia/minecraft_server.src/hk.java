// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class hk extends ff
{

    protected hk(int i)
    {
        super(i, iq.j);
        bb = 48;
    }

    public void e(dy dy1, int i, int j, int k)
    {
        byte byte0 = 2;
        for(int l = i - byte0; l <= i + byte0; l++)
        {
            for(int i1 = j - byte0; i1 <= j + byte0; i1++)
            {
                for(int j1 = k - byte0; j1 <= k + byte0; j1++)
                    if(dy1.c(l, i1, j1) != iq.f);

            }

        }

    }

    public void b(dy dy1, int i, int j, int k)
    {
        byte byte0 = 2;
        for(int l = i - byte0; l <= i + byte0; l++)
        {
            for(int i1 = j - byte0; i1 <= j + byte0; i1++)
            {
                for(int j1 = k - byte0; j1 <= k + byte0; j1++)
                    dy1.g(l, i1, j1, dy1.a(l, i1, j1));

            }

        }

    }
}
