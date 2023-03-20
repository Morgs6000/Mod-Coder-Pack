// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.util.*;

public class ga
{

    public ga(cn cn1, int i, int j)
    {
        field_1529_l = new HashMap();
        field_1528_m = new List[8];
        field_1527_n = false;
        field_1526_o = false;
        field_1524_q = false;
        field_1523_r = false;
        field_1522_s = 0L;
        field_1537_d = cn1;
        field_1531_j = i;
        field_1530_k = j;
        field_1533_h = new byte[256];
        for(int k = 0; k < field_1528_m.length; k++)
        {
            field_1528_m[k] = new ArrayList();
        }

    }

    public ga(cn cn1, byte abyte0[], int i, int j)
    {
        this(cn1, i, j);
        field_1539_b = abyte0;
        field_1536_e = new mu(abyte0.length);
        field_1535_f = new mu(abyte0.length);
        field_1534_g = new mu(abyte0.length);
    }

    public boolean func_1017_a(int i, int j)
    {
        return i == field_1531_j && j == field_1530_k;
    }

    public int func_999_b(int i, int j)
    {
        return field_1533_h[j << 4 | i] & 0xff;
    }

    public void func_1014_a()
    {
    }

    public void func_1018_b()
    {
        int i = 127;
        for(int j = 0; j < 16; j++)
        {
            for(int k = 0; k < 16; k++)
            {
                int l = 127;
                for(int i1 = j << 11 | k << 7; l > 0 && ly.field_341_r[field_1539_b[(i1 + l) - 1]] == 0; l--) { }
                field_1533_h[k << 4 | j] = (byte)l;
                if(l < i)
                {
                    i = l;
                }
            }

        }

        field_1532_i = i;
        field_1526_o = true;
    }

    public void func_1024_c()
    {
        int i = 127;
        for(int j = 0; j < 16; j++)
        {
            for(int l = 0; l < 16; l++)
            {
                field_1533_h[l << 4 | j] = -128;
                func_1003_g(j, 127, l);
                if((field_1533_h[l << 4 | j] & 0xff) < i)
                {
                    i = field_1533_h[l << 4 | j] & 0xff;
                }
            }

        }

        field_1532_i = i;
        for(int k = 0; k < 16; k++)
        {
            for(int i1 = 0; i1 < 16; i1++)
            {
                func_996_c(k, i1);
            }

        }

        field_1526_o = true;
    }

    private void func_996_c(int i, int j)
    {
        int k = func_999_b(i, j);
        int l = field_1531_j * 16 + i;
        int i1 = field_1530_k * 16 + j;
        func_1020_f(l - 1, i1, k);
        func_1020_f(l + 1, i1, k);
        func_1020_f(l, i1 - 1, k);
        func_1020_f(l, i1 + 1, k);
    }

    private void func_1020_f(int i, int j, int k)
    {
        int l = field_1537_d.func_666_c(i, j);
        if(l > k)
        {
            field_1537_d.func_616_a(by.Sky, i, k, j, i, l, j);
        } else
        if(l < k)
        {
            field_1537_d.func_616_a(by.Sky, i, l, j, i, k, j);
        }
        field_1526_o = true;
    }

    private void func_1003_g(int i, int j, int k)
    {
        int l = field_1533_h[k << 4 | i] & 0xff;
        int i1 = l;
        if(j > l)
        {
            i1 = j;
        }
        for(int j1 = i << 11 | k << 7; i1 > 0 && ly.field_341_r[field_1539_b[(j1 + i1) - 1]] == 0; i1--) { }
        if(i1 == l)
        {
            return;
        }
        field_1537_d.func_680_f(i, k, i1, l);
        field_1533_h[k << 4 | i] = (byte)i1;
        if(i1 < field_1532_i)
        {
            field_1532_i = i1;
        } else
        {
            int k1 = 127;
            for(int i2 = 0; i2 < 16; i2++)
            {
                for(int k2 = 0; k2 < 16; k2++)
                {
                    if((field_1533_h[k2 << 4 | i2] & 0xff) < k1)
                    {
                        k1 = field_1533_h[k2 << 4 | i2] & 0xff;
                    }
                }

            }

            field_1532_i = k1;
        }
        int l1 = field_1531_j * 16 + i;
        int j2 = field_1530_k * 16 + k;
        if(i1 < l)
        {
            for(int l2 = i1; l2 < l; l2++)
            {
                field_1535_f.func_770_a(i, l2, k, 15);
            }

        } else
        {
            field_1537_d.func_616_a(by.Sky, l1, l, j2, l1, i1, j2);
            for(int i3 = l; i3 < i1; i3++)
            {
                field_1535_f.func_770_a(i, i3, k, 0);
            }

        }
        int j3 = 15;
        int k3 = i1;
        while(i1 > 0 && j3 > 0) 
        {
            i1--;
            int l3 = ly.field_341_r[func_1008_a(i, i1, k)];
            if(l3 == 0)
            {
                l3 = 1;
            }
            j3 -= l3;
            if(j3 < 0)
            {
                j3 = 0;
            }
            field_1535_f.func_770_a(i, i1, k, j3);
        }
        for(; i1 > 0 && ly.field_341_r[func_1008_a(i, i1 - 1, k)] == 0; i1--) { }
        if(i1 != k3)
        {
            field_1537_d.func_616_a(by.Sky, l1 - 1, i1, j2 - 1, l1 + 1, k3, j2 + 1);
        }
        field_1526_o = true;
    }

