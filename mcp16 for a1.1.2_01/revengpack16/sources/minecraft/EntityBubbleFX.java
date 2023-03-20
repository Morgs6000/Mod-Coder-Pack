// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntityBubbleFX extends EntityFX
{

    public EntityBubbleFX(World world, double d, double d1, double d2, 
            double d3, double d4, double d5)
    {
        super(world, d, d1, d2, d3, d4, d5);
        field_663_i = 1.0F;
        field_662_j = 1.0F;
        field_661_k = 1.0F;
        field_670_b = 32;
        func_371_a(0.02F, 0.02F);
        field_665_g = field_665_g * (field_630_aQ.nextFloat() * 0.6F + 0.2F);
        motionX = d3 * 0.20000000298023224D + (double)((float)(Math.random() * 2D - 1.0D) * 0.02F);
        motionY = d4 * 0.20000000298023224D + (double)((float)(Math.random() * 2D - 1.0D) * 0.02F);
        motionZ = d5 * 0.20000000298023224D + (double)((float)(Math.random() * 2D - 1.0D) * 0.02F);
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
    }

    public void func_370_e_()
    {
        field_614_ah = posX;
        field_613_ai = posY;
        field_612_aj = posZ;
        motionY += 0.002D;
        func_349_c(motionX, motionY, motionZ);
        motionX *= 0.85000002384185791D;
        motionY *= 0.85000002384185791D;
        motionZ *= 0.85000002384185791D;
        if(field_615_ag.func_599_f(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(posY), MathHelper.func_1108_b(posZ)) != Material.water)
        {
            func_395_F();
        }
        if(field_666_f-- <= 0)
        {
            func_395_F();
        }
    }
}
