// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.Random;

public class ff
{

    public static final bq e;
    public static final bq f;
    public static final bq g;
    public static final bq h;
    public static final bq i;
    public static final bq j;
    public static final bq k;
    public static final bq l;
    public static final bq m;
    public static final ff n[];
    public static final boolean o[] = new boolean[256];
    public static final boolean p[] = new boolean[256];
    public static final boolean q[] = new boolean[256];
    public static final int r[] = new int[256];
    public static final boolean s[] = new boolean[256];
    public static final int t[] = new int[256];
    public static final ff u;
    public static final gz v;
    public static final ff w;
    public static final ff x;
    public static final ff y;
    public static final ff z;
    public static final ff A;
    public static final ff B;
    public static final ff C;
    public static final ff D;
    public static final ff E;
    public static final ff F;
    public static final ff G;
    public static final ff H;
    public static final ff I;
    public static final ff J;
    public static final ff K;
    public static final br L;
    public static final ff M;
    public static final ff N;
    public static final ff O = null;
    public static final ff P = null;
    public static final ff Q = null;
    public static final ff R = null;
    public static final ff S = null;
    public static final ff T = null;
    public static final ff U = null;
    public static final ff V = null;
    public static final ff W = null;
    public static final ff X = null;
    public static final ff Y = null;
    public static final ff Z = null;
    public static final ff aa = null;
    public static final ff ab = null;
    public static final ff ac;
    public static final ff ad = null;
    public static final gn ae;
    public static final gn af;
    public static final gn ag;
    public static final gn ah;
    public static final ff ai;
    public static final ff aj;
    public static final ff ak;
    public static final ff al;
    public static final ff am;
    public static final ff an;
    public static final ff ao;
    public static final ff ap;
    public static final ff aq;
    public static final ff ar;
    public static final il as;
    public static final ff at;
    public static final ff au;
    public static final ff av;
    public static final ff aw;
    public static final ff ax;
    public static final ff ay;
    public static final ff az;
    public static final ff aA;
    public static final ff aB;
    public static final ff aC;
    public static final ff aD;
    public static final ff aE;
    public static final ff aF;
    public static final ff aG;
    public static final ff aH;
    public static final ff aI;
    public static final ff aJ;
    public static final ff aK;
    public static final ff aL;
    public static final ff aM;
    public static final ff aN;
    public static final ff aO;
    public static final ff aP;
    public static final ff aQ;
    public static final ff aR;
    public static final ff aS;
    public static final ff aT;
    public static final ff aU;
    public static final ff aV;
    public static final ff aW;
    public static final ff aX;
    public static final ff aY;
    public static final ff aZ;
    public static final ff ba;
    public int bb;
    public final int bc;
    protected float bd;
    protected float be;
    public double bf;
    public double bg;
    public double bh;
    public double bi;
    public double bj;
    public double bk;
    public bq bl;
    public float bm;
    public final iq bn;
    public float bo;

    protected ff(int i1, iq iq1)
    {
        bl = e;
        bm = 1.0F;
        bo = 0.6F;
        if(n[i1] != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Slot ").append(i1).append(" is already occupied by ").append(((java.lang.Object) (n[i1]))).append(" when adding ").append(((java.lang.Object) (this))).toString());
        } else
        {
            bn = iq1;
            n[i1] = this;
            bc = i1;
            a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            p[i1] = b();
            r[i1] = b() ? 255 : 0;
            s[i1] = f();
            q[i1] = false;
            return;
        }
    }

    protected ff(int i1, int j1, iq iq1)
    {
        this(i1, iq1);
        bb = j1;
    }

    protected ff a(bq bq1)
    {
        bl = bq1;
        return this;
    }

    protected ff c(int i1)
    {
        r[bc] = i1;
        return this;
    }

    protected ff a(float f1)
    {
        t[bc] = (int)(15F * f1);
        return this;
    }

    protected ff b(float f1)
    {
        be = f1 * 3F;
        return this;
    }

    private boolean f()
    {
        return false;
    }

    public int a()
    {
        return 0;
    }

    protected ff c(float f1)
    {
        bd = f1;
        if(be < f1 * 5F)
            be = f1 * 5F;
        return this;
    }

    protected void a(boolean flag)
    {
        o[bc] = flag;
    }

    public void a(float f1, float f2, float f3, float f4, float f5, float f6)
    {
        bf = f1;
        bg = f2;
        bh = f3;
        bi = f4;
        bj = f5;
        bk = f6;
    }

