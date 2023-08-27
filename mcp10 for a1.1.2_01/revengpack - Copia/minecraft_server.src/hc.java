// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class hc extends dj
{

    public int a;
    public int b;

    public hc(dy dy1)
    {
        super(dy1);
        b = 0;
    }

    public hc(dy dy1, float f, float f1, float f2, int i)
    {
        super(dy1);
        b = 0;
        a = i;
        e = true;
        a(0.98F, 0.98F);
        C = E / 2.0F;
        a((double)f, (double)f1, (double)f2);
        o = 0.0D;
        p = 0.0D;
        q = 0.0D;
        H = false;
        this.i = f;
        j = f1;
        k = f2;
    }

    public boolean c_()
    {
        return !B;
    }

    public void b_()
    {
        if(a == 0)
        {
            j();
            return;
        }
        this.i = l;
        this.j = m;
        this.k = n;
        b++;
        p -= 0.039999999105930328D;
        c(o, p, q);
        o *= 0.98000001907348633D;
        p *= 0.98000001907348633D;
        q *= 0.98000001907348633D;
        int i = gj.b(l);
        int j = gj.b(m);
        int k = gj.b(n);
        if(h.a(i, j, k) == a)
            h.d(i, j, k, 0);
        if(w)
        {
            o *= 0.69999998807907104D;
            q *= 0.69999998807907104D;
            p *= -0.5D;
            j();
            if(!h.a(a, i, j, k, true) || !h.d(i, j, k, a))
                a(a, 1);
        } else
        if(b > 100)
        {
            a(a, 1);
            j();
        }
    }

    protected void a(s s1)
    {
        s1.a("Tile", (byte)a);
    }

    protected void b(s s1)
    {
        a = s1.b("Tile") & 0xff;
    }
}
