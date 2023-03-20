// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class MCHashTable
{

    public MCHashTable()
    {
        size = 12;
        slots = new HashEntry[16];
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
        for(HashEntry hashentry = slots[func_1062_a(j, slots.length)]; hashentry != null; hashentry = hashentry.next)
        {
            if(hashentry.hash == i)
            {
                return hashentry.value;
            }
        }

        return null;
    }

    public void func_1061_a(int i, Object obj)
    {
        int j = func_1055_e(i);
        int k = func_1062_a(j, slots.length);
        for(HashEntry hashentry = slots[k]; hashentry != null; hashentry = hashentry.next)
        {
            if(hashentry.hash == i)
            {
                hashentry.value = obj;
            }
        }

        field_1591_e++;
        func_1053_a(j, i, obj, k);
    }

    private void func_1060_f(int i)
    {
        HashEntry ahashentry[] = slots;
        int j = ahashentry.length;
        if(j == 0x40000000)
        {
            size = 0x7fffffff;
            return;
        } else
        {
            HashEntry ahashentry1[] = new HashEntry[i];
            func_1059_a(ahashentry1);
            slots = ahashentry1;
            size = (int)((float)i * field_1592_d);
            return;
        }
    }

    private void func_1059_a(HashEntry ahashentry[])
    {
        HashEntry ahashentry1[] = slots;
        int i = ahashentry.length;
        for(int j = 0; j < ahashentry1.length; j++)
        {
            HashEntry hashentry = ahashentry1[j];
            if(hashentry == null)
            {
                continue;
            }
            ahashentry1[j] = null;
            do
            {
                HashEntry hashentry1 = hashentry.next;
                int k = func_1062_a(hashentry.slotHash, i);
                hashentry.next = ahashentry[k];
                ahashentry[k] = hashentry;
                hashentry = hashentry1;
            } while(hashentry != null);
        }

    }

    public Object func_1052_b(int i)
    {
        HashEntry hashentry = func_1054_c(i);
        return hashentry != null ? hashentry.value : null;
    }

    final HashEntry func_1054_c(int i)
    {
        int j = func_1055_e(i);
        int k = func_1062_a(j, slots.length);
        HashEntry hashentry = slots[k];
        HashEntry hashentry1;
        HashEntry hashentry2;
        for(hashentry1 = hashentry; hashentry1 != null; hashentry1 = hashentry2)
        {
            hashentry2 = hashentry1.next;
            if(hashentry1.hash == i)
            {
                field_1591_e++;
                count--;
                if(hashentry == hashentry1)
                {
                    slots[k] = hashentry2;
                } else
                {
                    hashentry.next = hashentry2;
                }
                return hashentry1;
            }
            hashentry = hashentry1;
        }

        return hashentry1;
    }

    public void func_1058_a()
    {
        field_1591_e++;
        HashEntry ahashentry[] = slots;
        for(int i = 0; i < ahashentry.length; i++)
        {
            ahashentry[i] = null;
        }

        count = 0;
    }

    private void func_1053_a(int i, int j, Object obj, int k)
    {
        HashEntry hashentry = slots[k];
        slots[k] = new HashEntry(i, j, obj, hashentry);
        if(count++ >= size)
        {
            func_1060_f(2 * slots.length);
        }
    }

    static int func_1056_d(int i)
    {
        return func_1055_e(i);
    }

    private transient HashEntry slots[];
    private transient int count;
    private int size;
    private final float field_1592_d = 0.75F;
    private volatile transient int field_1591_e;
}
