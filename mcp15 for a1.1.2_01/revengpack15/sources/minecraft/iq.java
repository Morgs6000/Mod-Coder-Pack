// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
//import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.GLU;

public class iq
{

    public iq(Minecraft minecraft)
    {
        field_1387_i = 0.0F;
        field_1385_k = null;
        field_1384_l = System.currentTimeMillis();
        field_1383_m = new Random();
        field_1394_b = 0;
        field_1393_c = 0;
        field_1392_d = df.func_1123_d(16);
        field_1388_h = minecraft;
        field_1395_a = new jh(minecraft);
    }

    public void func_911_a()
    {
        field_1382_n = field_1381_o;
        float f = field_1388_h.field_180_e.func_598_c(eo.b(field_1388_h.field_178_g.field_611_ak), eo.b(field_1388_h.field_178_g.field_610_al), eo.b(field_1388_h.field_178_g.field_609_am));
        float f1 = (float)(3 - field_1388_h.field_160_y.field_1580_e) / 3F;
        float f2 = f * (1.0F - f1) + f1;
        field_1381_o += (f2 - field_1381_o) * 0.1F;
        field_1386_j++;
        field_1395_a.func_895_a();
        if(field_1388_h.field_149_J)
        {
            func_916_c();
        }
    }

    public void func_910_a(float f)
    {
        if(field_1388_h.field_178_g == null)
        {
            return;
        }
        double d = field_1388_h.field_183_b.func_727_b();
        field_1388_h.field_161_x = field_1388_h.field_178_g.func_416_a(d, f);
        double d1 = d;
        aj aj1 = field_1388_h.field_178_g.func_427_e(f);
        if(field_1388_h.field_161_x != null)
        {
            d1 = field_1388_h.field_161_x.field_1169_f.func_1251_c(aj1);
        }
        if(field_1388_h.field_183_b instanceof il)
        {
            d1 = d = 32D;
        } else
        {
            if(d1 > 3D)
            {
                d1 = 3D;
            }
            d = d1;
        }
        aj aj2 = field_1388_h.field_178_g.func_430_f(f);
        aj aj3 = aj1.func_1257_c(aj2.field_1776_a * d, aj2.field_1775_b * d, aj2.field_1779_c * d);
        field_1385_k = null;
        List list = field_1388_h.field_180_e.func_659_b(field_1388_h.field_178_g, field_1388_h.field_178_g.field_601_au.func_1170_a(aj2.field_1776_a * d, aj2.field_1775_b * d, aj2.field_1779_c * d));
        double d2 = 0.0D;
        for(int k = 0; k < list.size(); k++)
        {
            kh kh1 = (kh)list.get(k);
            if(!kh1.func_401_c_())
            {
                continue;
            }
            float f1 = 0.1F;
            cf cf1 = kh1.field_601_au.func_1177_b(f1, f1, f1);
            mf mf1 = cf1.func_1169_a(aj1, aj3);
            if(mf1 == null)
            {
                continue;
            }
            double d3 = aj1.func_1251_c(mf1.field_1169_f);
            if(d3 < d2 || d2 == 0.0D)
            {
                field_1385_k = kh1;
                d2 = d3;
            }
        }

        if(field_1385_k != null && !(field_1388_h.field_183_b instanceof il))
        {
            field_1388_h.field_161_x = new mf(field_1385_k);
        }
    }

    private float func_914_d(float f)
    {
        bi bi1 = field_1388_h.field_178_g;
        float f1 = 70F;
        if(bi1.func_393_a(gb.field_1332_f))
        {
            f1 = 60F;
        }
        if(((dm) (bi1)).field_717_E <= 0)
        {
            float f2 = (float)((dm) (bi1)).field_712_J + f;
            f1 /= (1.0F - 500F / (f2 + 500F)) * 2.0F + 1.0F;
        }
        return f1;
    }

