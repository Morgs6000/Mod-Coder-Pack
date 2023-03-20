// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.*;

public class cn
    implements nm
{

    public static hm func_629_a(File file, String s)
    {
        File file1 = new File(file, "saves");
        File file2 = new File(file1, s);
        if(!file2.exists())
        {
            return null;
        }
        File file3 = new File(file2, "level.dat");
        if(file3.exists())
        {
            try
            {
                hm hm1 = x.func_1138_a(new FileInputStream(file3));
                hm hm2 = hm1.func_743_k("Data");
                return hm2;
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        return null;
    }

    public static void func_615_b(File file, String s)
    {
        File file1 = new File(file, "saves");
        File file2 = new File(file1, s);
        if(!file2.exists())
        {
            return;
        } else
        {
            func_653_a(file2.listFiles());
            file2.delete();
            return;
        }
    }

    private static void func_653_a(File afile[])
    {
        for(int i = 0; i < afile.length; i++)
        {
            if(afile[i].isDirectory())
            {
                func_653_a(afile[i].listFiles());
            }
            afile[i].delete();
        }

    }

    public cn(File file, String s)
    {
        this(file, s, (new Random()).nextLong());
    }

    public cn(String s)
    {
        field_1025_z = new ArrayList();
        field_1050_a = new ArrayList();
        field_1024_A = new ArrayList();
        field_1023_B = new TreeSet();
        field_1022_C = new HashSet();
        field_1049_b = new ArrayList();
        field_1048_c = 0L;
        field_1047_d = false;
        field_1021_D = 0x88bbffL;
        field_1020_E = 0xc0d8ffL;
        field_1019_F = 0xffffffL;
        field_1046_e = 0;
        field_1045_f = (new Random()).nextInt();
        field_1044_g = 0x3c6ef35f;
        field_1043_h = false;
        field_1018_G = System.currentTimeMillis();
        field_1041_j = 40;
        field_1040_k = new ArrayList();
        field_1037_n = new Random();
        field_1033_r = false;
        field_1032_s = new ArrayList();
        field_1030_u = 0L;
        field_1029_v = 0L;
        field_1015_J = new ArrayList();
        field_1014_K = new HashSet();
        field_1013_L = field_1037_n.nextInt(12000);
        field_1012_M = new ArrayList();
        field_1026_y = false;
        field_1028_w = s;
        field_1017_H = func_610_a(field_1031_t);
        func_644_f();
    }

    public cn(File file, String s, long l)
    {
        field_1025_z = new ArrayList();
        field_1050_a = new ArrayList();
        field_1024_A = new ArrayList();
        field_1023_B = new TreeSet();
        field_1022_C = new HashSet();
        field_1049_b = new ArrayList();
        field_1048_c = 0L;
        field_1047_d = false;
        field_1021_D = 0x88bbffL;
        field_1020_E = 0xc0d8ffL;
        field_1019_F = 0xffffffL;
        field_1046_e = 0;
        field_1045_f = (new Random()).nextInt();
        field_1044_g = 0x3c6ef35f;
        field_1043_h = false;
        field_1018_G = System.currentTimeMillis();
        field_1041_j = 40;
        field_1040_k = new ArrayList();
        field_1037_n = new Random();
        field_1033_r = false;
        field_1032_s = new ArrayList();
        field_1030_u = 0L;
        field_1029_v = 0L;
        field_1015_J = new ArrayList();
        field_1014_K = new HashSet();
        field_1013_L = field_1037_n.nextInt(12000);
        field_1012_M = new ArrayList();
        field_1026_y = false;
        field_1028_w = s;
        file.mkdirs();
        field_1031_t = new File(file, s);
        field_1031_t.mkdirs();
        try
        {
            File file1 = new File(field_1031_t, "session.lock");
            DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(file1));
            try
            {
                dataoutputstream.writeLong(field_1018_G);
            }
            finally
            {
                dataoutputstream.close();
            }
        }
        catch(IOException ioexception)
        {
            throw new RuntimeException("Failed to check session lock, aborting");
        }
        File file2 = new File(field_1031_t, "level.dat");
        field_1033_r = !file2.exists();
        if(file2.exists())
        {
            try
            {
                hm hm1 = x.func_1138_a(new FileInputStream(file2));
                hm hm2 = hm1.func_743_k("Data");
                field_1030_u = hm2.func_764_f("RandomSeed");
                field_1036_o = hm2.func_756_e("SpawnX");
                field_1035_p = hm2.func_756_e("SpawnY");
                field_1034_q = hm2.func_756_e("SpawnZ");
                field_1048_c = hm2.func_764_f("Time");
                field_1029_v = hm2.func_764_f("SizeOnDisk");
                field_1047_d = hm2.func_760_m("SnowCovered");
                if(hm2.func_751_b("Player"))
                {
                    field_1016_I = hm2.func_743_k("Player");
                }
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        } else
        {
            field_1047_d = field_1037_n.nextInt(4) == 0;
        }
        boolean flag = false;
        if(field_1030_u == 0L)
        {
            field_1030_u = l;
            flag = true;
        }
        field_1017_H = func_610_a(field_1031_t);
        if(flag)
        {
            field_1027_x = true;
            field_1036_o = 0;
            field_1035_p = 64;
            for(field_1034_q = 0; !func_703_f(field_1036_o, field_1034_q); field_1034_q += field_1037_n.nextInt(64) - field_1037_n.nextInt(64))
            {
                field_1036_o += field_1037_n.nextInt(64) - field_1037_n.nextInt(64);
            }

            field_1027_x = false;
        }
        func_644_f();
    }

    protected aw func_610_a(File file)
    {
        return new ft(this, new le(file, true), new nw(this, field_1030_u));
    }

    public void func_622_a()
    {
        if(field_1035_p <= 0)
        {
            field_1035_p = 64;
        }
        for(; func_614_g(field_1036_o, field_1034_q) == 0; field_1034_q += field_1037_n.nextInt(8) - field_1037_n.nextInt(8))
        {
            field_1036_o += field_1037_n.nextInt(8) - field_1037_n.nextInt(8);
        }

    }

    private boolean func_703_f(int i, int j)
    {
        int k = func_614_g(i, j);
        return k == ly.field_393_F.field_376_bc;
    }

    private int func_614_g(int i, int j)
    {
        int k;
        for(k = 63; func_600_a(i, k + 1, j) != 0; k++) { }
        return func_600_a(i, k, j);
    }

    public void func_608_a(dm dm1)
    {
        try
        {
            if(field_1016_I != null)
            {
                dm1.func_368_e(field_1016_I);
                field_1016_I = null;
            }
            func_674_a(dm1);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_639_a(boolean flag, nu nu1)
    {
        if(!field_1017_H.func_536_b())
        {
            return;
        }
        if(nu1 != null)
        {
            nu1.func_594_b("Saving level");
        }
        func_669_m();
        if(nu1 != null)
        {
            nu1.func_595_d("Saving chunks");
        }
        field_1017_H.func_535_a(flag, nu1);
    }

    private void func_669_m()
    {
        func_663_l();
        hm hm1 = new hm();
        hm1.func_750_a("RandomSeed", field_1030_u);
        hm1.func_758_a("SpawnX", field_1036_o);
        hm1.func_758_a("SpawnY", field_1035_p);
        hm1.func_758_a("SpawnZ", field_1034_q);
        hm1.func_750_a("Time", field_1048_c);
        hm1.func_750_a("SizeOnDisk", field_1029_v);
        hm1.func_748_a("SnowCovered", field_1047_d);
        hm1.func_750_a("LastPlayed", System.currentTimeMillis());
        dm dm1 = null;
        if(field_1040_k.size() > 0)
        {
            dm1 = (dm)field_1040_k.get(0);
        }
        if(dm1 != null)
        {
            hm hm2 = new hm();
            dm1.func_363_d(hm2);
            hm1.func_763_a("Player", hm2);
        }
        hm hm3 = new hm();
        hm3.func_762_a("Data", hm1);
        try
        {
            File file = new File(field_1031_t, "level.dat_new");
            File file1 = new File(field_1031_t, "level.dat_old");
            File file2 = new File(field_1031_t, "level.dat");
            x.func_1143_a(hm3, new FileOutputStream(file));
            if(file1.exists())
            {
                file1.delete();
            }
            file2.renameTo(file1);
            if(file2.exists())
            {
                file2.delete();
            }
            file.renameTo(file2);
            if(file.exists())
            {
                file.delete();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public boolean func_650_a(int i)
    {
        if(!field_1017_H.func_536_b())
        {
            return true;
        }
        if(i == 0)
        {
            func_669_m();
        }
        return field_1017_H.func_535_a(false, null);
    }

    public int func_600_a(int i, int j, int k)
    {
        if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return 0;
        }
        if(j < 0)
        {
            return 0;
        }
        if(j >= 128)
        {
            return 0;
        } else
        {
            return func_704_b(i >> 4, k >> 4).func_1008_a(i & 0xf, j, k & 0xf);
        }
    }

    public boolean func_630_d(int i, int j, int k)
    {
        if(j < 0 || j >= 128)
        {
            return false;
        } else
        {
            return func_620_h(i >> 4, k >> 4);
        }
    }

    public boolean func_640_a(int i, int j, int k, int l, int i1, int j1)
    {
        if(i1 < 0 || j >= 128)
        {
            return false;
        }
        i >>= 4;
        j >>= 4;
        k >>= 4;
        l >>= 4;
        i1 >>= 4;
        j1 >>= 4;
        for(int k1 = i; k1 <= l; k1++)
        {
            for(int l1 = k; l1 <= j1; l1++)
            {
                if(!func_620_h(k1, l1))
                {
                    return false;
                }
            }

        }

        return true;
    }

    private boolean func_620_h(int i, int j)
    {
        return field_1017_H.func_537_a(i, j);
    }

    public ga func_673_a(int i, int j)
    {
        return func_704_b(i >> 4, j >> 4);
    }

    public ga func_704_b(int i, int j)
    {
        return field_1017_H.func_533_b(i, j);
    }

    public boolean func_643_a(int i, int j, int k, int l, int i1)
    {
        if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return false;
        }
        if(j < 0)
        {
            return false;
        }
        if(j >= 128)
        {
            return false;
        } else
        {
            ga ga1 = func_704_b(i >> 4, k >> 4);
            return ga1.func_1010_a(i & 0xf, j, k & 0xf, l, i1);
        }
    }

    public boolean func_634_a(int i, int j, int k, int l)
    {
        if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return false;
        }
        if(j < 0)
        {
            return false;
        }
        if(j >= 128)
        {
            return false;
        } else
        {
            ga ga1 = func_704_b(i >> 4, k >> 4);
            return ga1.func_1022_a(i & 0xf, j, k & 0xf, l);
        }
    }

    public gb func_599_f(int i, int j, int k)
    {
        int l = func_600_a(i, j, k);
        if(l == 0)
        {
            return gb.field_1337_a;
        } else
        {
            return ly.field_345_n[l].field_356_bn;
        }
    }

    public int func_602_e(int i, int j, int k)
    {
        if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return 0;
        }
        if(j < 0)
        {
            return 0;
        }
        if(j >= 128)
        {
            return 0;
        } else
        {
            ga ga1 = func_704_b(i >> 4, k >> 4);
            i &= 0xf;
            k &= 0xf;
            return ga1.func_1021_b(i, j, k);
        }
    }

    public void func_691_b(int i, int j, int k, int l)
    {
        func_635_c(i, j, k, l);
    }

    public boolean func_635_c(int i, int j, int k, int l)
    {
        if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return false;
        }
        if(j < 0)
        {
            return false;
        }
        if(j >= 128)
        {
            return false;
        } else
        {
            ga ga1 = func_704_b(i >> 4, k >> 4);
            i &= 0xf;
            k &= 0xf;
            ga1.func_1009_b(i, j, k, l);
            return true;
        }
    }

    public boolean func_690_d(int i, int j, int k, int l)
    {
        if(func_634_a(i, j, k, l))
        {
            func_617_e(i, j, k, l);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_688_b(int i, int j, int k, int l, int i1)
    {
        if(func_643_a(i, j, k, l, i1))
        {
            func_617_e(i, j, k, l);
            return true;
        } else
        {
            return false;
        }
    }

    public void func_665_h(int i, int j, int k)
    {
        for(int l = 0; l < field_1032_s.size(); l++)
        {
            ((im)field_1032_s.get(l)).func_934_a(i, j, k);
        }

    }

    protected void func_617_e(int i, int j, int k, int l)
    {
        func_665_h(i, j, k);
        func_611_g(i, j, k, l);
    }

    public void func_680_f(int i, int j, int k, int l)
    {
        if(k > l)
        {
            int i1 = l;
            l = k;
            k = i1;
        }
        func_701_b(i, k, j, i, l, j);
    }

    public void func_701_b(int i, int j, int k, int l, int i1, int j1)
    {
        for(int k1 = 0; k1 < field_1032_s.size(); k1++)
        {
            ((im)field_1032_s.get(k1)).func_937_b(i, j, k, l, i1, j1);
        }

    }

    public void func_611_g(int i, int j, int k, int l)
    {
        func_655_l(i - 1, j, k, l);
        func_655_l(i + 1, j, k, l);
        func_655_l(i, j - 1, k, l);
        func_655_l(i, j + 1, k, l);
        func_655_l(i, j, k - 1, l);
        func_655_l(i, j, k + 1, l);
    }

    private void func_655_l(int i, int j, int k, int l)
    {
        if(field_1043_h || field_1026_y)
        {
            return;
        }
        ly ly1 = ly.field_345_n[func_600_a(i, j, k)];
        if(ly1 != null)
        {
            ly1.func_226_a(this, i, j, k, l);
        }
    }

    public boolean func_647_i(int i, int j, int k)
    {
        return func_704_b(i >> 4, k >> 4).func_1007_c(i & 0xf, j, k & 0xf);
    }

    public int func_618_j(int i, int j, int k)
    {
        return func_699_a(i, j, k, true);
    }

    public int func_699_a(int i, int j, int k, boolean flag)
    {
        if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return 15;
        }
        if(flag)
        {
            int l = func_600_a(i, j, k);
            if(l == ly.field_410_al.field_376_bc || l == ly.field_446_aB.field_376_bc)
            {
                int j1 = func_699_a(i, j + 1, k, false);
                int k1 = func_699_a(i + 1, j, k, false);
                int l1 = func_699_a(i - 1, j, k, false);
                int i2 = func_699_a(i, j, k + 1, false);
                int j2 = func_699_a(i, j, k - 1, false);
                if(k1 > j1)
                {
                    j1 = k1;
                }
                if(l1 > j1)
                {
                    j1 = l1;
                }
                if(i2 > j1)
                {
                    j1 = i2;
                }
                if(j2 > j1)
                {
                    j1 = j2;
                }
                return j1;
            }
        }
        if(j < 0)
        {
            return 0;
        }
        if(j >= 128)
        {
            int i1 = 15 - field_1046_e;
            if(i1 < 0)
            {
                i1 = 0;
            }
            return i1;
        } else
        {
            ga ga1 = func_704_b(i >> 4, k >> 4);
            i &= 0xf;
            k &= 0xf;
            return ga1.func_1019_c(i, j, k, field_1046_e);
        }
    }

    public boolean func_708_k(int i, int j, int k)
    {
        if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return false;
        }
        if(j < 0)
        {
            return false;
        }
        if(j >= 128)
        {
            return true;
        }
        if(!func_620_h(i >> 4, k >> 4))
        {
            return false;
        } else
        {
            ga ga1 = func_704_b(i >> 4, k >> 4);
            i &= 0xf;
            k &= 0xf;
            return ga1.func_1007_c(i, j, k);
        }
    }

    public int func_666_c(int i, int j)
    {
        if(i < 0xfe17b800 || j < 0xfe17b800 || i >= 0x1e84800 || j > 0x1e84800)
        {
            return 0;
        }
        if(!func_620_h(i >> 4, j >> 4))
        {
            return 0;
        } else
        {
            ga ga1 = func_704_b(i >> 4, j >> 4);
            return ga1.func_999_b(i & 0xf, j & 0xf);
        }
    }

    public void func_631_a(by by1, int i, int j, int k, int l)
    {
        if(!func_630_d(i, j, k))
        {
            return;
        }
        if(by1 == by.Sky)
        {
            if(func_708_k(i, j, k))
            {
                l = 15;
            }
        } else
        if(by1 == by.Block)
        {
            int i1 = func_600_a(i, j, k);
            if(ly.field_339_t[i1] > l)
            {
                l = ly.field_339_t[i1];
            }
        }
        if(func_641_a(by1, i, j, k) != l)
        {
            func_616_a(by1, i, j, k, i, j, k);
        }
    }

    public int func_641_a(by by1, int i, int j, int k)
    {
        if(j < 0 || j >= 128 || i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return by1.field_1722_c;
        }
        int l = i >> 4;
        int i1 = k >> 4;
        if(!func_620_h(l, i1))
        {
            return 0;
        } else
        {
            ga ga1 = func_704_b(l, i1);
            return ga1.func_1025_a(by1, i & 0xf, j, k & 0xf);
        }
    }

    public void func_664_b(by by1, int i, int j, int k, int l)
    {
        if(i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return;
        }
        if(j < 0)
        {
            return;
        }
        if(j >= 128)
        {
            return;
        }
        if(!func_620_h(i >> 4, k >> 4))
        {
            return;
        }
        ga ga1 = func_704_b(i >> 4, k >> 4);
        ga1.func_1011_a(by1, i & 0xf, j, k & 0xf, l);
        for(int i1 = 0; i1 < field_1032_s.size(); i1++)
        {
            ((im)field_1032_s.get(i1)).func_934_a(i, j, k);
        }

    }

    public float func_598_c(int i, int j, int k)
    {
        return field_1042_i[func_618_j(i, j, k)];
    }

    public boolean func_624_b()
    {
        return field_1046_e < 4;
    }

    public mf func_645_a(aj aj1, aj aj2)
    {
        return func_642_a(aj1, aj2, false);
    }

    public mf func_642_a(aj aj1, aj aj2, boolean flag)
    {
        if(Double.isNaN(aj1.field_1776_a) || Double.isNaN(aj1.field_1775_b) || Double.isNaN(aj1.field_1779_c))
        {
            return null;
        }
        if(Double.isNaN(aj2.field_1776_a) || Double.isNaN(aj2.field_1775_b) || Double.isNaN(aj2.field_1779_c))
        {
            return null;
        }
        int i = eo.b(aj2.field_1776_a);
        int j = eo.b(aj2.field_1775_b);
        int k = eo.b(aj2.field_1779_c);
        int l = eo.b(aj1.field_1776_a);
        int i1 = eo.b(aj1.field_1775_b);
        int j1 = eo.b(aj1.field_1779_c);
        for(int k1 = 20; k1-- >= 0;)
        {
            if(Double.isNaN(aj1.field_1776_a) || Double.isNaN(aj1.field_1775_b) || Double.isNaN(aj1.field_1779_c))
            {
                return null;
            }
            if(l == i && i1 == j && j1 == k)
            {
                return null;
            }
            double d = 999D;
            double d1 = 999D;
            double d2 = 999D;
            if(i > l)
            {
                d = (double)l + 1.0D;
            }
            if(i < l)
            {
                d = (double)l + 0.0D;
            }
            if(j > i1)
            {
                d1 = (double)i1 + 1.0D;
            }
            if(j < i1)
            {
                d1 = (double)i1 + 0.0D;
            }
            if(k > j1)
            {
                d2 = (double)j1 + 1.0D;
            }
            if(k < j1)
            {
                d2 = (double)j1 + 0.0D;
            }
            double d3 = 999D;
            double d4 = 999D;
            double d5 = 999D;
            double d6 = aj2.field_1776_a - aj1.field_1776_a;
            double d7 = aj2.field_1775_b - aj1.field_1775_b;
            double d8 = aj2.field_1779_c - aj1.field_1779_c;
            if(d != 999D)
            {
                d3 = (d - aj1.field_1776_a) / d6;
            }
            if(d1 != 999D)
            {
                d4 = (d1 - aj1.field_1775_b) / d7;
            }
            if(d2 != 999D)
            {
                d5 = (d2 - aj1.field_1779_c) / d8;
            }
            byte byte0 = 0;
            if(d3 < d4 && d3 < d5)
            {
                if(i > l)
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 5;
                }
                aj1.field_1776_a = d;
                aj1.field_1775_b += d7 * d3;
                aj1.field_1779_c += d8 * d3;
            } else
            if(d4 < d5)
            {
                if(j > i1)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                aj1.field_1776_a += d6 * d4;
                aj1.field_1775_b = d1;
                aj1.field_1779_c += d8 * d4;
            } else
            {
                if(k > j1)
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 3;
                }
                aj1.field_1776_a += d6 * d5;
                aj1.field_1775_b += d7 * d5;
                aj1.field_1779_c = d2;
            }
            aj aj3 = aj.func_1248_b(aj1.field_1776_a, aj1.field_1775_b, aj1.field_1779_c);
            l = (int)(aj3.field_1776_a = eo.b(aj1.field_1776_a));
            if(byte0 == 5)
            {
                l--;
                aj3.field_1776_a++;
            }
            i1 = (int)(aj3.field_1775_b = eo.b(aj1.field_1775_b));
            if(byte0 == 1)
            {
                i1--;
                aj3.field_1775_b++;
            }
            j1 = (int)(aj3.field_1779_c = eo.b(aj1.field_1779_c));
            if(byte0 == 3)
            {
                j1--;
                aj3.field_1779_c++;
            }
            int l1 = func_600_a(l, i1, j1);
            int i2 = func_602_e(l, i1, j1);
            ly ly1 = ly.field_345_n[l1];
            if(l1 > 0 && ly1.func_224_a(i2, flag))
            {
                mf mf = ly1.func_255_a(this, l, i1, j1, aj1, aj2);
                if(mf != null)
                {
                    return mf;
                }
            }
        }

        return null;
    }

    public void func_623_a(kh kh1, String s, float f, float f1)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((im)field_1032_s.get(i)).func_940_a(s, kh1.field_611_ak, kh1.field_610_al - (double)kh1.field_645_aB, kh1.field_609_am, f, f1);
        }

    }

    public void func_684_a(double d, double d1, double d2, String s, 
            float f, float f1)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((im)field_1032_s.get(i)).func_940_a(s, d, d1, d2, f, f1);
        }

    }

    public void func_670_a(String s, int i, int j, int k)
    {
        for(int l = 0; l < field_1032_s.size(); l++)
        {
            ((im)field_1032_s.get(l)).func_933_a(s, i, j, k);
        }

    }

    public void func_694_a(String s, double d, double d1, double d2, 
            double d3, double d4, double d5)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((im)field_1032_s.get(i)).func_939_a(s, d, d1, d2, d3, d4, d5);
        }

    }

    public boolean func_674_a(kh kh1)
    {
        int i = eo.b(kh1.field_611_ak / 16D);
        int j = eo.b(kh1.field_609_am / 16D);
        boolean flag = false;
        if(kh1 instanceof dm)
        {
            flag = true;
        }
        if(flag || func_620_h(i, j))
        {
            if(kh1 instanceof dm)
            {
                field_1040_k.add((dm)kh1);
                System.out.println((new StringBuilder()).append("Player count: ").append(field_1040_k.size()).toString());
            }
            func_704_b(i, j).func_1000_a(kh1);
            field_1050_a.add(kh1);
            func_606_b(kh1);
            return true;
        } else
        {
            return false;
        }
    }

    protected void func_606_b(kh kh1)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((im)field_1032_s.get(i)).func_941_a(kh1);
        }

    }

    protected void func_678_c(kh kh1)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((im)field_1032_s.get(i)).func_938_b(kh1);
        }

    }

    public void func_607_d(kh kh1)
    {
        kh1.func_395_F();
        if(kh1 instanceof dm)
        {
            field_1040_k.remove((dm)kh1);
            System.out.println((new StringBuilder()).append("Player count: ").append(field_1040_k.size()).toString());
        }
    }

    public void func_613_a(im im1)
    {
        field_1032_s.add(im1);
    }

    public void func_672_b(im im1)
    {
        field_1032_s.remove(im1);
    }

    public List func_697_a(kh kh1, cf cf1)
    {
        field_1015_J.clear();
        int i = eo.b(cf1.field_1698_a);
        int j = eo.b(cf1.field_1703_d + 1.0D);
        int k = eo.b(cf1.field_1697_b);
        int l = eo.b(cf1.field_1702_e + 1.0D);
        int i1 = eo.b(cf1.field_1704_c);
        int j1 = eo.b(cf1.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = i1; l1 < j1; l1++)
            {
                if(!func_630_d(k1, 64, l1))
                {
                    continue;
                }
                for(int i2 = k - 1; i2 < l; i2++)
                {
                    ly ly1 = ly.field_345_n[func_600_a(k1, i2, l1)];
                    if(ly1 != null)
                    {
                        ly1.func_230_a(this, k1, i2, l1, cf1, field_1015_J);
                    }
                }

            }

        }

        double d = 0.25D;
        List list = func_659_b(kh1, cf1.func_1177_b(d, d, d));
        for(int j2 = 0; j2 < list.size(); j2++)
        {
            cf cf2 = ((kh)list.get(j2)).func_372_f_();
            if(cf2 != null && cf2.func_1178_a(cf1))
            {
                field_1015_J.add(cf2);
            }
            cf2 = kh1.func_383_b_((kh)list.get(j2));
            if(cf2 != null && cf2.func_1178_a(cf1))
            {
                field_1015_J.add(cf2);
            }
        }

        return field_1015_J;
    }

    public int func_671_a(float f)
    {
        float f1 = func_619_c(f);
        float f2 = 1.0F - (eo.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F);
        if(f2 < 0.0F)
        {
            f2 = 0.0F;
        }
        if(f2 > 1.0F)
        {
            f2 = 1.0F;
        }
        return (int)(f2 * 11F);
    }

    public aj func_626_b(float f)
    {
        float f1 = func_619_c(f);
        float f2 = eo.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
        if(f2 < 0.0F)
        {
            f2 = 0.0F;
        }
        if(f2 > 1.0F)
        {
            f2 = 1.0F;
        }
        float f3 = (float)(field_1021_D >> 16 & 255L) / 255F;
        float f4 = (float)(field_1021_D >> 8 & 255L) / 255F;
        float f5 = (float)(field_1021_D & 255L) / 255F;
        f3 *= f2;
        f4 *= f2;
        f5 *= f2;
        return aj.func_1248_b(f3, f4, f5);
    }

    public float func_619_c(float f)
    {
        int i = (int)(field_1048_c % 24000L);
        float f1 = ((float)i + f) / 24000F - 0.25F;
        if(f1 < 0.0F)
        {
            f1++;
        }
        if(f1 > 1.0F)
        {
            f1--;
        }
        float f2 = f1;
        f1 = 1.0F - (float)((Math.cos((double)f1 * 3.1415926535897931D) + 1.0D) / 2D);
        f1 = f2 + (f1 - f2) / 3F;
        return f1;
    }

    public aj func_628_d(float f)
    {
        float f1 = func_619_c(f);
        float f2 = eo.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
        if(f2 < 0.0F)
        {
            f2 = 0.0F;
        }
        if(f2 > 1.0F)
        {
            f2 = 1.0F;
        }
        float f3 = (float)(field_1019_F >> 16 & 255L) / 255F;
        float f4 = (float)(field_1019_F >> 8 & 255L) / 255F;
        float f5 = (float)(field_1019_F & 255L) / 255F;
        f3 *= f2 * 0.9F + 0.1F;
        f4 *= f2 * 0.9F + 0.1F;
        f5 *= f2 * 0.85F + 0.15F;
        return aj.func_1248_b(f3, f4, f5);
    }

    public aj func_686_e(float f)
    {
        float f1 = func_619_c(f);
        float f2 = eo.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
        if(f2 < 0.0F)
        {
            f2 = 0.0F;
        }
        if(f2 > 1.0F)
        {
            f2 = 1.0F;
        }
        float f3 = (float)(field_1020_E >> 16 & 255L) / 255F;
        float f4 = (float)(field_1020_E >> 8 & 255L) / 255F;
        float f5 = (float)(field_1020_E & 255L) / 255F;
        f3 *= f2 * 0.94F + 0.06F;
        f4 *= f2 * 0.94F + 0.06F;
        f5 *= f2 * 0.91F + 0.09F;
        return aj.func_1248_b(f3, f4, f5);
    }

    public int func_685_d(int i, int j)
    {
        ga ga1 = func_673_a(i, j);
        int k = 127;
        i &= 0xf;
        j &= 0xf;
        while(k > 0) 
        {
            int l = ga1.func_1008_a(i, k, j);
            if(l == 0 || !ly.field_345_n[l].field_356_bn.func_880_c() && !ly.field_345_n[l].field_356_bn.func_879_d())
            {
                k--;
            } else
            {
                return k + 1;
            }
        }
        return -1;
    }

    public int func_696_e(int i, int j)
    {
        return func_673_a(i, j).func_999_b(i & 0xf, j & 0xf);
    }

    public float func_679_f(float f)
    {
        float f1 = func_619_c(f);
        float f2 = 1.0F - (eo.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.75F);
        if(f2 < 0.0F)
        {
            f2 = 0.0F;
        }
        if(f2 > 1.0F)
        {
            f2 = 1.0F;
        }
        return f2 * f2 * 0.5F;
    }

    public void func_681_h(int i, int j, int k, int l)
    {
        jf jf1 = new jf(i, j, k, l);
        byte byte0 = 8;
        if(func_640_a(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0))
        {
            if(l > 0)
            {
                jf1.func_900_a((long)ly.field_345_n[l].func_206_a() + field_1048_c);
            }
            if(!field_1022_C.contains(jf1))
            {
                field_1022_C.add(jf1);
                field_1023_B.add(jf1);
            }
        }
    }

    public void func_633_c()
    {
        field_1050_a.removeAll(field_1024_A);
        for(int i = 0; i < field_1024_A.size(); i++)
        {
            kh kh1 = (kh)field_1024_A.get(i);
            int i1 = kh1.field_657_ba;
            int k1 = kh1.field_654_bc;
            if(kh1.field_621_aZ && func_620_h(i1, k1))
            {
                func_704_b(i1, k1).func_1015_b(kh1);
            }
        }

        for(int j = 0; j < field_1024_A.size(); j++)
        {
            func_678_c((kh)field_1024_A.get(j));
        }

        field_1024_A.clear();
        for(int k = 0; k < field_1050_a.size(); k++)
        {
            kh kh2 = (kh)field_1050_a.get(k);
            if(kh2.field_616_af != null)
            {
                if(!kh2.field_616_af.field_646_aA && kh2.field_616_af.field_617_ae == kh2)
                {
                    continue;
                }
                kh2.field_616_af.field_617_ae = null;
                kh2.field_616_af = null;
            }
            if(!kh2.field_646_aA)
            {
                func_667_e(kh2);
            }
            if(!kh2.field_646_aA)
            {
                continue;
            }
            int j1 = kh2.field_657_ba;
            int l1 = kh2.field_654_bc;
            if(kh2.field_621_aZ && func_620_h(j1, l1))
            {
                func_704_b(j1, l1).func_1015_b(kh2);
            }
            field_1050_a.remove(k--);
            func_678_c(kh2);
        }

        for(int l = 0; l < field_1049_b.size(); l++)
        {
            ic ic1 = (ic)field_1049_b.get(l);
            ic1.func_475_b();
        }

    }

    protected void func_667_e(kh kh1)
    {
        int i = eo.b(kh1.field_611_ak);
        int j = eo.b(kh1.field_609_am);
        byte byte0 = 16;
        if(!func_640_a(i - byte0, 0, j - byte0, i + byte0, 128, j + byte0))
        {
            return;
        }
        kh1.field_638_aI = kh1.field_611_ak;
        kh1.field_637_aJ = kh1.field_610_al;
        kh1.field_636_aK = kh1.field_609_am;
        kh1.field_603_as = kh1.field_605_aq;
        kh1.field_602_at = kh1.field_604_ar;
        if(kh1.field_616_af != null)
        {
            kh1.func_350_p();
        } else
        {
            kh1.func_370_e_();
        }
        int k = eo.b(kh1.field_611_ak / 16D);
        int l = eo.b(kh1.field_610_al / 16D);
        int i1 = eo.b(kh1.field_609_am / 16D);
        if(!kh1.field_621_aZ || kh1.field_657_ba != k || kh1.field_656_bb != l || kh1.field_654_bc != i1)
        {
            if(kh1.field_621_aZ && func_620_h(kh1.field_657_ba, kh1.field_654_bc))
            {
                func_704_b(kh1.field_657_ba, kh1.field_654_bc).func_1016_a(kh1, kh1.field_656_bb);
            }
            if(func_620_h(k, i1))
            {
                func_704_b(k, i1).func_1000_a(kh1);
            } else
            {
                kh1.field_621_aZ = false;
                System.out.println("Removing entity because it's not in a chunk!!");
                kh1.func_395_F();
            }
        }
        if(kh1.field_617_ae != null)
        {
            if(kh1.field_617_ae.field_646_aA || kh1.field_617_ae.field_616_af != kh1)
            {
                kh1.field_617_ae.field_616_af = null;
                kh1.field_617_ae = null;
            } else
            {
                func_667_e(kh1.field_617_ae);
            }
        }
        if(Double.isNaN(kh1.field_611_ak) || Double.isInfinite(kh1.field_611_ak))
        {
            kh1.field_611_ak = kh1.field_638_aI;
        }
        if(Double.isNaN(kh1.field_610_al) || Double.isInfinite(kh1.field_610_al))
        {
            kh1.field_610_al = kh1.field_637_aJ;
        }
        if(Double.isNaN(kh1.field_609_am) || Double.isInfinite(kh1.field_609_am))
        {
            kh1.field_609_am = kh1.field_636_aK;
        }
        if(Double.isNaN(kh1.field_604_ar) || Double.isInfinite(kh1.field_604_ar))
        {
            kh1.field_604_ar = kh1.field_602_at;
        }
        if(Double.isNaN(kh1.field_605_aq) || Double.isInfinite(kh1.field_605_aq))
        {
            kh1.field_605_aq = kh1.field_603_as;
        }
    }

    public boolean func_604_a(cf cf1)
    {
        List list = func_659_b(null, cf1);
        for(int i = 0; i < list.size(); i++)
        {
            kh kh1 = (kh)list.get(i);
            if(!kh1.field_646_aA && kh1.field_618_ad)
            {
                return false;
            }
        }

        return true;
    }

    public boolean func_662_b(cf cf1)
    {
        int i = eo.b(cf1.field_1698_a);
        int j = eo.b(cf1.field_1703_d + 1.0D);
        int k = eo.b(cf1.field_1697_b);
        int l = eo.b(cf1.field_1702_e + 1.0D);
        int i1 = eo.b(cf1.field_1704_c);
        int j1 = eo.b(cf1.field_1701_f + 1.0D);
        if(cf1.field_1698_a < 0.0D)
        {
            i--;
        }
        if(cf1.field_1697_b < 0.0D)
        {
            k--;
        }
        if(cf1.field_1704_c < 0.0D)
        {
            i1--;
        }
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    ly ly1 = ly.field_345_n[func_600_a(k1, l1, i2)];
                    if(ly1 != null && ly1.field_356_bn.func_879_d())
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public boolean func_605_c(cf cf1)
    {
        int i = eo.b(cf1.field_1698_a);
        int j = eo.b(cf1.field_1703_d + 1.0D);
        int k = eo.b(cf1.field_1697_b);
        int l = eo.b(cf1.field_1702_e + 1.0D);
        int i1 = eo.b(cf1.field_1704_c);
        int j1 = eo.b(cf1.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    int j2 = func_600_a(k1, l1, i2);
                    if(j2 == ly.field_402_as.field_376_bc || j2 == ly.field_397_D.field_376_bc || j2 == ly.field_395_E.field_376_bc)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public boolean func_682_a(cf cf1, gb gb1, kh kh1)
    {
        int i = eo.b(cf1.field_1698_a);
        int j = eo.b(cf1.field_1703_d + 1.0D);
        int k = eo.b(cf1.field_1697_b);
        int l = eo.b(cf1.field_1702_e + 1.0D);
        int i1 = eo.b(cf1.field_1704_c);
        int j1 = eo.b(cf1.field_1701_f + 1.0D);
        boolean flag = false;
        aj aj1 = aj.func_1248_b(0.0D, 0.0D, 0.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    ly ly1 = ly.field_345_n[func_600_a(k1, l1, i2)];
                    if(ly1 == null || ly1.field_356_bn != gb1)
                    {
                        continue;
                    }
                    double d1 = (float)(l1 + 1) - jp.func_288_b(func_602_e(k1, l1, i2));
                    if((double)l >= d1)
                    {
                        flag = true;
                        ly1.func_257_a(this, k1, l1, i2, kh1, aj1);
                    }
                }

            }

        }

        if(aj1.func_1253_c() > 0.0D)
        {
            aj1 = aj1.func_1252_b();
            double d = 0.0040000000000000001D;
            kh1.field_608_an += aj1.field_1776_a * d;
            kh1.field_607_ao += aj1.field_1775_b * d;
            kh1.field_606_ap += aj1.field_1779_c * d;
        }
        return flag;
    }

    public boolean func_689_a(cf cf1, gb gb1)
    {
        int i = eo.b(cf1.field_1698_a);
        int j = eo.b(cf1.field_1703_d + 1.0D);
        int k = eo.b(cf1.field_1697_b);
        int l = eo.b(cf1.field_1702_e + 1.0D);
        int i1 = eo.b(cf1.field_1704_c);
        int j1 = eo.b(cf1.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    ly ly1 = ly.field_345_n[func_600_a(k1, l1, i2)];
                    if(ly1 != null && ly1.field_356_bn == gb1)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public boolean func_707_b(cf cf1, gb gb1)
    {
        int i = eo.b(cf1.field_1698_a);
        int j = eo.b(cf1.field_1703_d + 1.0D);
        int k = eo.b(cf1.field_1697_b);
        int l = eo.b(cf1.field_1702_e + 1.0D);
        int i1 = eo.b(cf1.field_1704_c);
        int j1 = eo.b(cf1.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    ly ly1 = ly.field_345_n[func_600_a(k1, l1, i2)];
                    if(ly1 == null || ly1.field_356_bn != gb1)
                    {
                        continue;
                    }
                    int j2 = func_602_e(k1, l1, i2);
                    double d = l1 + 1;
                    if(j2 < 8)
                    {
                        d = (double)(l1 + 1) - (double)j2 / 8D;
                    }
                    if(d >= cf1.field_1697_b)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public void func_676_a(kh kh1, double d, double d1, double d2, 
            float f)
    {
        (new je()).func_901_a(this, kh1, d, d1, d2, f);
    }

    public float func_675_a(aj aj1, cf cf1)
    {
        double d = 1.0D / ((cf1.field_1703_d - cf1.field_1698_a) * 2D + 1.0D);
        double d1 = 1.0D / ((cf1.field_1702_e - cf1.field_1697_b) * 2D + 1.0D);
        double d2 = 1.0D / ((cf1.field_1701_f - cf1.field_1704_c) * 2D + 1.0D);
        int i = 0;
        int j = 0;
        for(float f = 0.0F; f <= 1.0F; f = (float)((double)f + d))
        {
            for(float f1 = 0.0F; f1 <= 1.0F; f1 = (float)((double)f1 + d1))
            {
                for(float f2 = 0.0F; f2 <= 1.0F; f2 = (float)((double)f2 + d2))
                {
                    double d3 = cf1.field_1698_a + (cf1.field_1703_d - cf1.field_1698_a) * (double)f;
                    double d4 = cf1.field_1697_b + (cf1.field_1702_e - cf1.field_1697_b) * (double)f1;
                    double d5 = cf1.field_1704_c + (cf1.field_1701_f - cf1.field_1704_c) * (double)f2;
                    if(func_645_a(aj.func_1248_b(d3, d4, d5), aj1) == null)
                    {
                        i++;
                    }
                    j++;
                }

            }

        }

        return (float)i / (float)j;
    }

    public void func_612_i(int i, int j, int k, int l)
    {
        if(l == 0)
        {
            j--;
        }
        if(l == 1)
        {
            j++;
        }
        if(l == 2)
        {
            k--;
        }
        if(l == 3)
        {
            k++;
        }
        if(l == 4)
        {
            i--;
        }
        if(l == 5)
        {
            i++;
        }
        if(func_600_a(i, j, k) == ly.field_402_as.field_376_bc)
        {
            func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, "random.fizz", 0.5F, 2.6F + (field_1037_n.nextFloat() - field_1037_n.nextFloat()) * 0.8F);
            func_690_d(i, j, k, 0);
        }
    }

    public kh func_661_a(Class class1)
    {
        return null;
    }

    public String func_687_d()
    {
        return (new StringBuilder()).append("All: ").append(field_1050_a.size()).toString();
    }

    public ic func_603_b(int i, int j, int k)
    {
        ga ga1 = func_704_b(i >> 4, k >> 4);
        if(ga1 != null)
        {
            return ga1.func_1002_d(i & 0xf, j, k & 0xf);
        } else
        {
            return null;
        }
    }

    public void func_654_a(int i, int j, int k, ic ic1)
    {
        ga ga1 = func_704_b(i >> 4, k >> 4);
        if(ga1 != null)
        {
            ga1.func_1005_a(i & 0xf, j, k & 0xf, ic1);
        }
    }

    public void func_692_l(int i, int j, int k)
    {
        ga ga1 = func_704_b(i >> 4, k >> 4);
        if(ga1 != null)
        {
            ga1.func_1023_e(i & 0xf, j, k & 0xf);
        }
    }

    public boolean func_601_g(int i, int j, int k)
    {
        ly ly1 = ly.field_345_n[func_600_a(i, j, k)];
        if(ly1 == null)
        {
            return false;
        } else
        {
            return ly1.func_217_b();
        }
    }

    public void func_651_a(nu nu1)
    {
        func_639_a(true, nu1);
    }

    public boolean func_638_e()
    {
        int i = 1000;
        for(; field_1025_z.size() > 0; ((kn)field_1025_z.remove(field_1025_z.size() - 1)).func_865_a(this))
        {
            if(--i <= 0)
            {
                return true;
            }
        }

        return false;
    }

    public void func_616_a(by by1, int i, int j, int k, int l, int i1, int j1)
    {
        func_627_a(by1, i, j, k, l, i1, j1, true);
    }

    public void func_627_a(by by1, int i, int j, int k, int l, int i1, int j1, 
            boolean flag)
    {
        int k1 = (l + i) / 2;
        int l1 = (j1 + k) / 2;
        if(!func_630_d(k1, 64, l1))
        {
            return;
        }
        int i2 = field_1025_z.size();
        if(flag)
        {
            int j2 = 4;
            if(j2 > i2)
            {
                j2 = i2;
            }
            for(int k2 = 0; k2 < j2; k2++)
            {
                kn kn1 = (kn)field_1025_z.get(field_1025_z.size() - k2 - 1);
                if(kn1.field_1299_a == by1 && kn1.func_866_a(i, j, k, l, i1, j1))
                {
                    return;
                }
            }

        }
        field_1025_z.add(new kn(by1, i, j, k, l, i1, j1));
        if(field_1025_z.size() > 0x186a0)
        {
            for(; field_1025_z.size() > 50000; func_638_e()) { }
        }
    }

    public void func_644_f()
    {
        int i = func_671_a(1.0F);
        if(i != field_1046_e)
        {
            field_1046_e = i;
        }
    }

    public void func_649_g()
    {
        field_1017_H.func_532_a();
        int i = func_671_a(1.0F);
        if(i != field_1046_e)
        {
            field_1046_e = i;
            for(int j = 0; j < field_1032_s.size(); j++)
            {
                ((im)field_1032_s.get(j)).func_936_e();
            }

        }
        field_1048_c++;
        if(field_1048_c % (long)field_1041_j == 0L)
        {
            func_639_a(false, null);
        }
        func_700_a(false);
        func_652_h();
    }

    protected void func_652_h()
    {
        field_1014_K.clear();
        for(int i = 0; i < field_1040_k.size(); i++)
        {
            dm dm1 = (dm)field_1040_k.get(i);
            int j = eo.b(dm1.field_611_ak / 16D);
            int l = eo.b(dm1.field_609_am / 16D);
            byte byte0 = 9;
            for(int j1 = -byte0; j1 <= byte0; j1++)
            {
                for(int j2 = -byte0; j2 <= byte0; j2++)
                {
                    field_1014_K.add(new ol(j1 + j, j2 + l));
                }

            }

        }

        if(field_1013_L > 0)
        {
            field_1013_L--;
        }
        for(Iterator iterator = field_1014_K.iterator(); iterator.hasNext();)
        {
            ol ol1 = (ol)iterator.next();
            int k = ol1.field_189_a * 16;
            int i1 = ol1.field_188_b * 16;
            ga ga1 = func_704_b(ol1.field_189_a, ol1.field_188_b);
            if(field_1013_L == 0)
            {
                field_1045_f = field_1045_f * 3 + field_1044_g;
                int k1 = field_1045_f >> 2;
                int k2 = k1 & 0xf;
                int j3 = k1 >> 8 & 0xf;
                int i4 = k1 >> 16 & 0x7f;
                int l4 = ga1.func_1008_a(k2, i4, j3);
                k2 += k;
                j3 += i1;
                if(l4 == 0 && func_618_j(k2, i4, j3) <= field_1037_n.nextInt(8) && func_641_a(by.Sky, k2, i4, j3) <= 0)
                {
                    dm dm2 = func_683_a((double)k2 + 0.5D, (double)i4 + 0.5D, (double)j3 + 0.5D, 8D);
                    if(dm2 != null && dm2.func_360_d((double)k2 + 0.5D, (double)i4 + 0.5D, (double)j3 + 0.5D) > 4D)
                    {
                        func_684_a((double)k2 + 0.5D, (double)i4 + 0.5D, (double)j3 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + field_1037_n.nextFloat() * 0.2F);
                        field_1013_L = field_1037_n.nextInt(12000) + 6000;
                    }
                }
            }
            if(field_1047_d && field_1037_n.nextInt(4) == 0)
            {
                field_1045_f = field_1045_f * 3 + field_1044_g;
                int l1 = field_1045_f >> 2;
                int l2 = l1 & 0xf;
                int k3 = l1 >> 8 & 0xf;
                int j4 = func_685_d(l2 + k, k3 + i1);
                if(j4 >= 0 && j4 < 128 && ga1.func_1025_a(by.Block, l2, j4, k3) < 10)
                {
                    int i5 = ga1.func_1008_a(l2, j4 - 1, k3);
                    if(ga1.func_1008_a(l2, j4, k3) == 0 && ly.field_428_aT.func_243_a(this, l2 + k, j4, k3 + i1))
                    {
                        func_690_d(l2 + k, j4, k3 + i1, ly.field_428_aT.field_376_bc);
                    }
                    if(i5 == ly.field_399_C.field_376_bc && ga1.func_1021_b(l2, j4 - 1, k3) == 0)
                    {
                        func_690_d(l2 + k, j4 - 1, k3 + i1, ly.field_427_aU.field_376_bc);
                    }
                }
            }
            int i2 = 0;
            while(i2 < 80) 
            {
                field_1045_f = field_1045_f * 3 + field_1044_g;
                int i3 = field_1045_f >> 2;
                int l3 = i3 & 0xf;
                int k4 = i3 >> 8 & 0xf;
                int j5 = i3 >> 16 & 0x7f;
                byte byte1 = ga1.field_1539_b[l3 << 11 | k4 << 7 | j5];
                if(ly.field_344_o[byte1])
                {
                    ly.field_345_n[byte1].func_208_a(this, l3 + k, j5, k4 + i1, field_1037_n);
                }
                i2++;
            }
        }

    }

    public boolean func_700_a(boolean flag)
    {
        int i = field_1023_B.size();
        if(i != field_1022_C.size())
        {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if(i > 1000)
        {
            i = 1000;
        }
        for(int j = 0; j < i; j++)
        {
            jf jf1 = (jf)field_1023_B.first();
            if(!flag && jf1.field_1364_e > field_1048_c)
            {
                break;
            }
            field_1023_B.remove(jf1);
            field_1022_C.remove(jf1);
            byte byte0 = 8;
            if(!func_640_a(jf1.field_1361_a - byte0, jf1.field_1360_b - byte0, jf1.field_1366_c - byte0, jf1.field_1361_a + byte0, jf1.field_1360_b + byte0, jf1.field_1366_c + byte0))
            {
                continue;
            }
            int k = func_600_a(jf1.field_1361_a, jf1.field_1360_b, jf1.field_1366_c);
            if(k == jf1.field_1365_d && k > 0)
            {
                ly.field_345_n[k].func_208_a(this, jf1.field_1361_a, jf1.field_1360_b, jf1.field_1366_c, field_1037_n);
            }
        }

        return field_1023_B.size() != 0;
    }

    public void func_677_m(int i, int j, int k)
    {
        byte byte0 = 16;
        Random random = new Random();
        for(int l = 0; l < 1000; l++)
        {
            int i1 = (i + field_1037_n.nextInt(byte0)) - field_1037_n.nextInt(byte0);
            int j1 = (j + field_1037_n.nextInt(byte0)) - field_1037_n.nextInt(byte0);
            int k1 = (k + field_1037_n.nextInt(byte0)) - field_1037_n.nextInt(byte0);
            int l1 = func_600_a(i1, j1, k1);
            if(l1 > 0)
            {
                ly.field_345_n[l1].func_247_b(this, i1, j1, k1, random);
            }
        }

    }

    public List func_659_b(kh kh1, cf cf1)
    {
        field_1012_M.clear();
        int i = eo.b((cf1.field_1698_a - 2D) / 16D);
        int j = eo.b((cf1.field_1703_d + 2D) / 16D);
        int k = eo.b((cf1.field_1704_c - 2D) / 16D);
        int l = eo.b((cf1.field_1701_f + 2D) / 16D);
        for(int i1 = i; i1 <= j; i1++)
        {
            for(int j1 = k; j1 <= l; j1++)
            {
                if(func_620_h(i1, j1))
                {
                    func_704_b(i1, j1).func_994_a(kh1, cf1, field_1012_M);
                }
            }

        }

        return field_1012_M;
    }

    public List func_657_a(Class class1, cf cf1)
    {
        int i = eo.b((cf1.field_1698_a - 2D) / 16D);
        int j = eo.b((cf1.field_1703_d + 2D) / 16D);
        int k = eo.b((cf1.field_1704_c - 2D) / 16D);
        int l = eo.b((cf1.field_1701_f + 2D) / 16D);
        ArrayList arraylist = new ArrayList();
        for(int i1 = i; i1 <= j; i1++)
        {
            for(int j1 = k; j1 <= l; j1++)
            {
                if(func_620_h(i1, j1))
                {
                    func_704_b(i1, j1).func_1013_a(class1, cf1, arraylist);
                }
            }

        }

        return arraylist;
    }

    public List func_658_i()
    {
        return field_1050_a;
    }

    public void func_698_b(int i, int j, int k, ic ic1)
    {
        if(func_630_d(i, j, k))
        {
            func_673_a(i, k).func_1006_f();
        }
        for(int l = 0; l < field_1032_s.size(); l++)
        {
            ((im)field_1032_s.get(l)).func_935_a(i, j, k, ic1);
        }

    }

    public int func_621_b(Class class1)
    {
        int i = 0;
        for(int j = 0; j < field_1050_a.size(); j++)
        {
            kh kh1 = (kh)field_1050_a.get(j);
            if(class1.isAssignableFrom(kh1.getClass()))
            {
                i++;
            }
        }

        return i;
    }

    public void func_636_a(List list)
    {
        field_1050_a.addAll(list);
        for(int i = 0; i < list.size(); i++)
        {
            func_606_b((kh)list.get(i));
        }

    }

    public void func_632_b(List list)
    {
        field_1024_A.addAll(list);
    }

    public void func_656_j()
    {
        while(field_1017_H.func_532_a()) ;
    }

    public boolean func_695_a(int i, int j, int k, int l, boolean flag)
    {
        int i1 = func_600_a(j, k, l);
        ly ly1 = ly.field_345_n[i1];
        ly ly2 = ly.field_345_n[i];
        cf cf1 = ly2.func_221_d(this, j, k, l);
        if(flag)
        {
            cf1 = null;
        }
        if(cf1 != null && !func_604_a(cf1))
        {
            return false;
        }
        if(ly1 == ly.field_401_B || ly1 == ly.field_399_C || ly1 == ly.field_397_D || ly1 == ly.field_395_E || ly1 == ly.field_402_as || ly1 == ly.field_428_aT)
        {
            return true;
        }
        return i > 0 && ly1 == null && ly2.func_243_a(this, j, k, l);
    }

    public bl func_702_a(kh kh1, kh kh2, float f)
    {
        int i = eo.b(kh1.field_611_ak);
        int j = eo.b(kh1.field_610_al);
        int k = eo.b(kh1.field_609_am);
        int l = (int)(f + 16F);
        int i1 = i - l;
        int j1 = j - l;
        int k1 = k - l;
        int l1 = i + l;
        int i2 = j + l;
        int j2 = k + l;
        ci ci1 = new ci(this, i1, j1, k1, l1, i2, j2);
        return (new cz(ci1)).func_1137_a(kh1, kh2, f);
    }

    public bl func_637_a(kh kh1, int i, int j, int k, float f)
    {
        int l = eo.b(kh1.field_611_ak);
        int i1 = eo.b(kh1.field_610_al);
        int j1 = eo.b(kh1.field_609_am);
        int k1 = (int)(f + 8F);
        int l1 = l - k1;
        int i2 = i1 - k1;
        int j2 = j1 - k1;
        int k2 = l + k1;
        int l2 = i1 + k1;
        int i3 = j1 + k1;
        ci ci1 = new ci(this, l1, i2, j2, k2, l2, i3);
        return (new cz(ci1)).func_1131_a(kh1, i, j, k, f);
    }

    public boolean func_668_j(int i, int j, int k, int l)
    {
        int i1 = func_600_a(i, j, k);
        if(i1 == 0)
        {
            return false;
        } else
        {
            return ly.field_345_n[i1].func_228_c(this, i, j, k, l);
        }
    }

    public boolean func_646_n(int i, int j, int k)
    {
        if(func_668_j(i, j - 1, k, 0))
        {
            return true;
        }
        if(func_668_j(i, j + 1, k, 1))
        {
            return true;
        }
        if(func_668_j(i, j, k - 1, 2))
        {
            return true;
        }
        if(func_668_j(i, j, k + 1, 3))
        {
            return true;
        }
        if(func_668_j(i - 1, j, k, 4))
        {
            return true;
        }
        return func_668_j(i + 1, j, k, 5);
    }

    public boolean func_706_k(int i, int j, int k, int l)
    {
        if(func_601_g(i, j, k))
        {
            return func_646_n(i, j, k);
        }
        int i1 = func_600_a(i, j, k);
        if(i1 == 0)
        {
            return false;
        } else
        {
            return ly.field_345_n[i1].func_231_b(this, i, j, k, l);
        }
    }

    public boolean func_625_o(int i, int j, int k)
    {
        if(func_706_k(i, j - 1, k, 0))
        {
            return true;
        }
        if(func_706_k(i, j + 1, k, 1))
        {
            return true;
        }
        if(func_706_k(i, j, k - 1, 2))
        {
            return true;
        }
        if(func_706_k(i, j, k + 1, 3))
        {
            return true;
        }
        if(func_706_k(i - 1, j, k, 4))
        {
            return true;
        }
        return func_706_k(i + 1, j, k, 5);
    }

    public dm func_609_a(kh kh1, double d)
    {
        return func_683_a(kh1.field_611_ak, kh1.field_610_al, kh1.field_609_am, d);
    }

    public dm func_683_a(double d, double d1, double d2, double d3)
    {
        double d4 = -1D;
        dm dm1 = null;
        for(int i = 0; i < field_1040_k.size(); i++)
        {
            dm dm2 = (dm)field_1040_k.get(i);
            double d5 = dm2.func_360_d(d, d1, d2);
            if((d3 < 0.0D || d5 < d3 * d3) && (d4 == -1D || d5 < d4))
            {
                d4 = d5;
                dm1 = dm2;
            }
        }

        return dm1;
    }

    public void func_693_a(int i, int j, int k, int l, int i1, int j1, byte abyte0[])
    {
        int k1 = i >> 4;
        int l1 = k >> 4;
        int i2 = (i + l) - 1 >> 4;
        int j2 = (k + j1) - 1 >> 4;
        int k2 = 0;
        int l2 = j;
        int i3 = j + i1;
        if(l2 < 0)
        {
            l2 = 0;
        }
        if(i3 > 128)
        {
            i3 = 128;
        }
        for(int j3 = k1; j3 <= i2; j3++)
        {
            int k3 = i - j3 * 16;
            int l3 = (i + l) - j3 * 16;
            if(k3 < 0)
            {
                k3 = 0;
            }
            if(l3 > 16)
            {
                l3 = 16;
            }
            for(int i4 = l1; i4 <= j2; i4++)
            {
                int j4 = k - i4 * 16;
                int k4 = (k + j1) - i4 * 16;
                if(j4 < 0)
                {
                    j4 = 0;
                }
                if(k4 > 16)
                {
                    k4 = 16;
                }
                k2 = func_704_b(j3, i4).func_1004_a(abyte0, k3, l2, j4, l3, i3, k4, k2);
                func_701_b(j3 * 16 + k3, l2, i4 * 16 + j4, j3 * 16 + l3, i3, i4 * 16 + k4);
            }

        }

    }

    public void func_660_k()
    {
    }

    public void func_663_l()
    {
        try
        {
            File file = new File(field_1031_t, "session.lock");
            DataInputStream datainputstream = new DataInputStream(new FileInputStream(file));
            try
            {
                if(datainputstream.readLong() != field_1018_G)
                {
                    throw new lx("The save is being accessed from another location, aborting");
                }
            }
            finally
            {
                datainputstream.close();
            }
        }
        catch(IOException ioexception)
        {
            throw new lx("Failed to check session lock, aborting");
        }
    }

    public void func_648_a(long l)
    {
        field_1048_c = l;
    }

    public void func_705_f(kh kh1)
    {
        int i = eo.b(kh1.field_611_ak / 16D);
        int j = eo.b(kh1.field_609_am / 16D);
        byte byte0 = 2;
        for(int k = i - byte0; k <= i + byte0; k++)
        {
            for(int l = j - byte0; l <= j + byte0; l++)
            {
                func_704_b(k, l);
            }

        }

        if(!field_1050_a.contains(kh1))
        {
            System.out.println("REINSERTING PLAYER!");
            field_1050_a.add(kh1);
        }
    }

    private List field_1025_z;
    public List field_1050_a;
    private List field_1024_A;
    private TreeSet field_1023_B;
    private Set field_1022_C;
    public List field_1049_b;
    public long field_1048_c;
    public boolean field_1047_d;
    private long field_1021_D;
    private long field_1020_E;
    private long field_1019_F;
    public int field_1046_e;
    protected int field_1045_f;
    protected int field_1044_g;
    public boolean field_1043_h;
    public static float field_1042_i[];
    private final long field_1018_G;
    protected int field_1041_j;
    public List field_1040_k;
    public int field_1039_l;
    public Object field_1038_m;
    public Random field_1037_n;
    public int field_1036_o;
    public int field_1035_p;
    public int field_1034_q;
    public boolean field_1033_r;
    protected List field_1032_s;
    private aw field_1017_H;
    public File field_1031_t;
    public long field_1030_u;
    private hm field_1016_I;
    public long field_1029_v;
    public final String field_1028_w;
    public boolean field_1027_x;
    private ArrayList field_1015_J;
    private Set field_1014_K;
    private int field_1013_L;
    private List field_1012_M;
    public boolean field_1026_y;

    static 
    {
        field_1042_i = new float[16];
        float f = 0.05F;
        for(int i = 0; i <= 15; i++)
        {
            float f1 = 1.0F - (float)i / 15F;
            field_1042_i[i] = ((1.0F - f1) / (f1 * 3F + 1.0F)) * (1.0F - f) + f;
        }

    }
}
