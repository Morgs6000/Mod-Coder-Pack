// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.IOException;

public class ChunkProviderLoadOrGenerate
    implements IChunkProvider
{

    public ChunkProviderLoadOrGenerate(World world, IChunkLoader ichunkloader, IChunkProvider ichunkprovider)
    {
        field_894_f = new Chunk[1024];
        field_891_a = 0xc4653601;
        field_890_b = 0xc4653601;
        field_897_c = new Chunk(world, new byte[32768], 0, 0);
        field_897_c.field_1524_q = true;
        field_897_c.field_1525_p = true;
        field_893_g = world;
        field_895_e = ichunkloader;
        field_896_d = ichunkprovider;
    }

    public boolean func_537_a(int i, int j)
    {
        if(i == field_891_a && j == field_890_b && field_892_h != null)
        {
            return true;
        } else
        {
            int k = i & 0x1f;
            int l = j & 0x1f;
            int i1 = k + l * 32;
            return field_894_f[i1] != null && (field_894_f[i1] == field_897_c || field_894_f[i1].func_1017_a(i, j));
        }
    }

    public Chunk func_533_b(int i, int j)
    {
        if(i == field_891_a && j == field_890_b && field_892_h != null)
        {
            return field_892_h;
        }
        int k = i & 0x1f;
        int l = j & 0x1f;
        int i1 = k + l * 32;
        if(!func_537_a(i, j))
        {
            if(field_894_f[i1] != null)
            {
                field_894_f[i1].func_998_e();
                func_540_b(field_894_f[i1]);
                func_541_a(field_894_f[i1]);
            }
            Chunk chunk = func_542_c(i, j);
            if(chunk == null)
            {
                if(field_896_d == null)
                {
                    chunk = field_897_c;
                } else
                {
                    chunk = field_896_d.func_533_b(i, j);
                }
            }
            field_894_f[i1] = chunk;
            if(field_894_f[i1] != null)
            {
                field_894_f[i1].func_995_d();
            }
            if(!field_894_f[i1].isTerrainPopulated && func_537_a(i + 1, j + 1) && func_537_a(i, j + 1) && func_537_a(i + 1, j))
            {
                func_534_a(this, i, j);
            }
            if(func_537_a(i - 1, j) && !func_533_b(i - 1, j).isTerrainPopulated && func_537_a(i - 1, j + 1) && func_537_a(i, j + 1) && func_537_a(i - 1, j))
            {
                func_534_a(this, i - 1, j);
            }
            if(func_537_a(i, j - 1) && !func_533_b(i, j - 1).isTerrainPopulated && func_537_a(i + 1, j - 1) && func_537_a(i, j - 1) && func_537_a(i + 1, j))
            {
                func_534_a(this, i, j - 1);
            }
            if(func_537_a(i - 1, j - 1) && !func_533_b(i - 1, j - 1).isTerrainPopulated && func_537_a(i - 1, j - 1) && func_537_a(i, j - 1) && func_537_a(i - 1, j))
            {
                func_534_a(this, i - 1, j - 1);
            }
        }
        field_891_a = i;
        field_890_b = j;
        field_892_h = field_894_f[i1];
        return field_894_f[i1];
    }

    private Chunk func_542_c(int i, int j)
    {
        if(field_895_e == null)
        {
            return null;
        }
        try
        {
            Chunk chunk = field_895_e.func_813_a(field_893_g, i, j);
            if(chunk != null)
            {
                chunk.field_1522_s = field_893_g.worldTime;
            }
            return chunk;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    private void func_541_a(Chunk chunk)
    {
        if(field_895_e == null)
        {
            return;
        }
        try
        {
            field_895_e.func_815_b(field_893_g, chunk);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_540_b(Chunk chunk)
    {
        if(field_895_e == null)
        {
            return;
        }
        try
        {
            chunk.field_1522_s = field_893_g.worldTime;
            field_895_e.func_812_a(field_893_g, chunk);
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void func_534_a(IChunkProvider ichunkprovider, int i, int j)
    {
        Chunk chunk = func_533_b(i, j);
        if(!chunk.isTerrainPopulated)
        {
            chunk.isTerrainPopulated = true;
            if(field_896_d != null)
            {
                field_896_d.func_534_a(ichunkprovider, i, j);
                chunk.func_1006_f();
            }
        }
    }

    public boolean func_535_a(boolean flag, IProgressUpdate iprogressupdate)
    {
        int i = 0;
        int j = 0;
        if(iprogressupdate != null)
        {
            for(int k = 0; k < field_894_f.length; k++)
            {
                if(field_894_f[k] != null && field_894_f[k].func_1012_a(flag))
                {
                    j++;
                }
            }

        }
        int l = 0;
        for(int i1 = 0; i1 < field_894_f.length; i1++)
        {
            if(field_894_f[i1] == null)
            {
                continue;
            }
            if(flag && !field_894_f[i1].field_1525_p)
            {
                func_541_a(field_894_f[i1]);
            }
            if(!field_894_f[i1].func_1012_a(flag))
            {
                continue;
            }
            func_540_b(field_894_f[i1]);
            field_894_f[i1].isModified = false;
            if(++i == 2 && !flag)
            {
                return false;
            }
            if(iprogressupdate != null && ++l % 10 == 0)
            {
                iprogressupdate.func_593_a((l * 100) / j);
            }
        }

        if(flag)
        {
            if(field_895_e == null)
            {
                return true;
            }
            field_895_e.func_811_b();
        }
        return true;
    }

    public boolean func_532_a()
    {
        if(field_895_e != null)
        {
            field_895_e.func_814_a();
        }
        return field_896_d.func_532_a();
    }

    public boolean func_536_b()
    {
        return true;
    }

    private Chunk field_897_c;
    private IChunkProvider field_896_d;
    private IChunkLoader field_895_e;
    private Chunk field_894_f[];
    private World field_893_g;
    int field_891_a;
    int field_890_b;
    private Chunk field_892_h;
}