    public int func_1008_a(int i, int j, int k)
    {
        return field_1539_b[i << 11 | k << 7 | j];
    }

    public boolean func_1010_a(int i, int j, int k, int l, int i1)
    {
        byte byte0 = (byte)l;
        int j1 = field_1533_h[k << 4 | i] & 0xff;
        int k1 = field_1539_b[i << 11 | k << 7 | j] & 0xff;
        if(k1 == l && field_1536_e.func_771_a(i, j, k) == i1)
        {
            return false;
        }
        int l1 = field_1531_j * 16 + i;
        int i2 = field_1530_k * 16 + k;
        field_1539_b[i << 11 | k << 7 | j] = byte0;
        if(k1 != 0 && !field_1537_d.field_1026_y)
        {
            ly.field_345_n[k1].func_214_b(field_1537_d, l1, j, i2);
        }
        field_1536_e.func_770_a(i, j, k, i1);
        if(ly.field_341_r[byte0] != 0)
        {
            if(j >= j1)
            {
                func_1003_g(i, j + 1, k);
            }
        } else
        if(j == j1 - 1)
        {
            func_1003_g(i, j, k);
        }
        field_1537_d.func_616_a(by.Sky, l1, j, i2, l1, j, i2);
        field_1537_d.func_616_a(by.Block, l1, j, i2, l1, j, i2);
        func_996_c(i, k);
        if(l != 0)
        {
            ly.field_345_n[l].func_235_e(field_1537_d, l1, j, i2);
        }
        field_1526_o = true;
        return true;
    }

    public boolean func_1022_a(int i, int j, int k, int l)
    {
        byte byte0 = (byte)l;
        int i1 = field_1533_h[k << 4 | i] & 0xff;
        int j1 = field_1539_b[i << 11 | k << 7 | j] & 0xff;
        if(j1 == l)
        {
            return false;
        }
        int k1 = field_1531_j * 16 + i;
        int l1 = field_1530_k * 16 + k;
        field_1539_b[i << 11 | k << 7 | j] = byte0;
        if(j1 != 0)
        {
            ly.field_345_n[j1].func_214_b(field_1537_d, k1, j, l1);
        }
        field_1536_e.func_770_a(i, j, k, 0);
        if(ly.field_341_r[byte0] != 0)
        {
            if(j >= i1)
            {
                func_1003_g(i, j + 1, k);
            }
        } else
        if(j == i1 - 1)
        {
            func_1003_g(i, j, k);
        }
        field_1537_d.func_616_a(by.Sky, k1, j, l1, k1, j, l1);
        field_1537_d.func_616_a(by.Block, k1, j, l1, k1, j, l1);
        func_996_c(i, k);
        if(l != 0 && !field_1537_d.field_1026_y)
        {
            ly.field_345_n[l].func_235_e(field_1537_d, k1, j, l1);
        }
        field_1526_o = true;
        return true;
    }

    public int func_1021_b(int i, int j, int k)
    {
        return field_1536_e.func_771_a(i, j, k);
    }

    public void func_1009_b(int i, int j, int k, int l)
    {
        field_1526_o = true;
        field_1536_e.func_770_a(i, j, k, l);
    }

    public int func_1025_a(by by1, int i, int j, int k)
    {
        if(by1 == by.Sky)
        {
            return field_1535_f.func_771_a(i, j, k);
        }
        if(by1 == by.Block)
        {
            return field_1534_g.func_771_a(i, j, k);
        } else
        {
            return 0;
        }
    }

