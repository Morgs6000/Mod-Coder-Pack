// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;

public class lz
    implements aw
{

    public lz(cn cn)
    {
        field_886_b = new HashMap();
        field_889_c = new ArrayList();
        field_887_a = new ga(cn, new byte[32768], 0, 0);
        field_887_a.field_1524_q = true;
        field_887_a.field_1525_p = true;
        field_888_d = cn;
    }

    public boolean func_537_a(int i, int j)
    {
        hc hc1 = new hc(i, j);
        return field_886_b.containsKey(hc1);
    }

    public void func_539_c(int i, int j)
    {
        ga ga1 = func_533_b(i, j);
        if(!ga1.field_1524_q)
        {
            ga1.func_998_e();
        }
        field_886_b.remove(new hc(i, j));
        field_889_c.remove(ga1);
    }

    public ga func_538_d(int i, int j)
    {
        hc hc1 = new hc(i, j);
        byte abyte0[] = new byte[32768];
        ga ga1 = new ga(field_888_d, abyte0, i, j);
        Arrays.fill(ga1.field_1535_f.field_1109_a, (byte)-1);
        field_886_b.put(hc1, ga1);
        ga1.field_1538_c = true;
        return ga1;
    }

    public ga func_533_b(int i, int j)
    {
        hc hc1 = new hc(i, j);
        ga ga1 = (ga)field_886_b.get(hc1);
        if(ga1 == null)
        {
            return field_887_a;
        } else
        {
            return ga1;
        }
    }

    public boolean func_535_a(boolean flag, nu nu)
    {
        return true;
    }

    public boolean func_532_a()
    {
        return false;
    }

    public boolean func_536_b()
    {
        return false;
    }

    public void func_534_a(aw aw1, int i, int j)
    {
    }

    private ga field_887_a;
    private Map field_886_b;
    private List field_889_c;
    private cn field_888_d;
}
