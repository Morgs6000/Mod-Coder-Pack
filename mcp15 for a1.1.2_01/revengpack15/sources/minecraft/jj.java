// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.image.BufferedImage;

public class jj
{

    public jj(cn cn, int i, int j)
    {
        field_1352_e = false;
        field_1351_f = false;
        field_1350_g = 0;
        field_1349_h = false;
        field_1347_b = cn;
        func_889_a(i, j);
    }

    public void func_889_a(int i, int j)
    {
        field_1352_e = false;
        field_1354_c = i;
        field_1353_d = j;
        field_1350_g = 0;
        field_1349_h = false;
    }

    public void func_888_a(cn cn, int i, int j)
    {
        field_1347_b = cn;
        func_889_a(i, j);
    }

    public BufferedImage field_1348_a;
    public cn field_1347_b;
    public int field_1354_c;
    public int field_1353_d;
    public boolean field_1352_e;
    public boolean field_1351_f;
    public int field_1350_g;
    public boolean field_1349_h;
}