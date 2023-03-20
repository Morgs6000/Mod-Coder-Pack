// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
//import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class lu extends lm
{

    public lu(Minecraft minecraft)
    {
        field_929_e = new ArrayList();
        field_928_f = new Random();
        field_933_a = null;
        field_926_h = 0;
        field_925_i = "";
        field_924_j = 0;
        field_931_c = 1.0F;
        field_927_g = minecraft;
    }

    public void func_557_a(float f, boolean flag, int j, int k)
    {
        iy iy1 = new iy(field_927_g.field_182_c, field_927_g.field_181_d);
        int l = iy1.func_903_a();
        int i1 = iy1.func_902_b();
        kd kd1 = field_927_g.field_170_o;
        field_927_g.field_167_r.func_905_b();
        GL11.glEnable(3042);
        if(field_927_g.field_160_y.field_1576_i)
        {
            func_556_a(field_927_g.field_178_g.func_382_a(f), l, i1);
        }
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBindTexture(3553, field_927_g.field_171_n.func_1070_a("/gui/gui.png"));
        eu eu1 = field_927_g.field_178_g.field_778_b;
        field_923_k = -90F;
        func_550_b(l / 2 - 91, i1 - 22, 0, 0, 182, 22);
        func_550_b((l / 2 - 91 - 1) + eu1.field_847_d * 20, i1 - 22 - 1, 0, 22, 24, 22);
        GL11.glBindTexture(3553, field_927_g.field_171_n.func_1070_a("/gui/icons.png"));
        GL11.glEnable(3042);
        GL11.glBlendFunc(775, 769);
        func_550_b(l / 2 - 7, i1 / 2 - 7, 0, 0, 16, 16);
        GL11.glDisable(3042);
        boolean flag1 = (field_927_g.field_178_g.field_624_aW / 3) % 2 == 1;
        if(field_927_g.field_178_g.field_624_aW < 10)
        {
            flag1 = false;
        }
        int j1 = field_927_g.field_178_g.field_717_E;
        int k1 = field_927_g.field_178_g.field_716_F;
        field_928_f.setSeed(field_926_h * 0x4c627);
        if(field_927_g.field_183_b.func_725_d())
        {
            int l1 = field_927_g.field_178_g.func_459_m();
            for(int j2 = 0; j2 < 10; j2++)
            {
                int k3 = i1 - 32;
                if(l1 > 0)
                {
                    int i5 = (l / 2 + 91) - j2 * 8 - 9;
                    if(j2 * 2 + 1 < l1)
                    {
                        func_550_b(i5, k3, 34, 9, 9, 9);
                    }
                    if(j2 * 2 + 1 == l1)
                    {
                        func_550_b(i5, k3, 25, 9, 9, 9);
                    }
                    if(j2 * 2 + 1 > l1)
                    {
                        func_550_b(i5, k3, 16, 9, 9, 9);
                    }
                }
                int j5 = 0;
                if(flag1)
                {
                    j5 = 1;
                }
                int l5 = (l / 2 - 91) + j2 * 8;
                if(j1 <= 4)
                {
                    k3 += field_928_f.nextInt(2);
                }
                func_550_b(l5, k3, 16 + j5 * 9, 0, 9, 9);
                if(flag1)
                {
                    if(j2 * 2 + 1 < k1)
                    {
                        func_550_b(l5, k3, 70, 0, 9, 9);
                    }
                    if(j2 * 2 + 1 == k1)
                    {
                        func_550_b(l5, k3, 79, 0, 9, 9);
                    }
                }
                if(j2 * 2 + 1 < j1)
                {
                    func_550_b(l5, k3, 52, 0, 9, 9);
                }
                if(j2 * 2 + 1 == j1)
                {
                    func_550_b(l5, k3, 61, 0, 9, 9);
                }
            }

            if(field_927_g.field_178_g.func_393_a(gb.field_1332_f))
            {
                int k2 = (int)Math.ceil(((double)(field_927_g.field_178_g.field_623_aX - 2) * 10D) / 300D);
                int l3 = (int)Math.ceil(((double)field_927_g.field_178_g.field_623_aX * 10D) / 300D) - k2;
                for(int k5 = 0; k5 < k2 + l3; k5++)
                {
                    if(k5 < k2)
                    {
                        func_550_b((l / 2 - 91) + k5 * 8, i1 - 32 - 9, 16, 18, 9, 9);
                    } else
                    {
                        func_550_b((l / 2 - 91) + k5 * 8, i1 - 32 - 9, 25, 18, 9, 9);
                    }
                }

            }
        }
        GL11.glDisable(3042);
        GL11.glEnable(32826);
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
        i.func_1158_b();
        GL11.glPopMatrix();
        for(int i2 = 0; i2 < 9; i2++)
        {
            int i3 = (l / 2 - 90) + i2 * 20 + 2;
            int i4 = i1 - 16 - 3;
            func_554_a(i2, i3, i4, f);
        }

        i.func_1159_a();
        GL11.glDisable(32826);
        if(Keyboard.isKeyDown(61))
        {
            kd1.func_874_a((new StringBuilder()).append("Minecraft Alpha v1.1.2_01 (").append(field_927_g.field_152_G).append(")").toString(), 2, 2, 0xffffff);
            kd1.func_874_a(field_927_g.func_122_l(), 2, 12, 0xffffff);
            kd1.func_874_a(field_927_g.func_107_m(), 2, 22, 0xffffff);
            kd1.func_874_a(field_927_g.func_125_n(), 2, 32, 0xffffff);
            long l2 = Runtime.getRuntime().maxMemory();
            long l4 = Runtime.getRuntime().totalMemory();
            long l6 = Runtime.getRuntime().freeMemory();
            long l7 = l4 - l6;
            String s = (new StringBuilder()).append("Used memory: ").append((l7 * 100L) / l2).append("% (").append(l7 / 1024L / 1024L).append("MB) of ").append(l2 / 1024L / 1024L).append("MB").toString();
            func_547_b(kd1, s, l - kd1.func_871_a(s) - 2, 2, 0xe0e0e0);
            s = (new StringBuilder()).append("Allocated memory: ").append((l4 * 100L) / l2).append("% (").append(l4 / 1024L / 1024L).append("MB)").toString();
            func_547_b(kd1, s, l - kd1.func_871_a(s) - 2, 12, 0xe0e0e0);
        } else
        {
            kd1.func_874_a("Minecraft Alpha v1.1.2_01", 2, 2, 0xffffff);
        }
        if(field_924_j > 0)
        {
            float f1 = (float)field_924_j - f;
            int j3 = (int)((f1 * 256F) / 20F);
            if(j3 > 255)
            {
                j3 = 255;
            }
            if(j3 > 0)
            {
                GL11.glPushMatrix();
                GL11.glTranslatef(l / 2, i1 - 48, 0.0F);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                int j4 = Color.HSBtoRGB(f1 / 50F, 0.7F, 0.6F) & 0xffffff;
                kd1.func_873_b(field_925_i, -kd1.func_871_a(field_925_i) / 2, -4, j4 + (j3 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
        }
        byte byte0 = 10;
        boolean flag2 = false;
        if(field_927_g.field_169_p instanceof de)
        {
            byte0 = 20;
            flag2 = true;
        }
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, i1 - 48, 0.0F);
        for(int k4 = 0; k4 < field_929_e.size() && k4 < byte0; k4++)
        {
            if(((ko)field_929_e.get(k4)).field_1296_b >= 200 && !flag2)
            {
                continue;
            }
            double d = (double)((ko)field_929_e.get(k4)).field_1296_b / 200D;
            d = 1.0D - d;
            d *= 10D;
            if(d < 0.0D)
            {
                d = 0.0D;
            }
            if(d > 1.0D)
            {
                d = 1.0D;
            }
            d *= d;
            int i6 = (int)(255D * d);
            if(flag2)
            {
                i6 = 255;
            }
            if(i6 > 0)
            {
                byte byte1 = 2;
                int j6 = -k4 * 9;
                String s1 = ((ko)field_929_e.get(k4)).field_1297_a;
                func_551_a(byte1, j6 - 1, byte1 + 320, j6 + 8, i6 / 2 << 24);
                GL11.glEnable(3042);
                kd1.func_874_a(s1, byte1, j6, 0xffffff + (i6 << 24));
            }
        }

        GL11.glPopMatrix();
        GL11.glEnable(3008);
        GL11.glDisable(3042);
    }

    private void func_556_a(float f, int j, int k)
    {
        f = 1.0F - f;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        field_931_c += (double)(f - field_931_c) * 0.01D;
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(0, 769);
        GL11.glColor4f(field_931_c, field_931_c, field_931_c, 1.0F);
        GL11.glBindTexture(3553, field_927_g.field_171_n.func_1070_a("/misc/vignette.png"));
        ho ho1 = ho.field_1512_a;
        ho1.func_977_b();
        ho1.func_983_a(0.0D, k, -90D, 0.0D, 1.0D);
        ho1.func_983_a(j, k, -90D, 1.0D, 1.0D);
        ho1.func_983_a(j, 0.0D, -90D, 1.0D, 0.0D);
        ho1.func_983_a(0.0D, 0.0D, -90D, 0.0D, 0.0D);
        ho1.func_982_a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBlendFunc(770, 771);
    }

    private void func_554_a(int j, int k, int l, float f)
    {
        ev ev1 = field_927_g.field_178_g.field_778_b.field_843_a[j];
        if(ev1 == null)
        {
            return;
        }
        float f1 = (float)ev1.field_1614_b - f;
        if(f1 > 0.0F)
        {
            GL11.glPushMatrix();
            float f2 = 1.0F + f1 / 5F;
            GL11.glTranslatef(k + 8, l + 12, 0.0F);
            GL11.glScalef(1.0F / f2, (f2 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef(-(k + 8), -(l + 12), 0.0F);
        }
        field_930_d.func_161_a(field_927_g.field_170_o, field_927_g.field_171_n, ev1, k, l);
        if(f1 > 0.0F)
        {
            GL11.glPopMatrix();
        }
        field_930_d.func_164_b(field_927_g.field_170_o, field_927_g.field_171_n, ev1, k, l);
    }

    public void func_555_a()
    {
        if(field_924_j > 0)
        {
            field_924_j--;
        }
        field_926_h++;
        for(int j = 0; j < field_929_e.size(); j++)
        {
            ((ko)field_929_e.get(j)).field_1296_b++;
        }

    }

    public void func_552_a(String s)
    {
        int j;
        for(; field_927_g.field_170_o.func_871_a(s) > 320; s = s.substring(j))
        {
            for(j = 1; j < s.length() && field_927_g.field_170_o.func_871_a(s.substring(0, j + 1)) <= 320; j++) { }
            func_552_a(s.substring(0, j));
        }

        field_929_e.add(0, new ko(s));
        for(; field_929_e.size() > 50; field_929_e.remove(field_929_e.size() - 1)) { }
    }

    public void func_553_b(String s)
    {
        field_925_i = (new StringBuilder()).append("Now playing: ").append(s).toString();
        field_924_j = 60;
    }

    private static ab field_930_d = new ab();
    private java.util.List field_929_e;
    private Random field_928_f;
    private Minecraft field_927_g;
    public String field_933_a;
    private int field_926_h;
    private String field_925_i;
    private int field_924_j;
    public float field_932_b;
    float field_931_c;

}
