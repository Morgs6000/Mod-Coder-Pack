// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ModelQuadraped extends ModelBase
{

    public ModelQuadraped(int i, float f)
    {
        field_1266_d = new ModelRenderer(0, 0);
        field_1266_d.func_923_a(-4F, -4F, -8F, 8, 8, 8, f);
        field_1266_d.func_925_a(0.0F, 18 - i, -6F);
        field_1265_e = new ModelRenderer(28, 8);
        field_1265_e.func_923_a(-5F, -10F, -7F, 10, 16, 8, f);
        field_1265_e.func_925_a(0.0F, 17 - i, 2.0F);
        field_1264_f = new ModelRenderer(0, 16);
        field_1264_f.func_923_a(-2F, 0.0F, -2F, 4, i, 4, f);
        field_1264_f.func_925_a(-3F, 24 - i, 7F);
        field_1263_g = new ModelRenderer(0, 16);
        field_1263_g.func_923_a(-2F, 0.0F, -2F, 4, i, 4, f);
        field_1263_g.func_925_a(3F, 24 - i, 7F);
        field_1262_h = new ModelRenderer(0, 16);
        field_1262_h.func_923_a(-2F, 0.0F, -2F, 4, i, 4, f);
        field_1262_h.func_925_a(-3F, 24 - i, -5F);
        field_1261_i = new ModelRenderer(0, 16);
        field_1261_i.func_923_a(-2F, 0.0F, -2F, 4, i, 4, f);
        field_1261_i.func_925_a(3F, 24 - i, -5F);
    }

    public void func_864_b(float f, float f1, float f2, float f3, float f4, float f5)
    {
        func_863_a(f, f1, f2, f3, f4, f5);
        field_1266_d.func_922_a(f5);
        field_1265_e.func_922_a(f5);
        field_1264_f.func_922_a(f5);
        field_1263_g.func_922_a(f5);
        field_1262_h.func_922_a(f5);
        field_1261_i.func_922_a(f5);
    }

    public void func_863_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
        field_1266_d.field_1407_d = -(f4 / 57.29578F);
        field_1266_d.field_1406_e = f3 / 57.29578F;
        field_1265_e.field_1407_d = 1.570796F;
        field_1264_f.field_1407_d = MathHelper.func_1114_b(f * 0.6662F) * 1.4F * f1;
        field_1263_g.field_1407_d = MathHelper.func_1114_b(f * 0.6662F + 3.141593F) * 1.4F * f1;
        field_1262_h.field_1407_d = MathHelper.func_1114_b(f * 0.6662F + 3.141593F) * 1.4F * f1;
        field_1261_i.field_1407_d = MathHelper.func_1114_b(f * 0.6662F) * 1.4F * f1;
    }

    public ModelRenderer field_1266_d;
    public ModelRenderer field_1265_e;
    public ModelRenderer field_1264_f;
    public ModelRenderer field_1263_g;
    public ModelRenderer field_1262_h;
    public ModelRenderer field_1261_i;
}
