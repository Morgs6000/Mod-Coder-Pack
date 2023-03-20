// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class TileEntityMobSpawner extends TileEntity
{

    public TileEntityMobSpawner()
    {
        delay = -1;
        field_830_d = 0.0D;
        entityID = "Pig";
        delay = 20;
    }

    public boolean func_484_a()
    {
        return world.func_683_a((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, 16D) != null;
    }

    public void func_475_b()
    {
        field_830_d = field_831_c;
        if(!func_484_a())
        {
            return;
        }
        double d = (float)x + world.field_1037_n.nextFloat();
        double d2 = (float)y + world.field_1037_n.nextFloat();
        double d4 = (float)z + world.field_1037_n.nextFloat();
        world.func_694_a("smoke", d, d2, d4, 0.0D, 0.0D, 0.0D);
        world.func_694_a("flame", d, d2, d4, 0.0D, 0.0D, 0.0D);
        for(field_831_c += 1000F / ((float)delay + 200F); field_831_c > 360D;)
        {
            field_831_c -= 360D;
            field_830_d -= 360D;
        }

        if(delay == -1)
        {
            func_483_c();
        }
        if(delay > 0)
        {
            delay--;
            return;
        }
        byte byte0 = 4;
        for(int i = 0; i < byte0; i++)
        {
            EntityLiving entityliving = (EntityLiving)EntityList.func_1079_a(entityID, world);
            if(entityliving == null)
            {
                return;
            }
            int j = world.func_657_a(entityliving.getClass(), AxisAlignedBB.func_1161_b(x, y, z, x + 1, y + 1, z + 1).func_1177_b(8D, 4D, 8D)).size();
            if(j >= 6)
            {
                func_483_c();
                return;
            }
            if(entityliving == null)
            {
                continue;
            }
            double d6 = (double)x + (world.field_1037_n.nextDouble() - world.field_1037_n.nextDouble()) * 4D;
            double d7 = (y + world.field_1037_n.nextInt(3)) - 1;
            double d8 = (double)z + (world.field_1037_n.nextDouble() - world.field_1037_n.nextDouble()) * 4D;
            entityliving.func_365_c(d6, d7, d8, world.field_1037_n.nextFloat() * 360F, 0.0F);
            if(!entityliving.func_433_a())
            {
                continue;
            }
            world.func_674_a(entityliving);
            for(int k = 0; k < 20; k++)
            {
                double d1 = (double)x + 0.5D + ((double)world.field_1037_n.nextFloat() - 0.5D) * 2D;
                double d3 = (double)y + 0.5D + ((double)world.field_1037_n.nextFloat() - 0.5D) * 2D;
                double d5 = (double)z + 0.5D + ((double)world.field_1037_n.nextFloat() - 0.5D) * 2D;
                world.func_694_a("smoke", d1, d3, d5, 0.0D, 0.0D, 0.0D);
                world.func_694_a("flame", d1, d3, d5, 0.0D, 0.0D, 0.0D);
            }

            entityliving.func_415_z();
            func_483_c();
        }

        super.func_475_b();
    }

    private void func_483_c()
    {
        delay = 200 + world.field_1037_n.nextInt(600);
    }

    public void func_482_a(NBTTagCompound nbttagcompound)
    {
        super.func_482_a(nbttagcompound);
        entityID = nbttagcompound.func_755_i("EntityId");
        delay = nbttagcompound.func_745_d("Delay");
    }

    public void func_481_b(NBTTagCompound nbttagcompound)
    {
        super.func_481_b(nbttagcompound);
        nbttagcompound.func_754_a("EntityId", entityID);
        nbttagcompound.func_749_a("Delay", (short)delay);
    }

    public int delay;
    public String entityID;
    public double field_831_c;
    public double field_830_d;
}
