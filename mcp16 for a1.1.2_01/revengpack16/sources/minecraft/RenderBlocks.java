// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class RenderBlocks
{

    public RenderBlocks(IBlockAccess iblockaccess)
    {
        field_1771_b = -1;
        field_1774_c = false;
        field_1773_d = false;
        field_1772_a = iblockaccess;
    }

    public RenderBlocks()
    {
        field_1771_b = -1;
        field_1774_c = false;
        field_1773_d = false;
    }

    public void func_1223_a(Block block, int i, int j, int k, int l)
    {
        field_1771_b = l;
        func_1234_a(block, i, j, k);
        field_1771_b = -1;
    }

    public boolean func_1234_a(Block block, int i, int j, int k)
    {
        int l = block.func_210_f();
        block.func_238_a(field_1772_a, i, j, k);
        if(l == 0)
        {
            return func_1228_k(block, i, j, k);
        }
        if(l == 4)
        {
            return func_1222_j(block, i, j, k);
        }
        if(l == 13)
        {
            return func_1233_l(block, i, j, k);
        }
        if(l == 1)
        {
            return func_1226_h(block, i, j, k);
        }
        if(l == 6)
        {
            return func_1232_i(block, i, j, k);
        }
        if(l == 2)
        {
            return func_1241_b(block, i, j, k);
        }
        if(l == 3)
        {
            return func_1235_d(block, i, j, k);
        }
        if(l == 5)
        {
            return func_1242_e(block, i, j, k);
        }
        if(l == 8)
        {
            return func_1221_g(block, i, j, k);
        }
        if(l == 7)
        {
            return func_1218_o(block, i, j, k);
        }
        if(l == 9)
        {
            return func_1216_f(block, i, j, k);
        }
        if(l == 10)
        {
            return func_1214_n(block, i, j, k);
        }
        if(l == 11)
        {
            return func_1240_m(block, i, j, k);
        }
        if(l == 12)
        {
            return func_1229_c(block, i, j, k);
        } else
        {
            return false;
        }
    }

    public boolean func_1241_b(Block block, int i, int j, int k)
    {
        int l = field_1772_a.func_602_e(i, j, k);
        Tessellator tessellator = Tessellator.field_1512_a;
        float f = block.func_241_c(field_1772_a, i, j, k);
        if(Block.field_339_t[block.blockID] > 0)
        {
            f = 1.0F;
        }
        tessellator.func_987_a(f, f, f);
        double d = 0.40000000596046448D;
        double d1 = 0.5D - d;
        double d2 = 0.20000000298023224D;
        if(l == 1)
        {
            func_1237_a(block, (double)i - d1, (double)j + d2, k, -d, 0.0D);
        } else
        if(l == 2)
        {
            func_1237_a(block, (double)i + d1, (double)j + d2, k, d, 0.0D);
        } else
        if(l == 3)
        {
            func_1237_a(block, i, (double)j + d2, (double)k - d1, 0.0D, -d);
        } else
        if(l == 4)
        {
            func_1237_a(block, i, (double)j + d2, (double)k + d1, 0.0D, d);
        } else
        {
            func_1237_a(block, i, j, k, 0.0D, 0.0D);
        }
        return true;
    }

    public boolean func_1229_c(Block block, int i, int j, int k)
    {
        int l = field_1772_a.func_602_e(i, j, k);
        int i1 = l & 7;
        boolean flag = (l & 8) > 0;
        Tessellator tessellator = Tessellator.field_1512_a;
        boolean flag1 = field_1771_b >= 0;
        if(!flag1)
        {
            field_1771_b = Block.cobblestone.field_378_bb;
        }
        float f = 0.25F;
        float f1 = 0.1875F;
        float f2 = 0.1875F;
        if(i1 == 5)
        {
            block.func_213_a(0.5F - f1, 0.0F, 0.5F - f, 0.5F + f1, f2, 0.5F + f);
        } else
        if(i1 == 6)
        {
            block.func_213_a(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, f2, 0.5F + f1);
        } else
        if(i1 == 4)
        {
            block.func_213_a(0.5F - f1, 0.5F - f, 1.0F - f2, 0.5F + f1, 0.5F + f, 1.0F);
        } else
        if(i1 == 3)
        {
            block.func_213_a(0.5F - f1, 0.5F - f, 0.0F, 0.5F + f1, 0.5F + f, f2);
        } else
        if(i1 == 2)
        {
            block.func_213_a(1.0F - f2, 0.5F - f, 0.5F - f1, 1.0F, 0.5F + f, 0.5F + f1);
        } else
        if(i1 == 1)
        {
            block.func_213_a(0.0F, 0.5F - f, 0.5F - f1, f2, 0.5F + f, 0.5F + f1);
        }
        func_1228_k(block, i, j, k);
        if(!flag1)
        {
            field_1771_b = -1;
        }
        float f3 = block.func_241_c(field_1772_a, i, j, k);
        if(Block.field_339_t[block.blockID] > 0)
        {
            f3 = 1.0F;
        }
        tessellator.func_987_a(f3, f3, f3);
        int j1 = block.func_218_a(0);
        if(field_1771_b >= 0)
        {
            j1 = field_1771_b;
        }
        int k1 = (j1 & 0xf) << 4;
        int l1 = j1 & 0xf0;
        float f4 = (float)k1 / 256F;
        float f5 = ((float)k1 + 15.99F) / 256F;
        float f6 = (float)l1 / 256F;
        float f7 = ((float)l1 + 15.99F) / 256F;
        Vec3D avec3d[] = new Vec3D[8];
        float f8 = 0.0625F;
        float f9 = 0.0625F;
        float f10 = 0.625F;
        avec3d[0] = Vec3D.func_1248_b(-f8, 0.0D, -f9);
        avec3d[1] = Vec3D.func_1248_b(f8, 0.0D, -f9);
        avec3d[2] = Vec3D.func_1248_b(f8, 0.0D, f9);
        avec3d[3] = Vec3D.func_1248_b(-f8, 0.0D, f9);
        avec3d[4] = Vec3D.func_1248_b(-f8, f10, -f9);
        avec3d[5] = Vec3D.func_1248_b(f8, f10, -f9);
        avec3d[6] = Vec3D.func_1248_b(f8, f10, f9);
        avec3d[7] = Vec3D.func_1248_b(-f8, f10, f9);
        for(int i2 = 0; i2 < 8; i2++)
        {
            if(flag)
            {
                avec3d[i2].field_1779_c -= 0.0625D;
                avec3d[i2].func_1258_a(0.6981317F);
            } else
            {
                avec3d[i2].field_1779_c += 0.0625D;
                avec3d[i2].func_1258_a(-0.6981317F);
            }
            if(i1 == 6)
            {
                avec3d[i2].func_1249_b(1.570796F);
            }
            if(i1 < 5)
            {
                avec3d[i2].field_1775_b -= 0.375D;
                avec3d[i2].func_1258_a(1.570796F);
                if(i1 == 4)
                {
                    avec3d[i2].func_1249_b(0.0F);
                }
                if(i1 == 3)
                {
                    avec3d[i2].func_1249_b(3.141593F);
                }
                if(i1 == 2)
                {
                    avec3d[i2].func_1249_b(1.570796F);
                }
                if(i1 == 1)
                {
                    avec3d[i2].func_1249_b(-1.570796F);
                }
                avec3d[i2].field_1776_a += (double)i + 0.5D;
                avec3d[i2].field_1775_b += (float)j + 0.5F;
                avec3d[i2].field_1779_c += (double)k + 0.5D;
            } else
            {
                avec3d[i2].field_1776_a += (double)i + 0.5D;
                avec3d[i2].field_1775_b += (float)j + 0.125F;
                avec3d[i2].field_1779_c += (double)k + 0.5D;
            }
        }

        Vec3D vec3d = null;
        Vec3D vec3d1 = null;
        Vec3D vec3d2 = null;
        Vec3D vec3d3 = null;
        for(int j2 = 0; j2 < 6; j2++)
        {
            if(j2 == 0)
            {
                f4 = (float)(k1 + 7) / 256F;
                f5 = ((float)(k1 + 9) - 0.01F) / 256F;
                f6 = (float)(l1 + 6) / 256F;
                f7 = ((float)(l1 + 8) - 0.01F) / 256F;
            } else
            if(j2 == 2)
            {
                f4 = (float)(k1 + 7) / 256F;
                f5 = ((float)(k1 + 9) - 0.01F) / 256F;
                f6 = (float)(l1 + 6) / 256F;
                f7 = ((float)(l1 + 16) - 0.01F) / 256F;
            }
            if(j2 == 0)
            {
                vec3d = avec3d[0];
                vec3d1 = avec3d[1];
                vec3d2 = avec3d[2];
                vec3d3 = avec3d[3];
            } else
            if(j2 == 1)
            {
                vec3d = avec3d[7];
                vec3d1 = avec3d[6];
                vec3d2 = avec3d[5];
                vec3d3 = avec3d[4];
            } else
            if(j2 == 2)
            {
                vec3d = avec3d[1];
                vec3d1 = avec3d[0];
                vec3d2 = avec3d[4];
                vec3d3 = avec3d[5];
            } else
            if(j2 == 3)
            {
                vec3d = avec3d[2];
                vec3d1 = avec3d[1];
                vec3d2 = avec3d[5];
                vec3d3 = avec3d[6];
            } else
            if(j2 == 4)
            {
                vec3d = avec3d[3];
                vec3d1 = avec3d[2];
                vec3d2 = avec3d[6];
                vec3d3 = avec3d[7];
            } else
            if(j2 == 5)
            {
                vec3d = avec3d[0];
                vec3d1 = avec3d[3];
                vec3d2 = avec3d[7];
                vec3d3 = avec3d[4];
            }
            tessellator.func_983_a(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c, f4, f7);
            tessellator.func_983_a(vec3d1.field_1776_a, vec3d1.field_1775_b, vec3d1.field_1779_c, f5, f7);
            tessellator.func_983_a(vec3d2.field_1776_a, vec3d2.field_1775_b, vec3d2.field_1779_c, f5, f6);
            tessellator.func_983_a(vec3d3.field_1776_a, vec3d3.field_1775_b, vec3d3.field_1779_c, f4, f6);
        }

        return true;
    }

    public boolean func_1235_d(Block block, int i, int j, int k)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        int l = block.func_218_a(0);
        if(field_1771_b >= 0)
        {
            l = field_1771_b;
        }
        float f = block.func_241_c(field_1772_a, i, j, k);
        tessellator.func_987_a(f, f, f);
        int i1 = (l & 0xf) << 4;
        int j1 = l & 0xf0;
        double d = (float)i1 / 256F;
        double d2 = ((float)i1 + 15.99F) / 256F;
        double d4 = (float)j1 / 256F;
        double d6 = ((float)j1 + 15.99F) / 256F;
        float f1 = 1.4F;
        if(field_1772_a.func_601_g(i, j - 1, k) || Block.fire.func_261_b(field_1772_a, i, j - 1, k))
        {
            double d8 = (double)i + 0.5D + 0.20000000000000001D;
            double d9 = ((double)i + 0.5D) - 0.20000000000000001D;
            double d12 = (double)k + 0.5D + 0.20000000000000001D;
            double d14 = ((double)k + 0.5D) - 0.20000000000000001D;
            double d16 = ((double)i + 0.5D) - 0.29999999999999999D;
            double d18 = (double)i + 0.5D + 0.29999999999999999D;
            double d20 = ((double)k + 0.5D) - 0.29999999999999999D;
            double d22 = (double)k + 0.5D + 0.29999999999999999D;
            tessellator.func_983_a(d16, (float)j + f1, k + 1, d2, d4);
            tessellator.func_983_a(d8, j + 0, k + 1, d2, d6);
            tessellator.func_983_a(d8, j + 0, k + 0, d, d6);
            tessellator.func_983_a(d16, (float)j + f1, k + 0, d, d4);
            tessellator.func_983_a(d18, (float)j + f1, k + 0, d2, d4);
            tessellator.func_983_a(d9, j + 0, k + 0, d2, d6);
            tessellator.func_983_a(d9, j + 0, k + 1, d, d6);
            tessellator.func_983_a(d18, (float)j + f1, k + 1, d, d4);
            d = (float)i1 / 256F;
            d2 = ((float)i1 + 15.99F) / 256F;
            d4 = (float)(j1 + 16) / 256F;
            d6 = ((float)j1 + 15.99F + 16F) / 256F;
            tessellator.func_983_a(i + 1, (float)j + f1, d22, d2, d4);
            tessellator.func_983_a(i + 1, j + 0, d14, d2, d6);
            tessellator.func_983_a(i + 0, j + 0, d14, d, d6);
            tessellator.func_983_a(i + 0, (float)j + f1, d22, d, d4);
            tessellator.func_983_a(i + 0, (float)j + f1, d20, d2, d4);
            tessellator.func_983_a(i + 0, j + 0, d12, d2, d6);
            tessellator.func_983_a(i + 1, j + 0, d12, d, d6);
            tessellator.func_983_a(i + 1, (float)j + f1, d20, d, d4);
            d8 = ((double)i + 0.5D) - 0.5D;
            d9 = (double)i + 0.5D + 0.5D;
            d12 = ((double)k + 0.5D) - 0.5D;
            d14 = (double)k + 0.5D + 0.5D;
            d16 = ((double)i + 0.5D) - 0.40000000000000002D;
            d18 = (double)i + 0.5D + 0.40000000000000002D;
            d20 = ((double)k + 0.5D) - 0.40000000000000002D;
            d22 = (double)k + 0.5D + 0.40000000000000002D;
            tessellator.func_983_a(d16, (float)j + f1, k + 0, d, d4);
            tessellator.func_983_a(d8, j + 0, k + 0, d, d6);
            tessellator.func_983_a(d8, j + 0, k + 1, d2, d6);
            tessellator.func_983_a(d16, (float)j + f1, k + 1, d2, d4);
            tessellator.func_983_a(d18, (float)j + f1, k + 1, d, d4);
            tessellator.func_983_a(d9, j + 0, k + 1, d, d6);
            tessellator.func_983_a(d9, j + 0, k + 0, d2, d6);
            tessellator.func_983_a(d18, (float)j + f1, k + 0, d2, d4);
            d = (float)i1 / 256F;
            d2 = ((float)i1 + 15.99F) / 256F;
            d4 = (float)j1 / 256F;
            d6 = ((float)j1 + 15.99F) / 256F;
            tessellator.func_983_a(i + 0, (float)j + f1, d22, d, d4);
            tessellator.func_983_a(i + 0, j + 0, d14, d, d6);
            tessellator.func_983_a(i + 1, j + 0, d14, d2, d6);
            tessellator.func_983_a(i + 1, (float)j + f1, d22, d2, d4);
            tessellator.func_983_a(i + 1, (float)j + f1, d20, d, d4);
            tessellator.func_983_a(i + 1, j + 0, d12, d, d6);
            tessellator.func_983_a(i + 0, j + 0, d12, d2, d6);
            tessellator.func_983_a(i + 0, (float)j + f1, d20, d2, d4);
        } else
        {
            float f3 = 0.2F;
            float f4 = 0.0625F;
            if((i + j + k & 1) == 1)
            {
                d = (float)i1 / 256F;
                d2 = ((float)i1 + 15.99F) / 256F;
                d4 = (float)(j1 + 16) / 256F;
                d6 = ((float)j1 + 15.99F + 16F) / 256F;
            }
            if((i / 2 + j / 2 + k / 2 & 1) == 1)
            {
                double d10 = d2;
                d2 = d;
                d = d10;
            }
            if(Block.fire.func_261_b(field_1772_a, i - 1, j, k))
            {
                tessellator.func_983_a((float)i + f3, (float)j + f1 + f4, k + 1, d2, d4);
                tessellator.func_983_a(i + 0, (float)(j + 0) + f4, k + 1, d2, d6);
                tessellator.func_983_a(i + 0, (float)(j + 0) + f4, k + 0, d, d6);
                tessellator.func_983_a((float)i + f3, (float)j + f1 + f4, k + 0, d, d4);
                tessellator.func_983_a((float)i + f3, (float)j + f1 + f4, k + 0, d, d4);
                tessellator.func_983_a(i + 0, (float)(j + 0) + f4, k + 0, d, d6);
                tessellator.func_983_a(i + 0, (float)(j + 0) + f4, k + 1, d2, d6);
                tessellator.func_983_a((float)i + f3, (float)j + f1 + f4, k + 1, d2, d4);
            }
            if(Block.fire.func_261_b(field_1772_a, i + 1, j, k))
            {
                tessellator.func_983_a((float)(i + 1) - f3, (float)j + f1 + f4, k + 0, d, d4);
                tessellator.func_983_a((i + 1) - 0, (float)(j + 0) + f4, k + 0, d, d6);
                tessellator.func_983_a((i + 1) - 0, (float)(j + 0) + f4, k + 1, d2, d6);
                tessellator.func_983_a((float)(i + 1) - f3, (float)j + f1 + f4, k + 1, d2, d4);
                tessellator.func_983_a((float)(i + 1) - f3, (float)j + f1 + f4, k + 1, d2, d4);
                tessellator.func_983_a((i + 1) - 0, (float)(j + 0) + f4, k + 1, d2, d6);
                tessellator.func_983_a((i + 1) - 0, (float)(j + 0) + f4, k + 0, d, d6);
                tessellator.func_983_a((float)(i + 1) - f3, (float)j + f1 + f4, k + 0, d, d4);
            }
            if(Block.fire.func_261_b(field_1772_a, i, j, k - 1))
            {
                tessellator.func_983_a(i + 0, (float)j + f1 + f4, (float)k + f3, d2, d4);
                tessellator.func_983_a(i + 0, (float)(j + 0) + f4, k + 0, d2, d6);
                tessellator.func_983_a(i + 1, (float)(j + 0) + f4, k + 0, d, d6);
                tessellator.func_983_a(i + 1, (float)j + f1 + f4, (float)k + f3, d, d4);
                tessellator.func_983_a(i + 1, (float)j + f1 + f4, (float)k + f3, d, d4);
                tessellator.func_983_a(i + 1, (float)(j + 0) + f4, k + 0, d, d6);
                tessellator.func_983_a(i + 0, (float)(j + 0) + f4, k + 0, d2, d6);
                tessellator.func_983_a(i + 0, (float)j + f1 + f4, (float)k + f3, d2, d4);
            }
            if(Block.fire.func_261_b(field_1772_a, i, j, k + 1))
            {
                tessellator.func_983_a(i + 1, (float)j + f1 + f4, (float)(k + 1) - f3, d, d4);
                tessellator.func_983_a(i + 1, (float)(j + 0) + f4, (k + 1) - 0, d, d6);
                tessellator.func_983_a(i + 0, (float)(j + 0) + f4, (k + 1) - 0, d2, d6);
                tessellator.func_983_a(i + 0, (float)j + f1 + f4, (float)(k + 1) - f3, d2, d4);
                tessellator.func_983_a(i + 0, (float)j + f1 + f4, (float)(k + 1) - f3, d2, d4);
                tessellator.func_983_a(i + 0, (float)(j + 0) + f4, (k + 1) - 0, d2, d6);
                tessellator.func_983_a(i + 1, (float)(j + 0) + f4, (k + 1) - 0, d, d6);
                tessellator.func_983_a(i + 1, (float)j + f1 + f4, (float)(k + 1) - f3, d, d4);
            }
            if(Block.fire.func_261_b(field_1772_a, i, j + 1, k))
            {
                double d11 = (double)i + 0.5D + 0.5D;
                double d13 = ((double)i + 0.5D) - 0.5D;
                double d15 = (double)k + 0.5D + 0.5D;
                double d17 = ((double)k + 0.5D) - 0.5D;
                double d19 = ((double)i + 0.5D) - 0.5D;
                double d21 = (double)i + 0.5D + 0.5D;
                double d23 = ((double)k + 0.5D) - 0.5D;
                double d24 = (double)k + 0.5D + 0.5D;
                double d1 = (float)i1 / 256F;
                double d3 = ((float)i1 + 15.99F) / 256F;
                double d5 = (float)j1 / 256F;
                double d7 = ((float)j1 + 15.99F) / 256F;
                j++;
                float f2 = -0.2F;
                if((i + j + k & 1) == 0)
                {
                    tessellator.func_983_a(d19, (float)j + f2, k + 0, d3, d5);
                    tessellator.func_983_a(d11, j + 0, k + 0, d3, d7);
                    tessellator.func_983_a(d11, j + 0, k + 1, d1, d7);
                    tessellator.func_983_a(d19, (float)j + f2, k + 1, d1, d5);
                    d1 = (float)i1 / 256F;
                    d3 = ((float)i1 + 15.99F) / 256F;
                    d5 = (float)(j1 + 16) / 256F;
                    d7 = ((float)j1 + 15.99F + 16F) / 256F;
                    tessellator.func_983_a(d21, (float)j + f2, k + 1, d3, d5);
                    tessellator.func_983_a(d13, j + 0, k + 1, d3, d7);
                    tessellator.func_983_a(d13, j + 0, k + 0, d1, d7);
                    tessellator.func_983_a(d21, (float)j + f2, k + 0, d1, d5);
                } else
                {
                    tessellator.func_983_a(i + 0, (float)j + f2, d24, d3, d5);
                    tessellator.func_983_a(i + 0, j + 0, d17, d3, d7);
                    tessellator.func_983_a(i + 1, j + 0, d17, d1, d7);
                    tessellator.func_983_a(i + 1, (float)j + f2, d24, d1, d5);
                    d1 = (float)i1 / 256F;
                    d3 = ((float)i1 + 15.99F) / 256F;
                    d5 = (float)(j1 + 16) / 256F;
                    d7 = ((float)j1 + 15.99F + 16F) / 256F;
                    tessellator.func_983_a(i + 1, (float)j + f2, d23, d3, d5);
                    tessellator.func_983_a(i + 1, j + 0, d15, d3, d7);
                    tessellator.func_983_a(i + 0, j + 0, d15, d1, d7);
                    tessellator.func_983_a(i + 0, (float)j + f2, d23, d1, d5);
                }
            }
        }
        return true;
    }

    public boolean func_1242_e(Block block, int i, int j, int k)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        int l = block.func_232_a(1, field_1772_a.func_602_e(i, j, k));
        if(field_1771_b >= 0)
        {
            l = field_1771_b;
        }
        float f = block.func_241_c(field_1772_a, i, j, k);
        tessellator.func_987_a(f, f, f);
        int i1 = (l & 0xf) << 4;
        int j1 = l & 0xf0;
        double d = (float)i1 / 256F;
        double d1 = ((float)i1 + 15.99F) / 256F;
        double d2 = (float)j1 / 256F;
        double d3 = ((float)j1 + 15.99F) / 256F;
        float f1 = 0.0F;
        float f2 = 0.03125F;
        boolean flag = BlockRedstoneWire.func_279_b(field_1772_a, i - 1, j, k) || !field_1772_a.func_601_g(i - 1, j, k) && BlockRedstoneWire.func_279_b(field_1772_a, i - 1, j - 1, k);
        boolean flag1 = BlockRedstoneWire.func_279_b(field_1772_a, i + 1, j, k) || !field_1772_a.func_601_g(i + 1, j, k) && BlockRedstoneWire.func_279_b(field_1772_a, i + 1, j - 1, k);
        boolean flag2 = BlockRedstoneWire.func_279_b(field_1772_a, i, j, k - 1) || !field_1772_a.func_601_g(i, j, k - 1) && BlockRedstoneWire.func_279_b(field_1772_a, i, j - 1, k - 1);
        boolean flag3 = BlockRedstoneWire.func_279_b(field_1772_a, i, j, k + 1) || !field_1772_a.func_601_g(i, j, k + 1) && BlockRedstoneWire.func_279_b(field_1772_a, i, j - 1, k + 1);
        if(!field_1772_a.func_601_g(i, j + 1, k))
        {
            if(field_1772_a.func_601_g(i - 1, j, k) && BlockRedstoneWire.func_279_b(field_1772_a, i - 1, j + 1, k))
            {
                flag = true;
            }
            if(field_1772_a.func_601_g(i + 1, j, k) && BlockRedstoneWire.func_279_b(field_1772_a, i + 1, j + 1, k))
            {
                flag1 = true;
            }
            if(field_1772_a.func_601_g(i, j, k - 1) && BlockRedstoneWire.func_279_b(field_1772_a, i, j + 1, k - 1))
            {
                flag2 = true;
            }
            if(field_1772_a.func_601_g(i, j, k + 1) && BlockRedstoneWire.func_279_b(field_1772_a, i, j + 1, k + 1))
            {
                flag3 = true;
            }
        }
        float f3 = 0.3125F;
        float f4 = i + 0;
        float f5 = i + 1;
        float f6 = k + 0;
        float f7 = k + 1;
        byte byte0 = 0;
        if((flag || flag1) && !flag2 && !flag3)
        {
            byte0 = 1;
        }
        if((flag2 || flag3) && !flag1 && !flag)
        {
            byte0 = 2;
        }
        if(byte0 != 0)
        {
            d = (float)(i1 + 16) / 256F;
            d1 = ((float)(i1 + 16) + 15.99F) / 256F;
            d2 = (float)j1 / 256F;
            d3 = ((float)j1 + 15.99F) / 256F;
        }
        if(byte0 == 0)
        {
            if(flag1 || flag2 || flag3 || flag)
            {
                if(!flag)
                {
                    f4 += f3;
                }
                if(!flag)
                {
                    d += f3 / 16F;
                }
                if(!flag1)
                {
                    f5 -= f3;
                }
                if(!flag1)
                {
                    d1 -= f3 / 16F;
                }
                if(!flag2)
                {
                    f6 += f3;
                }
                if(!flag2)
                {
                    d2 += f3 / 16F;
                }
                if(!flag3)
                {
                    f7 -= f3;
                }
                if(!flag3)
                {
                    d3 -= f3 / 16F;
                }
            }
            tessellator.func_983_a(f5 + f1, (float)j + f2, f7 + f1, d1, d3);
            tessellator.func_983_a(f5 + f1, (float)j + f2, f6 - f1, d1, d2);
            tessellator.func_983_a(f4 - f1, (float)j + f2, f6 - f1, d, d2);
            tessellator.func_983_a(f4 - f1, (float)j + f2, f7 + f1, d, d3);
        }
        if(byte0 == 1)
        {
            tessellator.func_983_a(f5 + f1, (float)j + f2, f7 + f1, d1, d3);
            tessellator.func_983_a(f5 + f1, (float)j + f2, f6 - f1, d1, d2);
            tessellator.func_983_a(f4 - f1, (float)j + f2, f6 - f1, d, d2);
            tessellator.func_983_a(f4 - f1, (float)j + f2, f7 + f1, d, d3);
        }
        if(byte0 == 2)
        {
            tessellator.func_983_a(f5 + f1, (float)j + f2, f7 + f1, d1, d3);
            tessellator.func_983_a(f5 + f1, (float)j + f2, f6 - f1, d, d3);
            tessellator.func_983_a(f4 - f1, (float)j + f2, f6 - f1, d, d2);
            tessellator.func_983_a(f4 - f1, (float)j + f2, f7 + f1, d1, d2);
        }
        d = (float)(i1 + 16) / 256F;
        d1 = ((float)(i1 + 16) + 15.99F) / 256F;
        d2 = (float)j1 / 256F;
        d3 = ((float)j1 + 15.99F) / 256F;
        if(!field_1772_a.func_601_g(i, j + 1, k))
        {
            if(field_1772_a.func_601_g(i - 1, j, k) && field_1772_a.func_600_a(i - 1, j + 1, k) == Block.redstoneWire.blockID)
            {
                tessellator.func_983_a((float)i + f2, (float)(j + 1) + f1, (float)(k + 1) + f1, d1, d2);
                tessellator.func_983_a((float)i + f2, (float)(j + 0) - f1, (float)(k + 1) + f1, d, d2);
                tessellator.func_983_a((float)i + f2, (float)(j + 0) - f1, (float)(k + 0) - f1, d, d3);
                tessellator.func_983_a((float)i + f2, (float)(j + 1) + f1, (float)(k + 0) - f1, d1, d3);
            }
            if(field_1772_a.func_601_g(i + 1, j, k) && field_1772_a.func_600_a(i + 1, j + 1, k) == Block.redstoneWire.blockID)
            {
                tessellator.func_983_a((float)(i + 1) - f2, (float)(j + 0) - f1, (float)(k + 1) + f1, d, d3);
                tessellator.func_983_a((float)(i + 1) - f2, (float)(j + 1) + f1, (float)(k + 1) + f1, d1, d3);
                tessellator.func_983_a((float)(i + 1) - f2, (float)(j + 1) + f1, (float)(k + 0) - f1, d1, d2);
                tessellator.func_983_a((float)(i + 1) - f2, (float)(j + 0) - f1, (float)(k + 0) - f1, d, d2);
            }
            if(field_1772_a.func_601_g(i, j, k - 1) && field_1772_a.func_600_a(i, j + 1, k - 1) == Block.redstoneWire.blockID)
            {
                tessellator.func_983_a((float)(i + 1) + f1, (float)(j + 0) - f1, (float)k + f2, d, d3);
                tessellator.func_983_a((float)(i + 1) + f1, (float)(j + 1) + f1, (float)k + f2, d1, d3);
                tessellator.func_983_a((float)(i + 0) - f1, (float)(j + 1) + f1, (float)k + f2, d1, d2);
                tessellator.func_983_a((float)(i + 0) - f1, (float)(j + 0) - f1, (float)k + f2, d, d2);
            }
            if(field_1772_a.func_601_g(i, j, k + 1) && field_1772_a.func_600_a(i, j + 1, k + 1) == Block.redstoneWire.blockID)
            {
                tessellator.func_983_a((float)(i + 1) + f1, (float)(j + 1) + f1, (float)(k + 1) - f2, d1, d2);
                tessellator.func_983_a((float)(i + 1) + f1, (float)(j + 0) - f1, (float)(k + 1) - f2, d, d2);
                tessellator.func_983_a((float)(i + 0) - f1, (float)(j + 0) - f1, (float)(k + 1) - f2, d, d3);
                tessellator.func_983_a((float)(i + 0) - f1, (float)(j + 1) + f1, (float)(k + 1) - f2, d1, d3);
            }
        }
        return true;
    }

    public boolean func_1216_f(Block block, int i, int j, int k)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        int l = field_1772_a.func_602_e(i, j, k);
        int i1 = block.func_232_a(0, l);
        if(field_1771_b >= 0)
        {
            i1 = field_1771_b;
        }
        float f = block.func_241_c(field_1772_a, i, j, k);
        tessellator.func_987_a(f, f, f);
        int j1 = (i1 & 0xf) << 4;
        int k1 = i1 & 0xf0;
        double d = (float)j1 / 256F;
        double d1 = ((float)j1 + 15.99F) / 256F;
        double d2 = (float)k1 / 256F;
        double d3 = ((float)k1 + 15.99F) / 256F;
        float f1 = 0.0625F;
        float f2 = i + 1;
        float f3 = i + 1;
        float f4 = i + 0;
        float f5 = i + 0;
        float f6 = k + 0;
        float f7 = k + 1;
        float f8 = k + 1;
        float f9 = k + 0;
        float f10 = (float)j + f1;
        float f11 = (float)j + f1;
        float f12 = (float)j + f1;
        float f13 = (float)j + f1;
        if(l == 1 || l == 2 || l == 3 || l == 7)
        {
            f2 = f5 = i + 1;
            f3 = f4 = i + 0;
            f6 = f7 = k + 1;
            f8 = f9 = k + 0;
        } else
        if(l == 8)
        {
            f2 = f3 = i + 0;
            f4 = f5 = i + 1;
            f6 = f9 = k + 1;
            f7 = f8 = k + 0;
        } else
        if(l == 9)
        {
            f2 = f5 = i + 0;
            f3 = f4 = i + 1;
            f6 = f7 = k + 0;
            f8 = f9 = k + 1;
        }
        if(l == 2 || l == 4)
        {
            f10++;
            f13++;
        } else
        if(l == 3 || l == 5)
        {
            f11++;
            f12++;
        }
        tessellator.func_983_a(f2, f10, f6, d1, d2);
        tessellator.func_983_a(f3, f11, f7, d1, d3);
        tessellator.func_983_a(f4, f12, f8, d, d3);
        tessellator.func_983_a(f5, f13, f9, d, d2);
        tessellator.func_983_a(f5, f13, f9, d, d2);
        tessellator.func_983_a(f4, f12, f8, d, d3);
        tessellator.func_983_a(f3, f11, f7, d1, d3);
        tessellator.func_983_a(f2, f10, f6, d1, d2);
        return true;
    }

    public boolean func_1221_g(Block block, int i, int j, int k)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        int l = block.func_218_a(0);
        if(field_1771_b >= 0)
        {
            l = field_1771_b;
        }
        float f = block.func_241_c(field_1772_a, i, j, k);
        tessellator.func_987_a(f, f, f);
        int i1 = (l & 0xf) << 4;
        int j1 = l & 0xf0;
        double d = (float)i1 / 256F;
        double d1 = ((float)i1 + 15.99F) / 256F;
        double d2 = (float)j1 / 256F;
        double d3 = ((float)j1 + 15.99F) / 256F;
        int k1 = field_1772_a.func_602_e(i, j, k);
        float f1 = 0.0F;
        float f2 = 0.05F;
        if(k1 == 5)
        {
            tessellator.func_983_a((float)i + f2, (float)(j + 1) + f1, (float)(k + 1) + f1, d, d2);
            tessellator.func_983_a((float)i + f2, (float)(j + 0) - f1, (float)(k + 1) + f1, d, d3);
            tessellator.func_983_a((float)i + f2, (float)(j + 0) - f1, (float)(k + 0) - f1, d1, d3);
            tessellator.func_983_a((float)i + f2, (float)(j + 1) + f1, (float)(k + 0) - f1, d1, d2);
        }
        if(k1 == 4)
        {
            tessellator.func_983_a((float)(i + 1) - f2, (float)(j + 0) - f1, (float)(k + 1) + f1, d1, d3);
            tessellator.func_983_a((float)(i + 1) - f2, (float)(j + 1) + f1, (float)(k + 1) + f1, d1, d2);
            tessellator.func_983_a((float)(i + 1) - f2, (float)(j + 1) + f1, (float)(k + 0) - f1, d, d2);
            tessellator.func_983_a((float)(i + 1) - f2, (float)(j + 0) - f1, (float)(k + 0) - f1, d, d3);
        }
        if(k1 == 3)
        {
            tessellator.func_983_a((float)(i + 1) + f1, (float)(j + 0) - f1, (float)k + f2, d1, d3);
            tessellator.func_983_a((float)(i + 1) + f1, (float)(j + 1) + f1, (float)k + f2, d1, d2);
            tessellator.func_983_a((float)(i + 0) - f1, (float)(j + 1) + f1, (float)k + f2, d, d2);
            tessellator.func_983_a((float)(i + 0) - f1, (float)(j + 0) - f1, (float)k + f2, d, d3);
        }
        if(k1 == 2)
        {
            tessellator.func_983_a((float)(i + 1) + f1, (float)(j + 1) + f1, (float)(k + 1) - f2, d, d2);
            tessellator.func_983_a((float)(i + 1) + f1, (float)(j + 0) - f1, (float)(k + 1) - f2, d, d3);
            tessellator.func_983_a((float)(i + 0) - f1, (float)(j + 0) - f1, (float)(k + 1) - f2, d1, d3);
            tessellator.func_983_a((float)(i + 0) - f1, (float)(j + 1) + f1, (float)(k + 1) - f2, d1, d2);
        }
        return true;
    }

    public boolean func_1226_h(Block block, int i, int j, int k)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        float f = block.func_241_c(field_1772_a, i, j, k);
        tessellator.func_987_a(f, f, f);
        func_1239_a(block, field_1772_a.func_602_e(i, j, k), i, j, k);
        return true;
    }

    public boolean func_1232_i(Block block, int i, int j, int k)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        float f = block.func_241_c(field_1772_a, i, j, k);
        tessellator.func_987_a(f, f, f);
        func_1245_b(block, field_1772_a.func_602_e(i, j, k), i, (float)j - 0.0625F, k);
        return true;
    }

    public void func_1237_a(Block block, double d, double d1, double d2, 
            double d3, double d4)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        int i = block.func_218_a(0);
        if(field_1771_b >= 0)
        {
            i = field_1771_b;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        float f = (float)j / 256F;
        float f1 = ((float)j + 15.99F) / 256F;
        float f2 = (float)k / 256F;
        float f3 = ((float)k + 15.99F) / 256F;
        double d5 = (double)f + 0.02734375D;
        double d6 = (double)f2 + 0.0234375D;
        double d7 = (double)f + 0.03515625D;
        double d8 = (double)f2 + 0.03125D;
        d += 0.5D;
        d2 += 0.5D;
        double d9 = d - 0.5D;
        double d10 = d + 0.5D;
        double d11 = d2 - 0.5D;
        double d12 = d2 + 0.5D;
        double d13 = 0.0625D;
        double d14 = 0.625D;
        tessellator.func_983_a((d + d3 * (1.0D - d14)) - d13, d1 + d14, (d2 + d4 * (1.0D - d14)) - d13, d5, d6);
        tessellator.func_983_a((d + d3 * (1.0D - d14)) - d13, d1 + d14, d2 + d4 * (1.0D - d14) + d13, d5, d8);
        tessellator.func_983_a(d + d3 * (1.0D - d14) + d13, d1 + d14, d2 + d4 * (1.0D - d14) + d13, d7, d8);
        tessellator.func_983_a(d + d3 * (1.0D - d14) + d13, d1 + d14, (d2 + d4 * (1.0D - d14)) - d13, d7, d6);
        tessellator.func_983_a(d - d13, d1 + 1.0D, d11, f, f2);
        tessellator.func_983_a((d - d13) + d3, d1 + 0.0D, d11 + d4, f, f3);
        tessellator.func_983_a((d - d13) + d3, d1 + 0.0D, d12 + d4, f1, f3);
        tessellator.func_983_a(d - d13, d1 + 1.0D, d12, f1, f2);
        tessellator.func_983_a(d + d13, d1 + 1.0D, d12, f, f2);
        tessellator.func_983_a(d + d3 + d13, d1 + 0.0D, d12 + d4, f, f3);
        tessellator.func_983_a(d + d3 + d13, d1 + 0.0D, d11 + d4, f1, f3);
        tessellator.func_983_a(d + d13, d1 + 1.0D, d11, f1, f2);
        tessellator.func_983_a(d9, d1 + 1.0D, d2 + d13, f, f2);
        tessellator.func_983_a(d9 + d3, d1 + 0.0D, d2 + d13 + d4, f, f3);
        tessellator.func_983_a(d10 + d3, d1 + 0.0D, d2 + d13 + d4, f1, f3);
        tessellator.func_983_a(d10, d1 + 1.0D, d2 + d13, f1, f2);
        tessellator.func_983_a(d10, d1 + 1.0D, d2 - d13, f, f2);
        tessellator.func_983_a(d10 + d3, d1 + 0.0D, (d2 - d13) + d4, f, f3);
        tessellator.func_983_a(d9 + d3, d1 + 0.0D, (d2 - d13) + d4, f1, f3);
        tessellator.func_983_a(d9, d1 + 1.0D, d2 - d13, f1, f2);
    }

    public void func_1239_a(Block block, int i, double d, double d1, double d2)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        int j = block.func_232_a(0, i);
        if(field_1771_b >= 0)
        {
            j = field_1771_b;
        }
        int k = (j & 0xf) << 4;
        int l = j & 0xf0;
        double d3 = (float)k / 256F;
        double d4 = ((float)k + 15.99F) / 256F;
        double d5 = (float)l / 256F;
        double d6 = ((float)l + 15.99F) / 256F;
        double d7 = (d + 0.5D) - 0.44999998807907104D;
        double d8 = d + 0.5D + 0.44999998807907104D;
        double d9 = (d2 + 0.5D) - 0.44999998807907104D;
        double d10 = d2 + 0.5D + 0.44999998807907104D;
        tessellator.func_983_a(d7, d1 + 1.0D, d9, d3, d5);
        tessellator.func_983_a(d7, d1 + 0.0D, d9, d3, d6);
        tessellator.func_983_a(d8, d1 + 0.0D, d10, d4, d6);
        tessellator.func_983_a(d8, d1 + 1.0D, d10, d4, d5);
        tessellator.func_983_a(d8, d1 + 1.0D, d10, d3, d5);
        tessellator.func_983_a(d8, d1 + 0.0D, d10, d3, d6);
        tessellator.func_983_a(d7, d1 + 0.0D, d9, d4, d6);
        tessellator.func_983_a(d7, d1 + 1.0D, d9, d4, d5);
        tessellator.func_983_a(d7, d1 + 1.0D, d10, d3, d5);
        tessellator.func_983_a(d7, d1 + 0.0D, d10, d3, d6);
        tessellator.func_983_a(d8, d1 + 0.0D, d9, d4, d6);
        tessellator.func_983_a(d8, d1 + 1.0D, d9, d4, d5);
        tessellator.func_983_a(d8, d1 + 1.0D, d9, d3, d5);
        tessellator.func_983_a(d8, d1 + 0.0D, d9, d3, d6);
        tessellator.func_983_a(d7, d1 + 0.0D, d10, d4, d6);
        tessellator.func_983_a(d7, d1 + 1.0D, d10, d4, d5);
    }

    public void func_1245_b(Block block, int i, double d, double d1, double d2)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        int j = block.func_232_a(0, i);
        if(field_1771_b >= 0)
        {
            j = field_1771_b;
        }
        int k = (j & 0xf) << 4;
        int l = j & 0xf0;
        double d3 = (float)k / 256F;
        double d4 = ((float)k + 15.99F) / 256F;
        double d5 = (float)l / 256F;
        double d6 = ((float)l + 15.99F) / 256F;
        double d7 = (d + 0.5D) - 0.25D;
        double d8 = d + 0.5D + 0.25D;
        double d9 = (d2 + 0.5D) - 0.5D;
        double d10 = d2 + 0.5D + 0.5D;
        tessellator.func_983_a(d7, d1 + 1.0D, d9, d3, d5);
        tessellator.func_983_a(d7, d1 + 0.0D, d9, d3, d6);
        tessellator.func_983_a(d7, d1 + 0.0D, d10, d4, d6);
        tessellator.func_983_a(d7, d1 + 1.0D, d10, d4, d5);
        tessellator.func_983_a(d7, d1 + 1.0D, d10, d3, d5);
        tessellator.func_983_a(d7, d1 + 0.0D, d10, d3, d6);
        tessellator.func_983_a(d7, d1 + 0.0D, d9, d4, d6);
        tessellator.func_983_a(d7, d1 + 1.0D, d9, d4, d5);
        tessellator.func_983_a(d8, d1 + 1.0D, d10, d3, d5);
        tessellator.func_983_a(d8, d1 + 0.0D, d10, d3, d6);
        tessellator.func_983_a(d8, d1 + 0.0D, d9, d4, d6);
        tessellator.func_983_a(d8, d1 + 1.0D, d9, d4, d5);
        tessellator.func_983_a(d8, d1 + 1.0D, d9, d3, d5);
        tessellator.func_983_a(d8, d1 + 0.0D, d9, d3, d6);
        tessellator.func_983_a(d8, d1 + 0.0D, d10, d4, d6);
        tessellator.func_983_a(d8, d1 + 1.0D, d10, d4, d5);
        d7 = (d + 0.5D) - 0.5D;
        d8 = d + 0.5D + 0.5D;
        d9 = (d2 + 0.5D) - 0.25D;
        d10 = d2 + 0.5D + 0.25D;
        tessellator.func_983_a(d7, d1 + 1.0D, d9, d3, d5);
        tessellator.func_983_a(d7, d1 + 0.0D, d9, d3, d6);
        tessellator.func_983_a(d8, d1 + 0.0D, d9, d4, d6);
        tessellator.func_983_a(d8, d1 + 1.0D, d9, d4, d5);
        tessellator.func_983_a(d8, d1 + 1.0D, d9, d3, d5);
        tessellator.func_983_a(d8, d1 + 0.0D, d9, d3, d6);
        tessellator.func_983_a(d7, d1 + 0.0D, d9, d4, d6);
        tessellator.func_983_a(d7, d1 + 1.0D, d9, d4, d5);
        tessellator.func_983_a(d8, d1 + 1.0D, d10, d3, d5);
        tessellator.func_983_a(d8, d1 + 0.0D, d10, d3, d6);
        tessellator.func_983_a(d7, d1 + 0.0D, d10, d4, d6);
        tessellator.func_983_a(d7, d1 + 1.0D, d10, d4, d5);
        tessellator.func_983_a(d7, d1 + 1.0D, d10, d3, d5);
        tessellator.func_983_a(d7, d1 + 0.0D, d10, d3, d6);
        tessellator.func_983_a(d8, d1 + 0.0D, d10, d4, d6);
        tessellator.func_983_a(d8, d1 + 1.0D, d10, d4, d5);
    }

    public boolean func_1222_j(Block block, int i, int j, int k)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        boolean flag = block.func_260_c(field_1772_a, i, j + 1, k, 1);
        boolean flag1 = block.func_260_c(field_1772_a, i, j - 1, k, 0);
        boolean aflag[] = new boolean[4];
        aflag[0] = block.func_260_c(field_1772_a, i, j, k - 1, 2);
        aflag[1] = block.func_260_c(field_1772_a, i, j, k + 1, 3);
        aflag[2] = block.func_260_c(field_1772_a, i - 1, j, k, 4);
        aflag[3] = block.func_260_c(field_1772_a, i + 1, j, k, 5);
        if(!flag && !flag1 && !aflag[0] && !aflag[1] && !aflag[2] && !aflag[3])
        {
            return false;
        }
        boolean flag2 = false;
        float f = 0.5F;
        float f1 = 1.0F;
        float f2 = 0.8F;
        float f3 = 0.6F;
        double d = 0.0D;
        double d1 = 1.0D;
        Material material = block.material;
        int l = field_1772_a.func_602_e(i, j, k);
        float f4 = func_1224_a(i, j, k, material);
        float f5 = func_1224_a(i, j, k + 1, material);
        float f6 = func_1224_a(i + 1, j, k + 1, material);
        float f7 = func_1224_a(i + 1, j, k, material);
        if(field_1773_d || flag)
        {
            flag2 = true;
            int i1 = block.func_232_a(1, l);
            float f9 = (float)BlockFluids.func_293_a(field_1772_a, i, j, k, material);
            if(f9 > -999F)
            {
                i1 = block.func_232_a(2, l);
            }
            int l1 = (i1 & 0xf) << 4;
            int j2 = i1 & 0xf0;
            double d2 = ((double)l1 + 8D) / 256D;
            double d3 = ((double)j2 + 8D) / 256D;
            if(f9 < -999F)
            {
                f9 = 0.0F;
            } else
            {
                d2 = (float)(l1 + 16) / 256F;
                d3 = (float)(j2 + 16) / 256F;
            }
            float f11 = (MathHelper.func_1106_a(f9) * 8F) / 256F;
            float f13 = (MathHelper.func_1114_b(f9) * 8F) / 256F;
            float f15 = block.func_241_c(field_1772_a, i, j, k);
            tessellator.func_987_a(f1 * f15, f1 * f15, f1 * f15);
            tessellator.func_983_a(i + 0, (float)j + f4, k + 0, d2 - (double)f13 - (double)f11, (d3 - (double)f13) + (double)f11);
            tessellator.func_983_a(i + 0, (float)j + f5, k + 1, (d2 - (double)f13) + (double)f11, d3 + (double)f13 + (double)f11);
            tessellator.func_983_a(i + 1, (float)j + f6, k + 1, d2 + (double)f13 + (double)f11, (d3 + (double)f13) - (double)f11);
            tessellator.func_983_a(i + 1, (float)j + f7, k + 0, (d2 + (double)f13) - (double)f11, d3 - (double)f13 - (double)f11);
        }
        if(field_1773_d || flag1)
        {
            float f8 = block.func_241_c(field_1772_a, i, j - 1, k);
            tessellator.func_987_a(f * f8, f * f8, f * f8);
            func_1244_a(block, i, j, k, block.func_218_a(0));
            flag2 = true;
        }
        for(int j1 = 0; j1 < 4; j1++)
        {
            int k1 = i;
            int i2 = j;
            int k2 = k;
            if(j1 == 0)
            {
                k2--;
            }
            if(j1 == 1)
            {
                k2++;
            }
            if(j1 == 2)
            {
                k1--;
            }
            if(j1 == 3)
            {
                k1++;
            }
            int l2 = block.func_232_a(j1 + 2, l);
            int i3 = (l2 & 0xf) << 4;
            int j3 = l2 & 0xf0;
            if(!field_1773_d && !aflag[j1])
            {
                continue;
            }
            float f10;
            float f12;
            float f14;
            float f16;
            float f17;
            float f18;
            if(j1 == 0)
            {
                f10 = f4;
                f12 = f7;
                f14 = i;
                f17 = i + 1;
                f16 = k;
                f18 = k;
            } else
            if(j1 == 1)
            {
                f10 = f6;
                f12 = f5;
                f14 = i + 1;
                f17 = i;
                f16 = k + 1;
                f18 = k + 1;
            } else
            if(j1 == 2)
            {
                f10 = f5;
                f12 = f4;
                f14 = i;
                f17 = i;
                f16 = k + 1;
                f18 = k;
            } else
            {
                f10 = f7;
                f12 = f6;
                f14 = i + 1;
                f17 = i + 1;
                f16 = k;
                f18 = k + 1;
            }
            flag2 = true;
            double d4 = (float)(i3 + 0) / 256F;
            double d5 = ((double)(i3 + 16) - 0.01D) / 256D;
            double d6 = ((float)j3 + (1.0F - f10) * 16F) / 256F;
            double d7 = ((float)j3 + (1.0F - f12) * 16F) / 256F;
            double d8 = ((double)(j3 + 16) - 0.01D) / 256D;
            float f19 = block.func_241_c(field_1772_a, k1, i2, k2);
            if(j1 < 2)
            {
                f19 *= f2;
            } else
            {
                f19 *= f3;
            }
            tessellator.func_987_a(f1 * f19, f1 * f19, f1 * f19);
            tessellator.func_983_a(f14, (float)j + f10, f16, d4, d6);
            tessellator.func_983_a(f17, (float)j + f12, f18, d5, d7);
            tessellator.func_983_a(f17, j + 0, f18, d5, d8);
            tessellator.func_983_a(f14, j + 0, f16, d4, d8);
        }

        block.field_368_bg = d;
        block.field_362_bj = d1;
        return flag2;
    }

    private float func_1224_a(int i, int j, int k, Material material)
    {
        int l = 0;
        float f = 0.0F;
        for(int i1 = 0; i1 < 4; i1++)
        {
            int j1 = i - (i1 & 1);
            int k1 = j;
            int l1 = k - (i1 >> 1 & 1);
            if(field_1772_a.func_599_f(j1, k1 + 1, l1) == material)
            {
                return 1.0F;
            }
            Material material1 = field_1772_a.func_599_f(j1, k1, l1);
            if(material1 == material)
            {
                int i2 = field_1772_a.func_602_e(j1, k1, l1);
                if(i2 >= 8 || i2 == 0)
                {
                    f += BlockFluids.func_288_b(i2) * 10F;
                    l += 10;
                }
                f += BlockFluids.func_288_b(i2);
                l++;
                continue;
            }
            if(!material1.func_878_a())
            {
                f++;
                l++;
            }
        }

        return 1.0F - f / (float)l;
    }

    public void func_1243_a(Block block, World world, int i, int j, int k)
    {
        float f = 0.5F;
        float f1 = 1.0F;
        float f2 = 0.8F;
        float f3 = 0.6F;
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        float f4 = block.func_241_c(world, i, j, k);
        float f5 = block.func_241_c(world, i, j - 1, k);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.func_987_a(f * f5, f * f5, f * f5);
        func_1244_a(block, -0.5D, -0.5D, -0.5D, block.func_218_a(0));
        f5 = block.func_241_c(world, i, j + 1, k);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.func_987_a(f1 * f5, f1 * f5, f1 * f5);
        func_1217_b(block, -0.5D, -0.5D, -0.5D, block.func_218_a(1));
        f5 = block.func_241_c(world, i, j, k - 1);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.func_987_a(f2 * f5, f2 * f5, f2 * f5);
        func_1220_c(block, -0.5D, -0.5D, -0.5D, block.func_218_a(2));
        f5 = block.func_241_c(world, i, j, k + 1);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.func_987_a(f2 * f5, f2 * f5, f2 * f5);
        func_1225_d(block, -0.5D, -0.5D, -0.5D, block.func_218_a(3));
        f5 = block.func_241_c(world, i - 1, j, k);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.func_987_a(f3 * f5, f3 * f5, f3 * f5);
        func_1231_e(block, -0.5D, -0.5D, -0.5D, block.func_218_a(4));
        f5 = block.func_241_c(world, i + 1, j, k);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.func_987_a(f3 * f5, f3 * f5, f3 * f5);
        func_1236_f(block, -0.5D, -0.5D, -0.5D, block.func_218_a(5));
        tessellator.func_982_a();
    }

    public boolean func_1228_k(Block block, int i, int j, int k)
    {
        int l = block.func_207_d(field_1772_a, i, j, k);
        float f = (float)(l >> 16 & 0xff) / 255F;
        float f1 = (float)(l >> 8 & 0xff) / 255F;
        float f2 = (float)(l & 0xff) / 255F;
        return func_1215_a(block, i, j, k, f, f1, f2);
    }

    public boolean func_1215_a(Block block, int i, int j, int k, float f, float f1, float f2)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        boolean flag = false;
        float f3 = 0.5F;
        float f4 = 1.0F;
        float f5 = 0.8F;
        float f6 = 0.6F;
        float f7 = f3 * f;
        float f8 = f4 * f;
        float f9 = f5 * f;
        float f10 = f6 * f;
        float f11 = f3 * f1;
        float f12 = f4 * f1;
        float f13 = f5 * f1;
        float f14 = f6 * f1;
        float f15 = f3 * f2;
        float f16 = f4 * f2;
        float f17 = f5 * f2;
        float f18 = f6 * f2;
        float f19 = block.func_241_c(field_1772_a, i, j, k);
        if(field_1773_d || block.func_260_c(field_1772_a, i, j - 1, k, 0))
        {
            float f20 = block.func_241_c(field_1772_a, i, j - 1, k);
            tessellator.func_987_a(f7 * f20, f11 * f20, f15 * f20);
            func_1244_a(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 0));
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i, j + 1, k, 1))
        {
            float f21 = block.func_241_c(field_1772_a, i, j + 1, k);
            if(block.field_362_bj != 1.0D && !block.material.func_879_d())
            {
                f21 = f19;
            }
            tessellator.func_987_a(f8 * f21, f12 * f21, f16 * f21);
            func_1217_b(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 1));
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i, j, k - 1, 2))
        {
            float f22 = block.func_241_c(field_1772_a, i, j, k - 1);
            if(block.field_366_bh > 0.0D)
            {
                f22 = f19;
            }
            tessellator.func_987_a(f9 * f22, f13 * f22, f17 * f22);
            func_1220_c(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 2));
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i, j, k + 1, 3))
        {
            float f23 = block.func_241_c(field_1772_a, i, j, k + 1);
            if(block.field_360_bk < 1.0D)
            {
                f23 = f19;
            }
            tessellator.func_987_a(f9 * f23, f13 * f23, f17 * f23);
            func_1225_d(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 3));
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i - 1, j, k, 4))
        {
            float f24 = block.func_241_c(field_1772_a, i - 1, j, k);
            if(block.field_370_bf > 0.0D)
            {
                f24 = f19;
            }
            tessellator.func_987_a(f10 * f24, f14 * f24, f18 * f24);
            func_1231_e(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 4));
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i + 1, j, k, 5))
        {
            float f25 = block.func_241_c(field_1772_a, i + 1, j, k);
            if(block.field_364_bi < 1.0D)
            {
                f25 = f19;
            }
            tessellator.func_987_a(f10 * f25, f14 * f25, f18 * f25);
            func_1236_f(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 5));
            flag = true;
        }
        return flag;
    }

    public boolean func_1233_l(Block block, int i, int j, int k)
    {
        int l = block.func_207_d(field_1772_a, i, j, k);
        float f = (float)(l >> 16 & 0xff) / 255F;
        float f1 = (float)(l >> 8 & 0xff) / 255F;
        float f2 = (float)(l & 0xff) / 255F;
        return func_1230_b(block, i, j, k, f, f1, f2);
    }

    public boolean func_1230_b(Block block, int i, int j, int k, float f, float f1, float f2)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        boolean flag = false;
        float f3 = 0.5F;
        float f4 = 1.0F;
        float f5 = 0.8F;
        float f6 = 0.6F;
        float f7 = f3 * f;
        float f8 = f4 * f;
        float f9 = f5 * f;
        float f10 = f6 * f;
        float f11 = f3 * f1;
        float f12 = f4 * f1;
        float f13 = f5 * f1;
        float f14 = f6 * f1;
        float f15 = f3 * f2;
        float f16 = f4 * f2;
        float f17 = f5 * f2;
        float f18 = f6 * f2;
        float f19 = 0.0625F;
        float f20 = block.func_241_c(field_1772_a, i, j, k);
        if(field_1773_d || block.func_260_c(field_1772_a, i, j - 1, k, 0))
        {
            float f21 = block.func_241_c(field_1772_a, i, j - 1, k);
            tessellator.func_987_a(f7 * f21, f11 * f21, f15 * f21);
            func_1244_a(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 0));
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i, j + 1, k, 1))
        {
            float f22 = block.func_241_c(field_1772_a, i, j + 1, k);
            if(block.field_362_bj != 1.0D && !block.material.func_879_d())
            {
                f22 = f20;
            }
            tessellator.func_987_a(f8 * f22, f12 * f22, f16 * f22);
            func_1217_b(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 1));
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i, j, k - 1, 2))
        {
            float f23 = block.func_241_c(field_1772_a, i, j, k - 1);
            if(block.field_366_bh > 0.0D)
            {
                f23 = f20;
            }
            tessellator.func_987_a(f9 * f23, f13 * f23, f17 * f23);
            tessellator.func_988_c(0.0F, 0.0F, f19);
            func_1220_c(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 2));
            tessellator.func_988_c(0.0F, 0.0F, -f19);
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i, j, k + 1, 3))
        {
            float f24 = block.func_241_c(field_1772_a, i, j, k + 1);
            if(block.field_360_bk < 1.0D)
            {
                f24 = f20;
            }
            tessellator.func_987_a(f9 * f24, f13 * f24, f17 * f24);
            tessellator.func_988_c(0.0F, 0.0F, -f19);
            func_1225_d(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 3));
            tessellator.func_988_c(0.0F, 0.0F, f19);
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i - 1, j, k, 4))
        {
            float f25 = block.func_241_c(field_1772_a, i - 1, j, k);
            if(block.field_370_bf > 0.0D)
            {
                f25 = f20;
            }
            tessellator.func_987_a(f10 * f25, f14 * f25, f18 * f25);
            tessellator.func_988_c(f19, 0.0F, 0.0F);
            func_1231_e(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 4));
            tessellator.func_988_c(-f19, 0.0F, 0.0F);
            flag = true;
        }
        if(field_1773_d || block.func_260_c(field_1772_a, i + 1, j, k, 5))
        {
            float f26 = block.func_241_c(field_1772_a, i + 1, j, k);
            if(block.field_364_bi < 1.0D)
            {
                f26 = f20;
            }
            tessellator.func_987_a(f10 * f26, f14 * f26, f18 * f26);
            tessellator.func_988_c(-f19, 0.0F, 0.0F);
            func_1236_f(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 5));
            tessellator.func_988_c(f19, 0.0F, 0.0F);
            flag = true;
        }
        return flag;
    }

    public boolean func_1240_m(Block block, int i, int j, int k)
    {
        boolean flag = false;
        float f = 0.375F;
        float f1 = 0.625F;
        block.func_213_a(f, 0.0F, f, f1, 1.0F, f1);
        func_1228_k(block, i, j, k);
        boolean flag1 = false;
        boolean flag2 = false;
        if(field_1772_a.func_600_a(i - 1, j, k) == block.blockID || field_1772_a.func_600_a(i + 1, j, k) == block.blockID)
        {
            flag1 = true;
        }
        if(field_1772_a.func_600_a(i, j, k - 1) == block.blockID || field_1772_a.func_600_a(i, j, k + 1) == block.blockID)
        {
            flag2 = true;
        }
        boolean flag3 = field_1772_a.func_600_a(i - 1, j, k) == block.blockID;
        boolean flag4 = field_1772_a.func_600_a(i + 1, j, k) == block.blockID;
        boolean flag5 = field_1772_a.func_600_a(i, j, k - 1) == block.blockID;
        boolean flag6 = field_1772_a.func_600_a(i, j, k + 1) == block.blockID;
        if(!flag1 && !flag2)
        {
            flag1 = true;
        }
        f = 0.4375F;
        f1 = 0.5625F;
        float f2 = 0.75F;
        float f3 = 0.9375F;
        float f4 = flag3 ? 0.0F : f;
        float f5 = flag4 ? 1.0F : f1;
        float f6 = flag5 ? 0.0F : f;
        float f7 = flag6 ? 1.0F : f1;
        if(flag1)
        {
            block.func_213_a(f4, f2, f, f5, f3, f1);
            func_1228_k(block, i, j, k);
        }
        if(flag2)
        {
            block.func_213_a(f, f2, f6, f1, f3, f7);
            func_1228_k(block, i, j, k);
        }
        f2 = 0.375F;
        f3 = 0.5625F;
        if(flag1)
        {
            block.func_213_a(f4, f2, f, f5, f3, f1);
            func_1228_k(block, i, j, k);
        }
        if(flag2)
        {
            block.func_213_a(f, f2, f6, f1, f3, f7);
            func_1228_k(block, i, j, k);
        }
        block.func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        return flag;
    }

    public boolean func_1214_n(Block block, int i, int j, int k)
    {
        boolean flag = false;
        int l = field_1772_a.func_602_e(i, j, k);
        if(l == 0)
        {
            block.func_213_a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
            func_1228_k(block, i, j, k);
            block.func_213_a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            func_1228_k(block, i, j, k);
        } else
        if(l == 1)
        {
            block.func_213_a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            func_1228_k(block, i, j, k);
            block.func_213_a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            func_1228_k(block, i, j, k);
        } else
        if(l == 2)
        {
            block.func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            func_1228_k(block, i, j, k);
            block.func_213_a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            func_1228_k(block, i, j, k);
        } else
        if(l == 3)
        {
            block.func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            func_1228_k(block, i, j, k);
            block.func_213_a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            func_1228_k(block, i, j, k);
        }
        block.func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        return flag;
    }

    public boolean func_1218_o(Block block, int i, int j, int k)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        BlockDoor blockdoor = (BlockDoor)block;
        boolean flag = false;
        float f = 0.5F;
        float f1 = 1.0F;
        float f2 = 0.8F;
        float f3 = 0.6F;
        float f4 = block.func_241_c(field_1772_a, i, j, k);
        float f5 = block.func_241_c(field_1772_a, i, j - 1, k);
        if(blockdoor.field_368_bg > 0.0D)
        {
            f5 = f4;
        }
        if(Block.field_339_t[block.blockID] > 0)
        {
            f5 = 1.0F;
        }
        tessellator.func_987_a(f * f5, f * f5, f * f5);
        func_1244_a(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 0));
        flag = true;
        f5 = block.func_241_c(field_1772_a, i, j + 1, k);
        if(blockdoor.field_362_bj < 1.0D)
        {
            f5 = f4;
        }
        if(Block.field_339_t[block.blockID] > 0)
        {
            f5 = 1.0F;
        }
        tessellator.func_987_a(f1 * f5, f1 * f5, f1 * f5);
        func_1217_b(block, i, j, k, block.func_211_a(field_1772_a, i, j, k, 1));
        flag = true;
        f5 = block.func_241_c(field_1772_a, i, j, k - 1);
        if(blockdoor.field_366_bh > 0.0D)
        {
            f5 = f4;
        }
        if(Block.field_339_t[block.blockID] > 0)
        {
            f5 = 1.0F;
        }
        tessellator.func_987_a(f2 * f5, f2 * f5, f2 * f5);
        int l = block.func_211_a(field_1772_a, i, j, k, 2);
        if(l < 0)
        {
            field_1774_c = true;
            l = -l;
        }
        func_1220_c(block, i, j, k, l);
        flag = true;
        field_1774_c = false;
        f5 = block.func_241_c(field_1772_a, i, j, k + 1);
        if(blockdoor.field_360_bk < 1.0D)
        {
            f5 = f4;
        }
        if(Block.field_339_t[block.blockID] > 0)
        {
            f5 = 1.0F;
        }
        tessellator.func_987_a(f2 * f5, f2 * f5, f2 * f5);
        l = block.func_211_a(field_1772_a, i, j, k, 3);
        if(l < 0)
        {
            field_1774_c = true;
            l = -l;
        }
        func_1225_d(block, i, j, k, l);
        flag = true;
        field_1774_c = false;
        f5 = block.func_241_c(field_1772_a, i - 1, j, k);
        if(blockdoor.field_370_bf > 0.0D)
        {
            f5 = f4;
        }
        if(Block.field_339_t[block.blockID] > 0)
        {
            f5 = 1.0F;
        }
        tessellator.func_987_a(f3 * f5, f3 * f5, f3 * f5);
        l = block.func_211_a(field_1772_a, i, j, k, 4);
        if(l < 0)
        {
            field_1774_c = true;
            l = -l;
        }
        func_1231_e(block, i, j, k, l);
        flag = true;
        field_1774_c = false;
        f5 = block.func_241_c(field_1772_a, i + 1, j, k);
        if(blockdoor.field_364_bi < 1.0D)
        {
            f5 = f4;
        }
        if(Block.field_339_t[block.blockID] > 0)
        {
            f5 = 1.0F;
        }
        tessellator.func_987_a(f3 * f5, f3 * f5, f3 * f5);
        l = block.func_211_a(field_1772_a, i, j, k, 5);
        if(l < 0)
        {
            field_1774_c = true;
            l = -l;
        }
        func_1236_f(block, i, j, k, l);
        flag = true;
        field_1774_c = false;
        return flag;
    }

    public void func_1244_a(Block block, double d, double d1, double d2, 
            int i)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        if(field_1771_b >= 0)
        {
            i = field_1771_b;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.field_370_bf * 16D) / 256D;
        double d4 = (((double)j + block.field_364_bi * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.field_366_bh * 16D) / 256D;
        double d6 = (((double)k + block.field_360_bk * 16D) - 0.01D) / 256D;
        if(block.field_370_bf < 0.0D || block.field_364_bi > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.field_366_bh < 0.0D || block.field_360_bk > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d7 = d + block.field_370_bf;
        double d8 = d + block.field_364_bi;
        double d9 = d1 + block.field_368_bg;
        double d10 = d2 + block.field_366_bh;
        double d11 = d2 + block.field_360_bk;
        tessellator.func_983_a(d7, d9, d11, d3, d6);
        tessellator.func_983_a(d7, d9, d10, d3, d5);
        tessellator.func_983_a(d8, d9, d10, d4, d5);
        tessellator.func_983_a(d8, d9, d11, d4, d6);
    }

    public void func_1217_b(Block block, double d, double d1, double d2, 
            int i)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        if(field_1771_b >= 0)
        {
            i = field_1771_b;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.field_370_bf * 16D) / 256D;
        double d4 = (((double)j + block.field_364_bi * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.field_366_bh * 16D) / 256D;
        double d6 = (((double)k + block.field_360_bk * 16D) - 0.01D) / 256D;
        if(block.field_370_bf < 0.0D || block.field_364_bi > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.field_366_bh < 0.0D || block.field_360_bk > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d7 = d + block.field_370_bf;
        double d8 = d + block.field_364_bi;
        double d9 = d1 + block.field_362_bj;
        double d10 = d2 + block.field_366_bh;
        double d11 = d2 + block.field_360_bk;
        tessellator.func_983_a(d8, d9, d11, d4, d6);
        tessellator.func_983_a(d8, d9, d10, d4, d5);
        tessellator.func_983_a(d7, d9, d10, d3, d5);
        tessellator.func_983_a(d7, d9, d11, d3, d6);
    }

    public void func_1220_c(Block block, double d, double d1, double d2, 
            int i)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        if(field_1771_b >= 0)
        {
            i = field_1771_b;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.field_370_bf * 16D) / 256D;
        double d4 = (((double)j + block.field_364_bi * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.field_368_bg * 16D) / 256D;
        double d6 = (((double)k + block.field_362_bj * 16D) - 0.01D) / 256D;
        if(field_1774_c)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.field_370_bf < 0.0D || block.field_364_bi > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.field_368_bg < 0.0D || block.field_362_bj > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.field_370_bf;
        double d9 = d + block.field_364_bi;
        double d10 = d1 + block.field_368_bg;
        double d11 = d1 + block.field_362_bj;
        double d12 = d2 + block.field_366_bh;
        tessellator.func_983_a(d8, d11, d12, d4, d5);
        tessellator.func_983_a(d9, d11, d12, d3, d5);
        tessellator.func_983_a(d9, d10, d12, d3, d6);
        tessellator.func_983_a(d8, d10, d12, d4, d6);
    }

    public void func_1225_d(Block block, double d, double d1, double d2, 
            int i)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        if(field_1771_b >= 0)
        {
            i = field_1771_b;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.field_370_bf * 16D) / 256D;
        double d4 = (((double)j + block.field_364_bi * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.field_368_bg * 16D) / 256D;
        double d6 = (((double)k + block.field_362_bj * 16D) - 0.01D) / 256D;
        if(field_1774_c)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.field_370_bf < 0.0D || block.field_364_bi > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.field_368_bg < 0.0D || block.field_362_bj > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.field_370_bf;
        double d9 = d + block.field_364_bi;
        double d10 = d1 + block.field_368_bg;
        double d11 = d1 + block.field_362_bj;
        double d12 = d2 + block.field_360_bk;
        tessellator.func_983_a(d8, d11, d12, d3, d5);
        tessellator.func_983_a(d8, d10, d12, d3, d6);
        tessellator.func_983_a(d9, d10, d12, d4, d6);
        tessellator.func_983_a(d9, d11, d12, d4, d5);
    }

    public void func_1231_e(Block block, double d, double d1, double d2, 
            int i)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        if(field_1771_b >= 0)
        {
            i = field_1771_b;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.field_366_bh * 16D) / 256D;
        double d4 = (((double)j + block.field_360_bk * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.field_368_bg * 16D) / 256D;
        double d6 = (((double)k + block.field_362_bj * 16D) - 0.01D) / 256D;
        if(field_1774_c)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.field_366_bh < 0.0D || block.field_360_bk > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.field_368_bg < 0.0D || block.field_362_bj > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.field_370_bf;
        double d9 = d1 + block.field_368_bg;
        double d10 = d1 + block.field_362_bj;
        double d11 = d2 + block.field_366_bh;
        double d12 = d2 + block.field_360_bk;
        tessellator.func_983_a(d8, d10, d12, d4, d5);
        tessellator.func_983_a(d8, d10, d11, d3, d5);
        tessellator.func_983_a(d8, d9, d11, d3, d6);
        tessellator.func_983_a(d8, d9, d12, d4, d6);
    }

    public void func_1236_f(Block block, double d, double d1, double d2, 
            int i)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        if(field_1771_b >= 0)
        {
            i = field_1771_b;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.field_366_bh * 16D) / 256D;
        double d4 = (((double)j + block.field_360_bk * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.field_368_bg * 16D) / 256D;
        double d6 = (((double)k + block.field_362_bj * 16D) - 0.01D) / 256D;
        if(field_1774_c)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.field_366_bh < 0.0D || block.field_360_bk > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.field_368_bg < 0.0D || block.field_362_bj > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.field_364_bi;
        double d9 = d1 + block.field_368_bg;
        double d10 = d1 + block.field_362_bj;
        double d11 = d2 + block.field_366_bh;
        double d12 = d2 + block.field_360_bk;
        tessellator.func_983_a(d8, d9, d12, d3, d6);
        tessellator.func_983_a(d8, d9, d11, d4, d6);
        tessellator.func_983_a(d8, d10, d11, d4, d5);
        tessellator.func_983_a(d8, d10, d12, d3, d5);
    }

    public void func_1238_a(Block block, float f)
    {
        int i = block.func_210_f();
        Tessellator tessellator = Tessellator.field_1512_a;
        if(i == 0)
        {
            block.func_237_e();
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            float f1 = 0.5F;
            float f2 = 1.0F;
            float f3 = 0.8F;
            float f4 = 0.6F;
            tessellator.func_977_b();
            tessellator.func_986_a(f2, f2, f2, f);
            func_1244_a(block, 0.0D, 0.0D, 0.0D, block.func_218_a(0));
            tessellator.func_986_a(f1, f1, f1, f);
            func_1217_b(block, 0.0D, 0.0D, 0.0D, block.func_218_a(1));
            tessellator.func_986_a(f3, f3, f3, f);
            func_1220_c(block, 0.0D, 0.0D, 0.0D, block.func_218_a(2));
            func_1225_d(block, 0.0D, 0.0D, 0.0D, block.func_218_a(3));
            tessellator.func_986_a(f4, f4, f4, f);
            func_1231_e(block, 0.0D, 0.0D, 0.0D, block.func_218_a(4));
            func_1236_f(block, 0.0D, 0.0D, 0.0D, block.func_218_a(5));
            tessellator.func_982_a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        }
    }

    public void func_1227_a(Block block)
    {
        byte byte0 = -1;
        Tessellator tessellator = Tessellator.field_1512_a;
        int i = block.func_210_f();
        if(i == 0)
        {
            block.func_237_e();
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, -1F, 0.0F);
            func_1244_a(block, 0.0D, 0.0D, 0.0D, block.func_218_a(0));
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 1.0F, 0.0F);
            func_1217_b(block, 0.0D, 0.0D, 0.0D, block.func_218_a(1));
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 0.0F, -1F);
            func_1220_c(block, 0.0D, 0.0D, 0.0D, block.func_218_a(2));
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 0.0F, 1.0F);
            func_1225_d(block, 0.0D, 0.0D, 0.0D, block.func_218_a(3));
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(-1F, 0.0F, 0.0F);
            func_1231_e(block, 0.0D, 0.0D, 0.0D, block.func_218_a(4));
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(1.0F, 0.0F, 0.0F);
            func_1236_f(block, 0.0D, 0.0D, 0.0D, block.func_218_a(5));
            tessellator.func_982_a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        } else
        if(i == 1)
        {
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, -1F, 0.0F);
            func_1239_a(block, byte0, -0.5D, -0.5D, -0.5D);
            tessellator.func_982_a();
        } else
        if(i == 13)
        {
            block.func_237_e();
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            float f = 0.0625F;
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, -1F, 0.0F);
            func_1244_a(block, 0.0D, 0.0D, 0.0D, block.func_218_a(0));
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 1.0F, 0.0F);
            func_1217_b(block, 0.0D, 0.0D, 0.0D, block.func_218_a(1));
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 0.0F, -1F);
            tessellator.func_988_c(0.0F, 0.0F, f);
            func_1220_c(block, 0.0D, 0.0D, 0.0D, block.func_218_a(2));
            tessellator.func_988_c(0.0F, 0.0F, -f);
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 0.0F, 1.0F);
            tessellator.func_988_c(0.0F, 0.0F, -f);
            func_1225_d(block, 0.0D, 0.0D, 0.0D, block.func_218_a(3));
            tessellator.func_988_c(0.0F, 0.0F, f);
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(-1F, 0.0F, 0.0F);
            tessellator.func_988_c(f, 0.0F, 0.0F);
            func_1231_e(block, 0.0D, 0.0D, 0.0D, block.func_218_a(4));
            tessellator.func_988_c(-f, 0.0F, 0.0F);
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(1.0F, 0.0F, 0.0F);
            tessellator.func_988_c(-f, 0.0F, 0.0F);
            func_1236_f(block, 0.0D, 0.0D, 0.0D, block.func_218_a(5));
            tessellator.func_988_c(f, 0.0F, 0.0F);
            tessellator.func_982_a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        } else
        if(i == 6)
        {
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, -1F, 0.0F);
            func_1245_b(block, byte0, -0.5D, -0.5D, -0.5D);
            tessellator.func_982_a();
        } else
        if(i == 2)
        {
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, -1F, 0.0F);
            func_1237_a(block, -0.5D, -0.5D, -0.5D, 0.0D, 0.0D);
            tessellator.func_982_a();
        } else
        if(i == 10)
        {
            for(int j = 0; j < 2; j++)
            {
                if(j == 0)
                {
                    block.func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
                }
                if(j == 1)
                {
                    block.func_213_a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
                }
                GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                tessellator.func_977_b();
                tessellator.func_980_b(0.0F, -1F, 0.0F);
                func_1244_a(block, 0.0D, 0.0D, 0.0D, block.func_218_a(0));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(0.0F, 1.0F, 0.0F);
                func_1217_b(block, 0.0D, 0.0D, 0.0D, block.func_218_a(1));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(0.0F, 0.0F, -1F);
                func_1220_c(block, 0.0D, 0.0D, 0.0D, block.func_218_a(2));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(0.0F, 0.0F, 1.0F);
                func_1225_d(block, 0.0D, 0.0D, 0.0D, block.func_218_a(3));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(-1F, 0.0F, 0.0F);
                func_1231_e(block, 0.0D, 0.0D, 0.0D, block.func_218_a(4));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(1.0F, 0.0F, 0.0F);
                func_1236_f(block, 0.0D, 0.0D, 0.0D, block.func_218_a(5));
                tessellator.func_982_a();
                GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

        } else
        if(i == 11)
        {
            for(int k = 0; k < 4; k++)
            {
                float f1 = 0.125F;
                if(k == 0)
                {
                    block.func_213_a(0.5F - f1, 0.0F, 0.0F, 0.5F + f1, 1.0F, f1 * 2.0F);
                }
                if(k == 1)
                {
                    block.func_213_a(0.5F - f1, 0.0F, 1.0F - f1 * 2.0F, 0.5F + f1, 1.0F, 1.0F);
                }
                f1 = 0.0625F;
                if(k == 2)
                {
                    block.func_213_a(0.5F - f1, 1.0F - f1 * 3F, -f1 * 2.0F, 0.5F + f1, 1.0F - f1, 1.0F + f1 * 2.0F);
                }
                if(k == 3)
                {
                    block.func_213_a(0.5F - f1, 0.5F - f1 * 3F, -f1 * 2.0F, 0.5F + f1, 0.5F - f1, 1.0F + f1 * 2.0F);
                }
                GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                tessellator.func_977_b();
                tessellator.func_980_b(0.0F, -1F, 0.0F);
                func_1244_a(block, 0.0D, 0.0D, 0.0D, block.func_218_a(0));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(0.0F, 1.0F, 0.0F);
                func_1217_b(block, 0.0D, 0.0D, 0.0D, block.func_218_a(1));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(0.0F, 0.0F, -1F);
                func_1220_c(block, 0.0D, 0.0D, 0.0D, block.func_218_a(2));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(0.0F, 0.0F, 1.0F);
                func_1225_d(block, 0.0D, 0.0D, 0.0D, block.func_218_a(3));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(-1F, 0.0F, 0.0F);
                func_1231_e(block, 0.0D, 0.0D, 0.0D, block.func_218_a(4));
                tessellator.func_982_a();
                tessellator.func_977_b();
                tessellator.func_980_b(1.0F, 0.0F, 0.0F);
                func_1236_f(block, 0.0D, 0.0D, 0.0D, block.func_218_a(5));
                tessellator.func_982_a();
                GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            block.func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public static boolean func_1219_a(int i)
    {
        if(i == 0)
        {
            return true;
        }
        if(i == 13)
        {
            return true;
        }
        if(i == 10)
        {
            return true;
        }
        return i == 11;
    }

    private IBlockAccess field_1772_a;
    private int field_1771_b;
    private boolean field_1774_c;
    private boolean field_1773_d;
}
