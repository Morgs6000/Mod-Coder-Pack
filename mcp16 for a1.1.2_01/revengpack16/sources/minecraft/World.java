// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.*;

public class World
    implements IBlockAccess
{

    public static NBTTagCompound func_629_a(File file, String s)
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
                NBTTagCompound nbttagcompound = CompressedStreamTools.func_1138_a(new FileInputStream(file3));
                NBTTagCompound nbttagcompound1 = nbttagcompound.func_743_k("Data");
                return nbttagcompound1;
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

    public World(File file, String s)
    {
        this(file, s, (new Random()).nextLong());
    }

    public World(String s)
    {
        field_1025_z = new ArrayList();
        field_1050_a = new ArrayList();
        field_1024_A = new ArrayList();
        field_1023_B = new TreeSet();
        field_1022_C = new HashSet();
        field_1049_b = new ArrayList();
        worldTime = 0L;
        snowCovered = false;
        field_1021_D = 0x88bbffL;
        field_1020_E = 0xc0d8ffL;
        field_1019_F = 0xffffffL;
        field_1046_e = 0;
        field_1045_f = (new Random()).nextInt();
        field_1044_g = 0x3c6ef35f;
        field_1043_h = false;
        field_1018_G = System.currentTimeMillis();
        field_1041_j = 40;
        playerEntities = new ArrayList();
        field_1037_n = new Random();
        field_1033_r = false;
        field_1032_s = new ArrayList();
        randomSeed = 0L;
        sizeOnDisk = 0L;
        field_1015_J = new ArrayList();
        field_1014_K = new HashSet();
        field_1013_L = field_1037_n.nextInt(12000);
        field_1012_M = new ArrayList();
        field_1026_y = false;
        field_1028_w = s;
        field_1017_H = func_610_a(field_1031_t);
        func_644_f();
    }

    public World(File file, String s, long l)
    {
        field_1025_z = new ArrayList();
        field_1050_a = new ArrayList();
        field_1024_A = new ArrayList();
        field_1023_B = new TreeSet();
        field_1022_C = new HashSet();
        field_1049_b = new ArrayList();
        worldTime = 0L;
        snowCovered = false;
        field_1021_D = 0x88bbffL;
        field_1020_E = 0xc0d8ffL;
        field_1019_F = 0xffffffL;
        field_1046_e = 0;
        field_1045_f = (new Random()).nextInt();
        field_1044_g = 0x3c6ef35f;
        field_1043_h = false;
        field_1018_G = System.currentTimeMillis();
        field_1041_j = 40;
        playerEntities = new ArrayList();
        field_1037_n = new Random();
        field_1033_r = false;
        field_1032_s = new ArrayList();
        randomSeed = 0L;
        sizeOnDisk = 0L;
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
                NBTTagCompound nbttagcompound = CompressedStreamTools.func_1138_a(new FileInputStream(file2));
                NBTTagCompound nbttagcompound1 = nbttagcompound.func_743_k("Data");
                randomSeed = nbttagcompound1.func_764_f("RandomSeed");
                spawnX = nbttagcompound1.func_756_e("SpawnX");
                spawnY = nbttagcompound1.func_756_e("SpawnY");
                spawnZ = nbttagcompound1.func_756_e("SpawnZ");
                worldTime = nbttagcompound1.func_764_f("Time");
                sizeOnDisk = nbttagcompound1.func_764_f("SizeOnDisk");
                snowCovered = nbttagcompound1.func_760_m("SnowCovered");
                if(nbttagcompound1.func_751_b("Player"))
                {
                    nbtCompoundPlayer = nbttagcompound1.func_743_k("Player");
                }
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        } else
        {
            snowCovered = field_1037_n.nextInt(4) == 0;
        }
        boolean flag = false;
        if(randomSeed == 0L)
        {
            randomSeed = l;
            flag = true;
        }
        field_1017_H = func_610_a(field_1031_t);
        if(flag)
        {
            field_1027_x = true;
            spawnX = 0;
            spawnY = 64;
            for(spawnZ = 0; !func_703_f(spawnX, spawnZ); spawnZ += field_1037_n.nextInt(64) - field_1037_n.nextInt(64))
            {
                spawnX += field_1037_n.nextInt(64) - field_1037_n.nextInt(64);
            }

            field_1027_x = false;
        }
        func_644_f();
    }

    protected IChunkProvider func_610_a(File file)
    {
        return new ChunkProviderLoadOrGenerate(this, new ChunkLoader(file, true), new ChunkProviderGenerate(this, randomSeed));
    }

    public void func_622_a()
    {
        if(spawnY <= 0)
        {
            spawnY = 64;
        }
        for(; func_614_g(spawnX, spawnZ) == 0; spawnZ += field_1037_n.nextInt(8) - field_1037_n.nextInt(8))
        {
            spawnX += field_1037_n.nextInt(8) - field_1037_n.nextInt(8);
        }

    }

    private boolean func_703_f(int i, int j)
    {
        int k = func_614_g(i, j);
        return k == Block.sand.blockID;
    }

    private int func_614_g(int i, int j)
    {
        int k;
        for(k = 63; func_600_a(i, k + 1, j) != 0; k++) { }
        return func_600_a(i, k, j);
    }

    public void func_608_a(EntityPlayer entityplayer)
    {
        try
        {
            if(nbtCompoundPlayer != null)
            {
                entityplayer.func_368_e(nbtCompoundPlayer);
                nbtCompoundPlayer = null;
            }
            func_674_a(entityplayer);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_639_a(boolean flag, IProgressUpdate iprogressupdate)
    {
        if(!field_1017_H.func_536_b())
        {
            return;
        }
        if(iprogressupdate != null)
        {
            iprogressupdate.func_594_b("Saving level");
        }
        func_669_m();
        if(iprogressupdate != null)
        {
            iprogressupdate.func_595_d("Saving chunks");
        }
        field_1017_H.func_535_a(flag, iprogressupdate);
    }

    private void func_669_m()
    {
        func_663_l();
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.func_750_a("RandomSeed", randomSeed);
        nbttagcompound.func_758_a("SpawnX", spawnX);
        nbttagcompound.func_758_a("SpawnY", spawnY);
        nbttagcompound.func_758_a("SpawnZ", spawnZ);
        nbttagcompound.func_750_a("Time", worldTime);
        nbttagcompound.func_750_a("SizeOnDisk", sizeOnDisk);
        nbttagcompound.func_748_a("SnowCovered", snowCovered);
        nbttagcompound.func_750_a("LastPlayed", System.currentTimeMillis());
        EntityPlayer entityplayer = null;
        if(playerEntities.size() > 0)
        {
            entityplayer = (EntityPlayer)playerEntities.get(0);
        }
        if(entityplayer != null)
        {
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            entityplayer.func_363_d(nbttagcompound1);
            nbttagcompound.func_763_a("Player", nbttagcompound1);
        }
        NBTTagCompound nbttagcompound2 = new NBTTagCompound();
        nbttagcompound2.func_762_a("Data", nbttagcompound);
        try
        {
            File file = new File(field_1031_t, "level.dat_new");
            File file1 = new File(field_1031_t, "level.dat_old");
            File file2 = new File(field_1031_t, "level.dat");
            CompressedStreamTools.func_1143_a(nbttagcompound2, new FileOutputStream(file));
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

    public Chunk func_673_a(int i, int j)
    {
        return func_704_b(i >> 4, j >> 4);
    }

    public Chunk func_704_b(int i, int j)
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
            Chunk chunk = func_704_b(i >> 4, k >> 4);
            return chunk.func_1010_a(i & 0xf, j, k & 0xf, l, i1);
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
            Chunk chunk = func_704_b(i >> 4, k >> 4);
            return chunk.func_1022_a(i & 0xf, j, k & 0xf, l);
        }
    }

    public Material func_599_f(int i, int j, int k)
    {
        int l = func_600_a(i, j, k);
        if(l == 0)
        {
            return Material.air;
        } else
        {
            return Block.allBlocks[l].material;
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
            Chunk chunk = func_704_b(i >> 4, k >> 4);
            i &= 0xf;
            k &= 0xf;
            return chunk.func_1021_b(i, j, k);
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
            Chunk chunk = func_704_b(i >> 4, k >> 4);
            i &= 0xf;
            k &= 0xf;
            chunk.func_1009_b(i, j, k, l);
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
            ((IWorldAccess)field_1032_s.get(l)).func_934_a(i, j, k);
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
            ((IWorldAccess)field_1032_s.get(k1)).func_937_b(i, j, k, l, i1, j1);
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
        Block block = Block.allBlocks[func_600_a(i, j, k)];
        if(block != null)
        {
            block.func_226_a(this, i, j, k, l);
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
            if(l == Block.stairSingle.blockID || l == Block.tilledField.blockID)
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
            Chunk chunk = func_704_b(i >> 4, k >> 4);
            i &= 0xf;
            k &= 0xf;
            return chunk.func_1019_c(i, j, k, field_1046_e);
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
            Chunk chunk = func_704_b(i >> 4, k >> 4);
            i &= 0xf;
            k &= 0xf;
            return chunk.func_1007_c(i, j, k);
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
            Chunk chunk = func_704_b(i >> 4, j >> 4);
            return chunk.func_999_b(i & 0xf, j & 0xf);
        }
    }

    public void func_631_a(EnumSkyBlock enumskyblock, int i, int j, int k, int l)
    {
        if(!func_630_d(i, j, k))
        {
            return;
        }
        if(enumskyblock == EnumSkyBlock.Sky)
        {
            if(func_708_k(i, j, k))
            {
                l = 15;
            }
        } else
        if(enumskyblock == EnumSkyBlock.Block)
        {
            int i1 = func_600_a(i, j, k);
            if(Block.field_339_t[i1] > l)
            {
                l = Block.field_339_t[i1];
            }
        }
        if(func_641_a(enumskyblock, i, j, k) != l)
        {
            func_616_a(enumskyblock, i, j, k, i, j, k);
        }
    }

    public int func_641_a(EnumSkyBlock enumskyblock, int i, int j, int k)
    {
        if(j < 0 || j >= 128 || i < 0xfe17b800 || k < 0xfe17b800 || i >= 0x1e84800 || k > 0x1e84800)
        {
            return enumskyblock.field_1722_c;
        }
        int l = i >> 4;
        int i1 = k >> 4;
        if(!func_620_h(l, i1))
        {
            return 0;
        } else
        {
            Chunk chunk = func_704_b(l, i1);
            return chunk.func_1025_a(enumskyblock, i & 0xf, j, k & 0xf);
        }
    }

    public void func_664_b(EnumSkyBlock enumskyblock, int i, int j, int k, int l)
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
        Chunk chunk = func_704_b(i >> 4, k >> 4);
        chunk.func_1011_a(enumskyblock, i & 0xf, j, k & 0xf, l);
        for(int i1 = 0; i1 < field_1032_s.size(); i1++)
        {
            ((IWorldAccess)field_1032_s.get(i1)).func_934_a(i, j, k);
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

    public MovingObjectPosition func_645_a(Vec3D vec3d, Vec3D vec3d1)
    {
        return func_642_a(vec3d, vec3d1, false);
    }

    public MovingObjectPosition func_642_a(Vec3D vec3d, Vec3D vec3d1, boolean flag)
    {
        if(Double.isNaN(vec3d.field_1776_a) || Double.isNaN(vec3d.field_1775_b) || Double.isNaN(vec3d.field_1779_c))
        {
            return null;
        }
        if(Double.isNaN(vec3d1.field_1776_a) || Double.isNaN(vec3d1.field_1775_b) || Double.isNaN(vec3d1.field_1779_c))
        {
            return null;
        }
        int i = MathHelper.func_1108_b(vec3d1.field_1776_a);
        int j = MathHelper.func_1108_b(vec3d1.field_1775_b);
        int k = MathHelper.func_1108_b(vec3d1.field_1779_c);
        int l = MathHelper.func_1108_b(vec3d.field_1776_a);
        int i1 = MathHelper.func_1108_b(vec3d.field_1775_b);
        int j1 = MathHelper.func_1108_b(vec3d.field_1779_c);
        for(int k1 = 20; k1-- >= 0;)
        {
            if(Double.isNaN(vec3d.field_1776_a) || Double.isNaN(vec3d.field_1775_b) || Double.isNaN(vec3d.field_1779_c))
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
            double d6 = vec3d1.field_1776_a - vec3d.field_1776_a;
            double d7 = vec3d1.field_1775_b - vec3d.field_1775_b;
            double d8 = vec3d1.field_1779_c - vec3d.field_1779_c;
            if(d != 999D)
            {
                d3 = (d - vec3d.field_1776_a) / d6;
            }
            if(d1 != 999D)
            {
                d4 = (d1 - vec3d.field_1775_b) / d7;
            }
            if(d2 != 999D)
            {
                d5 = (d2 - vec3d.field_1779_c) / d8;
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
                vec3d.field_1776_a = d;
                vec3d.field_1775_b += d7 * d3;
                vec3d.field_1779_c += d8 * d3;
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
                vec3d.field_1776_a += d6 * d4;
                vec3d.field_1775_b = d1;
                vec3d.field_1779_c += d8 * d4;
            } else
            {
                if(k > j1)
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 3;
                }
                vec3d.field_1776_a += d6 * d5;
                vec3d.field_1775_b += d7 * d5;
                vec3d.field_1779_c = d2;
            }
            Vec3D vec3d2 = Vec3D.func_1248_b(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c);
            l = (int)(vec3d2.field_1776_a = MathHelper.func_1108_b(vec3d.field_1776_a));
            if(byte0 == 5)
            {
                l--;
                vec3d2.field_1776_a++;
            }
            i1 = (int)(vec3d2.field_1775_b = MathHelper.func_1108_b(vec3d.field_1775_b));
            if(byte0 == 1)
            {
                i1--;
                vec3d2.field_1775_b++;
            }
            j1 = (int)(vec3d2.field_1779_c = MathHelper.func_1108_b(vec3d.field_1779_c));
            if(byte0 == 3)
            {
                j1--;
                vec3d2.field_1779_c++;
            }
            int l1 = func_600_a(l, i1, j1);
            int i2 = func_602_e(l, i1, j1);
            Block block = Block.allBlocks[l1];
            if(l1 > 0 && block.func_224_a(i2, flag))
            {
                MovingObjectPosition movingobjectposition = block.func_255_a(this, l, i1, j1, vec3d, vec3d1);
                if(movingobjectposition != null)
                {
                    return movingobjectposition;
                }
            }
        }

        return null;
    }

    public void func_623_a(Entity entity, String s, float f, float f1)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((IWorldAccess)field_1032_s.get(i)).func_940_a(s, entity.posX, entity.posY - (double)entity.field_645_aB, entity.posZ, f, f1);
        }

    }

    public void func_684_a(double d, double d1, double d2, String s, 
            float f, float f1)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((IWorldAccess)field_1032_s.get(i)).func_940_a(s, d, d1, d2, f, f1);
        }

    }

    public void func_670_a(String s, int i, int j, int k)
    {
        for(int l = 0; l < field_1032_s.size(); l++)
        {
            ((IWorldAccess)field_1032_s.get(l)).func_933_a(s, i, j, k);
        }

    }

    public void func_694_a(String s, double d, double d1, double d2, 
            double d3, double d4, double d5)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((IWorldAccess)field_1032_s.get(i)).func_939_a(s, d, d1, d2, d3, d4, d5);
        }

    }

    public boolean func_674_a(Entity entity)
    {
        int i = MathHelper.func_1108_b(entity.posX / 16D);
        int j = MathHelper.func_1108_b(entity.posZ / 16D);
        boolean flag = false;
        if(entity instanceof EntityPlayer)
        {
            flag = true;
        }
        if(flag || func_620_h(i, j))
        {
            if(entity instanceof EntityPlayer)
            {
                playerEntities.add((EntityPlayer)entity);
                System.out.println((new StringBuilder()).append("Player count: ").append(playerEntities.size()).toString());
            }
            func_704_b(i, j).func_1000_a(entity);
            field_1050_a.add(entity);
            func_606_b(entity);
            return true;
        } else
        {
            return false;
        }
    }

    protected void func_606_b(Entity entity)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((IWorldAccess)field_1032_s.get(i)).func_941_a(entity);
        }

    }

    protected void func_678_c(Entity entity)
    {
        for(int i = 0; i < field_1032_s.size(); i++)
        {
            ((IWorldAccess)field_1032_s.get(i)).func_938_b(entity);
        }

    }

    public void func_607_d(Entity entity)
    {
        entity.func_395_F();
        if(entity instanceof EntityPlayer)
        {
            playerEntities.remove((EntityPlayer)entity);
            System.out.println((new StringBuilder()).append("Player count: ").append(playerEntities.size()).toString());
        }
    }

    public void func_613_a(IWorldAccess iworldaccess)
    {
        field_1032_s.add(iworldaccess);
    }

    public void func_672_b(IWorldAccess iworldaccess)
    {
        field_1032_s.remove(iworldaccess);
    }

    public List func_697_a(Entity entity, AxisAlignedBB axisalignedbb)
    {
        field_1015_J.clear();
        int i = MathHelper.func_1108_b(axisalignedbb.field_1698_a);
        int j = MathHelper.func_1108_b(axisalignedbb.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(axisalignedbb.field_1697_b);
        int l = MathHelper.func_1108_b(axisalignedbb.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(axisalignedbb.field_1704_c);
        int j1 = MathHelper.func_1108_b(axisalignedbb.field_1701_f + 1.0D);
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
                    Block block = Block.allBlocks[func_600_a(k1, i2, l1)];
                    if(block != null)
                    {
                        block.func_230_a(this, k1, i2, l1, axisalignedbb, field_1015_J);
                    }
                }

            }

        }

        double d = 0.25D;
        List list = func_659_b(entity, axisalignedbb.func_1177_b(d, d, d));
        for(int j2 = 0; j2 < list.size(); j2++)
        {
            AxisAlignedBB axisalignedbb1 = ((Entity)list.get(j2)).func_372_f_();
            if(axisalignedbb1 != null && axisalignedbb1.func_1178_a(axisalignedbb))
            {
                field_1015_J.add(axisalignedbb1);
            }
            axisalignedbb1 = entity.func_383_b_((Entity)list.get(j2));
            if(axisalignedbb1 != null && axisalignedbb1.func_1178_a(axisalignedbb))
            {
                field_1015_J.add(axisalignedbb1);
            }
        }

        return field_1015_J;
    }

    public int func_671_a(float f)
    {
        float f1 = func_619_c(f);
        float f2 = 1.0F - (MathHelper.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F);
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

    public Vec3D func_626_b(float f)
    {
        float f1 = func_619_c(f);
        float f2 = MathHelper.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
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
        return Vec3D.func_1248_b(f3, f4, f5);
    }

    public float func_619_c(float f)
    {
        int i = (int)(worldTime % 24000L);
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

    public Vec3D func_628_d(float f)
    {
        float f1 = func_619_c(f);
        float f2 = MathHelper.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
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
        return Vec3D.func_1248_b(f3, f4, f5);
    }

    public Vec3D func_686_e(float f)
    {
        float f1 = func_619_c(f);
        float f2 = MathHelper.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
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
        return Vec3D.func_1248_b(f3, f4, f5);
    }

    public int func_685_d(int i, int j)
    {
        Chunk chunk = func_673_a(i, j);
        int k = 127;
        i &= 0xf;
        j &= 0xf;
        while(k > 0) 
        {
            int l = chunk.func_1008_a(i, k, j);
            if(l == 0 || !Block.allBlocks[l].material.func_880_c() && !Block.allBlocks[l].material.func_879_d())
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
        float f2 = 1.0F - (MathHelper.func_1114_b(f1 * 3.141593F * 2.0F) * 2.0F + 0.75F);
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
        NextTickListEntry nextticklistentry = new NextTickListEntry(i, j, k, l);
        byte byte0 = 8;
        if(func_640_a(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0))
        {
            if(l > 0)
            {
                nextticklistentry.func_900_a((long)Block.allBlocks[l].func_206_a() + worldTime);
            }
            if(!field_1022_C.contains(nextticklistentry))
            {
                field_1022_C.add(nextticklistentry);
                field_1023_B.add(nextticklistentry);
            }
        }
    }

    public void func_633_c()
    {
        field_1050_a.removeAll(field_1024_A);
        for(int i = 0; i < field_1024_A.size(); i++)
        {
            Entity entity = (Entity)field_1024_A.get(i);
            int i1 = entity.field_657_ba;
            int k1 = entity.field_654_bc;
            if(entity.field_621_aZ && func_620_h(i1, k1))
            {
                func_704_b(i1, k1).func_1015_b(entity);
            }
        }

        for(int j = 0; j < field_1024_A.size(); j++)
        {
            func_678_c((Entity)field_1024_A.get(j));
        }

        field_1024_A.clear();
        for(int k = 0; k < field_1050_a.size(); k++)
        {
            Entity entity1 = (Entity)field_1050_a.get(k);
            if(entity1.field_616_af != null)
            {
                if(!entity1.field_616_af.field_646_aA && entity1.field_616_af.field_617_ae == entity1)
                {
                    continue;
                }
                entity1.field_616_af.field_617_ae = null;
                entity1.field_616_af = null;
            }
            if(!entity1.field_646_aA)
            {
                func_667_e(entity1);
            }
            if(!entity1.field_646_aA)
            {
                continue;
            }
            int j1 = entity1.field_657_ba;
            int l1 = entity1.field_654_bc;
            if(entity1.field_621_aZ && func_620_h(j1, l1))
            {
                func_704_b(j1, l1).func_1015_b(entity1);
            }
            field_1050_a.remove(k--);
            func_678_c(entity1);
        }

        for(int l = 0; l < field_1049_b.size(); l++)
        {
            TileEntity tileentity = (TileEntity)field_1049_b.get(l);
            tileentity.func_475_b();
        }

    }

    protected void func_667_e(Entity entity)
    {
        int i = MathHelper.func_1108_b(entity.posX);
        int j = MathHelper.func_1108_b(entity.posZ);
        byte byte0 = 16;
        if(!func_640_a(i - byte0, 0, j - byte0, i + byte0, 128, j + byte0))
        {
            return;
        }
        entity.field_638_aI = entity.posX;
        entity.field_637_aJ = entity.posY;
        entity.field_636_aK = entity.posZ;
        entity.field_603_as = entity.rotationYaw;
        entity.field_602_at = entity.rotationPitch;
        if(entity.field_616_af != null)
        {
            entity.func_350_p();
        } else
        {
            entity.func_370_e_();
        }
        int k = MathHelper.func_1108_b(entity.posX / 16D);
        int l = MathHelper.func_1108_b(entity.posY / 16D);
        int i1 = MathHelper.func_1108_b(entity.posZ / 16D);
        if(!entity.field_621_aZ || entity.field_657_ba != k || entity.field_656_bb != l || entity.field_654_bc != i1)
        {
            if(entity.field_621_aZ && func_620_h(entity.field_657_ba, entity.field_654_bc))
            {
                func_704_b(entity.field_657_ba, entity.field_654_bc).func_1016_a(entity, entity.field_656_bb);
            }
            if(func_620_h(k, i1))
            {
                func_704_b(k, i1).func_1000_a(entity);
            } else
            {
                entity.field_621_aZ = false;
                System.out.println("Removing entity because it's not in a chunk!!");
                entity.func_395_F();
            }
        }
        if(entity.field_617_ae != null)
        {
            if(entity.field_617_ae.field_646_aA || entity.field_617_ae.field_616_af != entity)
            {
                entity.field_617_ae.field_616_af = null;
                entity.field_617_ae = null;
            } else
            {
                func_667_e(entity.field_617_ae);
            }
        }
        if(Double.isNaN(entity.posX) || Double.isInfinite(entity.posX))
        {
            entity.posX = entity.field_638_aI;
        }
        if(Double.isNaN(entity.posY) || Double.isInfinite(entity.posY))
        {
            entity.posY = entity.field_637_aJ;
        }
        if(Double.isNaN(entity.posZ) || Double.isInfinite(entity.posZ))
        {
            entity.posZ = entity.field_636_aK;
        }
        if(Double.isNaN(entity.rotationPitch) || Double.isInfinite(entity.rotationPitch))
        {
            entity.rotationPitch = entity.field_602_at;
        }
        if(Double.isNaN(entity.rotationYaw) || Double.isInfinite(entity.rotationYaw))
        {
            entity.rotationYaw = entity.field_603_as;
        }
    }

    public boolean func_604_a(AxisAlignedBB axisalignedbb)
    {
        List list = func_659_b(null, axisalignedbb);
        for(int i = 0; i < list.size(); i++)
        {
            Entity entity = (Entity)list.get(i);
            if(!entity.field_646_aA && entity.field_618_ad)
            {
                return false;
            }
        }

        return true;
    }

    public boolean func_662_b(AxisAlignedBB axisalignedbb)
    {
        int i = MathHelper.func_1108_b(axisalignedbb.field_1698_a);
        int j = MathHelper.func_1108_b(axisalignedbb.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(axisalignedbb.field_1697_b);
        int l = MathHelper.func_1108_b(axisalignedbb.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(axisalignedbb.field_1704_c);
        int j1 = MathHelper.func_1108_b(axisalignedbb.field_1701_f + 1.0D);
        if(axisalignedbb.field_1698_a < 0.0D)
        {
            i--;
        }
        if(axisalignedbb.field_1697_b < 0.0D)
        {
            k--;
        }
        if(axisalignedbb.field_1704_c < 0.0D)
        {
            i1--;
        }
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    Block block = Block.allBlocks[func_600_a(k1, l1, i2)];
                    if(block != null && block.material.func_879_d())
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public boolean func_605_c(AxisAlignedBB axisalignedbb)
    {
        int i = MathHelper.func_1108_b(axisalignedbb.field_1698_a);
        int j = MathHelper.func_1108_b(axisalignedbb.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(axisalignedbb.field_1697_b);
        int l = MathHelper.func_1108_b(axisalignedbb.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(axisalignedbb.field_1704_c);
        int j1 = MathHelper.func_1108_b(axisalignedbb.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    int j2 = func_600_a(k1, l1, i2);
                    if(j2 == Block.fire.blockID || j2 == Block.lavaStill.blockID || j2 == Block.lavaMoving.blockID)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public boolean func_682_a(AxisAlignedBB axisalignedbb, Material material, Entity entity)
    {
        int i = MathHelper.func_1108_b(axisalignedbb.field_1698_a);
        int j = MathHelper.func_1108_b(axisalignedbb.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(axisalignedbb.field_1697_b);
        int l = MathHelper.func_1108_b(axisalignedbb.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(axisalignedbb.field_1704_c);
        int j1 = MathHelper.func_1108_b(axisalignedbb.field_1701_f + 1.0D);
        boolean flag = false;
        Vec3D vec3d = Vec3D.func_1248_b(0.0D, 0.0D, 0.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    Block block = Block.allBlocks[func_600_a(k1, l1, i2)];
                    if(block == null || block.material != material)
                    {
                        continue;
                    }
                    double d1 = (float)(l1 + 1) - BlockFluids.func_288_b(func_602_e(k1, l1, i2));
                    if((double)l >= d1)
                    {
                        flag = true;
                        block.func_257_a(this, k1, l1, i2, entity, vec3d);
                    }
                }

            }

        }

        if(vec3d.func_1253_c() > 0.0D)
        {
            vec3d = vec3d.func_1252_b();
            double d = 0.0040000000000000001D;
            entity.motionX += vec3d.field_1776_a * d;
            entity.motionY += vec3d.field_1775_b * d;
            entity.motionZ += vec3d.field_1779_c * d;
        }
        return flag;
    }

    public boolean func_689_a(AxisAlignedBB axisalignedbb, Material material)
    {
        int i = MathHelper.func_1108_b(axisalignedbb.field_1698_a);
        int j = MathHelper.func_1108_b(axisalignedbb.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(axisalignedbb.field_1697_b);
        int l = MathHelper.func_1108_b(axisalignedbb.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(axisalignedbb.field_1704_c);
        int j1 = MathHelper.func_1108_b(axisalignedbb.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    Block block = Block.allBlocks[func_600_a(k1, l1, i2)];
                    if(block != null && block.material == material)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public boolean func_707_b(AxisAlignedBB axisalignedbb, Material material)
    {
        int i = MathHelper.func_1108_b(axisalignedbb.field_1698_a);
        int j = MathHelper.func_1108_b(axisalignedbb.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(axisalignedbb.field_1697_b);
        int l = MathHelper.func_1108_b(axisalignedbb.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(axisalignedbb.field_1704_c);
        int j1 = MathHelper.func_1108_b(axisalignedbb.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    Block block = Block.allBlocks[func_600_a(k1, l1, i2)];
                    if(block == null || block.material != material)
                    {
                        continue;
                    }
                    int j2 = func_602_e(k1, l1, i2);
                    double d = l1 + 1;
                    if(j2 < 8)
                    {
                        d = (double)(l1 + 1) - (double)j2 / 8D;
                    }
                    if(d >= axisalignedbb.field_1697_b)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public void func_676_a(Entity entity, double d, double d1, double d2, 
            float f)
    {
        (new Explosion()).func_901_a(this, entity, d, d1, d2, f);
    }

    public float func_675_a(Vec3D vec3d, AxisAlignedBB axisalignedbb)
    {
        double d = 1.0D / ((axisalignedbb.field_1703_d - axisalignedbb.field_1698_a) * 2D + 1.0D);
        double d1 = 1.0D / ((axisalignedbb.field_1702_e - axisalignedbb.field_1697_b) * 2D + 1.0D);
        double d2 = 1.0D / ((axisalignedbb.field_1701_f - axisalignedbb.field_1704_c) * 2D + 1.0D);
        int i = 0;
        int j = 0;
        for(float f = 0.0F; f <= 1.0F; f = (float)((double)f + d))
        {
            for(float f1 = 0.0F; f1 <= 1.0F; f1 = (float)((double)f1 + d1))
            {
                for(float f2 = 0.0F; f2 <= 1.0F; f2 = (float)((double)f2 + d2))
                {
                    double d3 = axisalignedbb.field_1698_a + (axisalignedbb.field_1703_d - axisalignedbb.field_1698_a) * (double)f;
                    double d4 = axisalignedbb.field_1697_b + (axisalignedbb.field_1702_e - axisalignedbb.field_1697_b) * (double)f1;
                    double d5 = axisalignedbb.field_1704_c + (axisalignedbb.field_1701_f - axisalignedbb.field_1704_c) * (double)f2;
                    if(func_645_a(Vec3D.func_1248_b(d3, d4, d5), vec3d) == null)
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
        if(func_600_a(i, j, k) == Block.fire.blockID)
        {
            func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, "random.fizz", 0.5F, 2.6F + (field_1037_n.nextFloat() - field_1037_n.nextFloat()) * 0.8F);
            func_690_d(i, j, k, 0);
        }
    }

    public Entity func_661_a(Class class1)
    {
        return null;
    }

    public String func_687_d()
    {
        return (new StringBuilder()).append("All: ").append(field_1050_a.size()).toString();
    }

    public TileEntity func_603_b(int i, int j, int k)
    {
        Chunk chunk = func_704_b(i >> 4, k >> 4);
        if(chunk != null)
        {
            return chunk.func_1002_d(i & 0xf, j, k & 0xf);
        } else
        {
            return null;
        }
    }

    public void func_654_a(int i, int j, int k, TileEntity tileentity)
    {
        Chunk chunk = func_704_b(i >> 4, k >> 4);
        if(chunk != null)
        {
            chunk.func_1005_a(i & 0xf, j, k & 0xf, tileentity);
        }
    }

    public void func_692_l(int i, int j, int k)
    {
        Chunk chunk = func_704_b(i >> 4, k >> 4);
        if(chunk != null)
        {
            chunk.func_1023_e(i & 0xf, j, k & 0xf);
        }
    }

    public boolean func_601_g(int i, int j, int k)
    {
        Block block = Block.allBlocks[func_600_a(i, j, k)];
        if(block == null)
        {
            return false;
        } else
        {
            return block.func_217_b();
        }
    }

    public void func_651_a(IProgressUpdate iprogressupdate)
    {
        func_639_a(true, iprogressupdate);
    }

    public boolean func_638_e()
    {
        int i = 1000;
        for(; field_1025_z.size() > 0; ((MetadataChunkBlock)field_1025_z.remove(field_1025_z.size() - 1)).func_865_a(this))
        {
            if(--i <= 0)
            {
                return true;
            }
        }

        return false;
    }

    public void func_616_a(EnumSkyBlock enumskyblock, int i, int j, int k, int l, int i1, int j1)
    {
        func_627_a(enumskyblock, i, j, k, l, i1, j1, true);
    }

    public void func_627_a(EnumSkyBlock enumskyblock, int i, int j, int k, int l, int i1, int j1, 
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
                MetadataChunkBlock metadatachunkblock = (MetadataChunkBlock)field_1025_z.get(field_1025_z.size() - k2 - 1);
                if(metadatachunkblock.field_1299_a == enumskyblock && metadatachunkblock.func_866_a(i, j, k, l, i1, j1))
                {
                    return;
                }
            }

        }
        field_1025_z.add(new MetadataChunkBlock(enumskyblock, i, j, k, l, i1, j1));
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
                ((IWorldAccess)field_1032_s.get(j)).func_936_e();
            }

        }
        worldTime++;
        if(worldTime % (long)field_1041_j == 0L)
        {
            func_639_a(false, null);
        }
        func_700_a(false);
        func_652_h();
    }

    protected void func_652_h()
    {
        field_1014_K.clear();
        for(int i = 0; i < playerEntities.size(); i++)
        {
            EntityPlayer entityplayer = (EntityPlayer)playerEntities.get(i);
            int j = MathHelper.func_1108_b(entityplayer.posX / 16D);
            int l = MathHelper.func_1108_b(entityplayer.posZ / 16D);
            byte byte0 = 9;
            for(int j1 = -byte0; j1 <= byte0; j1++)
            {
                for(int j2 = -byte0; j2 <= byte0; j2++)
                {
                    field_1014_K.add(new ChunkCoordIntPair(j1 + j, j2 + l));
                }

            }

        }

        if(field_1013_L > 0)
        {
            field_1013_L--;
        }
        for(Iterator iterator = field_1014_K.iterator(); iterator.hasNext();)
        {
            ChunkCoordIntPair chunkcoordintpair = (ChunkCoordIntPair)iterator.next();
            int k = chunkcoordintpair.field_189_a * 16;
            int i1 = chunkcoordintpair.field_188_b * 16;
            Chunk chunk = func_704_b(chunkcoordintpair.field_189_a, chunkcoordintpair.field_188_b);
            if(field_1013_L == 0)
            {
                field_1045_f = field_1045_f * 3 + field_1044_g;
                int k1 = field_1045_f >> 2;
                int k2 = k1 & 0xf;
                int j3 = k1 >> 8 & 0xf;
                int i4 = k1 >> 16 & 0x7f;
                int l4 = chunk.func_1008_a(k2, i4, j3);
                k2 += k;
                j3 += i1;
                if(l4 == 0 && func_618_j(k2, i4, j3) <= field_1037_n.nextInt(8) && func_641_a(EnumSkyBlock.Sky, k2, i4, j3) <= 0)
                {
                    EntityPlayer entityplayer1 = func_683_a((double)k2 + 0.5D, (double)i4 + 0.5D, (double)j3 + 0.5D, 8D);
                    if(entityplayer1 != null && entityplayer1.func_360_d((double)k2 + 0.5D, (double)i4 + 0.5D, (double)j3 + 0.5D) > 4D)
                    {
                        func_684_a((double)k2 + 0.5D, (double)i4 + 0.5D, (double)j3 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + field_1037_n.nextFloat() * 0.2F);
                        field_1013_L = field_1037_n.nextInt(12000) + 6000;
                    }
                }
            }
            if(snowCovered && field_1037_n.nextInt(4) == 0)
            {
                field_1045_f = field_1045_f * 3 + field_1044_g;
                int l1 = field_1045_f >> 2;
                int l2 = l1 & 0xf;
                int k3 = l1 >> 8 & 0xf;
                int j4 = func_685_d(l2 + k, k3 + i1);
                if(j4 >= 0 && j4 < 128 && chunk.func_1025_a(EnumSkyBlock.Block, l2, j4, k3) < 10)
                {
                    int i5 = chunk.func_1008_a(l2, j4 - 1, k3);
                    if(chunk.func_1008_a(l2, j4, k3) == 0 && Block.snow.func_243_a(this, l2 + k, j4, k3 + i1))
                    {
                        func_690_d(l2 + k, j4, k3 + i1, Block.snow.blockID);
                    }
                    if(i5 == Block.waterMoving.blockID && chunk.func_1021_b(l2, j4 - 1, k3) == 0)
                    {
                        func_690_d(l2 + k, j4 - 1, k3 + i1, Block.ice.blockID);
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
                byte byte1 = chunk.blocks[l3 << 11 | k4 << 7 | j5];
                if(Block.field_344_o[byte1])
                {
                    Block.allBlocks[byte1].func_208_a(this, l3 + k, j5, k4 + i1, field_1037_n);
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
            NextTickListEntry nextticklistentry = (NextTickListEntry)field_1023_B.first();
            if(!flag && nextticklistentry.field_1364_e > worldTime)
            {
                break;
            }
            field_1023_B.remove(nextticklistentry);
            field_1022_C.remove(nextticklistentry);
            byte byte0 = 8;
            if(!func_640_a(nextticklistentry.field_1361_a - byte0, nextticklistentry.field_1360_b - byte0, nextticklistentry.field_1366_c - byte0, nextticklistentry.field_1361_a + byte0, nextticklistentry.field_1360_b + byte0, nextticklistentry.field_1366_c + byte0))
            {
                continue;
            }
            int k = func_600_a(nextticklistentry.field_1361_a, nextticklistentry.field_1360_b, nextticklistentry.field_1366_c);
            if(k == nextticklistentry.field_1365_d && k > 0)
            {
                Block.allBlocks[k].func_208_a(this, nextticklistentry.field_1361_a, nextticklistentry.field_1360_b, nextticklistentry.field_1366_c, field_1037_n);
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
                Block.allBlocks[l1].func_247_b(this, i1, j1, k1, random);
            }
        }

    }

    public List func_659_b(Entity entity, AxisAlignedBB axisalignedbb)
    {
        field_1012_M.clear();
        int i = MathHelper.func_1108_b((axisalignedbb.field_1698_a - 2D) / 16D);
        int j = MathHelper.func_1108_b((axisalignedbb.field_1703_d + 2D) / 16D);
        int k = MathHelper.func_1108_b((axisalignedbb.field_1704_c - 2D) / 16D);
        int l = MathHelper.func_1108_b((axisalignedbb.field_1701_f + 2D) / 16D);
        for(int i1 = i; i1 <= j; i1++)
        {
            for(int j1 = k; j1 <= l; j1++)
            {
                if(func_620_h(i1, j1))
                {
                    func_704_b(i1, j1).func_994_a(entity, axisalignedbb, field_1012_M);
                }
            }

        }

        return field_1012_M;
    }

    public List func_657_a(Class class1, AxisAlignedBB axisalignedbb)
    {
        int i = MathHelper.func_1108_b((axisalignedbb.field_1698_a - 2D) / 16D);
        int j = MathHelper.func_1108_b((axisalignedbb.field_1703_d + 2D) / 16D);
        int k = MathHelper.func_1108_b((axisalignedbb.field_1704_c - 2D) / 16D);
        int l = MathHelper.func_1108_b((axisalignedbb.field_1701_f + 2D) / 16D);
        ArrayList arraylist = new ArrayList();
        for(int i1 = i; i1 <= j; i1++)
        {
            for(int j1 = k; j1 <= l; j1++)
            {
                if(func_620_h(i1, j1))
                {
                    func_704_b(i1, j1).func_1013_a(class1, axisalignedbb, arraylist);
                }
            }

        }

        return arraylist;
    }

    public List func_658_i()
    {
        return field_1050_a;
    }

    public void func_698_b(int i, int j, int k, TileEntity tileentity)
    {
        if(func_630_d(i, j, k))
        {
            func_673_a(i, k).func_1006_f();
        }
        for(int l = 0; l < field_1032_s.size(); l++)
        {
            ((IWorldAccess)field_1032_s.get(l)).func_935_a(i, j, k, tileentity);
        }

    }

    public int func_621_b(Class class1)
    {
        int i = 0;
        for(int j = 0; j < field_1050_a.size(); j++)
        {
            Entity entity = (Entity)field_1050_a.get(j);
            if(class1.isAssignableFrom(entity.getClass()))
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
            func_606_b((Entity)list.get(i));
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
        Block block = Block.allBlocks[i1];
        Block block1 = Block.allBlocks[i];
        AxisAlignedBB axisalignedbb = block1.func_221_d(this, j, k, l);
        if(flag)
        {
            axisalignedbb = null;
        }
        if(axisalignedbb != null && !func_604_a(axisalignedbb))
        {
            return false;
        }
        if(block == Block.waterStill || block == Block.waterMoving || block == Block.lavaStill || block == Block.lavaMoving || block == Block.fire || block == Block.snow)
        {
            return true;
        }
        return i > 0 && block == null && block1.func_243_a(this, j, k, l);
    }

    public PathEntity func_702_a(Entity entity, Entity entity1, float f)
    {
        int i = MathHelper.func_1108_b(entity.posX);
        int j = MathHelper.func_1108_b(entity.posY);
        int k = MathHelper.func_1108_b(entity.posZ);
        int l = (int)(f + 16F);
        int i1 = i - l;
        int j1 = j - l;
        int k1 = k - l;
        int l1 = i + l;
        int i2 = j + l;
        int j2 = k + l;
        ChunkCache chunkcache = new ChunkCache(this, i1, j1, k1, l1, i2, j2);
        return (new Pathfinder(chunkcache)).func_1137_a(entity, entity1, f);
    }

    public PathEntity func_637_a(Entity entity, int i, int j, int k, float f)
    {
        int l = MathHelper.func_1108_b(entity.posX);
        int i1 = MathHelper.func_1108_b(entity.posY);
        int j1 = MathHelper.func_1108_b(entity.posZ);
        int k1 = (int)(f + 8F);
        int l1 = l - k1;
        int i2 = i1 - k1;
        int j2 = j1 - k1;
        int k2 = l + k1;
        int l2 = i1 + k1;
        int i3 = j1 + k1;
        ChunkCache chunkcache = new ChunkCache(this, l1, i2, j2, k2, l2, i3);
        return (new Pathfinder(chunkcache)).func_1131_a(entity, i, j, k, f);
    }

    public boolean func_668_j(int i, int j, int k, int l)
    {
        int i1 = func_600_a(i, j, k);
        if(i1 == 0)
        {
            return false;
        } else
        {
            return Block.allBlocks[i1].func_228_c(this, i, j, k, l);
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
            return Block.allBlocks[i1].func_231_b(this, i, j, k, l);
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

    public EntityPlayer func_609_a(Entity entity, double d)
    {
        return func_683_a(entity.posX, entity.posY, entity.posZ, d);
    }

    public EntityPlayer func_683_a(double d, double d1, double d2, double d3)
    {
        double d4 = -1D;
        EntityPlayer entityplayer = null;
        for(int i = 0; i < playerEntities.size(); i++)
        {
            EntityPlayer entityplayer1 = (EntityPlayer)playerEntities.get(i);
            double d5 = entityplayer1.func_360_d(d, d1, d2);
            if((d3 < 0.0D || d5 < d3 * d3) && (d4 == -1D || d5 < d4))
            {
                d4 = d5;
                entityplayer = entityplayer1;
            }
        }

        return entityplayer;
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
                    throw new MinecraftException("The save is being accessed from another location, aborting");
                }
            }
            finally
            {
                datainputstream.close();
            }
        }
        catch(IOException ioexception)
        {
            throw new MinecraftException("Failed to check session lock, aborting");
        }
    }

    public void func_648_a(long l)
    {
        worldTime = l;
    }

    public void func_705_f(Entity entity)
    {
        int i = MathHelper.func_1108_b(entity.posX / 16D);
        int j = MathHelper.func_1108_b(entity.posZ / 16D);
        byte byte0 = 2;
        for(int k = i - byte0; k <= i + byte0; k++)
        {
            for(int l = j - byte0; l <= j + byte0; l++)
            {
                func_704_b(k, l);
            }

        }

        if(!field_1050_a.contains(entity))
        {
            System.out.println("REINSERTING PLAYER!");
            field_1050_a.add(entity);
        }
    }

    private List field_1025_z;
    public List field_1050_a;
    private List field_1024_A;
    private TreeSet field_1023_B;
    private Set field_1022_C;
    public List field_1049_b;
    public long worldTime;
    public boolean snowCovered;
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
    public List playerEntities;
    public int field_1039_l;
    public Object field_1038_m;
    public Random field_1037_n;
    public int spawnX;
    public int spawnY;
    public int spawnZ;
    public boolean field_1033_r;
    protected List field_1032_s;
    private IChunkProvider field_1017_H;
    public File field_1031_t;
    public long randomSeed;
    private NBTTagCompound nbtCompoundPlayer;
    public long sizeOnDisk;
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
