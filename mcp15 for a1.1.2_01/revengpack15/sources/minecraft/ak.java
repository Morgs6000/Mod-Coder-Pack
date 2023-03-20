// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public abstract class ak
{

    public ak()
    {
        field_193_d = new cr();
        field_192_e = new bc();
        field_190_b = 0.0F;
        field_194_c = 1.0F;
    }

    public abstract void func_147_a(kh kh1, double d, double d1, double d2, 
            float f, float f1);

    protected void func_151_a(String s)
    {
        ey ey1 = field_191_a.field_1229_e;
        ey1.func_1076_b(ey1.func_1070_a(s));
    }

    protected void func_140_a(String s, String s1)
    {
        ey ey1 = field_191_a.field_1229_e;
        ey1.func_1076_b(ey1.func_1071_a(s, s1));
    }

    private void func_148_a(kh kh1, double d, double d1, double d2, 
            float f)
    {
        GL11.glDisable(2896);
        int i = ly.field_402_as.field_378_bb;
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        float f1 = (float)j / 256F;
        float f2 = ((float)j + 15.99F) / 256F;
        float f3 = (float)k / 256F;
        float f4 = ((float)k + 15.99F) / 256F;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        float f5 = kh1.field_644_aC * 1.4F;
        GL11.glScalef(f5, f5, f5);
        func_151_a("/terrain.png");
        ho ho1 = ho.field_1512_a;
        float f6 = 1.0F;
        float f7 = 0.5F;
        float f8 = 0.0F;
        float f9 = kh1.field_643_aD / kh1.field_644_aC;
        GL11.glRotatef(-field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, 0.4F + (float)(int)f9 * 0.02F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        ho1.func_977_b();
        while(f9 > 0.0F) 
        {
            ho1.func_983_a(f6 - f7, 0.0F - f8, 0.0D, f2, f4);
            ho1.func_983_a(0.0F - f7, 0.0F - f8, 0.0D, f1, f4);
            ho1.func_983_a(0.0F - f7, 1.4F - f8, 0.0D, f1, f3);
            ho1.func_983_a(f6 - f7, 1.4F - f8, 0.0D, f2, f3);
            f9--;
            f8--;
            f6 *= 0.9F;
            GL11.glTranslatef(0.0F, 0.0F, -0.04F);
        }
        ho1.func_982_a();
        GL11.glPopMatrix();
        GL11.glEnable(2896);
    }

    private void func_144_c(kh kh1, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        ey ey1 = field_191_a.field_1229_e;
        ey1.func_1076_b(ey1.func_1070_a("%%/shadow.png"));
        cn cn1 = func_149_b();
        GL11.glDepthMask(false);
        float f2 = field_190_b;
        double d3 = kh1.field_638_aI + (kh1.field_611_ak - kh1.field_638_aI) * (double)f1;
        double d4 = kh1.field_637_aJ + (kh1.field_610_al - kh1.field_637_aJ) * (double)f1 + (double)kh1.func_392_h_();
        double d5 = kh1.field_636_aK + (kh1.field_609_am - kh1.field_636_aK) * (double)f1;
        int i = eo.b(d3 - (double)f2);
        int j = eo.b(d3 + (double)f2);
        int k = eo.b(d4 - (double)f2);
        int l = eo.b(d4);
        int i1 = eo.b(d5 - (double)f2);
        int j1 = eo.b(d5 + (double)f2);
        double d6 = d - d3;
        double d7 = d1 - d4;
        double d8 = d2 - d5;
        ho ho1 = ho.field_1512_a;
        ho1.func_977_b();
        for(int k1 = i; k1 <= j; k1++)
        {
            for(int l1 = k; l1 <= l; l1++)
            {
                for(int i2 = i1; i2 <= j1; i2++)
                {
                    int j2 = cn1.func_600_a(k1, l1 - 1, i2);
                    if(j2 > 0 && cn1.func_618_j(k1, l1, i2) > 3)
                    {
                        func_145_a(ly.field_345_n[j2], d, d1 + (double)kh1.func_392_h_(), d2, k1, l1, i2, f, f2, d6, d7 + (double)kh1.func_392_h_(), d8);
                    }
                }

            }

        }

        ho1.func_982_a();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
    }

    private cn func_149_b()
    {
        return field_191_a.field_1227_g;
    }

    private void func_145_a(ly ly1, double d, double d1, double d2, 
            int i, int j, int k, float f, float f1, double d3, 
            double d4, double d5)
    {
        ho ho1 = ho.field_1512_a;
        if(!ly1.func_242_c())
        {
            return;
        }
        double d6 = ((double)f - (d1 - ((double)j + d4)) / 2D) * 0.5D * (double)func_149_b().func_598_c(i, j, k);
        if(d6 < 0.0D)
        {
            return;
        }
        if(d6 > 1.0D)
        {
            d6 = 1.0D;
        }
        ho1.func_986_a(1.0F, 1.0F, 1.0F, (float)d6);
        double d7 = (double)i + ly1.field_370_bf + d3;
        double d8 = (double)i + ly1.field_364_bi + d3;
        double d9 = (double)j + ly1.field_368_bg + d4 + 0.015625D;
        double d10 = (double)k + ly1.field_366_bh + d5;
        double d11 = (double)k + ly1.field_360_bk + d5;
        float f2 = (float)((d - d7) / 2D / (double)f1 + 0.5D);
        float f3 = (float)((d - d8) / 2D / (double)f1 + 0.5D);
        float f4 = (float)((d2 - d10) / 2D / (double)f1 + 0.5D);
        float f5 = (float)((d2 - d11) / 2D / (double)f1 + 0.5D);
        ho1.func_983_a(d7, d9, d10, f2, f4);
        ho1.func_983_a(d7, d9, d11, f2, f5);
        ho1.func_983_a(d8, d9, d11, f3, f5);
        ho1.func_983_a(d8, d9, d10, f3, f4);
    }

    public static void func_146_a(cf cf1, double d, double d1, double d2)
    {
        GL11.glDisable(3553);
        ho ho1 = ho.field_1512_a;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        ho1.func_977_b();
        ho1.func_984_b(d, d1, d2);
        ho1.func_980_b(0.0F, 0.0F, -1F);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_980_b(0.0F, 0.0F, 1.0F);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_980_b(0.0F, -1F, 0.0F);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_980_b(0.0F, 1.0F, 0.0F);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_980_b(-1F, 0.0F, 0.0F);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_980_b(1.0F, 0.0F, 0.0F);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_984_b(0.0D, 0.0D, 0.0D);
        ho1.func_982_a();
        GL11.glEnable(3553);
    }

    public static void func_142_a(cf cf1)
    {
        ho ho1 = ho.field_1512_a;
        ho1.func_977_b();
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1698_a, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1704_c);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1702_e, cf1.field_1701_f);
        ho1.func_991_a(cf1.field_1703_d, cf1.field_1697_b, cf1.field_1701_f);
        ho1.func_982_a();
    }

    public void func_150_a(kx kx1)
    {
        field_191_a = kx1;
    }

    public void func_141_b(kh kh1, double d, double d1, double d2, 
            float f, float f1)
    {
        if(field_191_a.field_1223_k.field_1576_i && field_190_b > 0.0F)
        {
            double d3 = field_191_a.func_851_a(kh1.field_611_ak, kh1.field_610_al, kh1.field_609_am);
            float f2 = (float)((1.0D - d3 / 256D) * (double)field_194_c);
            if(f2 > 0.0F)
            {
                func_144_c(kh1, d, d1, d2, f2, f1);
            }
        }
        if(kh1.field_627_aT > 0)
        {
            func_148_a(kh1, d, d1, d2, f1);
        }
    }

    public kd func_143_a()
    {
        return field_191_a.func_856_a();
    }

    protected kx field_191_a;
    private fo field_193_d;
    private bc field_192_e;
    protected float field_190_b;
    protected float field_194_c;
}
