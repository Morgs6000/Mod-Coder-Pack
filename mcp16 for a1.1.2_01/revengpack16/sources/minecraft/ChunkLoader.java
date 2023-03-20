// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.*;

public class ChunkLoader
    implements IChunkLoader
{

    public ChunkLoader(File file, boolean flag)
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

    public Chunk func_813_a(World world, int i, int j)
    {
        File file = func_817_a(i, j);
        if(file != null && file.exists())
        {
            try
            {
                FileInputStream fileinputstream = new FileInputStream(file);
                NBTTagCompound nbttagcompound = CompressedStreamTools.func_1138_a(fileinputstream);
                if(!nbttagcompound.func_751_b("Level"))
                {
                    System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is missing level data, skipping").toString());
                    return null;
                }
                if(!nbttagcompound.func_743_k("Level").func_751_b("Blocks"))
                {
                    System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is missing block data, skipping").toString());
                    return null;
                }
                Chunk chunk = func_816_a(world, nbttagcompound.func_743_k("Level"));
                if(!chunk.func_1017_a(i, j))
                {
                    System.out.println((new StringBuilder()).append("Chunk file at ").append(i).append(",").append(j).append(" is in the wrong location; relocating. (Expected ").append(i).append(", ").append(j).append(", got ").append(chunk.xPos).append(", ").append(chunk.zPos).append(")").toString());
                    nbttagcompound.func_758_a("xPos", i);
                    nbttagcompound.func_758_a("zPos", j);
                    chunk = func_816_a(world, nbttagcompound.func_743_k("Level"));
                }
                return chunk;
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        return null;
    }

    public void func_812_a(World world, Chunk chunk)
    {
        world.func_663_l();
        File file = func_817_a(chunk.xPos, chunk.zPos);
        if(file.exists())
        {
            world.sizeOnDisk -= file.length();
        }
        try
        {
            File file1 = new File(field_1200_a, "tmp_chunk.dat");
            FileOutputStream fileoutputstream = new FileOutputStream(file1);
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            nbttagcompound.func_762_a("Level", nbttagcompound1);
            func_818_a(chunk, world, nbttagcompound1);
            CompressedStreamTools.func_1143_a(nbttagcompound, fileoutputstream);
            fileoutputstream.close();
            if(file.exists())
            {
                file.delete();
            }
            file1.renameTo(file);
            world.sizeOnDisk += file.length();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_818_a(Chunk chunk, World world, NBTTagCompound nbttagcompound)
    {
        world.func_663_l();
        nbttagcompound.func_758_a("xPos", chunk.xPos);
        nbttagcompound.func_758_a("zPos", chunk.zPos);
        nbttagcompound.func_750_a("LastUpdate", world.worldTime);
        nbttagcompound.func_747_a("Blocks", chunk.blocks);
        nbttagcompound.func_747_a("Data", chunk.data.data);
        nbttagcompound.func_747_a("SkyLight", chunk.skylightMap.data);
        nbttagcompound.func_747_a("BlockLight", chunk.blocklightMap.data);
        nbttagcompound.func_747_a("HeightMap", chunk.heightMap);
        nbttagcompound.func_748_a("TerrainPopulated", chunk.isTerrainPopulated);
        chunk.field_1523_r = false;
        NBTTagList nbttaglist = new NBTTagList();
label0:
        for(int i = 0; i < chunk.field_1528_m.length; i++)
        {
            Iterator iterator = chunk.field_1528_m[i].iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    continue label0;
                }
                Entity entity = (Entity)iterator.next();
                chunk.field_1523_r = true;
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                if(entity.func_358_c(nbttagcompound1))
                {
                    nbttaglist.func_742_a(nbttagcompound1);
                }
            } while(true);
        }

        nbttagcompound.func_762_a("Entities", nbttaglist);
        NBTTagList nbttaglist1 = new NBTTagList();
        NBTTagCompound nbttagcompound2;
        for(Iterator iterator1 = chunk.field_1529_l.values().iterator(); iterator1.hasNext(); nbttaglist1.func_742_a(nbttagcompound2))
        {
            TileEntity tileentity = (TileEntity)iterator1.next();
            nbttagcompound2 = new NBTTagCompound();
            tileentity.func_481_b(nbttagcompound2);
        }

        nbttagcompound.func_762_a("TileEntities", nbttaglist1);
    }

    public static Chunk func_816_a(World world, NBTTagCompound nbttagcompound)
    {
        int i = nbttagcompound.func_756_e("xPos");
        int j = nbttagcompound.func_756_e("zPos");
        Chunk chunk = new Chunk(world, i, j);
        chunk.blocks = nbttagcompound.func_759_j("Blocks");
        chunk.data = new NibbleArray(nbttagcompound.func_759_j("Data"));
        chunk.skylightMap = new NibbleArray(nbttagcompound.func_759_j("SkyLight"));
        chunk.blocklightMap = new NibbleArray(nbttagcompound.func_759_j("BlockLight"));
        chunk.heightMap = nbttagcompound.func_759_j("HeightMap");
        chunk.isTerrainPopulated = nbttagcompound.func_760_m("TerrainPopulated");
        if(!chunk.data.func_769_a())
        {
            chunk.data = new NibbleArray(chunk.blocks.length);
        }
        if(chunk.heightMap == null || !chunk.skylightMap.func_769_a())
        {
            chunk.heightMap = new byte[256];
            chunk.skylightMap = new NibbleArray(chunk.blocks.length);
            chunk.func_1024_c();
        }
        if(!chunk.blocklightMap.func_769_a())
        {
            chunk.blocklightMap = new NibbleArray(chunk.blocks.length);
            chunk.func_1014_a();
        }
        NBTTagList nbttaglist = nbttagcompound.func_753_l("Entities");
        if(nbttaglist != null)
        {
            for(int k = 0; k < nbttaglist.func_740_c(); k++)
            {
                NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.func_741_a(k);
                Entity entity = EntityList.func_1081_a(nbttagcompound1, world);
                chunk.field_1523_r = true;
                if(entity != null)
                {
                    chunk.func_1000_a(entity);
                }
            }

        }
        NBTTagList nbttaglist1 = nbttagcompound.func_753_l("TileEntities");
        if(nbttaglist1 != null)
        {
            for(int l = 0; l < nbttaglist1.func_740_c(); l++)
            {
                NBTTagCompound nbttagcompound2 = (NBTTagCompound)nbttaglist1.func_741_a(l);
                TileEntity tileentity = TileEntity.func_477_c(nbttagcompound2);
                if(tileentity != null)
                {
                    chunk.func_1001_a(tileentity);
                }
            }

        }
        return chunk;
    }

    public void func_814_a()
    {
    }

    public void func_811_b()
    {
    }

    public void func_815_b(World world, Chunk chunk)
    {
    }

    private File field_1200_a;
    private boolean field_1199_b;
}
