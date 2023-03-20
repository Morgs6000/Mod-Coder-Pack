// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.lang.reflect.Constructor;
import java.util.*;

public class SpawnerAnimals
{

    public SpawnerAnimals(int i, Class class1, Class aclass[])
    {
        nearbyChunkSet = new HashSet();
        maxSpawns = i;
        spawnBaseClass = class1;
        spawnSubclasses = aclass;
    }

    public void func_1150_a(World world)
    {
        int i = world.func_621_b(spawnBaseClass);
        if(i < maxSpawns)
        {
            for(int j = 0; j < 3; j++)
            {
                func_1149_a(world, 1, null);
            }

        }
    }

    protected ChunkPosition func_1151_a(World world, int i, int j)
    {
        int k = i + world.field_1037_n.nextInt(16);
        int l = world.field_1037_n.nextInt(128);
        int i1 = j + world.field_1037_n.nextInt(16);
        return new ChunkPosition(k, l, i1);
    }

    private int func_1149_a(World world, int i, IProgressUpdate iprogressupdate)
    {
        nearbyChunkSet.clear();
        for(int j = 0; j < world.playerEntities.size(); j++)
        {
            EntityPlayer entityplayer = (EntityPlayer)world.playerEntities.get(j);
            int l = MathHelper.func_1108_b(entityplayer.posX / 16D);
            int i1 = MathHelper.func_1108_b(entityplayer.posZ / 16D);
            byte byte0 = 4;
            for(int k1 = -byte0; k1 <= byte0; k1++)
            {
                for(int i2 = -byte0; i2 <= byte0; i2++)
                {
                    nearbyChunkSet.add(new ChunkCoordIntPair(k1 + l, i2 + i1));
                }

            }

        }

        int k = 0;
        Iterator iterator = nearbyChunkSet.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            ChunkCoordIntPair chunkcoordintpair = (ChunkCoordIntPair)iterator.next();
            if(world.field_1037_n.nextInt(10) == 0)
            {
                int j1 = world.field_1037_n.nextInt(spawnSubclasses.length);
                ChunkPosition chunkposition = func_1151_a(world, chunkcoordintpair.field_189_a * 16, chunkcoordintpair.field_188_b * 16);
                int l1 = chunkposition.field_1111_a;
                int j2 = chunkposition.field_1110_b;
                int k2 = chunkposition.field_1112_c;
                if(world.func_601_g(l1, j2, k2))
                {
                    return 0;
                }
                if(world.func_599_f(l1, j2, k2) != Material.air)
                {
                    return 0;
                }
                int l2 = 0;
                while(l2 < 3) 
                {
                    int i3 = l1;
                    int j3 = j2;
                    int k3 = k2;
                    byte byte1 = 6;
                    for(int l3 = 0; l3 < 2; l3++)
                    {
                        i3 += world.field_1037_n.nextInt(byte1) - world.field_1037_n.nextInt(byte1);
                        j3 += world.field_1037_n.nextInt(1) - world.field_1037_n.nextInt(1);
                        k3 += world.field_1037_n.nextInt(byte1) - world.field_1037_n.nextInt(byte1);
                        if(!world.func_601_g(i3, j3 - 1, k3) || world.func_601_g(i3, j3, k3) || world.func_599_f(i3, j3, k3).func_879_d() || world.func_601_g(i3, j3 + 1, k3))
                        {
                            continue;
                        }
                        float f = (float)i3 + 0.5F;
                        float f1 = j3;
                        float f2 = (float)k3 + 0.5F;
                        if(world.func_683_a(f, f1, f2, 24D) != null)
                        {
                            continue;
                        }
                        float f3 = f - (float)world.spawnX;
                        float f4 = f1 - (float)world.spawnY;
                        float f5 = f2 - (float)world.spawnZ;
                        float f6 = f3 * f3 + f4 * f4 + f5 * f5;
                        if(f6 < 576F)
                        {
                            continue;
                        }
                        EntityLiving entityliving;
                        try
                        {
                            entityliving = (EntityLiving)spawnSubclasses[j1].getConstructor(new Class[] {
                                World.class
                            }).newInstance(new Object[] {
                                world
                            });
                        }
                        catch(Exception exception)
                        {
                            exception.printStackTrace();
                            return k;
                        }
                        entityliving.func_365_c(f, f1, f2, world.field_1037_n.nextFloat() * 360F, 0.0F);
                        if(!entityliving.func_433_a())
                        {
                            continue;
                        }
                        k++;
                        world.func_674_a(entityliving);
                        if((entityliving instanceof EntitySpider) && world.field_1037_n.nextInt(100) == 0)
                        {
                            EntitySkeleton entityskeleton = new EntitySkeleton(world);
                            entityskeleton.func_365_c(f, f1, f2, entityliving.rotationYaw, 0.0F);
                            world.func_674_a(entityskeleton);
                            entityskeleton.func_386_g(entityliving);
                        }
                    }

                    l2++;
                }
            }
        } while(true);
        return k;
    }

    private int maxSpawns;
    private Class spawnBaseClass;
    private Class spawnSubclasses[];
    private Set nearbyChunkSet;
}
