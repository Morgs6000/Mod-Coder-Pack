// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class iu extends di
{

    public iu(int i, int j)
    {
        super(i);
        field_290_aT = 1;
        field_289_aU = 32 << j;
        if(j == 3)
        {
            field_289_aU *= 4;
        }
        field_319_a = 4 + j * 2;
    }

    public float func_204_a(ev ev1, ly ly)
    {
        return 1.5F;
    }

    public void func_202_a(ev ev1, ge ge)
    {
        ev1.func_1101_b(1);
    }

    public void func_203_a(ev ev1, int i, int j, int k, int l)
    {
        ev1.func_1101_b(2);
    }

    public int func_198_a(kh kh)
    {
        return field_319_a;
    }

    public boolean func_194_a()
    {
        return true;
    }

    private int field_319_a;
}
