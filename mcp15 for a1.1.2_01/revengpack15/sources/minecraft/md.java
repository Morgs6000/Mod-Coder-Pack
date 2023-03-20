// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class md extends di
{

    public md(int i)
    {
        super(i);
        field_289_aU = 64;
        field_290_aT = 1;
    }

    public boolean func_192_a(ev ev1, dm dm1, cn cn1, int i, int j, int k, int l)
    {
        if(l == 0)
        {
            return false;
        }
        if(!cn1.func_599_f(i, j, k).func_878_a())
        {
            return false;
        }
        if(l == 1)
        {
            j++;
        }
        if(l == 2)
        {
            k--;
        }
        if(l == 3)
        {
            k++;
        }
        if(l == 4)
        {
            i--;
        }
        if(l == 5)
        {
            i++;
        }
        if(!ly.field_443_aE.func_243_a(cn1, i, j, k))
        {
            return false;
        }
        if(l == 1)
        {
            cn1.func_688_b(i, j, k, ly.field_443_aE.field_376_bc, eo.b((double)(((dm1.field_605_aq + 180F) * 16F) / 360F) + 0.5D) & 0xf);
        } else
        {
            cn1.func_688_b(i, j, k, ly.field_438_aJ.field_376_bc, l);
        }
        ev1.field_1615_a--;
        dm1.func_455_a((ob)cn1.func_603_b(i, j, k));
        return true;
    }
}
