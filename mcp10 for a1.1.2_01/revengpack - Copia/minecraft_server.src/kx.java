// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class kx
{

    private java.util.Map o;
    public static kx a = new kx();
    private kd p;
    public static double b;
    public static double c;
    public static double d;
    public ey e;
    public jh f;
    public cn g;
    public dm h;
    public float i;
    public float j;
    public fr k;
    public double l;
    public double m;
    public double n;

    private kx()
    {
        o = ((java.util.Map) (new HashMap()));
        o.put(ax, ((java.lang.Object) (new ok())));
        o.put(mv, ((java.lang.Object) (new gm(((fo) (new ca())), ((fo) (new ca(0.5F))), 0.7F))));
        o.put(bo, ((java.lang.Object) (new ns(((fo) (new gx())), ((fo) (new bx())), 0.7F))));
        o.put(am, ((java.lang.Object) (new mc(((fo) (new dv())), 0.7F))));
        o.put(mz, ((java.lang.Object) (new eq(((fo) (new kv())), 0.3F))));
        o.put(dd, ((java.lang.Object) (new d())));
        o.put(cw, ((java.lang.Object) (new dn(((fo) (new fv())), 0.5F))));
        o.put(mb, ((java.lang.Object) (new dn(((fo) (new cb())), 0.5F))));
        o.put(ma, ((java.lang.Object) (new gq(((fo) (new hh(16))), ((fo) (new hh(0))), 0.25F))));
        o.put(dm, ((java.lang.Object) (new bu())));
        o.put(hl, ((java.lang.Object) (new nz(((fo) (new cb())), 0.5F, 6F))));
        o.put(ge, ((java.lang.Object) (new dn(((fo) (new cr())), 0.5F))));
        o.put(kh, ((java.lang.Object) (new gj())));
        o.put(jc, ((java.lang.Object) (new bw())));
        o.put(kg, ((java.lang.Object) (new gk())));
        o.put(ao, ((java.lang.Object) (new ei())));
        o.put(dx, ((java.lang.Object) (new ab())));
        o.put(jd, ((java.lang.Object) (new hw())));
        o.put(ff, ((java.lang.Object) (new dj())));
        o.put(oc, ((java.lang.Object) (new kt())));
        o.put(dc, ((java.lang.Object) (new cp())));
        ak ak1;
        for(java.util.Iterator iterator = o.values().iterator(); iterator.hasNext(); ak1.a(this))
            ak1 = (ak)iterator.next();

    }

    public ak a(java.lang.Class class1)
    {
        ak ak1 = (ak)o.get(((java.lang.Object) (class1)));
        if(ak1 == null && class1 != kh)
        {
            ak1 = a(class1.getSuperclass());
            o.put(((java.lang.Object) (class1)), ((java.lang.Object) (ak1)));
        }
        return ak1;
    }

    public ak a(kh kh1)
    {
        return a(((java.lang.Object) (kh1)).getClass());
    }

    public void a(cn cn, ey ey, kd kd, dm dm1, fr fr, float f1)
    {
        g = cn;
        e = ey;
        k = fr;
        h = dm1;
        p = kd;
        i = dm1.as + (dm1.aq - dm1.as) * f1;
        j = dm1.at + (dm1.ar - dm1.at) * f1;
        l = dm1.aI + (dm1.ak - dm1.aI) * (double)f1;
        m = dm1.aJ + (dm1.al - dm1.aJ) * (double)f1;
        n = dm1.aK + (dm1.am - dm1.aK) * (double)f1;
    }

    public void a(kh kh1, float f1)
    {
        double d1 = kh1.aI + (kh1.ak - kh1.aI) * (double)f1;
        double d2 = kh1.aJ + (kh1.al - kh1.aJ) * (double)f1;
        double d3 = kh1.aK + (kh1.am - kh1.aK) * (double)f1;
        float f2 = kh1.as + (kh1.aq - kh1.as) * f1;
        float f3 = kh1.a(f1);
        org.lwjgl.opengl.GL11.glColor3f(f3, f3, f3);
        a(kh1, d1 - b, d2 - c, d3 - d, f2, f1);
    }

    public void a(kh kh1, double d1, double d2, double d3, 
            float f1, float f2)
    {
        ak ak1 = a(kh1);
        if(ak1 != null)
        {
            ak1.a(kh1, d1, d2, d3, f1, f2);
            ak1.b(kh1, d1, d2, d3, f1, f2);
        }
    }

    public void a(cn cn)
    {
        g = cn;
    }

    public double a(double d1, double d2, double d3)
    {
        double d4 = d1 - l;
        double d5 = d2 - m;
        double d6 = d3 - n;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public kd a()
    {
        return p;
    }

}
