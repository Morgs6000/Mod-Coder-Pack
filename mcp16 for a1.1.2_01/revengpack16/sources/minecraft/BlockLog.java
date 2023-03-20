// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockLog extends Block
{

    protected BlockLog(int i)
    {
        super(i, Material.wood);
        field_378_bb = 20;
    }

    public int func_229_a(Random random)
    {
        return 1;
    }

    public int func_240_a(int i, Random random)
    {
        return Block.wood.blockID;
    }

    public int func_218_a(int i)
    {
        if(i == 1)
        {
            return 21;
        }
        return i != 0 ? 20 : 21;
    }
}
