// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class BlockOreBlock extends Block
{

    public BlockOreBlock(int i, int j)
    {
        super(i, Material.iron);
        field_378_bb = j;
    }

    public int func_218_a(int i)
    {
        if(i == 1)
        {
            return field_378_bb - 16;
        }
        if(i == 0)
        {
            return field_378_bb + 16;
        } else
        {
            return field_378_bb;
        }
    }
}
