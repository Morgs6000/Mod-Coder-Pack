// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class mx
{

    final int a;
    java.lang.Object b;
    mx c;
    final int d;

    mx(int i, int j, java.lang.Object obj, mx mx1)
    {
        b = obj;
        c = mx1;
        a = j;
        d = i;
    }

    public final int a()
    {
        return a;
    }

    public final java.lang.Object b()
    {
        return b;
    }

    public final boolean equals(java.lang.Object obj)
    {
        if(!(obj instanceof mx))
            return false;
        mx mx1 = (mx)obj;
        java.lang.Integer integer = java.lang.Integer.valueOf(a());
        java.lang.Integer integer1 = java.lang.Integer.valueOf(mx1.a());
        if(integer == integer1 || integer != null && ((java.lang.Object) (integer)).equals(((java.lang.Object) (integer1))))
        {
            java.lang.Object obj1 = b();
            java.lang.Object obj2 = mx1.b();
            if(obj1 == obj2 || obj1 != null && obj1.equals(obj2))
                return true;
        }
        return false;
    }

    public final int hashCode()
    {
        return fi.d(a);
    }

    public final java.lang.String toString()
    {
        return (new StringBuilder()).append(a()).append("=").append(b()).toString();
    }
}
