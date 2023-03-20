// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class od extends di
{

    public od(int i)
    {
        super(i);
        field_289_aU = 64;
    }

    public boolean func_192_a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        if(l == 0)
        {
            return false;
        }
        if(l == 1)
        {
            return false;
        }
        byte byte0 = 0;
        if(l == 4)
        {
            byte0 = 1;
        }
        if(l == 3)
        {
            byte0 = 2;
        }
        if(l == 5)
        {
            byte0 = 3;
        }
        jc jc1 = new jc(cn1, i, j, k, byte0);
        if(jc1.func_410_i())
        {
            cn1.func_674_a(jc1);
            ev1.field_1615_a--;
        }
        return true;
    }
}
