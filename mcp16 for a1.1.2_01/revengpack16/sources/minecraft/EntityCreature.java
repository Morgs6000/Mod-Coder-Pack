// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntityCreature extends EntityLiving
{

    public EntityCreature(World world)
    {
        super(world);
        field_750_g = false;
    }

    protected void func_418_b_()
    {
        field_750_g = false;
        float f = 16F;
        if(field_751_f == null)
        {
            field_751_f = func_438_i();
            if(field_751_f != null)
            {
                field_749_a = field_615_ag.func_702_a(this, field_751_f, f);
            }
        } else
        if(!field_751_f.func_354_B())
        {
            field_751_f = null;
        } else
        {
            float f1 = field_751_f.func_379_d(this);
            if(func_420_c(field_751_f))
            {
                func_437_a(field_751_f, f1);
            }
        }
        if(!field_750_g && field_751_f != null && (field_749_a == null || field_630_aQ.nextInt(20) == 0))
        {
            field_749_a = field_615_ag.func_702_a(this, field_751_f, f);
        } else
        if(field_749_a == null && field_630_aQ.nextInt(80) == 0 || field_630_aQ.nextInt(80) == 0)
        {
            boolean flag = false;
            int j = -1;
            int k = -1;
            int l = -1;
            float f2 = -99999F;
            for(int i1 = 0; i1 < 10; i1++)
            {
                int j1 = MathHelper.func_1108_b((posX + (double)field_630_aQ.nextInt(13)) - 6D);
                int k1 = MathHelper.func_1108_b((posY + (double)field_630_aQ.nextInt(7)) - 3D);
                int l1 = MathHelper.func_1108_b((posZ + (double)field_630_aQ.nextInt(13)) - 6D);
                float f3 = func_439_a(j1, k1, l1);
                if(f3 > f2)
                {
                    f2 = f3;
                    j = j1;
                    k = k1;
                    l = l1;
                    flag = true;
                }
            }

            if(flag)
            {
                field_749_a = field_615_ag.func_637_a(this, j, k, l, 10F);
            }
        }
        int i = MathHelper.func_1108_b(boundingBox.field_1697_b);
        boolean flag1 = func_397_g_();
        boolean flag2 = func_359_G();
        rotationPitch = 0.0F;
        if(field_749_a == null || field_630_aQ.nextInt(100) == 0)
        {
            super.func_418_b_();
            field_749_a = null;
            return;
        }
        Vec3D vec3d = field_749_a.func_1205_a(this);
        for(double d = field_644_aC * 2.0F; vec3d != null && vec3d.func_1255_d(posX, vec3d.field_1775_b, posZ) < d * d;)
        {
            field_749_a.func_1206_a();
            if(field_749_a.func_1207_b())
            {
                vec3d = null;
                field_749_a = null;
            } else
            {
                vec3d = field_749_a.func_1205_a(this);
            }
        }

        field_697_Y = false;
        if(vec3d != null)
        {
            double d1 = vec3d.field_1776_a - posX;
            double d2 = vec3d.field_1779_c - posZ;
            double d3 = vec3d.field_1775_b - (double)i;
            float f4 = (float)((Math.atan2(d2, d1) * 180D) / 3.1415927410125732D) - 90F;
            float f5 = f4 - rotationYaw;
            field_699_W = field_722_aa;
            for(; f5 < -180F; f5 += 360F) { }
            for(; f5 >= 180F; f5 -= 360F) { }
            if(f5 > 30F)
            {
                f5 = 30F;
            }
            if(f5 < -30F)
            {
                f5 = -30F;
            }
            rotationYaw += f5;
            if(field_750_g && field_751_f != null)
            {
                double d4 = field_751_f.posX - posX;
                double d5 = field_751_f.posZ - posZ;
                float f7 = rotationYaw;
                rotationYaw = (float)((Math.atan2(d5, d4) * 180D) / 3.1415927410125732D) - 90F;
                float f6 = (((f7 - rotationYaw) + 90F) * 3.141593F) / 180F;
                field_700_V = -MathHelper.func_1106_a(f6) * field_699_W * 1.0F;
                field_699_W = MathHelper.func_1114_b(f6) * field_699_W * 1.0F;
            }
            if(d3 > 0.0D)
            {
                field_697_Y = true;
            }
        }
        if(field_751_f != null)
        {
            func_426_b(field_751_f, 30F);
        }
        if(field_599_aw)
        {
            field_697_Y = true;
        }
        if(field_630_aQ.nextFloat() < 0.8F && (flag1 || flag2))
        {
            field_697_Y = true;
        }
    }

    protected void func_437_a(Entity entity, float f)
    {
    }

    protected float func_439_a(int i, int j, int k)
    {
        return 0.0F;
    }

    protected Entity func_438_i()
    {
        return null;
    }

    public boolean func_433_a()
    {
        int i = MathHelper.func_1108_b(posX);
        int j = MathHelper.func_1108_b(boundingBox.field_1697_b);
        int k = MathHelper.func_1108_b(posZ);
        return super.func_433_a() && func_439_a(i, j, k) >= 0.0F;
    }

    private PathEntity field_749_a;
    protected Entity field_751_f;
    protected boolean field_750_g;
}
