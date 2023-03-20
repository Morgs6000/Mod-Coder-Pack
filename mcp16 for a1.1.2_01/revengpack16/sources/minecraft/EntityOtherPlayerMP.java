// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;

public class EntityOtherPlayerMP extends EntityPlayer
{

    public EntityOtherPlayerMP(World world, String s)
    {
        super(world);
        field_781_a = 0.0F;
        field_771_i = s;
        field_645_aB = 0.0F;
        field_634_aM = 0.0F;
        if(s != null && s.length() > 0)
        {
            field_622_aY = (new StringBuilder()).append("http://www.minecraft.net/skin/").append(s).append(".png").toString();
            System.out.println((new StringBuilder()).append("Loading texture ").append(field_622_aY).toString());
        }
        field_633_aN = true;
        field_619_ac = 10D;
    }

    public boolean func_396_a(Entity entity, int i)
    {
        return true;
    }

    public void func_378_a(double d, double d1, double d2, float f, 
            float f1, int i)
    {
        field_645_aB = 0.0F;
        field_784_bh = d;
        field_783_bi = d1;
        field_782_bj = d2;
        field_780_bk = f;
        field_786_bl = f1;
        field_785_bg = i;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        field_705_Q = field_704_R;
        double d = posX - field_614_ah;
        double d1 = posZ - field_612_aj;
        float f = MathHelper.func_1109_a(d * d + d1 * d1) * 4F;
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        field_704_R += (f - field_704_R) * 0.4F;
        field_703_S += field_704_R;
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public void func_425_j()
    {
        super.func_418_b_();
        if(field_785_bg > 0)
        {
            double d = posX + (field_784_bh - posX) / (double)field_785_bg;
            double d1 = posY + (field_783_bi - posY) / (double)field_785_bg;
            double d2 = posZ + (field_782_bj - posZ) / (double)field_785_bg;
            double d3;
            for(d3 = field_780_bk - (double)rotationYaw; d3 < -180D; d3 += 360D) { }
            for(; d3 >= 180D; d3 -= 360D) { }
            rotationYaw += d3 / (double)field_785_bg;
            rotationPitch += (field_786_bl - (double)rotationPitch) / (double)field_785_bg;
            field_785_bg--;
            func_347_a(d, d1, d2);
            func_376_c(rotationYaw, rotationPitch);
        }
        field_775_e = field_774_f;
        float f = MathHelper.func_1109_a(motionX * motionX + motionZ * motionZ);
        float f1 = (float)Math.atan(-motionY * 0.20000000298023224D) * 15F;
        if(f > 0.1F)
        {
            f = 0.1F;
        }
        if(!onGround || health <= 0)
        {
            f = 0.0F;
        }
        if(onGround || health <= 0)
        {
            f1 = 0.0F;
        }
        field_774_f += (f - field_774_f) * 0.4F;
        field_709_M += (f1 - field_709_M) * 0.8F;
    }

    private int field_785_bg;
    private double field_784_bh;
    private double field_783_bi;
    private double field_782_bj;
    private double field_780_bk;
    private double field_786_bl;
    float field_781_a;
}
