// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class y extends bs
{

    public y(int i, int j)
    {
        super(i, 2, j, field_329_aX);
        field_328_aY = j;
    }

    public boolean func_195_a(ly ly1)
    {
        if(ly1 == ly.field_405_aq)
        {
            return field_328_aY == 3;
        }
        if(ly1 == ly.field_389_ay || ly1 == ly.field_391_ax)
        {
            return field_328_aY >= 2;
        }
        if(ly1 == ly.field_413_ai || ly1 == ly.field_390_H)
        {
            return field_328_aY >= 2;
        }
        if(ly1 == ly.field_412_aj || ly1 == ly.field_388_I)
        {
            return field_328_aY >= 1;
        }
        if(ly1 == ly.field_433_aO || ly1 == ly.field_432_aP)
        {
            return field_328_aY >= 2;
        }
        if(ly1.field_356_bn == gb.field_1334_d)
        {
            return true;
        }
        return ly1.field_356_bn == gb.field_1333_e;
    }

    private static ly field_329_aX[];
    private int field_328_aY;

    static 
    {
        field_329_aX = (new ly[] {
            ly.field_335_x, ly.field_411_ak, ly.field_410_al, ly.field_338_u, ly.field_406_ap, ly.field_388_I, ly.field_412_aj, ly.field_386_J, ly.field_413_ai, ly.field_390_H, 
            ly.field_391_ax, ly.field_389_ay, ly.field_427_aU
        });
    }
}
