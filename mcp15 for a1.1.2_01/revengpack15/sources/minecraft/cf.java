// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.List;

public class cf
{

    public static cf func_1168_a(double d, double d1, double d2, double d3, 
            double d4, double d5)
    {
        return new cf(d, d1, d2, d3, d4, d5);
    }

    public static void func_1173_a()
    {
        field_1699_h = 0;
    }

    public static cf func_1161_b(double d, double d1, double d2, double d3, 
            double d4, double d5)
    {
        if(field_1699_h >= field_1700_g.size())
        {
            field_1700_g.add(func_1168_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D));
        }
        return ((cf)field_1700_g.get(field_1699_h++)).func_1165_c(d, d1, d2, d3, d4, d5);
    }

    private cf(double d, double d1, double d2, double d3, double d4, double d5)
    {
        field_1698_a = d;
        field_1697_b = d1;
        field_1704_c = d2;
        field_1703_d = d3;
        field_1702_e = d4;
        field_1701_f = d5;
    }

    public cf func_1165_c(double d, double d1, double d2, double d3, double d4, double d5)
    {
        field_1698_a = d;
        field_1697_b = d1;
        field_1704_c = d2;
        field_1703_d = d3;
        field_1702_e = d4;
        field_1701_f = d5;
        return this;
    }

    public cf func_1170_a(double d, double d1, double d2)
    {
        double d3 = field_1698_a;
        double d4 = field_1697_b;
        double d5 = field_1704_c;
        double d6 = field_1703_d;
        double d7 = field_1702_e;
        double d8 = field_1701_f;
        if(d < 0.0D)
        {
            d3 += d;
        }
        if(d > 0.0D)
        {
            d6 += d;
        }
        if(d1 < 0.0D)
        {
            d4 += d1;
        }
        if(d1 > 0.0D)
        {
            d7 += d1;
        }
        if(d2 < 0.0D)
        {
            d5 += d2;
        }
        if(d2 > 0.0D)
        {
            d8 += d2;
        }
        return func_1161_b(d3, d4, d5, d6, d7, d8);
    }

    public cf func_1177_b(double d, double d1, double d2)
    {
        double d3 = field_1698_a - d;
        double d4 = field_1697_b - d1;
        double d5 = field_1704_c - d2;
        double d6 = field_1703_d + d;
        double d7 = field_1702_e + d1;
        double d8 = field_1701_f + d2;
        return func_1161_b(d3, d4, d5, d6, d7, d8);
    }

    public cf func_1166_c(double d, double d1, double d2)
    {
        return func_1161_b(field_1698_a + d, field_1697_b + d1, field_1704_c + d2, field_1703_d + d, field_1702_e + d1, field_1701_f + d2);
    }

    public double func_1163_a(cf cf1, double d)
    {
        if(cf1.field_1702_e <= field_1697_b || cf1.field_1697_b >= field_1702_e)
        {
            return d;
        }
        if(cf1.field_1701_f <= field_1704_c || cf1.field_1704_c >= field_1701_f)
        {
            return d;
        }
        if(d > 0.0D && cf1.field_1703_d <= field_1698_a)
        {
            double d1 = field_1698_a - cf1.field_1703_d;
            if(d1 < d)
            {
                d = d1;
            }
        }
        if(d < 0.0D && cf1.field_1698_a >= field_1703_d)
        {
            double d2 = field_1703_d - cf1.field_1698_a;
            if(d2 > d)
            {
                d = d2;
            }
        }
        return d;
    }

    public double func_1172_b(cf cf1, double d)
    {
        if(cf1.field_1703_d <= field_1698_a || cf1.field_1698_a >= field_1703_d)
        {
            return d;
        }
        if(cf1.field_1701_f <= field_1704_c || cf1.field_1704_c >= field_1701_f)
        {
            return d;
        }
        if(d > 0.0D && cf1.field_1702_e <= field_1697_b)
        {
            double d1 = field_1697_b - cf1.field_1702_e;
            if(d1 < d)
            {
                d = d1;
            }
        }
        if(d < 0.0D && cf1.field_1697_b >= field_1702_e)
        {
            double d2 = field_1702_e - cf1.field_1697_b;
            if(d2 > d)
            {
                d = d2;
            }
        }
        return d;
    }

    public double func_1162_c(cf cf1, double d)
    {
        if(cf1.field_1703_d <= field_1698_a || cf1.field_1698_a >= field_1703_d)
        {
            return d;
        }
        if(cf1.field_1702_e <= field_1697_b || cf1.field_1697_b >= field_1702_e)
        {
            return d;
        }
        if(d > 0.0D && cf1.field_1701_f <= field_1704_c)
        {
            double d1 = field_1704_c - cf1.field_1701_f;
            if(d1 < d)
            {
                d = d1;
            }
        }
        if(d < 0.0D && cf1.field_1704_c >= field_1701_f)
        {
            double d2 = field_1701_f - cf1.field_1704_c;
            if(d2 > d)
            {
                d = d2;
            }
        }
        return d;
    }

    public boolean func_1178_a(cf cf1)
    {
        if(cf1.field_1703_d <= field_1698_a || cf1.field_1698_a >= field_1703_d)
        {
            return false;
        }
        if(cf1.field_1702_e <= field_1697_b || cf1.field_1697_b >= field_1702_e)
        {
            return false;
        }
        return cf1.field_1701_f > field_1704_c && cf1.field_1704_c < field_1701_f;
    }

    public cf func_1174_d(double d, double d1, double d2)
    {
        field_1698_a += d;
        field_1697_b += d1;
        field_1704_c += d2;
        field_1703_d += d;
        field_1702_e += d1;
        field_1701_f += d2;
        return this;
    }

    public double func_1164_b()
    {
        double d = field_1703_d - field_1698_a;
        double d1 = field_1702_e - field_1697_b;
        double d2 = field_1701_f - field_1704_c;
        return (d + d1 + d2) / 3D;
    }

    public cf func_1160_c()
    {
        return func_1161_b(field_1698_a, field_1697_b, field_1704_c, field_1703_d, field_1702_e, field_1701_f);
    }

    public mf func_1169_a(aj aj1, aj aj2)
    {
        aj aj3 = aj1.func_1247_a(aj2, field_1698_a);
        aj aj4 = aj1.func_1247_a(aj2, field_1703_d);
        aj aj5 = aj1.func_1250_b(aj2, field_1697_b);
        aj aj6 = aj1.func_1250_b(aj2, field_1702_e);
        aj aj7 = aj1.func_1256_c(aj2, field_1704_c);
        aj aj8 = aj1.func_1256_c(aj2, field_1701_f);
        if(!func_1167_a(aj3))
        {
            aj3 = null;
        }
        if(!func_1167_a(aj4))
        {
            aj4 = null;
        }
        if(!func_1175_b(aj5))
        {
            aj5 = null;
        }
        if(!func_1175_b(aj6))
        {
            aj6 = null;
        }
        if(!func_1176_c(aj7))
        {
            aj7 = null;
        }
        if(!func_1176_c(aj8))
        {
            aj8 = null;
        }
        aj aj9 = null;
        if(aj3 != null && (aj9 == null || aj1.func_1261_d(aj3) < aj1.func_1261_d(aj9)))
        {
            aj9 = aj3;
        }
        if(aj4 != null && (aj9 == null || aj1.func_1261_d(aj4) < aj1.func_1261_d(aj9)))
        {
            aj9 = aj4;
        }
        if(aj5 != null && (aj9 == null || aj1.func_1261_d(aj5) < aj1.func_1261_d(aj9)))
        {
            aj9 = aj5;
        }
        if(aj6 != null && (aj9 == null || aj1.func_1261_d(aj6) < aj1.func_1261_d(aj9)))
        {
            aj9 = aj6;
        }
        if(aj7 != null && (aj9 == null || aj1.func_1261_d(aj7) < aj1.func_1261_d(aj9)))
        {
            aj9 = aj7;
        }
        if(aj8 != null && (aj9 == null || aj1.func_1261_d(aj8) < aj1.func_1261_d(aj9)))
        {
            aj9 = aj8;
        }
        if(aj9 == null)
        {
            return null;
        }
        byte byte0 = -1;
        if(aj9 == aj3)
        {
            byte0 = 4;
        }
        if(aj9 == aj4)
        {
            byte0 = 5;
        }
        if(aj9 == aj5)
        {
            byte0 = 0;
        }
        if(aj9 == aj6)
        {
            byte0 = 1;
        }
        if(aj9 == aj7)
        {
            byte0 = 2;
        }
        if(aj9 == aj8)
        {
            byte0 = 3;
        }
        return new mf(0, 0, 0, byte0, aj9);
    }

    private boolean func_1167_a(aj aj1)
    {
        if(aj1 == null)
        {
            return false;
        } else
        {
            return aj1.field_1775_b >= field_1697_b && aj1.field_1775_b <= field_1702_e && aj1.field_1779_c >= field_1704_c && aj1.field_1779_c <= field_1701_f;
        }
    }

    private boolean func_1175_b(aj aj1)
    {
        if(aj1 == null)
        {
            return false;
        } else
        {
            return aj1.field_1776_a >= field_1698_a && aj1.field_1776_a <= field_1703_d && aj1.field_1779_c >= field_1704_c && aj1.field_1779_c <= field_1701_f;
        }
    }

    private boolean func_1176_c(aj aj1)
    {
        if(aj1 == null)
        {
            return false;
        } else
        {
            return aj1.field_1776_a >= field_1698_a && aj1.field_1776_a <= field_1703_d && aj1.field_1775_b >= field_1697_b && aj1.field_1775_b <= field_1702_e;
        }
    }

    public void func_1171_b(cf cf1)
    {
        field_1698_a = cf1.field_1698_a;
        field_1697_b = cf1.field_1697_b;
        field_1704_c = cf1.field_1704_c;
        field_1703_d = cf1.field_1703_d;
        field_1702_e = cf1.field_1702_e;
        field_1701_f = cf1.field_1701_f;
    }

    private static List field_1700_g = new ArrayList();
    private static int field_1699_h = 0;
    public double field_1698_a;
    public double field_1697_b;
    public double field_1704_c;
    public double field_1703_d;
    public double field_1702_e;
    public double field_1701_f;

}
