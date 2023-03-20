// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class fi
{

    public fi()
    {
        field_1593_c = 12;
        field_1590_a = new mx[16];
    }

    private static int func_1055_e(int i)
    {
        i ^= i >>> 20 ^ i >>> 12;
        return i ^ i >>> 7 ^ i >>> 4;
    }

    private static int func_1062_a(int i, int j)
    {
        return i & j - 1;
    }

    public Object func_1057_a(int i)
    {
        int j = func_1055_e(i);
        for(mx mx1 = field_1590_a[func_1062_a(j, field_1590_a.length)]; mx1 != null; mx1 = mx1.field_1108_c)
        {
            if(mx1.field_1106_a == i)
            {
                return mx1.field_1105_b;
            }
        }

        return null;
    }

    public void func_1061_a(int i, Object obj)
    {
        int j = func_1055_e(i);
        int k = func_1062_a(j, field_1590_a.length);
        for(mx mx1 = field_1590_a[k]; mx1 != null; mx1 = mx1.field_1108_c)
        {
            if(mx1.field_1106_a == i)
            {
                mx1.field_1105_b = obj;
            }
        }

        field_1591_e++;
        func_1053_a(j, i, obj, k);
    }

    private void func_1060_f(int i)
    {
        mx amx[] = field_1590_a;
        int j = amx.length;
        if(j == 0x40000000)
        {
            field_1593_c = 0x7fffffff;
            return;
        } else
        {
            mx amx1[] = new mx[i];
            func_1059_a(amx1);
            field_1590_a = amx1;
            field_1593_c = (int)((float)i * field_1592_d);
            return;
        }
    }

    private void func_1059_a(mx amx[])
    {
        mx amx1[] = field_1590_a;
        int i = amx.length;
        for(int j = 0; j < amx1.length; j++)
        {
            mx mx1 = amx1[j];
            if(mx1 == null)
            {
                continue;
            }
            amx1[j] = null;
            do
            {
                mx mx2 = mx1.field_1108_c;
                int k = func_1062_a(mx1.field_1107_d, i);
                mx1.field_1108_c = amx[k];
                amx[k] = mx1;
                mx1 = mx2;
            } while(mx1 != null);
        }

    }

    public Object func_1052_b(int i)
    {
        mx mx1 = func_1054_c(i);
        return mx1 != null ? mx1.field_1105_b : null;
    }

    final mx func_1054_c(int i)
    {
        int j = func_1055_e(i);
        int k = func_1062_a(j, field_1590_a.length);
        mx mx1 = field_1590_a[k];
        mx mx2;
        mx mx3;
        for(mx2 = mx1; mx2 != null; mx2 = mx3)
        {
            mx3 = mx2.field_1108_c;
            if(mx2.field_1106_a == i)
            {
                field_1591_e++;
                field_1589_b--;
                if(mx1 == mx2)
                {
                    field_1590_a[k] = mx3;
                } else
                {
                    mx1.field_1108_c = mx3;
                }
                return mx2;
            }
            mx1 = mx2;
        }

        return mx2;
    }

    public void func_1058_a()
    {
        field_1591_e++;
        mx amx[] = field_1590_a;
        for(int i = 0; i < amx.length; i++)
        {
            amx[i] = null;
        }

        field_1589_b = 0;
    }

    private void func_1053_a(int i, int j, Object obj, int k)
    {
        mx mx1 = field_1590_a[k];
        field_1590_a[k] = new mx(i, j, obj, mx1);
        if(field_1589_b++ >= field_1593_c)
        {
            func_1060_f(2 * field_1590_a.length);
        }
    }

    static int func_1056_d(int i)
    {
        return func_1055_e(i);
    }

    private transient mx field_1590_a[];
    private transient int field_1589_b;
    private int field_1593_c;
    private final float field_1592_d = 0.75F;
    private volatile transient int field_1591_e;
}
