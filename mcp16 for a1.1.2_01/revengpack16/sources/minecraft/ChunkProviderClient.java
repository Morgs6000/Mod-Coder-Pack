// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;

public class ChunkProviderClient
    implements IChunkProvider
{

    public ChunkProviderClient(World world)
    {
        field_886_b = new HashMap();
        field_889_c = new ArrayList();
        field_887_a = new Chunk(world, new byte[32768], 0, 0);
        field_887_a.field_1524_q = true;
        field_887_a.field_1525_p = true;
        field_888_d = world;
    }

    public boolean func_537_a(int i, int j)
    {
        ChunkCoordinates chunkcoordinates = new ChunkCoordinates(i, j);
        return field_886_b.containsKey(chunkcoordinates);
    }

    public void func_539_c(int i, int j)
    {
        Chunk chunk = func_533_b(i, j);
        if(!chunk.field_1524_q)
        {
            chunk.func_998_e();
        }
        field_886_b.remove(new ChunkCoordinates(i, j));
        field_889_c.remove(chunk);
    }

    public Chunk func_538_d(int i, int j)
    {
        ChunkCoordinates chunkcoordinates = new ChunkCoordinates(i, j);
        byte abyte0[] = new byte[32768];
        Chunk chunk = new Chunk(field_888_d, abyte0, i, j);
        Arrays.fill(chunk.skylightMap.data, (byte)-1);
        field_886_b.put(chunkcoordinates, chunk);
        chunk.field_1538_c = true;
        return chunk;
    }

    public Chunk func_533_b(int i, int j)
    {
        ChunkCoordinates chunkcoordinates = new ChunkCoordinates(i, j);
        Chunk chunk = (Chunk)field_886_b.get(chunkcoordinates);
        if(chunk == null)
        {
            return field_887_a;
        } else
        {
            return chunk;
        }
    }

    public boolean func_535_a(boolean flag, IProgressUpdate iprogressupdate)
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

    public void func_534_a(IChunkProvider ichunkprovider, int i, int j)
    {
    }

    private Chunk field_887_a;
    private Map field_886_b;
    private List field_889_c;
    private World field_888_d;
}
