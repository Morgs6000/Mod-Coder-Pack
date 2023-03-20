// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class le
    implements af
{

    private java.io.File a;
    private boolean b;

    public le(java.io.File file, boolean flag)
    {
        a = file;
        b = flag;
    }

    private java.io.File a(int i, int j)
    {
        java.lang.String s = (new StringBuilder()).append("c.").append(java.lang.Integer.toString(i, 36)).append(".").append(java.lang.Integer.toString(j, 36)).append(".dat").toString();
        java.lang.String s1 = java.lang.Integer.toString(i & 0x3f, 36);
        java.lang.String s2 = java.lang.Integer.toString(j & 0x3f, 36);
        java.io.File file = new File(a, s1);
        if(!file.exists())
            if(b)
                file.mkdir();
            else
                return null;
        file = new File(file, s2);
        if(!file.exists())
            if(b)
                file.mkdir();
            else
                return null;
        file = new File(file, s);
        if(!file.exists() && !b)
            return null;
        else
            return file;
    }

    public ga a(cn cn1, int i, int j)
    {
        java.io.File file;
        file = a(i, j);
        if ((file != null) && (file.exists()))
        {
            try
            {
        hm hm1;
        java.io.FileInputStream fileinputstream = new FileInputStream(file);
        hm1 = x.a(((java.io.InputStream) (fileinputstream)));
        if(!hm1.b("Level"))
        {
            java.lang.System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is missing level data, skipping").toString());
            return null;
        }
        if(!hm1.k("Level").b("Blocks"))
        {
            java.lang.System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is missing block data, skipping").toString());
            return null;
        }
            ga ga1 = le.a(cn1, hm1.k("Level"));
            if(!ga1.a(i, j))
            {
                java.lang.System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is in the wrong location; relocating. (Expected ").append(i).append(", ").append(j).append(", got ").append(ga1.j).append(", ").append(ga1.k).append(")").toString());
                hm1.a("xPos", i);
                hm1.a("zPos", j);
                ga1 = le.a(cn1, hm1.k("Level"));
            }
            return ga1;
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        }
        return null;
    }

    public void a(cn cn1, ga ga1)
    {
        cn1.l();
        java.io.File file = a(ga1.j, ga1.k);
        if(file.exists())
            cn1.v -= file.length();
        try
        {
            java.io.File file1 = new File(a, "tmp_chunk.dat");
            java.io.FileOutputStream fileoutputstream = new FileOutputStream(file1);
            hm hm1 = new hm();
            hm hm2 = new hm();
            hm1.a("Level", ((el) (hm2)));
            a(ga1, cn1, hm2);
            x.a(hm1, ((java.io.OutputStream) (fileoutputstream)));
            fileoutputstream.close();
            if(file.exists())
                file.delete();
            file1.renameTo(file);
            cn1.v += file.length();
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void a(ga ga1, cn cn1, hm hm1)
    {
        cn1.l();
        hm1.a("xPos", ga1.j);
        hm1.a("zPos", ga1.k);
        hm1.a("LastUpdate", cn1.c);
        hm1.a("Blocks", ga1.b);
        hm1.a("Data", ga1.e.a);
        hm1.a("SkyLight", ga1.f.a);
        hm1.a("BlockLight", ga1.g.a);
        hm1.a("HeightMap", ga1.h);
        hm1.a("TerrainPopulated", ga1.n);
        ga1.r = false;
        ki ki1 = new ki();
label0:
        for(int i = 0; i < ga1.m.length; i++)
        {
            java.util.Iterator iterator = ga1.m[i].iterator();
            do
            {
                if(!iterator.hasNext())
                    continue label0;
                kh kh1 = (kh)iterator.next();
                ga1.r = true;
                hm hm2 = new hm();
                if(kh1.c(hm2))
                    ki1.a(((el) (hm2)));
            } while(true);
        }

        hm1.a("Entities", ((el) (ki1)));
        ki ki2 = new ki();
        hm hm3;
        for(java.util.Iterator iterator1 = ga1.l.values().iterator(); iterator1.hasNext(); ki2.a(((el) (hm3))))
        {
            ic ic1 = (ic)iterator1.next();
            hm3 = new hm();
            ic1.b(hm3);
        }

        hm1.a("TileEntities", ((el) (ki2)));
    }

    public static ga a(cn cn1, hm hm1)
    {
        int i = hm1.e("xPos");
        int j = hm1.e("zPos");
        ga ga1 = new ga(cn1, i, j);
        ga1.b = hm1.j("Blocks");
        ga1.e = new mu(hm1.j("Data"));
        ga1.f = new mu(hm1.j("SkyLight"));
        ga1.g = new mu(hm1.j("BlockLight"));
        ga1.h = hm1.j("HeightMap");
        ga1.n = hm1.m("TerrainPopulated");
        if(!ga1.e.a())
            ga1.e = new mu(ga1.b.length);
        if(ga1.h == null || !ga1.f.a())
        {
            ga1.h = new byte[256];
            ga1.f = new mu(ga1.b.length);
            ga1.c();
        }
        if(!ga1.g.a())
        {
            ga1.g = new mu(ga1.b.length);
            ga1.a();
        }
        ki ki1 = hm1.l("Entities");
        if(ki1 != null)
        {
            for(int k = 0; k < ki1.c(); k++)
            {
                hm hm2 = (hm)ki1.a(k);
                kh kh1 = ew.a(hm2, cn1);
                ga1.r = true;
                if(kh1 != null)
                    ga1.a(kh1);
            }

        }
        ki ki2 = hm1.l("TileEntities");
        if(ki2 != null)
        {
            for(int l = 0; l < ki2.c(); l++)
            {
                hm hm3 = (hm)ki2.a(l);
                ic ic1 = ic.c(hm3);
                if(ic1 != null)
                    ga1.a(ic1);
            }

        }
        return ga1;
    }

    public void a()
    {
    }

    public void b()
    {
    }

    public void b(cn cn1, ga ga1)
    {
    }
}
