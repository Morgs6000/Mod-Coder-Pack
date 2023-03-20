// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class WorldGenDungeons extends WorldGenerator
{

    public WorldGenDungeons()
    {
    }

    public boolean func_516_a(World world, Random random, int i, int j, int k)
    {
        byte byte0 = 3;
        int l = random.nextInt(2) + 2;
        int i1 = random.nextInt(2) + 2;
        int j1 = 0;
        for(int k1 = i - l - 1; k1 <= i + l + 1; k1++)
        {
            for(int j2 = j - 1; j2 <= j + byte0 + 1; j2++)
            {
                for(int i3 = k - i1 - 1; i3 <= k + i1 + 1; i3++)
                {
                    Material material = world.func_599_f(k1, j2, i3);
                    if(j2 == j - 1 && !material.func_878_a())
                    {
                        return false;
                    }
                    if(j2 == j + byte0 + 1 && !material.func_878_a())
                    {
                        return false;
                    }
                    if((k1 == i - l - 1 || k1 == i + l + 1 || i3 == k - i1 - 1 || i3 == k + i1 + 1) && j2 == j && world.func_600_a(k1, j2, i3) == 0 && world.func_600_a(k1, j2 + 1, i3) == 0)
                    {
                        j1++;
                    }
                }

            }

        }

        if(j1 < 1 || j1 > 5)
        {
            return false;
        }
        for(int l1 = i - l - 1; l1 <= i + l + 1; l1++)
        {
            for(int k2 = j + byte0; k2 >= j - 1; k2--)
            {
                for(int j3 = k - i1 - 1; j3 <= k + i1 + 1; j3++)
                {
                    if(l1 == i - l - 1 || k2 == j - 1 || j3 == k - i1 - 1 || l1 == i + l + 1 || k2 == j + byte0 + 1 || j3 == k + i1 + 1)
                    {
                        if(k2 >= 0 && !world.func_599_f(l1, k2 - 1, j3).func_878_a())
                        {
                            world.func_690_d(l1, k2, j3, 0);
                            continue;
                        }
                        if(!world.func_599_f(l1, k2, j3).func_878_a())
                        {
                            continue;
                        }
                        if(k2 == j - 1 && random.nextInt(4) != 0)
                        {
                            world.func_690_d(l1, k2, j3, Block.cobblestoneMossy.blockID);
                        } else
                        {
                            world.func_690_d(l1, k2, j3, Block.cobblestone.blockID);
                        }
                    } else
                    {
                        world.func_690_d(l1, k2, j3, 0);
                    }
                }

            }

        }

        for(int i2 = 0; i2 < 2; i2++)
        {
label0:
            for(int l2 = 0; l2 < 3; l2++)
            {
                int k3 = (i + random.nextInt(l * 2 + 1)) - l;
                int l3 = j;
                int i4 = (k + random.nextInt(i1 * 2 + 1)) - i1;
                if(world.func_600_a(k3, l3, i4) != 0)
                {
                    continue;
                }
                int j4 = 0;
                if(world.func_599_f(k3 - 1, l3, i4).func_878_a())
                {
                    j4++;
                }
                if(world.func_599_f(k3 + 1, l3, i4).func_878_a())
                {
                    j4++;
                }
                if(world.func_599_f(k3, l3, i4 - 1).func_878_a())
                {
                    j4++;
                }
                if(world.func_599_f(k3, l3, i4 + 1).func_878_a())
                {
                    j4++;
                }
                if(j4 != 1)
                {
                    continue;
                }
                world.func_690_d(k3, l3, i4, Block.crate.blockID);
                TileEntityChest tileentitychest = (TileEntityChest)world.func_603_b(k3, l3, i4);
                int k4 = 0;
                do
                {
                    if(k4 >= 8)
                    {
                        break label0;
                    }
                    ItemStack itemstack = func_530_a(random);
                    if(itemstack != null)
                    {
                        tileentitychest.func_472_a(random.nextInt(tileentitychest.func_469_c()), itemstack);
                    }
                    k4++;
                } while(true);
            }

        }

        world.func_690_d(i, j, k, Block.mobSpawner.blockID);
        TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.func_603_b(i, j, k);
        tileentitymobspawner.entityID = func_531_b(random);
        return true;
    }

    private ItemStack func_530_a(Random random)
    {
        int i = random.nextInt(11);
        if(i == 0)
        {
            return new ItemStack(Item.saddle);
        }
        if(i == 1)
        {
            return new ItemStack(Item.ingotIron, random.nextInt(4) + 1);
        }
        if(i == 2)
        {
            return new ItemStack(Item.bread);
        }
        if(i == 3)
        {
            return new ItemStack(Item.wheat, random.nextInt(4) + 1);
        }
        if(i == 4)
        {
            return new ItemStack(Item.gunpowder, random.nextInt(4) + 1);
        }
        if(i == 5)
        {
            return new ItemStack(Item.silk, random.nextInt(4) + 1);
        }
        if(i == 6)
        {
            return new ItemStack(Item.bucketEmpty);
        }
        if(i == 7 && random.nextInt(100) == 0)
        {
            return new ItemStack(Item.appleGold);
        }
        if(i == 8 && random.nextInt(2) == 0)
        {
            return new ItemStack(Item.redstone, random.nextInt(4) + 1);
        }
        if(i == 9 && random.nextInt(10) == 0)
        {
            return new ItemStack(Item.itemsList[Item.record13.swiftedIndex + random.nextInt(2)]);
        } else
        {
            return null;
        }
    }

    private String func_531_b(Random random)
    {
        int i = random.nextInt(4);
        if(i == 0)
        {
            return "Skeleton";
        }
        if(i == 1)
        {
            return "Zombie";
        }
        if(i == 2)
        {
            return "Zombie";
        }
        if(i == 3)
        {
            return "Spider";
        } else
        {
            return "";
        }
    }
}
