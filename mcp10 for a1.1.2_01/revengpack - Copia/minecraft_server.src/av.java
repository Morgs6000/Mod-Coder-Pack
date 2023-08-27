// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class av extends ff
{

    protected av(int i, int j)
    {
        super(i, j, iq.n);
        a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        return null;
    }

    public boolean b()
    {
        return false;
    }

    public fr a(dy dy1, int i, int j, int k, aw aw, aw aw1)
    {
        a(((hq) (dy1)), i, j, k);
        return super.a(dy1, i, j, k, aw, aw1);
    }

    public void a(hq hq1, int i, int j, int k)
    {
        int l = hq1.b(i, j, k);
        if(l >= 2 && l <= 5)
            a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
        else
            a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public int a()
    {
        return 9;
    }

    public int a(java.util.Random random)
    {
        return 1;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        return dy1.d(i, j - 1, k);
    }

    public void e(dy dy1, int i, int j, int k)
    {
        dy1.b(i, j, k, 15);
        g(dy1, i, j, k);
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.b(i, j, k);
        boolean flag = false;
        if(!dy1.d(i, j - 1, k))
            flag = true;
        if(i1 == 2 && !dy1.d(i + 1, j, k))
            flag = true;
        if(i1 == 3 && !dy1.d(i - 1, j, k))
            flag = true;
        if(i1 == 4 && !dy1.d(i, j, k - 1))
            flag = true;
        if(i1 == 5 && !dy1.d(i, j, k + 1))
            flag = true;
        if(flag)
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
        } else
        if(l > 0 && ff.n[l].d() && gd.a(new gd(this, dy1, i, j, k)) == 3)
            g(dy1, i, j, k);
    }

    private void g(dy dy1, int i, int j, int k)
    {
        (new gd(this, dy1, i, j, k)).a(dy1.n(i, j, k));
    }
}
