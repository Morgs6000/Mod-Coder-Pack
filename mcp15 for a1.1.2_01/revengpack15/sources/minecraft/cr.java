// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class cr extends fo
{

    public cr()
    {
        this(0.0F);
    }

    public cr(float f)
    {
        this(f, 0.0F);
    }

    public cr(float f, float f1)
    {
        field_1279_h = false;
        field_1278_i = false;
        field_1277_j = false;
        field_1286_a = new ip(0, 0);
        field_1286_a.func_923_a(-4F, -8F, -4F, 8, 8, 8, f);
        field_1286_a.func_925_a(0.0F, 0.0F + f1, 0.0F);
        field_1285_b = new ip(32, 0);
        field_1285_b.func_923_a(-4F, -8F, -4F, 8, 8, 8, f + 0.5F);
        field_1285_b.func_925_a(0.0F, 0.0F + f1, 0.0F);
        field_1284_c = new ip(16, 16);
        field_1284_c.func_923_a(-4F, 0.0F, -2F, 8, 12, 4, f);
        field_1284_c.func_925_a(0.0F, 0.0F + f1, 0.0F);
        field_1283_d = new ip(40, 16);
        field_1283_d.func_923_a(-3F, -2F, -2F, 4, 12, 4, f);
        field_1283_d.func_925_a(-5F, 2.0F + f1, 0.0F);
        field_1282_e = new ip(40, 16);
        field_1282_e.field_1404_g = true;
        field_1282_e.func_923_a(-1F, -2F, -2F, 4, 12, 4, f);
        field_1282_e.func_925_a(5F, 2.0F + f1, 0.0F);
        field_1281_f = new ip(0, 16);
        field_1281_f.func_923_a(-2F, 0.0F, -2F, 4, 12, 4, f);
        field_1281_f.func_925_a(-2F, 12F + f1, 0.0F);
        field_1280_g = new ip(0, 16);
        field_1280_g.field_1404_g = true;
        field_1280_g.func_923_a(-2F, 0.0F, -2F, 4, 12, 4, f);
        field_1280_g.func_925_a(2.0F, 12F + f1, 0.0F);
    }

    public void func_864_b(float f, float f1, float f2, float f3, float f4, float f5)
    {
        func_863_a(f, f1, f2, f3, f4, f5);
        field_1286_a.func_922_a(f5);
        field_1284_c.func_922_a(f5);
        field_1283_d.func_922_a(f5);
        field_1282_e.func_922_a(f5);
        field_1281_f.func_922_a(f5);
        field_1280_g.func_922_a(f5);
        field_1285_b.func_922_a(f5);
    }

    public void func_863_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
        field_1286_a.field_1406_e = f3 / 57.29578F;
        field_1286_a.field_1407_d = f4 / 57.29578F;
        field_1285_b.field_1406_e = field_1286_a.field_1406_e;
        field_1285_b.field_1407_d = field_1286_a.field_1407_d;
        field_1283_d.field_1407_d = eo.func_1114_b(f * 0.6662F + 3.141593F) * 2.0F * f1 * 0.5F;
        field_1282_e.field_1407_d = eo.func_1114_b(f * 0.6662F) * 2.0F * f1 * 0.5F;
        field_1283_d.field_1405_f = 0.0F;
        field_1282_e.field_1405_f = 0.0F;
        field_1281_f.field_1407_d = eo.func_1114_b(f * 0.6662F) * 1.4F * f1;
        field_1280_g.field_1407_d = eo.func_1114_b(f * 0.6662F + 3.141593F) * 1.4F * f1;
        field_1281_f.field_1406_e = 0.0F;
        field_1280_g.field_1406_e = 0.0F;
        if(field_1243_l)
        {
            field_1283_d.field_1407_d += -0.6283185F;
            field_1282_e.field_1407_d += -0.6283185F;
            field_1281_f.field_1407_d = -1.256637F;
            field_1280_g.field_1407_d = -1.256637F;
            field_1281_f.field_1406_e = 0.3141593F;
            field_1280_g.field_1406_e = -0.3141593F;
        }
        if(field_1279_h)
        {
            field_1282_e.field_1407_d = field_1282_e.field_1407_d * 0.5F - 0.3141593F;
        }
        if(field_1278_i)
        {
            field_1283_d.field_1407_d = field_1283_d.field_1407_d * 0.5F - 0.3141593F;
        }
        field_1283_d.field_1406_e = 0.0F;
        field_1282_e.field_1406_e = 0.0F;
        if(field_1244_k > -9990F)
        {
            float f6 = field_1244_k;
            field_1284_c.field_1406_e = eo.func_1106_a(eo.func_1113_c(f6) * 3.141593F * 2.0F) * 0.2F;
            field_1283_d.field_1408_c = eo.func_1106_a(field_1284_c.field_1406_e) * 5F;
            field_1283_d.field_1410_a = -eo.func_1114_b(field_1284_c.field_1406_e) * 5F;
            field_1282_e.field_1408_c = -eo.func_1106_a(field_1284_c.field_1406_e) * 5F;
            field_1282_e.field_1410_a = eo.func_1114_b(field_1284_c.field_1406_e) * 5F;
            field_1283_d.field_1406_e += field_1284_c.field_1406_e;
            field_1282_e.field_1406_e += field_1284_c.field_1406_e;
            field_1282_e.field_1407_d += field_1284_c.field_1406_e;
            f6 = 1.0F - field_1244_k;
            f6 *= f6;
            f6 *= f6;
            f6 = 1.0F - f6;
            float f7 = eo.func_1106_a(f6 * 3.141593F);
            float f8 = eo.func_1106_a(field_1244_k * 3.141593F) * -(field_1286_a.field_1407_d - 0.7F) * 0.75F;
            field_1283_d.field_1407_d -= (double)f7 * 1.2D + (double)f8;
            field_1283_d.field_1406_e += field_1284_c.field_1406_e * 2.0F;
            field_1283_d.field_1405_f = eo.func_1106_a(field_1244_k * 3.141593F) * -0.4F;
        }
        if(field_1277_j)
        {
            field_1284_c.field_1407_d = 0.5F;
            field_1281_f.field_1407_d -= 0.0F;
            field_1280_g.field_1407_d -= 0.0F;
            field_1283_d.field_1407_d += 0.4F;
            field_1282_e.field_1407_d += 0.4F;
            field_1281_f.field_1408_c = 4F;
            field_1280_g.field_1408_c = 4F;
            field_1281_f.field_1409_b = 9F;
            field_1280_g.field_1409_b = 9F;
            field_1286_a.field_1409_b = 1.0F;
        } else
        {
            field_1284_c.field_1407_d = 0.0F;
            field_1281_f.field_1408_c = 0.0F;
            field_1280_g.field_1408_c = 0.0F;
            field_1281_f.field_1409_b = 12F;
            field_1280_g.field_1409_b = 12F;
            field_1286_a.field_1409_b = 0.0F;
        }
        field_1283_d.field_1405_f += eo.func_1114_b(f2 * 0.09F) * 0.05F + 0.05F;
        field_1282_e.field_1405_f -= eo.func_1114_b(f2 * 0.09F) * 0.05F + 0.05F;
        field_1283_d.field_1407_d += eo.func_1106_a(f2 * 0.067F) * 0.05F;
        field_1282_e.field_1407_d -= eo.func_1106_a(f2 * 0.067F) * 0.05F;
    }

    public ip field_1286_a;
    public ip field_1285_b;
    public ip field_1284_c;
    public ip field_1283_d;
    public ip field_1282_e;
    public ip field_1281_f;
    public ip field_1280_g;
    public boolean field_1279_h;
    public boolean field_1278_i;
    public boolean field_1277_j;
}
