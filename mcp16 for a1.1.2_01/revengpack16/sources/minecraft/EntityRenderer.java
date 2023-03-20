// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
//import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.GLU;

public class EntityRenderer
{

    public EntityRenderer(Minecraft minecraft)
    {
        field_1387_i = 0.0F;
        field_1385_k = null;
        field_1384_l = System.currentTimeMillis();
        field_1383_m = new Random();
        field_1394_b = 0;
        field_1393_c = 0;
        field_1392_d = GLAllocation.func_1123_d(16);
        field_1388_h = minecraft;
        field_1395_a = new ItemRenderer(minecraft);
    }

    public void func_911_a()
    {
        field_1382_n = field_1381_o;
        float f = field_1388_h.field_180_e.func_598_c(MathHelper.func_1108_b(field_1388_h.field_178_g.posX), MathHelper.func_1108_b(field_1388_h.field_178_g.posY), MathHelper.func_1108_b(field_1388_h.field_178_g.posZ));
        float f1 = (float)(3 - field_1388_h.options.renderDistance) / 3F;
        float f2 = f * (1.0F - f1) + f1;
        field_1381_o += (f2 - field_1381_o) * 0.1F;
        field_1386_j++;
        field_1395_a.func_895_a();
        if(field_1388_h.enableRain)
        {
            func_916_c();
        }
    }

    public void func_910_a(float f)
    {
        if(field_1388_h.field_178_g == null)
        {
            return;
        }
        double d = field_1388_h.field_183_b.func_727_b();
        field_1388_h.field_161_x = field_1388_h.field_178_g.func_416_a(d, f);
        double d1 = d;
        Vec3D vec3d = field_1388_h.field_178_g.func_427_e(f);
        if(field_1388_h.field_161_x != null)
        {
            d1 = field_1388_h.field_161_x.field_1169_f.func_1251_c(vec3d);
        }
        if(field_1388_h.field_183_b instanceof PlayerControllerTest)
        {
            d1 = d = 32D;
        } else
        {
            if(d1 > 3D)
            {
                d1 = 3D;
            }
            d = d1;
        }
        Vec3D vec3d1 = field_1388_h.field_178_g.func_430_f(f);
        Vec3D vec3d2 = vec3d.func_1257_c(vec3d1.field_1776_a * d, vec3d1.field_1775_b * d, vec3d1.field_1779_c * d);
        field_1385_k = null;
        List list = field_1388_h.field_180_e.func_659_b(field_1388_h.field_178_g, field_1388_h.field_178_g.boundingBox.func_1170_a(vec3d1.field_1776_a * d, vec3d1.field_1775_b * d, vec3d1.field_1779_c * d));
        double d2 = 0.0D;
        for(int i = 0; i < list.size(); i++)
        {
            Entity entity = (Entity)list.get(i);
            if(!entity.func_401_c_())
            {
                continue;
            }
            float f1 = 0.1F;
            AxisAlignedBB axisalignedbb = entity.boundingBox.func_1177_b(f1, f1, f1);
            MovingObjectPosition movingobjectposition = axisalignedbb.func_1169_a(vec3d, vec3d2);
            if(movingobjectposition == null)
            {
                continue;
            }
            double d3 = vec3d.func_1251_c(movingobjectposition.field_1169_f);
            if(d3 < d2 || d2 == 0.0D)
            {
                field_1385_k = entity;
                d2 = d3;
            }
        }

        if(field_1385_k != null && !(field_1388_h.field_183_b instanceof PlayerControllerTest))
        {
            field_1388_h.field_161_x = new MovingObjectPosition(field_1385_k);
        }
    }

    private float func_914_d(float f)
    {
        EntityPlayerSP entityplayersp = field_1388_h.field_178_g;
        float f1 = 70F;
        if(entityplayersp.func_393_a(Material.water))
        {
            f1 = 60F;
        }
        if(((EntityPlayer) (entityplayersp)).health <= 0)
        {
            float f2 = (float)((EntityPlayer) (entityplayersp)).deathTime + f;
            f1 /= (1.0F - 500F / (f2 + 500F)) * 2.0F + 1.0F;
        }
        return f1;
    }