    public void func_1011_a(by by1, int i, int j, int k, int l)
    {
        field_1526_o = true;
        if(by1 == by.Sky)
        {
            field_1535_f.func_770_a(i, j, k, l);
        } else
        if(by1 == by.Block)
        {
            field_1534_g.func_770_a(i, j, k, l);
        } else
        {
            return;
        }
    }

    public int func_1019_c(int i, int j, int k, int l)
    {
        int i1 = field_1535_f.func_771_a(i, j, k);
        if(i1 > 0)
        {
            field_1540_a = true;
        }
        i1 -= l;
        int j1 = field_1534_g.func_771_a(i, j, k);
        if(j1 > i1)
        {
            i1 = j1;
        }
        return i1;
    }

    public void func_1000_a(kh kh1)
    {
        if(field_1524_q)
        {
            return;
        }
        field_1523_r = true;
        int i = eo.b(kh1.field_611_ak / 16D);
        int j = eo.b(kh1.field_609_am / 16D);
        if(i != field_1531_j || j != field_1530_k)
        {
            System.out.println((new StringBuilder()).append("Wrong location! ").append(kh1).toString());
        }
        int k = eo.b(kh1.field_610_al / 16D);
        if(k < 0)
        {
            k = 0;
        }
        if(k >= field_1528_m.length)
        {
            k = field_1528_m.length - 1;
        }
        kh1.field_621_aZ = true;
        kh1.field_657_ba = field_1531_j;
        kh1.field_656_bb = k;
        kh1.field_654_bc = field_1530_k;
        field_1528_m[k].add(kh1);
    }

    public void func_1015_b(kh kh1)
    {
        func_1016_a(kh1, kh1.field_656_bb);
    }

    public void func_1016_a(kh kh1, int i)
    {
        if(i < 0)
        {
            i = 0;
        }
        if(i >= field_1528_m.length)
        {
            i = field_1528_m.length - 1;
        }
        field_1528_m[i].remove(kh1);
    }

    public boolean func_1007_c(int i, int j, int k)
    {
        return j >= (field_1533_h[k << 4 | i] & 0xff);
    }

    public ic func_1002_d(int i, int j, int k)
    {
        mt mt1 = new mt(i, j, k);
        ic ic1 = (ic)field_1529_l.get(mt1);
        if(ic1 == null)
        {
            int l = func_1008_a(i, j, k);
            if(!ly.field_342_q[l])
            {
                return null;
            }
            jt jt1 = (jt)ly.field_345_n[l];
            jt1.func_235_e(field_1537_d, field_1531_j * 16 + i, j, field_1530_k * 16 + k);
            ic1 = (ic)field_1529_l.get(mt1);
        }
        return ic1;
    }

    public void func_1001_a(ic ic1)
    {
        int i = ic1.field_823_f - field_1531_j * 16;
        int j = ic1.field_822_g;
        int k = ic1.field_821_h - field_1530_k * 16;
        func_1005_a(i, j, k, ic1);
    }

    public void func_1005_a(int i, int j, int k, ic ic1)
    {
        mt mt1 = new mt(i, j, k);
        ic1.field_824_e = field_1537_d;
        ic1.field_823_f = field_1531_j * 16 + i;
        ic1.field_822_g = j;
        ic1.field_821_h = field_1530_k * 16 + k;
        if(func_1008_a(i, j, k) == 0 || !(ly.field_345_n[func_1008_a(i, j, k)] instanceof jt))
        {
            System.out.println("Attempted to place a tile entity where there was no entity tile!");
            return;
        }
        if(field_1538_c)
        {
            if(field_1529_l.get(mt1) != null)
            {
                field_1537_d.field_1049_b.remove(field_1529_l.get(mt1));
            }
            field_1537_d.field_1049_b.add(ic1);
        }
        field_1529_l.put(mt1, ic1);
    }

    public void func_1023_e(int i, int j, int k)
    {
        mt mt1 = new mt(i, j, k);
        if(field_1538_c)
        {
            field_1537_d.field_1049_b.remove(field_1529_l.remove(mt1));
        }
    }

    public void func_995_d()
    {
        field_1538_c = true;
        field_1537_d.field_1049_b.addAll(field_1529_l.values());
        for(int i = 0; i < field_1528_m.length; i++)
        {
            field_1537_d.func_636_a(field_1528_m[i]);
        }

    }

    public void func_998_e()
    {
        field_1538_c = false;
        field_1537_d.field_1049_b.removeAll(field_1529_l.values());
        for(int i = 0; i < field_1528_m.length; i++)
        {
            field_1537_d.func_632_b(field_1528_m[i]);
        }

    }

