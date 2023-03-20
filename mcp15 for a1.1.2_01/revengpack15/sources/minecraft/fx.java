// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class fx
{

    public fx()
    {
        field_1556_a = new a[1024];
        field_1555_b = 0;
    }

    public a func_1034_a(a a1)
    {
        if(a1.field_1714_e >= 0)
        {
            throw new IllegalStateException("OW KNOWS!");
        }
        if(field_1555_b == field_1556_a.length)
        {
            a aa[] = new a[field_1555_b << 1];
            System.arraycopy(field_1556_a, 0, aa, 0, field_1555_b);
            field_1556_a = aa;
        }
        field_1556_a[field_1555_b] = a1;
        a1.field_1714_e = field_1555_b;
        func_1033_a(field_1555_b++);
        return a1;
    }

    public void func_1038_a()
    {
        field_1555_b = 0;
    }

    public a func_1036_b()
    {
        a a1 = field_1556_a[0];
        field_1556_a[0] = field_1556_a[--field_1555_b];
        field_1556_a[field_1555_b] = null;
        if(field_1555_b > 0)
        {
            func_1037_b(0);
        }
        a1.field_1714_e = -1;
        return a1;
    }

    public void func_1035_a(a a1, float f)
    {
        float f1 = a1.field_1711_h;
        a1.field_1711_h = f;
        if(f < f1)
        {
            func_1033_a(a1.field_1714_e);
        } else
        {
            func_1037_b(a1.field_1714_e);
        }
    }

    private void func_1033_a(int i)
    {
        a a1 = field_1556_a[i];
        float f = a1.field_1711_h;
        do
        {
            if(i <= 0)
            {
                break;
            }
            int j = i - 1 >> 1;
            a a2 = field_1556_a[j];
            if(f >= a2.field_1711_h)
            {
                break;
            }
            field_1556_a[i] = a2;
            a2.field_1714_e = i;
            i = j;
        } while(true);
        field_1556_a[i] = a1;
        a1.field_1714_e = i;
    }

    private void func_1037_b(int i)
    {
        a a1 = field_1556_a[i];
        float f = a1.field_1711_h;
        do
        {
            int j = 1 + (i << 1);
            int k = j + 1;
            if(j >= field_1555_b)
            {
                break;
            }
            a a2 = field_1556_a[j];
            float f1 = a2.field_1711_h;
            a a3;
            float f2;
            if(k >= field_1555_b)
            {
                a3 = null;
                f2 = (1.0F / 0.0F);
            } else
            {
                a3 = field_1556_a[k];
                f2 = a3.field_1711_h;
            }
            if(f1 < f2)
            {
                if(f1 >= f)
                {
                    break;
                }
                field_1556_a[i] = a2;
                a2.field_1714_e = i;
                i = j;
                continue;
            }
            if(f2 >= f)
            {
                break;
            }
            field_1556_a[i] = a3;
            a3.field_1714_e = i;
            i = k;
        } while(true);
        field_1556_a[i] = a1;
        a1.field_1714_e = i;
    }

    public boolean func_1039_c()
    {
        return field_1555_b == 0;
    }

    private a field_1556_a[];
    private int field_1555_b;
}
