// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockTNT extends Block
{

    public BlockTNT(int i, int j)
    {
        super(i, j, Material.tnt);
    }

    public int func_218_a(int i)
    {
        if(i == 0)
        {
            return field_378_bb + 2;
        }
        if(i == 1)
        {
            return field_378_bb + 1;
        } else
        {
            return field_378_bb;
        }
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        if(l > 0 && Block.allBlocks[l].func_209_d() && world.func_625_o(i, j, k))
        {
            func_252_b(world, i, j, k, 0);
            world.func_690_d(i, j, k, 0);
        }
    }

    public int func_229_a(Random random)
    {
        return 0;
    }

    public void func_239_c(World world, int i, int j, int k)
    {
        EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
        entitytntprimed.field_689_a = world.field_1037_n.nextInt(entitytntprimed.field_689_a / 4) + entitytntprimed.field_689_a / 8;
        world.func_674_a(entitytntprimed);
    }

    public void func_252_b(World world, int i, int j, int k, int l)
    {
        EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
        world.func_674_a(entitytntprimed);
        world.func_623_a(entitytntprimed, "random.fuse", 1.0F, 1.0F);
    }
}