    public void func_1006_f()
    {
        field_1526_o = true;
    }

    public void func_994_a(kh kh1, cf cf1, List list)
    {
        int i = eo.b((cf1.field_1697_b - 2D) / 16D);
        int j = eo.b((cf1.field_1702_e + 2D) / 16D);
        if(i < 0)
        {
            i = 0;
        }
        if(j >= field_1528_m.length)
        {
            j = field_1528_m.length - 1;
        }
        for(int k = i; k <= j; k++)
        {
            List list1 = field_1528_m[k];
            for(int l = 0; l < list1.size(); l++)
            {
                kh kh2 = (kh)list1.get(l);
                if(kh2 != kh1 && kh2.field_601_au.func_1178_a(cf1))
                {
                    list.add(kh2);
                }
            }

        }

    }

    public void func_1013_a(Class class1, cf cf1, List list)
    {
        int i = eo.b((cf1.field_1697_b - 2D) / 16D);
        int j = eo.b((cf1.field_1702_e + 2D) / 16D);
        if(i < 0)
        {
            i = 0;
        }
        if(j >= field_1528_m.length)
        {
            j = field_1528_m.length - 1;
        }
        for(int k = i; k <= j; k++)
        {
            List list1 = field_1528_m[k];
            for(int l = 0; l < list1.size(); l++)
            {
                kh kh1 = (kh)list1.get(l);
                if(class1.isAssignableFrom(kh1.getClass()) && kh1.field_601_au.func_1178_a(cf1))
                {
                    list.add(kh1);
                }
            }

        }

    }

    public boolean func_1012_a(boolean flag)
    {
        if(field_1525_p)
        {
            return false;
        }
        if(field_1523_r && field_1537_d.field_1048_c != field_1522_s)
        {
            return true;
        } else
        {
            return field_1526_o;
        }
    }

    public int func_1004_a(byte abyte0[], int i, int j, int k, int l, int i1, int j1, 
            int k1)
    {
        for(int l1 = i; l1 < l; l1++)
        {
            for(int l2 = k; l2 < j1; l2++)
            {
                int l3 = l1 << 11 | l2 << 7 | j;
                int l4 = i1 - j;
                System.arraycopy(abyte0, k1, field_1539_b, l3, l4);
                k1 += l4;
            }

        }

        func_1018_b();
        for(int i2 = i; i2 < l; i2++)
        {
            for(int i3 = k; i3 < j1; i3++)
            {
                int i4 = (i2 << 11 | i3 << 7 | j) >> 1;
                int i5 = (i1 - j) / 2;
                System.arraycopy(abyte0, k1, field_1536_e.field_1109_a, i4, i5);
                k1 += i5;
            }

        }

        for(int j2 = i; j2 < l; j2++)
        {
            for(int j3 = k; j3 < j1; j3++)
            {
                int j4 = (j2 << 11 | j3 << 7 | j) >> 1;
                int j5 = (i1 - j) / 2;
                System.arraycopy(abyte0, k1, field_1534_g.field_1109_a, j4, j5);
                k1 += j5;
            }

        }

        for(int k2 = i; k2 < l; k2++)
        {
            for(int k3 = k; k3 < j1; k3++)
            {
                int k4 = (k2 << 11 | k3 << 7 | j) >> 1;
                int k5 = (i1 - j) / 2;
                System.arraycopy(abyte0, k1, field_1535_f.field_1109_a, k4, k5);
                k1 += k5;
            }

        }

        return k1;
    }

    public Random func_997_a(long l)
    {
        return new Random(field_1537_d.field_1030_u + (long)(field_1531_j * field_1531_j * 0x4c1906) + (long)(field_1531_j * 0x5ac0db) + (long)(field_1530_k * field_1530_k) * 0x4307a7L + (long)(field_1530_k * 0x5f24f) ^ l);
    }

    public static boolean field_1540_a;
    public byte field_1539_b[];
    public boolean field_1538_c;
    public cn field_1537_d;
    public mu field_1536_e;
    public mu field_1535_f;
    public mu field_1534_g;
    public byte field_1533_h[];
    public int field_1532_i;
    public final int field_1531_j;
    public final int field_1530_k;
    public Map field_1529_l;
    public List field_1528_m[];
    public boolean field_1527_n;
    public boolean field_1526_o;
    public boolean field_1525_p;
    public boolean field_1524_q;
    public boolean field_1523_r;
    public long field_1522_s;
}
