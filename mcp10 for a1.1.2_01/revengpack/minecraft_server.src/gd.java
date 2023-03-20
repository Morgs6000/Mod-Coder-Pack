// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.List;

class gd
{

    private dy b;
    private int c;
    private int d;
    private int e;
    private int f;
    private java.util.List g;
    final av a;

    public gd(av av1, dy dy1, int i, int j, int k)
    {
        super();
        a = av1;
        g = ((java.util.List) (new ArrayList()));
        b = dy1;
        c = i;
        d = j;
        e = k;
        f = dy1.b(i, j, k);
        a();
    }

    private void a()
    {
        g.clear();
        if(f == 0)
        {
            g.add(((java.lang.Object) (new gs(c, d, e - 1))));
            g.add(((java.lang.Object) (new gs(c, d, e + 1))));
        } else
        if(f == 1)
        {
            g.add(((java.lang.Object) (new gs(c - 1, d, e))));
            g.add(((java.lang.Object) (new gs(c + 1, d, e))));
        } else
        if(f == 2)
        {
            g.add(((java.lang.Object) (new gs(c - 1, d, e))));
            g.add(((java.lang.Object) (new gs(c + 1, d + 1, e))));
        } else
        if(f == 3)
        {
            g.add(((java.lang.Object) (new gs(c - 1, d + 1, e))));
            g.add(((java.lang.Object) (new gs(c + 1, d, e))));
        } else
        if(f == 4)
        {
            g.add(((java.lang.Object) (new gs(c, d + 1, e - 1))));
            g.add(((java.lang.Object) (new gs(c, d, e + 1))));
        } else
        if(f == 5)
        {
            g.add(((java.lang.Object) (new gs(c, d, e - 1))));
            g.add(((java.lang.Object) (new gs(c, d + 1, e + 1))));
        } else
        if(f == 6)
        {
            g.add(((java.lang.Object) (new gs(c + 1, d, e))));
            g.add(((java.lang.Object) (new gs(c, d, e + 1))));
        } else
        if(f == 7)
        {
            g.add(((java.lang.Object) (new gs(c - 1, d, e))));
            g.add(((java.lang.Object) (new gs(c, d, e + 1))));
        } else
        if(f == 8)
        {
            g.add(((java.lang.Object) (new gs(c - 1, d, e))));
            g.add(((java.lang.Object) (new gs(c, d, e - 1))));
        } else
        if(f == 9)
        {
            g.add(((java.lang.Object) (new gs(c + 1, d, e))));
            g.add(((java.lang.Object) (new gs(c, d, e - 1))));
        }
    }

    private void b()
    {
        for(int i = 0; i < g.size(); i++)
        {
            gd gd1 = a((gs)g.get(i));
            if(gd1 == null || !gd1.b(this))
                g.remove(i--);
            else
                g.set(i, ((java.lang.Object) (new gs(gd1.c, gd1.d, gd1.e))));
        }

    }

    private boolean a(int i, int j, int k)
    {
        if(b.a(i, j, k) == a.bc)
            return true;
        if(b.a(i, j + 1, k) == a.bc)
            return true;
        return b.a(i, j - 1, k) == a.bc;
    }

    private gd a(gs gs1)
    {
        if(b.a(gs1.a, gs1.b, gs1.c) == a.bc)
            return new gd(a, b, gs1.a, gs1.b, gs1.c);
        if(b.a(gs1.a, gs1.b + 1, gs1.c) == a.bc)
            return new gd(a, b, gs1.a, gs1.b + 1, gs1.c);
        if(b.a(gs1.a, gs1.b - 1, gs1.c) == a.bc)
            return new gd(a, b, gs1.a, gs1.b - 1, gs1.c);
        else
            return null;
    }

    private boolean b(gd gd1)
    {
        for(int i = 0; i < g.size(); i++)
        {
            gs gs1 = (gs)g.get(i);
            if(gs1.a == gd1.c && gs1.c == gd1.e)
                return true;
        }

        return false;
    }

    private boolean b(int i, int j, int k)
    {
        for(int l = 0; l < g.size(); l++)
        {
            gs gs1 = (gs)g.get(l);
            if(gs1.a == i && gs1.c == k)
                return true;
        }

        return false;
    }

