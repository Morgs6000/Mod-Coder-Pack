// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;

public class hq
{

    public hq(Minecraft minecraft)
    {
        field_1064_b = false;
        field_1065_a = minecraft;
    }

    public void func_717_a(cn cn1)
    {
    }

    public void func_719_a(int i, int j, int k, int l)
    {
        func_729_b(i, j, k, l);
    }

    public boolean func_729_b(int i, int j, int k, int l)
    {
        field_1065_a.field_177_h.func_1186_a(i, j, k);
        cn cn1 = field_1065_a.field_180_e;
        ly ly1 = ly.field_345_n[cn1.func_600_a(i, j, k)];
        int i1 = cn1.func_602_e(i, j, k);
        boolean flag = cn1.func_690_d(i, j, k, 0);
        if(ly1 != null && flag)
        {
            field_1065_a.field_158_A.func_336_b(ly1.field_358_bl.func_1146_a(), (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, (ly1.field_358_bl.func_1147_b() + 1.0F) / 2.0F, ly1.field_358_bl.func_1144_c() * 0.8F);
            ly1.func_252_b(cn1, i, j, k, i1);
        }
        return flag;
    }

    public void func_726_c(int i, int j, int k, int l)
    {
    }

    public void func_724_a()
    {
    }

    public void func_723_a(float f)
    {
    }

    public float func_727_b()
    {
        return 5F;
    }

    public void func_720_a(dm dm)
    {
    }

    public void func_728_c()
    {
    }

    public boolean func_725_d()
    {
        return true;
    }

    public void func_718_b(dm dm)
    {
    }

    public boolean func_722_a(dm dm, cn cn1, ev ev1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_600_a(i, j, k);
        if(i1 > 0 && ly.field_345_n[i1].func_250_a(cn1, i, j, k, dm))
        {
            return true;
        }
        if(ev1 == null)
        {
            return false;
        } else
        {
            return ev1.func_1090_a(dm, cn1, i, j, k, l);
        }
    }

    public dm func_721_b(cn cn1)
    {
        return new bi(field_1065_a, cn1, field_1065_a.field_176_i);
    }

    protected final Minecraft field_1065_a;
    public boolean field_1064_b;
}
