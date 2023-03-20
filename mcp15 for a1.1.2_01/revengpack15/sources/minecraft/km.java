// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.Random;

public class km extends ly
{

    protected km(int i, ly ly1)
    {
        super(i, ly1.field_378_bb, ly1.field_356_bn);
        field_452_a = ly1;
        func_222_c(ly1.field_374_bd);
        func_219_b(ly1.field_372_be / 3F);
        func_248_a(ly1.field_358_bl);
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
        return 10;
    }

    public boolean func_260_c(nm nm, int i, int j, int k, int l)
    {
        return super.func_260_c(nm, i, j, k, l);
    }

    public void func_230_a(cn cn1, int i, int j, int k, cf cf, ArrayList arraylist)
    {
        int l = cn1.func_602_e(i, j, k);
        if(l == 0)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
            super.func_230_a(cn1, i, j, k, cf, arraylist);
            func_213_a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.func_230_a(cn1, i, j, k, cf, arraylist);
        } else
        if(l == 1)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.func_230_a(cn1, i, j, k, cf, arraylist);
            func_213_a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.func_230_a(cn1, i, j, k, cf, arraylist);
        } else
        if(l == 2)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.func_230_a(cn1, i, j, k, cf, arraylist);
            func_213_a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.func_230_a(cn1, i, j, k, cf, arraylist);
        } else
        if(l == 3)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.func_230_a(cn1, i, j, k, cf, arraylist);
            func_213_a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.func_230_a(cn1, i, j, k, cf, arraylist);
        }
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        if(cn1.field_1026_y)
        {
            return;
        }
        if(cn1.func_599_f(i, j + 1, k).func_878_a())
        {
            cn1.func_690_d(i, j, k, field_452_a.field_376_bc);
        } else
        {
            func_276_h(cn1, i, j, k);
            func_276_h(cn1, i + 1, j - 1, k);
            func_276_h(cn1, i - 1, j - 1, k);
            func_276_h(cn1, i, j - 1, k - 1);
            func_276_h(cn1, i, j - 1, k + 1);
            func_276_h(cn1, i + 1, j + 1, k);
            func_276_h(cn1, i - 1, j + 1, k);
            func_276_h(cn1, i, j + 1, k - 1);
            func_276_h(cn1, i, j + 1, k + 1);
        }
        field_452_a.func_226_a(cn1, i, j, k, l);
    }

    private void func_276_h(cn cn1, int i, int j, int k)
    {
        if(!func_278_j(cn1, i, j, k))
        {
            return;
        }
        byte byte0 = -1;
        if(func_278_j(cn1, i + 1, j + 1, k))
        {
            byte0 = 0;
        }
        if(func_278_j(cn1, i - 1, j + 1, k))
        {
            byte0 = 1;
        }
        if(func_278_j(cn1, i, j + 1, k + 1))
        {
            byte0 = 2;
        }
        if(func_278_j(cn1, i, j + 1, k - 1))
        {
            byte0 = 3;
        }
        if(byte0 < 0)
        {
            if(func_277_i(cn1, i + 1, j, k) && !func_277_i(cn1, i - 1, j, k))
            {
                byte0 = 0;
            }
            if(func_277_i(cn1, i - 1, j, k) && !func_277_i(cn1, i + 1, j, k))
            {
                byte0 = 1;
            }
            if(func_277_i(cn1, i, j, k + 1) && !func_277_i(cn1, i, j, k - 1))
            {
                byte0 = 2;
            }
            if(func_277_i(cn1, i, j, k - 1) && !func_277_i(cn1, i, j, k + 1))
            {
                byte0 = 3;
            }
        }
        if(byte0 < 0)
        {
            if(func_278_j(cn1, i - 1, j - 1, k))
            {
                byte0 = 0;
            }
            if(func_278_j(cn1, i + 1, j - 1, k))
            {
                byte0 = 1;
            }
            if(func_278_j(cn1, i, j - 1, k - 1))
            {
                byte0 = 2;
            }
            if(func_278_j(cn1, i, j - 1, k + 1))
            {
                byte0 = 3;
            }
        }
        if(byte0 >= 0)
        {
            cn1.func_691_b(i, j, k, byte0);
        }
    }

    private boolean func_277_i(cn cn1, int i, int j, int k)
    {
        return cn1.func_599_f(i, j, k).func_878_a();
    }

    private boolean func_278_j(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_600_a(i, j, k);
        if(l == 0)
        {
            return false;
        } else
        {
            return ly.field_345_n[l].func_210_f() == 10;
        }
    }

    public void func_247_b(cn cn1, int i, int j, int k, Random random)
    {
        field_452_a.func_247_b(cn1, i, j, k, random);
    }

    public void func_233_b(cn cn1, int i, int j, int k, dm dm)
    {
        field_452_a.func_233_b(cn1, i, j, k, dm);
    }

    public void func_252_b(cn cn1, int i, int j, int k, int l)
    {
        field_452_a.func_252_b(cn1, i, j, k, l);
    }

    public float func_241_c(nm nm, int i, int j, int k)
    {
        return field_452_a.func_241_c(nm, i, j, k);
    }

    public float func_227_a(kh kh)
    {
        return field_452_a.func_227_a(kh);
    }

    public int func_234_g()
    {
        return field_452_a.func_234_g();
    }

    public int func_240_a(int i, Random random)
    {
        return field_452_a.func_240_a(i, random);
    }

    public int func_229_a(Random random)
    {
        return field_452_a.func_229_a(random);
    }

    public int func_232_a(int i, int j)
    {
        return field_452_a.func_232_a(i, j);
    }

    public int func_218_a(int i)
    {
        return field_452_a.func_218_a(i);
    }

    public int func_211_a(nm nm, int i, int j, int k, int l)
    {
        return field_452_a.func_211_a(nm, i, j, k, l);
    }

    public int func_206_a()
    {
        return field_452_a.func_206_a();
    }

    public cf func_246_f(cn cn1, int i, int j, int k)
    {
        return field_452_a.func_246_f(cn1, i, j, k);
    }

    public void func_257_a(cn cn1, int i, int j, int k, kh kh, aj aj)
    {
        field_452_a.func_257_a(cn1, i, j, k, kh, aj);
    }

    public boolean func_245_h()
    {
        return field_452_a.func_245_h();
    }

    public boolean func_224_a(int i, boolean flag)
    {
        return field_452_a.func_224_a(i, flag);
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        return field_452_a.func_243_a(cn1, i, j, k);
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        func_226_a(cn1, i, j, k, 0);
        field_452_a.func_235_e(cn1, i, j, k);
    }

    public void func_214_b(cn cn1, int i, int j, int k)
    {
        field_452_a.func_214_b(cn1, i, j, k);
    }

    public void func_216_a(cn cn1, int i, int j, int k, int l, float f)
    {
        field_452_a.func_216_a(cn1, i, j, k, l, f);
    }

    public void func_259_b_(cn cn1, int i, int j, int k, int l)
    {
        field_452_a.func_259_b_(cn1, i, j, k, l);
    }

    public void func_254_a(cn cn1, int i, int j, int k, kh kh)
    {
        field_452_a.func_254_a(cn1, i, j, k, kh);
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        field_452_a.func_208_a(cn1, i, j, k, random);
    }

    public boolean func_250_a(cn cn1, int i, int j, int k, dm dm)
    {
        return field_452_a.func_250_a(cn1, i, j, k, dm);
    }

    public void func_239_c(cn cn1, int i, int j, int k)
    {
        field_452_a.func_239_c(cn1, i, j, k);
    }

    private ly field_452_a;
}
