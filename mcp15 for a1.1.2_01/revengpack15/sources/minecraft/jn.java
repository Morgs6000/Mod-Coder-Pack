// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class jn extends di
{

    public jn(int i, int j)
    {
        super(i);
        field_318_a = j;
    }

    public boolean func_192_a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        if(l != 1)
        {
            return false;
        }
        int i1 = cn1.func_600_a(i, j, k);
        if(i1 == ly.field_446_aB.field_376_bc)
        {
            cn1.func_690_d(i, j + 1, k, field_318_a);
            ev1.field_1615_a--;
            return true;
        } else
        {
            return false;
        }
    }

    private int field_318_a;
}