    private int c()
    {
        int i = 0;
        if(a(c, d, e - 1))
            i++;
        if(a(c, d, e + 1))
            i++;
        if(a(c - 1, d, e))
            i++;
        if(a(c + 1, d, e))
            i++;
        return i;
    }

    private boolean c(gd gd1)
    {
        if(b(gd1))
            return true;
        if(g.size() == 2)
            return false;
        if(g.size() == 0)
            return true;
        gs gs1 = (gs)g.get(0);
        return gd1.d != d || gs1.b != d ? true : true;
    }

    private void d(gd gd1)
    {
        g.add(((java.lang.Object) (new gs(gd1.c, gd1.d, gd1.e))));
        boolean flag = b(c, d, e - 1);
        boolean flag1 = b(c, d, e + 1);
        boolean flag2 = b(c - 1, d, e);
        boolean flag3 = b(c + 1, d, e);
        byte byte0 = -1;
        if(flag || flag1)
            byte0 = 0;
        if(flag2 || flag3)
            byte0 = 1;
        if(flag1 && flag3 && !flag && !flag2)
            byte0 = 6;
        if(flag1 && flag2 && !flag && !flag3)
            byte0 = 7;
        if(flag && flag2 && !flag1 && !flag3)
            byte0 = 8;
        if(flag && flag3 && !flag1 && !flag2)
            byte0 = 9;
        if(byte0 == 0)
        {
            if(b.a(c, d + 1, e - 1) == a.bc)
                byte0 = 4;
            if(b.a(c, d + 1, e + 1) == a.bc)
                byte0 = 5;
        }
        if(byte0 == 1)
        {
            if(b.a(c + 1, d + 1, e) == a.bc)
                byte0 = 2;
            if(b.a(c - 1, d + 1, e) == a.bc)
                byte0 = 3;
        }
        if(byte0 < 0)
            byte0 = 0;
        b.b(c, d, e, ((int) (byte0)));
    }

    private boolean c(int i, int j, int k)
    {
        gd gd1 = a(new gs(i, j, k));
        if(gd1 == null)
        {
            return false;
        } else
        {
            gd1.b();
            return gd1.c(this);
        }
    }

    public void a(boolean flag)
    {
        boolean flag1 = c(c, d, e - 1);
        boolean flag2 = c(c, d, e + 1);
        boolean flag3 = c(c - 1, d, e);
        boolean flag4 = c(c + 1, d, e);
        int i = -1;
        if((flag1 || flag2) && !flag3 && !flag4)
            i = 0;
        if((flag3 || flag4) && !flag1 && !flag2)
            i = 1;
        if(flag2 && flag4 && !flag1 && !flag3)
            i = 6;
        if(flag2 && flag3 && !flag1 && !flag4)
            i = 7;
        if(flag1 && flag3 && !flag2 && !flag4)
            i = 8;
        if(flag1 && flag4 && !flag2 && !flag3)
            i = 9;
        if(i == -1)
        {
            if(flag1 || flag2)
                i = 0;
            if(flag3 || flag4)
                i = 1;
            if(flag)
            {
                if(flag2 && flag4)
                    i = 6;
                if(flag3 && flag2)
                    i = 7;
                if(flag4 && flag1)
                    i = 9;
                if(flag1 && flag3)
                    i = 8;
            } else
            {
                if(flag1 && flag3)
                    i = 8;
                if(flag4 && flag1)
                    i = 9;
                if(flag3 && flag2)
                    i = 7;
                if(flag2 && flag4)
                    i = 6;
            }
        }
        if(i == 0)
        {
            if(b.a(c, d + 1, e - 1) == a.bc)
                i = 4;
            if(b.a(c, d + 1, e + 1) == a.bc)
                i = 5;
        }
        if(i == 1)
        {
            if(b.a(c + 1, d + 1, e) == a.bc)
                i = 2;
            if(b.a(c - 1, d + 1, e) == a.bc)
                i = 3;
        }
        if(i < 0)
            i = 0;
        f = i;
        a();
        b.b(c, d, e, i);
        for(int j = 0; j < g.size(); j++)
        {
            gd gd1 = a((gs)g.get(j));
            if(gd1 == null)
                continue;
            gd1.b();
            if(gd1.c(this))
                gd1.d(this);
        }

    }

    static int a(gd gd1)
    {
        return gd1.c();
    }
}
