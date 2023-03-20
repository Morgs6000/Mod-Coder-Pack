// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class df extends as
    implements iw
{

    private gp e[];
    private int f;
    private int g;
    private int h;

    public df()
    {
        e = new gp[3];
        f = 0;
        g = 0;
        h = 0;
    }

    public int a()
    {
        return e.length;
    }

    public gp a(int i)
    {
        return e[i];
    }

    public void a(s s1)
    {
        super.a(s1);
        dm dm1 = s1.k("Items");
        e = new gp[a()];
        for(int i = 0; i < dm1.b(); i++)
        {
            s s2 = (s)dm1.a(i);
            byte byte0 = s2.b("Slot");
            if(byte0 >= 0 && byte0 < e.length)
                e[byte0] = new gp(s2);
        }

        f = ((int) (s1.c("BurnTime")));
        h = ((int) (s1.c("CookTime")));
        g = a(e[1]);
    }

    public void b(s s1)
    {
        super.b(s1);
        s1.a("BurnTime", (short)f);
        s1.a("CookTime", (short)h);
        dm dm1 = new dm();
        for(int i = 0; i < e.length; i++)
            if(e[i] != null)
            {
                s s2 = new s();
                s2.a("Slot", (byte)i);
                e[i].a(s2);
                dm1.a(((gg) (s2)));
            }

        s1.a("Items", ((gg) (dm1)));
    }

    public int d()
    {
        return 64;
    }

    public boolean e()
    {
        return f > 0;
    }

    public void b()
    {
        boolean flag = f > 0;
        boolean flag1 = false;
        if(f > 0)
            f--;
        if(!a.x)
        {
            if(f == 0 && g())
            {
                g = f = a(e[1]);
                if(f > 0)
                {
                    flag1 = true;
                    if(e[1] != null)
                    {
                        e[1].a--;
                        if(e[1].a == 0)
                            e[1] = null;
                    }
                }
            }
            if(e() && g())
            {
                h++;
                if(h == 200)
                {
                    h = 0;
                    f();
                    flag1 = true;
                }
            } else
            {
                h = 0;
            }
            if(flag != (f > 0))
            {
                flag1 = true;
                dv.a(f > 0, a, b, c, d);
            }
        }
        if(flag1)
            c();
    }

    private boolean g()
    {
        if(e[0] == null)
            return false;
        int i = b(e[0].a().aS);
        if(i < 0)
            return false;
        if(e[2] == null)
            return true;
        if(e[2].c != i)
            return false;
        if(e[2].a < d() && e[2].a < e[2].b())
            return true;
        return e[2].a < ez.c[i].a();
    }

    public void f()
    {
        if(!g())
            return;
        int i = b(e[0].a().aS);
        if(e[2] == null)
            e[2] = new gp(i, 1);
        else
        if(e[2].c == i)
            e[2].a++;
        e[0].a--;
        if(e[0].a <= 0)
            e[0] = null;
    }

    private int b(int i)
    {
        if(i == ff.I.bc)
            return ez.m.aS;
        if(i == ff.H.bc)
            return ez.n.aS;
        if(i == ff.ax.bc)
            return ez.l.aS;
        if(i == ff.F.bc)
            return ff.N.bc;
        if(i == ez.ao.aS)
            return ez.ap.aS;
        if(i == ff.x.bc)
            return ff.u.bc;
        if(i == ez.aG.aS)
            return ez.aF.aS;
        else
            return -1;
    }

    private int a(gp gp1)
    {
        if(gp1 == null)
            return 0;
        int i = gp1.a().aS;
        if(i < 256 && ff.n[i].bn == iq.c)
            return 300;
        if(i == ez.B.aS)
            return 100;
        if(i == ez.k.aS)
            return 1600;
        return i != ez.aw.aS ? 0 : 20000;
    }
}
