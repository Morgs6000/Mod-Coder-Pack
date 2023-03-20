// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ec extends di
{

    public ec(int i, gb gb1)
    {
        super(i);
        field_321_a = gb1;
        field_289_aU = 64;
        field_290_aT = 1;
    }

    public boolean func_192_a(ev ev1, dm dm1, cn cn1, int i, int j, int k, int l)
    {
        if(l != 1)
        {
            return false;
        }
        j++;
        ly ly1;
        if(field_321_a == gb.field_1335_c)
        {
            ly1 = ly.field_442_aF;
        } else
        {
            ly1 = ly.field_435_aM;
        }
        if(!ly1.func_243_a(cn1, i, j, k))
        {
            return false;
        }
        int i1 = eo.b((double)(((dm1.field_605_aq + 180F) * 4F) / 360F) - 0.5D) & 3;
        byte byte0 = 0;
        byte byte1 = 0;
        if(i1 == 0)
        {
            byte1 = 1;
        }
        if(i1 == 1)
        {
            byte0 = -1;
        }
        if(i1 == 2)
        {
            byte1 = -1;
        }
        if(i1 == 3)
        {
            byte0 = 1;
        }
        int j1 = (cn1.func_601_g(i - byte0, j, k - byte1) ? 1 : 0) + (cn1.func_601_g(i - byte0, j + 1, k - byte1) ? 1 : 0);
        int k1 = (cn1.func_601_g(i + byte0, j, k + byte1) ? 1 : 0) + (cn1.func_601_g(i + byte0, j + 1, k + byte1) ? 1 : 0);
        boolean flag = cn1.func_600_a(i - byte0, j, k - byte1) == ly1.field_376_bc || cn1.func_600_a(i - byte0, j + 1, k - byte1) == ly1.field_376_bc;
        boolean flag1 = cn1.func_600_a(i + byte0, j, k + byte1) == ly1.field_376_bc || cn1.func_600_a(i + byte0, j + 1, k + byte1) == ly1.field_376_bc;
        boolean flag2 = false;
        if(flag && !flag1)
        {
            flag2 = true;
        } else
        if(k1 > j1)
        {
            flag2 = true;
        }
        if(flag2)
        {
            i1 = i1 - 1 & 3;
            i1 += 4;
        }
        cn1.func_690_d(i, j, k, ly1.field_376_bc);
        cn1.func_691_b(i, j, k, i1);
        cn1.func_690_d(i, j + 1, k, ly1.field_376_bc);
        cn1.func_691_b(i, j + 1, k, i1 + 8);
        ev1.field_1615_a--;
        return true;
    }

    private gb field_321_a;
}
