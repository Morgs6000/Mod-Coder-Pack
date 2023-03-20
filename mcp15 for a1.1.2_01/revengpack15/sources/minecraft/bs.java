// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class bs extends di
{

    public bs(int i, int j, int k, ly aly[])
    {
        super(i);
        field_324_aY = 4F;
        field_322_a = k;
        field_325_aX = aly;
        field_290_aT = 1;
        field_289_aU = 32 << k;
        if(k == 3)
        {
            field_289_aU *= 4;
        }
        field_324_aY = (k + 1) * 2;
        field_323_aZ = j + k;
    }

    public float func_204_a(ev ev1, ly ly)
    {
        for(int i = 0; i < field_325_aX.length; i++)
        {
            if(field_325_aX[i] == ly)
            {
                return field_324_aY;
            }
        }

        return 1.0F;
    }

    public void func_202_a(ev ev1, ge ge)
    {
        ev1.func_1101_b(2);
    }

    public void func_203_a(ev ev1, int i, int j, int k, int l)
    {
        ev1.func_1101_b(1);
    }

    public int func_198_a(kh kh)
    {
        return field_323_aZ;
    }

    public boolean func_194_a()
    {
        return true;
    }

    private ly field_325_aX[];
    private float field_324_aY;
    private int field_323_aZ;
    protected int field_322_a;
}
