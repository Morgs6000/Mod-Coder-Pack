// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class bt
{

    final long a;
    java.lang.Object b;
    bt c;
    final int d;

    bt(int i, long l, java.lang.Object obj, bt bt1)
    {
        b = obj;
        c = bt1;
        a = l;
        d = i;
    }

    public final long a()
    {
        return a;
    }

    public final java.lang.Object b()
    {
        return b;
    }

    public final boolean equals(java.lang.Object obj)
    {
        if(!(obj instanceof bt))
            return false;
        bt bt1 = (bt)obj;
        java.lang.Long long1 = java.lang.Long.valueOf(a());
        java.lang.Long long2 = java.lang.Long.valueOf(bt1.a());
        if(long1 == long2 || long1 != null && ((java.lang.Object) (long1)).equals(((java.lang.Object) (long2))))
        {
            java.lang.Object obj1 = b();
            java.lang.Object obj2 = bt1.b();
            if(obj1 == obj2 || obj1 != null && obj1.equals(obj2))
                return true;
        }
        return false;
    }

    public final int hashCode()
    {
        return el.d(a);
    }

    public final java.lang.String toString()
    {
        return (new StringBuilder()).append(a()).append("=").append(b()).toString();
    }
}
