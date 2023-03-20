// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class hh extends fo
{

    public hh(int i)
    {
        field_1258_a = new ip(0, i);
        field_1258_a.func_921_a(-4F, 16F, -4F, 8, 8, 8);
        if(i > 0)
        {
            field_1258_a = new ip(0, i);
            field_1258_a.func_921_a(-3F, 17F, -3F, 6, 6, 6);
            field_1257_b = new ip(32, 0);
            field_1257_b.func_921_a(-3.25F, 18F, -3.5F, 2, 2, 2);
            field_1260_c = new ip(32, 4);
            field_1260_c.func_921_a(1.25F, 18F, -3.5F, 2, 2, 2);
            field_1259_d = new ip(32, 8);
            field_1259_d.func_921_a(0.0F, 21F, -3.5F, 1, 1, 1);
        }
    }

    public void func_863_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public void func_864_b(float f, float f1, float f2, float f3, float f4, float f5)
    {
        func_863_a(f, f1, f2, f3, f4, f5);
        field_1258_a.func_922_a(f5);
        if(field_1257_b != null)
        {
            field_1257_b.func_922_a(f5);
            field_1260_c.func_922_a(f5);
            field_1259_d.func_922_a(f5);
        }
    }

    ip field_1258_a;
    ip field_1257_b;
    ip field_1260_c;
    ip field_1259_d;
}
