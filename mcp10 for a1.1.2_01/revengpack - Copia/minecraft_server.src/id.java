// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class id extends ej
    implements ef
{

    public static java.util.logging.Logger a = java.util.logging.Logger.getLogger("Minecraft");
    public bb b;
    public boolean c;
    private net.minecraft.server.MinecraftServer d;
    private ea e;
    private int f;
    private double g;
    private double h;
    private double i;
    private boolean j;
    private gp k;

    public id(net.minecraft.server.MinecraftServer minecraftserver, bb bb1, ea ea1)
    {
        c = false;
        f = 0;
        j = true;
        k = null;
        d = minecraftserver;
        b = bb1;
        bb1.a(((ej) (this)));
        e = ea1;
        ea1.a = this;
    }

    public void a()
    {
        b.a();
        if(f++ % 20 == 0)
            b.a(((hp) (new iz())));
    }

    public void c(java.lang.String s)
    {
        b.a(((hp) (new io(s))));
        b.c();
        d.f.c(e);
        c = true;
    }

    public void a(gf gf1)
    {
        if(!j)
        {
            double d1 = gf1.b - h;
            if(gf1.a == g && d1 * d1 < 0.01D && gf1.c == i)
                j = true;
        }
        if(j)
        {
            g = e.l;
            h = e.m;
            i = e.n;
            double d2 = e.l;
            double d3 = e.m;
            double d4 = e.n;
            float f1 = e.r;
            float f2 = e.s;
            if(gf1.h)
            {
                d2 = gf1.a;
                d3 = gf1.b;
                d4 = gf1.c;
                double d5 = gf1.d - gf1.b;
                if(d5 > 1.6499999999999999D || d5 < 0.10000000000000001D)
                {
                    c("Illegal stance");
                    a.warning((new StringBuilder()).append(e.aq).append(" had an illegal stance: ").append(d5).toString());
                }
                e.ai = gf1.d;
            }
            if(gf1.i)
            {
                f1 = gf1.e;
                f2 = gf1.f;
            }
            e.i();
            e.M = 0.0F;
            e.b(g, h, i, f1, f2);
            double d6 = d2 - e.l;
            double d7 = d3 - e.m;
            double d8 = d4 - e.n;
            float f3 = 0.0625F;
            boolean flag = d.e.a(((dj) (e)), e.v.b().e(f3, f3, f3)).size() == 0;
            e.c(d6, d7, d8);
            d6 = d2 - e.l;
            d7 = d3 - e.m;
            if(d7 > -0.5D || d7 < 0.5D)
                d7 = 0.0D;
            d8 = d4 - e.n;
            double d9 = d6 * d6 + d7 * d7 + d8 * d8;
            boolean flag1 = false;
            if(d9 > 0.0625D)
            {
                flag1 = true;
                a.warning((new StringBuilder()).append(e.aq).append(" moved wrongly!").toString());
            }
            e.b(d2, d3, d4, f1, f2);
            boolean flag2 = d.e.a(((dj) (e)), e.v.b().e(f3, f3, f3)).size() == 0;
            if(flag && (flag1 || !flag2))
            {
                a(g, h, i, f1, f2);
                return;
            }
            e.w = gf1.g;
            d.f.b(e);
        }
    }

    public void a(double d1, double d2, double d3, float f1, 
            float f2)
    {
        j = false;
        g = d1;
        h = d2;
        i = d3;
        e.b(d1, d2, d3, f1, f2);
        e.a.b(((hp) (new dq(d1, d2 + 1.6200000047683716D, d2, d3, f1, f2, false))));
    }

    public void a(hd hd1)
    {
        e.aj.a[e.aj.d] = k;
        boolean flag = d.e.z = d.f.g(e.aq);
        boolean flag1 = false;
        if(hd1.e == 0)
            flag1 = true;
        if(hd1.e == 1)
            flag1 = true;
        if(flag1)
        {
            double d1 = e.m;
            e.m = e.ai;
            fr fr1 = e.a(4D, 1.0F);
            e.m = d1;
            if(fr1 == null)
                return;
            if(fr1.b != hd1.a || fr1.c != hd1.b || fr1.d != hd1.c || fr1.e != hd1.d)
                return;
        }
        int l = hd1.a;
        int i1 = hd1.b;
        int j1 = hd1.c;
        int k1 = hd1.d;
        int l1 = (int)gj.e(l - d.e.n);
        int i2 = (int)gj.e(j1 - d.e.p);
        if(l1 > i2)
            i2 = l1;
        if(hd1.e == 0)
        {
            if(i2 > 16 || flag)
                e.ad.a(l, i1, j1);
        } else
        if(hd1.e == 2)
            e.ad.a();
        else
        if(hd1.e == 1)
        {
            if(i2 > 16 || flag)
                e.ad.a(l, i1, j1, k1);
        } else
        if(hd1.e == 3)
        {
            double d2 = e.l - ((double)l + 0.5D);
            double d3 = e.m - ((double)i1 + 0.5D);
            double d4 = e.n - ((double)j1 + 0.5D);
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            if(d5 < 256D)
                e.a.b(((hp) (new et(l, i1, j1, ((dy) (d.e))))));
        }
        d.e.z = false;
    }

    public void a(fe fe1)
    {
        boolean flag = d.e.z = d.f.g(e.aq);
        int l = fe1.b;
        int i1 = fe1.c;
        int j1 = fe1.d;
        int k1 = fe1.e;
        int l1 = (int)gj.e(l - d.e.n);
        int i2 = (int)gj.e(j1 - d.e.p);
        if(l1 > i2)
            i2 = l1;
        if(i2 > 16 || flag)
        {
            gp gp1 = fe1.a < 0 ? null : new gp(fe1.a);
            e.ad.a(((fc) (e)), ((dy) (d.e)), gp1, l, i1, j1, k1);
        }
        e.a.b(((hp) (new et(l, i1, j1, ((dy) (d.e))))));
        d.e.z = false;
    }

    public void a(java.lang.String s)
    {
        a.info((new StringBuilder()).append(e.aq).append(" lost connection: ").append(s).toString());
        d.f.c(e);
        c = true;
    }

    public void a(hp hp)
    {
        a.warning((new StringBuilder()).append(((java.lang.Object) (((java.lang.Object)this).getClass()))).append(" wasn't prepared to deal with a ").append(((java.lang.Object) (((java.lang.Object) (hp)).getClass()))).toString());
        c("Protocol error, unexpected packet");
    }

    public void b(hp hp)
    {
        b.a(hp);
    }

    public void a(fv fv1)
    {
        int l = fv1.b;
        e.aj.d = e.aj.a.length - 1;
        if(l == 0)
            k = null;
        else
            k = new gp(l);
        e.aj.a[e.aj.d] = k;
        d.k.a(((dj) (e)), ((hp) (new fv(e.c, l))));
    }

    public void a(k k1)
    {
        double d1 = (double)k1.b / 32D;
        double d2 = (double)k1.c / 32D;
        double d3 = (double)k1.d / 32D;
        fn fn1 = new fn(((dy) (d.e)), d1, d2, d3, new gp(k1.h, k1.i));
        fn1.o = (double)k1.e / 128D;
        fn1.p = (double)k1.f / 128D;
        fn1.q = (double)k1.g / 128D;
        fn1.ad = 10;
        d.e.a(((dj) (fn1)));
    }

    public void a(ba ba1)
    {
        java.lang.String s = ba1.a;
        if(s.length() > 100)
        {
            c("Chat message too long");
            return;
        }
        s = s.trim();
        for(int l = 0; l < s.length(); l++)
            if(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~\u2302\307\374\351\342\344\340\345\347\352\353\350\357\356\354\304\305\311\346\306\364\366\362\373\371\377\326\334\370\243\330\327\u0192\341\355\363\372\361\321\252\272\277\256\254\275\274\241\253\273".indexOf(((int) (s.charAt(l)))) < 0)
            {
                c("Illegal characters in chat");
                return;
            }

        if(s.startsWith("/"))
        {
            d(s);
        } else
        {
            s = (new StringBuilder()).append("<").append(e.aq).append("> ").append(s).toString();
            a.info(s);
            d.f.a(((hp) (new ba(s))));
        }
    }

    private void d(java.lang.String s)
    {
        if(s.toLowerCase().startsWith("/me "))
        {
            s = (new StringBuilder()).append("* ").append(e.aq).append(" ").append(s.substring(s.indexOf(" ")).trim()).toString();
            a.info(s);
            d.f.a(((hp) (new ba(s))));
        } else
        if(s.toLowerCase().startsWith("/tell "))
        {
            java.lang.String as1[] = s.split(" ");
            if(as1.length >= 3)
            {
                s = s.substring(s.indexOf(" ")).trim();
                s = s.substring(s.indexOf(" ")).trim();
                s = (new StringBuilder()).append("\2477").append(e.aq).append(" whispers ").append(s).toString();
                a.info((new StringBuilder()).append(s).append(" to ").append(as1[1]).toString());
                if(!d.f.a(as1[1], ((hp) (new ba(s)))))
                    b(((hp) (new ba("\247cThere's no player by that name online."))));
            }
        } else
        if(s.toLowerCase().equalsIgnoreCase("/home"))
        {
            a.info((new StringBuilder()).append(e.aq).append(" returned home").toString());
            int l = d.e.d(d.e.n, d.e.p);
            a((double)d.e.n + 0.5D, (double)l + 1.5D, (double)d.e.p + 0.5D, 0.0F, 0.0F);
        } else
        if(s.toLowerCase().equalsIgnoreCase("/iron"))
        {
            if(net.minecraft.server.MinecraftServer.b.containsKey(((java.lang.Object) (e.aq))))
            {
                a.info((new StringBuilder()).append(e.aq).append(" failed to iron!").toString());
                b(((hp) (new ba("\247cYou can't /iron again so soon!"))));
            } else
            {
            	net.minecraft.server.MinecraftServer.b.put(((java.lang.Object) (e.aq)), ((java.lang.Object) (java.lang.Integer.valueOf(6000))));
                a.info((new StringBuilder()).append(e.aq).append(" ironed!").toString());
                for(int i1 = 0; i1 < 4; i1++)
                    e.a(new gp(ez.m, 1));

            }
        } else
        if(s.toLowerCase().equalsIgnoreCase("/wood"))
        {
            if(net.minecraft.server.MinecraftServer.b.containsKey(((java.lang.Object) (e.aq))))
            {
                a.info((new StringBuilder()).append(e.aq).append(" failed to wood!").toString());
                b(((hp) (new ba("\247cYou can't /wood again so soon!"))));
            } else
            {
            	net.minecraft.server.MinecraftServer.b.put(((java.lang.Object) (e.aq)), ((java.lang.Object) (java.lang.Integer.valueOf(6000))));
                a.info((new StringBuilder()).append(e.aq).append(" wooded!").toString());
                for(int j1 = 0; j1 < 4; j1++)
                    e.a(new gp(ff.z, 1));

            }
        } else
        if(d.f.g(e.aq))
        {
            java.lang.String s1 = s.substring(1);
            a.info((new StringBuilder()).append(e.aq).append(" issued server command: ").append(s1).toString());
            d.a(s1, ((ef) (this)));
        } else
        {
            java.lang.String s2 = s.substring(1);
            a.info((new StringBuilder()).append(e.aq).append(" tried command: ").append(s2).toString());
        }
    }

    public void a(o o1)
    {
        if(o1.b == 1)
            e.z();
    }

    public void a(io io1)
    {
        b.a("Quitting");
    }

    public int b()
    {
        return b.d();
    }

    public void b(java.lang.String s)
    {
        b(((hp) (new ba((new StringBuilder()).append("\2477").append(s).toString()))));
    }

    public java.lang.String c()
    {
        return e.aq;
    }

    public void a(r r1)
    {
        if(r1.a == -1)
            e.aj.a = r1.b;
        if(r1.a == -2)
            e.aj.c = r1.b;
        if(r1.a == -3)
            e.aj.b = r1.b;
    }

    public void d()
    {
        b.a(((hp) (new r(-1, e.aj.a))));
        b.a(((hp) (new r(-2, e.aj.c))));
        b.a(((hp) (new r(-3, e.aj.b))));
    }

    public void a(ib ib1)
    {
        as as1 = d.e.k(ib1.a, ib1.b, ib1.c);
        if(as1 != null)
        {
            as1.a(ib1.e);
            as1.c();
        }
    }

}
