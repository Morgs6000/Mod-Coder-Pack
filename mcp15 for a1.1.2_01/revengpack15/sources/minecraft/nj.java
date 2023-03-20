// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;

public class nj extends hq
{

    public nj(Minecraft minecraft, gy gy1)
    {
        super(minecraft);
        field_1084_c = -1;
        field_1083_d = -1;
        field_1082_e = -1;
        field_1081_f = 0.0F;
        field_1080_g = 0.0F;
        field_1079_h = 0.0F;
        field_1078_i = 0;
        field_1077_j = false;
        field_1075_l = 0;
        field_1076_k = gy1;
    }

    public void func_720_a(dm dm1)
    {
        dm1.field_605_aq = -180F;
    }

    public boolean func_729_b(int i, int j, int k, int l)
    {
        field_1076_k.func_847_a(new fg(3, i, j, k, l));
        int i1 = field_1065_a.field_180_e.func_600_a(i, j, k);
        int j1 = field_1065_a.field_180_e.func_602_e(i, j, k);
        boolean flag = super.func_729_b(i, j, k, l);
        ev ev1 = field_1065_a.field_178_g.func_442_t();
        if(ev1 != null)
        {
            ev1.func_1087_a(i1, i, j, k);
            if(ev1.field_1615_a == 0)
            {
                ev1.func_1097_a(field_1065_a.field_178_g);
                field_1065_a.field_178_g.func_448_u();
            }
        }
        if(flag && field_1065_a.field_178_g.func_454_b(ly.field_345_n[i1]))
        {
            ly.field_345_n[i1].func_259_b_(field_1065_a.field_180_e, i, j, k, j1);
        }
        return flag;
    }

    public void func_719_a(int i, int j, int k, int l)
    {
        field_1077_j = true;
        field_1076_k.func_847_a(new fg(0, i, j, k, l));
        int i1 = field_1065_a.field_180_e.func_600_a(i, j, k);
        if(i1 > 0 && field_1081_f == 0.0F)
        {
            ly.field_345_n[i1].func_233_b(field_1065_a.field_180_e, i, j, k, field_1065_a.field_178_g);
        }
        if(i1 > 0 && ly.field_345_n[i1].func_225_a(field_1065_a.field_178_g) >= 1.0F)
        {
            func_729_b(i, j, k, l);
        }
    }

    public void func_724_a()
    {
        if(!field_1077_j)
        {
            return;
        } else
        {
            field_1077_j = false;
            field_1076_k.func_847_a(new fg(2, 0, 0, 0, 0));
            field_1081_f = 0.0F;
            field_1078_i = 0;
            return;
        }
    }

    public void func_726_c(int i, int j, int k, int l)
    {
        field_1077_j = true;
        func_730_e();
        field_1076_k.func_847_a(new fg(1, i, j, k, l));
        if(field_1078_i > 0)
        {
            field_1078_i--;
            return;
        }
        if(i == field_1084_c && j == field_1083_d && k == field_1082_e)
        {
            int i1 = field_1065_a.field_180_e.func_600_a(i, j, k);
            if(i1 == 0)
            {
                return;
            }
            ly ly1 = ly.field_345_n[i1];
            field_1081_f += ly1.func_225_a(field_1065_a.field_178_g);
            if(field_1079_h % 4F == 0.0F && ly1 != null)
            {
                field_1065_a.field_158_A.func_336_b(ly1.field_358_bl.func_1145_d(), (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, (ly1.field_358_bl.func_1147_b() + 1.0F) / 8F, ly1.field_358_bl.func_1144_c() * 0.5F);
            }
            field_1079_h++;
            if(field_1081_f >= 1.0F)
            {
                func_729_b(i, j, k, l);
                field_1081_f = 0.0F;
                field_1080_g = 0.0F;
                field_1079_h = 0.0F;
                field_1078_i = 5;
            }
        } else
        {
            field_1081_f = 0.0F;
            field_1080_g = 0.0F;
            field_1079_h = 0.0F;
            field_1084_c = i;
            field_1083_d = j;
            field_1082_e = k;
        }
    }

    public void func_723_a(float f)
    {
        if(field_1081_f <= 0.0F)
        {
            field_1065_a.field_164_u.field_932_b = 0.0F;
            field_1065_a.field_179_f.field_1450_i = 0.0F;
        } else
        {
            float f1 = field_1080_g + (field_1081_f - field_1080_g) * f;
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
        func_730_e();
        field_1080_g = field_1081_f;
    }

    private void func_730_e()
    {
        ev ev1 = field_1065_a.field_178_g.field_778_b.func_494_a();
        int i = 0;
        if(ev1 != null)
        {
            i = ev1.field_1617_c;
        }
        if(i != field_1075_l)
        {
            field_1075_l = i;
            field_1076_k.func_847_a(new dz(0, field_1075_l));
        }
    }

    public boolean func_722_a(dm dm1, cn cn1, ev ev1, int i, int j, int k, int l)
    {
        func_730_e();
        field_1076_k.func_847_a(new dofix(ev1 == null ? -1 : ev1.field_1617_c, i, j, k, l));
        return super.func_722_a(dm1, cn1, ev1, i, j, k, l);
    }

    public dm func_721_b(cn cn1)
    {
        return new la(field_1065_a, cn1, field_1065_a.field_176_i, field_1076_k);
    }

    private int field_1084_c;
    private int field_1083_d;
    private int field_1082_e;
    private float field_1081_f;
    private float field_1080_g;
    private float field_1079_h;
    private int field_1078_i;
    private boolean field_1077_j;
    private gy field_1076_k;
    private int field_1075_l;
}
