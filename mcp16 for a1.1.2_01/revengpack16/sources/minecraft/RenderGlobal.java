// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.nio.IntBuffer;
import java.util.*;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class RenderGlobal
    implements IWorldAccess
{

    public RenderGlobal(Minecraft minecraft, RenderEngine renderengine)
    {
        field_1458_a = new ArrayList();
        field_1446_m = new ArrayList();
        field_1436_w = false;
        field_1435_x = 0;
        field_1425_H = -1;
        field_1424_I = 2;
        field_1457_b = new int[50000];
        field_1456_c = GLAllocation.func_1125_c(64);
        field_1415_R = new ArrayList();
        field_1455_d = 0;
        field_1454_e = GLAllocation.func_1124_a(1);
        field_1453_f = -9999D;
        field_1452_g = -9999D;
        field_1451_h = -9999D;
        field_1449_j = 0;
        field_1439_t = minecraft;
        field_1447_l = renderengine;
        byte byte0 = 64;
        field_1440_s = GLAllocation.func_1124_a(byte0 * byte0 * byte0 * 3);
        field_1436_w = minecraft.func_137_k().func_1213_a();
        if(field_1436_w)
        {
            field_1456_c.clear();
            field_1437_v = GLAllocation.func_1125_c(byte0 * byte0 * byte0);
            field_1437_v.clear();
            field_1437_v.position(0);
            field_1437_v.limit(byte0 * byte0 * byte0);
            ARBOcclusionQuery.glGenQueriesARB(field_1437_v);
        }
        field_1434_y = GLAllocation.func_1124_a(3);
        GL11.glPushMatrix();
        GL11.glNewList(field_1434_y, 4864);
        func_950_f();
        GL11.glEndList();
        GL11.glPopMatrix();
        Tessellator tessellator = Tessellator.field_1512_a;
        field_1433_z = field_1434_y + 1;
        GL11.glNewList(field_1433_z, 4864);
        byte byte1 = 64;
        int i = 256 / byte1 + 2;
        float f = 16F;
        for(int j = -byte1 * i; j <= byte1 * i; j += byte1)
        {
            for(int l = -byte1 * i; l <= byte1 * i; l += byte1)
            {
                tessellator.func_977_b();
                tessellator.func_991_a(j + 0, f, l + 0);
                tessellator.func_991_a(j + byte1, f, l + 0);
                tessellator.func_991_a(j + byte1, f, l + byte1);
                tessellator.func_991_a(j + 0, f, l + byte1);
                tessellator.func_982_a();
            }

        }

        GL11.glEndList();
        field_1432_A = field_1434_y + 2;
        GL11.glNewList(field_1432_A, 4864);
        f = -16F;
        tessellator.func_977_b();
        for(int k = -byte1 * i; k <= byte1 * i; k += byte1)
        {
            for(int i1 = -byte1 * i; i1 <= byte1 * i; i1 += byte1)
            {
                tessellator.func_991_a(k + byte1, f, i1 + 0);
                tessellator.func_991_a(k + 0, f, i1 + 0);
                tessellator.func_991_a(k + 0, f, i1 + byte1);
                tessellator.func_991_a(k + byte1, f, i1 + byte1);
            }

        }

        tessellator.func_982_a();
        GL11.glEndList();
    }

    private void func_950_f()
    {
        Random random = new Random(10842L);
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        for(int i = 0; i < 1500; i++)
        {
            double d = random.nextFloat() * 2.0F - 1.0F;
            double d1 = random.nextFloat() * 2.0F - 1.0F;
            double d2 = random.nextFloat() * 2.0F - 1.0F;
            double d3 = 0.25F + random.nextFloat() * 0.25F;
            double d4 = d * d + d1 * d1 + d2 * d2;
            if(d4 >= 1.0D || d4 <= 0.01D)
            {
                continue;
            }
            d4 = 1.0D / Math.sqrt(d4);
            d *= d4;
            d1 *= d4;
            d2 *= d4;
            double d5 = d * 100D;
            double d6 = d1 * 100D;
            double d7 = d2 * 100D;
            double d8 = Math.atan2(d, d2);
            double d9 = Math.sin(d8);
            double d10 = Math.cos(d8);
            double d11 = Math.atan2(Math.sqrt(d * d + d2 * d2), d1);
            double d12 = Math.sin(d11);
            double d13 = Math.cos(d11);
            double d14 = random.nextDouble() * 3.1415926535897931D * 2D;
            double d15 = Math.sin(d14);
            double d16 = Math.cos(d14);
            for(int j = 0; j < 4; j++)
            {
                double d17 = 0.0D;
                double d18 = (double)((j & 2) - 1) * d3;
                double d19 = (double)((j + 1 & 2) - 1) * d3;
                double d20 = d17;
                double d21 = d18 * d16 - d19 * d15;
                double d22 = d19 * d16 + d18 * d15;
                double d23 = d22;
                double d24 = d21 * d12 + d20 * d13;
                double d25 = d20 * d12 - d21 * d13;
                double d26 = d25 * d9 - d23 * d10;
                double d27 = d24;
                double d28 = d23 * d9 + d25 * d10;
                tessellator.func_991_a(d5 + d26, d6 + d27, d7 + d28);
            }

        }

        tessellator.func_982_a();
    }

    public void func_946_a(World world)
    {
        if(field_1448_k != null)
        {
            field_1448_k.func_672_b(this);
        }
        field_1453_f = -9999D;
        field_1452_g = -9999D;
        field_1451_h = -9999D;
        RenderManager.field_1233_a.func_852_a(world);
        field_1448_k = world;
        field_1438_u = new RenderBlocks(world);
        if(world != null)
        {
            world.func_613_a(this);
            func_958_a();
        }
    }

    public void func_958_a()
    {
        Block.leaves.func_310_a(field_1439_t.options.fancyGraphics);
        field_1425_H = field_1439_t.options.renderDistance;
        if(field_1444_o != null)
        {
            for(int i = 0; i < field_1444_o.length; i++)
            {
                field_1444_o[i].func_1204_c();
            }

        }
        int j = 64 << 3 - field_1425_H;
        if(j > 400)
        {
            j = 400;
        }
        field_1443_p = j / 16 + 1;
        field_1442_q = 8;
        field_1441_r = j / 16 + 1;
        field_1444_o = new WorldRenderer[field_1443_p * field_1442_q * field_1441_r];
        field_1445_n = new WorldRenderer[field_1443_p * field_1442_q * field_1441_r];
        int k = 0;
        int l = 0;
        field_1431_B = 0;
        field_1430_C = 0;
        field_1429_D = 0;
        field_1428_E = field_1443_p;
        field_1427_F = field_1442_q;
        field_1426_G = field_1441_r;
        for(int i1 = 0; i1 < field_1446_m.size(); i1++)
        {
            ((WorldRenderer)field_1446_m.get(i1)).field_1738_u = false;
        }

        field_1446_m.clear();
        field_1458_a.clear();
        for(int j1 = 0; j1 < field_1443_p; j1++)
        {
            for(int k1 = 0; k1 < field_1442_q; k1++)
            {
                for(int l1 = 0; l1 < field_1441_r; l1++)
                {
                    field_1444_o[(l1 * field_1442_q + k1) * field_1443_p + j1] = new WorldRenderer(field_1448_k, field_1458_a, j1 * 16, k1 * 16, l1 * 16, 16, field_1440_s + k);
                    if(field_1436_w)
                    {
                        field_1444_o[(l1 * field_1442_q + k1) * field_1443_p + j1].field_1732_z = field_1437_v.get(l);
                    }
                    field_1444_o[(l1 * field_1442_q + k1) * field_1443_p + j1].field_1733_y = false;
                    field_1444_o[(l1 * field_1442_q + k1) * field_1443_p + j1].field_1734_x = true;
                    field_1444_o[(l1 * field_1442_q + k1) * field_1443_p + j1].field_1749_o = true;
                    field_1444_o[(l1 * field_1442_q + k1) * field_1443_p + j1].field_1735_w = l++;
                    field_1444_o[(l1 * field_1442_q + k1) * field_1443_p + j1].func_1194_f();
                    field_1445_n[(l1 * field_1442_q + k1) * field_1443_p + j1] = field_1444_o[(l1 * field_1442_q + k1) * field_1443_p + j1];
                    field_1446_m.add(field_1444_o[(l1 * field_1442_q + k1) * field_1443_p + j1]);
                    k += 3;
                }

            }

        }

        if(field_1448_k != null)
        {
            EntityPlayerSP entityplayersp = field_1439_t.field_178_g;
            func_956_b(MathHelper.func_1108_b(((Entity) (entityplayersp)).posX), MathHelper.func_1108_b(((Entity) (entityplayersp)).posY), MathHelper.func_1108_b(((Entity) (entityplayersp)).posZ));
            Arrays.sort(field_1445_n, new EntitySorter(entityplayersp));
        }
        field_1424_I = 2;
    }

    public void func_951_a(Vec3D vec3d, ICamera icamera, float f)
    {
        if(field_1424_I > 0)
        {
            field_1424_I--;
            return;
        }
        TileEntityRenderer.field_1554_a.func_1026_a(field_1448_k, field_1447_l, field_1439_t.field_170_o, field_1439_t.field_178_g, f);
        RenderManager.field_1233_a.func_857_a(field_1448_k, field_1447_l, field_1439_t.field_170_o, field_1439_t.field_178_g, field_1439_t.options, f);
        field_1423_J = 0;
        field_1422_K = 0;
        field_1421_L = 0;
        EntityPlayerSP entityplayersp = field_1439_t.field_178_g;
        RenderManager.field_1232_b = ((Entity) (entityplayersp)).field_638_aI + (((Entity) (entityplayersp)).posX - ((Entity) (entityplayersp)).field_638_aI) * (double)f;
        RenderManager.field_1231_c = ((Entity) (entityplayersp)).field_637_aJ + (((Entity) (entityplayersp)).posY - ((Entity) (entityplayersp)).field_637_aJ) * (double)f;
        RenderManager.field_1230_d = ((Entity) (entityplayersp)).field_636_aK + (((Entity) (entityplayersp)).posZ - ((Entity) (entityplayersp)).field_636_aK) * (double)f;
        TileEntityRenderer.field_1553_b = ((Entity) (entityplayersp)).field_638_aI + (((Entity) (entityplayersp)).posX - ((Entity) (entityplayersp)).field_638_aI) * (double)f;
        TileEntityRenderer.field_1552_c = ((Entity) (entityplayersp)).field_637_aJ + (((Entity) (entityplayersp)).posY - ((Entity) (entityplayersp)).field_637_aJ) * (double)f;
        TileEntityRenderer.field_1551_d = ((Entity) (entityplayersp)).field_636_aK + (((Entity) (entityplayersp)).posZ - ((Entity) (entityplayersp)).field_636_aK) * (double)f;
        List list = field_1448_k.func_658_i();
        field_1423_J = list.size();
        for(int i = 0; i < list.size(); i++)
        {
            Entity entity = (Entity)list.get(i);
            if(entity.func_390_a(vec3d) && icamera.func_342_a(entity.boundingBox) && (entity != field_1439_t.field_178_g || field_1439_t.options.thirdPersonView))
            {
                field_1422_K++;
                RenderManager.field_1233_a.func_854_a(entity, f);
            }
        }

        for(int j = 0; j < field_1458_a.size(); j++)
        {
            TileEntityRenderer.field_1554_a.func_1030_a((TileEntity)field_1458_a.get(j), f);
        }

    }

    public String func_953_b()
    {
        return (new StringBuilder()).append("C: ").append(field_1417_P).append("/").append(field_1420_M).append(". F: ").append(field_1419_N).append(", O: ").append(field_1418_O).append(", E: ").append(field_1416_Q).toString();
    }

    public String func_957_c()
    {
        return (new StringBuilder()).append("E: ").append(field_1422_K).append("/").append(field_1423_J).append(". B: ").append(field_1421_L).append(", I: ").append(field_1423_J - field_1421_L - field_1422_K).toString();
    }

    private void func_956_b(int i, int j, int k)
    {
        i -= 8;
        j -= 8;
        k -= 8;
        field_1431_B = 0x7fffffff;
        field_1430_C = 0x7fffffff;
        field_1429_D = 0x7fffffff;
        field_1428_E = 0x80000000;
        field_1427_F = 0x80000000;
        field_1426_G = 0x80000000;
        int l = field_1443_p * 16;
        int i1 = l / 2;
        for(int j1 = 0; j1 < field_1443_p; j1++)
        {
            int k1 = j1 * 16;
            int l1 = (k1 + i1) - i;
            if(l1 < 0)
            {
                l1 -= l - 1;
            }
            l1 /= l;
            k1 -= l1 * l;
            if(k1 < field_1431_B)
            {
                field_1431_B = k1;
            }
            if(k1 > field_1428_E)
            {
                field_1428_E = k1;
            }
            for(int i2 = 0; i2 < field_1441_r; i2++)
            {
                int j2 = i2 * 16;
                int k2 = (j2 + i1) - k;
                if(k2 < 0)
                {
                    k2 -= l - 1;
                }
                k2 /= l;
                j2 -= k2 * l;
                if(j2 < field_1429_D)
                {
                    field_1429_D = j2;
                }
                if(j2 > field_1426_G)
                {
                    field_1426_G = j2;
                }
                for(int l2 = 0; l2 < field_1442_q; l2++)
                {
                    int i3 = l2 * 16;
                    if(i3 < field_1430_C)
                    {
                        field_1430_C = i3;
                    }
                    if(i3 > field_1427_F)
                    {
                        field_1427_F = i3;
                    }
                    WorldRenderer worldrenderer = field_1444_o[(i2 * field_1442_q + l2) * field_1443_p + j1];
                    boolean flag = worldrenderer.field_1738_u;
                    worldrenderer.func_1197_a(k1, i3, j2);
                    if(!flag && worldrenderer.field_1738_u)
                    {
                        field_1446_m.add(worldrenderer);
                    }
                }

            }

        }

    }

    public int func_943_a(EntityPlayer entityplayer, int i, double d)
    {
        if(field_1439_t.options.renderDistance != field_1425_H)
        {
            func_958_a();
        }
        if(i == 0)
        {
            field_1420_M = 0;
            field_1419_N = 0;
            field_1418_O = 0;
            field_1417_P = 0;
            field_1416_Q = 0;
        }
        double d1 = entityplayer.field_638_aI + (entityplayer.posX - entityplayer.field_638_aI) * d;
        double d2 = entityplayer.field_637_aJ + (entityplayer.posY - entityplayer.field_637_aJ) * d;
        double d3 = entityplayer.field_636_aK + (entityplayer.posZ - entityplayer.field_636_aK) * d;
        double d4 = entityplayer.posX - field_1453_f;
        double d5 = entityplayer.posY - field_1452_g;
        double d6 = entityplayer.posZ - field_1451_h;
        if(d4 * d4 + d5 * d5 + d6 * d6 > 16D)
        {
            field_1453_f = entityplayer.posX;
            field_1452_g = entityplayer.posY;
            field_1451_h = entityplayer.posZ;
            func_956_b(MathHelper.func_1108_b(entityplayer.posX), MathHelper.func_1108_b(entityplayer.posY), MathHelper.func_1108_b(entityplayer.posZ));
            Arrays.sort(field_1445_n, new EntitySorter(entityplayer));
        }
        int j = 0;
        if(field_1436_w && !field_1439_t.options.anaglyph && i == 0)
        {
            int k = 0;
            int l = 16;
            func_962_a(k, l);
            for(int i1 = k; i1 < l; i1++)
            {
                field_1445_n[i1].field_1734_x = true;
            }

            j += func_952_a(k, l, i, d);
            do
            {
                byte byte0 = (byte) l;
                l *= 2;
                if(l > field_1445_n.length)
                {
                    l = field_1445_n.length;
                }
                GL11.glDisable(3553);
                GL11.glDisable(2896);
                GL11.glDisable(3008);
                GL11.glDisable(2912);
                GL11.glColorMask(false, false, false, false);
                GL11.glDepthMask(false);
                func_962_a(byte0, l);
                GL11.glPushMatrix();
                float f = 0.0F;
                float f1 = 0.0F;
                float f2 = 0.0F;
                for(int j1 = byte0; j1 < l; j1++)
                {
                    if(field_1445_n[j1].func_1196_e())
                    {
                        field_1445_n[j1].field_1749_o = false;
                        continue;
                    }
                    if(!field_1445_n[j1].field_1749_o)
                    {
                        field_1445_n[j1].field_1734_x = true;
                    }
                    if(!field_1445_n[j1].field_1749_o || field_1445_n[j1].field_1733_y)
                    {
                        continue;
                    }
                    float f3 = MathHelper.func_1113_c(field_1445_n[j1].func_1202_a(entityplayer));
                    int k1 = (int)(1.0F + f3 / 128F);
                    if(field_1435_x % k1 != j1 % k1)
                    {
                        continue;
                    }
                    WorldRenderer worldrenderer = field_1445_n[j1];
                    float f4 = (float)((double)worldrenderer.field_1755_i - d1);
                    float f5 = (float)((double)worldrenderer.field_1754_j - d2);
                    float f6 = (float)((double)worldrenderer.field_1753_k - d3);
                    float f7 = f4 - f;
                    float f8 = f5 - f1;
                    float f9 = f6 - f2;
                    if(f7 != 0.0F || f8 != 0.0F || f9 != 0.0F)
                    {
                        GL11.glTranslatef(f7, f8, f9);
                        f += f7;
                        f1 += f8;
                        f2 += f9;
                    }
                    ARBOcclusionQuery.glBeginQueryARB(35092, field_1445_n[j1].field_1732_z);
                    field_1445_n[j1].func_1201_d();
                    ARBOcclusionQuery.glEndQueryARB(35092);
                    field_1445_n[j1].field_1733_y = true;
                }

                GL11.glPopMatrix();
                GL11.glColorMask(true, true, true, true);
                GL11.glDepthMask(true);
                GL11.glEnable(3553);
                GL11.glEnable(3008);
                GL11.glEnable(2912);
                j += func_952_a(byte0, l, i, d);
            } while(l < field_1445_n.length);
        } else
        {
            j += func_952_a(0, field_1445_n.length, i, d);
        }
        return j;
    }

    private void func_962_a(int i, int j)
    {
        for(int k = i; k < j; k++)
        {
            if(!field_1445_n[k].field_1733_y)
            {
                continue;
            }
            field_1456_c.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(field_1445_n[k].field_1732_z, 34919, field_1456_c);
            if(field_1456_c.get(0) != 0)
            {
                field_1445_n[k].field_1733_y = false;
                field_1456_c.clear();
                ARBOcclusionQuery.glGetQueryObjectuARB(field_1445_n[k].field_1732_z, 34918, field_1456_c);
                field_1445_n[k].field_1734_x = field_1456_c.get(0) != 0;
            }
        }

    }

    private int func_952_a(int i, int j, int k, double d)
    {
        field_1415_R.clear();
        int l = 0;
        for(int i1 = i; i1 < j; i1++)
        {
            if(k == 0)
            {
                field_1420_M++;
                if(field_1445_n[i1].field_1748_p[k])
                {
                    field_1416_Q++;
                } else
                if(!field_1445_n[i1].field_1749_o)
                {
                    field_1419_N++;
                } else
                if(field_1436_w && !field_1445_n[i1].field_1734_x)
                {
                    field_1418_O++;
                } else
                {
                    field_1417_P++;
                }
            }
            if(field_1445_n[i1].field_1748_p[k] || !field_1445_n[i1].field_1749_o || !field_1445_n[i1].field_1734_x)
            {
                continue;
            }
            int j1 = field_1445_n[i1].func_1200_a(k);
            if(j1 >= 0)
            {
                field_1415_R.add(field_1445_n[i1]);
                l++;
            }
        }

        EntityPlayerSP entityplayersp = field_1439_t.field_178_g;
        double d1 = ((EntityPlayer) (entityplayersp)).field_638_aI + (((EntityPlayer) (entityplayersp)).posX - ((EntityPlayer) (entityplayersp)).field_638_aI) * d;
        double d2 = ((EntityPlayer) (entityplayersp)).field_637_aJ + (((EntityPlayer) (entityplayersp)).posY - ((EntityPlayer) (entityplayersp)).field_637_aJ) * d;
        double d3 = ((EntityPlayer) (entityplayersp)).field_636_aK + (((EntityPlayer) (entityplayersp)).posZ - ((EntityPlayer) (entityplayersp)).field_636_aK) * d;
        int k1 = 0;
        for(int l1 = 0; l1 < field_1414_S.length; l1++)
        {
            field_1414_S[l1].func_859_b();
        }

        for(int i2 = 0; i2 < field_1415_R.size(); i2++)
        {
            WorldRenderer worldrenderer = (WorldRenderer)field_1415_R.get(i2);
            int j2 = -1;
            for(int k2 = 0; k2 < k1; k2++)
            {
                if(field_1414_S[k2].func_862_a(worldrenderer.field_1755_i, worldrenderer.field_1754_j, worldrenderer.field_1753_k))
                {
                    j2 = k2;
                }
            }

            if(j2 < 0)
            {
                j2 = k1++;
                field_1414_S[j2].func_861_a(worldrenderer.field_1755_i, worldrenderer.field_1754_j, worldrenderer.field_1753_k, d1, d2, d3);
            }
            field_1414_S[j2].func_858_a(worldrenderer.func_1200_a(k));
        }

        func_944_a(k, d);
        return l;
    }

    public void func_944_a(int i, double d)
    {
        for(int j = 0; j < field_1414_S.length; j++)
        {
            field_1414_S[j].func_860_a();
        }

    }

    public void func_945_d()
    {
        field_1435_x++;
    }

    public void func_954_a(float f)
    {
        GL11.glDisable(3553);
        Vec3D vec3d = field_1448_k.func_626_b(f);
        float f1 = (float)vec3d.field_1776_a;
        float f2 = (float)vec3d.field_1775_b;
        float f3 = (float)vec3d.field_1779_c;
        if(field_1439_t.options.anaglyph)
        {
            float f4 = (f1 * 30F + f2 * 59F + f3 * 11F) / 100F;
            float f5 = (f1 * 30F + f2 * 70F) / 100F;
            float f7 = (f1 * 30F + f3 * 70F) / 100F;
            f1 = f4;
            f2 = f5;
            f3 = f7;
        }
        GL11.glColor3f(f1, f2, f3);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glDepthMask(false);
        GL11.glEnable(2912);
        GL11.glColor3f(f1, f2, f3);
        GL11.glCallList(field_1433_z);
        GL11.glEnable(3553);
        GL11.glDisable(2912);
        GL11.glDisable(3008);
        GL11.glEnable(3042);
        GL11.glBlendFunc(1, 1);
        GL11.glPushMatrix();
        float f6 = 0.0F;
        float f8 = 0.0F;
        float f9 = 0.0F;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef(f6, f8, f9);
        GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(field_1448_k.func_619_c(f) * 360F, 1.0F, 0.0F, 0.0F);
        float f10 = 30F;
        GL11.glBindTexture(3553, field_1447_l.func_1070_a("/terrain/sun.png"));
        tessellator.func_977_b();
        tessellator.func_983_a(-f10, 100D, -f10, 0.0D, 0.0D);
        tessellator.func_983_a(f10, 100D, -f10, 1.0D, 0.0D);
        tessellator.func_983_a(f10, 100D, f10, 1.0D, 1.0D);
        tessellator.func_983_a(-f10, 100D, f10, 0.0D, 1.0D);
        tessellator.func_982_a();
        f10 = 20F;
        GL11.glBindTexture(3553, field_1447_l.func_1070_a("/terrain/moon.png"));
        tessellator.func_977_b();
        tessellator.func_983_a(-f10, -100D, f10, 1.0D, 1.0D);
        tessellator.func_983_a(f10, -100D, f10, 0.0D, 1.0D);
        tessellator.func_983_a(f10, -100D, -f10, 0.0D, 0.0D);
        tessellator.func_983_a(-f10, -100D, -f10, 1.0D, 0.0D);
        tessellator.func_982_a();
        GL11.glDisable(3553);
        float f11 = field_1448_k.func_679_f(f);
        if(f11 > 0.0F)
        {
            GL11.glColor4f(f11, f11, f11, f11);
            GL11.glCallList(field_1434_y);
        }
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glEnable(2912);
        GL11.glPopMatrix();
        GL11.glColor3f(f1 * 0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
        GL11.glDisable(3553);
        GL11.glCallList(field_1432_A);
        GL11.glEnable(3553);
        GL11.glDepthMask(true);
    }

    public void func_947_b(float f)
    {
        if(field_1439_t.options.fancyGraphics)
        {
            func_961_c(f);
            return;
        }
        GL11.glDisable(2884);
        float f1 = (float)(field_1439_t.field_178_g.field_637_aJ + (field_1439_t.field_178_g.posY - field_1439_t.field_178_g.field_637_aJ) * (double)f);
        byte byte0 = 32;
        int i = 256 / byte0;
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glBindTexture(3553, field_1447_l.func_1070_a("/clouds.png"));
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        Vec3D vec3d = field_1448_k.func_628_d(f);
        float f2 = (float)vec3d.field_1776_a;
        float f3 = (float)vec3d.field_1775_b;
        float f4 = (float)vec3d.field_1779_c;
        if(field_1439_t.options.anaglyph)
        {
            float f5 = (f2 * 30F + f3 * 59F + f4 * 11F) / 100F;
            float f7 = (f2 * 30F + f3 * 70F) / 100F;
            float f8 = (f2 * 30F + f4 * 70F) / 100F;
            f2 = f5;
            f3 = f7;
            f4 = f8;
        }
        float f6 = 0.0004882813F;
        double d = field_1439_t.field_178_g.field_614_ah + (field_1439_t.field_178_g.posX - field_1439_t.field_178_g.field_614_ah) * (double)f + (double)(((float)field_1435_x + f) * 0.03F);
        double d1 = field_1439_t.field_178_g.field_612_aj + (field_1439_t.field_178_g.posZ - field_1439_t.field_178_g.field_612_aj) * (double)f;
        int j = MathHelper.func_1108_b(d / 2048D);
        int k = MathHelper.func_1108_b(d1 / 2048D);
        d -= j * 2048;
        d1 -= k * 2048;
        float f9 = (120F - f1) + 0.33F;
        float f10 = (float)(d * (double)f6);
        float f11 = (float)(d1 * (double)f6);
        tessellator.func_977_b();
        tessellator.func_986_a(f2, f3, f4, 0.8F);
        for(int l = -byte0 * i; l < byte0 * i; l += byte0)
        {
            for(int i1 = -byte0 * i; i1 < byte0 * i; i1 += byte0)
            {
                tessellator.func_983_a(l + 0, f9, i1 + byte0, (float)(l + 0) * f6 + f10, (float)(i1 + byte0) * f6 + f11);
                tessellator.func_983_a(l + byte0, f9, i1 + byte0, (float)(l + byte0) * f6 + f10, (float)(i1 + byte0) * f6 + f11);
                tessellator.func_983_a(l + byte0, f9, i1 + 0, (float)(l + byte0) * f6 + f10, (float)(i1 + 0) * f6 + f11);
                tessellator.func_983_a(l + 0, f9, i1 + 0, (float)(l + 0) * f6 + f10, (float)(i1 + 0) * f6 + f11);
            }

        }

        tessellator.func_982_a();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glEnable(2884);
    }

    public void func_961_c(float f)
    {
        GL11.glDisable(2884);
        float f1 = (float)(field_1439_t.field_178_g.field_637_aJ + (field_1439_t.field_178_g.posY - field_1439_t.field_178_g.field_637_aJ) * (double)f);
        Tessellator tessellator = Tessellator.field_1512_a;
        float f2 = 12F;
        float f3 = 4F;
        double d = (field_1439_t.field_178_g.field_614_ah + (field_1439_t.field_178_g.posX - field_1439_t.field_178_g.field_614_ah) * (double)f + (double)(((float)field_1435_x + f) * 0.03F)) / (double)f2;
        double d1 = (field_1439_t.field_178_g.field_612_aj + (field_1439_t.field_178_g.posZ - field_1439_t.field_178_g.field_612_aj) * (double)f) / (double)f2 + 0.33000001311302185D;
        float f4 = (108F - f1) + 0.33F;
        int i = MathHelper.func_1108_b(d / 2048D);
        int j = MathHelper.func_1108_b(d1 / 2048D);
        d -= i * 2048;
        d1 -= j * 2048;
        GL11.glBindTexture(3553, field_1447_l.func_1070_a("/clouds.png"));
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        Vec3D vec3d = field_1448_k.func_628_d(f);
        float f5 = (float)vec3d.field_1776_a;
        float f6 = (float)vec3d.field_1775_b;
        float f7 = (float)vec3d.field_1779_c;
        if(field_1439_t.options.anaglyph)
        {
            float f8 = (f5 * 30F + f6 * 59F + f7 * 11F) / 100F;
            float f10 = (f5 * 30F + f6 * 70F) / 100F;
            float f12 = (f5 * 30F + f7 * 70F) / 100F;
            f5 = f8;
            f6 = f10;
            f7 = f12;
        }
        float f9 = (float)(d * 0.0D);
        float f11 = (float)(d1 * 0.0D);
        float f13 = 0.00390625F;
        f9 = (float)MathHelper.func_1108_b(d) * f13;
        f11 = (float)MathHelper.func_1108_b(d1) * f13;
        float f14 = (float)(d - (double)MathHelper.func_1108_b(d));
        float f15 = (float)(d1 - (double)MathHelper.func_1108_b(d1));
        int k = 8;
        byte byte0 = 3;
        float f16 = 0.0009765625F;
        GL11.glScalef(f2, 1.0F, f2);
        for(int l = 0; l < 2; l++)
        {
            if(l == 0)
            {
                GL11.glColorMask(false, false, false, false);
            } else
            {
                GL11.glColorMask(true, true, true, true);
            }
            for(int i1 = -byte0 + 1; i1 <= byte0; i1++)
            {
                for(int j1 = -byte0 + 1; j1 <= byte0; j1++)
                {
                    tessellator.func_977_b();
                    float f17 = i1 * k;
                    float f18 = j1 * k;
                    float f19 = f17 - f14;
                    float f20 = f18 - f15;
                    if(f4 > -f3 - 1.0F)
                    {
                        tessellator.func_986_a(f5 * 0.7F, f6 * 0.7F, f7 * 0.7F, 0.8F);
                        tessellator.func_980_b(0.0F, -1F, 0.0F);
                        tessellator.func_983_a(f19 + 0.0F, f4 + 0.0F, f20 + (float)k, (f17 + 0.0F) * f13 + f9, (f18 + (float)k) * f13 + f11);
                        tessellator.func_983_a(f19 + (float)k, f4 + 0.0F, f20 + (float)k, (f17 + (float)k) * f13 + f9, (f18 + (float)k) * f13 + f11);
                        tessellator.func_983_a(f19 + (float)k, f4 + 0.0F, f20 + 0.0F, (f17 + (float)k) * f13 + f9, (f18 + 0.0F) * f13 + f11);
                        tessellator.func_983_a(f19 + 0.0F, f4 + 0.0F, f20 + 0.0F, (f17 + 0.0F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
                    }
                    if(f4 <= f3 + 1.0F)
                    {
                        tessellator.func_986_a(f5, f6, f7, 0.8F);
                        tessellator.func_980_b(0.0F, 1.0F, 0.0F);
                        tessellator.func_983_a(f19 + 0.0F, (f4 + f3) - f16, f20 + (float)k, (f17 + 0.0F) * f13 + f9, (f18 + (float)k) * f13 + f11);
                        tessellator.func_983_a(f19 + (float)k, (f4 + f3) - f16, f20 + (float)k, (f17 + (float)k) * f13 + f9, (f18 + (float)k) * f13 + f11);
                        tessellator.func_983_a(f19 + (float)k, (f4 + f3) - f16, f20 + 0.0F, (f17 + (float)k) * f13 + f9, (f18 + 0.0F) * f13 + f11);
                        tessellator.func_983_a(f19 + 0.0F, (f4 + f3) - f16, f20 + 0.0F, (f17 + 0.0F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
                    }
                    tessellator.func_986_a(f5 * 0.9F, f6 * 0.9F, f7 * 0.9F, 0.8F);
                    if(i1 > -1)
                    {
                        tessellator.func_980_b(-1F, 0.0F, 0.0F);
                        for(int k1 = 0; k1 < k; k1++)
                        {
                            tessellator.func_983_a(f19 + (float)k1 + 0.0F, f4 + 0.0F, f20 + (float)k, (f17 + (float)k1 + 0.5F) * f13 + f9, (f18 + (float)k) * f13 + f11);
                            tessellator.func_983_a(f19 + (float)k1 + 0.0F, f4 + f3, f20 + (float)k, (f17 + (float)k1 + 0.5F) * f13 + f9, (f18 + (float)k) * f13 + f11);
                            tessellator.func_983_a(f19 + (float)k1 + 0.0F, f4 + f3, f20 + 0.0F, (f17 + (float)k1 + 0.5F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
                            tessellator.func_983_a(f19 + (float)k1 + 0.0F, f4 + 0.0F, f20 + 0.0F, (f17 + (float)k1 + 0.5F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
                        }

                    }
                    if(i1 <= 1)
                    {
                        tessellator.func_980_b(1.0F, 0.0F, 0.0F);
                        for(int l1 = 0; l1 < k; l1++)
                        {
                            tessellator.func_983_a((f19 + (float)l1 + 1.0F) - f16, f4 + 0.0F, f20 + (float)k, (f17 + (float)l1 + 0.5F) * f13 + f9, (f18 + (float)k) * f13 + f11);
                            tessellator.func_983_a((f19 + (float)l1 + 1.0F) - f16, f4 + f3, f20 + (float)k, (f17 + (float)l1 + 0.5F) * f13 + f9, (f18 + (float)k) * f13 + f11);
                            tessellator.func_983_a((f19 + (float)l1 + 1.0F) - f16, f4 + f3, f20 + 0.0F, (f17 + (float)l1 + 0.5F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
                            tessellator.func_983_a((f19 + (float)l1 + 1.0F) - f16, f4 + 0.0F, f20 + 0.0F, (f17 + (float)l1 + 0.5F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
                        }

                    }
                    tessellator.func_986_a(f5 * 0.8F, f6 * 0.8F, f7 * 0.8F, 0.8F);
                    if(j1 > -1)
                    {
                        tessellator.func_980_b(0.0F, 0.0F, -1F);
                        for(int i2 = 0; i2 < k; i2++)
                        {
                            tessellator.func_983_a(f19 + 0.0F, f4 + f3, f20 + (float)i2 + 0.0F, (f17 + 0.0F) * f13 + f9, (f18 + (float)i2 + 0.5F) * f13 + f11);
                            tessellator.func_983_a(f19 + (float)k, f4 + f3, f20 + (float)i2 + 0.0F, (f17 + (float)k) * f13 + f9, (f18 + (float)i2 + 0.5F) * f13 + f11);
                            tessellator.func_983_a(f19 + (float)k, f4 + 0.0F, f20 + (float)i2 + 0.0F, (f17 + (float)k) * f13 + f9, (f18 + (float)i2 + 0.5F) * f13 + f11);
                            tessellator.func_983_a(f19 + 0.0F, f4 + 0.0F, f20 + (float)i2 + 0.0F, (f17 + 0.0F) * f13 + f9, (f18 + (float)i2 + 0.5F) * f13 + f11);
                        }

                    }
                    if(j1 <= 1)
                    {
                        tessellator.func_980_b(0.0F, 0.0F, 1.0F);
                        for(int j2 = 0; j2 < k; j2++)
                        {
                            tessellator.func_983_a(f19 + 0.0F, f4 + f3, (f20 + (float)j2 + 1.0F) - f16, (f17 + 0.0F) * f13 + f9, (f18 + (float)j2 + 0.5F) * f13 + f11);
                            tessellator.func_983_a(f19 + (float)k, f4 + f3, (f20 + (float)j2 + 1.0F) - f16, (f17 + (float)k) * f13 + f9, (f18 + (float)j2 + 0.5F) * f13 + f11);
                            tessellator.func_983_a(f19 + (float)k, f4 + 0.0F, (f20 + (float)j2 + 1.0F) - f16, (f17 + (float)k) * f13 + f9, (f18 + (float)j2 + 0.5F) * f13 + f11);
                            tessellator.func_983_a(f19 + 0.0F, f4 + 0.0F, (f20 + (float)j2 + 1.0F) - f16, (f17 + 0.0F) * f13 + f9, (f18 + (float)j2 + 0.5F) * f13 + f11);
                        }

                    }
                    tessellator.func_982_a();
                }

            }

        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glEnable(2884);
    }

    public boolean func_948_a(EntityPlayer entityplayer, boolean flag)
    {
        Collections.sort(field_1446_m, new RenderSorter(entityplayer));
        int i = field_1446_m.size() - 1;
        int j = field_1446_m.size();
        for(int k = 0; k < j; k++)
        {
            WorldRenderer worldrenderer = (WorldRenderer)field_1446_m.get(i - k);
            if(!flag)
            {
                if(worldrenderer.func_1202_a(entityplayer) > 1024F)
                {
                    if(worldrenderer.field_1749_o)
                    {
                        if(k >= 3)
                        {
                            return false;
                        }
                    } else
                    if(k >= 1)
                    {
                        return false;
                    }
                }
            } else
            if(!worldrenderer.field_1749_o)
            {
                continue;
            }
            worldrenderer.func_1198_a();
            field_1446_m.remove(worldrenderer);
            worldrenderer.field_1738_u = false;
        }

        return field_1446_m.size() == 0;
    }

    public void func_959_a(EntityPlayer entityplayer, MovingObjectPosition movingobjectposition, int i, ItemStack itemstack, float f)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glEnable(3042);
        GL11.glEnable(3008);
        GL11.glBlendFunc(770, 1);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, (MathHelper.func_1106_a((float)System.currentTimeMillis() / 100F) * 0.2F + 0.4F) * 0.5F);
        if(i == 0)
        {
            if(field_1450_i > 0.0F)
            {
                GL11.glBlendFunc(774, 768);
                int j = field_1447_l.func_1070_a("/terrain.png");
                GL11.glBindTexture(3553, j);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
                GL11.glPushMatrix();
                int k = field_1448_k.func_600_a(movingobjectposition.field_1166_b, movingobjectposition.field_1172_c, movingobjectposition.field_1171_d);
                Block block = k <= 0 ? null : Block.allBlocks[k];
                GL11.glDisable(3008);
                GL11.glPolygonOffset(-3F, -3F);
                GL11.glEnable(32823);
                tessellator.func_977_b();
                double d = entityplayer.field_638_aI + (entityplayer.posX - entityplayer.field_638_aI) * (double)f;
                double d1 = entityplayer.field_637_aJ + (entityplayer.posY - entityplayer.field_637_aJ) * (double)f;
                double d2 = entityplayer.field_636_aK + (entityplayer.posZ - entityplayer.field_636_aK) * (double)f;
                tessellator.func_984_b(-d, -d1, -d2);
                tessellator.func_989_c();
                if(block == null)
                {
                    block = Block.stone;
                }
                field_1438_u.func_1223_a(block, movingobjectposition.field_1166_b, movingobjectposition.field_1172_c, movingobjectposition.field_1171_d, 240 + (int)(field_1450_i * 10F));
                tessellator.func_982_a();
                tessellator.func_984_b(0.0D, 0.0D, 0.0D);
                GL11.glPolygonOffset(0.0F, 0.0F);
                GL11.glDisable(32823);
                GL11.glEnable(3008);
                GL11.glDepthMask(true);
                GL11.glPopMatrix();
            }
        } else
        if(itemstack != null)
        {
            GL11.glBlendFunc(770, 771);
            float f1 = MathHelper.func_1106_a((float)System.currentTimeMillis() / 100F) * 0.2F + 0.8F;
            GL11.glColor4f(f1, f1, f1, MathHelper.func_1106_a((float)System.currentTimeMillis() / 200F) * 0.2F + 0.5F);
            int l = field_1447_l.func_1070_a("/terrain.png");
            GL11.glBindTexture(3553, l);
            int i1 = movingobjectposition.field_1166_b;
            int j1 = movingobjectposition.field_1172_c;
            int k1 = movingobjectposition.field_1171_d;
            if(movingobjectposition.field_1170_e == 0)
            {
                j1--;
            }
            if(movingobjectposition.field_1170_e == 1)
            {
                j1++;
            }
            if(movingobjectposition.field_1170_e == 2)
            {
                k1--;
            }
            if(movingobjectposition.field_1170_e == 3)
            {
                k1++;
            }
            if(movingobjectposition.field_1170_e == 4)
            {
                i1--;
            }
            if(movingobjectposition.field_1170_e == 5)
            {
                i1++;
            }
        }
        GL11.glDisable(3042);
        GL11.glDisable(3008);
    }

    public void func_955_b(EntityPlayer entityplayer, MovingObjectPosition movingobjectposition, int i, ItemStack itemstack, float f)
    {
        if(i == 0 && movingobjectposition.field_1167_a == 0)
        {
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
            GL11.glLineWidth(2.0F);
            GL11.glDisable(3553);
            GL11.glDepthMask(false);
            float f1 = 0.002F;
            int j = field_1448_k.func_600_a(movingobjectposition.field_1166_b, movingobjectposition.field_1172_c, movingobjectposition.field_1171_d);
            if(j > 0)
            {
                Block.allBlocks[j].func_238_a(field_1448_k, movingobjectposition.field_1166_b, movingobjectposition.field_1172_c, movingobjectposition.field_1171_d);
                double d = entityplayer.field_638_aI + (entityplayer.posX - entityplayer.field_638_aI) * (double)f;
                double d1 = entityplayer.field_637_aJ + (entityplayer.posY - entityplayer.field_637_aJ) * (double)f;
                double d2 = entityplayer.field_636_aK + (entityplayer.posZ - entityplayer.field_636_aK) * (double)f;
                func_942_a(Block.allBlocks[j].func_246_f(field_1448_k, movingobjectposition.field_1166_b, movingobjectposition.field_1172_c, movingobjectposition.field_1171_d).func_1177_b(f1, f1, f1).func_1166_c(-d, -d1, -d2));
            }
            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
        }
    }

    private void func_942_a(AxisAlignedBB axisalignedbb)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_992_a(3);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_982_a();
        tessellator.func_992_a(3);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_982_a();
        tessellator.func_992_a(1);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_982_a();
    }

    public void func_949_a(int i, int j, int k, int l, int i1, int j1)
    {
        int k1 = MathHelper.func_1111_a(i, 16);
        int l1 = MathHelper.func_1111_a(j, 16);
        int i2 = MathHelper.func_1111_a(k, 16);
        int j2 = MathHelper.func_1111_a(l, 16);
        int k2 = MathHelper.func_1111_a(i1, 16);
        int l2 = MathHelper.func_1111_a(j1, 16);
        for(int i3 = k1; i3 <= j2; i3++)
        {
            int j3 = i3 % field_1443_p;
            if(j3 < 0)
            {
                j3 += field_1443_p;
            }
            for(int k3 = l1; k3 <= k2; k3++)
            {
                int l3 = k3 % field_1442_q;
                if(l3 < 0)
                {
                    l3 += field_1442_q;
                }
                for(int i4 = i2; i4 <= l2; i4++)
                {
                    int j4 = i4 % field_1441_r;
                    if(j4 < 0)
                    {
                        j4 += field_1441_r;
                    }
                    int k4 = (j4 * field_1442_q + l3) * field_1443_p + j3;
                    WorldRenderer worldrenderer = field_1444_o[k4];
                    if(!worldrenderer.field_1738_u)
                    {
                        field_1446_m.add(worldrenderer);
                    }
                    worldrenderer.func_1194_f();
                }

            }

        }

    }

    public void func_934_a(int i, int j, int k)
    {
        func_949_a(i - 1, j - 1, k - 1, i + 1, j + 1, k + 1);
    }

    public void func_937_b(int i, int j, int k, int l, int i1, int j1)
    {
        func_949_a(i - 1, j - 1, k - 1, l + 1, i1 + 1, j1 + 1);
    }

    public void func_960_a(ICamera icamera, float f)
    {
        for(int i = 0; i < field_1444_o.length; i++)
        {
            if(!field_1444_o[i].func_1196_e() && (!field_1444_o[i].field_1749_o || (i + field_1449_j & 0xf) == 0))
            {
                field_1444_o[i].func_1199_a(icamera);
            }
        }

        field_1449_j++;
    }

    public void func_933_a(String s, int i, int j, int k)
    {
        if(s != null)
        {
            field_1439_t.field_164_u.func_553_b((new StringBuilder()).append("C418 - ").append(s).toString());
        }
        field_1439_t.field_158_A.func_331_a(s, i, j, k, 1.0F, 1.0F);
    }

    public void func_940_a(String s, double d, double d1, double d2, 
            float f, float f1)
    {
        float f2 = 16F;
        if(f > 1.0F)
        {
            f2 *= f;
        }
        if(field_1439_t.field_178_g.func_360_d(d, d1, d2) < (double)(f2 * f2))
        {
            field_1439_t.field_158_A.func_336_b(s, (float)d, (float)d1, (float)d2, f, f1);
        }
    }

    public void func_939_a(String s, double d, double d1, double d2, 
            double d3, double d4, double d5)
    {
        double d6 = field_1439_t.field_178_g.posX - d;
        double d7 = field_1439_t.field_178_g.posY - d1;
        double d8 = field_1439_t.field_178_g.posZ - d2;
        if(d6 * d6 + d7 * d7 + d8 * d8 > 256D)
        {
            return;
        }
        if(s == "bubble")
        {
            field_1439_t.field_177_h.func_1192_a(new EntityBubbleFX(field_1448_k, d, d1, d2, d3, d4, d5));
        } else
        if(s == "smoke")
        {
            field_1439_t.field_177_h.func_1192_a(new EntitySmokeFX(field_1448_k, d, d1, d2));
        } else
        if(s == "explode")
        {
            field_1439_t.field_177_h.func_1192_a(new EntityExplodeFX(field_1448_k, d, d1, d2, d3, d4, d5));
        } else
        if(s == "flame")
        {
            field_1439_t.field_177_h.func_1192_a(new EntityFlameFX(field_1448_k, d, d1, d2, d3, d4, d5));
        } else
        if(s == "lava")
        {
            field_1439_t.field_177_h.func_1192_a(new EntityLavaFX(field_1448_k, d, d1, d2));
        } else
        if(s == "splash")
        {
            field_1439_t.field_177_h.func_1192_a(new EntitySplashFX(field_1448_k, d, d1, d2, d3, d4, d5));
        } else
        if(s == "largesmoke")
        {
            field_1439_t.field_177_h.func_1192_a(new EntitySmokeFX(field_1448_k, d, d1, d2, 2.5F));
        } else
        if(s == "reddust")
        {
            field_1439_t.field_177_h.func_1192_a(new EntityReddustFX(field_1448_k, d, d1, d2));
        } else
        if(s == "snowballpoof")
        {
            field_1439_t.field_177_h.func_1192_a(new EntitySlimeFX(field_1448_k, d, d1, d2, Item.snowball));
        } else
        if(s == "slime")
        {
            field_1439_t.field_177_h.func_1192_a(new EntitySlimeFX(field_1448_k, d, d1, d2, Item.slimeBall));
        }
    }

    public void func_941_a(Entity entity)
    {
        if(entity.field_622_aY != null)
        {
            field_1447_l.func_1075_a(entity.field_622_aY, new ImageBufferDownload());
        }
    }

    public void func_938_b(Entity entity)
    {
        if(entity.field_622_aY != null)
        {
            field_1447_l.func_1073_b(entity.field_622_aY);
        }
    }

    public void func_936_e()
    {
        for(int i = 0; i < field_1444_o.length; i++)
        {
            if(!field_1444_o[i].field_1747_A)
            {
                continue;
            }
            if(!field_1444_o[i].field_1738_u)
            {
                field_1446_m.add(field_1444_o[i]);
            }
            field_1444_o[i].func_1194_f();
        }

    }

    public void func_935_a(int i, int j, int k, TileEntity tileentity)
    {
    }

    public List field_1458_a;
    private World field_1448_k;
    private RenderEngine field_1447_l;
    private List field_1446_m;
    private WorldRenderer field_1445_n[];
    private WorldRenderer field_1444_o[];
    private int field_1443_p;
    private int field_1442_q;
    private int field_1441_r;
    private int field_1440_s;
    private Minecraft field_1439_t;
    private RenderBlocks field_1438_u;
    private IntBuffer field_1437_v;
    private boolean field_1436_w;
    private int field_1435_x;
    private int field_1434_y;
    private int field_1433_z;
    private int field_1432_A;
    private int field_1431_B;
    private int field_1430_C;
    private int field_1429_D;
    private int field_1428_E;
    private int field_1427_F;
    private int field_1426_G;
    private int field_1425_H;
    private int field_1424_I;
    private int field_1423_J;
    private int field_1422_K;
    private int field_1421_L;
    int field_1457_b[];
    IntBuffer field_1456_c;
    private int field_1420_M;
    private int field_1419_N;
    private int field_1418_O;
    private int field_1417_P;
    private int field_1416_Q;
    private List field_1415_R;
    private RenderList field_1414_S[] = {
        new RenderList(), new RenderList(), new RenderList(), new RenderList()
    };
    int field_1455_d;
    int field_1454_e;
    double field_1453_f;
    double field_1452_g;
    double field_1451_h;
    public float field_1450_i;
    int field_1449_j;
}
