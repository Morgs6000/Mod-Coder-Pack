// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class lj extends mm
{

    lj(lo lo1, ee ee, gh gh, int i, int j, int k, int l)
    {
        super(ee, gh, i, j, k);
        field_1123_d = lo1;
        field_1124_c = l;
    }

    public boolean func_780_a(ev ev1)
    {
        if(ev1.func_1091_a() instanceof mr)
        {
            return ((mr)ev1.func_1091_a()).field_313_aX == field_1124_c;
        } else
        {
            return false;
        }
    }

    public int func_775_c()
    {
        return 15 + field_1124_c * 16;
    }

    final int field_1124_c; /* synthetic field */
    final lo field_1123_d; /* synthetic field */
}
