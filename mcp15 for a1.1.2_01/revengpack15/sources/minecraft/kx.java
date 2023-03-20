// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;
import org.lwjgl.opengl.GL11;

public class kx
{

    private kx()
    {
        field_1219_o = new HashMap();
        field_1219_o.put(ax.class, new ok());
        field_1219_o.put(mv.class, new gm(new ca(), new ca(0.5F), 0.7F));
        field_1219_o.put(bo.class, new ns(new gx(), new bx(), 0.7F));
        field_1219_o.put(am.class, new mc(new dv(), 0.7F));
        field_1219_o.put(mz.class, new eq(new kv(), 0.3F));
        field_1219_o.put(dd.class, new d());
        field_1219_o.put(cw.class, new dn(new fv(), 0.5F));
        field_1219_o.put(mb.class, new dn(new cb(), 0.5F));
        field_1219_o.put(ma.class, new gq(new hh(16), new hh(0), 0.25F));
        field_1219_o.put(dm.class, new bu());
        field_1219_o.put(hl.class, new nz(new cb(), 0.5F, 6F));
        field_1219_o.put(ge.class, new dn(new cr(), 0.5F));
        field_1219_o.put(kh.class, new gj());
        field_1219_o.put(jc.class, new bw());
        field_1219_o.put(kg.class, new gk());
        field_1219_o.put(ao.class, new ei());
        field_1219_o.put(dx.class, new ab());
        field_1219_o.put(jd.class, new hw());
        field_1219_o.put(ff.class, new dj());
        field_1219_o.put(oc.class, new kt());
        field_1219_o.put(dc.class, new cp());
        ak ak1;
        for(Iterator iterator = field_1219_o.values().iterator(); iterator.hasNext(); ak1.func_150_a(this))
        {
            ak1 = (ak)iterator.next();
        }

    }

    public ak func_850_a(Class class1)
    {
        ak ak1 = (ak)field_1219_o.get(class1);
        if(ak1 == null && class1 != (kh.class))
        {
            ak1 = func_850_a(class1.getSuperclass());
            field_1219_o.put(class1, ak1);
        }
        return ak1;
    }

    public ak func_855_a(kh kh1)
    {
        return func_850_a(kh1.getClass());
    }

    public void func_857_a(cn cn, ey ey, kd kd, dm dm1, fr fr, float f)
    {
        field_1227_g = cn;
        field_1229_e = ey;
        field_1223_k = fr;
        field_1226_h = dm1;
        field_1218_p = kd;
        field_1225_i = dm1.field_603_as + (dm1.field_605_aq - dm1.field_603_as) * f;
        field_1224_j = dm1.field_602_at + (dm1.field_604_ar - dm1.field_602_at) * f;
        field_1222_l = dm1.field_638_aI + (dm1.field_611_ak - dm1.field_638_aI) * (double)f;
        field_1221_m = dm1.field_637_aJ + (dm1.field_610_al - dm1.field_637_aJ) * (double)f;
        field_1220_n = dm1.field_636_aK + (dm1.field_609_am - dm1.field_636_aK) * (double)f;
    }

    public void func_854_a(kh kh1, float f)
    {
        double d1 = kh1.field_638_aI + (kh1.field_611_ak - kh1.field_638_aI) * (double)f;
        double d2 = kh1.field_637_aJ + (kh1.field_610_al - kh1.field_637_aJ) * (double)f;
        double d3 = kh1.field_636_aK + (kh1.field_609_am - kh1.field_636_aK) * (double)f;
        float f1 = kh1.field_603_as + (kh1.field_605_aq - kh1.field_603_as) * f;
        float f2 = kh1.func_382_a(f);
        GL11.glColor3f(f2, f2, f2);
        func_853_a(kh1, d1 - field_1232_b, d2 - field_1231_c, d3 - field_1230_d, f1, f);
    }

    public void func_853_a(kh kh1, double d1, double d2, double d3, 
            float f, float f1)
    {
        ak ak1 = func_855_a(kh1);
        if(ak1 != null)
        {
            ak1.func_147_a(kh1, d1, d2, d3, f, f1);
            ak1.func_141_b(kh1, d1, d2, d3, f, f1);
        }
    }

    public void func_852_a(cn cn)
    {
        field_1227_g = cn;
    }

    public double func_851_a(double d1, double d2, double d3)
    {
        double d4 = d1 - field_1222_l;
        double d5 = d2 - field_1221_m;
        double d6 = d3 - field_1220_n;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public kd func_856_a()
    {
        return field_1218_p;
    }

    private Map field_1219_o;
    public static kx field_1233_a = new kx();
    private kd field_1218_p;
    public static double field_1232_b;
    public static double field_1231_c;
    public static double field_1230_d;
    public ey field_1229_e;
    public jh field_1228_f;
    public cn field_1227_g;
    public dm field_1226_h;
    public float field_1225_i;
    public float field_1224_j;
    public fr field_1223_k;
    public double field_1222_l;
    public double field_1221_m;
    public double field_1220_n;

}
