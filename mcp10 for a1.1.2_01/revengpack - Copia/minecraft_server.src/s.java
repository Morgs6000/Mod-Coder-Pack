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

public class s extends gg
{

    private java.util.Map a;

    public s()
    {
        a = ((java.util.Map) (new HashMap()));
    }

    void a(java.io.DataOutput dataoutput) throws IOException
    {
        gg gg1;
        for(java.util.Iterator iterator = a.values().iterator(); iterator.hasNext(); gg.a(gg1, dataoutput))
            gg1 = (gg)iterator.next();

        dataoutput.writeByte(0);
    }

    void a(java.io.DataInput datainput) throws IOException
    {
        a.clear();
        gg gg1;
        for(; (gg1 = gg.b(datainput)).a() != 0; a.put(((java.lang.Object) (gg1.c())), ((java.lang.Object) (gg1))));
    }

    public byte a()
    {
        return 10;
    }

    public void a(java.lang.String s1, gg gg1)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) (gg1.m(s1))));
    }

    public void a(java.lang.String s1, byte byte0)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) ((new bo(byte0)).m(s1))));
    }

    public void a(java.lang.String s1, short word0)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) ((new fb(word0)).m(s1))));
    }

    public void a(java.lang.String s1, int i1)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) ((new bf(i1)).m(s1))));
    }

    public void a(java.lang.String s1, long l1)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) ((new d(l1)).m(s1))));
    }

    public void a(java.lang.String s1, float f1)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) ((new l(f1)).m(s1))));
    }

    public void a(java.lang.String s1, double d1)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) ((new dt(d1)).m(s1))));
    }

    public void a(java.lang.String s1, java.lang.String s2)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) ((new hj(s2)).m(s1))));
    }

    public void a(java.lang.String s1, byte abyte0[])
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) ((new fp(abyte0)).m(s1))));
    }

    public void a(java.lang.String s1, s s2)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) (s2.m(s1))));
    }

    public void a(java.lang.String s1, boolean flag)
    {
        a(s1, ((byte)(flag ? 1 : 0)));
    }

    public boolean a(java.lang.String s1)
    {
        return a.containsKey(((java.lang.Object) (s1)));
    }

    public byte b(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return 0;
        else
            return ((bo)a.get(((java.lang.Object) (s1)))).a;
    }

    public short c(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return 0;
        else
            return ((fb)a.get(((java.lang.Object) (s1)))).a;
    }

    public int d(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return 0;
        else
            return ((bf)a.get(((java.lang.Object) (s1)))).a;
    }

    public long e(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return 0L;
        else
            return ((d)a.get(((java.lang.Object) (s1)))).a;
    }

    public float f(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return 0.0F;
        else
            return ((l)a.get(((java.lang.Object) (s1)))).a;
    }

    public double g(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return 0.0D;
        else
            return ((dt)a.get(((java.lang.Object) (s1)))).a;
    }

    public java.lang.String h(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return "";
        else
            return ((hj)a.get(((java.lang.Object) (s1)))).a;
    }

    public byte[] i(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return new byte[0];
        else
            return ((fp)a.get(((java.lang.Object) (s1)))).a;
    }

    public s j(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return new s();
        else
            return (s)a.get(((java.lang.Object) (s1)));
    }

    public dm k(java.lang.String s1)
    {
        if(!a.containsKey(((java.lang.Object) (s1))))
            return new dm();
        else
            return (dm)a.get(((java.lang.Object) (s1)));
    }

    public boolean l(java.lang.String s1)
    {
        return b(s1) != 0;
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("").append(a.size()).append(" entries").toString();
    }
}
