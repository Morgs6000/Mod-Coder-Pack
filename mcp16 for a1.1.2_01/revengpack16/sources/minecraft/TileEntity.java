// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class TileEntity
{

    public TileEntity()
    {
    }

    private static void func_476_a(Class class1, String s)
    {
        if(classToNameMap.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate id: ").append(s).toString());
        } else
        {
            nameToClassMap.put(s, class1);
            classToNameMap.put(class1, s);
            return;
        }
    }

    public void func_482_a(NBTTagCompound nbttagcompound)
    {
        x = nbttagcompound.func_756_e("x");
        y = nbttagcompound.func_756_e("y");
        z = nbttagcompound.func_756_e("z");
    }

    public void func_481_b(NBTTagCompound nbttagcompound)
    {
        String s = (String)classToNameMap.get(getClass());
        if(s == null)
        {
            throw new RuntimeException((new StringBuilder()).append(getClass()).append(" is missing a mapping! This is a bug!").toString());
        } else
        {
            nbttagcompound.func_754_a("id", s);
            nbttagcompound.func_758_a("x", x);
            nbttagcompound.func_758_a("y", y);
            nbttagcompound.func_758_a("z", z);
            return;
        }
    }

    public void func_475_b()
    {
    }

    public static TileEntity func_477_c(NBTTagCompound nbttagcompound)
    {
        TileEntity tileentity = null;
        try
        {
            Class class1 = (Class)nameToClassMap.get(nbttagcompound.func_755_i("id"));
            if(class1 != null)
            {
                tileentity = (TileEntity)class1.newInstance();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(tileentity != null)
        {
            tileentity.func_482_a(nbttagcompound);
        } else
        {
            System.out.println((new StringBuilder()).append("Skipping TileEntity with id ").append(nbttagcompound.func_755_i("id")).toString());
        }
        return tileentity;
    }

    public int func_479_f()
    {
        return world.func_602_e(x, y, z);
    }

    public void func_474_j_()
    {
        world.func_698_b(x, y, z, this);
    }

    public double func_480_a(double d, double d1, double d2)
    {
        double d3 = ((double)x + 0.5D) - d;
        double d4 = ((double)y + 0.5D) - d1;
        double d5 = ((double)z + 0.5D) - d2;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public Block func_478_g()
    {
        return Block.allBlocks[world.func_600_a(x, y, z)];
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    private static Map nameToClassMap = new HashMap();
    private static Map classToNameMap = new HashMap();
    public World world;
    public int x;
    public int y;
    public int z;

    static 
    {
        func_476_a(TileEntityFurnace.class, "Furnace");
        func_476_a(TileEntityChest.class, "Chest");
        func_476_a(TileEntitySign.class, "Sign");
        func_476_a(TileEntityMobSpawner.class, "MobSpawner");
    }
}
