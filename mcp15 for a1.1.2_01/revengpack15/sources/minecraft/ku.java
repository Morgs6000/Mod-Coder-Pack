// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class ku extends jt
{

    protected ku(int i, boolean flag)
    {
        super(i, gb.field_1334_d);
        field_456_a = flag;
        field_378_bb = 45;
    }

    public int func_240_a(int i, Random random)
    {
        return ly.field_445_aC.field_376_bc;
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        super.func_235_e(cn1, i, j, k);
        func_284_h(cn1, i, j, k);
    }

    private void func_284_h(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_600_a(i, j, k - 1);
        int i1 = cn1.func_600_a(i, j, k + 1);
        int j1 = cn1.func_600_a(i - 1, j, k);
        int k1 = cn1.func_600_a(i + 1, j, k);
        byte byte0 = 3;
        if(ly.field_343_p[l] && !ly.field_343_p[i1])
        {
            byte0 = 3;
        }
        if(ly.field_343_p[i1] && !ly.field_343_p[l])
        {
            byte0 = 2;
        }
        if(ly.field_343_p[j1] && !ly.field_343_p[k1])
        {
            byte0 = 5;
        }
        if(ly.field_343_p[k1] && !ly.field_343_p[j1])
        {
            byte0 = 4;
        }
        cn1.func_691_b(i, j, k, byte0);
    }

    public int func_211_a(nm nm1, int i, int j, int k, int l)
    {
        if(l == 1)
        {
            return ly.field_338_u.field_378_bb;
        }
        if(l == 0)
        {
            return ly.field_338_u.field_378_bb;
        }
        int i1 = nm1.func_602_e(i, j, k);
        if(l != i1)
        {
            return field_378_bb;
        }
        if(field_456_a)
        {
            return field_378_bb + 16;
        } else
        {
            return field_378_bb - 1;
        }
    }

    public void func_247_b(cn cn1, int i, int j, int k, Random random)
    {
        if(!field_456_a)
        {
            return;
        }
        int l = cn1.func_602_e(i, j, k);
        float f = (float)i + 0.5F;
        float f1 = (float)j + 0.0F + (random.nextFloat() * 6F) / 16F;
        float f2 = (float)k + 0.5F;
        float f3 = 0.52F;
        float f4 = random.nextFloat() * 0.6F - 0.3F;
        if(l == 4)
        {
            cn1.func_694_a("smoke", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
            cn1.func_694_a("flame", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 5)
        {
            cn1.func_694_a("smoke", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
            cn1.func_694_a("flame", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 2)
        {
            cn1.func_694_a("smoke", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
            cn1.func_694_a("flame", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 3)
        {
            cn1.func_694_a("smoke", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
            cn1.func_694_a("flame", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
        }
    }

    public int func_218_a(int i)
    {
        if(i == 1)
        {
            return ly.field_338_u.field_376_bc;
        }
        if(i == 0)
        {
            return ly.field_338_u.field_376_bc;
        }
        if(i == 3)
        {
            return field_378_bb - 1;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_250_a(cn cn1, int i, int j, int k, dm dm1)
    {
        ke ke1 = (ke)cn1.func_603_b(i, j, k);
        dm1.func_453_a(ke1);
        return true;
    }

    public static void func_285_a(boolean flag, cn cn1, int i, int j, int k)
    {
        int l = cn1.func_602_e(i, j, k);
        ic ic = cn1.func_603_b(i, j, k);
        if(flag)
        {
            cn1.func_690_d(i, j, k, ly.field_444_aD.field_376_bc);
        } else
        {
            cn1.func_690_d(i, j, k, ly.field_445_aC.field_376_bc);
        }
        cn1.func_691_b(i, j, k, l);
        cn1.func_654_a(i, j, k, ic);
    }

    protected ic func_283_a_()
    {
        return new ke();
    }

    private final boolean field_456_a;
}
