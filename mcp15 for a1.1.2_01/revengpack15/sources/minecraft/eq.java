// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class eq extends dn
{

    public eq(fo fo, float f)
    {
        super(fo, f);
    }

    public void func_181_a(mz mz1, double d, double d1, double d2, 
            float f, float f1)
    {
        super.func_171_a(mz1, d, d1, d2, f, f1);
    }

    protected float func_182_a(mz mz1, float f)
    {
        float f1 = mz1.field_756_e + (mz1.field_752_b - mz1.field_756_e) * f;
        float f2 = mz1.field_757_d + (mz1.field_758_c - mz1.field_757_d) * f;
        return (eo.func_1106_a(f1) + 1.0F) * f2;
    }

    protected float func_170_d(ge ge, float f)
    {
        return func_182_a((mz)ge, f);
    }

    public void func_171_a(ge ge, double d, double d1, double d2, 
            float f, float f1)
    {
        func_181_a((mz)ge, d, d1, d2, f, f1);
    }

    public void func_147_a(kh kh, double d, double d1, double d2, 
            float f, float f1)
    {
        func_181_a((mz)kh, d, d1, d2, f, f1);
    }
}
