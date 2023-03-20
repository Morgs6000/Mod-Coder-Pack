// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class jw extends di
{

    public jw(int i)
    {
        super(i);
        field_290_aT = 1;
        field_289_aU = 64;
    }

    public void func_201_b(ev ev1, ge ge)
    {
        if(ge instanceof mv)
        {
            mv mv1 = (mv)ge;
            if(!mv1.field_759_a)
            {
                mv1.field_759_a = true;
                ev1.field_1615_a--;
            }
        }
    }

    public void func_202_a(ev ev1, ge ge)
    {
        func_201_b(ev1, ge);
    }
}
