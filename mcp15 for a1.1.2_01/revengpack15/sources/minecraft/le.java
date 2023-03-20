// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.*;

public class le
    implements af
{

    public le(File file, boolean flag)
    {
        field_1200_a = file;
        field_1199_b = flag;
    }

    private File func_817_a(int i, int j)
    {
        String s = (new StringBuilder()).append("c.").append(Integer.toString(i, 36)).append(".").append(Integer.toString(j, 36)).append(".dat").toString();
        String s1 = Integer.toString(i & 0x3f, 36);
        String s2 = Integer.toString(j & 0x3f, 36);
        File file = new File(field_1200_a, s1);
        if(!file.exists())
        {
            if(field_1199_b)
            {
                file.mkdir();
            } else
            {
                return null;
            }
        }
        file = new File(file, s2);
        if(!file.exists())
        {
            if(field_1199_b)
            {
                file.mkdir();
            } else
            {
                return null;
            }
        }
        file = new File(file, s);
        if(!file.exists() && !field_1199_b)
        {
            return null;
        } else
        {
            return file;
        }
    }

    public ga func_813_a(cn cn1, int i, int j)
    {
        File file = func_817_a(i, j);
        if(file != null && file.exists())
        {
            try
            {
                FileInputStream fileinputstream = new FileInputStream(file);
                hm hm1 = x.func_1138_a(fileinputstream);
                if(!hm1.func_751_b("Level"))
                {
                    System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is missing level data, skipping").toString());
                    return null;
                }
                if(!hm1.func_743_k("Level").func_751_b("Blocks"))
                {
                    System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is missing block data, skipping").toString());
                    return null;
                }
                ga ga1 = func_816_a(cn1, hm1.func_743_k("Level"));
                if(!ga1.func_1017_a(i, j))
                {
                    System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is in the wrong location; relocating. (Expected ").append(i).append(", ").append(j).append(", got ").append(ga1.field_1531_j).append(", ").append(ga1.field_1530_k).append(")").toString());
                    hm1.func_758_a("xPos", i);
                    hm1.func_758_a("zPos", j);
                    ga1 = func_816_a(cn1, hm1.func_743_k("Level"));
                }
                return ga1;
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        return null;
    }

    public void func_812_a(cn cn1, ga ga1)
    {
        cn1.func_663_l();
        File file = func_817_a(ga1.field_1531_j, ga1.field_1530_k);
        if(file.exists())
        {
            cn1.field_1029_v -= file.length();
        }
        try
        {
            File file1 = new File(field_1200_a, "tmp_chunk.dat");
            FileOutputStream fileoutputstream = new FileOutputStream(file1);
            hm hm1 = new hm();
            hm hm2 = new hm();
            hm1.func_762_a("Level", hm2);
            func_818_a(ga1, cn1, hm2);
            x.func_1143_a(hm1, fileoutputstream);
            fileoutputstream.close();
            if(file.exists())
            {
                file.delete();
            }
            file1.renameTo(file);
            cn1.field_1029_v += file.length();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_818_a(ga ga1, cn cn1, hm hm1)
    {
        cn1.func_663_l();
        hm1.func_758_a("xPos", ga1.field_1531_j);
        hm1.func_758_a("zPos", ga1.field_1530_k);
        hm1.func_750_a("LastUpdate", cn1.field_1048_c);
        hm1.func_747_a("Blocks", ga1.field_1539_b);
        hm1.func_747_a("Data", ga1.field_1536_e.field_1109_a);
        hm1.func_747_a("SkyLight", ga1.field_1535_f.field_1109_a);
        hm1.func_747_a("BlockLight", ga1.field_1534_g.field_1109_a);
        hm1.func_747_a("HeightMap", ga1.field_1533_h);
        hm1.func_748_a("TerrainPopulated", ga1.field_1527_n);
        ga1.field_1523_r = false;
        ki ki1 = new ki();
label0:
        for(int i = 0; i < ga1.field_1528_m.length; i++)
        {
            Iterator iterator = ga1.field_1528_m[i].iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    continue label0;
                }
                kh kh1 = (kh)iterator.next();
                ga1.field_1523_r = true;
                hm hm2 = new hm();
                if(kh1.func_358_c(hm2))
                {
                    ki1.func_742_a(hm2);
                }
            } while(true);
        }

        hm1.func_762_a("Entities", ki1);
        ki ki2 = new ki();
        hm hm3;
        for(Iterator iterator1 = ga1.field_1529_l.values().iterator(); iterator1.hasNext(); ki2.func_742_a(hm3))
        {
            ic ic1 = (ic)iterator1.next();
            hm3 = new hm();
            ic1.func_481_b(hm3);
        }

        hm1.func_762_a("TileEntities", ki2);
    }

    public static ga func_816_a(cn cn1, hm hm1)
    {
        int i = hm1.func_756_e("xPos");
        int j = hm1.func_756_e("zPos");
        ga ga1 = new ga(cn1, i, j);
        ga1.field_1539_b = hm1.func_759_j("Blocks");
        ga1.field_1536_e = new mu(hm1.func_759_j("Data"));
        ga1.field_1535_f = new mu(hm1.func_759_j("SkyLight"));
        ga1.field_1534_g = new mu(hm1.func_759_j("BlockLight"));
        ga1.field_1533_h = hm1.func_759_j("HeightMap");
        ga1.field_1527_n = hm1.func_760_m("TerrainPopulated");
        if(!ga1.field_1536_e.func_769_a())
        {
            ga1.field_1536_e = new mu(ga1.field_1539_b.length);
        }
        if(ga1.field_1533_h == null || !ga1.field_1535_f.func_769_a())
        {
            ga1.field_1533_h = new byte[256];
            ga1.field_1535_f = new mu(ga1.field_1539_b.length);
            ga1.func_1024_c();
        }
        if(!ga1.field_1534_g.func_769_a())
        {
            ga1.field_1534_g = new mu(ga1.field_1539_b.length);
            ga1.func_1014_a();
        }
        ki ki1 = hm1.func_753_l("Entities");
        if(ki1 != null)
        {
            for(int k = 0; k < ki1.func_740_c(); k++)
            {
                hm hm2 = (hm)ki1.func_741_a(k);
                kh kh1 = ew.func_1081_a(hm2, cn1);
                ga1.field_1523_r = true;
                if(kh1 != null)
                {
                    ga1.func_1000_a(kh1);
                }
            }

        }
        ki ki2 = hm1.func_753_l("TileEntities");
        if(ki2 != null)
        {
            for(int l = 0; l < ki2.func_740_c(); l++)
            {
                hm hm3 = (hm)ki2.func_741_a(l);
                ic ic1 = ic.func_477_c(hm3);
                if(ic1 != null)
                {
                    ga1.func_1001_a(ic1);
                }
            }

        }
        return ga1;
    }

    public void func_814_a()
    {
    }

    public void func_811_b()
    {
    }

    public void func_815_b(cn cn1, ga ga1)
    {
    }

    private File field_1200_a;
    private boolean field_1199_b;
}
