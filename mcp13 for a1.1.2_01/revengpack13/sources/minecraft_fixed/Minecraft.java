// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

//package net.minecraft.client;

//import aa;
//import aj;
//import as;
//import at;
//import au;
//import be;
//import bf;
//import bh;
//import bi;
//import bn;
//import bq;
//import cf;
//import cn;
//import cr;
//import cx;
//import de;
//import df;
//import dl;
//import e;
//import eg;
//import eo;
//import eu;
//import ev;
//import ey;
//import fl;
//import fm;
//import fp;
//import fq;
//import fr;
//import gd;
//import go;
//import gr;
//import ho;
//import hq;
//import ht;
//import ie;
//import ih;
//import il;
//import iq;
//import ir;
//import it;
//import iv;
//import iy;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
//import jh;
//import jz;
//import kd;
//import kx;
//import lo;
//import lu;
//import lx;
//import ly;
//import mf;
//import ml;
//import mn;
//import mp;
//import my;
//import nr;
//import of;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

// Referenced classes of package net.minecraft.client:
//            MinecraftApplet

public abstract class Minecraft
    implements java.lang.Runnable
{

    public hq b;
    private boolean a;
    public int c;
    public int d;
    private be L;
    private ir M;
    public cn e;
    public e f;
    public bi g;
    public bq h;
    public dl i;
    public java.lang.String j;
    public java.awt.Canvas k;
    public boolean l;
    public volatile boolean m;
    public ey n;
    public kd o;
    public bh p;
    public gr q;
    public iq r;
    private bf N;
    private int O;
    private int P;
    private int Q;
    private int R;
    public java.lang.String s;
    public int t;
    public lu u;
    public boolean v;
    public cr w;
    public mf x;
    public fr y;
    protected MinecraftApplet z;
    public of A;
    public mp B;
    public java.io.File C;
    public static long D[] = new long[512];
    public static int E = 0;
    private java.lang.String S;
    private int T;
    private ml U;
    private at V;
    private static java.io.File W = null;
    public volatile boolean F;
    public java.lang.String G;
    long H;
    public boolean I;
    private int X;
    public boolean J;
    long K;
    private int Y;

    public Minecraft(java.awt.Component component, java.awt.Canvas canvas, MinecraftApplet minecraftapplet, int i1, int j1, boolean flag)
    {
        a = false;
        M = new ir(20F);
        i = null;
        l = true;
        m = false;
        p = null;
        q = new gr(this);
        r = new iq(this);
        O = 0;
        P = 0;
        s = null;
        t = 0;
        v = false;
        w = new cr(0.0F);
        x = null;
        A = new of();
        U = new ml();
        V = new at();
        F = true;
        G = "";
        H = -1L;
        I = false;
        X = 0;
        J = false;
        K = java.lang.System.currentTimeMillis();
        Y = 0;
        Q = i1;
        R = j1;
        a = flag;
        z = minecraftapplet;
        new fl(this, "Timer hack thread");
        k = canvas;
        c = i1;
        d = j1;
        a = flag;
    }

    public abstract void a(go go1);

    public void a(java.lang.String s1, int i1)
    {
        S = s1;
        T = i1;
    }

    public void a() throws LWJGLException
    {
        if(k != null)
        {
            java.awt.Graphics g1 = k.getGraphics();
            if(g1 != null)
            {
                g1.setColor(java.awt.Color.BLACK);
                g1.fillRect(0, 0, c, d);
                g1.dispose();
            }
            org.lwjgl.opengl.Display.setParent(k);
        } else
        if(a)
        {
            org.lwjgl.opengl.Display.setFullscreen(true);
            c = org.lwjgl.opengl.Display.getDisplayMode().getWidth();
            d = org.lwjgl.opengl.Display.getDisplayMode().getHeight();
            if(c <= 0)
                c = 1;
            if(d <= 0)
                d = 1;
        } else
        {
            org.lwjgl.opengl.Display.setDisplayMode(new DisplayMode(c, d));
        }
        org.lwjgl.opengl.Display.setTitle("Minecraft Minecraft Alpha v1.1.2_01");
        try
        {
            org.lwjgl.opengl.Display.create();
        }
        catch(org.lwjgl.LWJGLException lwjglexception)
        {
            lwjglexception.printStackTrace();
            try
            {
                java.lang.Thread.sleep(1000L);
            }
            catch(java.lang.InterruptedException interruptedexception) { }
            org.lwjgl.opengl.Display.create();
        }
        kx.a.f = new jh(this);
        C = Minecraft.b();
        y = new fr(this, C);
        n = new ey(y);
        o = new kd(y, "/default.png", n);
        p();
        org.lwjgl.input.Keyboard.create();
        org.lwjgl.input.Mouse.create();
        B = new mp(((java.awt.Component) (k)));
        try
        {
            org.lwjgl.input.Controllers.create();
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        c("Pre startup");
        org.lwjgl.opengl.GL11.glEnable(3553);
        org.lwjgl.opengl.GL11.glShadeModel(7425);
        org.lwjgl.opengl.GL11.glClearDepth(1.0D);
        org.lwjgl.opengl.GL11.glEnable(2929);
        org.lwjgl.opengl.GL11.glDepthFunc(515);
        org.lwjgl.opengl.GL11.glEnable(3008);
        org.lwjgl.opengl.GL11.glAlphaFunc(516, 0.1F);
        org.lwjgl.opengl.GL11.glCullFace(1029);
        org.lwjgl.opengl.GL11.glMatrixMode(5889);
        org.lwjgl.opengl.GL11.glLoadIdentity();
        org.lwjgl.opengl.GL11.glMatrixMode(5888);
        c("Startup");
        L = new be();
        A.a(y);
        n.a(((z) (V)));
        n.a(((z) (U)));
        n.a(((z) (new aa(this))));
        n.a(((z) (new ht())));
        n.a(((z) (new eg())));
        n.a(((z) (new jz(0))));
        n.a(((z) (new jz(1))));
        f = new e(this, n);
        org.lwjgl.opengl.GL11.glViewport(0, 0, c, d);
        h = new bq(e, n);
        try
        {
            N = new bf(C, this);
            N.start();
        }
        catch(java.lang.Exception exception1) { }
        c("Post startup");
        u = new lu(this);
        if(S != null)
            a(((bh) (new mn(this, S, T))));
        else
            a(((bh) (new cx())));
    }

    private void p() throws LWJGLException
    {
        iy iy1 = new iy(c, d);
        int i1 = iy1.a();
        int j1 = iy1.b();
        org.lwjgl.opengl.GL11.glClear(16640);
        org.lwjgl.opengl.GL11.glMatrixMode(5889);
        org.lwjgl.opengl.GL11.glLoadIdentity();
        org.lwjgl.opengl.GL11.glOrtho(0.0D, i1, j1, 0.0D, 1000D, 3000D);
        org.lwjgl.opengl.GL11.glMatrixMode(5888);
        org.lwjgl.opengl.GL11.glLoadIdentity();
        org.lwjgl.opengl.GL11.glTranslatef(0.0F, 0.0F, -2000F);
        org.lwjgl.opengl.GL11.glViewport(0, 0, c, d);
        org.lwjgl.opengl.GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        ho ho1 = ho.a;
        org.lwjgl.opengl.GL11.glDisable(2896);
        org.lwjgl.opengl.GL11.glEnable(3553);
        org.lwjgl.opengl.GL11.glDisable(2912);
        org.lwjgl.opengl.GL11.glBindTexture(3553, n.a("/title/mojang.png"));
        ho1.b();
        ho1.b(0xffffff);
        ho1.a(0.0D, d, 0.0D, 0.0D, 0.0D);
        ho1.a(c, d, 0.0D, 0.0D, 0.0D);
        ho1.a(c, 0.0D, 0.0D, 0.0D, 0.0D);
        ho1.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
        ho1.a();
        char c1 = '\u0100';
        char c2 = '\u0100';
        org.lwjgl.opengl.GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        ho1.b(0xffffff);
        a((c / 2 - c1) / 2, (d / 2 - c2) / 2, 0, 0, ((int) (c1)), ((int) (c2)));
        org.lwjgl.opengl.GL11.glDisable(2896);
        org.lwjgl.opengl.GL11.glDisable(2912);
        org.lwjgl.opengl.GL11.glEnable(3008);
        org.lwjgl.opengl.GL11.glAlphaFunc(516, 0.1F);
        org.lwjgl.opengl.Display.swapBuffers();
    }

    public void a(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        float f1 = 0.00390625F;
        float f2 = 0.00390625F;
        ho ho1 = ho.a;
        ho1.b();
        ho1.a(i1 + 0, j1 + j2, 0.0D, (float)(k1 + 0) * f1, (float)(l1 + j2) * f2);
        ho1.a(i1 + i2, j1 + j2, 0.0D, (float)(k1 + i2) * f1, (float)(l1 + j2) * f2);
        ho1.a(i1 + i2, j1 + 0, 0.0D, (float)(k1 + i2) * f1, (float)(l1 + 0) * f2);
        ho1.a(i1 + 0, j1 + 0, 0.0D, (float)(k1 + 0) * f1, (float)(l1 + 0) * f2);
        ho1.a();
    }

    public static java.io.File b()
    {
        if(W == null)
            W = Minecraft.a("minecraft");
        return W;
    }

    public static java.io.File a(java.lang.String s1)
    {
        java.lang.String s2 = java.lang.System.getProperty("user.home", ".");
        java.io.File file;
        switch(fq.a[Minecraft.q().ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
            file = new File(s2, (new StringBuilder()).append('.').append(s1).append('/').toString());
            break;

        case 3: // '\003'
            java.lang.String s3 = java.lang.System.getenv("APPDATA");
            if(s3 != null)
                file = new File(s3, (new StringBuilder()).append(".").append(s1).append('/').toString());
            else
                file = new File(s2, (new StringBuilder()).append('.').append(s1).append('/').toString());
            break;

        case 4: // '\004'
            file = new File(s2, (new StringBuilder()).append("Library/Application Support/").append(s1).toString());
            break;

        default:
            file = new File(s2, (new StringBuilder()).append(s1).append('/').toString());
            break;
        }
        if(!file.exists() && !file.mkdirs())
            throw new RuntimeException((new StringBuilder()).append("The working directory could not be created: ").append(((java.lang.Object) (file))).toString());
        else
            return file;
    }

    private static ih q()
    {
        java.lang.String s1 = java.lang.System.getProperty("os.name").toLowerCase();
        if(s1.contains("win"))
            return ih.c;
        if(s1.contains("mac"))
            return ih.d;
        if(s1.contains("solaris"))
            return ih.b;
        if(s1.contains("sunos"))
            return ih.b;
        if(s1.contains("linux"))
            return ih.a;
        if(s1.contains("unix"))
            return ih.a;
        else
            return ih.e;
    }

    public void a(bh bh1)
    {
        if(p instanceof as)
            return;
        if(p != null)
            p.h();
        if(bh1 == null && e == null)
            bh1 = ((bh) (new cx()));
        else
        if(bh1 == null && g.E <= 0)
            bh1 = ((bh) (new au()));
        p = bh1;
        if(bh1 != null)
        {
            f();
            iy iy1 = new iy(c, d);
            int i1 = iy1.a();
            int j1 = iy1.b();
            bh1.a(this, i1, j1);
            v = false;
        } else
        {
            e();
        }
    }

    private void c(java.lang.String s1)
    {
        int i1 = org.lwjgl.opengl.GL11.glGetError();
        if(i1 != 0)
        {
            java.lang.String s2 = org.lwjgl.util.glu.GLU.gluErrorString(i1);
            java.lang.System.out.println("########## GL ERROR ##########");
            java.lang.System.out.println((new StringBuilder()).append("@ ").append(s1).toString());
            java.lang.System.out.println((new StringBuilder()).append(i1).append(": ").append(s2).toString());
            java.lang.System.exit(0);
        }
    }

    public void c()
    {
        if(z != null)
            z.c();
        try
        {
            if(N != null)
                N.b();
        }
        catch(java.lang.Exception exception) { }
        try
        {
        java.lang.System.out.println("Stopping!");
        a(((cn) (null)));
        try
        {
            df.a();
        }
        catch(java.lang.Exception exception1) { }
        A.b();
        org.lwjgl.input.Mouse.destroy();
        org.lwjgl.input.Keyboard.destroy();
        }
        finally
        {
        org.lwjgl.opengl.Display.destroy();
        }
        java.lang.System.gc();
    }

    public void run()
    {
        F = true;
        try
        {
            a();
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
            a(new go("Failed to start game", ((java.lang.Throwable) (exception))));
            return;
        }
        try
        {
            long l1 = java.lang.System.currentTimeMillis();
            int i1 = 0;
            while(F && (z == null || z.isActive())) 
            {
                cf.a();
                aj.a();
                if(k == null && org.lwjgl.opengl.Display.isCloseRequested())
                    d();
                if(m && e != null)
                {
                    float f1 = M.c;
                    M.a();
                    M.c = f1;
                } else
                {
                    M.a();
                }
                for(int j1 = 0; j1 < M.b; j1++)
                {
                    O++;
                    try
                    {
                        i();
                        continue;
                    }
                    catch(lx lx1)
                    {
                        e = null;
                    }
                    a(((cn) (null)));
                    a(((bh) (new iv())));
                }

                c("Pre render");
                A.a(((ge) (g)), M.c);
                org.lwjgl.opengl.GL11.glEnable(3553);
                if(e != null)
                    while(e.e()) ;
                if(!v)
                {
                    if(b != null)
                        b.a(M.c);
                    r.b(M.c);
                }
                if(!org.lwjgl.opengl.Display.isActive())
                {
                    if(a)
                        h();
                    java.lang.Thread.sleep(10L);
                }
                if(org.lwjgl.input.Keyboard.isKeyDown(64))
                    r();
                else
                    H = java.lang.System.nanoTime();
                java.lang.Thread.yield();
                org.lwjgl.opengl.Display.update();
                if(k != null && !a && (k.getWidth() != c || k.getHeight() != d))
                {
                    c = k.getWidth();
                    d = k.getHeight();
                    if(c <= 0)
                        c = 1;
                    if(d <= 0)
                        d = 1;
                    a(c, d);
                }
                if(y.h)
                    java.lang.Thread.sleep(5L);
                c("Post render");
                i1++;
                m = !j() && p != null && p.b();
                while(java.lang.System.currentTimeMillis() >= l1 + 1000L) 
                {
                    G = (new StringBuilder()).append(i1).append(" fps, ").append(bn.b).append(" chunk updates").toString();
                    bn.b = 0;
                    l1 += 1000L;
                    i1 = 0;
                }
            }
        }
        catch(nr nr1) { }
        catch(java.lang.Throwable throwable)
        {
            e = null;
            throwable.printStackTrace();
            a(new go("Unexpected error", throwable));
        }
        finally
        {
        }
    }

    private void r()
    {
        if(H == -1L)
            H = java.lang.System.nanoTime();
        long l1 = java.lang.System.nanoTime();
        D[E++ & D.length - 1] = l1 - H;
        H = l1;
        org.lwjgl.opengl.GL11.glClear(256);
        org.lwjgl.opengl.GL11.glMatrixMode(5889);
        org.lwjgl.opengl.GL11.glLoadIdentity();
        org.lwjgl.opengl.GL11.glOrtho(0.0D, c, d, 0.0D, 1000D, 3000D);
        org.lwjgl.opengl.GL11.glMatrixMode(5888);
        org.lwjgl.opengl.GL11.glLoadIdentity();
        org.lwjgl.opengl.GL11.glTranslatef(0.0F, 0.0F, -2000F);
        org.lwjgl.opengl.GL11.glLineWidth(1.0F);
        org.lwjgl.opengl.GL11.glDisable(3553);
        ho ho1 = ho.a;
        ho1.a(7);
        ho1.b(0x20200000);
        ho1.a(0.0D, d - 100, 0.0D);
        ho1.a(0.0D, d, 0.0D);
        ho1.a(D.length, d, 0.0D);
        ho1.a(D.length, d - 100, 0.0D);
        ho1.a();
        long l2 = 0L;
        for(int i1 = 0; i1 < D.length; i1++)
            l2 += D[i1];

        int j1 = (int)(l2 / 0x30d40L / (long)D.length);
        ho1.a(7);
        ho1.b(0x20400000);
        ho1.a(0.0D, d - j1, 0.0D);
        ho1.a(0.0D, d, 0.0D);
        ho1.a(D.length, d, 0.0D);
        ho1.a(D.length, d - j1, 0.0D);
        ho1.a();
        ho1.a(1);
        for(int k1 = 0; k1 < D.length; k1++)
        {
            int i2 = ((k1 - E & D.length - 1) * 255) / D.length;
            int j2 = (i2 * i2) / 255;
            j2 = (j2 * j2) / 255;
            int k2 = (j2 * j2) / 255;
            k2 = (k2 * k2) / 255;
            ho1.b(0xff000000 + k2 + j2 * 256 + i2 * 0x10000);
            long l3 = D[k1] / 0x30d40L;
            ho1.a((float)k1 + 0.5F, (float)((long)d - l3) + 0.5F, 0.0D);
            ho1.a((float)k1 + 0.5F, (float)d + 0.5F, 0.0D);
        }

        ho1.a();
        org.lwjgl.opengl.GL11.glEnable(3553);
    }

    public void d()
    {
        F = false;
    }

    public void e()
    {
        if(!org.lwjgl.opengl.Display.isActive())
            return;
        if(I)
        {
            return;
        } else
        {
            I = true;
            B.a();
            a(((bh) (null)));
            X = O + 10000;
            return;
        }
    }

    public void f()
    {
        if(!I)
            return;
        if(g != null)
            g.k();
        I = false;
        B.b();
    }

    public void g()
    {
        if(p != null)
        {
            return;
        } else
        {
            a(((bh) (new ie())));
            return;
        }
    }

    private void a(int i1, boolean flag)
    {
        if(b.b)
            return;
        if(i1 == 0 && P > 0)
            return;
        if(flag && x != null && x.a == 0 && i1 == 0)
        {
            int j1 = x.b;
            int k1 = x.c;
            int l1 = x.d;
            b.c(j1, k1, l1, x.e);
            h.a(j1, k1, l1, x.e);
        } else
        {
            b.a();
        }
    }

    private void a(int i1)
    {
        if(i1 == 0 && P > 0)
            return;
        if(i1 == 0)
            g.w();
        if(x == null)
        {
            if(i1 == 0 && !(b instanceof il))
                P = 10;
        } else
        if(x.a == 1)
        {
            if(i1 == 0)
                g.a(x.g);
            if(i1 == 1)
                g.a_(x.g);
        } else
        if(x.a == 0)
        {
            int j1 = x.b;
            int k1 = x.c;
            int i2 = x.d;
            int j2 = x.e;
            ly ly1 = ly.n[e.a(j1, k1, i2)];
            if(i1 == 0)
            {
                e.i(j1, k1, i2, x.e);
                if(ly1 != ly.A || g.c >= 100)
                    b.a(j1, k1, i2, x.e);
            } else
            {
                ev ev3 = g.b.a();
                int k2 = ev3 == null ? 0 : ev3.a;
                if(b.a(((dm) (g)), e, ev3, j1, k1, i2, j2))
                    g.w();
                if(ev3 == null)
                    return;
                if(ev3.a == 0)
                    g.b.a[g.b.d] = null;
                else
                if(ev3.a != k2)
                    r.a.b();
            }
        }
        if(i1 == 1)
        {
            ev ev1 = g.b.a();
            if(ev1 != null)
            {
                int l1 = ev1.a;
                ev ev2 = ev1.a(e, ((dm) (g)));
                if(ev2 != ev1 || ev2 != null && ev2.a != l1)
                {
                    g.b.a[g.b.d] = ev2;
                    r.a.c();
                    if(ev2.a == 0)
                        g.b.a[g.b.d] = null;
                }
            }
        }
    }

    public void h()
    {
        try
        {
            a = !a;
            java.lang.System.out.println("Toggle fullscreen!");
            if(a)
            {
                org.lwjgl.opengl.Display.setDisplayMode(org.lwjgl.opengl.Display.getDesktopDisplayMode());
                c = org.lwjgl.opengl.Display.getDisplayMode().getWidth();
                d = org.lwjgl.opengl.Display.getDisplayMode().getHeight();
                if(c <= 0)
                    c = 1;
                if(d <= 0)
                    d = 1;
            } else
            {
                if(k != null)
                {
                    c = k.getWidth();
                    d = k.getHeight();
                } else
                {
                    c = Q;
                    d = R;
                }
                if(c <= 0)
                    c = 1;
                if(d <= 0)
                    d = 1;
                org.lwjgl.opengl.Display.setDisplayMode(new DisplayMode(Q, R));
            }
            f();
            org.lwjgl.opengl.Display.setFullscreen(a);
            org.lwjgl.opengl.Display.update();
            java.lang.Thread.sleep(1000L);
            if(a)
                e();
            if(p != null)
            {
                f();
                a(c, d);
            }
            java.lang.System.out.println((new StringBuilder()).append("Size: ").append(c).append(", ").append(d).toString());
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void a(int i1, int j1)
    {
        if(i1 <= 0)
            i1 = 1;
        if(j1 <= 0)
            j1 = 1;
        c = i1;
        d = j1;
        if(p != null)
        {
            iy iy1 = new iy(i1, j1);
            int k1 = iy1.a();
            int l1 = iy1.b();
            p.a(this, k1, l1);
        }
    }

    private void s()
    {
        if(x != null)
        {
            int i1 = e.a(x.b, x.c, x.d);
            if(i1 == ly.v.bc)
                i1 = ly.w.bc;
            if(i1 == ly.ak.bc)
                i1 = ly.al.bc;
            if(i1 == ly.A.bc)
                i1 = ly.u.bc;
            g.b.a(i1, b instanceof il);
        }
    }

    public void i()
    {
        u.a();
        r.a(1.0F);
        if(g != null)
            g.n();
        if(!m && e != null)
            b.c();
        org.lwjgl.opengl.GL11.glBindTexture(3553, n.a("/terrain.png"));
        if(!m)
            n.a();
        if(p == null && g != null && g.E <= 0)
            a(((bh) (null)));
        if(p != null)
            X = O + 10000;
        if(p != null)
        {
            p.d();
            if(p != null)
                p.g();
        }
        if(p == null || p.f)
        {
            do
            {
                if(!org.lwjgl.input.Mouse.next())
                    break;
                long l1 = java.lang.System.currentTimeMillis() - K;
                if(l1 <= 200L)
                {
                    int j1 = org.lwjgl.input.Mouse.getEventDWheel();
                    if(j1 != 0)
                        g.b.a(j1);
                    if(p == null)
                    {
                        if(!I && org.lwjgl.input.Mouse.getEventButtonState())
                        {
                            e();
                        } else
                        {
                            if(org.lwjgl.input.Mouse.getEventButton() == 0 && org.lwjgl.input.Mouse.getEventButtonState())
                            {
                                a(0);
                                X = O;
                            }
                            if(org.lwjgl.input.Mouse.getEventButton() == 1 && org.lwjgl.input.Mouse.getEventButtonState())
                            {
                                a(1);
                                X = O;
                            }
                            if(org.lwjgl.input.Mouse.getEventButton() == 2 && org.lwjgl.input.Mouse.getEventButtonState())
                                s();
                        }
                    } else
                    if(p != null)
                        p.e();
                }
            } while(true);
            if(P > 0)
                P--;
            do
            {
                if(!org.lwjgl.input.Keyboard.next())
                    break;
                g.a(org.lwjgl.input.Keyboard.getEventKey(), org.lwjgl.input.Keyboard.getEventKeyState());
                if(org.lwjgl.input.Keyboard.getEventKeyState())
                    if(org.lwjgl.input.Keyboard.getEventKey() == 87)
                    {
                        h();
                    } else
                    {
                        if(p != null)
                        {
                            p.f();
                        } else
                        {
                            if(org.lwjgl.input.Keyboard.getEventKey() == 1)
                                g();
                            if(org.lwjgl.input.Keyboard.getEventKey() == 31 && org.lwjgl.input.Keyboard.isKeyDown(61))
                                t();
                            if(org.lwjgl.input.Keyboard.getEventKey() == 63)
                                y.x = !y.x;
                            if(org.lwjgl.input.Keyboard.getEventKey() == y.o.b)
                                a(((bh) (new lo(((gh) (g.b)), g.b.c))));
                            if(org.lwjgl.input.Keyboard.getEventKey() == y.p.b)
                                g.a(g.b.a(g.b.d, 1), false);
                            if(j() && org.lwjgl.input.Keyboard.getEventKey() == y.q.b)
                                a(((bh) (new de())));
                        }
                        for(int i1 = 0; i1 < 9; i1++)
                            if(org.lwjgl.input.Keyboard.getEventKey() == 2 + i1)
                                g.b.d = i1;

                        if(org.lwjgl.input.Keyboard.getEventKey() == y.r.b)
                            y.b(4, !org.lwjgl.input.Keyboard.isKeyDown(42) && !org.lwjgl.input.Keyboard.isKeyDown(54) ? 1 : -1);
                    }
            } while(true);
            if(p == null)
            {
                if(org.lwjgl.input.Mouse.isButtonDown(0) && (float)(O - X) >= M.a / 4F && I)
                {
                    a(0);
                    X = O;
                }
                if(org.lwjgl.input.Mouse.isButtonDown(1) && (float)(O - X) >= M.a / 4F && I)
                {
                    a(1);
                    X = O;
                }
            }
            a(0, p == null && org.lwjgl.input.Mouse.isButtonDown(0) && I);
        }
        if(e != null)
        {
            if(g != null)
            {
                Y++;
                if(Y == 30)
                {
                    Y = 0;
                    e.f(((kh) (g)));
                }
            }
            e.l = y.w;
            if(!m)
                r.a();
            if(!m)
                f.d();
            if(!m)
                e.c();
            if(!m || j())
                e.g();
            if(!m && e != null)
                e.m(eo.b(g.ak), eo.b(g.al), eo.b(g.am));
            if(!m)
                h.a();
        }
        K = java.lang.System.currentTimeMillis();
    }

    private void t()
    {
        java.lang.System.out.println("FORCING RELOAD!");
        A = new of();
        A.a(y);
        N.a();
    }

    public boolean j()
    {
        return e != null && e.y;
    }

    public void b(java.lang.String s1)
    {
        a(((cn) (null)));
        java.lang.System.gc();
        cn cn1 = new cn(new File(Minecraft.b(), "saves"), s1);
        if(cn1.r)
            a(cn1, "Generating level");
        else
            a(cn1, "Loading level");
    }

    public void a(cn cn1)
    {
        a(cn1, "");
    }

    public void a(cn cn1, java.lang.String s1)
    {
        A.a(((java.lang.String) (null)), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        if(e != null)
            e.a(((nu) (q)));
        e = cn1;
        if(cn1 != null)
        {
            b.a(cn1);
            cn1.m = ((java.lang.Object) (o));
            if(!j())
                g = (bi)cn1.a(bi.class);
            else
            if(g != null)
            {
                g.q();
                if(cn1 != null)
                    cn1.a(((kh) (g)));
            }
            if(!cn1.y)
                d(s1);
            if(g == null)
            {
                g = (bi)b.b(cn1);
                g.q();
                b.a(((dm) (g)));
            }
            g.a = ((lv) (new gd(y)));
            if(f != null)
                f.a(cn1);
            if(h != null)
                h.a(cn1);
            b.b(((dm) (g)));
            cn1.a(((dm) (g)));
            if(cn1.r)
                cn1.a(((nu) (q)));
        } else
        {
            g = null;
        }
        java.lang.System.gc();
        K = 0L;
    }

    private void d(java.lang.String s1)
    {
        q.a(s1);
        q.d("Building terrain");
        char c1 = '\200';
        int i1 = 0;
        int j1 = (c1 * 2) / 16 + 1;
        j1 *= j1;
        for(int k1 = -c1; k1 <= c1; k1 += 16)
        {
            int l1 = e.o;
            int i2 = e.q;
            if(g != null)
            {
                l1 = (int)g.ak;
                i2 = (int)g.am;
            }
            for(int j2 = -c1; j2 <= c1; j2 += 16)
            {
                q.a((i1++ * 100) / j1);
                e.a(l1 + k1, 64, i2 + j2);
                while(e.e()) ;
            }

        }

        q.d("Simulating world for a bit");
        j1 = 2000;
        e.j();
    }

    public void a(java.lang.String s1, java.io.File file)
    {
        int i1 = s1.indexOf("/");
        java.lang.String s2 = s1.substring(0, i1);
        s1 = s1.substring(i1 + 1);
        if(s2.equalsIgnoreCase("sound"))
            A.a(s1, file);
        else
        if(s2.equalsIgnoreCase("newsound"))
            A.a(s1, file);
        else
        if(s2.equalsIgnoreCase("streaming"))
            A.b(s1, file);
        else
        if(s2.equalsIgnoreCase("music"))
            A.c(s1, file);
        else
        if(s2.equalsIgnoreCase("newmusic"))
            A.c(s1, file);
    }

    public be k()
    {
        return L;
    }

    public java.lang.String l()
    {
        return f.b();
    }

    public java.lang.String m()
    {
        return f.c();
    }

    public java.lang.String n()
    {
        return (new StringBuilder()).append("P: ").append(h.b()).append(". T: ").append(e.d()).toString();
    }

    public void o()
    {
        e.a();
        if(g != null)
            e.d(((kh) (g)));
        g = (bi)b.b(e);
        g.q();
        b.a(((dm) (g)));
        e.a(((dm) (g)));
        g.a = ((lv) (new gd(y)));
        b.b(((dm) (g)));
        d("Respawning");
    }

    public static void a(java.lang.String s1, java.lang.String s2)
    {
        Minecraft.a(s1, s2, ((java.lang.String) (null)));
    }

    public static void a(java.lang.String s1, java.lang.String s2, java.lang.String s3)
    {
        boolean flag = false;
        java.lang.String s4 = s1;
        java.awt.Frame frame = new Frame("Minecraft");
        java.awt.Canvas canvas = new Canvas();
        frame.setLayout(((java.awt.LayoutManager) (new BorderLayout())));
        frame.add(((java.awt.Component) (canvas)), "Center");
        canvas.setPreferredSize(new Dimension(854, 480));
        frame.pack();
        frame.setLocationRelativeTo(((java.awt.Component) (null)));
        fm fm1 = new fm(((java.awt.Component) (frame)), canvas, ((MinecraftApplet) (null)), 854, 480, flag, frame);
        java.lang.Thread thread = new Thread(((java.lang.Runnable) (fm1)), "Minecraft main thread");
        thread.setPriority(10);
        fm1.l = false;
        fm1.j = "www.minecraft.net";
        if(s4 != null && s2 != null)
            fm1.i = new dl(s4, s2);
        else
            fm1.i = new dl((new StringBuilder()).append("Player").append(java.lang.System.currentTimeMillis() % 1000L).toString(), "");
        if(s3 != null)
        {
            java.lang.String as1[] = s3.split(":");
            ((Minecraft) (fm1)).a(as1[0], java.lang.Integer.parseInt(as1[1]));
        }
        frame.setVisible(true);
        frame.addWindowListener(((java.awt.event.WindowListener) (new fp(((Minecraft) (fm1)), thread))));
        thread.start();
    }

    public static void main(java.lang.String args[])
    {
        java.lang.String s1 = (new StringBuilder()).append("Player").append(java.lang.System.currentTimeMillis() % 1000L).toString();
        if(args.length > 0)
            s1 = args[0];
        java.lang.String s2 = "-";
        if(args.length > 1)
            s2 = args[1];
        Minecraft.a(s1, s2);
    }

}
