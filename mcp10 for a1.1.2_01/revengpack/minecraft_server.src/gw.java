// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


class gw
{

    final int a;
    java.lang.Object b;
    gw c;
    final int d;

    gw(int i, int j, java.lang.Object obj, gw gw1)
    {
        b = obj;
        c = gw1;
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
        if(!(obj instanceof gw))
            return false;
        gw gw1 = (gw)obj;
        java.lang.Integer integer = java.lang.Integer.valueOf(a());
        java.lang.Integer integer1 = java.lang.Integer.valueOf(gw1.a());
        if(integer == integer1 || integer != null && ((java.lang.Object) (integer)).equals(((java.lang.Object) (integer1))))
        {
            java.lang.Object obj1 = b();
            java.lang.Object obj2 = gw1.b();
            if(obj1 == obj2 || obj1 != null && obj1.equals(obj2))
                return true;
        }
        return false;
    }

    public final int hashCode()
    {
        return hf.f(a);
    }

    public final java.lang.String toString()
    {
        return (new StringBuilder()).append(a()).append("=").append(b()).toString();
    }
}
