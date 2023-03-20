// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;

public class Explosion
{

    public Explosion()
    {
    }

    public void func_901_a(World world, Entity entity, double d, double d1, double d2, float f)
    {
        world.func_684_a(d, d1, d2, "random.explode", 4F, (1.0F + (world.field_1037_n.nextFloat() - world.field_1037_n.nextFloat()) * 0.2F) * 0.7F);
        HashSet hashset = new HashSet();
        float f1 = f;
        int i = 16;
        for(int j = 0; j < i; j++)
        {
            for(int l = 0; l < i; l++)
            {
label0:
                for(int j1 = 0; j1 < i; j1++)
                {
                    if(j != 0 && j != i - 1 && l != 0 && l != i - 1 && j1 != 0 && j1 != i - 1)
                    {
                        continue;
                    }
                    double d3 = ((float)j / ((float)i - 1.0F)) * 2.0F - 1.0F;
                    double d4 = ((float)l / ((float)i - 1.0F)) * 2.0F - 1.0F;
                    double d5 = ((float)j1 / ((float)i - 1.0F)) * 2.0F - 1.0F;
                    double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
                    d3 /= d6;
                    d4 /= d6;
                    d5 /= d6;
                    float f2 = f * (0.7F + world.field_1037_n.nextFloat() * 0.6F);
                    double d8 = d;
                    double d10 = d1;
                    double d12 = d2;
                    float f3 = 0.3F;
                    do
                    {
                        if(f2 <= 0.0F)
                        {
                            continue label0;
                        }
                        int j4 = MathHelper.func_1108_b(d8);
                        int k4 = MathHelper.func_1108_b(d10);
                        int l4 = MathHelper.func_1108_b(d12);
                        int i5 = world.func_600_a(j4, k4, l4);
                        if(i5 > 0)
                        {
                            f2 -= (Block.allBlocks[i5].func_227_a(entity) + 0.3F) * f3;
                        }
                        if(f2 > 0.0F)
                        {
                            hashset.add(new ChunkPosition(j4, k4, l4));
                        }
                        d8 += d3 * (double)f3;
                        d10 += d4 * (double)f3;
                        d12 += d5 * (double)f3;
                        f2 -= f3 * 0.75F;
                    } while(true);
                }

            }

        }

        f *= 2.0F;
        int k = MathHelper.func_1108_b(d - (double)f - 1.0D);
        int i1 = MathHelper.func_1108_b(d + (double)f + 1.0D);
        int k1 = MathHelper.func_1108_b(d1 - (double)f - 1.0D);
        int l1 = MathHelper.func_1108_b(d1 + (double)f + 1.0D);
        int i2 = MathHelper.func_1108_b(d2 - (double)f - 1.0D);
        int j2 = MathHelper.func_1108_b(d2 + (double)f + 1.0D);
        List list = world.func_659_b(entity, AxisAlignedBB.func_1161_b(k, k1, i2, i1, l1, j2));
        Vec3D vec3d = Vec3D.func_1248_b(d, d1, d2);
        for(int k2 = 0; k2 < list.size(); k2++)
        {
            Entity entity1 = (Entity)list.get(k2);
            double d7 = entity1.func_361_e(d, d1, d2) / (double)f;
            if(d7 <= 1.0D)
            {
                double d9 = entity1.posX - d;
                double d11 = entity1.posY - d1;
                double d13 = entity1.posZ - d2;
                double d15 = MathHelper.func_1109_a(d9 * d9 + d11 * d11 + d13 * d13);
                d9 /= d15;
                d11 /= d15;
                d13 /= d15;
                double d17 = world.func_675_a(vec3d, entity1.boundingBox);
                double d19 = (1.0D - d7) * d17;
                entity1.func_396_a(entity, (int)(((d19 * d19 + d19) / 2D) * 8D * (double)f + 1.0D));
                double d21 = d19;
                entity1.motionX += d9 * d21;
                entity1.motionY += d11 * d21;
                entity1.motionZ += d13 * d21;
            }
        }

        f = f1;
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(hashset);
        for(int l2 = arraylist.size() - 1; l2 >= 0; l2--)
        {
            ChunkPosition chunkposition = (ChunkPosition)arraylist.get(l2);
            int i3 = chunkposition.field_1111_a;
            int j3 = chunkposition.field_1110_b;
            int k3 = chunkposition.field_1112_c;
            int l3 = world.func_600_a(i3, j3, k3);
            for(int i4 = 0; i4 < 1; i4++)
            {
                double d14 = (float)i3 + world.field_1037_n.nextFloat();
                double d16 = (float)j3 + world.field_1037_n.nextFloat();
                double d18 = (float)k3 + world.field_1037_n.nextFloat();
                double d20 = d14 - d;
                double d22 = d16 - d1;
                double d23 = d18 - d2;
                double d24 = MathHelper.func_1109_a(d20 * d20 + d22 * d22 + d23 * d23);
                d20 /= d24;
                d22 /= d24;
                d23 /= d24;
                double d25 = 0.5D / (d24 / (double)f + 0.10000000000000001D);
                d25 *= world.field_1037_n.nextFloat() * world.field_1037_n.nextFloat() + 0.3F;
                d20 *= d25;
                d22 *= d25;
                d23 *= d25;
                world.func_694_a("explode", (d14 + d * 1.0D) / 2D, (d16 + d1 * 1.0D) / 2D, (d18 + d2 * 1.0D) / 2D, d20, d22, d23);
                world.func_694_a("smoke", d14, d16, d18, d20, d22, d23);
            }

            if(l3 > 0)
            {
                Block.allBlocks[l3].func_216_a(world, i3, j3, k3, world.func_602_e(i3, j3, k3), 0.3F);
                world.func_690_d(i3, j3, k3, 0);
                Block.allBlocks[l3].func_239_c(world, i3, j3, k3);
            }
        }

    }
}
