// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class jo extends di
{

    public jo(int i, int j)
    {
        super(i);
        field_290_aT = 1;
        field_317_a = j;
    }

    public boolean func_192_a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_600_a(i, j, k);
        if(i1 == ly.field_440_aH.field_376_bc)
        {
            cn1.func_674_a(new oc(cn1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, field_317_a));
            ev1.field_1615_a--;
            return true;
        } else
        {
            return false;
        }
    }

    public int field_317_a;
}
