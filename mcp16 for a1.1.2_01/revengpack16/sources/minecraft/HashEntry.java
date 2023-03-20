// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class HashEntry
{

    HashEntry(int i, int j, Object obj, HashEntry hashentry)
    {
        value = obj;
        next = hashentry;
        hash = j;
        slotHash = i;
    }

    public final int func_768_a()
    {
        return hash;
    }

    public final Object func_767_b()
    {
        return value;
    }

    public final boolean equals(Object obj)
    {
        if(!(obj instanceof HashEntry))
        {
            return false;
        }
        HashEntry hashentry = (HashEntry)obj;
        Integer integer = Integer.valueOf(func_768_a());
        Integer integer1 = Integer.valueOf(hashentry.func_768_a());
        if(integer == integer1 || integer != null && integer.equals(integer1))
        {
            Object obj1 = func_767_b();
            Object obj2 = hashentry.func_767_b();
            if(obj1 == obj2 || obj1 != null && obj1.equals(obj2))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return MCHashTable.func_1056_d(hash);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(func_768_a()).append("=").append(func_767_b()).toString();
    }

    final int hash;
    Object value;
    HashEntry next;
    final int slotHash;
}
