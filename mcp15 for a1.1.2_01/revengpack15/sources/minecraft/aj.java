// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.List;

public class aj
{

    public static aj func_1260_a(double d, double d1, double d2)
    {
        return new aj(d, d1, d2);
    }

    public static void func_1259_a()
    {
        field_1777_e = 0;
    }

    public static aj func_1248_b(double d, double d1, double d2)
    {
        if(field_1777_e >= field_1778_d.size())
        {
            field_1778_d.add(func_1260_a(0.0D, 0.0D, 0.0D));
        }
        return ((aj)field_1778_d.get(field_1777_e++)).func_1254_e(d, d1, d2);
    }

    private aj(double d, double d1, double d2)
    {
        if(d == -0D)
        {
            d = 0.0D;
        }
        if(d1 == -0D)
        {
            d1 = 0.0D;
        }
        if(d2 == -0D)
        {
            d2 = 0.0D;
        }
        field_1776_a = d;
        field_1775_b = d1;
        field_1779_c = d2;
    }

    private aj func_1254_e(double d, double d1, double d2)
    {
        field_1776_a = d;
        field_1775_b = d1;
        field_1779_c = d2;
        return this;
    }

    public aj func_1262_a(aj aj1)
    {
        return func_1248_b(aj1.field_1776_a - field_1776_a, aj1.field_1775_b - field_1775_b, aj1.field_1779_c - field_1779_c);
    }

    public aj func_1252_b()
    {
        double d = eo.func_1109_a(field_1776_a * field_1776_a + field_1775_b * field_1775_b + field_1779_c * field_1779_c);
        if(d < 0.0001D)
        {
            return func_1248_b(0.0D, 0.0D, 0.0D);
        } else
        {
            return func_1248_b(field_1776_a / d, field_1775_b / d, field_1779_c / d);
        }
    }

    public aj func_1246_b(aj aj1)
    {
        return func_1248_b(field_1775_b * aj1.field_1779_c - field_1779_c * aj1.field_1775_b, field_1779_c * aj1.field_1776_a - field_1776_a * aj1.field_1779_c, field_1776_a * aj1.field_1775_b - field_1775_b * aj1.field_1776_a);
    }

    public aj func_1257_c(double d, double d1, double d2)
    {
        return func_1248_b(field_1776_a + d, field_1775_b + d1, field_1779_c + d2);
    }

    public double func_1251_c(aj aj1)
    {
        double d = aj1.field_1776_a - field_1776_a;
        double d1 = aj1.field_1775_b - field_1775_b;
        double d2 = aj1.field_1779_c - field_1779_c;
        return (double)eo.func_1109_a(d * d + d1 * d1 + d2 * d2);
    }

    public double func_1261_d(aj aj1)
    {
        double d = aj1.field_1776_a - field_1776_a;
        double d1 = aj1.field_1775_b - field_1775_b;
        double d2 = aj1.field_1779_c - field_1779_c;
        return d * d + d1 * d1 + d2 * d2;
    }

    public double func_1255_d(double d, double d1, double d2)
    {
        double d3 = d - field_1776_a;
        double d4 = d1 - field_1775_b;
        double d5 = d2 - field_1779_c;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public double func_1253_c()
    {
        return (double)eo.func_1109_a(field_1776_a * field_1776_a + field_1775_b * field_1775_b + field_1779_c * field_1779_c);
    }

    public aj func_1247_a(aj aj1, double d)
    {
        double d1 = aj1.field_1776_a - field_1776_a;
        double d2 = aj1.field_1775_b - field_1775_b;
        double d3 = aj1.field_1779_c - field_1779_c;
        if(d1 * d1 < 1.0000000116860974E-007D)
        {
            return null;
        }
        double d4 = (d - field_1776_a) / d1;
        if(d4 < 0.0D || d4 > 1.0D)
        {
            return null;
        } else
        {
            return func_1248_b(field_1776_a + d1 * d4, field_1775_b + d2 * d4, field_1779_c + d3 * d4);
        }
    }

    public aj func_1250_b(aj aj1, double d)
    {
        double d1 = aj1.field_1776_a - field_1776_a;
        double d2 = aj1.field_1775_b - field_1775_b;
        double d3 = aj1.field_1779_c - field_1779_c;
        if(d2 * d2 < 1.0000000116860974E-007D)
        {
            return null;
        }
        double d4 = (d - field_1775_b) / d2;
        if(d4 < 0.0D || d4 > 1.0D)
        {
            return null;
        } else
        {
            return func_1248_b(field_1776_a + d1 * d4, field_1775_b + d2 * d4, field_1779_c + d3 * d4);
        }
    }

    public aj func_1256_c(aj aj1, double d)
    {
        double d1 = aj1.field_1776_a - field_1776_a;
        double d2 = aj1.field_1775_b - field_1775_b;
        double d3 = aj1.field_1779_c - field_1779_c;
        if(d3 * d3 < 1.0000000116860974E-007D)
        {
            return null;
        }
        double d4 = (d - field_1779_c) / d3;
        if(d4 < 0.0D || d4 > 1.0D)
        {
            return null;
        } else
        {
            return func_1248_b(field_1776_a + d1 * d4, field_1775_b + d2 * d4, field_1779_c + d3 * d4);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(field_1776_a).append(", ").append(field_1775_b).append(", ").append(field_1779_c).append(")").toString();
    }

    public void func_1258_a(float f)
    {
        float f1 = eo.func_1114_b(f);
        float f2 = eo.func_1106_a(f);
        double d = field_1776_a;
        double d1 = field_1775_b * (double)f1 + field_1779_c * (double)f2;
        double d2 = field_1779_c * (double)f1 - field_1775_b * (double)f2;
        field_1776_a = d;
        field_1775_b = d1;
        field_1779_c = d2;
    }

    public void func_1249_b(float f)
    {
        float f1 = eo.func_1114_b(f);
        float f2 = eo.func_1106_a(f);
        double d = field_1776_a * (double)f1 + field_1779_c * (double)f2;
        double d1 = field_1775_b;
        double d2 = field_1779_c * (double)f1 - field_1776_a * (double)f2;
        field_1776_a = d;
        field_1775_b = d1;
        field_1779_c = d2;
    }

    private static List field_1778_d = new ArrayList();
    private static int field_1777_e = 0;
    public double field_1776_a;
    public double field_1775_b;
    public double field_1779_c;

}
