// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntityChicken extends EntityAnimals
{

    public EntityChicken(World world)
    {
        super(world);
        field_753_a = false;
        field_752_b = 0.0F;
        field_758_c = 0.0F;
        field_755_h = 1.0F;
        field_728_u = "/mob/chicken.png";
        func_371_a(0.3F, 0.4F);
        health = 4;
        field_754_i = field_630_aQ.nextInt(6000) + 6000;
    }

    public void func_425_j()
    {
        super.func_425_j();
        field_756_e = field_752_b;
        field_757_d = field_758_c;
        field_758_c += (double)(onGround ? -1 : 4) * 0.29999999999999999D;
        if(field_758_c < 0.0F)
        {
            field_758_c = 0.0F;
        }
        if(field_758_c > 1.0F)
        {
            field_758_c = 1.0F;
        }
        if(!onGround && field_755_h < 1.0F)
        {
            field_755_h = 1.0F;
        }
        field_755_h *= 0.90000000000000002D;
        if(!onGround && motionY < 0.0D)
        {
            motionY *= 0.59999999999999998D;
        }
        field_752_b += field_755_h * 2.0F;
        if(!field_615_ag.field_1026_y && --field_754_i <= 0)
        {
            field_615_ag.func_623_a(this, "mob.chickenplop", 1.0F, (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F);
            func_367_b(Item.egg.swiftedIndex, 1);
            field_754_i = field_630_aQ.nextInt(6000) + 6000;
        }
    }

    protected void func_400_c(float f)
    {
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
    }

    protected String func_423_c()
    {
        return "mob.chicken";
    }

    protected String func_414_d()
    {
        return "mob.chickenhurt";
    }

    protected String func_428_e()
    {
        return "mob.chickenhurt";
    }

    protected int func_422_g()
    {
        return Item.feather.swiftedIndex;
    }

    public boolean field_753_a;
    public float field_752_b;
    public float field_758_c;
    public float field_757_d;
    public float field_756_e;
    public float field_755_h;
    public int field_754_i;
}
