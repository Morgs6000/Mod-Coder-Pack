// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public abstract class Packet
{

    public Packet()
    {
        field_472_j = false;
    }

    static void func_321_a(int i, Class class1)
    {
        if(packetIdToClassMap.containsKey(Integer.valueOf(i)))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet id:").append(i).toString());
        }
        if(packetClassToIdMap.containsKey(class1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet class:").append(class1).toString());
        } else
        {
            packetIdToClassMap.put(Integer.valueOf(i), class1);
            packetClassToIdMap.put(class1, Integer.valueOf(i));
            return;
        }
    }

    public static Packet func_325_a(int i)
    {
        try
        {
            Class class1 = (Class)packetIdToClassMap.get(Integer.valueOf(i));
            if(class1 == null)
            {
                return null;
            } else
            {
                return (Packet)class1.newInstance();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        System.out.println((new StringBuilder()).append("Skipping packet with id ").append(i).toString());
        return null;
    }

    public final int func_326_b()
    {
        return ((Integer)packetClassToIdMap.get(getClass())).intValue();
    }

    public static Packet func_324_b(DataInputStream datainputstream) throws IOException
    {
        int i = datainputstream.read();
        if(i == -1)
        {
            return null;
        }
        Packet packet = func_325_a(i);
        if(packet == null)
        {
            throw new IOException((new StringBuilder()).append("Bad packet id ").append(i).toString());
        } else
        {
            packet.func_327_a(datainputstream);
            return packet;
        }
    }

    public static void func_328_a(Packet packet, DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.write(packet.func_326_b());
        packet.func_322_a(dataoutputstream);
    }

    public abstract void func_327_a(DataInputStream datainputstream) throws IOException;

    public abstract void func_322_a(DataOutputStream dataoutputstream) throws IOException;

    public abstract void func_323_a(NetHandler nethandler);

    public abstract int func_329_a();

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

    private static Map packetIdToClassMap = new HashMap();
    private static Map packetClassToIdMap = new HashMap();
    public boolean field_472_j;

    static 
    {
        func_321_a(0, Packet0KeepAlive.class);
        func_321_a(1, Packet1Login.class);
        func_321_a(2, Packet2Handshake.class);
        func_321_a(3, Packet3Chat.class);
        func_321_a(4, Packet4UpdateTime.class);
        func_321_a(5, Packet5PlayerInventory.class);
        func_321_a(6, Packet6SpawnPosition.class);
        func_321_a(10, Packet10Flying.class);
        func_321_a(11, Packet11PlayerPosition.class);
        func_321_a(12, Packet12PlayerLook.class);
        func_321_a(13, Packet13PlayerLookMove.class);
        func_321_a(14, Packet14BlockDig.class);
        func_321_a(15, Packet15Place.class);
        func_321_a(16, Packet16BlockItemSwitch.class);
        func_321_a(17, Packet17AddToInventory.class);
        func_321_a(18, Packet18ArmAnimation.class);
        func_321_a(20, Packet20NamedEntitySpawn.class);
        func_321_a(21, Packet21PickupSpawn.class);
        func_321_a(22, Packet22Collect.class);
        func_321_a(23, Packet23VehicleSpawn.class);
        func_321_a(24, Packet24MobSpawn.class);
        func_321_a(29, Packet29DestroyEntity.class);
        func_321_a(30, Packet30Entity.class);
        func_321_a(31, Packet31RelEntityMove.class);
        func_321_a(32, Packet32EntityLook.class);
        func_321_a(33, Packet33RelEntityMoveLook.class);
        func_321_a(34, Packet34EntityTeleport.class);
        func_321_a(50, Packet50PreChunk.class);
        func_321_a(51, Packet51MapChunk.class);
        func_321_a(52, Packet52MultiBlockChange.class);
        func_321_a(53, Packet53BlockChange.class);
        func_321_a(59, Packet59ComplexEntity.class);
        func_321_a(255, Packet255KickDisconnect.class);
    }
}
