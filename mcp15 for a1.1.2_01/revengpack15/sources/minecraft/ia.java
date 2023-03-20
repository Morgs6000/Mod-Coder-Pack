// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;

public class ia extends hq
{

    public ia(Minecraft minecraft)
    {
        super(minecraft);
        field_1074_c = -1;
        field_1073_d = -1;
        field_1072_e = -1;
        field_1071_f = 0.0F;
        field_1070_g = 0.0F;
        field_1069_h = 0.0F;
        field_1068_i = 0;
        field_1067_j = new k(this, 200, co.class, new Class[] {
            mb.class, cw.class, dd.class, ax.class, ma.class
        });
        field_1066_k = new az(15, ag.class, new Class[] {
            bo.class, mv.class, am.class, mz.class
        });
    }

    public void func_720_a(dm dm1)
    {
        dm1.field_605_aq = -180F;
    }

    public boolean func_729_b(int i, int j, int l, int i1)
    {
        int j1 = field_1065_a.field_180_e.func_600_a(i, j, l);
        int k1 = field_1065_a.field_180_e.func_602_e(i, j, l);
        boolean flag = super.func_729_b(i, j, l, i1);
        ev ev1 = field_1065_a.field_178_g.func_442_t();
        boolean flag1 = field_1065_a.field_178_g.func_454_b(ly.field_345_n[j1]);
        if(ev1 != null)
        {
            ev1.func_1087_a(j1, i, j, l);
            if(ev1.field_1615_a == 0)
            {
                ev1.func_1097_a(field_1065_a.field_178_g);
                field_1065_a.field_178_g.func_448_u();
            }
        }
        if(flag && flag1)
        {
            ly.field_345_n[j1].func_220_a_(field_1065_a.field_180_e, i, j, l, k1);
        }
        return flag;
    }

    public void func_719_a(int i, int j, int l, int i1)
    {
        int j1 = field_1065_a.field_180_e.func_600_a(i, j, l);
        if(j1 > 0 && field_1071_f == 0.0F)
        {
            ly.field_345_n[j1].func_233_b(field_1065_a.field_180_e, i, j, l, field_1065_a.field_178_g);
        }
        if(j1 > 0 && ly.field_345_n[j1].func_225_a(field_1065_a.field_178_g) >= 1.0F)
        {
            func_729_b(i, j, l, i1);
        }
    }

    public void func_724_a()
    {
        field_1071_f = 0.0F;
        field_1068_i = 0;
    }

    public void func_726_c(int i, int j, int l, int i1)
    {
        if(field_1068_i > 0)
        {
            field_1068_i--;
            return;
        }
        if(i == field_1074_c && j == field_1073_d && l == field_1072_e)
        {
            int j1 = field_1065_a.field_180_e.func_600_a(i, j, l);
            if(j1 == 0)
            {
                return;
            }
            ly ly1 = ly.field_345_n[j1];
            field_1071_f += ly1.func_225_a(field_1065_a.field_178_g);
            if(field_1069_h % 4F == 0.0F && ly1 != null)
            {
                field_1065_a.field_158_A.func_336_b(ly1.field_358_bl.func_1145_d(), (float)i + 0.5F, (float)j + 0.5F, (float)l + 0.5F, (ly1.field_358_bl.func_1147_b() + 1.0F) / 8F, ly1.field_358_bl.func_1144_c() * 0.5F);
            }
            field_1069_h++;
            if(field_1071_f >= 1.0F)
            {
                func_729_b(i, j, l, i1);
                field_1071_f = 0.0F;
                field_1070_g = 0.0F;
                field_1069_h = 0.0F;
                field_1068_i = 5;
            }
        } else
        {
            field_1071_f = 0.0F;
            field_1070_g = 0.0F;
            field_1069_h = 0.0F;
            field_1074_c = i;
            field_1073_d = j;
            field_1072_e = l;
        }
    }

    public void func_723_a(float f)
    {
        if(field_1071_f <= 0.0F)
        {
            field_1065_a.field_164_u.field_932_b = 0.0F;
            field_1065_a.field_179_f.field_1450_i = 0.0F;
        } else
        {
            float f1 = field_1070_g + (field_1071_f - field_1070_g) * f;
            field_1065_a.field_164_u.field_932_b = f1;
            field_1065_a.field_179_f.field_1450_i = f1;
        }
    }

    public float func_727_b()
    {
        return 4F;
    }

    public void func_717_a(cn cn1)
    {
        super.func_717_a(cn1);
    }

    public void func_728_c()
    {
        field_1070_g = field_1071_f;
        field_1067_j.func_1150_a(field_1065_a.field_180_e);
        field_1066_k.func_1150_a(field_1065_a.field_180_e);
        field_1065_a.field_158_A.func_341_c();
    }

    private int field_1074_c;
    private int field_1073_d;
    private int field_1072_e;
    private float field_1071_f;
    private float field_1070_g;
    private float field_1069_h;
    private int field_1068_i;
    private az field_1067_j;
    private az field_1066_k;
}
