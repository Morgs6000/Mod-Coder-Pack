// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class in
{

    private dy b;
    public fc a;
    private float c;
    private float d;
    private int e;
    private float f;
    private int g;
    private int h;
    private int i;

    public in(dy dy1)
    {
        d = 0.0F;
        e = 0;
        f = 0.0F;
        b = dy1;
    }

    public void a(int j, int k, int l)
    {
        int i1 = b.a(j, k, l);
        if(i1 > 0 && d == 0.0F)
            ff.n[i1].b(b, j, k, l, a);
        if(i1 > 0 && ff.n[i1].a(a) >= 1.0F)
            c(j, k, l);
    }

    public void a()
    {
        d = 0.0F;
        e = 0;
    }

    public void a(int j, int k, int l, int i1)
    {
        if(e > 0)
        {
            e--;
            return;
        }
        if(j == g && k == h && l == i)
        {
            int j1 = b.a(j, k, l);
            if(j1 == 0)
                return;
            ff ff1 = ff.n[j1];
            d += ff1.a(a);
            f++;
            if(d >= 1.0F)
            {
                c(j, k, l);
                d = 0.0F;
                c = 0.0F;
                f = 0.0F;
                e = 5;
            }
        } else
        {
            d = 0.0F;
            c = 0.0F;
            f = 0.0F;
            g = j;
            h = k;
            i = l;
        }
    }

    public boolean b(int j, int k, int l)
    {
        ff ff1 = ff.n[b.a(j, k, l)];
        int i1 = b.b(j, k, l);
        boolean flag = b.d(j, k, l, 0);
        if(ff1 != null && flag)
            ff1.a(b, j, k, l, i1);
        return flag;
    }

    public boolean c(int j, int k, int l)
    {
        int i1 = b.a(j, k, l);
        int j1 = b.b(j, k, l);
        boolean flag = b(j, k, l);
        gp gp1 = a.B();
        if(gp1 != null)
        {
            gp1.a(i1, j, k, l);
            if(gp1.a == 0)
            {
                gp1.a(a);
                a.C();
            }
        }
        if(flag && a.b(ff.n[i1]))
            ff.n[i1].a_(b, j, k, l, j1);
        return flag;
    }

    public boolean a(fc fc1, dy dy1, gp gp1, int j, int k, int l, int i1)
    {
        int j1 = dy1.a(j, k, l);
        if(j1 > 0 && ff.n[j1].a(dy1, j, k, l, fc1))
            return true;
        if(gp1 == null)
            return false;
        else
            return gp1.a(fc1, dy1, j, k, l, i1);
    }
}