    private void func_920_e(float f)
    {
        bi bi1 = field_1388_h.field_178_g;
        float f1 = (float)((dm) (bi1)).field_715_G - f;
        if(((dm) (bi1)).field_717_E <= 0)
        {
            float f2 = (float)((dm) (bi1)).field_712_J + f;
            GL11.glRotatef(40F - 8000F / (f2 + 200F), 0.0F, 0.0F, 1.0F);
        }
        if(f1 < 0.0F)
        {
            return;
        } else
        {
            f1 /= ((dm) (bi1)).field_714_H;
            f1 = eo.func_1106_a(f1 * f1 * f1 * f1 * 3.141593F);
            float f3 = ((dm) (bi1)).field_713_I;
            GL11.glRotatef(-f3, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f1 * 14F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(f3, 0.0F, 1.0F, 0.0F);
            return;
        }
    }

    private void func_917_f(float f)
    {
        if(field_1388_h.field_160_y.field_1560_x)
        {
            return;
        } else
        {
            bi bi1 = field_1388_h.field_178_g;
            float f1 = ((dm) (bi1)).field_641_aF - ((dm) (bi1)).field_642_aE;
            float f2 = ((dm) (bi1)).field_641_aF + f1 * f;
            float f3 = ((dm) (bi1)).field_775_e + (((dm) (bi1)).field_774_f - ((dm) (bi1)).field_775_e) * f;
            float f4 = ((dm) (bi1)).field_710_L + (((dm) (bi1)).field_709_M - ((dm) (bi1)).field_710_L) * f;
            GL11.glTranslatef(eo.func_1106_a(f2 * 3.141593F) * f3 * 0.5F, -Math.abs(eo.func_1114_b(f2 * 3.141593F) * f3), 0.0F);
            GL11.glRotatef(eo.func_1106_a(f2 * 3.141593F) * f3 * 3F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(eo.func_1114_b(f2 * 3.141593F + 0.2F) * f3) * 5F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(f4, 1.0F, 0.0F, 0.0F);
            return;
        }
    }

    private void func_915_g(float f)
    {
        bi bi1 = field_1388_h.field_178_g;
        double d = ((dm) (bi1)).field_614_ah + (((dm) (bi1)).field_611_ak - ((dm) (bi1)).field_614_ah) * (double)f;
        double d1 = ((dm) (bi1)).field_613_ai + (((dm) (bi1)).field_610_al - ((dm) (bi1)).field_613_ai) * (double)f;
        double d2 = ((dm) (bi1)).field_612_aj + (((dm) (bi1)).field_609_am - ((dm) (bi1)).field_612_aj) * (double)f;
        if(field_1388_h.field_160_y.field_1560_x)
        {
            double d3 = 4D;
            float f1 = ((dm) (bi1)).field_605_aq;
            float f2 = ((dm) (bi1)).field_604_ar;
            double d4 = (double)(-eo.func_1106_a((f1 / 180F) * 3.141593F) * eo.func_1114_b((f2 / 180F) * 3.141593F)) * d3;
            double d5 = (double)(eo.func_1114_b((f1 / 180F) * 3.141593F) * eo.func_1114_b((f2 / 180F) * 3.141593F)) * d3;
            double d6 = (double)(-eo.func_1106_a((f2 / 180F) * 3.141593F)) * d3;
            for(int k = 0; k < 8; k++)
            {
                float f3 = (k & 1) * 2 - 1;
                float f4 = (k >> 1 & 1) * 2 - 1;
                float f5 = (k >> 2 & 1) * 2 - 1;
                f3 *= 0.1F;
                f4 *= 0.1F;
                f5 *= 0.1F;
                mf mf1 = field_1388_h.field_180_e.func_645_a(aj.func_1248_b(d + (double)f3, d1 + (double)f4, d2 + (double)f5), aj.func_1248_b((d - d4) + (double)f3 + (double)f5, (d1 - d6) + (double)f4, (d2 - d5) + (double)f5));
                if(mf1 == null)
                {
                    continue;
                }
                double d7 = mf1.field_1169_f.func_1251_c(aj.func_1248_b(d, d1, d2));
                if(d7 < d3)
                {
                    d3 = d7;
                }
            }

            GL11.glRotatef(((dm) (bi1)).field_604_ar - f2, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(((dm) (bi1)).field_605_aq - f1, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, 0.0F, (float)(-d3));
            GL11.glRotatef(f1 - ((dm) (bi1)).field_605_aq, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(f2 - ((dm) (bi1)).field_604_ar, 1.0F, 0.0F, 0.0F);
        } else
        {
            GL11.glTranslatef(0.0F, 0.0F, -0.1F);
        }
        GL11.glRotatef(((dm) (bi1)).field_602_at + (((dm) (bi1)).field_604_ar - ((dm) (bi1)).field_602_at) * f, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(((dm) (bi1)).field_603_as + (((dm) (bi1)).field_605_aq - ((dm) (bi1)).field_603_as) * f + 180F, 0.0F, 1.0F, 0.0F);
    }

    private void func_918_a(float f, int k)
    {
        field_1387_i = 256 >> field_1388_h.field_160_y.field_1580_e;
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        float f1 = 0.07F;
        if(field_1388_h.field_160_y.field_1578_g)
        {
            GL11.glTranslatef((float)(-(k * 2 - 1)) * f1, 0.0F, 0.0F);
        }
        GLU.gluPerspective(func_914_d(f), (float)field_1388_h.field_182_c / (float)field_1388_h.field_181_d, 0.05F, field_1387_i);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        if(field_1388_h.field_160_y.field_1578_g)
        {
            GL11.glTranslatef((float)(k * 2 - 1) * 0.1F, 0.0F, 0.0F);
        }
        func_920_e(f);
        if(field_1388_h.field_160_y.field_1579_f)
        {
            func_917_f(f);
        }
        func_915_g(f);
    }

    private void func_907_b(float f, int k)
    {
        GL11.glLoadIdentity();
        if(field_1388_h.field_160_y.field_1578_g)
        {
            GL11.glTranslatef((float)(k * 2 - 1) * 0.1F, 0.0F, 0.0F);
        }
        GL11.glPushMatrix();
        func_920_e(f);
        if(field_1388_h.field_160_y.field_1579_f)
        {
            func_917_f(f);
        }
        if(!field_1388_h.field_160_y.field_1560_x)
        {
            field_1395_a.func_894_a(f);
        }
        GL11.glPopMatrix();
        if(!field_1388_h.field_160_y.field_1560_x)
        {
            field_1395_a.func_893_b(f);
            func_920_e(f);
        }
        if(field_1388_h.field_160_y.field_1579_f)
        {
            func_917_f(f);
        }
    }

    public void func_909_b(float f)
    {
        if(!Display.isActive())
        {
            if(System.currentTimeMillis() - field_1384_l > 500L)
            {
                field_1388_h.func_117_g();
            }
        } else
        {
            field_1384_l = System.currentTimeMillis();
        }
        if(field_1388_h.field_150_I)
        {
            field_1388_h.field_157_B.func_772_c();
            float f1 = field_1388_h.field_160_y.field_1582_c * 0.6F + 0.2F;
            float f2 = f1 * f1 * f1 * 8F;
            float f3 = (float)field_1388_h.field_157_B.field_1114_a * f2;
            float f4 = (float)field_1388_h.field_157_B.field_1113_b * f2;
            int j1 = 1;
            if(field_1388_h.field_160_y.field_1581_d)
            {
                j1 = -1;
            }
            field_1388_h.field_178_g.func_346_d(f3, f4 * (float)j1);
        }
        if(field_1388_h.field_163_v)
        {
            return;
        }
        iy iy1 = new iy(field_1388_h.field_182_c, field_1388_h.field_181_d);
        int k = iy1.func_903_a();
        int l = iy1.func_902_b();
        int i1 = (Mouse.getX() * k) / field_1388_h.field_182_c;
        int k1 = l - (Mouse.getY() * l) / field_1388_h.field_181_d - 1;
        if(field_1388_h.field_180_e != null)
        {
            func_906_c(f);
            field_1388_h.field_164_u.func_557_a(f, field_1388_h.field_169_p != null, i1, k1);
        } else
        {
            GL11.glViewport(0, 0, field_1388_h.field_182_c, field_1388_h.field_181_d);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16640);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            func_905_b();
        }
        if(field_1388_h.field_169_p != null)
        {
            GL11.glClear(256);
            field_1388_h.field_169_p.func_571_a(i1, k1, f);
        }
    }

    public void func_906_c(float f)
    {
        func_910_a(f);
        bi bi1 = field_1388_h.field_178_g;
        e e1 = field_1388_h.field_179_f;
        bq bq1 = field_1388_h.field_177_h;
        double d = ((dm) (bi1)).field_638_aI + (((dm) (bi1)).field_611_ak - ((dm) (bi1)).field_638_aI) * (double)f;
        double d1 = ((dm) (bi1)).field_637_aJ + (((dm) (bi1)).field_610_al - ((dm) (bi1)).field_637_aJ) * (double)f;
        double d2 = ((dm) (bi1)).field_636_aK + (((dm) (bi1)).field_609_am - ((dm) (bi1)).field_636_aK) * (double)f;
        for(int k = 0; k < 2; k++)
        {
            if(field_1388_h.field_160_y.field_1578_g)
            {
                if(k == 0)
                {
                    GL11.glColorMask(false, true, true, false);
                } else
                {
                    GL11.glColorMask(true, false, false, false);
                }
            }
            GL11.glViewport(0, 0, field_1388_h.field_182_c, field_1388_h.field_181_d);
            func_912_i(f);
            GL11.glClear(16640);
            GL11.glEnable(2884);
            func_918_a(f, k);
            j.func_1155_a();
            if(field_1388_h.field_160_y.field_1580_e < 2)
            {
                func_919_a(-1);
                e1.func_954_a(f);
            }
            GL11.glEnable(2912);
            func_919_a(1);
            kl kl1 = new kl();
            kl1.func_343_a(d, d1, d2);
            field_1388_h.field_179_f.func_960_a(kl1, f);
            field_1388_h.field_179_f.func_948_a(bi1, false);
            func_919_a(0);
            GL11.glEnable(2912);
            GL11.glBindTexture(3553, field_1388_h.field_171_n.func_1070_a("/terrain.png"));
            i.func_1159_a();
            e1.func_943_a(bi1, 0, f);
            i.func_1158_b();
            e1.func_951_a(bi1.func_427_e(f), kl1, f);
            bq1.func_1187_b(bi1, f);
            i.func_1159_a();
            func_919_a(0);
            bq1.func_1189_a(bi1, f);
            if(field_1388_h.field_161_x != null && bi1.func_393_a(gb.field_1332_f))
            {
                GL11.glDisable(3008);
                e1.func_959_a(bi1, field_1388_h.field_161_x, 0, ((dm) (bi1)).field_778_b.func_494_a(), f);
                e1.func_955_b(bi1, field_1388_h.field_161_x, 0, ((dm) (bi1)).field_778_b.func_494_a(), f);
                GL11.glEnable(3008);
            }
            GL11.glBlendFunc(770, 771);
            func_919_a(0);
            GL11.glEnable(3042);
            GL11.glDisable(2884);
            GL11.glBindTexture(3553, field_1388_h.field_171_n.func_1070_a("/terrain.png"));
            if(field_1388_h.field_160_y.field_1576_i)
            {
                GL11.glColorMask(false, false, false, false);
                int l = e1.func_943_a(bi1, 1, f);
                GL11.glColorMask(true, true, true, true);
                if(field_1388_h.field_160_y.field_1578_g)
                {
                    if(k == 0)
                    {
                        GL11.glColorMask(false, true, true, false);
                    } else
                    {
                        GL11.glColorMask(true, false, false, false);
                    }
                }
                if(l > 0)
                {
                    e1.func_944_a(1, f);
                }
            } else
            {
                e1.func_943_a(bi1, 1, f);
            }
            GL11.glDepthMask(true);
            GL11.glEnable(2884);
            GL11.glDisable(3042);
            if(field_1388_h.field_161_x != null && !bi1.func_393_a(gb.field_1332_f))
            {
                GL11.glDisable(3008);
                e1.func_959_a(bi1, field_1388_h.field_161_x, 0, ((dm) (bi1)).field_778_b.func_494_a(), f);
                e1.func_955_b(bi1, field_1388_h.field_161_x, 0, ((dm) (bi1)).field_778_b.func_494_a(), f);
                GL11.glEnable(3008);
            }
            GL11.glDisable(2912);
            if(field_1388_h.field_180_e.field_1047_d)
            {
                func_913_h(f);
            }
            if(field_1385_k == null);
            func_919_a(0);
            GL11.glEnable(2912);
            e1.func_947_b(f);
            GL11.glDisable(2912);
            func_919_a(1);
            GL11.glClear(256);
            func_907_b(f, k);
            if(!field_1388_h.field_160_y.field_1578_g)
            {
                return;
            }
        }

        GL11.glColorMask(true, true, true, false);
    }

    private void func_916_c()
    {
        if(!field_1388_h.field_160_y.field_1576_i)
        {
            return;
        }
        bi bi1 = field_1388_h.field_178_g;
        cn cn1 = field_1388_h.field_180_e;
        int k = eo.b(((dm) (bi1)).field_611_ak);
        int l = eo.b(((dm) (bi1)).field_610_al);
        int i1 = eo.b(((dm) (bi1)).field_609_am);
        byte byte0 = 16;
        for(int j1 = 0; j1 < 150; j1++)
        {
            int k1 = (k + field_1383_m.nextInt(byte0)) - field_1383_m.nextInt(byte0);
            int l1 = (i1 + field_1383_m.nextInt(byte0)) - field_1383_m.nextInt(byte0);
            int i2 = cn1.func_696_e(k1, l1);
            int j2 = cn1.func_600_a(k1, i2 - 1, l1);
            if(i2 > l + byte0 || i2 < l - byte0)
            {
                continue;
            }
            float f = field_1383_m.nextFloat();
            float f1 = field_1383_m.nextFloat();
            if(j2 > 0)
            {
                field_1388_h.field_177_h.func_1192_a(new nf(cn1, (float)k1 + f, (double)((float)i2 + 0.1F) - ly.field_345_n[j2].field_368_bg, (float)l1 + f1));
            }
        }

    }

    private void func_913_h(float f)
    {
        bi bi1 = field_1388_h.field_178_g;
        cn cn1 = field_1388_h.field_180_e;
        int k = eo.b(((dm) (bi1)).field_611_ak);
        int l = eo.b(((dm) (bi1)).field_610_al);
        int i1 = eo.b(((dm) (bi1)).field_609_am);
        ho ho1 = ho.field_1512_a;
        GL11.glDisable(2884);
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glBindTexture(3553, field_1388_h.field_171_n.func_1070_a("/snow.png"));
        double d = ((dm) (bi1)).field_638_aI + (((dm) (bi1)).field_611_ak - ((dm) (bi1)).field_638_aI) * (double)f;
        double d1 = ((dm) (bi1)).field_637_aJ + (((dm) (bi1)).field_610_al - ((dm) (bi1)).field_637_aJ) * (double)f;
        double d2 = ((dm) (bi1)).field_636_aK + (((dm) (bi1)).field_609_am - ((dm) (bi1)).field_636_aK) * (double)f;
        int j1 = 5;
        if(field_1388_h.field_160_y.field_1576_i)
        {
            j1 = 10;
        }
        for(int k1 = k - j1; k1 <= k + j1; k1++)
        {
            for(int l1 = i1 - j1; l1 <= i1 + j1; l1++)
            {
                int i2 = cn1.func_685_d(k1, l1);
                if(i2 < 0)
                {
                    i2 = 0;
                }
                int j2 = l - j1;
                int k2 = l + j1;
                if(j2 < i2)
                {
                    j2 = i2;
                }
                if(k2 < i2)
                {
                    k2 = i2;
                }
                float f1 = 2.0F;
                if(j2 != k2)
                {
                    field_1383_m.setSeed(k1 * k1 * 3121 + k1 * 0x2b24abb + l1 * l1 * 0x66397 + l1 * 13761);
                    float f2 = (float)field_1386_j + f;
                    float f3 = ((float)(field_1386_j & 0x1ff) + f) / 512F;
                    float f4 = field_1383_m.nextFloat() + f2 * 0.01F * (float)field_1383_m.nextGaussian();
                    float f5 = field_1383_m.nextFloat() + f2 * (float)field_1383_m.nextGaussian() * 0.001F;
                    double d3 = (double)((float)k1 + 0.5F) - ((dm) (bi1)).field_611_ak;
                    double d4 = (double)((float)l1 + 0.5F) - ((dm) (bi1)).field_609_am;
                    float f6 = eo.func_1109_a(d3 * d3 + d4 * d4) / (float)j1;
                    ho1.func_977_b();
                    float f7 = cn1.func_598_c(k1, 128, l1);
                    GL11.glColor4f(f7, f7, f7, (1.0F - f6 * f6) * 0.7F);
                    ho1.func_984_b(-d * 1.0D, -d1 * 1.0D, -d2 * 1.0D);
                    ho1.func_983_a(k1 + 0, j2, l1 + 0, 0.0F * f1 + f4, ((float)j2 * f1) / 8F + f3 * f1 + f5);
                    ho1.func_983_a(k1 + 1, j2, l1 + 1, 1.0F * f1 + f4, ((float)j2 * f1) / 8F + f3 * f1 + f5);
                    ho1.func_983_a(k1 + 1, k2, l1 + 1, 1.0F * f1 + f4, ((float)k2 * f1) / 8F + f3 * f1 + f5);
                    ho1.func_983_a(k1 + 0, k2, l1 + 0, 0.0F * f1 + f4, ((float)k2 * f1) / 8F + f3 * f1 + f5);
                    ho1.func_983_a(k1 + 0, j2, l1 + 1, 0.0F * f1 + f4, ((float)j2 * f1) / 8F + f3 * f1 + f5);
                    ho1.func_983_a(k1 + 1, j2, l1 + 0, 1.0F * f1 + f4, ((float)j2 * f1) / 8F + f3 * f1 + f5);
                    ho1.func_983_a(k1 + 1, k2, l1 + 0, 1.0F * f1 + f4, ((float)k2 * f1) / 8F + f3 * f1 + f5);
                    ho1.func_983_a(k1 + 0, k2, l1 + 1, 0.0F * f1 + f4, ((float)k2 * f1) / 8F + f3 * f1 + f5);
                    ho1.func_984_b(0.0D, 0.0D, 0.0D);
                    ho1.func_982_a();
                }
            }

        }

        GL11.glEnable(2884);
        GL11.glDisable(3042);
    }

    public void func_905_b()
    {
        iy iy1 = new iy(field_1388_h.field_182_c, field_1388_h.field_181_d);
        int k = iy1.func_903_a();
        int l = iy1.func_902_b();
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, k, l, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
    }

    private void func_912_i(float f)
    {
        cn cn1 = field_1388_h.field_180_e;
        bi bi1 = field_1388_h.field_178_g;
        float f1 = 1.0F / (float)(4 - field_1388_h.field_160_y.field_1580_e);
        f1 = 1.0F - (float)Math.pow(f1, 0.25D);
        aj aj1 = cn1.func_626_b(f);
        float f2 = (float)aj1.field_1776_a;
        float f3 = (float)aj1.field_1775_b;
        float f4 = (float)aj1.field_1779_c;
        aj aj2 = cn1.func_686_e(f);
        field_1391_e = (float)aj2.field_1776_a;
        field_1390_f = (float)aj2.field_1775_b;
        field_1389_g = (float)aj2.field_1779_c;
        field_1391_e += (f2 - field_1391_e) * f1;
        field_1390_f += (f3 - field_1390_f) * f1;
        field_1389_g += (f4 - field_1389_g) * f1;
        if(bi1.func_393_a(gb.field_1332_f))
        {
            field_1391_e = 0.02F;
            field_1390_f = 0.02F;
            field_1389_g = 0.2F;
        } else
        if(bi1.func_393_a(gb.field_1331_g))
        {
            field_1391_e = 0.6F;
            field_1390_f = 0.1F;
            field_1389_g = 0.0F;
        }
        float f5 = field_1382_n + (field_1381_o - field_1382_n) * f;
        field_1391_e *= f5;
        field_1390_f *= f5;
        field_1389_g *= f5;
        if(field_1388_h.field_160_y.field_1578_g)
        {
            float f6 = (field_1391_e * 30F + field_1390_f * 59F + field_1389_g * 11F) / 100F;
            float f7 = (field_1391_e * 30F + field_1390_f * 70F) / 100F;
            float f8 = (field_1391_e * 30F + field_1389_g * 70F) / 100F;
            field_1391_e = f6;
            field_1390_f = f7;
            field_1389_g = f8;
        }
        GL11.glClearColor(field_1391_e, field_1390_f, field_1389_g, 0.0F);
    }

    private void func_919_a(int k)
    {
        bi bi1 = field_1388_h.field_178_g;
        GL11.glFog(2918, func_908_a(field_1391_e, field_1390_f, field_1389_g, 1.0F));
        GL11.glNormal3f(0.0F, -1F, 0.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if(bi1.func_393_a(gb.field_1332_f))
        {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 0.1F);
            float f = 0.4F;
            float f2 = 0.4F;
            float f4 = 0.9F;
            if(field_1388_h.field_160_y.field_1578_g)
            {
                float f6 = (f * 30F + f2 * 59F + f4 * 11F) / 100F;
                float f8 = (f * 30F + f2 * 70F) / 100F;
                float f10 = (f * 30F + f4 * 70F) / 100F;
                f = f6;
                f2 = f8;
                f4 = f10;
            }
        } else
        if(bi1.func_393_a(gb.field_1331_g))
        {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 2.0F);
            float f1 = 0.4F;
            float f3 = 0.3F;
            float f5 = 0.3F;
            if(field_1388_h.field_160_y.field_1578_g)
            {
                float f7 = (f1 * 30F + f3 * 59F + f5 * 11F) / 100F;
                float f9 = (f1 * 30F + f3 * 70F) / 100F;
                float f11 = (f1 * 30F + f5 * 70F) / 100F;
                f1 = f7;
                f3 = f9;
                f5 = f11;
            }
        } else
        {
            GL11.glFogi(2917, 9729);
            GL11.glFogf(2915, field_1387_i * 0.25F);
            GL11.glFogf(2916, field_1387_i);
            if(k < 0)
            {
                GL11.glFogf(2915, 0.0F);
                GL11.glFogf(2916, field_1387_i * 0.8F);
            }
            if(GLContext.getCapabilities().GL_NV_fog_distance)
            {
                GL11.glFogi(34138, 34139);
            }
        }
        GL11.glEnable(2903);
        GL11.glColorMaterial(1028, 4608);
    }

    private FloatBuffer func_908_a(float f, float f1, float f2, float f3)
    {
        field_1392_d.clear();
        field_1392_d.put(f).put(f1).put(f2).put(f3);
        field_1392_d.flip();
        return field_1392_d;
    }

    private Minecraft field_1388_h;
    private float field_1387_i;
    public jh field_1395_a;
    private int field_1386_j;
    private kh field_1385_k;
    private long field_1384_l;
    private Random field_1383_m;
    volatile int field_1394_b;
    volatile int field_1393_c;
    FloatBuffer field_1392_d;
    float field_1391_e;
    float field_1390_f;
    float field_1389_g;
    private float field_1382_n;
    private float field_1381_o;
}
