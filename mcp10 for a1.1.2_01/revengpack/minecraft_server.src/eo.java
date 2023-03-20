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

public class eo
    implements aq
{

    private java.io.File a;
    private boolean b;

    public eo(java.io.File file, boolean flag)
    {
        a = file;
        b = flag;
    }

    private java.io.File a(int i, int j)
    {
        java.lang.String s1 = (new StringBuilder()).append("c.").append(java.lang.Integer.toString(i, 36)).append(".").append(java.lang.Integer.toString(j, 36)).append(".dat").toString();
        java.lang.String s2 = java.lang.Integer.toString(i & 0x3f, 36);
        java.lang.String s3 = java.lang.Integer.toString(j & 0x3f, 36);
        java.io.File file = new File(a, s2);
        if(!file.exists())
            if(b)
                file.mkdir();
            else
                return null;
        file = new File(file, s3);
        if(!file.exists())
            if(b)
                file.mkdir();
            else
                return null;
        file = new File(file, s1);
        if(!file.exists() && !b)
            return null;
        else
            return file;
    }

    public im a(dy dy1, int i, int j)
    {
        java.io.File file;
        file = a(i, j);
        if(file != null && file.exists())
        {
        try
        {
        s s1;
        java.io.FileInputStream fileinputstream = new FileInputStream(file);
        s1 = aj.a(((java.io.InputStream) (fileinputstream)));
        if(!s1.a("Level"))
        {
            java.lang.System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is missing level data, skipping").toString());
            return null;
        }
        if(!s1.j("Level").a("Blocks"))
        {
            java.lang.System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is missing block data, skipping").toString());
            return null;
        }
            im im1 = eo.a(dy1, s1.j("Level"));
            if(!im1.a(i, j))
            {
                java.lang.System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is in the wrong location; relocating. (Expected ").append(i).append(", ").append(j).append(", got ").append(im1.j).append(", ").append(im1.k).append(")").toString());
                s1.a("xPos", i);
                s1.a("zPos", j);
                im1 = eo.a(dy1, s1.j("Level"));
            }
            return im1;
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        }
        return null;
    }

    public void a(dy dy1, im im1)
    {
        dy1.g();
        java.io.File file = a(im1.j, im1.k);
        if(file.exists())
            dy1.u -= file.length();
        try
        {
            java.io.File file1 = new File(a, "tmp_chunk.dat");
            java.io.FileOutputStream fileoutputstream = new FileOutputStream(file1);
            s s1 = new s();
            s s2 = new s();
            s1.a("Level", ((gg) (s2)));
            a(im1, dy1, s2);
            aj.a(s1, ((java.io.OutputStream) (fileoutputstream)));
            fileoutputstream.close();
            if(file.exists())
                file.delete();
            file1.renameTo(file);
            dy1.u += file.length();
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void a(im im1, dy dy1, s s1)
    {
        dy1.g();
        s1.a("xPos", im1.j);
        s1.a("zPos", im1.k);
        s1.a("LastUpdate", dy1.c);
        s1.a("Blocks", im1.b);
        s1.a("Data", im1.e.a);
        s1.a("SkyLight", im1.f.a);
        s1.a("BlockLight", im1.g.a);
        s1.a("HeightMap", im1.h);
        s1.a("TerrainPopulated", im1.n);
        im1.r = false;
        dm dm1 = new dm();
label0:
        for(int i = 0; i < im1.m.length; i++)
        {
            java.util.Iterator iterator = im1.m[i].iterator();
            do
            {
                if(!iterator.hasNext())
                    continue label0;
                dj dj1 = (dj)iterator.next();
                im1.r = true;
                s s2 = new s();
                if(dj1.c(s2))
                    dm1.a(((gg) (s2)));
            } while(true);
        }

        s1.a("Entities", ((gg) (dm1)));
        dm dm2 = new dm();
        s s3;
        for(java.util.Iterator iterator1 = im1.l.values().iterator(); iterator1.hasNext(); dm2.a(((gg) (s3))))
        {
            as as1 = (as)iterator1.next();
            s3 = new s();
            as1.b(s3);
        }

        s1.a("TileEntities", ((gg) (dm2)));
    }

    public static im a(dy dy1, s s1)
    {
        int i = s1.d("xPos");
        int j = s1.d("zPos");
        im im1 = new im(dy1, i, j);
        im1.b = s1.i("Blocks");
        im1.e = new gt(s1.i("Data"));
        im1.f = new gt(s1.i("SkyLight"));
        im1.g = new gt(s1.i("BlockLight"));
        im1.h = s1.i("HeightMap");
        im1.n = s1.l("TerrainPopulated");
        if(!im1.e.a())
            im1.e = new gt(im1.b.length);
        if(im1.h == null || !im1.f.a())
        {
            im1.h = new byte[256];
            im1.f = new gt(im1.b.length);
            im1.b();
        }
        if(!im1.g.a())
        {
            im1.g = new gt(im1.b.length);
            im1.a();
        }
        dm dm1 = s1.k("Entities");
        if(dm1 != null)
        {
            for(int k = 0; k < dm1.b(); k++)
            {
                s s2 = (s)dm1.a(k);
                dj dj1 = gr.a(s2, dy1);
                im1.r = true;
                if(dj1 != null)
                    im1.a(dj1);
            }

        }
        dm dm2 = s1.k("TileEntities");
        if(dm2 != null)
        {
            for(int l = 0; l < dm2.b(); l++)
            {
                s s3 = (s)dm2.a(l);
                as as1 = as.c(s3);
                if(as1 != null)
                    im1.a(as1);
            }

        }
        return im1;
    }

    public void a()
    {
    }

    public void b()
    {
    }

    public void b(dy dy1, im im1)
    {
    }
}
