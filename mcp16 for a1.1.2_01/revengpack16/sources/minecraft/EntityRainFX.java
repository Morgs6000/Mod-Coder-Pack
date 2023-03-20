// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntityRainFX extends EntityFX
{

    public EntityRainFX(World world, double d, double d1, double d2)
    {
        super(world, d, d1, d2, 0.0D, 0.0D, 0.0D);
        motionX *= 0.30000001192092896D;
        motionY = (float)Math.random() * 0.2F + 0.1F;
        motionZ *= 0.30000001192092896D;
        field_663_i = 1.0F;
        field_662_j = 1.0F;
        field_661_k = 1.0F;
        field_670_b = 19 + field_630_aQ.nextInt(4);
        func_371_a(0.01F, 0.01F);
        field_664_h = 0.06F;
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
    }

    public void func_406_a(Tessellator tessellator, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.func_406_a(tessellator, f, f1, f2, f3, f4, f5);
    }

    public void func_370_e_()
    {
        field_614_ah = posX;
        field_613_ai = posY;
        field_612_aj = posZ;
        motionY -= field_664_h;
        func_349_c(motionX, motionY, motionZ);
        motionX *= 0.98000001907348633D;
        motionY *= 0.98000001907348633D;
        motionZ *= 0.98000001907348633D;
        if(field_666_f-- <= 0)
        {
            func_395_F();
        }
        if(onGround)
        {
            if(Math.random() < 0.5D)
            {
                func_395_F();
            }
            motionX *= 0.69999998807907104D;
            motionZ *= 0.69999998807907104D;
        }
        Material material = field_615_ag.func_599_f(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(posY), MathHelper.func_1108_b(posZ));
        if(material.func_879_d() || material.func_878_a())
        {
            double d = (float)(MathHelper.func_1108_b(posY) + 1) - BlockFluids.func_288_b(field_615_ag.func_602_e(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(posY), MathHelper.func_1108_b(posZ)));
            if(posY < d)
            {
                func_395_F();
            }
        }
    }
}
