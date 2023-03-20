// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class fw extends ly
{

    protected fw(int i, gb gb1)
    {
        super(i, gb1);
        field_378_bb = 97;
        if(gb1 == gb.field_1333_e)
        {
            field_378_bb++;
        }
        float f = 0.5F;
        float f1 = 1.0F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    public int func_232_a(int i, int j)
    {
        if(i == 0 || i == 1)
        {
            return field_378_bb;
        }
        int k = func_312_c(j);
        if((k == 0 || k == 2) ^ (i <= 3))
        {
            return field_378_bb;
        }
        int l = k / 2 + (i & 1 ^ k);
        l += (j & 4) / 4;
        int i1 = field_378_bb - (j & 8) * 2;
        if((l & 1) != 0)
        {
            i1 = -i1;
        }
        return i1;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 7;
    }

    public cf func_246_f(cn cn1, int i, int j, int k)
    {
        func_238_a(cn1, i, j, k);
        return super.func_246_f(cn1, i, j, k);
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        func_238_a(cn1, i, j, k);
        return super.func_221_d(cn1, i, j, k);
    }

    public void func_238_a(nm nm1, int i, int j, int k)
    {
        func_313_b(func_312_c(nm1.func_602_e(i, j, k)));
    }

    public void func_313_b(int i)
    {
        float f = 0.1875F;
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        if(i == 0)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        }
        if(i == 1)
        {
            func_213_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        if(i == 2)
        {
            func_213_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        }
        if(i == 3)
        {
            func_213_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        }
    }

    public void func_233_b(cn cn1, int i, int j, int k, dm dm)
    {
        func_250_a(cn1, i, j, k, dm);
    }

    public boolean func_250_a(cn cn1, int i, int j, int k, dm dm)
    {
        if(field_356_bn == gb.field_1333_e)
        {
            return true;
        }
        int l = cn1.func_602_e(i, j, k);
        if((l & 8) != 0)
        {
            if(cn1.func_600_a(i, j - 1, k) == field_376_bc)
            {
                func_250_a(cn1, i, j - 1, k, dm);
            }
            return true;
        }
        if(cn1.func_600_a(i, j + 1, k) == field_376_bc)
        {
            cn1.func_691_b(i, j + 1, k, (l ^ 4) + 8);
        }
        cn1.func_691_b(i, j, k, l ^ 4);
        cn1.func_701_b(i, j - 1, k, i, j, k);
        if(Math.random() < 0.5D)
        {
            cn1.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.door_open", 1.0F, cn1.field_1037_n.nextFloat() * 0.1F + 0.9F);
        } else
        {
            cn1.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.door_close", 1.0F, cn1.field_1037_n.nextFloat() * 0.1F + 0.9F);
        }
        return true;
    }

    public void func_311_a(cn cn1, int i, int j, int k, boolean flag)
    {
        int l = cn1.func_602_e(i, j, k);
        if((l & 8) != 0)
        {
            if(cn1.func_600_a(i, j - 1, k) == field_376_bc)
            {
                func_311_a(cn1, i, j - 1, k, flag);
            }
            return;
        }
        boolean flag1 = (cn1.func_602_e(i, j, k) & 4) > 0;
        if(flag1 == flag)
        {
            return;
        }
        if(cn1.func_600_a(i, j + 1, k) == field_376_bc)
        {
            cn1.func_691_b(i, j + 1, k, (l ^ 4) + 8);
        }
        cn1.func_691_b(i, j, k, l ^ 4);
        cn1.func_701_b(i, j - 1, k, i, j, k);
        if(Math.random() < 0.5D)
        {
            cn1.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.door_open", 1.0F, cn1.field_1037_n.nextFloat() * 0.1F + 0.9F);
        } else
        {
            cn1.func_684_a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.door_close", 1.0F, cn1.field_1037_n.nextFloat() * 0.1F + 0.9F);
        }
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_602_e(i, j, k);
        if((i1 & 8) != 0)
        {
            if(cn1.func_600_a(i, j - 1, k) != field_376_bc)
            {
                cn1.func_690_d(i, j, k, 0);
            }
            if(l > 0 && ly.field_345_n[l].func_209_d())
            {
                func_226_a(cn1, i, j - 1, k, l);
            }
        } else
        {
            boolean flag = false;
            if(cn1.func_600_a(i, j + 1, k) != field_376_bc)
            {
                cn1.func_690_d(i, j, k, 0);
                flag = true;
            }
            if(!cn1.func_601_g(i, j - 1, k))
            {
                cn1.func_690_d(i, j, k, 0);
                flag = true;
                if(cn1.func_600_a(i, j + 1, k) == field_376_bc)
                {
                    cn1.func_690_d(i, j + 1, k, 0);
                }
            }
            if(flag)
            {
                func_259_b_(cn1, i, j, k, i1);
            } else
            if(l > 0 && ly.field_345_n[l].func_209_d())
            {
                boolean flag1 = cn1.func_625_o(i, j, k) || cn1.func_625_o(i, j + 1, k);
                func_311_a(cn1, i, j, k, flag1);
            }
        }
    }

    public int func_240_a(int i, Random random)
    {
        if((i & 8) != 0)
        {
            return 0;
        }
        if(field_356_bn == gb.field_1333_e)
        {
            return di.field_252_az.field_291_aS;
        } else
        {
            return di.field_265_at.field_291_aS;
        }
    }

    public mf func_255_a(cn cn1, int i, int j, int k, aj aj, aj aj1)
    {
        func_238_a(cn1, i, j, k);
        return super.func_255_a(cn1, i, j, k, aj, aj1);
    }

    public int func_312_c(int i)
    {
        if((i & 4) == 0)
        {
            return i - 1 & 3;
        } else
        {
            return i & 3;
        }
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        if(j >= 127)
        {
            return false;
        } else
        {
            return cn1.func_601_g(i, j - 1, k) && super.func_243_a(cn1, i, j, k) && super.func_243_a(cn1, i, j + 1, k);
        }
    }
}
