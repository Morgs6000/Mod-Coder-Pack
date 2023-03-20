// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public final class ev
{

    public ev(ly ly1)
    {
        this(ly1, 1);
    }

    public ev(ly ly1, int i)
    {
        this(ly1.field_376_bc, i);
    }

    public ev(di di1)
    {
        this(di1, 1);
    }

    public ev(di di1, int i)
    {
        this(di1.field_291_aS, i);
    }

    public ev(int i)
    {
        this(i, 1);
    }

    public ev(int i, int j)
    {
        field_1615_a = 0;
        field_1617_c = i;
        field_1615_a = j;
    }

    public ev(int i, int j, int k)
    {
        field_1615_a = 0;
        field_1617_c = i;
        field_1615_a = j;
        field_1616_d = k;
    }

    public ev(hm hm1)
    {
        field_1615_a = 0;
        func_1096_b(hm1);
    }

    public ev func_1085_a(int i)
    {
        field_1615_a -= i;
        return new ev(field_1617_c, i, field_1616_d);
    }

    public di func_1091_a()
    {
        return di.field_233_c[field_1617_c];
    }

    public int func_1088_b()
    {
        return func_1091_a().func_196_a(this);
    }

    public boolean func_1090_a(dm dm, cn cn, int i, int j, int k, int l)
    {
        return func_1091_a().func_192_a(this, dm, cn, i, j, k, l);
    }

    public float func_1098_a(ly ly1)
    {
        return func_1091_a().func_204_a(this, ly1);
    }

    public ev func_1093_a(cn cn, dm dm)
    {
        return func_1091_a().func_193_a(this, cn, dm);
    }

    public hm func_1086_a(hm hm1)
    {
        hm1.func_749_a("id", (short)field_1617_c);
        hm1.func_761_a("Count", (byte)field_1615_a);
        hm1.func_749_a("Damage", (short)field_1616_d);
        return hm1;
    }

    public void func_1096_b(hm hm1)
    {
        field_1617_c = hm1.func_745_d("id");
        field_1615_a = hm1.func_746_c("Count");
        field_1616_d = hm1.func_745_d("Damage");
    }

    public int func_1089_c()
    {
        return func_1091_a().func_200_b();
    }

    public int func_1094_d()
    {
        return di.field_233_c[field_1617_c].func_197_c();
    }

    public void func_1101_b(int i)
    {
        field_1616_d += i;
        if(field_1616_d > func_1094_d())
        {
            field_1615_a--;
            if(field_1615_a < 0)
            {
                field_1615_a = 0;
            }
            field_1616_d = 0;
        }
    }

    public void func_1092_a(ge ge)
    {
        di.field_233_c[field_1617_c].func_202_a(this, ge);
    }

    public void func_1087_a(int i, int j, int k, int l)
    {
        di.field_233_c[field_1617_c].func_203_a(this, i, j, k, l);
    }

    public int func_1095_a(kh kh)
    {
        return di.field_233_c[field_1617_c].func_198_a(kh);
    }

    public boolean func_1099_b(ly ly1)
    {
        return di.field_233_c[field_1617_c].func_195_a(ly1);
    }

    public void func_1097_a(dm dm)
    {
    }

    public void func_1100_b(ge ge)
    {
        di.field_233_c[field_1617_c].func_201_b(this, ge);
    }

    public ev func_1102_e()
    {
        return new ev(field_1617_c, field_1615_a, field_1616_d);
    }

    public int field_1615_a;
    public int field_1614_b;
    public int field_1617_c;
    public int field_1616_d;
}
