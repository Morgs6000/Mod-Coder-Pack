// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class eo
{

    public eo()
    {
    }

    public static final float func_1106_a(float f)
    {
        return field_1653_a[(int)(f * 10430.38F) & 0xffff];
    }

    public static final float func_1114_b(float f)
    {
        return field_1653_a[(int)(f * 10430.38F + 16384F) & 0xffff];
    }

    public static final float func_1113_c(float f)
    {
        return (float)Math.sqrt(f);
    }

    public static final float func_1109_a(double d)
    {
        return (float)Math.sqrt(d);
    }

    public static int func_1110_d(float f)
    {
        int i = (int)f;
        return f >= (float)i ? i : i - 1;
    }

    public static int b(double d)
    {
        int i = (int)d;
        return d >= (double)i ? i : i - 1;
    }

    public static float func_1112_e(float f)
    {
        return f < 0.0F ? -f : f;
    }

    public static double func_1107_a(double d, double d1)
    {
        if(d < 0.0D)
        {
            d = -d;
        }
        if(d1 < 0.0D)
        {
            d1 = -d1;
        }
        return d <= d1 ? d1 : d;
    }

    public static int func_1111_a(int i, int j)
    {
        if(i < 0)
        {
            return -((-i - 1) / j) - 1;
        } else
        {
            return i / j;
        }
    }

    private static float field_1653_a[];

    static 
    {
        field_1653_a = new float[0x10000];
        for(int i = 0; i < 0x10000; i++)
        {
            field_1653_a[i] = (float)Math.sin(((double)i * 3.1415926535897931D * 2D) / 65536D);
        }

    }
}