    public boolean a(hq hq1, int i1, int j1, int k1, int l1)
    {
        if(l1 == 0 && bg > 0.0D)
            return true;
        if(l1 == 1 && bj < 1.0D)
            return true;
        if(l1 == 2 && bh > 0.0D)
            return true;
        if(l1 == 3 && bk < 1.0D)
            return true;
        if(l1 == 4 && bf > 0.0D)
            return true;
        if(l1 == 5 && bi < 1.0D)
            return true;
        else
            return !hq1.d(i1, j1, k1);
    }

    public int a(int i1)
    {
        return bb;
    }

    public void a(dy dy1, int i1, int j1, int k1, dg dg1, java.util.ArrayList arraylist)
    {
        dg dg2 = d(dy1, i1, j1, k1);
        if(dg2 != null && dg1.a(dg2))
            arraylist.add(((java.lang.Object) (dg2)));
    }

    public dg d(dy dy1, int i1, int j1, int k1)
    {
        return dg.b((double)i1 + bf, (double)j1 + bg, (double)k1 + bh, (double)i1 + bi, (double)j1 + bj, (double)k1 + bk);
    }

    public boolean b()
    {
        return true;
    }

    public boolean a(int i1, boolean flag)
    {
        return e();
    }

    public boolean e()
    {
        return true;
    }

    public void a(dy dy1, int i1, int j1, int k1, java.util.Random random)
    {
    }

    public void a(dy dy1, int i1, int j1, int k1, int l1)
    {
    }

    public void b(dy dy1, int i1, int j1, int k1, int l1)
    {
    }

    public int c()
    {
        return 10;
    }

    public void e(dy dy1, int i1, int j1, int k1)
    {
    }

    public void b(dy dy1, int i1, int j1, int k1)
    {
    }

    public int a(java.util.Random random)
    {
        return 1;
    }

    public int a(int i1, java.util.Random random)
    {
        return bc;
    }

    public float a(fc fc1)
    {
        if(bd < 0.0F)
            return 0.0F;
        if(!fc1.b(this))
            return 1.0F / bd / 100F;
        else
            return fc1.a(this) / bd / 30F;
    }

    public void a_(dy dy1, int i1, int j1, int k1, int l1)
    {
        a(dy1, i1, j1, k1, l1, 1.0F);
    }

    public void a(dy dy1, int i1, int j1, int k1, int l1, float f1)
    {
        if(dy1.x)
            return;
        int i2 = a(dy1.m);
        for(int j2 = 0; j2 < i2; j2++)
        {
            if(dy1.m.nextFloat() > f1)
                continue;
            int k2 = a(l1, dy1.m);
            if(k2 > 0)
            {
                float f2 = 0.7F;
                double d1 = (double)(dy1.m.nextFloat() * f2) + (double)(1.0F - f2) * 0.5D;
                double d2 = (double)(dy1.m.nextFloat() * f2) + (double)(1.0F - f2) * 0.5D;
                double d3 = (double)(dy1.m.nextFloat() * f2) + (double)(1.0F - f2) * 0.5D;
                fn fn1 = new fn(dy1, (double)i1 + d1, (double)j1 + d2, (double)k1 + d3, new gp(k2));
                fn1.ad = 10;
                dy1.a(((dj) (fn1)));
            }
        }

    }

    public float a(dj dj)
    {
        return be / 5F;
    }

