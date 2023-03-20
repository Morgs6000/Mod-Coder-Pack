// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemArmor extends Item
{

    public ItemArmor(int i, int j, int k, int l)
    {
        super(i);
        field_310_a = j;
        field_313_aX = l;
        field_311_aZ = k;
        field_312_aY = field_315_ba[l];
        maxDmg = field_314_bb[l] * 3 << j;
        maxStackSize = 1;
    }

    private static final int field_315_ba[] = {
        3, 8, 6, 3
    };
    private static final int field_314_bb[] = {
        11, 16, 15, 13
    };
    public final int field_310_a;
    public final int field_313_aX;
    public final int field_312_aY;
    public final int field_311_aZ;

}
