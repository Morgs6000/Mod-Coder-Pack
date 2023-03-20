// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.util.*;

public class Chunk
{

    public Chunk(World world, int i, int j)
    {
        field_1529_l = new HashMap();
        field_1528_m = new List[8];
        isTerrainPopulated = false;
        isModified = false;
        field_1524_q = false;
        field_1523_r = false;
        field_1522_s = 0L;
        field_1537_d = world;
        xPos = i;
        zPos = j;
        heightMap = new byte[256];
        for(int k = 0; k < field_1528_m.length; k++)
        {
            field_1528_m[k] = new ArrayList();
        }

    }

    public Chunk(World world, byte abyte0[], int i, int j)
    {
        this(world, i, j);
        blocks = abyte0;
        data = new NibbleArray(abyte0.length);
        skylightMap = new NibbleArray(abyte0.length);
        blocklightMap = new NibbleArray(abyte0.length);
    }

    public boolean func_1017_a(int i, int j)
    {
        return i == xPos && j == zPos;
    }

    public int func_999_b(int i, int j)
    {
        return heightMap[j << 4 | i] & 0xff;
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
                for(int i1 = j << 11 | k << 7; l > 0 && Block.field_341_r[blocks[(i1 + l) - 1]] == 0; l--) { }
                heightMap[k << 4 | j] = (byte)l;
                if(l < i)
                {
                    i = l;
                }
            }

        }

        field_1532_i = i;
        isModified = true;
    }

    public void func_1024_c()
    {
        int i = 127;
        for(int j = 0; j < 16; j++)
        {
            for(int l = 0; l < 16; l++)
            {
                heightMap[l << 4 | j] = -128;
                func_1003_g(j, 127, l);
                if((heightMap[l << 4 | j] & 0xff) < i)
                {
                    i = heightMap[l << 4 | j] & 0xff;
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

        isModified = true;
    }

    private void func_996_c(int i, int j)
    {
        int k = func_999_b(i, j);
        int l = xPos * 16 + i;
        int i1 = zPos * 16 + j;
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
            field_1537_d.func_616_a(EnumSkyBlock.Sky, i, k, j, i, l, j);
        } else
        if(l < k)
        {
            field_1537_d.func_616_a(EnumSkyBlock.Sky, i, l, j, i, k, j);
        }
        isModified = true;
    }

    private void func_1003_g(int i, int j, int k)
    {
        int l = heightMap[k << 4 | i] & 0xff;
        int i1 = l;
        if(j > l)
        {
            i1 = j;
        }
        for(int j1 = i << 11 | k << 7; i1 > 0 && Block.field_341_r[blocks[(j1 + i1) - 1]] == 0; i1--) { }
        if(i1 == l)
        {
            return;
        }
        field_1537_d.func_680_f(i, k, i1, l);
        heightMap[k << 4 | i] = (byte)i1;
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
                    if((heightMap[k2 << 4 | i2] & 0xff) < k1)
                    {
                        k1 = heightMap[k2 << 4 | i2] & 0xff;
                    }
                }

            }

            field_1532_i = k1;
        }
        int l1 = xPos * 16 + i;
        int j2 = zPos * 16 + k;
        if(i1 < l)
        {
            for(int l2 = i1; l2 < l; l2++)
            {
                skylightMap.func_770_a(i, l2, k, 15);
            }

        } else
        {
            field_1537_d.func_616_a(EnumSkyBlock.Sky, l1, l, j2, l1, i1, j2);
            for(int i3 = l; i3 < i1; i3++)
            {
                skylightMap.func_770_a(i, i3, k, 0);
            }

        }
        int j3 = 15;
        int k3 = i1;
        while(i1 > 0 && j3 > 0) 
        {
            i1--;
            int l3 = Block.field_341_r[func_1008_a(i, i1, k)];
            if(l3 == 0)
            {
                l3 = 1;
            }
            j3 -= l3;
            if(j3 < 0)
            {
                j3 = 0;
            }
            skylightMap.func_770_a(i, i1, k, j3);
        }
        for(; i1 > 0 && Block.field_341_r[func_1008_a(i, i1 - 1, k)] == 0; i1--) { }
        if(i1 != k3)
        {
            field_1537_d.func_616_a(EnumSkyBlock.Sky, l1 - 1, i1, j2 - 1, l1 + 1, k3, j2 + 1);
        }
        isModified = true;
    }

    public int func_1008_a(int i, int j, int k)
    {
        return blocks[i << 11 | k << 7 | j];
    }

    public boolean func_1010_a(int i, int j, int k, int l, int i1)
    {
        byte byte0 = (byte)l;
        int j1 = heightMap[k << 4 | i] & 0xff;
        int k1 = blocks[i << 11 | k << 7 | j] & 0xff;
        if(k1 == l && data.func_771_a(i, j, k) == i1)
        {
            return false;
        }
        int l1 = xPos * 16 + i;
        int i2 = zPos * 16 + k;
        blocks[i << 11 | k << 7 | j] = byte0;
        if(k1 != 0 && !field_1537_d.field_1026_y)
        {
            Block.allBlocks[k1].func_214_b(field_1537_d, l1, j, i2);
        }
        data.func_770_a(i, j, k, i1);
        if(Block.field_341_r[byte0] != 0)
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
        field_1537_d.func_616_a(EnumSkyBlock.Sky, l1, j, i2, l1, j, i2);
        field_1537_d.func_616_a(EnumSkyBlock.Block, l1, j, i2, l1, j, i2);
        func_996_c(i, k);
        if(l != 0)
        {
            Block.allBlocks[l].func_235_e(field_1537_d, l1, j, i2);
        }
        isModified = true;
        return true;
    }

    public boolean func_1022_a(int i, int j, int k, int l)
    {
        byte byte0 = (byte)l;
        int i1 = heightMap[k << 4 | i] & 0xff;
        int j1 = blocks[i << 11 | k << 7 | j] & 0xff;
        if(j1 == l)
        {
            return false;
        }
        int k1 = xPos * 16 + i;
        int l1 = zPos * 16 + k;
        blocks[i << 11 | k << 7 | j] = byte0;
        if(j1 != 0)
        {
            Block.allBlocks[j1].func_214_b(field_1537_d, k1, j, l1);
        }
        data.func_770_a(i, j, k, 0);
        if(Block.field_341_r[byte0] != 0)
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
        field_1537_d.func_616_a(EnumSkyBlock.Sky, k1, j, l1, k1, j, l1);
        field_1537_d.func_616_a(EnumSkyBlock.Block, k1, j, l1, k1, j, l1);
        func_996_c(i, k);
        if(l != 0 && !field_1537_d.field_1026_y)
        {
            Block.allBlocks[l].func_235_e(field_1537_d, k1, j, l1);
        }
        isModified = true;
        return true;
    }

    public int func_1021_b(int i, int j, int k)
    {
        return data.func_771_a(i, j, k);
    }

    public void func_1009_b(int i, int j, int k, int l)
    {
        isModified = true;
        data.func_770_a(i, j, k, l);
    }

    public int func_1025_a(EnumSkyBlock enumskyblock, int i, int j, int k)
    {
        if(enumskyblock == EnumSkyBlock.Sky)
        {
            return skylightMap.func_771_a(i, j, k);
        }
        if(enumskyblock == EnumSkyBlock.Block)
        {
            return blocklightMap.func_771_a(i, j, k);
        } else
        {
            return 0;
        }
    }

    public void func_1011_a(EnumSkyBlock enumskyblock, int i, int j, int k, int l)
    {
        isModified = true;
        if(enumskyblock == EnumSkyBlock.Sky)
        {
            skylightMap.func_770_a(i, j, k, l);
        } else
        if(enumskyblock == EnumSkyBlock.Block)
        {
            blocklightMap.func_770_a(i, j, k, l);
        } else
        {
            return;
        }
    }

    public int func_1019_c(int i, int j, int k, int l)
    {
        int i1 = skylightMap.func_771_a(i, j, k);
        if(i1 > 0)
        {
            field_1540_a = true;
        }
        i1 -= l;
        int j1 = blocklightMap.func_771_a(i, j, k);
        if(j1 > i1)
        {
            i1 = j1;
        }
        return i1;
    }

    public void func_1000_a(Entity entity)
    {
        if(field_1524_q)
        {
            return;
        }
        field_1523_r = true;
        int i = MathHelper.func_1108_b(entity.posX / 16D);
        int j = MathHelper.func_1108_b(entity.posZ / 16D);
        if(i != xPos || j != zPos)
        {
            System.out.println((new StringBuilder()).append("Wrong location! ").append(entity).toString());
        }
        int k = MathHelper.func_1108_b(entity.posY / 16D);
        if(k < 0)
        {
            k = 0;
        }
        if(k >= field_1528_m.length)
        {
            k = field_1528_m.length - 1;
        }
        entity.field_621_aZ = true;
        entity.field_657_ba = xPos;
        entity.field_656_bb = k;
        entity.field_654_bc = zPos;
        field_1528_m[k].add(entity);
    }

    public void func_1015_b(Entity entity)
    {
        func_1016_a(entity, entity.field_656_bb);
    }

    public void func_1016_a(Entity entity, int i)
    {
        if(i < 0)
        {
            i = 0;
        }
        if(i >= field_1528_m.length)
        {
            i = field_1528_m.length - 1;
        }
        field_1528_m[i].remove(entity);
    }

    public boolean func_1007_c(int i, int j, int k)
    {
        return j >= (heightMap[k << 4 | i] & 0xff);
    }

    public TileEntity func_1002_d(int i, int j, int k)
    {
        ChunkPosition chunkposition = new ChunkPosition(i, j, k);
        TileEntity tileentity = (TileEntity)field_1529_l.get(chunkposition);
        if(tileentity == null)
        {
            int l = func_1008_a(i, j, k);
            if(!Block.field_342_q[l])
            {
                return null;
            }
            BlockContainer blockcontainer = (BlockContainer)Block.allBlocks[l];
            blockcontainer.func_235_e(field_1537_d, xPos * 16 + i, j, zPos * 16 + k);
            tileentity = (TileEntity)field_1529_l.get(chunkposition);
        }
        return tileentity;
    }

    public void func_1001_a(TileEntity tileentity)
    {
        int i = tileentity.x - xPos * 16;
        int j = tileentity.y;
        int k = tileentity.z - zPos * 16;
        func_1005_a(i, j, k, tileentity);
    }

    public void func_1005_a(int i, int j, int k, TileEntity tileentity)
    {
        ChunkPosition chunkposition = new ChunkPosition(i, j, k);
        tileentity.world = field_1537_d;
        tileentity.x = xPos * 16 + i;
        tileentity.y = j;
        tileentity.z = zPos * 16 + k;
        if(func_1008_a(i, j, k) == 0 || !(Block.allBlocks[func_1008_a(i, j, k)] instanceof BlockContainer))
        {
            System.out.println("Attempted to place a tile entity where there was no entity tile!");
            return;
        }
        if(field_1538_c)
        {
            if(field_1529_l.get(chunkposition) != null)
            {
                field_1537_d.field_1049_b.remove(field_1529_l.get(chunkposition));
            }
            field_1537_d.field_1049_b.add(tileentity);
        }
        field_1529_l.put(chunkposition, tileentity);
    }

    public void func_1023_e(int i, int j, int k)
    {
        ChunkPosition chunkposition = new ChunkPosition(i, j, k);
        if(field_1538_c)
        {
            field_1537_d.field_1049_b.remove(field_1529_l.remove(chunkposition));
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
        isModified = true;
    }

    public void func_994_a(Entity entity, AxisAlignedBB axisalignedbb, List list)
    {
        int i = MathHelper.func_1108_b((axisalignedbb.field_1697_b - 2D) / 16D);
        int j = MathHelper.func_1108_b((axisalignedbb.field_1702_e + 2D) / 16D);
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
                Entity entity1 = (Entity)list1.get(l);
                if(entity1 != entity && entity1.boundingBox.func_1178_a(axisalignedbb))
                {
                    list.add(entity1);
                }
            }

        }

    }

    public void func_1013_a(Class class1, AxisAlignedBB axisalignedbb, List list)
    {
        int i = MathHelper.func_1108_b((axisalignedbb.field_1697_b - 2D) / 16D);
        int j = MathHelper.func_1108_b((axisalignedbb.field_1702_e + 2D) / 16D);
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
                Entity entity = (Entity)list1.get(l);
                if(class1.isAssignableFrom(entity.getClass()) && entity.boundingBox.func_1178_a(axisalignedbb))
                {
                    list.add(entity);
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
        if(field_1523_r && field_1537_d.worldTime != field_1522_s)
        {
            return true;
        } else
        {
            return isModified;
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
                System.arraycopy(abyte0, k1, blocks, l3, l4);
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
                System.arraycopy(abyte0, k1, data.data, i4, i5);
                k1 += i5;
            }

        }

        for(int j2 = i; j2 < l; j2++)
        {
            for(int j3 = k; j3 < j1; j3++)
            {
                int j4 = (j2 << 11 | j3 << 7 | j) >> 1;
                int j5 = (i1 - j) / 2;
                System.arraycopy(abyte0, k1, blocklightMap.data, j4, j5);
                k1 += j5;
            }

        }

        for(int k2 = i; k2 < l; k2++)
        {
            for(int k3 = k; k3 < j1; k3++)
            {
                int k4 = (k2 << 11 | k3 << 7 | j) >> 1;
                int k5 = (i1 - j) / 2;
                System.arraycopy(abyte0, k1, skylightMap.data, k4, k5);
                k1 += k5;
            }

        }

        return k1;
    }

    public Random func_997_a(long l)
    {
        return new Random(field_1537_d.randomSeed + (long)(xPos * xPos * 0x4c1906) + (long)(xPos * 0x5ac0db) + (long)(zPos * zPos) * 0x4307a7L + (long)(zPos * 0x5f24f) ^ l);
    }

    public static boolean field_1540_a;
    public byte blocks[];
    public boolean field_1538_c;
    public World field_1537_d;
    public NibbleArray data;
    public NibbleArray skylightMap;
    public NibbleArray blocklightMap;
    public byte heightMap[];
    public int field_1532_i;
    public final int xPos;
    public final int zPos;
    public Map field_1529_l;
    public List field_1528_m[];
    public boolean isTerrainPopulated;
    public boolean isModified;
    public boolean field_1525_p;
    public boolean field_1524_q;
    public boolean field_1523_r;
    public long field_1522_s;
}
