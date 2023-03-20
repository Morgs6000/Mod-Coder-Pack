// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

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
import java.awt.*;
import java.io.*;
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
import org.lwjgl.input.*;
import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.GLU;

// Referenced classes of package net.minecraft.client:
//            MinecraftApplet

public abstract class Minecraft
    implements Runnable
{

    public Minecraft(Component component, Canvas canvas, MinecraftApplet minecraftapplet, int i, int j, boolean flag)
    {
        field_184_a = false;
        field_146_M = new ir(20F);
        field_176_i = null;
        field_173_l = true;
        field_172_m = false;
        field_169_p = null;
        field_168_q = new gr(this);
        field_167_r = new iq(this);
        field_144_O = 0;
        field_143_P = 0;
        field_166_s = null;
        field_165_t = 0;
        field_163_v = false;
        field_162_w = new cr(0.0F);
        field_161_x = null;
        field_158_A = new of();
        field_138_U = new ml();
        field_137_V = new at();
        field_153_F = true;
        field_152_G = "";
        field_151_H = -1L;
        field_150_I = false;
        field_135_X = 0;
        field_149_J = false;
        field_148_K = System.currentTimeMillis();
        field_134_Y = 0;
        field_142_Q = i;
        field_141_R = j;
        field_184_a = flag;
        field_159_z = minecraftapplet;
        new fl(this, "Timer hack thread");
        field_174_k = canvas;
        field_182_c = i;
        field_181_d = j;
        field_184_a = flag;
    }

    public abstract void func_110_a(go go1);

    public void func_121_a(String s, int i)
    {
        field_140_S = s;
        field_139_T = i;
    }

    public void func_136_a() throws LWJGLException
    {
        if(field_174_k != null)
        {
            Graphics g = field_174_k.getGraphics();
            if(g != null)
            {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, field_182_c, field_181_d);
                g.dispose();
            }
            Display.setParent(field_174_k);
        } else
        if(field_184_a)
        {
            Display.setFullscreen(true);
            field_182_c = Display.getDisplayMode().getWidth();
            field_181_d = Display.getDisplayMode().getHeight();
            if(field_182_c <= 0)
            {
                field_182_c = 1;
            }
            if(field_181_d <= 0)
            {
                field_181_d = 1;
            }
        } else
        {
            Display.setDisplayMode(new org.lwjgl.opengl.DisplayMode(field_182_c, field_181_d));
        }
        Display.setTitle("Minecraft Minecraft Alpha v1.1.2_01");
        try
        {
            Display.create();
        }
        catch(LWJGLException lwjglexception)
        {
            lwjglexception.printStackTrace();
            try
            {
                Thread.sleep(1000L);
            }
            catch(InterruptedException interruptedexception) { }
            Display.create();
        }
        kx.field_1233_a.field_1228_f = new jh(this);
        field_156_C = func_106_b();
        field_160_y = new fr(this, field_156_C);
        field_171_n = new ey(field_160_y);
        field_170_o = new kd(field_160_y, "/default.png", field_171_n);
        func_104_p();
        Keyboard.create();
        Mouse.create();
        field_157_B = new mp(field_174_k);
        try
        {
            Controllers.create();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        func_116_c("Pre startup");
        GL11.glEnable(3553);
        GL11.glShadeModel(7425);
        GL11.glClearDepth(1.0D);
        GL11.glEnable(2929);
        GL11.glDepthFunc(515);
        GL11.glEnable(3008);
        GL11.glAlphaFunc(516, 0.1F);
        GL11.glCullFace(1029);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode(5888);
        func_116_c("Startup");
        field_147_L = new be();
        field_158_A.func_340_a(field_160_y);
        field_171_n.func_1066_a(field_137_V);
        field_171_n.func_1066_a(field_138_U);
        field_171_n.func_1066_a(new aa(this));
        field_171_n.func_1066_a(new ht());
        field_171_n.func_1066_a(new eg());
        field_171_n.func_1066_a(new jz(0));
        field_171_n.func_1066_a(new jz(1));
        field_179_f = new e(this, field_171_n);
        GL11.glViewport(0, 0, field_182_c, field_181_d);
        field_177_h = new bq(field_180_e, field_171_n);
        try
        {
            field_145_N = new bf(field_156_C, this);
            field_145_N.start();
        }
        catch(Exception exception1) { }
        func_116_c("Post startup");
        field_164_u = new lu(this);
        if(field_140_S != null)
        {
            func_128_a(new mn(this, field_140_S, field_139_T));
        } else
        {
            func_128_a(new cx());
        }
    }

    private void func_104_p() throws LWJGLException
    {
        iy iy1 = new iy(field_182_c, field_181_d);
        int i = iy1.func_903_a();
        int j = iy1.func_902_b();
        GL11.glClear(16640);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, i, j, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
        GL11.glViewport(0, 0, field_182_c, field_181_d);
        GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        ho ho1 = ho.field_1512_a;
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glDisable(2912);
        GL11.glBindTexture(3553, field_171_n.func_1070_a("/title/mojang.png"));
        ho1.func_977_b();
        ho1.func_990_b(0xffffff);
        ho1.func_983_a(0.0D, field_181_d, 0.0D, 0.0D, 0.0D);
        ho1.func_983_a(field_182_c, field_181_d, 0.0D, 0.0D, 0.0D);
        ho1.func_983_a(field_182_c, 0.0D, 0.0D, 0.0D, 0.0D);
        ho1.func_983_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
        ho1.func_982_a();
        char c = '\u0100';
        char c1 = '\u0100';
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        ho1.func_990_b(0xffffff);
        func_139_a((field_182_c / 2 - c) / 2, (field_181_d / 2 - c1) / 2, 0, 0, c, c1);
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        GL11.glEnable(3008);
        GL11.glAlphaFunc(516, 0.1F);
        Display.swapBuffers();
    }

    public void func_139_a(int i, int j, int k, int l, int i1, int j1)
    {
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        ho ho1 = ho.field_1512_a;
        ho1.func_977_b();
        ho1.func_983_a(i + 0, j + j1, 0.0D, (float)(k + 0) * f, (float)(l + j1) * f1);
        ho1.func_983_a(i + i1, j + j1, 0.0D, (float)(k + i1) * f, (float)(l + j1) * f1);
        ho1.func_983_a(i + i1, j + 0, 0.0D, (float)(k + i1) * f, (float)(l + 0) * f1);
        ho1.func_983_a(i + 0, j + 0, 0.0D, (float)(k + 0) * f, (float)(l + 0) * f1);
        ho1.func_982_a();
    }

    public static File func_106_b()
    {
        if(dataFolder == null)
        {
            dataFolder = func_127_a("minecraft");
        }
        return dataFolder;
    }

    public static File func_127_a(String s)
    {
        String s1 = System.getProperty("user.home", ".");
        File file;
        switch(fq.field_1585_a[func_112_q().ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
            file = new File(s1, (new StringBuilder()).append('.').append(s).append('/').toString());
            break;

        case 3: // '\003'
            String s2 = System.getenv("APPDATA");
            if(s2 != null)
            {
                file = new File(s2, (new StringBuilder()).append(".").append(s).append('/').toString());
            } else
            {
                file = new File(s1, (new StringBuilder()).append('.').append(s).append('/').toString());
            }
            break;

        case 4: // '\004'
            file = new File(s1, (new StringBuilder()).append("Library/Application Support/").append(s).toString());
            break;

        default:
            file = new File(s1, (new StringBuilder()).append(s).append('/').toString());
            break;
        }
        if(!file.exists() && !file.mkdirs())
        {
            throw new RuntimeException((new StringBuilder()).append("The working directory could not be created: ").append(file).toString());
        } else
        {
            return file;
        }
    }

    private static ih func_112_q()
    {
        String s = System.getProperty("os.name").toLowerCase();
        if(s.contains("win"))
        {
            return ih.windows;
        }
        if(s.contains("mac"))
        {
            return ih.macos;
        }
        if(s.contains("solaris"))
        {
            return ih.solaris;
        }
        if(s.contains("sunos"))
        {
            return ih.solaris;
        }
        if(s.contains("linux"))
        {
            return ih.linux;
        }
        if(s.contains("unix"))
        {
            return ih.linux;
        } else
        {
            return ih.unknown;
        }
    }

    public void func_128_a(bh bh1)
    {
        if(field_169_p instanceof as)
        {
            return;
        }
        if(field_169_p != null)
        {
            field_169_p.func_576_h();
        }
        if(bh1 == null && field_180_e == null)
        {
            bh1 = new cx();
        } else
        if(bh1 == null && field_178_g.field_717_E <= 0)
        {
            bh1 = new au();
        }
        field_169_p = bh1;
        if(bh1 != null)
        {
            func_138_f();
            iy iy1 = new iy(field_182_c, field_181_d);
            int i = iy1.func_903_a();
            int j = iy1.func_902_b();
            bh1.func_563_a(this, i, j);
            field_163_v = false;
        } else
        {
            func_123_e();
        }
    }

    private void func_116_c(String s)
    {
        int i = GL11.glGetError();
        if(i != 0)
        {
            String s1 = GLU.gluErrorString(i);
            System.out.println("########## GL ERROR ##########");
            System.out.println((new StringBuilder()).append("@ ").append(s).toString());
            System.out.println((new StringBuilder()).append(i).append(": ").append(s1).toString());
            System.exit(0);
        }
    }

    public void func_130_c()
    {
        if(field_159_z != null)
        {
            field_159_z.func_101_c();
        }
        try
        {
            if(field_145_N != null)
            {
                field_145_N.func_1208_b();
            }
        }
        catch(Exception exception) { }
        try
        {
            System.out.println("Stopping!");
            func_134_a(null);
            try
            {
                df.func_1126_a();
            }
            catch(Exception exception1) { }
            field_158_A.func_330_b();
            Mouse.destroy();
            Keyboard.destroy();
        }
        finally
        {
            Display.destroy();
        }
        System.gc();
    }

    public void run()
    {
        field_153_F = true;
        try
        {
            func_136_a();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            func_110_a(new go("Failed to start game", exception));
            return;
        }
        try
        {
            long l = System.currentTimeMillis();
            int i = 0;
            while(field_153_F && (field_159_z == null || field_159_z.isActive())) 
            {
                cf.func_1173_a();
                aj.func_1259_a();
                if(field_174_k == null && Display.isCloseRequested())
                {
                    func_109_d();
                }
                if(field_172_m && field_180_e != null)
                {
                    float f = field_146_M.field_1378_c;
                    field_146_M.func_904_a();
                    field_146_M.field_1378_c = f;
                } else
                {
                    field_146_M.func_904_a();
                }
                for(int j = 0; j < field_146_M.field_1379_b; j++)
                {
                    field_144_O++;
                    try
                    {
                        func_111_i();
                        continue;
                    }
                    catch(lx lx1)
                    {
                        field_180_e = null;
                    }
                    func_134_a(null);
                    func_128_a(new iv());
                }

                func_116_c("Pre render");
                field_158_A.func_338_a(field_178_g, field_146_M.field_1378_c);
                GL11.glEnable(3553);
                if(field_180_e != null)
                {
                    while(field_180_e.func_638_e()) ;
                }
                if(!field_163_v)
                {
                    if(field_183_b != null)
                    {
                        field_183_b.func_723_a(field_146_M.field_1378_c);
                    }
                    field_167_r.func_909_b(field_146_M.field_1378_c);
                }
                if(!Display.isActive())
                {
                    if(field_184_a)
                    {
                        func_133_h();
                    }
                    Thread.sleep(10L);
                }
                if(Keyboard.isKeyDown(64))
                {
                    func_135_r();
                } else
                {
                    field_151_H = System.nanoTime();
                }
                Thread.yield();
                Display.update();
                if(field_174_k != null && !field_184_a && (field_174_k.getWidth() != field_182_c || field_174_k.getHeight() != field_181_d))
                {
                    field_182_c = field_174_k.getWidth();
                    field_181_d = field_174_k.getHeight();
                    if(field_182_c <= 0)
                    {
                        field_182_c = 1;
                    }
                    if(field_181_d <= 0)
                    {
                        field_181_d = 1;
                    }
                    func_115_a(field_182_c, field_181_d);
                }
                if(field_160_y.field_1577_h)
                {
                    Thread.sleep(5L);
                }
                func_116_c("Post render");
                i++;
                field_172_m = !func_124_j() && field_169_p != null && field_169_p.func_577_b();
                while(System.currentTimeMillis() >= l + 1000L) 
                {
                    field_152_G = (new StringBuilder()).append(i).append(" fps, ").append(bn.field_1762_b).append(" chunk updates").toString();
                    bn.field_1762_b = 0;
                    l += 1000L;
                    i = 0;
                }
            }
        }
        catch(nr nr1) { }
        catch(Throwable throwable)
        {
            field_180_e = null;
            throwable.printStackTrace();
            func_110_a(new go("Unexpected error", throwable));
        }
        finally { }
    }

    private void func_135_r()
    {
        if(field_151_H == -1L)
        {
            field_151_H = System.nanoTime();
        }
        long l = System.nanoTime();
        field_155_D[field_154_E++ & field_155_D.length - 1] = l - field_151_H;
        field_151_H = l;
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, field_182_c, field_181_d, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
        GL11.glLineWidth(1.0F);
        GL11.glDisable(3553);
        ho ho1 = ho.field_1512_a;
        ho1.func_992_a(7);
        ho1.func_990_b(0x20200000);
        ho1.func_991_a(0.0D, field_181_d - 100, 0.0D);
        ho1.func_991_a(0.0D, field_181_d, 0.0D);
        ho1.func_991_a(field_155_D.length, field_181_d, 0.0D);
        ho1.func_991_a(field_155_D.length, field_181_d - 100, 0.0D);
        ho1.func_982_a();
        long l1 = 0L;
        for(int i = 0; i < field_155_D.length; i++)
        {
            l1 += field_155_D[i];
        }

        int j = (int)(l1 / 0x30d40L / (long)field_155_D.length);
        ho1.func_992_a(7);
        ho1.func_990_b(0x20400000);
        ho1.func_991_a(0.0D, field_181_d - j, 0.0D);
        ho1.func_991_a(0.0D, field_181_d, 0.0D);
        ho1.func_991_a(field_155_D.length, field_181_d, 0.0D);
        ho1.func_991_a(field_155_D.length, field_181_d - j, 0.0D);
        ho1.func_982_a();
        ho1.func_992_a(1);
        for(int k = 0; k < field_155_D.length; k++)
        {
            int i1 = ((k - field_154_E & field_155_D.length - 1) * 255) / field_155_D.length;
            int j1 = (i1 * i1) / 255;
            j1 = (j1 * j1) / 255;
            int k1 = (j1 * j1) / 255;
            k1 = (k1 * k1) / 255;
            ho1.func_990_b(0xff000000 + k1 + j1 * 256 + i1 * 0x10000);
            long l2 = field_155_D[k] / 0x30d40L;
            ho1.func_991_a((float)k + 0.5F, (float)((long)field_181_d - l2) + 0.5F, 0.0D);
            ho1.func_991_a((float)k + 0.5F, (float)field_181_d + 0.5F, 0.0D);
        }

        ho1.func_982_a();
        GL11.glEnable(3553);
    }

    public void func_109_d()
    {
        field_153_F = false;
    }

    public void func_123_e()
    {
        if(!Display.isActive())
        {
            return;
        }
        if(field_150_I)
        {
            return;
        } else
        {
            field_150_I = true;
            field_157_B.func_774_a();
            func_128_a(null);
            field_135_X = field_144_O + 10000;
            return;
        }
    }

    public void func_138_f()
    {
        if(!field_150_I)
        {
            return;
        }
        if(field_178_g != null)
        {
            field_178_g.func_458_k();
        }
        field_150_I = false;
        field_157_B.func_773_b();
    }

    public void func_117_g()
    {
        if(field_169_p != null)
        {
            return;
        } else
        {
            func_128_a(new ie());
            return;
        }
    }

    private void func_119_a(int i, boolean flag)
    {
        if(field_183_b.field_1064_b)
        {
            return;
        }
        if(i == 0 && field_143_P > 0)
        {
            return;
        }
        if(flag && field_161_x != null && field_161_x.field_1167_a == 0 && i == 0)
        {
            int j = field_161_x.field_1166_b;
            int k = field_161_x.field_1172_c;
            int l = field_161_x.field_1171_d;
            field_183_b.func_726_c(j, k, l, field_161_x.field_1170_e);
            field_177_h.func_1191_a(j, k, l, field_161_x.field_1170_e);
        } else
        {
            field_183_b.func_724_a();
        }
    }

    private void func_108_a(int i)
    {
        if(i == 0 && field_143_P > 0)
        {
            return;
        }
        if(i == 0)
        {
            field_178_g.func_457_w();
        }
        if(field_161_x == null)
        {
            if(i == 0 && !(field_183_b instanceof il))
            {
                field_143_P = 10;
            }
        } else
        if(field_161_x.field_1167_a == 1)
        {
            if(i == 0)
            {
                field_178_g.func_463_a(field_161_x.field_1168_g);
            }
            if(i == 1)
            {
                field_178_g.func_456_a_(field_161_x.field_1168_g);
            }
        } else
        if(field_161_x.field_1167_a == 0)
        {
            int j = field_161_x.field_1166_b;
            int k = field_161_x.field_1172_c;
            int i1 = field_161_x.field_1171_d;
            int j1 = field_161_x.field_1170_e;
            ly ly1 = ly.field_345_n[field_180_e.func_600_a(j, k, i1)];
            if(i == 0)
            {
                field_180_e.func_612_i(j, k, i1, field_161_x.field_1170_e);
                if(ly1 != ly.field_403_A || field_178_g.field_777_c >= 100)
                {
                    field_183_b.func_719_a(j, k, i1, field_161_x.field_1170_e);
                }
            } else
            {
                ev ev3 = field_178_g.field_778_b.func_494_a();
                int k1 = ev3 == null ? 0 : ev3.field_1615_a;
                if(field_183_b.func_722_a(field_178_g, field_180_e, ev3, j, k, i1, j1))
                {
                    field_178_g.func_457_w();
                }
                if(ev3 == null)
                {
                    return;
                }
                if(ev3.field_1615_a == 0)
                {
                    field_178_g.field_778_b.field_843_a[field_178_g.field_778_b.field_847_d] = null;
                } else
                if(ev3.field_1615_a != k1)
                {
                    field_167_r.field_1395_a.func_891_b();
                }
            }
        }
        if(i == 1)
        {
            ev ev1 = field_178_g.field_778_b.func_494_a();
            if(ev1 != null)
            {
                int l = ev1.field_1615_a;
                ev ev2 = ev1.func_1093_a(field_180_e, field_178_g);
                if(ev2 != ev1 || ev2 != null && ev2.field_1615_a != l)
                {
                    field_178_g.field_778_b.field_843_a[field_178_g.field_778_b.field_847_d] = ev2;
                    field_167_r.field_1395_a.func_896_c();
                    if(ev2.field_1615_a == 0)
                    {
                        field_178_g.field_778_b.field_843_a[field_178_g.field_778_b.field_847_d] = null;
                    }
                }
            }
        }
    }

    public void func_133_h()
    {
        try
        {
            field_184_a = !field_184_a;
            System.out.println("Toggle fullscreen!");
            if(field_184_a)
            {
                Display.setDisplayMode(Display.getDesktopDisplayMode());
                field_182_c = Display.getDisplayMode().getWidth();
                field_181_d = Display.getDisplayMode().getHeight();
                if(field_182_c <= 0)
                {
                    field_182_c = 1;
                }
                if(field_181_d <= 0)
                {
                    field_181_d = 1;
                }
            } else
            {
                if(field_174_k != null)
                {
                    field_182_c = field_174_k.getWidth();
                    field_181_d = field_174_k.getHeight();
                } else
                {
                    field_182_c = field_142_Q;
                    field_181_d = field_141_R;
                }
                if(field_182_c <= 0)
                {
                    field_182_c = 1;
                }
                if(field_181_d <= 0)
                {
                    field_181_d = 1;
                }
                Display.setDisplayMode(new org.lwjgl.opengl.DisplayMode(field_142_Q, field_141_R));
            }
            func_138_f();
            Display.setFullscreen(field_184_a);
            Display.update();
            Thread.sleep(1000L);
            if(field_184_a)
            {
                func_123_e();
            }
            if(field_169_p != null)
            {
                func_138_f();
                func_115_a(field_182_c, field_181_d);
            }
            System.out.println((new StringBuilder()).append("Size: ").append(field_182_c).append(", ").append(field_181_d).toString());
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_115_a(int i, int j)
    {
        if(i <= 0)
        {
            i = 1;
        }
        if(j <= 0)
        {
            j = 1;
        }
        field_182_c = i;
        field_181_d = j;
        if(field_169_p != null)
        {
            iy iy1 = new iy(i, j);
            int k = iy1.func_903_a();
            int l = iy1.func_902_b();
            field_169_p.func_563_a(this, k, l);
        }
    }

    private void func_114_s()
    {
        if(field_161_x != null)
        {
            int i = field_180_e.func_600_a(field_161_x.field_1166_b, field_161_x.field_1172_c, field_161_x.field_1171_d);
            if(i == ly.field_337_v.field_376_bc)
            {
                i = ly.field_336_w.field_376_bc;
            }
            if(i == ly.field_411_ak.field_376_bc)
            {
                i = ly.field_410_al.field_376_bc;
            }
            if(i == ly.field_403_A.field_376_bc)
            {
                i = ly.field_338_u.field_376_bc;
            }
            field_178_g.field_778_b.func_496_a(i, field_183_b instanceof il);
        }
    }

    public void func_111_i()
    {
        field_164_u.func_555_a();
        field_167_r.func_910_a(1.0F);
        if(field_178_g != null)
        {
            field_178_g.func_462_n();
        }
        if(!field_172_m && field_180_e != null)
        {
            field_183_b.func_728_c();
        }
        GL11.glBindTexture(3553, field_171_n.func_1070_a("/terrain.png"));
        if(!field_172_m)
        {
            field_171_n.func_1067_a();
        }
        if(field_169_p == null && field_178_g != null && field_178_g.field_717_E <= 0)
        {
            func_128_a(null);
        }
        if(field_169_p != null)
        {
            field_135_X = field_144_O + 10000;
        }
        if(field_169_p != null)
        {
            field_169_p.func_564_d();
            if(field_169_p != null)
            {
                field_169_p.func_570_g();
            }
        }
        if(field_169_p == null || field_169_p.field_948_f)
        {
            do
            {
                if(!Mouse.next())
                {
                    break;
                }
                long l = System.currentTimeMillis() - field_148_K;
                if(l <= 200L)
                {
                    int j = Mouse.getEventDWheel();
                    if(j != 0)
                    {
                        field_178_g.field_778_b.func_498_a(j);
                    }
                    if(field_169_p == null)
                    {
                        if(!field_150_I && Mouse.getEventButtonState())
                        {
                            func_123_e();
                        } else
                        {
                            if(Mouse.getEventButton() == 0 && Mouse.getEventButtonState())
                            {
                                func_108_a(0);
                                field_135_X = field_144_O;
                            }
                            if(Mouse.getEventButton() == 1 && Mouse.getEventButtonState())
                            {
                                func_108_a(1);
                                field_135_X = field_144_O;
                            }
                            if(Mouse.getEventButton() == 2 && Mouse.getEventButtonState())
                            {
                                func_114_s();
                            }
                        }
                    } else
                    if(field_169_p != null)
                    {
                        field_169_p.func_566_e();
                    }
                }
            } while(true);
            if(field_143_P > 0)
            {
                field_143_P--;
            }
            do
            {
                if(!Keyboard.next())
                {
                    break;
                }
                field_178_g.func_460_a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.getEventKey() == 87)
                    {
                        func_133_h();
                    } else
                    {
                        if(field_169_p != null)
                        {
                            field_169_p.func_569_f();
                        } else
                        {
                            if(Keyboard.getEventKey() == 1)
                            {
                                func_117_g();
                            }
                            if(Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61))
                            {
                                func_129_t();
                            }
                            if(Keyboard.getEventKey() == 63)
                            {
                                field_160_y.field_1560_x = !field_160_y.field_1560_x;
                            }
                            if(Keyboard.getEventKey() == field_160_y.field_1570_o.field_1370_b)
                            {
                                func_128_a(new lo(field_178_g.field_778_b, field_178_g.field_778_b.field_848_c));
                            }
                            if(Keyboard.getEventKey() == field_160_y.field_1569_p.field_1370_b)
                            {
                                field_178_g.func_444_a(field_178_g.field_778_b.func_473_a(field_178_g.field_778_b.field_847_d, 1), false);
                            }
                            if(func_124_j() && Keyboard.getEventKey() == field_160_y.field_1567_q.field_1370_b)
                            {
                                func_128_a(new de());
                            }
                        }
                        for(int i = 0; i < 9; i++)
                        {
                            if(Keyboard.getEventKey() == 2 + i)
                            {
                                field_178_g.field_778_b.field_847_d = i;
                            }
                        }

                        if(Keyboard.getEventKey() == field_160_y.field_1566_r.field_1370_b)
                        {
                            field_160_y.func_1045_b(4, !Keyboard.isKeyDown(42) && !Keyboard.isKeyDown(54) ? 1 : -1);
                        }
                    }
                }
            } while(true);
            if(field_169_p == null)
            {
                if(Mouse.isButtonDown(0) && (float)(field_144_O - field_135_X) >= field_146_M.field_1380_a / 4F && field_150_I)
                {
                    func_108_a(0);
                    field_135_X = field_144_O;
                }
                if(Mouse.isButtonDown(1) && (float)(field_144_O - field_135_X) >= field_146_M.field_1380_a / 4F && field_150_I)
                {
                    func_108_a(1);
                    field_135_X = field_144_O;
                }
            }
            func_119_a(0, field_169_p == null && Mouse.isButtonDown(0) && field_150_I);
        }
        if(field_180_e != null)
        {
            if(field_178_g != null)
            {
                field_134_Y++;
                if(field_134_Y == 30)
                {
                    field_134_Y = 0;
                    field_180_e.func_705_f(field_178_g);
                }
            }
            field_180_e.field_1039_l = field_160_y.field_1561_w;
            if(!field_172_m)
            {
                field_167_r.func_911_a();
            }
            if(!field_172_m)
            {
                field_179_f.func_945_d();
            }
            if(!field_172_m)
            {
                field_180_e.func_633_c();
            }
            if(!field_172_m || func_124_j())
            {
                field_180_e.func_649_g();
            }
            if(!field_172_m && field_180_e != null)
            {
                field_180_e.func_677_m(eo.b(field_178_g.field_611_ak), eo.b(field_178_g.field_610_al), eo.b(field_178_g.field_609_am));
            }
            if(!field_172_m)
            {
                field_177_h.func_1193_a();
            }
        }
        field_148_K = System.currentTimeMillis();
    }

    private void func_129_t()
    {
        System.out.println("FORCING RELOAD!");
        field_158_A = new of();
        field_158_A.func_340_a(field_160_y);
        field_145_N.func_1210_a();
    }

    public boolean func_124_j()
    {
        return field_180_e != null && field_180_e.field_1026_y;
    }

    public void func_113_b(String s)
    {
        func_134_a(null);
        System.gc();
        cn cn1 = new cn(new File(func_106_b(), "saves"), s);
        if(cn1.field_1033_r)
        {
            func_105_a(cn1, "Generating level");
        } else
        {
            func_105_a(cn1, "Loading level");
        }
    }

    public void func_134_a(cn cn1)
    {
        func_105_a(cn1, "");
    }

    public void func_105_a(cn cn1, String s)
    {
        field_158_A.func_331_a(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        if(field_180_e != null)
        {
            field_180_e.func_651_a(field_168_q);
        }
        field_180_e = cn1;
        if(cn1 != null)
        {
            field_183_b.func_717_a(cn1);
            cn1.field_1038_m = field_170_o;
            if(!func_124_j())
            {
                field_178_g = (bi)cn1.func_661_a(bi.class);
            } else
            if(field_178_g != null)
            {
                field_178_g.func_374_q();
                if(cn1 != null)
                {
                    cn1.func_674_a(field_178_g);
                }
            }
            if(!cn1.field_1026_y)
            {
                func_120_d(s);
            }
            if(field_178_g == null)
            {
                field_178_g = (bi)field_183_b.func_721_b(cn1);
                field_178_g.func_374_q();
                field_183_b.func_720_a(field_178_g);
            }
            field_178_g.field_787_a = new gd(field_160_y);
            if(field_179_f != null)
            {
                field_179_f.func_946_a(cn1);
            }
            if(field_177_h != null)
            {
                field_177_h.func_1188_a(cn1);
            }
            field_183_b.func_718_b(field_178_g);
            cn1.func_608_a(field_178_g);
            if(cn1.field_1033_r)
            {
                cn1.func_651_a(field_168_q);
            }
        } else
        {
            field_178_g = null;
        }
        System.gc();
        field_148_K = 0L;
    }

    private void func_120_d(String s)
    {
        field_168_q.func_596_a(s);
        field_168_q.func_595_d("Building terrain");
        char c = '\200';
        int i = 0;
        int j = (c * 2) / 16 + 1;
        j *= j;
        for(int k = -c; k <= c; k += 16)
        {
            int l = field_180_e.field_1036_o;
            int i1 = field_180_e.field_1034_q;
            if(field_178_g != null)
            {
                l = (int)field_178_g.field_611_ak;
                i1 = (int)field_178_g.field_609_am;
            }
            for(int j1 = -c; j1 <= c; j1 += 16)
            {
                field_168_q.func_593_a((i++ * 100) / j);
                field_180_e.func_600_a(l + k, 64, i1 + j1);
                while(field_180_e.func_638_e()) ;
            }

        }

        field_168_q.func_595_d("Simulating world for a bit");
        j = 2000;
        field_180_e.func_656_j();
    }

    public void func_131_a(String s, File file)
    {
        int i = s.indexOf("/");
        String s1 = s.substring(0, i);
        s = s.substring(i + 1);
        if(s1.equalsIgnoreCase("sound"))
        {
            field_158_A.func_332_a(s, file);
        } else
        if(s1.equalsIgnoreCase("newsound"))
        {
            field_158_A.func_332_a(s, file);
        } else
        if(s1.equalsIgnoreCase("streaming"))
        {
            field_158_A.func_333_b(s, file);
        } else
        if(s1.equalsIgnoreCase("music"))
        {
            field_158_A.func_334_c(s, file);
        } else
        if(s1.equalsIgnoreCase("newmusic"))
        {
            field_158_A.func_334_c(s, file);
        }
    }

    public be func_137_k()
    {
        return field_147_L;
    }

    public String func_122_l()
    {
        return field_179_f.func_953_b();
    }

    public String func_107_m()
    {
        return field_179_f.func_957_c();
    }

    public String func_125_n()
    {
        return (new StringBuilder()).append("P: ").append(field_177_h.func_1190_b()).append(". T: ").append(field_180_e.func_687_d()).toString();
    }

    public void func_126_o()
    {
        field_180_e.func_622_a();
        if(field_178_g != null)
        {
            field_180_e.func_607_d(field_178_g);
        }
        field_178_g = (bi)field_183_b.func_721_b(field_180_e);
        field_178_g.func_374_q();
        field_183_b.func_720_a(field_178_g);
        field_180_e.func_608_a(field_178_g);
        field_178_g.field_787_a = new gd(field_160_y);
        field_183_b.func_718_b(field_178_g);
        func_120_d("Respawning");
    }

    public static void func_132_a(String s, String s1)
    {
        func_118_a(s, s1, null);
    }

    public static void func_118_a(String s, String s1, String s2)
    {
        boolean flag = false;
        String s3 = s;
        Frame frame = new Frame("Minecraft");
        Canvas canvas = new Canvas();
        frame.setLayout(new BorderLayout());
        frame.add(canvas, "Center");
        canvas.setPreferredSize(new Dimension(854, 480));
        frame.pack();
        frame.setLocationRelativeTo(null);
        fm fm1 = new fm(frame, canvas, null, 854, 480, flag, frame);
        Thread thread = new Thread(fm1, "Minecraft main thread");
        thread.setPriority(10);
        fm1.field_173_l = false;
        fm1.field_175_j = "www.minecraft.net";
        if(s3 != null && s1 != null)
        {
            fm1.field_176_i = new dl(s3, s1);
        } else
        {
            fm1.field_176_i = new dl((new StringBuilder()).append("Player").append(System.currentTimeMillis() % 1000L).toString(), "");
        }
        if(s2 != null)
        {
            String as1[] = s2.split(":");
            fm1.func_121_a(as1[0], Integer.parseInt(as1[1]));
        }
        frame.setVisible(true);
        frame.addWindowListener(new fp(fm1, thread));
        thread.start();
    }

    public static void main(String args[])
    {
        String s = (new StringBuilder()).append("Player").append(System.currentTimeMillis() % 1000L).toString();
        if(args.length > 0)
        {
            s = args[0];
        }
        String s1 = "-";
        if(args.length > 1)
        {
            s1 = args[1];
        }
        func_132_a(s, s1);
    }

    public hq field_183_b;
    private boolean field_184_a;
    public int field_182_c;
    public int field_181_d;
    private be field_147_L;
    private ir field_146_M;
    public cn field_180_e;
    public e field_179_f;
    public bi field_178_g;
    public bq field_177_h;
    public dl field_176_i;
    public String field_175_j;
    public Canvas field_174_k;
    public boolean field_173_l;
    public volatile boolean field_172_m;
    public ey field_171_n;
    public kd field_170_o;
    public bh field_169_p;
    public gr field_168_q;
    public iq field_167_r;
    private bf field_145_N;
    private int field_144_O;
    private int field_143_P;
    private int field_142_Q;
    private int field_141_R;
    public String field_166_s;
    public int field_165_t;
    public lu field_164_u;
    public boolean field_163_v;
    public cr field_162_w;
    public mf field_161_x;
    public fr field_160_y;
    protected MinecraftApplet field_159_z;
    public of field_158_A;
    public mp field_157_B;
    public File field_156_C;
    public static long field_155_D[] = new long[512];
    public static int field_154_E = 0;
    private String field_140_S;
    private int field_139_T;
    private ml field_138_U;
    private at field_137_V;
    private static File dataFolder = null;
    public volatile boolean field_153_F;
    public String field_152_G;
    long field_151_H;
    public boolean field_150_I;
    private int field_135_X;
    public boolean field_149_J;
    long field_148_K;
    private int field_134_Y;

}
