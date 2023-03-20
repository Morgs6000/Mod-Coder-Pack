// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ij
    implements bj
{

    private java.util.Set a;
    private im b;
    private bj c;
    private aq d;
    private java.util.Map e;
    private java.util.List f;
    private ee g;

    public ij(ee ee1, aq aq1, bj bj1)
    {
        a = ((java.util.Set) (new HashSet()));
        e = ((java.util.Map) (new HashMap()));
        f = ((java.util.List) (new ArrayList()));
        b = new im(((dy) (ee1)), new byte[32768], 0, 0);
        b.q = true;
        b.p = true;
        g = ee1;
        d = aq1;
        c = bj1;
    }

    public boolean a(int i, int j)
    {
        ir ir1 = new ir(i, j);
        return e.containsKey(((java.lang.Object) (ir1)));
    }

    public void c(int i, int j)
    {
        int k = (i * 16 + 8) - g.n;
        int l = (j * 16 + 8) - g.p;
        byte byte0 = 20;
        if(k < -byte0 || k > byte0 || l < -byte0 || l > byte0)
            a.add(((java.lang.Object) (new ir(i, j))));
    }

    public im d(int i, int j)
    {
        ir ir1 = new ir(i, j);
        a.remove(((java.lang.Object) (new ir(i, j))));
        im im1 = (im)e.get(((java.lang.Object) (ir1)));
        if(im1 == null)
        {
            im1 = e(i, j);
            if(im1 == null)
                if(c == null)
                    im1 = b;
                else
                    im1 = c.b(i, j);
            e.put(((java.lang.Object) (ir1)), ((java.lang.Object) (im1)));
            f.add(((java.lang.Object) (im1)));
            if(im1 != null)
                im1.c();
            if(!im1.n && a(i + 1, j + 1) && a(i, j + 1) && a(i + 1, j))
                a(((bj) (this)), i, j);
            if(a(i - 1, j) && !b(i - 1, j).n && a(i - 1, j + 1) && a(i, j + 1) && a(i - 1, j))
                a(((bj) (this)), i - 1, j);
            if(a(i, j - 1) && !b(i, j - 1).n && a(i + 1, j - 1) && a(i, j - 1) && a(i + 1, j))
                a(((bj) (this)), i, j - 1);
            if(a(i - 1, j - 1) && !b(i - 1, j - 1).n && a(i - 1, j - 1) && a(i, j - 1) && a(i - 1, j))
                a(((bj) (this)), i - 1, j - 1);
        }
        return im1;
    }

    public im b(int i, int j)
    {
        ir ir1 = new ir(i, j);
        im im1 = (im)e.get(((java.lang.Object) (ir1)));
        if(im1 == null)
        {
            if(g.w)
                return d(i, j);
            else
                return b;
        } else
        {
            return im1;
        }
    }

    private im e(int i, int j)
    {
        if(d == null)
            return null;
        try
        {
            im im1 = d.a(((dy) (g)), i, j);
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
        if(d == null)
            return;
        try
        {
            d.b(((dy) (g)), im1);
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void b(im im1)
    {
        if(d == null)
            return;
        try
        {
            im1.s = g.c;
            d.a(((dy) (g)), im1);
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
            if(c != null)
            {
                c.a(bj1, i, j);
                im1.e();
            }
        }
    }

    public boolean a(boolean flag, hw hw)
    {
        int i = 0;
        for(int j = 0; j < f.size(); j++)
        {
            im im1 = (im)f.get(j);
            if(flag && !im1.p)
                a(im1);
            if(!im1.a(flag))
                continue;
            b(im1);
            im1.o = false;
            if(++i == 2 && !flag)
                return false;
        }

        if(flag)
        {
            if(d == null)
                return true;
            d.b();
        }
        return true;
    }

    public boolean a()
    {
        if(!g.A)
        {
            for(int i = 0; i < 16; i++)
                if(!a.isEmpty())
                {
                    ir ir1 = (ir)a.iterator().next();
                    im im1 = b(ir1.a, ir1.b);
                    im1.d();
                    b(im1);
                    a(im1);
                    a.remove(((java.lang.Object) (ir1)));
                    e.remove(((java.lang.Object) (ir1)));
                    f.remove(((java.lang.Object) (im1)));
                }

            if(d != null)
                d.a();
        }
        return c.a();
    }

    public boolean b()
    {
        return !g.A;
    }
}
