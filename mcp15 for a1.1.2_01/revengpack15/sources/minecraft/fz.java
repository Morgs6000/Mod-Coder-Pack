// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;
import org.lwjgl.opengl.GL11;

public class fz
{

    private fz()
    {
        field_1542_m = new HashMap();
        field_1542_m.put(ob.class, new in());
        field_1542_m.put(bd.class, new r());
        ex ex1;
        for(Iterator iterator = field_1542_m.values().iterator(); iterator.hasNext(); ex1.func_928_a(this))
        {
            ex1 = (ex)iterator.next();
        }

    }

    public ex func_1027_a(Class class1)
    {
        ex ex1 = (ex)field_1542_m.get(class1);
        if(ex1 == null && class1 != (ic.class))
        {
            ex1 = func_1027_a(class1.getSuperclass());
            field_1542_m.put(class1, ex1);
        }
        return ex1;
    }

    public boolean func_1028_a(ic ic1)
    {
        return func_1031_b(ic1) != null;
    }

    public ex func_1031_b(ic ic1)
    {
        return func_1027_a(ic1.getClass());
    }

    public void func_1026_a(cn cn1, ey ey, kd kd, dm dm1, float f)
    {
        field_1549_f = cn1;
        field_1550_e = ey;
        field_1548_g = dm1;
        field_1541_n = kd;
        field_1547_h = dm1.field_603_as + (dm1.field_605_aq - dm1.field_603_as) * f;
        field_1546_i = dm1.field_602_at + (dm1.field_604_ar - dm1.field_602_at) * f;
        field_1545_j = dm1.field_638_aI + (dm1.field_611_ak - dm1.field_638_aI) * (double)f;
        field_1544_k = dm1.field_637_aJ + (dm1.field_610_al - dm1.field_637_aJ) * (double)f;
        field_1543_l = dm1.field_636_aK + (dm1.field_609_am - dm1.field_636_aK) * (double)f;
    }

    public void func_1030_a(ic ic1, float f)
    {
        if(ic1.func_480_a(field_1545_j, field_1544_k, field_1543_l) < 4096D)
        {
            float f1 = field_1549_f.func_598_c(ic1.field_823_f, ic1.field_822_g, ic1.field_821_h);
            GL11.glColor3f(f1, f1, f1);
            func_1032_a(ic1, (double)ic1.field_823_f - field_1553_b, (double)ic1.field_822_g - field_1552_c, (double)ic1.field_821_h - field_1551_d, f);
        }
    }

    public void func_1032_a(ic ic1, double d, double d1, double d2, 
            float f)
    {
        ex ex1 = func_1031_b(ic1);
        if(ex1 != null)
        {
            ex1.func_930_a(ic1, d, d1, d2, f);
        }
    }

    public kd func_1029_a()
    {
        return field_1541_n;
    }

    private Map field_1542_m;
    public static fz field_1554_a = new fz();
    private kd field_1541_n;
    public static double field_1553_b;
    public static double field_1552_c;
    public static double field_1551_d;
    public ey field_1550_e;
    public cn field_1549_f;
    public dm field_1548_g;
    public float field_1547_h;
    public float field_1546_i;
    public double field_1545_j;
    public double field_1544_k;
    public double field_1543_l;

}
