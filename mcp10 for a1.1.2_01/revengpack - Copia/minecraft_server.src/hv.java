// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.IOException;

public class hv
    implements bj
{

    private im c;
    private bj d;
    private aq e;
    private im f[];
    private dy g;
    int a;
    int b;
    private im h;

    public hv(dy dy1, aq aq1, bj bj1)
    {
        f = new im[1024];
        a = 0xc4653601;
        b = 0xc4653601;
        c = new im(dy1, new byte[32768], 0, 0);
        c.q = true;
        c.p = true;
        g = dy1;
        e = aq1;
        d = bj1;
    }

    public boolean a(int i, int j)
    {
        if(i == a && j == b && h != null)
        {
            return true;
        } else
        {
            int k = i & 0x1f;
            int l = j & 0x1f;
            int i1 = k + l * 32;
            return f[i1] != null && (f[i1] == c || f[i1].a(i, j));
        }
    }

    public im b(int i, int j)
    {
        if(i == a && j == b && h != null)
            return h;
        int k = i & 0x1f;
        int l = j & 0x1f;
        int i1 = k + l * 32;
        if(!a(i, j))
        {
            if(f[i1] != null)
            {
                f[i1].d();
                b(f[i1]);
                a(f[i1]);
            }
            im im1 = c(i, j);
            if(im1 == null)
                if(d == null)
                    im1 = c;
                else
                    im1 = d.b(i, j);
            f[i1] = im1;
            if(f[i1] != null)
                f[i1].c();
            if(!f[i1].n && a(i + 1, j + 1) && a(i, j + 1) && a(i + 1, j))
                a(((bj) (this)), i, j);
            if(a(i - 1, j) && !b(i - 1, j).n && a(i - 1, j + 1) && a(i, j + 1) && a(i - 1, j))
                a(((bj) (this)), i - 1, j);
            if(a(i, j - 1) && !b(i, j - 1).n && a(i + 1, j - 1) && a(i, j - 1) && a(i + 1, j))
                a(((bj) (this)), i, j - 1);
            if(a(i - 1, j - 1) && !b(i - 1, j - 1).n && a(i - 1, j - 1) && a(i, j - 1) && a(i - 1, j))
                a(((bj) (this)), i - 1, j - 1);
        }
        a = i;
        b = j;
        h = f[i1];
        return f[i1];
    }

    private im c(int i, int j)
    {
        if(e == null)
            return null;
        try
        {
            im im1 = e.a(g, i, j);
            if(im1 != null)
                im1.s = g.c;
            return im1;
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    private void a(im im1)
    {
        if(e == null)
            return;
        try
        {
            e.b(g, im1);
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void b(im im1)
    {
        if(e == null)
            return;
        try
        {
            im1.s = g.c;
            e.a(g, im1);
        }
        catch(java.io.IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void a(bj bj1, int i, int j)
    {
        im im1 = b(i, j);
        if(!im1.n)
        {
            im1.n = true;
            if(d != null)
            {
                d.a(bj1, i, j);
                im1.e();
            }
        }
    }

    public boolean a(boolean flag, hw hw1)
    {
        int i = 0;
        int j = 0;
        if(hw1 != null)
        {
            for(int k = 0; k < f.length; k++)
                if(f[k] != null && f[k].a(flag))
                    j++;

        }
        int l = 0;
        for(int i1 = 0; i1 < f.length; i1++)
        {
            if(f[i1] == null)
                continue;
            if(flag && !f[i1].p)
                a(f[i1]);
            if(!f[i1].a(flag))
                continue;
            b(f[i1]);
            f[i1].o = false;
            if(++i == 2 && !flag)
                return false;
            if(hw1 != null && ++l % 10 == 0)
                hw1.a((l * 100) / j);
        }

        if(flag)
        {
            if(e == null)
                return true;
            e.b();
        }
        return true;
    }

    public boolean a()
    {
        if(e != null)
            e.a();
        return d.a();
    }

    public boolean b()
    {
        return true;
    }
}
