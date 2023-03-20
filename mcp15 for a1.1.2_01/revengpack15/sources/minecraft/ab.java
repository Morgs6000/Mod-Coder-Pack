// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class ab extends ak
{

    public ab()
    {
        field_201_d = new bc();
        field_200_e = new Random();
        field_190_b = 0.15F;
        field_194_c = 0.75F;
    }

    public void func_165_a(dx dx1, double d, double d1, double d2, 
            float f, float f1)
    {
        field_200_e.setSeed(187L);
        ev ev1 = dx1.field_801_a;
        GL11.glPushMatrix();
        float f2 = eo.func_1106_a(((float)dx1.field_800_b + f1) / 10F + dx1.field_804_d) * 0.1F + 0.1F;
        float f3 = (((float)dx1.field_800_b + f1) / 20F + dx1.field_804_d) * 57.29578F;
        byte byte0 = 1;
        if(dx1.field_801_a.field_1615_a > 1)
        {
            byte0 = 2;
        }
        if(dx1.field_801_a.field_1615_a > 5)
        {
            byte0 = 3;
        }
        if(dx1.field_801_a.field_1615_a > 20)
        {
            byte0 = 4;
        }
        GL11.glTranslatef((float)d, (float)d1 + f2, (float)d2);
        GL11.glEnable(32826);
        if(ev1.field_1617_c < 256 && bc.func_1219_a(ly.field_345_n[ev1.field_1617_c].func_210_f()))
        {
            GL11.glRotatef(f3, 0.0F, 1.0F, 0.0F);
            func_151_a("/terrain.png");
            float f4 = 0.25F;
            if(!ly.field_345_n[ev1.field_1617_c].func_242_c() && ev1.field_1617_c != ly.field_410_al.field_376_bc)
            {
                f4 = 0.5F;
            }
            GL11.glScalef(f4, f4, f4);
            for(int j = 0; j < byte0; j++)
            {
                GL11.glPushMatrix();
                if(j > 0)
                {
                    float f5 = ((field_200_e.nextFloat() * 2.0F - 1.0F) * 0.2F) / f4;
                    float f7 = ((field_200_e.nextFloat() * 2.0F - 1.0F) * 0.2F) / f4;
                    float f9 = ((field_200_e.nextFloat() * 2.0F - 1.0F) * 0.2F) / f4;
                    GL11.glTranslatef(f5, f7, f9);
                }
                field_201_d.func_1227_a(ly.field_345_n[ev1.field_1617_c]);
                GL11.glPopMatrix();
            }

        } else
        {
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            int i = ev1.func_1088_b();
            if(ev1.field_1617_c < 256)
            {
                func_151_a("/terrain.png");
            } else
            {
                func_151_a("/gui/items.png");
            }
            ho ho1 = ho.field_1512_a;
            float f6 = (float)((i % 16) * 16 + 0) / 256F;
            float f8 = (float)((i % 16) * 16 + 16) / 256F;
            float f10 = (float)((i / 16) * 16 + 0) / 256F;
            float f11 = (float)((i / 16) * 16 + 16) / 256F;
            float f12 = 1.0F;
            float f13 = 0.5F;
            float f14 = 0.25F;
            for(int k = 0; k < byte0; k++)
            {
                GL11.glPushMatrix();
                if(k > 0)
                {
                    float f15 = (field_200_e.nextFloat() * 2.0F - 1.0F) * 0.3F;
                    float f16 = (field_200_e.nextFloat() * 2.0F - 1.0F) * 0.3F;
                    float f17 = (field_200_e.nextFloat() * 2.0F - 1.0F) * 0.3F;
                    GL11.glTranslatef(f15, f16, f17);
                }
                GL11.glRotatef(180F - field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
                ho1.func_977_b();
                ho1.func_980_b(0.0F, 1.0F, 0.0F);
                ho1.func_983_a(0.0F - f13, 0.0F - f14, 0.0D, f6, f11);
                ho1.func_983_a(f12 - f13, 0.0F - f14, 0.0D, f8, f11);
                ho1.func_983_a(f12 - f13, 1.0F - f14, 0.0D, f8, f10);
                ho1.func_983_a(0.0F - f13, 1.0F - f14, 0.0D, f6, f10);
                ho1.func_982_a();
                GL11.glPopMatrix();
            }

        }
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    public void func_161_a(kd kd1, ey ey1, ev ev1, int i, int j)
    {
        if(ev1 == null)
        {
            return;
        }
        if(ev1.field_1617_c < 256 && bc.func_1219_a(ly.field_345_n[ev1.field_1617_c].func_210_f()))
        {
            int k = ev1.field_1617_c;
            ey1.func_1076_b(ey1.func_1070_a("/terrain.png"));
            ly ly1 = ly.field_345_n[k];
            GL11.glPushMatrix();
            GL11.glTranslatef(i - 2, j + 3, 0.0F);
            GL11.glScalef(10F, 10F, 10F);
            GL11.glTranslatef(1.0F, 0.5F, 8F);
            GL11.glRotatef(210F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            field_201_d.func_1227_a(ly1);
            GL11.glPopMatrix();
        } else
        if(ev1.func_1088_b() >= 0)
        {
            GL11.glDisable(2896);
            if(ev1.field_1617_c < 256)
            {
                ey1.func_1076_b(ey1.func_1070_a("/terrain.png"));
            } else
            {
                ey1.func_1076_b(ey1.func_1070_a("/gui/items.png"));
            }
            func_163_a(i, j, (ev1.func_1088_b() % 16) * 16, (ev1.func_1088_b() / 16) * 16, 16, 16);
            GL11.glEnable(2896);
        }
        GL11.glEnable(2884);
    }

    public void func_164_b(kd kd1, ey ey1, ev ev1, int i, int j)
    {
        if(ev1 == null)
        {
            return;
        }
        if(ev1.field_1615_a > 1)
        {
            String s = (new StringBuilder()).append("").append(ev1.field_1615_a).toString();
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            kd1.func_874_a(s, (i + 19) - 2 - kd1.func_871_a(s), j + 6 + 3, 0xffffff);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
        }
        if(ev1.field_1616_d > 0)
        {
            int k = 13 - (ev1.field_1616_d * 13) / ev1.func_1094_d();
            int l = 255 - (ev1.field_1616_d * 255) / ev1.func_1094_d();
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            ho ho1 = ho.field_1512_a;
            int i1 = 255 - l << 16 | l << 8;
            int j1 = (255 - l) / 4 << 16 | 0x3f00;
            func_162_a(ho1, i + 2, j + 13, 13, 2, 0);
            func_162_a(ho1, i + 2, j + 13, 12, 1, j1);
            func_162_a(ho1, i + 2, j + 13, k, 1, i1);
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    private void func_162_a(ho ho1, int i, int j, int k, int l, int i1)
    {
        ho1.func_977_b();
        ho1.func_990_b(i1);
        ho1.func_991_a(i + 0, j + 0, 0.0D);
        ho1.func_991_a(i + 0, j + l, 0.0D);
        ho1.func_991_a(i + k, j + l, 0.0D);
        ho1.func_991_a(i + k, j + 0, 0.0D);
        ho1.func_982_a();
    }

    public void func_163_a(int i, int j, int k, int l, int i1, int j1)
    {
        float f = 0.0F;
        float f1 = 0.00390625F;
        float f2 = 0.00390625F;
        ho ho1 = ho.field_1512_a;
        ho1.func_977_b();
        ho1.func_983_a(i + 0, j + j1, f, (float)(k + 0) * f1, (float)(l + j1) * f2);
        ho1.func_983_a(i + i1, j + j1, f, (float)(k + i1) * f1, (float)(l + j1) * f2);
        ho1.func_983_a(i + i1, j + 0, f, (float)(k + i1) * f1, (float)(l + 0) * f2);
        ho1.func_983_a(i + 0, j + 0, f, (float)(k + 0) * f1, (float)(l + 0) * f2);
        ho1.func_982_a();
    }

    public void func_147_a(kh kh, double d, double d1, double d2, 
            float f, float f1)
    {
        func_165_a((dx)kh, d, d1, d2, f, f1);
    }

    private bc field_201_d;
    private Random field_200_e;
}
