// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class EntityList
{

    public EntityList()
    {
    }

    private static void func_1080_a(Class class1, String s, int i)
    {
        field_1611_a.put(s, class1);
        field_1610_b.put(class1, s);
        field_1613_c.put(Integer.valueOf(i), class1);
        field_1612_d.put(class1, Integer.valueOf(i));
    }

    public static Entity func_1079_a(String s, World world)
    {
        Entity entity = null;
        try
        {
            Class class1 = (Class)field_1611_a.get(s);
            if(class1 != null)
            {
                entity = (Entity)class1.getConstructor(new Class[] {
                    World.class
                }).newInstance(new Object[] {
                    world
                });
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return entity;
    }

    public static Entity func_1081_a(NBTTagCompound nbttagcompound, World world)
    {
        Entity entity = null;
        try
        {
            Class class1 = (Class)field_1611_a.get(nbttagcompound.func_755_i("id"));
            if(class1 != null)
            {
                entity = (Entity)class1.getConstructor(new Class[] {
                    World.class
                }).newInstance(new Object[] {
                    world
                });
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(entity != null)
        {
            entity.func_368_e(nbttagcompound);
        } else
        {
            System.out.println((new StringBuilder()).append("Skipping Entity with id ").append(nbttagcompound.func_755_i("id")).toString());
        }
        return entity;
    }

    public static Entity func_1084_a(int i, World world)
    {
        Entity entity = null;
        try
        {
            Class class1 = (Class)field_1613_c.get(Integer.valueOf(i));
            if(class1 != null)
            {
                entity = (Entity)class1.getConstructor(new Class[] {
                    World.class
                }).newInstance(new Object[] {
                    world
                });
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(entity == null)
        {
            System.out.println((new StringBuilder()).append("Skipping Entity with id ").append(i).toString());
        }
        return entity;
    }

    public static int func_1082_a(Entity entity)
    {
        return ((Integer)field_1612_d.get(entity.getClass())).intValue();
    }

    public static String func_1083_b(Entity entity)
    {
        return (String)field_1610_b.get(entity.getClass());
    }

    private static Map field_1611_a = new HashMap();
    private static Map field_1610_b = new HashMap();
    private static Map field_1613_c = new HashMap();
    private static Map field_1612_d = new HashMap();

    static 
    {
        func_1080_a(EntityArrow.class, "Arrow", 10);
        func_1080_a(EntitySnowball.class, "Snowball", 11);
        func_1080_a(EntityItem.class, "Item", 1);
        func_1080_a(EntityPainting.class, "Painting", 9);
        func_1080_a(EntityLiving.class, "Mob", 48);
        func_1080_a(EntityMobs.class, "Monster", 49);
        func_1080_a(EntityCreeper.class, "Creeper", 50);
        func_1080_a(EntitySkeleton.class, "Skeleton", 51);
        func_1080_a(EntitySpider.class, "Spider", 52);
        func_1080_a(EntityZombieSimple.class, "Giant", 53);
        func_1080_a(EntityZombie.class, "Zombie", 54);
        func_1080_a(EntitySlime.class, "Slime", 55);
        func_1080_a(EntityPig.class, "Pig", 90);
        func_1080_a(EntitySheep.class, "Sheep", 91);
        func_1080_a(EntityCow.class, "Cow", 91);
        func_1080_a(EntityChicken.class, "Chicken", 91);
        func_1080_a(EntityTNTPrimed.class, "PrimedTnt", 20);
        func_1080_a(EntityFallingSand.class, "FallingSand", 21);
        func_1080_a(EntityMinecart.class, "Minecart", 40);
        func_1080_a(EntityBoat.class, "Boat", 41);
    }
}
