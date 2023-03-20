// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class bu extends dn
{

    public bu()
    {
        super(new cr(0.0F), 0.5F);
        field_209_f = (cr)field_203_d;
        field_208_g = new cr(1.0F);
        field_207_h = new cr(0.5F);
    }

    protected boolean func_187_a(dm dm1, int i)
    {
        ev ev1 = dm1.field_778_b.func_492_d(3 - i);
        if(ev1 != null)
        {
            di di1 = ev1.func_1091_a();
            if(di1 instanceof mr)
            {
                mr mr1 = (mr)di1;
                func_151_a((new StringBuilder()).append("/armor/").append(field_206_i[mr1.field_311_aZ]).append("_").append(i != 2 ? 1 : 2).append(".png").toString());
                cr cr1 = i != 2 ? field_208_g : field_207_h;
                cr1.field_1286_a.field_1403_h = i == 0;
                cr1.field_1285_b.field_1403_h = i == 0;
                cr1.field_1284_c.field_1403_h = i == 1 || i == 2;
                cr1.field_1283_d.field_1403_h = i == 1;
                cr1.field_1282_e.field_1403_h = i == 1;
                cr1.field_1281_f.field_1403_h = i == 2 || i == 3;
                cr1.field_1280_g.field_1403_h = i == 2 || i == 3;
                func_169_a(cr1);
                return true;
            }
        }
        return false;
    }

    public void func_188_a(dm dm1, double d, double d1, double d2, 
            float f, float f1)
    {
        ev ev1 = dm1.field_778_b.func_494_a();
        field_208_g.field_1278_i = field_207_h.field_1278_i = field_209_f.field_1278_i = ev1 != null;
        field_208_g.field_1277_j = field_207_h.field_1277_j = field_209_f.field_1277_j = dm1.func_381_o();
        super.func_171_a(dm1, d, d1 - (double)dm1.field_645_aB, d2, f, f1);
        field_208_g.field_1277_j = field_207_h.field_1277_j = field_209_f.field_1277_j = false;
        field_208_g.field_1278_i = field_207_h.field_1278_i = field_209_f.field_1278_i = false;
        kd kd1 = func_143_a();
        float f2 = 1.6F;
        float f3 = 0.01666667F * f2;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.0F, (float)d1 + 2.3F, (float)d2);
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(field_191_a.field_1224_j, 1.0F, 0.0F, 0.0F);
        float f4 = dm1.func_379_d(field_191_a.field_1226_h);
        f3 = (float)((double)f3 * (Math.sqrt(f4) / 2D));
        GL11.glScalef(-f3, -f3, f3);
        String s = dm1.field_771_i;
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        ho ho1 = ho.field_1512_a;
        GL11.glDisable(3553);
        ho1.func_977_b();
        int i = kd1.func_871_a(s) / 2;
        ho1.func_986_a(0.0F, 0.0F, 0.0F, 0.25F);
        ho1.func_991_a(-i - 1, -1D, 0.0D);
        ho1.func_991_a(-i - 1, 8D, 0.0D);
        ho1.func_991_a(i + 1, 8D, 0.0D);
        ho1.func_991_a(i + 1, -1D, 0.0D);
        ho1.func_982_a();
        GL11.glEnable(3553);
        kd1.func_873_b(s, -kd1.func_871_a(s) / 2, 0, 0x20ffffff);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        kd1.func_873_b(s, -kd1.func_871_a(s) / 2, 0, -1);
        GL11.glEnable(2896);
        GL11.glDisable(3042);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
    }

    protected void func_189_a(dm dm1, float f)
    {
        ev ev1 = dm1.field_778_b.func_494_a();
        if(ev1 != null)
        {
            GL11.glPushMatrix();
            field_209_f.field_1283_d.func_926_b(0.0625F);
            GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
            if(ev1.field_1617_c < 256 && bc.func_1219_a(ly.field_345_n[ev1.field_1617_c].func_210_f()))
            {
                float f1 = 0.5F;
                GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                f1 *= 0.75F;
                GL11.glRotatef(20F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(f1, -f1, f1);
            } else
            if(di.field_233_c[ev1.field_1617_c].func_194_a())
            {
                float f2 = 0.625F;
                GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
                GL11.glScalef(f2, -f2, f2);
                GL11.glRotatef(-100F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            } else
            {
                float f3 = 0.375F;
                GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
                GL11.glScalef(f3, f3, f3);
                GL11.glRotatef(60F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(20F, 0.0F, 0.0F, 1.0F);
            }
            field_191_a.field_1228_f.func_897_a(ev1);
            GL11.glPopMatrix();
        }
    }

    protected void func_186_b(dm dm1, float f)
    {
        float f1 = 0.9375F;
        GL11.glScalef(f1, f1, f1);
    }

    public void func_185_b()
    {
        field_209_f.field_1244_k = 0.0F;
        field_209_f.func_863_a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        field_209_f.field_1283_d.func_922_a(0.0625F);
    }

    protected void func_168_a(ge ge, float f)
    {
        func_186_b((dm)ge, f);
    }

    protected boolean func_166_a(ge ge, int i)
    {
        return func_187_a((dm)ge, i);
    }

    protected void func_174_b(ge ge, float f)
    {
        func_189_a((dm)ge, f);
    }

    public void func_171_a(ge ge, double d, double d1, double d2, 
            float f, float f1)
    {
        func_188_a((dm)ge, d, d1, d2, f, f1);
    }

    public void func_147_a(kh kh, double d, double d1, double d2, 
            float f, float f1)
    {
        func_188_a((dm)kh, d, d1, d2, f, f1);
    }

    private cr field_209_f;
    private cr field_208_g;
    private cr field_207_h;
    private static final String field_206_i[] = {
        "cloth", "chain", "iron", "diamond", "gold"
    };

}
