// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class EntityPig extends EntityAnimals
{

    public EntityPig(World world)
    {
        super(world);
        field_759_a = false;
        field_728_u = "/mob/pig.png";
        func_371_a(0.9F, 0.9F);
        field_759_a = false;
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
        nbttagcompound.func_748_a("Saddle", field_759_a);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
        field_759_a = nbttagcompound.func_760_m("Saddle");
    }

    protected String func_423_c()
    {
        return "mob.pig";
    }

    protected String func_414_d()
    {
        return "mob.pig";
    }

    protected String func_428_e()
    {
        return "mob.pigdeath";
    }

    public boolean func_353_a(EntityPlayer entityplayer)
    {
        if(field_759_a)
        {
            entityplayer.func_386_g(this);
            return true;
        } else
        {
            return false;
        }
    }

    protected int func_422_g()
    {
        return Item.porkRaw.swiftedIndex;
    }

    public boolean field_759_a;
}
