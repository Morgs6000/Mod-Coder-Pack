// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class jh
{

    public jh(Minecraft minecraft)
    {
        field_1355_b = null;
        field_1359_c = 0.0F;
        field_1358_d = 0.0F;
        field_1357_e = new bc();
        field_1356_a = minecraft;
    }

    public void func_897_a(ev ev1)
    {
        GL11.glPushMatrix();
        if(ev1.field_1617_c < 256 && bc.func_1219_a(ly.field_345_n[ev1.field_1617_c].func_210_f()))
        {
            GL11.glBindTexture(3553, field_1356_a.field_171_n.func_1070_a("/terrain.png"));
            field_1357_e.func_1227_a(ly.field_345_n[ev1.field_1617_c]);
        } else
        {
            if(ev1.field_1617_c < 256)
            {
                GL11.glBindTexture(3553, field_1356_a.field_171_n.func_1070_a("/terrain.png"));
            } else
            {
                GL11.glBindTexture(3553, field_1356_a.field_171_n.func_1070_a("/gui/items.png"));
            }
            ho ho1 = ho.field_1512_a;
            float f = (float)((ev1.func_1088_b() % 16) * 16 + 0) / 256F;
            float f1 = (float)((ev1.func_1088_b() % 16) * 16 + 16) / 256F;
            float f2 = (float)((ev1.func_1088_b() / 16) * 16 + 0) / 256F;
            float f3 = (float)((ev1.func_1088_b() / 16) * 16 + 16) / 256F;
            float f4 = 1.0F;
            float f5 = 0.0F;
            float f6 = 0.3F;
            GL11.glEnable(32826);
            GL11.glTranslatef(-f5, -f6, 0.0F);
            float f7 = 1.5F;
            GL11.glScalef(f7, f7, f7);
            GL11.glRotatef(50F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(335F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
            float f8 = 0.0625F;
            ho1.func_977_b();
            ho1.func_980_b(0.0F, 0.0F, 1.0F);
            ho1.func_983_a(0.0D, 0.0D, 0.0D, f1, f3);
            ho1.func_983_a(f4, 0.0D, 0.0D, f, f3);
            ho1.func_983_a(f4, 1.0D, 0.0D, f, f2);
            ho1.func_983_a(0.0D, 1.0D, 0.0D, f1, f2);
            ho1.func_982_a();
            ho1.func_977_b();
            ho1.func_980_b(0.0F, 0.0F, -1F);
            ho1.func_983_a(0.0D, 1.0D, 0.0F - f8, f1, f2);
            ho1.func_983_a(f4, 1.0D, 0.0F - f8, f, f2);
            ho1.func_983_a(f4, 0.0D, 0.0F - f8, f, f3);
            ho1.func_983_a(0.0D, 0.0D, 0.0F - f8, f1, f3);
            ho1.func_982_a();
            ho1.func_977_b();
            ho1.func_980_b(-1F, 0.0F, 0.0F);
            for(int j = 0; j < 16; j++)
            {
                float f9 = (float)j / 16F;
                float f13 = (f1 + (f - f1) * f9) - 0.001953125F;
                float f17 = f4 * f9;
                ho1.func_983_a(f17, 0.0D, 0.0F - f8, f13, f3);
                ho1.func_983_a(f17, 0.0D, 0.0D, f13, f3);
                ho1.func_983_a(f17, 1.0D, 0.0D, f13, f2);
                ho1.func_983_a(f17, 1.0D, 0.0F - f8, f13, f2);
            }

            ho1.func_982_a();
            ho1.func_977_b();
            ho1.func_980_b(1.0F, 0.0F, 0.0F);
            for(int k = 0; k < 16; k++)
            {
                float f10 = (float)k / 16F;
                float f14 = (f1 + (f - f1) * f10) - 0.001953125F;
                float f18 = f4 * f10 + 0.0625F;
                ho1.func_983_a(f18, 1.0D, 0.0F - f8, f14, f2);
                ho1.func_983_a(f18, 1.0D, 0.0D, f14, f2);
                ho1.func_983_a(f18, 0.0D, 0.0D, f14, f3);
                ho1.func_983_a(f18, 0.0D, 0.0F - f8, f14, f3);
            }

            ho1.func_982_a();
            ho1.func_977_b();
            ho1.func_980_b(0.0F, 1.0F, 0.0F);
            for(int l = 0; l < 16; l++)
            {
                float f11 = (float)l / 16F;
                float f15 = (f3 + (f2 - f3) * f11) - 0.001953125F;
                float f19 = f4 * f11 + 0.0625F;
                ho1.func_983_a(0.0D, f19, 0.0D, f1, f15);
                ho1.func_983_a(f4, f19, 0.0D, f, f15);
                ho1.func_983_a(f4, f19, 0.0F - f8, f, f15);
                ho1.func_983_a(0.0D, f19, 0.0F - f8, f1, f15);
            }

            ho1.func_982_a();
            ho1.func_977_b();
            ho1.func_980_b(0.0F, -1F, 0.0F);
            for(int i1 = 0; i1 < 16; i1++)
            {
                float f12 = (float)i1 / 16F;
                float f16 = (f3 + (f2 - f3) * f12) - 0.001953125F;
                float f20 = f4 * f12;
                ho1.func_983_a(f4, f20, 0.0D, f, f16);
                ho1.func_983_a(0.0D, f20, 0.0D, f1, f16);
                ho1.func_983_a(0.0D, f20, 0.0F - f8, f1, f16);
                ho1.func_983_a(f4, f20, 0.0F - f8, f, f16);
            }

            ho1.func_982_a();
            GL11.glDisable(32826);
        }
        GL11.glPopMatrix();
    }

    public void func_894_a(float f)
    {
        float f1 = field_1358_d + (field_1359_c - field_1358_d) * f;
        bi bi1 = field_1356_a.field_178_g;
        GL11.glPushMatrix();
        GL11.glRotatef(((dm) (bi1)).field_602_at + (((dm) (bi1)).field_604_ar - ((dm) (bi1)).field_602_at) * f, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(((dm) (bi1)).field_603_as + (((dm) (bi1)).field_605_aq - ((dm) (bi1)).field_603_as) * f, 0.0F, 1.0F, 0.0F);
        i.func_1158_b();
        GL11.glPopMatrix();
        float f2 = field_1356_a.field_180_e.func_598_c(eo.b(((dm) (bi1)).field_611_ak), eo.b(((dm) (bi1)).field_610_al), eo.b(((dm) (bi1)).field_609_am));
        GL11.glColor4f(f2, f2, f2, 1.0F);
        if(field_1355_b != null)
        {
            GL11.glPushMatrix();
            float f3 = 0.8F;
            float f5 = bi1.func_431_d(f);
            float f7 = eo.func_1106_a(f5 * 3.141593F);
            float f9 = eo.func_1106_a(eo.func_1113_c(f5) * 3.141593F);
            GL11.glTranslatef(-f9 * 0.4F, eo.func_1106_a(eo.func_1113_c(f5) * 3.141593F * 2.0F) * 0.2F, -f7 * 0.2F);
            GL11.glTranslatef(0.7F * f3, -0.65F * f3 - (1.0F - f1) * 0.6F, -0.9F * f3);
            GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            GL11.glEnable(32826);
            f5 = bi1.func_431_d(f);
            f7 = eo.func_1106_a(f5 * f5 * 3.141593F);
            f9 = eo.func_1106_a(eo.func_1113_c(f5) * 3.141593F);
            GL11.glRotatef(-f7 * 20F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f9 * 20F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-f9 * 80F, 1.0F, 0.0F, 0.0F);
            f5 = 0.4F;
            GL11.glScalef(f5, f5, f5);
            func_897_a(field_1355_b);
            GL11.glPopMatrix();
        } else
        {
            GL11.glPushMatrix();
            float f4 = 0.8F;
            float f6 = bi1.func_431_d(f);
            float f8 = eo.func_1106_a(f6 * 3.141593F);
            float f10 = eo.func_1106_a(eo.func_1113_c(f6) * 3.141593F);
            GL11.glTranslatef(-f10 * 0.3F, eo.func_1106_a(eo.func_1113_c(f6) * 3.141593F * 2.0F) * 0.4F, -f8 * 0.4F);
            GL11.glTranslatef(0.8F * f4, -0.75F * f4 - (1.0F - f1) * 0.6F, -0.9F * f4);
            GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            GL11.glEnable(32826);
            f6 = bi1.func_431_d(f);
            f8 = eo.func_1106_a(f6 * f6 * 3.141593F);
            f10 = eo.func_1106_a(eo.func_1113_c(f6) * 3.141593F);
            GL11.glRotatef(f10 * 70F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f8 * 20F, 0.0F, 0.0F, 1.0F);
            GL11.glBindTexture(3553, field_1356_a.field_171_n.func_1071_a(field_1356_a.field_178_g.field_622_aY, field_1356_a.field_178_g.func_356_x()));
            GL11.glTranslatef(-1F, 3.6F, 3.5F);
            GL11.glRotatef(120F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(200F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-135F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(5.6F, 0.0F, 0.0F);
            ak ak = kx.field_1233_a.func_855_a(field_1356_a.field_178_g);
            bu bu1 = (bu)ak;
            f10 = 1.0F;
            GL11.glScalef(f10, f10, f10);
            bu1.func_185_b();
            GL11.glPopMatrix();
        }
        GL11.glDisable(32826);
        i.func_1159_a();
    }

    public void func_893_b(float f)
    {
        GL11.glDisable(3008);
        if(field_1356_a.field_178_g.field_627_aT > 0)
        {
            int j = field_1356_a.field_171_n.func_1070_a("/terrain.png");
            GL11.glBindTexture(3553, j);
            func_890_d(f);
        }
        if(field_1356_a.field_178_g.func_345_I())
        {
            int k = eo.b(field_1356_a.field_178_g.field_611_ak);
            int i1 = eo.b(field_1356_a.field_178_g.field_610_al);
            int j1 = eo.b(field_1356_a.field_178_g.field_609_am);
            int k1 = field_1356_a.field_171_n.func_1070_a("/terrain.png");
            GL11.glBindTexture(3553, k1);
            int l1 = field_1356_a.field_180_e.func_600_a(k, i1, j1);
            if(ly.field_345_n[l1] != null)
            {
                func_898_a(f, ly.field_345_n[l1].func_218_a(2));
            }
        }
        if(field_1356_a.field_178_g.func_393_a(gb.field_1332_f))
        {
            int l = field_1356_a.field_171_n.func_1070_a("/water.png");
            GL11.glBindTexture(3553, l);
            func_892_c(f);
        }
        GL11.glEnable(3008);
    }

    private void func_898_a(float f, int j)
    {
        ho ho1 = ho.field_1512_a;
        float f1 = field_1356_a.field_178_g.func_382_a(f);
        f1 = 0.1F;
        GL11.glColor4f(f1, f1, f1, 0.5F);
        GL11.glPushMatrix();
        float f2 = -1F;
        float f3 = 1.0F;
        float f4 = -1F;
        float f5 = 1.0F;
        float f6 = -0.5F;
        float f7 = 0.0078125F;
        float f8 = (float)(j % 16) / 256F - f7;
        float f9 = ((float)(j % 16) + 15.99F) / 256F + f7;
        float f10 = (float)(j / 16) / 256F - f7;
        float f11 = ((float)(j / 16) + 15.99F) / 256F + f7;
        ho1.func_977_b();
        ho1.func_983_a(f2, f4, f6, f9, f11);
        ho1.func_983_a(f3, f4, f6, f8, f11);
        ho1.func_983_a(f3, f5, f6, f8, f10);
        ho1.func_983_a(f2, f5, f6, f9, f10);
        ho1.func_982_a();
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void func_892_c(float f)
    {
        ho ho1 = ho.field_1512_a;
        float f1 = field_1356_a.field_178_g.func_382_a(f);
        GL11.glColor4f(f1, f1, f1, 0.5F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glPushMatrix();
        float f2 = 4F;
        float f3 = -1F;
        float f4 = 1.0F;
        float f5 = -1F;
        float f6 = 1.0F;
        float f7 = -0.5F;
        float f8 = -field_1356_a.field_178_g.field_605_aq / 64F;
        float f9 = field_1356_a.field_178_g.field_604_ar / 64F;
        ho1.func_977_b();
        ho1.func_983_a(f3, f5, f7, f2 + f8, f2 + f9);
        ho1.func_983_a(f4, f5, f7, 0.0F + f8, f2 + f9);
        ho1.func_983_a(f4, f6, f7, 0.0F + f8, 0.0F + f9);
        ho1.func_983_a(f3, f6, f7, f2 + f8, 0.0F + f9);
        ho1.func_982_a();
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
    }

    private void func_890_d(float f)
    {
        ho ho1 = ho.field_1512_a;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        float f1 = 1.0F;
        for(int j = 0; j < 2; j++)
        {
            GL11.glPushMatrix();
            int k = ly.field_402_as.field_378_bb + j * 16;
            int l = (k & 0xf) << 4;
            int i1 = k & 0xf0;
            float f2 = (float)l / 256F;
            float f3 = ((float)l + 15.99F) / 256F;
            float f4 = (float)i1 / 256F;
            float f5 = ((float)i1 + 15.99F) / 256F;
            float f6 = (0.0F - f1) / 2.0F;
            float f7 = f6 + f1;
            float f8 = 0.0F - f1 / 2.0F;
            float f9 = f8 + f1;
            float f10 = -0.5F;
            GL11.glTranslatef((float)(-(j * 2 - 1)) * 0.24F, -0.3F, 0.0F);
            GL11.glRotatef((float)(j * 2 - 1) * 10F, 0.0F, 1.0F, 0.0F);
            ho1.func_977_b();
            ho1.func_983_a(f6, f8, f10, f3, f5);
            ho1.func_983_a(f7, f8, f10, f2, f5);
            ho1.func_983_a(f7, f9, f10, f2, f4);
            ho1.func_983_a(f6, f9, f10, f3, f4);
            ho1.func_982_a();
            GL11.glPopMatrix();
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
    }

    public void func_895_a()
    {
        field_1358_d = field_1359_c;
        bi bi1 = field_1356_a.field_178_g;
        ev ev1 = ((dm) (bi1)).field_778_b.func_494_a();
        ev ev2 = ev1;
        float f = 0.4F;
        float f1 = ev2 != field_1355_b ? 0.0F : 1.0F;
        float f2 = f1 - field_1359_c;
        if(f2 < -f)
        {
            f2 = -f;
        }
        if(f2 > f)
        {
            f2 = f;
        }
        field_1359_c += f2;
        if(field_1359_c < 0.1F)
        {
            field_1355_b = ev2;
        }
    }

    public void func_891_b()
    {
        field_1359_c = 0.0F;
    }

    public void func_896_c()
    {
        field_1359_c = 0.0F;
    }

    private Minecraft field_1356_a;
    private ev field_1355_b;
    private float field_1359_c;
    private float field_1358_d;
    private bc field_1357_e;
}