    private void func_920_e(float f)
    {
        EntityPlayerSP entityplayersp = field_1388_h.field_178_g;
        float f1 = (float)((EntityPlayer) (entityplayersp)).hurtTime - f;
        if(((EntityPlayer) (entityplayersp)).health <= 0)
        {
            float f2 = (float)((EntityPlayer) (entityplayersp)).deathTime + f;
            GL11.glRotatef(40F - 8000F / (f2 + 200F), 0.0F, 0.0F, 1.0F);
        }
        if(f1 < 0.0F)
        {
            return;
        } else
        {
            f1 /= ((EntityPlayer) (entityplayersp)).field_714_H;
            f1 = MathHelper.func_1106_a(f1 * f1 * f1 * f1 * 3.141593F);
            float f3 = ((EntityPlayer) (entityplayersp)).field_713_I;
            GL11.glRotatef(-f3, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f1 * 14F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(f3, 0.0F, 1.0F, 0.0F);
            return;
        }
    }

    private void func_917_f(float f)
    {
        if(field_1388_h.options.thirdPersonView)
        {
            return;
        } else
        {
            EntityPlayerSP entityplayersp = field_1388_h.field_178_g;
            float f1 = ((EntityPlayer) (entityplayersp)).field_641_aF - ((EntityPlayer) (entityplayersp)).field_642_aE;
            float f2 = ((EntityPlayer) (entityplayersp)).field_641_aF + f1 * f;
            float f3 = ((EntityPlayer) (entityplayersp)).field_775_e + (((EntityPlayer) (entityplayersp)).field_774_f - ((EntityPlayer) (entityplayersp)).field_775_e) * f;
            float f4 = ((EntityPlayer) (entityplayersp)).field_710_L + (((EntityPlayer) (entityplayersp)).field_709_M - ((EntityPlayer) (entityplayersp)).field_710_L) * f;
            GL11.glTranslatef(MathHelper.func_1106_a(f2 * 3.141593F) * f3 * 0.5F, -Math.abs(MathHelper.func_1114_b(f2 * 3.141593F) * f3), 0.0F);
            GL11.glRotatef(MathHelper.func_1106_a(f2 * 3.141593F) * f3 * 3F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(MathHelper.func_1114_b(f2 * 3.141593F + 0.2F) * f3) * 5F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(f4, 1.0F, 0.0F, 0.0F);
            return;
        }
    }

    private void func_915_g(float f)
    {
        EntityPlayerSP entityplayersp = field_1388_h.field_178_g;
        double d = ((EntityPlayer) (entityplayersp)).field_614_ah + (((EntityPlayer) (entityplayersp)).posX - ((EntityPlayer) (entityplayersp)).field_614_ah) * (double)f;
        double d1 = ((EntityPlayer) (entityplayersp)).field_613_ai + (((EntityPlayer) (entityplayersp)).posY - ((EntityPlayer) (entityplayersp)).field_613_ai) * (double)f;
        double d2 = ((EntityPlayer) (entityplayersp)).field_612_aj + (((EntityPlayer) (entityplayersp)).posZ - ((EntityPlayer) (entityplayersp)).field_612_aj) * (double)f;
        if(field_1388_h.options.thirdPersonView)
        {
            double d3 = 4D;
            float f1 = ((EntityPlayer) (entityplayersp)).rotationYaw;
            float f2 = ((EntityPlayer) (entityplayersp)).rotationPitch;
            double d4 = (double)(-MathHelper.func_1106_a((f1 / 180F) * 3.141593F) * MathHelper.func_1114_b((f2 / 180F) * 3.141593F)) * d3;
            double d5 = (double)(MathHelper.func_1114_b((f1 / 180F) * 3.141593F) * MathHelper.func_1114_b((f2 / 180F) * 3.141593F)) * d3;
            double d6 = (double)(-MathHelper.func_1106_a((f2 / 180F) * 3.141593F)) * d3;
            for(int i = 0; i < 8; i++)
            {
                float f3 = (i & 1) * 2 - 1;
                float f4 = (i >> 1 & 1) * 2 - 1;
                float f5 = (i >> 2 & 1) * 2 - 1;
                f3 *= 0.1F;
                f4 *= 0.1F;
                f5 *= 0.1F;
                MovingObjectPosition movingobjectposition = field_1388_h.field_180_e.func_645_a(Vec3D.func_1248_b(d + (double)f3, d1 + (double)f4, d2 + (double)f5), Vec3D.func_1248_b((d - d4) + (double)f3 + (double)f5, (d1 - d6) + (double)f4, (d2 - d5) + (double)f5));
                if(movingobjectposition == null)
                {
                    continue;
                }
                double d7 = movingobjectposition.field_1169_f.func_1251_c(Vec3D.func_1248_b(d, d1, d2));
                if(d7 < d3)
                {
                    d3 = d7;
                }
            }

            GL11.glRotatef(((EntityPlayer) (entityplayersp)).rotationPitch - f2, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(((EntityPlayer) (entityplayersp)).rotationYaw - f1, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, 0.0F, (float)(-d3));
            GL11.glRotatef(f1 - ((EntityPlayer) (entityplayersp)).rotationYaw, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(f2 - ((EntityPlayer) (entityplayersp)).rotationPitch, 1.0F, 0.0F, 0.0F);
        } else
        {
            GL11.glTranslatef(0.0F, 0.0F, -0.1F);
        }
        GL11.glRotatef(((EntityPlayer) (entityplayersp)).field_602_at + (((EntityPlayer) (entityplayersp)).rotationPitch - ((EntityPlayer) (entityplayersp)).field_602_at) * f, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(((EntityPlayer) (entityplayersp)).field_603_as + (((EntityPlayer) (entityplayersp)).rotationYaw - ((EntityPlayer) (entityplayersp)).field_603_as) * f + 180F, 0.0F, 1.0F, 0.0F);
    }

    private void func_918_a(float f, int i)
    {
        field_1387_i = 256 >> field_1388_h.options.renderDistance;
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        float f1 = 0.07F;
        if(field_1388_h.options.anaglyph)
        {
            GL11.glTranslatef((float)(-(i * 2 - 1)) * f1, 0.0F, 0.0F);
        }
        GLU.gluPerspective(func_914_d(f), (float)field_1388_h.displayWidth / (float)field_1388_h.displayHeight, 0.05F, field_1387_i);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        if(field_1388_h.options.anaglyph)
        {
            GL11.glTranslatef((float)(i * 2 - 1) * 0.1F, 0.0F, 0.0F);
        }
        func_920_e(f);
        if(field_1388_h.options.viewBobbing)
        {
            func_917_f(f);
        }
        func_915_g(f);
    }

    private void func_907_b(float f, int i)
    {
        GL11.glLoadIdentity();
        if(field_1388_h.options.anaglyph)
        {
            GL11.glTranslatef((float)(i * 2 - 1) * 0.1F, 0.0F, 0.0F);
        }
        GL11.glPushMatrix();
        func_920_e(f);
        if(field_1388_h.options.viewBobbing)
        {
            func_917_f(f);
        }
        if(!field_1388_h.options.thirdPersonView)
        {
            field_1395_a.func_894_a(f);
        }
        GL11.glPopMatrix();
        if(!field_1388_h.options.thirdPersonView)
        {
            field_1395_a.func_893_b(f);
            func_920_e(f);
        }
        if(field_1388_h.options.viewBobbing)
        {
            func_917_f(f);
        }
    }

    public void func_909_b(float f)
    {
        if(!Display.isActive())
        {
            if(System.currentTimeMillis() - field_1384_l > 500L)
            {
                field_1388_h.func_117_g();
            }
        } else
        {
            field_1384_l = System.currentTimeMillis();
        }
        if(field_1388_h.field_150_I)
        {
            field_1388_h.field_157_B.func_772_c();
            float f1 = field_1388_h.options.mouseSensitivity * 0.6F + 0.2F;
            float f2 = f1 * f1 * f1 * 8F;
            float f3 = (float)field_1388_h.field_157_B.field_1114_a * f2;
            float f4 = (float)field_1388_h.field_157_B.field_1113_b * f2;
            int l = 1;
            if(field_1388_h.options.invertMouse)
            {
                l = -1;
            }
            field_1388_h.field_178_g.func_346_d(f3, f4 * (float)l);
        }
        if(field_1388_h.field_163_v)
        {
            return;
        }
        ScaledResolution scaledresolution = new ScaledResolution(field_1388_h.displayWidth, field_1388_h.displayHeight);
        int i = scaledresolution.func_903_a();
        int j = scaledresolution.func_902_b();
        int k = (Mouse.getX() * i) / field_1388_h.displayWidth;
        int i1 = j - (Mouse.getY() * j) / field_1388_h.displayHeight - 1;
        if(field_1388_h.field_180_e != null)
        {
            func_906_c(f);
            field_1388_h.field_164_u.func_557_a(f, field_1388_h.field_169_p != null, k, i1);
        } else
        {
            GL11.glViewport(0, 0, field_1388_h.displayWidth, field_1388_h.displayHeight);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16640);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            func_905_b();
        }
        if(field_1388_h.field_169_p != null)
        {
            GL11.glClear(256);
            field_1388_h.field_169_p.func_571_a(k, i1, f);
        }
    }

    public void func_906_c(float f)
    {
        func_910_a(f);
        EntityPlayerSP entityplayersp = field_1388_h.field_178_g;
        RenderGlobal renderglobal = field_1388_h.field_179_f;
        EffectRenderer effectrenderer = field_1388_h.field_177_h;
        double d = ((EntityPlayer) (entityplayersp)).field_638_aI + (((EntityPlayer) (entityplayersp)).posX - ((EntityPlayer) (entityplayersp)).field_638_aI) * (double)f;
        double d1 = ((EntityPlayer) (entityplayersp)).field_637_aJ + (((EntityPlayer) (entityplayersp)).posY - ((EntityPlayer) (entityplayersp)).field_637_aJ) * (double)f;
        double d2 = ((EntityPlayer) (entityplayersp)).field_636_aK + (((EntityPlayer) (entityplayersp)).posZ - ((EntityPlayer) (entityplayersp)).field_636_aK) * (double)f;
        for(int i = 0; i < 2; i++)
        {
            if(field_1388_h.options.anaglyph)
            {
                if(i == 0)
                {
                    GL11.glColorMask(false, true, true, false);
                } else
                {
                    GL11.glColorMask(true, false, false, false);
                }
            }
            GL11.glViewport(0, 0, field_1388_h.displayWidth, field_1388_h.displayHeight);
            func_912_i(f);
            GL11.glClear(16640);
            GL11.glEnable(2884);
            func_918_a(f, i);
            ClippingHelperImplementation.func_1155_a();
            if(field_1388_h.options.renderDistance < 2)
            {
                func_919_a(-1);
                renderglobal.func_954_a(f);
            }
            GL11.glEnable(2912);
            func_919_a(1);
            Frustrum frustrum = new Frustrum();
            frustrum.func_343_a(d, d1, d2);
            field_1388_h.field_179_f.func_960_a(frustrum, f);
            field_1388_h.field_179_f.func_948_a(entityplayersp, false);
            func_919_a(0);
            GL11.glEnable(2912);
            GL11.glBindTexture(3553, field_1388_h.field_171_n.func_1070_a("/terrain.png"));
            RenderHelper.func_1159_a();
            renderglobal.func_943_a(entityplayersp, 0, f);
            RenderHelper.func_1158_b();
            renderglobal.func_951_a(entityplayersp.func_427_e(f), frustrum, f);
            effectrenderer.func_1187_b(entityplayersp, f);
            RenderHelper.func_1159_a();
            func_919_a(0);
            effectrenderer.func_1189_a(entityplayersp, f);
            if(field_1388_h.field_161_x != null && entityplayersp.func_393_a(Material.water))
            {
                GL11.glDisable(3008);
                renderglobal.func_959_a(entityplayersp, field_1388_h.field_161_x, 0, ((EntityPlayer) (entityplayersp)).field_778_b.func_494_a(), f);
                renderglobal.func_955_b(entityplayersp, field_1388_h.field_161_x, 0, ((EntityPlayer) (entityplayersp)).field_778_b.func_494_a(), f);
                GL11.glEnable(3008);
            }
            GL11.glBlendFunc(770, 771);
            func_919_a(0);
            GL11.glEnable(3042);
            GL11.glDisable(2884);
            GL11.glBindTexture(3553, field_1388_h.field_171_n.func_1070_a("/terrain.png"));
            if(field_1388_h.options.fancyGraphics)
            {
                GL11.glColorMask(false, false, false, false);
                int j = renderglobal.func_943_a(entityplayersp, 1, f);
                GL11.glColorMask(true, true, true, true);
                if(field_1388_h.options.anaglyph)
                {
                    if(i == 0)
                    {
                        GL11.glColorMask(false, true, true, false);
                    } else
                    {
                        GL11.glColorMask(true, false, false, false);
                    }
                }
                if(j > 0)
                {
                    renderglobal.func_944_a(1, f);
                }
            } else
            {
                renderglobal.func_943_a(entityplayersp, 1, f);
            }
            GL11.glDepthMask(true);
            GL11.glEnable(2884);
            GL11.glDisable(3042);
            if(field_1388_h.field_161_x != null && !entityplayersp.func_393_a(Material.water))
            {
                GL11.glDisable(3008);
                renderglobal.func_959_a(entityplayersp, field_1388_h.field_161_x, 0, ((EntityPlayer) (entityplayersp)).field_778_b.func_494_a(), f);
                renderglobal.func_955_b(entityplayersp, field_1388_h.field_161_x, 0, ((EntityPlayer) (entityplayersp)).field_778_b.func_494_a(), f);
                GL11.glEnable(3008);
            }
            GL11.glDisable(2912);
            if(field_1388_h.field_180_e.snowCovered)
            {
                func_913_h(f);
            }
            if(field_1385_k == null);
            func_919_a(0);
            GL11.glEnable(2912);
            renderglobal.func_947_b(f);
            GL11.glDisable(2912);
            func_919_a(1);
            GL11.glClear(256);
            func_907_b(f, i);
            if(!field_1388_h.options.anaglyph)
            {
                return;
            }
        }

        GL11.glColorMask(true, true, true, false);
    }

    private void func_916_c()
    {
        if(!field_1388_h.options.fancyGraphics)
        {
            return;
        }
        EntityPlayerSP entityplayersp = field_1388_h.field_178_g;
        World world = field_1388_h.field_180_e;
        int i = MathHelper.func_1108_b(((EntityPlayer) (entityplayersp)).posX);
        int j = MathHelper.func_1108_b(((EntityPlayer) (entityplayersp)).posY);
        int k = MathHelper.func_1108_b(((EntityPlayer) (entityplayersp)).posZ);
        byte byte0 = 16;
        for(int l = 0; l < 150; l++)
        {
            int i1 = (i + field_1383_m.nextInt(byte0)) - field_1383_m.nextInt(byte0);
            int j1 = (k + field_1383_m.nextInt(byte0)) - field_1383_m.nextInt(byte0);
            int k1 = world.func_696_e(i1, j1);
            int l1 = world.func_600_a(i1, k1 - 1, j1);
            if(k1 > j + byte0 || k1 < j - byte0)
            {
                continue;
            }
            float f = field_1383_m.nextFloat();
            float f1 = field_1383_m.nextFloat();
            if(l1 > 0)
            {
                field_1388_h.field_177_h.func_1192_a(new EntityRainFX(world, (float)i1 + f, (double)((float)k1 + 0.1F) - Block.allBlocks[l1].field_368_bg, (float)j1 + f1));
            }
        }

    }

    private void func_913_h(float f)
    {
        EntityPlayerSP entityplayersp = field_1388_h.field_178_g;
        World world = field_1388_h.field_180_e;
        int i = MathHelper.func_1108_b(((EntityPlayer) (entityplayersp)).posX);
        int j = MathHelper.func_1108_b(((EntityPlayer) (entityplayersp)).posY);
        int k = MathHelper.func_1108_b(((EntityPlayer) (entityplayersp)).posZ);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glDisable(2884);
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glBindTexture(3553, field_1388_h.field_171_n.func_1070_a("/snow.png"));
        double d = ((EntityPlayer) (entityplayersp)).field_638_aI + (((EntityPlayer) (entityplayersp)).posX - ((EntityPlayer) (entityplayersp)).field_638_aI) * (double)f;
        double d1 = ((EntityPlayer) (entityplayersp)).field_637_aJ + (((EntityPlayer) (entityplayersp)).posY - ((EntityPlayer) (entityplayersp)).field_637_aJ) * (double)f;
        double d2 = ((EntityPlayer) (entityplayersp)).field_636_aK + (((EntityPlayer) (entityplayersp)).posZ - ((EntityPlayer) (entityplayersp)).field_636_aK) * (double)f;
        int l = 5;
        if(field_1388_h.options.fancyGraphics)
        {
            l = 10;
        }
        for(int i1 = i - l; i1 <= i + l; i1++)
        {
            for(int j1 = k - l; j1 <= k + l; j1++)
            {
                int k1 = world.func_685_d(i1, j1);
                if(k1 < 0)
                {
                    k1 = 0;
                }
                int l1 = j - l;
                int i2 = j + l;
                if(l1 < k1)
                {
                    l1 = k1;
                }
                if(i2 < k1)
                {
                    i2 = k1;
                }
                float f1 = 2.0F;
                if(l1 != i2)
                {
                    field_1383_m.setSeed(i1 * i1 * 3121 + i1 * 0x2b24abb + j1 * j1 * 0x66397 + j1 * 13761);
                    float f2 = (float)field_1386_j + f;
                    float f3 = ((float)(field_1386_j & 0x1ff) + f) / 512F;
                    float f4 = field_1383_m.nextFloat() + f2 * 0.01F * (float)field_1383_m.nextGaussian();
                    float f5 = field_1383_m.nextFloat() + f2 * (float)field_1383_m.nextGaussian() * 0.001F;
                    double d3 = (double)((float)i1 + 0.5F) - ((EntityPlayer) (entityplayersp)).posX;
                    double d4 = (double)((float)j1 + 0.5F) - ((EntityPlayer) (entityplayersp)).posZ;
                    float f6 = MathHelper.func_1109_a(d3 * d3 + d4 * d4) / (float)l;
                    tessellator.func_977_b();
                    float f7 = world.func_598_c(i1, 128, j1);
                    GL11.glColor4f(f7, f7, f7, (1.0F - f6 * f6) * 0.7F);
                    tessellator.func_984_b(-d * 1.0D, -d1 * 1.0D, -d2 * 1.0D);
                    tessellator.func_983_a(i1 + 0, l1, j1 + 0, 0.0F * f1 + f4, ((float)l1 * f1) / 8F + f3 * f1 + f5);
                    tessellator.func_983_a(i1 + 1, l1, j1 + 1, 1.0F * f1 + f4, ((float)l1 * f1) / 8F + f3 * f1 + f5);
                    tessellator.func_983_a(i1 + 1, i2, j1 + 1, 1.0F * f1 + f4, ((float)i2 * f1) / 8F + f3 * f1 + f5);
                    tessellator.func_983_a(i1 + 0, i2, j1 + 0, 0.0F * f1 + f4, ((float)i2 * f1) / 8F + f3 * f1 + f5);
                    tessellator.func_983_a(i1 + 0, l1, j1 + 1, 0.0F * f1 + f4, ((float)l1 * f1) / 8F + f3 * f1 + f5);
                    tessellator.func_983_a(i1 + 1, l1, j1 + 0, 1.0F * f1 + f4, ((float)l1 * f1) / 8F + f3 * f1 + f5);
                    tessellator.func_983_a(i1 + 1, i2, j1 + 0, 1.0F * f1 + f4, ((float)i2 * f1) / 8F + f3 * f1 + f5);
                    tessellator.func_983_a(i1 + 0, i2, j1 + 1, 0.0F * f1 + f4, ((float)i2 * f1) / 8F + f3 * f1 + f5);
                    tessellator.func_984_b(0.0D, 0.0D, 0.0D);
                    tessellator.func_982_a();
                }
            }

        }

        GL11.glEnable(2884);
        GL11.glDisable(3042);
    }

    public void func_905_b()
    {
        ScaledResolution scaledresolution = new ScaledResolution(field_1388_h.displayWidth, field_1388_h.displayHeight);
        int i = scaledresolution.func_903_a();
        int j = scaledresolution.func_902_b();
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, i, j, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
    }

    private void func_912_i(float f)
    {
        World world = field_1388_h.field_180_e;
        EntityPlayerSP entityplayersp = field_1388_h.field_178_g;
        float f1 = 1.0F / (float)(4 - field_1388_h.options.renderDistance);
        f1 = 1.0F - (float)Math.pow(f1, 0.25D);
        Vec3D vec3d = world.func_626_b(f);
        float f2 = (float)vec3d.field_1776_a;
        float f3 = (float)vec3d.field_1775_b;
        float f4 = (float)vec3d.field_1779_c;
        Vec3D vec3d1 = world.func_686_e(f);
        field_1391_e = (float)vec3d1.field_1776_a;
        field_1390_f = (float)vec3d1.field_1775_b;
        field_1389_g = (float)vec3d1.field_1779_c;
        field_1391_e += (f2 - field_1391_e) * f1;
        field_1390_f += (f3 - field_1390_f) * f1;
        field_1389_g += (f4 - field_1389_g) * f1;
        if(entityplayersp.func_393_a(Material.water))
        {
            field_1391_e = 0.02F;
            field_1390_f = 0.02F;
            field_1389_g = 0.2F;
        } else
        if(entityplayersp.func_393_a(Material.lava))
        {
            field_1391_e = 0.6F;
            field_1390_f = 0.1F;
            field_1389_g = 0.0F;
        }
        float f5 = field_1382_n + (field_1381_o - field_1382_n) * f;
        field_1391_e *= f5;
        field_1390_f *= f5;
        field_1389_g *= f5;
        if(field_1388_h.options.anaglyph)
        {
            float f6 = (field_1391_e * 30F + field_1390_f * 59F + field_1389_g * 11F) / 100F;
            float f7 = (field_1391_e * 30F + field_1390_f * 70F) / 100F;
            float f8 = (field_1391_e * 30F + field_1389_g * 70F) / 100F;
            field_1391_e = f6;
            field_1390_f = f7;
            field_1389_g = f8;
        }
        GL11.glClearColor(field_1391_e, field_1390_f, field_1389_g, 0.0F);
    }

    private void func_919_a(int i)
    {
        EntityPlayerSP entityplayersp = field_1388_h.field_178_g;
        GL11.glFog(2918, func_908_a(field_1391_e, field_1390_f, field_1389_g, 1.0F));
        GL11.glNormal3f(0.0F, -1F, 0.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if(entityplayersp.func_393_a(Material.water))
        {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 0.1F);
            float f = 0.4F;
            float f2 = 0.4F;
            float f4 = 0.9F;
            if(field_1388_h.options.anaglyph)
            {
                float f6 = (f * 30F + f2 * 59F + f4 * 11F) / 100F;
                float f8 = (f * 30F + f2 * 70F) / 100F;
                float f10 = (f * 30F + f4 * 70F) / 100F;
                f = f6;
                f2 = f8;
                f4 = f10;
            }
        } else
        if(entityplayersp.func_393_a(Material.lava))
        {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 2.0F);
            float f1 = 0.4F;
            float f3 = 0.3F;
            float f5 = 0.3F;
            if(field_1388_h.options.anaglyph)
            {
                float f7 = (f1 * 30F + f3 * 59F + f5 * 11F) / 100F;
                float f9 = (f1 * 30F + f3 * 70F) / 100F;
                float f11 = (f1 * 30F + f5 * 70F) / 100F;
                f1 = f7;
                f3 = f9;
                f5 = f11;
            }
        } else
        {
            GL11.glFogi(2917, 9729);
            GL11.glFogf(2915, field_1387_i * 0.25F);
            GL11.glFogf(2916, field_1387_i);
            if(i < 0)
            {
                GL11.glFogf(2915, 0.0F);
                GL11.glFogf(2916, field_1387_i * 0.8F);
            }
            if(GLContext.getCapabilities().GL_NV_fog_distance)
            {
                GL11.glFogi(34138, 34139);
            }
        }
        GL11.glEnable(2903);
        GL11.glColorMaterial(1028, 4608);
    }

    private FloatBuffer func_908_a(float f, float f1, float f2, float f3)
    {
        field_1392_d.clear();
        field_1392_d.put(f).put(f1).put(f2).put(f3);
        field_1392_d.flip();
        return field_1392_d;
    }

    private Minecraft field_1388_h;
    private float field_1387_i;
    public ItemRenderer field_1395_a;
    private int field_1386_j;
    private Entity field_1385_k;
    private long field_1384_l;
    private Random field_1383_m;
    volatile int field_1394_b;
    volatile int field_1393_c;
    FloatBuffer field_1392_d;
    float field_1391_e;
    float field_1390_f;
    float field_1389_g;
    private float field_1382_n;
    private float field_1381_o;
}
