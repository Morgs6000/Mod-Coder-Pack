// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class el
{

    private transient bt a[];
    private transient int b;
    private int c;
    private final float d = 0.75F;
    private volatile transient int e;

    public el()
    {
        c = 12;
        a = new bt[16];
    }

    private static int e(long l)
    {
        return el.a((int)(l ^ l >>> 32));
    }

    private static int a(int i)
    {
        i ^= i >>> 20 ^ i >>> 12;
        return i ^ i >>> 7 ^ i >>> 4;
    }

    private static int a(int i, int j)
    {
        return i & j - 1;
    }

    public java.lang.Object a(long l)
    {
        int i = el.e(l);
        for(bt bt1 = a[el.a(i, a.length)]; bt1 != null; bt1 = bt1.c)
            if(bt1.a == l)
                return bt1.b;

        return ((java.lang.Object) (null));
    }

    public void a(long l, java.lang.Object obj)
    {
        int i = el.e(l);
        int j = el.a(i, a.length);
        for(bt bt1 = a[j]; bt1 != null; bt1 = bt1.c)
            if(bt1.a == l)
                bt1.b = obj;

        e++;
        a(i, l, obj, j);
    }

    private void b(int i)
    {
        bt abt[] = a;
        int j = abt.length;
        if(j == 0x40000000)
        {
            c = 0x7fffffff;
            return;
        } else
        {
            bt abt1[] = new bt[i];
            a(abt1);
            a = abt1;
            c = (int)((float)i * d);
            return;
        }
    }

    private void a(bt abt[])
    {
        bt abt1[] = a;
        int i = abt.length;
        for(int j = 0; j < abt1.length; j++)
        {
            bt bt1 = abt1[j];
            if(bt1 == null)
                continue;
            abt1[j] = null;
            do
            {
                bt bt2 = bt1.c;
                int k = el.a(bt1.d, i);
                bt1.c = abt[k];
                abt[k] = bt1;
                bt1 = bt2;
            } while(bt1 != null);
        }

    }

    public java.lang.Object b(long l)
    {
        bt bt1 = c(l);
        return bt1 != null ? bt1.b : null;
    }

    final bt c(long l)
    {
        int i = el.e(l);
        int j = el.a(i, a.length);
        bt bt1 = a[j];
        bt bt2;
        bt bt3;
        for(bt2 = bt1; bt2 != null; bt2 = bt3)
        {
            bt3 = bt2.c;
            if(bt2.a == l)
            {
                e++;
                b--;
                if(bt1 == bt2)
                    a[j] = bt3;
                else
                    bt1.c = bt3;
                return bt2;
            }
            bt1 = bt2;
        }

        return bt2;
    }

    private void a(int i, long l, java.lang.Object obj, int j)
    {
        bt bt1 = a[j];
        a[j] = new bt(i, l, obj, bt1);
        if(b++ >= c)
            b(2 * a.length);
    }

    static int d(long l)
    {
        return el.e(l);
    }
}
