// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class dv extends hg
{

    public dv()
    {
        super(12, 0.0F);
        field_1266_d = new ip(0, 0);
        field_1266_d.func_923_a(-4F, -4F, -6F, 8, 8, 6, 0.0F);
        field_1266_d.func_925_a(0.0F, 4F, -8F);
        field_1267_b = new ip(22, 0);
        field_1267_b.func_923_a(-5F, -5F, -4F, 1, 3, 1, 0.0F);
        field_1267_b.func_925_a(0.0F, 3F, -7F);
        field_1269_c = new ip(22, 0);
        field_1269_c.func_923_a(4F, -5F, -4F, 1, 3, 1, 0.0F);
        field_1269_c.func_925_a(0.0F, 3F, -7F);
        field_1268_a = new ip(52, 0);
        field_1268_a.func_923_a(-2F, -3F, 0.0F, 4, 6, 2, 0.0F);
        field_1268_a.func_925_a(0.0F, 14F, 6F);
        field_1268_a.field_1407_d = 1.570796F;
        field_1265_e = new ip(18, 4);
        field_1265_e.func_923_a(-6F, -10F, -7F, 12, 18, 10, 0.0F);
        field_1265_e.func_925_a(0.0F, 5F, 2.0F);
        field_1264_f.field_1410_a--;
        field_1263_g.field_1410_a++;
        field_1264_f.field_1408_c += 0.0F;
        field_1263_g.field_1408_c += 0.0F;
        field_1262_h.field_1410_a--;
        field_1261_i.field_1410_a++;
        field_1262_h.field_1408_c--;
        field_1261_i.field_1408_c--;
    }

    public void func_864_b(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.func_864_b(f, f1, f2, f3, f4, f5);
        field_1267_b.func_922_a(f5);
        field_1269_c.func_922_a(f5);
        field_1268_a.func_922_a(f5);
    }

    public void func_863_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.func_863_a(f, f1, f2, f3, f4, f5);
        field_1267_b.field_1406_e = field_1266_d.field_1406_e;
        field_1267_b.field_1407_d = field_1266_d.field_1407_d;
        field_1269_c.field_1406_e = field_1266_d.field_1406_e;
        field_1269_c.field_1407_d = field_1266_d.field_1407_d;
    }

    ip field_1268_a;
    ip field_1267_b;
    ip field_1269_c;
}
