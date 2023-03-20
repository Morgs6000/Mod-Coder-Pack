// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hm extends el
{

    private java.util.Map a;

    public hm()
    {
        a = ((java.util.Map) (new HashMap()));
    }

    void a(java.io.DataOutput dataoutput) throws IOException
    {
        el el1;
        for(java.util.Iterator iterator = a.values().iterator(); iterator.hasNext(); el.a(el1, dataoutput))
            el1 = (el)iterator.next();

        dataoutput.writeByte(0);
    }

    void a(java.io.DataInput datainput) throws IOException
    {
        a.clear();
        el el1;
        for(; (el1 = el.b(datainput)).a() != 0; a.put(((java.lang.Object) (el1.b())), ((java.lang.Object) (el1))));
    }

    public byte a()
    {
        return 10;
    }

    public void a(java.lang.String s, el el1)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) (el1.a(s))));
    }

    public void a(java.lang.String s, byte byte0)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) ((new ix(byte0)).a(s))));
    }

    public void a(java.lang.String s, short word0)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) ((new ls(word0)).a(s))));
    }

    public void a(java.lang.String s, int i1)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) ((new io(i1)).a(s))));
    }

    public void a(java.lang.String s, long l1)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) ((new gn(l1)).a(s))));
    }

    public void a(java.lang.String s, float f1)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) ((new f(f1)).a(s))));
    }

    public void a(java.lang.String s, double d1)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) ((new kr(d1)).a(s))));
    }

    public void a(java.lang.String s, java.lang.String s1)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) ((new ne(s1)).a(s))));
    }

    public void a(java.lang.String s, byte abyte0[])
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) ((new dy(abyte0)).a(s))));
    }

    public void a(java.lang.String s, hm hm1)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) (hm1.a(s))));
    }

    public void a(java.lang.String s, boolean flag)
    {
        a(s, ((byte)(flag ? 1 : 0)));
    }

    public boolean b(java.lang.String s)
    {
        return a.containsKey(((java.lang.Object) (s)));
    }

    public byte c(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return 0;
        else
            return ((ix)a.get(((java.lang.Object) (s)))).a;
    }

    public short d(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return 0;
        else
            return ((ls)a.get(((java.lang.Object) (s)))).a;
    }

    public int e(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return 0;
        else
            return ((io)a.get(((java.lang.Object) (s)))).a;
    }

    public long f(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return 0L;
        else
            return ((gn)a.get(((java.lang.Object) (s)))).a;
    }

    public float g(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return 0.0F;
        else
            return ((f)a.get(((java.lang.Object) (s)))).a;
    }

    public double h(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return 0.0D;
        else
            return ((kr)a.get(((java.lang.Object) (s)))).a;
    }

    public java.lang.String i(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return "";
        else
            return ((ne)a.get(((java.lang.Object) (s)))).a;
    }

    public byte[] j(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return new byte[0];
        else
            return ((dy)a.get(((java.lang.Object) (s)))).a;
    }

    public hm k(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return new hm();
        else
            return (hm)a.get(((java.lang.Object) (s)));
    }

    public ki l(java.lang.String s)
    {
        if(!a.containsKey(((java.lang.Object) (s))))
            return new ki();
        else
            return (ki)a.get(((java.lang.Object) (s)));
    }

    public boolean m(java.lang.String s)
    {
        return c(s) != 0;
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("").append(a.size()).append(" entries").toString();
    }
}
