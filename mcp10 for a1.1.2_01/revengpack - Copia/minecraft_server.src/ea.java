// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class ea extends fc
{

    public id a;
    public net.minecraft.server.MinecraftServer b;
    public in ad;
    public double ae;
    public double af;
    public java.util.List ag;
    public java.util.Set ah;
    public double ai;

    public ea(net.minecraft.server.MinecraftServer minecraftserver, dy dy1, java.lang.String s, in in1)
    {
        super(dy1);
        ag = ((java.util.List) (new LinkedList()));
        ah = ((java.util.Set) (new HashSet()));
        int j = (dy1.n + R.nextInt(20)) - 10;
        int k = (dy1.p + R.nextInt(20)) - 10;
        int l = dy1.d(j, k);
        c((double)j + 0.5D, l, (double)k + 0.5D, 0.0F, 0.0F);
        b = minecraftserver;
        N = 0.0F;
        in1.a = ((fc) (this));
        aq = s;
        ad = in1;
        C = 0.0F;
    }

    public void b_()
    {
    }

    public void f(dj dj1)
    {
    }

    public boolean a(dj dj1, int j)
    {
        return false;
    }

    public void a(int j)
    {
    }

    public void i()
    {
        super.b_();
        iy iy1 = null;
        double d = 0.0D;
        for(int j = 0; j < ag.size(); j++)
        {
            iy iy2 = (iy)ag.get(j);
            double d1 = iy2.a(((dj) (this)));
            if(j == 0 || d1 < d)
            {
                iy1 = iy2;
                d = iy2.a(((dj) (this)));
            }
        }

        if(iy1 != null)
        {
            boolean flag = false;
            if(d < 1024D)
                flag = true;
            if(a.b() < 2)
                flag = true;
            if(flag)
            {
                ag.remove(((java.lang.Object) (iy1)));
                a.b(((hp) (new cz(iy1.a * 16, 0, iy1.b * 16, 16, 128, 16, ((dy) (b.e))))));
                java.util.List list = b.e.d(iy1.a * 16, 0, iy1.b * 16, iy1.a * 16 + 16, 128, iy1.b * 16 + 16);
                for(int k = 0; k < list.size(); k++)
                {
                    as as1 = (as)list.get(k);
                    a.b(((hp) (new ib(as1.b, as1.c, as1.d, as1))));
                }

            }
        }
    }

    public void y()
    {
        o = p = q = 0.0D;
        bg = false;
        super.y();
    }

    public void c(dj dj1, int j)
    {
        if(!dj1.B && (dj1 instanceof fn))
        {
            a.b(((hp) (new en(((fn)dj1).a, j))));
            b.k.a(dj1, ((hp) (new ce(dj1.c, c))));
        }
        super.c(dj1, j);
    }

    public void z()
    {
        if(!ao)
        {
            ap = -1;
            ao = true;
            b.k.a(((dj) (this)), ((hp) (new o(((dj) (this)), 1))));
        }
    }

    protected float p()
    {
        return 1.62F;
    }
}
