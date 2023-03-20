// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.IOException;

public class ChunkProviderIso
    implements IChunkProvider
{

    public ChunkProviderIso(World world, IChunkLoader ichunkloader)
    {
        field_898_b = new Chunk[256];
        field_899_a = new byte[32768];
        field_901_c = world;
        field_900_d = ichunkloader;
    }

    public boolean func_537_a(int i, int j)
    {
        int k = i & 0xf | (j & 0xf) * 16;
        return field_898_b[k] != null && field_898_b[k].func_1017_a(i, j);
    }

    public Chunk func_533_b(int i, int j)
    {
        int k = i & 0xf | (j & 0xf) * 16;
        try
        {
            if(!func_537_a(i, j))
            {
                Chunk chunk = func_543_c(i, j);
                if(chunk == null)
                {
                    chunk = new Chunk(field_901_c, field_899_a, i, j);
                    chunk.field_1524_q = true;
                    chunk.field_1525_p = true;
                }
                field_898_b[k] = chunk;
            }
            return field_898_b[k];
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    private synchronized Chunk func_543_c(int i, int j)
    {
        try
        {
            return field_900_d.func_813_a(field_901_c, i, j);
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        return null;
    }

    public void func_534_a(IChunkProvider ichunkprovider, int i, int j)
    {
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

    private Chunk field_898_b[];
    private World field_901_c;
    private IChunkLoader field_900_d;
    byte field_899_a[];
}
