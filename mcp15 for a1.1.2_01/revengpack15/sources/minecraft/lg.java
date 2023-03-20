// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class lg extends di
{

    protected lg(int i, String s)
    {
        super(i);
        field_316_a = s;
        field_290_aT = 1;
    }

    public boolean func_192_a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        if(cn1.func_600_a(i, j, k) == ly.field_422_aZ.field_376_bc && cn1.func_602_e(i, j, k) == 0)
        {
            cn1.func_691_b(i, j, k, (field_291_aS - di.field_293_aQ.field_291_aS) + 1);
            cn1.func_670_a(field_316_a, i, j, k);
            ev1.field_1615_a--;
            return true;
        } else
        {
            return false;
        }
    }

    private String field_316_a;
}
