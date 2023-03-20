// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class gm
    implements iw
{

    public gp a[];
    public gp b[];
    public gp c[];
    public int d;
    private fc f;
    public boolean e;

    public gm(fc fc1)
    {
        a = new gp[37];
        b = new gp[4];
        c = new gp[4];
        d = 0;
        e = false;
        f = fc1;
    }

    public gp b()
    {
        return a[d];
    }

    private int c(int i)
    {
        for(int j = 0; j < a.length; j++)
            if(a[j] != null && a[j].c == i && a[j].a < a[j].b() && a[j].a < d())
                return j;

        return -1;
    }

    private int g()
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] == null)
                return i;

        return -1;
    }

    private int a(int i, int j)
    {
        int k = c(i);
        if(k < 0)
            k = g();
        if(k < 0)
            return j;
        if(a[k] == null)
            a[k] = new gp(i, 0);
        int l = j;
        if(l > a[k].b() - a[k].a)
            l = a[k].b() - a[k].a;
        if(l > d() - a[k].a)
            l = d() - a[k].a;
        if(l == 0)
        {
            return j;
        } else
        {
            j -= l;
            a[k].a += l;
            a[k].b = 5;
            return j;
        }
    }

    public void c()
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] != null && a[i].b > 0)
                a[i].b--;

    }

    public boolean a(gp gp1)
    {
        if(gp1.d == 0)
        {
            gp1.a = a(gp1.c, gp1.a);
            if(gp1.a == 0)
                return true;
        }
        int i = g();
        if(i >= 0)
        {
            a[i] = gp1;
            a[i].b = 5;
            return true;
        } else
        {
            return false;
        }
    }

    public void a(int i, gp gp1)
    {
        gp agp[] = a;
        if(i >= agp.length)
        {
            i -= agp.length;
            agp = b;
        }
        if(i >= agp.length)
        {
            i -= agp.length;
            agp = c;
        }
        agp[i] = gp1;
    }

    public float a(ff ff1)
    {
        float f1 = 1.0F;
        if(a[d] != null)
            f1 *= a[d].a(ff1);
        return f1;
    }

    public dm a(dm dm1)
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] != null)
            {
                s s1 = new s();
                s1.a("Slot", (byte)i);
                a[i].a(s1);
                dm1.a(((gg) (s1)));
            }

        for(int j = 0; j < b.length; j++)
            if(b[j] != null)
            {
                s s2 = new s();
                s2.a("Slot", (byte)(j + 100));
                b[j].a(s2);
                dm1.a(((gg) (s2)));
            }

        for(int k = 0; k < c.length; k++)
            if(c[k] != null)
            {
                s s3 = new s();
                s3.a("Slot", (byte)(k + 80));
                c[k].a(s3);
                dm1.a(((gg) (s3)));
            }

        return dm1;
    }

    public void b(dm dm1)
    {
        a = new gp[36];
        b = new gp[4];
        c = new gp[4];
        for(int i = 0; i < dm1.b(); i++)
        {
            s s1 = (s)dm1.a(i);
            int j = s1.b("Slot") & 0xff;
            if(j >= 0 && j < a.length)
                a[j] = new gp(s1);
            if(j >= 80 && j < c.length + 80)
                c[j - 80] = new gp(s1);
            if(j >= 100 && j < b.length + 100)
                b[j - 100] = new gp(s1);
        }

    }

    public int a()
    {
        return a.length + 4;
    }

    public gp a(int i)
    {
        gp agp[] = a;
        if(i >= agp.length)
        {
            i -= agp.length;
            agp = b;
        }
        if(i >= agp.length)
        {
            i -= agp.length;
            agp = c;
        }
        return agp[i];
    }

    public int d()
    {
        return 64;
    }

    public boolean b(ff ff1)
    {
        if(ff1.bn != iq.d && ff1.bn != iq.e && ff1.bn != iq.t && ff1.bn != iq.s)
            return true;
        gp gp1 = a(d);
        if(gp1 != null)
            return gp1.b(ff1);
        else
            return false;
    }

    public int e()
    {
        int i = 0;
        int j = 0;
        int k = 0;
        for(int l = 0; l < b.length; l++)
            if(b[l] != null && (b[l].a() instanceof go))
            {
                int i1 = b[l].c();
                int j1 = b[l].d;
                int k1 = i1 - j1;
                j += k1;
                k += i1;
                int l1 = ((go)b[l].a()).aY;
                i += l1;
            }

        if(k == 0)
            return 0;
        else
            return ((i - 1) * j) / k + 1;
    }

    public void b(int i)
    {
        for(int j = 0; j < b.length; j++)
        {
            if(b[j] == null || !(b[j].a() instanceof go))
                continue;
            b[j].a(i);
            if(b[j].a == 0)
            {
                b[j].a(f);
                b[j] = null;
            }
        }

    }

    public void f()
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] != null)
            {
                f.a(a[i], true);
                a[i] = null;
            }

        for(int j = 0; j < b.length; j++)
            if(b[j] != null)
            {
                f.a(b[j], true);
                b[j] = null;
            }

    }
}
