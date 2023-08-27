// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class bu extends dj
{

    private int ad;
    public int a;
    private int ae;
    private int af;
    private int ag;
    public gk b;

    public bu(dy dy1)
    {
        super(dy1);
        ad = 0;
        a = 0;
        C = 0.0F;
        a(0.5F, 0.5F);
    }

    public bu(dy dy1, int i, int j, int k, int l)
    {
        this(dy1);
        ae = i;
        af = j;
        ag = k;
        java.util.ArrayList arraylist = new ArrayList();
        gk agk[] = gk.values();
        int i1 = agk.length;
        for(int j1 = 0; j1 < i1; j1++)
        {
            gk gk1 = agk[j1];
            b = gk1;
            a(l);
            if(b())
                ((java.util.List) (arraylist)).add(((java.lang.Object) (gk1)));
        }

        if(((java.util.List) (arraylist)).size() > 0)
            b = (gk)((java.util.List) (arraylist)).get(R.nextInt(((java.util.List) (arraylist)).size()));
        a(l);
    }

    public void a(int i)
    {
        a = i;
        t = r = i * 90;
        float f = b.z;
        float f1 = b.A;
        float f2 = b.z;
        if(i == 0 || i == 2)
            f2 = 0.5F;
        else
            f = 0.5F;
        f /= 32F;
        f1 /= 32F;
        f2 /= 32F;
        float f3 = (float)ae + 0.5F;
        float f4 = (float)af + 0.5F;
        float f5 = (float)ag + 0.5F;
        float f6 = 0.5625F;
        if(i == 0)
            f5 -= f6;
        if(i == 1)
            f3 -= f6;
        if(i == 2)
            f5 += f6;
        if(i == 3)
            f3 += f6;
        if(i == 0)
            f3 -= c(b.z);
        if(i == 1)
            f5 += c(b.z);
        if(i == 2)
            f3 += c(b.z);
        if(i == 3)
            f5 -= c(b.z);
        f4 += c(b.A);
        a((double)f3, (double)f4, (double)f5);
        float f7 = -0.00625F;
        v.c(f3 - f - f7, f4 - f1 - f7, f5 - f2 - f7, f3 + f + f7, f4 + f1 + f7, f5 + f2 + f7);
    }

    private float c(int i)
    {
        if(i == 32)
            return 0.5F;
        return i != 64 ? 0.0F : 0.5F;
    }

    public void b_()
    {
        if(ad++ == 100 && !b())
        {
            ad = 0;
            j();
            h.a(((dj) (new fn(h, l, m, n, new gp(ez.aq)))));
        }
    }

    public boolean b()
    {
        if(h.a(((dj) (this)), v).size() > 0)
            return false;
        int i = b.z / 16;
        int j = b.A / 16;
        int k = ae;
        int l = af;
        int i1 = ag;
        if(a == 0)
            k = gj.b(this.l - (double)((float)b.z / 32F));
        if(a == 1)
            i1 = gj.b(n - (double)((float)b.z / 32F));
        if(a == 2)
            k = gj.b(this.l - (double)((float)b.z / 32F));
        if(a == 3)
            i1 = gj.b(n - (double)((float)b.z / 32F));
        l = gj.b(m - (double)((float)b.A / 32F));
        for(int j1 = 0; j1 < i; j1++)
        {
            for(int k1 = 0; k1 < j; k1++)
            {
                iq iq1;
                if(a == 0 || a == 2)
                    iq1 = h.c(k + j1, l + k1, ag);
                else
                    iq1 = h.c(ae, l + k1, i1 + j1);
                if(!iq1.a())
                    return false;
            }

        }

        java.util.List list = h.b(((dj) (this)), v);
        for(int l1 = 0; l1 < list.size(); l1++)
            if(list.get(l1) instanceof bu)
                return false;

        return true;
    }

    public boolean c_()
    {
        return true;
    }

    public boolean a(dj dj1, int i)
    {
        j();
        h.a(((dj) (new fn(h, l, m, n, new gp(ez.aq)))));
        return true;
    }

    public void a(s s1)
    {
        s1.a("Dir", (byte)a);
        s1.a("Motive", b.y);
        s1.a("TileX", ae);
        s1.a("TileY", af);
        s1.a("TileZ", ag);
    }

    public void b(s s1)
    {
        a = ((int) (s1.b("Dir")));
        ae = s1.d("TileX");
        af = s1.d("TileY");
        ag = s1.d("TileZ");
        java.lang.String s2 = s1.h("Motive");
        gk agk[] = gk.values();
        int i = agk.length;
        for(int j = 0; j < i; j++)
        {
            gk gk1 = agk[j];
            if(gk1.y.equals(((java.lang.Object) (s2))))
                b = gk1;
        }

        if(b == null)
            b = gk.a;
        a(a);
    }
}