    public fr a(dy dy1, int i1, int j1, int k1, aw aw1, aw aw2)
    {
        a(((hq) (dy1)), i1, j1, k1);
        aw1 = aw1.c(-i1, -j1, -k1);
        aw2 = aw2.c(-i1, -j1, -k1);
        aw aw3 = aw1.a(aw2, bf);
        aw aw4 = aw1.a(aw2, bi);
        aw aw5 = aw1.b(aw2, bg);
        aw aw6 = aw1.b(aw2, bj);
        aw aw7 = aw1.c(aw2, bh);
        aw aw8 = aw1.c(aw2, bk);
        if(!a(aw3))
            aw3 = null;
        if(!a(aw4))
            aw4 = null;
        if(!b(aw5))
            aw5 = null;
        if(!b(aw6))
            aw6 = null;
        if(!c(aw7))
            aw7 = null;
        if(!c(aw8))
            aw8 = null;
        aw aw9 = null;
        if(aw3 != null && (aw9 == null || aw1.a(aw3) < aw1.a(aw9)))
            aw9 = aw3;
        if(aw4 != null && (aw9 == null || aw1.a(aw4) < aw1.a(aw9)))
            aw9 = aw4;
        if(aw5 != null && (aw9 == null || aw1.a(aw5) < aw1.a(aw9)))
            aw9 = aw5;
        if(aw6 != null && (aw9 == null || aw1.a(aw6) < aw1.a(aw9)))
            aw9 = aw6;
        if(aw7 != null && (aw9 == null || aw1.a(aw7) < aw1.a(aw9)))
            aw9 = aw7;
        if(aw8 != null && (aw9 == null || aw1.a(aw8) < aw1.a(aw9)))
            aw9 = aw8;
        if(aw9 == null)
            return null;
        byte byte0 = -1;
        if(aw9 == aw3)
            byte0 = 4;
        if(aw9 == aw4)
            byte0 = 5;
        if(aw9 == aw5)
            byte0 = 0;
        if(aw9 == aw6)
            byte0 = 1;
        if(aw9 == aw7)
            byte0 = 2;
        if(aw9 == aw8)
            byte0 = 3;
        return new fr(i1, j1, k1, ((int) (byte0)), aw9.c(i1, j1, k1));
    }

    private boolean a(aw aw1)
    {
        if(aw1 == null)
            return false;
        else
            return aw1.b >= bg && aw1.b <= bj && aw1.c >= bh && aw1.c <= bk;
    }

    private boolean b(aw aw1)
    {
        if(aw1 == null)
            return false;
        else
            return aw1.a >= bf && aw1.a <= bi && aw1.c >= bh && aw1.c <= bk;
    }

    private boolean c(aw aw1)
    {
        if(aw1 == null)
            return false;
        else
            return aw1.a >= bf && aw1.a <= bi && aw1.b >= bg && aw1.b <= bj;
    }

    public void c(dy dy1, int i1, int j1, int k1)
    {
    }

    public boolean a(dy dy1, int i1, int j1, int k1)
    {
        int l1 = dy1.a(i1, j1, k1);
        return l1 == 0 || n[l1].bn.d();
    }

    public boolean a(dy dy1, int i1, int j1, int k1, fc fc1)
    {
        return false;
    }

    public void b(dy dy1, int i1, int j1, int k1, dj dj)
    {
    }

    public void c(dy dy1, int i1, int j1, int k1, int l1)
    {
    }

    public void b(dy dy1, int i1, int j1, int k1, fc fc1)
    {
    }

    public void a(dy dy1, int i1, int j1, int k1, dj dj, aw aw1)
    {
    }

    public void a(hq hq1, int i1, int j1, int k1)
    {
    }

    public boolean b(hq hq1, int i1, int j1, int k1, int l1)
    {
        return false;
    }

    public boolean d()
    {
        return false;
    }

    public void a(dy dy1, int i1, int j1, int k1, dj dj)
    {
    }

    public boolean d(dy dy1, int i1, int j1, int k1, int l1)
    {
        return false;
    }

    public boolean f(dy dy1, int i1, int j1, int k1)
    {
        return true;
    }

