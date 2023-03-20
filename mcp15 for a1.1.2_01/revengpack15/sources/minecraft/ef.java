// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ef extends di
{

    public ef(int i)
    {
        super(i);
    }

    public boolean func_192_a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        if(l == 0)
        {
            j--;
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
        if(cn1.func_600_a(i, j, k) != 0)
        {
            return false;
        }
        if(ly.field_394_aw.func_243_a(cn1, i, j, k))
        {
            ev1.field_1615_a--;
            cn1.func_690_d(i, j, k, ly.field_394_aw.field_376_bc);
        }
        return true;
    }
}
