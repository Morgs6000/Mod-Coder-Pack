// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.File;
import java.util.*;

public class gs extends cn
{

    public gs(gy gy1)
    {
        super("MpServer");
        field_1057_z = new LinkedList();
        field_1056_C = false;
        field_1055_D = new fi();
        field_1054_E = new HashSet();
        field_1053_F = new HashSet();
        field_1052_A = gy1;
        field_1036_o = 8;
        field_1035_p = 64;
        field_1034_q = 8;
    }

    public void func_649_g()
    {
        field_1048_c++;
        int i = func_671_a(1.0F);
        if(i != field_1046_e)
        {
            field_1046_e = i;
            for(int j = 0; j < field_1032_s.size(); j++)
            {
                ((im)field_1032_s.get(j)).func_936_e();
            }

        }
        for(int k = 0; k < 10 && !field_1053_F.isEmpty(); k++)
        {
            kh kh1 = (kh)field_1053_F.iterator().next();
            func_674_a(kh1);
        }

        field_1052_A.func_848_a();
        for(int l = 0; l < field_1057_z.size(); l++)
        {
            lc lc1 = (lc)field_1057_z.get(l);
            if(--lc1.field_1206_d == 0)
            {
                super.func_643_a(lc1.field_1202_a, lc1.field_1201_b, lc1.field_1207_c, lc1.field_1205_e, lc1.field_1204_f);
                super.func_665_h(lc1.field_1202_a, lc1.field_1201_b, lc1.field_1207_c);
                field_1057_z.remove(l--);
            }
        }

    }

    public void func_711_c(int i, int j, int k, int l, int i1, int j1)
    {
        for(int k1 = 0; k1 < field_1057_z.size(); k1++)
        {
            lc lc1 = (lc)field_1057_z.get(k1);
            if(lc1.field_1202_a >= i && lc1.field_1201_b >= j && lc1.field_1207_c >= k && lc1.field_1202_a <= l && lc1.field_1201_b <= i1 && lc1.field_1207_c <= j1)
            {
                field_1057_z.remove(k1--);
            }
        }

    }

    protected aw func_610_a(File file)
    {
        field_1058_B = new lz(this);
        return field_1058_B;
    }

    public void func_622_a()
    {
        field_1036_o = 8;
        field_1035_p = 64;
        field_1034_q = 8;
    }

    protected void func_652_h()
    {
    }

    public void func_681_h(int i, int j, int k, int l)
    {
    }

    public boolean func_700_a(boolean flag)
    {
        return false;
    }

    public void func_713_a(int i, int j, boolean flag)
    {
        if(flag)
        {
            field_1058_B.func_538_d(i, j);
        } else
        {
            field_1058_B.func_539_c(i, j);
        }
        if(!flag)
        {
            func_701_b(i * 16, 0, j * 16, i * 16 + 15, 128, j * 16 + 15);
        }
    }

    public boolean func_674_a(kh kh1)
    {
        boolean flag = super.func_674_a(kh1);
        if(kh1 instanceof bi)
        {
            field_1054_E.add(kh1);
        }
        return flag;
    }

    public void func_607_d(kh kh1)
    {
        super.func_607_d(kh1);
        if(kh1 instanceof bi)
        {
            field_1054_E.remove(kh1);
        }
    }

    protected void func_606_b(kh kh1)
    {
        super.func_606_b(kh1);
        if(field_1053_F.contains(kh1))
        {
            field_1053_F.remove(kh1);
        }
    }

    protected void func_678_c(kh kh1)
    {
        super.func_678_c(kh1);
        if(field_1054_E.contains(kh1))
        {
            field_1053_F.add(kh1);
        }
    }

    public void func_712_a(int i, kh kh1)
    {
        field_1054_E.add(kh1);
        if(!func_674_a(kh1))
        {
            field_1053_F.add(kh1);
        }
        field_1055_D.func_1061_a(i, kh1);
    }

    public kh func_709_b(int i)
    {
        return (kh)field_1055_D.func_1057_a(i);
    }

    public kh func_710_c(int i)
    {
        kh kh1 = (kh)field_1055_D.func_1052_b(i);
        if(kh1 != null)
        {
            field_1054_E.remove(kh1);
            func_607_d(kh1);
        }
        return kh1;
    }

    public boolean func_635_c(int i, int j, int k, int l)
    {
        int i1 = func_600_a(i, j, k);
        int j1 = func_602_e(i, j, k);
        if(super.func_635_c(i, j, k, l))
        {
            field_1057_z.add(new lc(this, i, j, k, i1, j1));
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_643_a(int i, int j, int k, int l, int i1)
    {
        int j1 = func_600_a(i, j, k);
        int k1 = func_602_e(i, j, k);
        if(super.func_643_a(i, j, k, l, i1))
        {
            field_1057_z.add(new lc(this, i, j, k, j1, k1));
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_634_a(int i, int j, int k, int l)
    {
        int i1 = func_600_a(i, j, k);
        int j1 = func_602_e(i, j, k);
        if(super.func_634_a(i, j, k, l))
        {
            field_1057_z.add(new lc(this, i, j, k, i1, j1));
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_714_c(int i, int j, int k, int l, int i1)
    {
        func_711_c(i, j, k, i, j, k);
        if(super.func_643_a(i, j, k, l, i1))
        {
            func_617_e(i, j, k, l);
            return true;
        } else
        {
            return false;
        }
    }

    public void func_698_b(int i, int j, int k, ic ic)
    {
        if(field_1056_C)
        {
            return;
        } else
        {
            field_1052_A.func_847_a(new ny(i, j, k, ic));
            return;
        }
    }

    public void func_660_k()
    {
        field_1052_A.func_847_a(new oh("Quitting"));
    }

    private LinkedList field_1057_z;
    private gy field_1052_A;
    private lz field_1058_B;
    private boolean field_1056_C;
    private fi field_1055_D;
    private Set field_1054_E;
    private Set field_1053_F;
}
