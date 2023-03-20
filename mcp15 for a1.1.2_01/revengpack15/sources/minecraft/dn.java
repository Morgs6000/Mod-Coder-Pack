// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class dn extends ak
{

    public dn(fo fo1, float f)
    {
        field_203_d = fo1;
        field_190_b = f;
    }

    public void func_169_a(fo fo1)
    {
        field_202_e = fo1;
    }

    public void func_171_a(ge ge1, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glDisable(2884);
        field_203_d.field_1244_k = func_167_c(ge1, f1);
        field_203_d.field_1243_l = ge1.field_616_af != null;
        if(field_202_e != null)
        {
            field_202_e.field_1243_l = field_203_d.field_1243_l;
        }
        try
        {
            float f2 = ge1.field_734_o + (ge1.field_735_n - ge1.field_734_o) * f1;
            float f3 = ge1.field_603_as + (ge1.field_605_aq - ge1.field_603_as) * f1;
            float f4 = ge1.field_602_at + (ge1.field_604_ar - ge1.field_602_at) * f1;
            GL11.glTranslatef((float)d, (float)d1, (float)d2);
            float f5 = func_170_d(ge1, f1);
            GL11.glRotatef(180F - f2, 0.0F, 1.0F, 0.0F);
            if(ge1.field_712_J > 0)
            {
                float f6 = ((((float)ge1.field_712_J + f1) - 1.0F) / 20F) * 1.6F;
                f6 = eo.func_1113_c(f6);
                if(f6 > 1.0F)
                {
                    f6 = 1.0F;
                }
                GL11.glRotatef(f6 * func_172_a(ge1), 0.0F, 0.0F, 1.0F);
            }
            float f7 = 0.0625F;
            GL11.glEnable(32826);
            GL11.glScalef(-1F, -1F, 1.0F);
            func_168_a(ge1, f1);
            GL11.glTranslatef(0.0F, -24F * f7 - 0.0078125F, 0.0F);
            float f8 = ge1.field_705_Q + (ge1.field_704_R - ge1.field_705_Q) * f1;
            float f9 = ge1.field_703_S - ge1.field_704_R * (1.0F - f1);
            if(f8 > 1.0F)
            {
                f8 = 1.0F;
            }
            func_140_a(ge1.field_622_aY, ge1.func_356_x());
            GL11.glEnable(3008);
            field_203_d.func_864_b(f9, f8, f5, f3 - f2, f4, f7);
            for(int i = 0; i < 4; i++)
            {
                if(func_166_a(ge1, i))
                {
                    field_202_e.func_864_b(f9, f8, f5, f3 - f2, f4, f7);
                    GL11.glDisable(3042);
                    GL11.glEnable(3008);
                }
            }

            func_174_b(ge1, f1);
            float f10 = ge1.func_382_a(f1);
            int j = func_173_a(ge1, f10, f1);
            if((j >> 24 & 0xff) > 0 || ge1.field_715_G > 0 || ge1.field_712_J > 0)
            {
                GL11.glDisable(3553);
                GL11.glDisable(3008);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                GL11.glDepthFunc(514);
                if(ge1.field_715_G > 0 || ge1.field_712_J > 0)
                {
                    GL11.glColor4f(f10, 0.0F, 0.0F, 0.4F);
                    field_203_d.func_864_b(f9, f8, f5, f3 - f2, f4, f7);
                    for(int k = 0; k < 4; k++)
                    {
                        if(func_166_a(ge1, k))
                        {
                            GL11.glColor4f(f10, 0.0F, 0.0F, 0.4F);
                            field_202_e.func_864_b(f9, f8, f5, f3 - f2, f4, f7);
                        }
                    }

                }
                if((j >> 24 & 0xff) > 0)
                {
                    float f11 = (float)(j >> 16 & 0xff) / 255F;
                    float f12 = (float)(j >> 8 & 0xff) / 255F;
                    float f13 = (float)(j & 0xff) / 255F;
                    float f14 = (float)(j >> 24 & 0xff) / 255F;
                    GL11.glColor4f(f11, f12, f13, f14);
                    field_203_d.func_864_b(f9, f8, f5, f3 - f2, f4, f7);
                    for(int l = 0; l < 4; l++)
                    {
                        if(func_166_a(ge1, l))
                        {
                            GL11.glColor4f(f11, f12, f13, f14);
                            field_202_e.func_864_b(f9, f8, f5, f3 - f2, f4, f7);
                        }
                    }

                }
                GL11.glDepthFunc(515);
                GL11.glDisable(3042);
                GL11.glEnable(3008);
                GL11.glEnable(3553);
            }
            GL11.glDisable(32826);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        GL11.glEnable(2884);
        GL11.glPopMatrix();
    }

    protected float func_167_c(ge ge1, float f)
    {
        return ge1.func_431_d(f);
    }

    protected float func_170_d(ge ge1, float f)
    {
        return (float)ge1.field_629_aR + f;
    }

    protected void func_174_b(ge ge1, float f)
    {
    }

    protected boolean func_166_a(ge ge1, int i)
    {
        return false;
    }

    protected float func_172_a(ge ge1)
    {
        return 90F;
    }

    protected int func_173_a(ge ge1, float f, float f1)
    {
        return 0;
    }

    protected void func_168_a(ge ge1, float f)
    {
    }

    public void func_147_a(kh kh, double d, double d1, double d2, 
            float f, float f1)
    {
        func_171_a((ge)kh, d, d1, d2, f, f1);
    }

    protected fo field_203_d;
    protected fo field_202_e;
}
