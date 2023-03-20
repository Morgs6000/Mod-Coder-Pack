// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public abstract class EntityAnimals extends EntityCreature
{

    public EntityAnimals(World world)
    {
        super(world);
    }

    protected float func_439_a(int i, int j, int k)
    {
        if(field_615_ag.func_600_a(i, j - 1, k) == Block.grass.blockID)
        {
            return 10F;
        } else
        {
            return field_615_ag.func_598_c(i, j, k) - 0.5F;
        }
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
    }

    public boolean func_433_a()
    {
        int i = MathHelper.func_1108_b(posX);
        int j = MathHelper.func_1108_b(boundingBox.field_1697_b);
        int k = MathHelper.func_1108_b(posZ);
        return field_615_ag.func_600_a(i, j - 1, k) == Block.grass.blockID && field_615_ag.func_618_j(i, j, k) > 8 && super.func_433_a();
    }

    public int func_421_b()
    {
        return 120;
    }
}