    static 
    {
        e = new bq("stone", 1.0F, 1.0F);
        f = new bq("wood", 1.0F, 1.0F);
        g = new bq("gravel", 1.0F, 1.0F);
        h = new bq("grass", 1.0F, 1.0F);
        i = new bq("stone", 1.0F, 1.0F);
        j = new bq("stone", 1.0F, 1.5F);
        k = ((bq) (new ad("stone", 1.0F, 1.0F)));
        l = new bq("cloth", 1.0F, 1.0F);
        m = ((bq) (new ac("sand", 1.0F, 1.0F)));
        n = new ff[256];
        u = (new de(1, 1)).c(1.5F).b(10F).a(i);
        v = (gz)(new gz(2)).c(0.6F).a(h);
        w = (new ao(3, 2)).c(0.5F).a(g);
        x = (new ff(4, 16, iq.d)).c(2.0F).b(10F).a(i);
        y = (new ff(5, 4, iq.c)).c(2.0F).b(5F).a(f);
        z = (new fj(6, 15)).c(0.0F).a(h);
        A = (new ff(7, 17, iq.d)).c(-1F).b(6000000F).a(i);
        B = (new am(8, iq.f)).c(100F).c(3);
        C = (new x(9, iq.f)).c(100F).c(3);
        D = (new am(10, iq.g)).c(0.0F).a(1.0F).c(255);
        E = (new x(11, iq.g)).c(100F).a(1.0F).c(255);
        F = (new ey(12, 18)).c(0.5F).a(m);
        G = (new j(13, 19)).c(0.6F).a(g);
        H = (new g(14, 32)).c(3F).b(5F).a(i);
        I = (new g(15, 33)).c(3F).b(5F).a(i);
        J = (new g(16, 34)).c(3F).b(5F).a(i);
        K = (new fu(17)).c(2.0F).a(f);
        L = (br)(new br(18, 52)).c(0.2F).c(1).a(h);
        M = (new hk(19)).c(0.6F).a(h);
        N = (new ed(20, 49, iq.o, false)).c(0.3F).a(k);
        ac = (new ff(35, 64, iq.k)).c(0.8F).a(l);
        ae = (gn)(new gn(37, 13)).c(0.0F).a(h);
        af = (gn)(new gn(38, 12)).c(0.0F).a(h);
        ag = (gn)(new ei(39, 29)).c(0.0F).a(h).a(0.125F);
        ah = (gn)(new ei(40, 28)).c(0.0F).a(h);
        ai = (new i(41, 39)).c(3F).b(10F).a(j);
        aj = (new i(42, 38)).c(5F).b(10F).a(j);
        ak = (new ip(43, true)).c(2.0F).b(10F).a(i);
        al = (new ip(44, false)).c(2.0F).b(10F).a(i);
        am = (new ff(45, 7, iq.d)).c(2.0F).b(10F).a(i);
        an = (new y(46, 8)).c(0.0F).a(h);
        ao = (new fi(47, 35)).c(1.5F).a(f);
        ap = (new ff(48, 36, iq.d)).c(2.0F).b(10F).a(i);
        aq = (new dx(49, 37)).c(10F).b(2000F).a(i);
        ar = (new gc(50, 80)).c(0.0F).a(0.9375F).a(f);
        as = (il)(il)(new il(51, 31)).c(0.0F).a(1.0F).a(f);
        at = (new ca(52, 65)).c(5F).a(j);
        au = ((ff) (new dofix(53, y)));
        av = (new b(54)).c(2.5F).a(f);
        aw = (new dh(55, 84)).c(0.0F).a(e);
        ax = (new g(56, 50)).c(3F).b(5F).a(i);
        ay = (new i(57, 40)).c(5F).b(10F).a(j);
        az = (new ec(58)).c(2.5F).a(f);
        aA = (new m(59, 88)).c(0.0F).a(h);
        aB = (new fz(60)).c(0.6F).a(g);
        aC = (new dv(61, false)).c(3.5F).a(i);
        aD = (new dv(62, true)).c(3.5F).a(i).a(0.875F);
        aE = (new fa(63, ig.class, true)).c(1.0F).a(f);
        aF = (new ie(64, iq.c)).c(3F).a(f);
        aG = (new cm(65, 83)).c(0.4F).a(f);
        aH = (new av(66, 128)).c(0.7F).a(j);
        aI = ((ff) (new dofix(67, x)));
        aJ = (new fa(68, ig.class, false)).c(1.0F).a(f);
        aK = (new hs(69, 96)).c(0.5F).a(f);
        aL = (new ax(70, u.bb, cr.b)).c(0.5F).a(i);
        aM = (new ie(71, iq.e)).c(5F).a(j);
        aN = (new ax(72, y.bb, cr.a)).c(0.5F).a(f);
        aO = (new au(73, 51, false)).c(3F).b(5F).a(i);
        aP = (new au(74, 51, true)).a(0.625F).c(3F).b(5F).a(i);
        aQ = (new by(75, 115, false)).c(0.0F).a(f);
        aR = (new by(76, 99, true)).c(0.0F).a(0.5F).a(f);
        aS = (new ak(77, u.bb)).c(0.5F).a(i);
        aT = (new ha(78, 66)).c(0.1F).a(l);
        aU = (new n(79, 67)).c(0.5F).c(3).a(k);
        aV = (new u(80, 66)).c(0.2F).a(l);
        aW = (new an(81, 70)).c(0.4F).a(l);
        aX = (new cv(82, 72)).c(0.6F).a(g);
        aY = (new cg(83, 73)).c(0.0F).a(h);
        aZ = (new eh(84, 74)).c(2.0F).b(10F).a(i);
        ba = (new he(85, 4)).c(2.0F).b(5F).a(f);
        for(int i1 = 0; i1 < 256; i1++)
            if(n[i1] != null)
                ez.c[i1] = ((ez) (new bi(i1 - 256)));

    }
}
