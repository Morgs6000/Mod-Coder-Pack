// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

class SpawnerMonsters extends SpawnerAnimals
{

    SpawnerMonsters(PlayerControllerSP playercontrollersp, int i, Class class1, Class aclass[])
    {
        super(i, class1, aclass);
        unused = playercontrollersp;
    }

    protected ChunkPosition func_1151_a(World world, int i, int j)
    {
        int k = i + world.field_1037_n.nextInt(16);
        int l = world.field_1037_n.nextInt(world.field_1037_n.nextInt(120) + 8);
        int i1 = j + world.field_1037_n.nextInt(16);
        return new ChunkPosition(k, l, i1);
    }

    final PlayerControllerSP unused; /* synthetic field */
}
