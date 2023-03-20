// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.net.*;
import java.util.Random;
//import net.minecraft.client.Minecraft;

public class NetClientHandler extends NetHandler
{

    public NetClientHandler(Minecraft minecraft, String s, int i) throws UnknownHostException, IOException
    {
        field_1214_c = false;
        field_1210_g = false;
        field_1208_b = new Random();
        field_1212_e = minecraft;
        Socket socket = new Socket(InetAddress.getByName(s), i);
        field_1213_d = new NetworkManager(socket, "Client", this);
    }

    public void func_848_a()
    {
        if(field_1214_c)
        {
            return;
        } else
        {
            field_1213_d.func_967_a();
            return;
        }
    }

    public void func_840_a(Packet1Login packet1login)
    {
        field_1212_e.field_183_b = new PlayerControllerMP(field_1212_e, this);
        field_1211_f = new WorldClient(this);
        field_1211_f.field_1026_y = true;
        field_1212_e.func_134_a(field_1211_f);
        field_1212_e.func_128_a(new GuiDownloadTerrain(this));
    }

    public void func_832_a(Packet21PickupSpawn packet21pickupspawn)
    {
        double d = (double)packet21pickupspawn.field_530_b / 32D;
        double d1 = (double)packet21pickupspawn.field_529_c / 32D;
        double d2 = (double)packet21pickupspawn.field_528_d / 32D;
        EntityItem entityitem = new EntityItem(field_1211_f, d, d1, d2, new ItemStack(packet21pickupspawn.field_524_h, packet21pickupspawn.field_523_i));
        entityitem.motionX = (double)packet21pickupspawn.field_527_e / 128D;
        entityitem.motionY = (double)packet21pickupspawn.field_526_f / 128D;
        entityitem.motionZ = (double)packet21pickupspawn.field_525_g / 128D;
        entityitem.field_652_bd = packet21pickupspawn.field_530_b;
        entityitem.field_650_be = packet21pickupspawn.field_529_c;
        entityitem.field_648_bf = packet21pickupspawn.field_528_d;
        field_1211_f.func_712_a(packet21pickupspawn.field_531_a, entityitem);
    }

    public void func_835_a(Packet23VehicleSpawn packet23vehiclespawn)
    {
        double d = (double)packet23vehiclespawn.field_499_b / 32D;
        double d1 = (double)packet23vehiclespawn.field_503_c / 32D;
        double d2 = (double)packet23vehiclespawn.field_502_d / 32D;
        Entity obj = null;
        if(packet23vehiclespawn.field_501_e == 10)
        {
            obj = new EntityMinecart(field_1211_f, d, d1, d2, 0);
        }
        if(packet23vehiclespawn.field_501_e == 11)
        {
            obj = new EntityMinecart(field_1211_f, d, d1, d2, 1);
        }
        if(packet23vehiclespawn.field_501_e == 12)
        {
            obj = new EntityMinecart(field_1211_f, d, d1, d2, 2);
        }
        if(packet23vehiclespawn.field_501_e == 1)
        {
            obj = new EntityBoat(field_1211_f, d, d1, d2);
        }
        if(obj != null)
        {
            obj.field_652_bd = packet23vehiclespawn.field_499_b;
            obj.field_650_be = packet23vehiclespawn.field_503_c;
            obj.field_648_bf = packet23vehiclespawn.field_502_d;
            obj.rotationYaw = 0.0F;
            obj.rotationPitch = 0.0F;
            obj.field_620_ab = packet23vehiclespawn.field_500_a;
            field_1211_f.func_712_a(packet23vehiclespawn.field_500_a, ((Entity) (obj)));
        }
    }

    public void func_820_a(Packet20NamedEntitySpawn packet20namedentityspawn)
    {
        double d = (double)packet20namedentityspawn.field_540_c / 32D;
        double d1 = (double)packet20namedentityspawn.field_539_d / 32D;
        double d2 = (double)packet20namedentityspawn.field_538_e / 32D;
        float f = (float)(packet20namedentityspawn.field_537_f * 360) / 256F;
        float f1 = (float)(packet20namedentityspawn.field_536_g * 360) / 256F;
        EntityOtherPlayerMP entityotherplayermp = new EntityOtherPlayerMP(field_1212_e.field_180_e, packet20namedentityspawn.field_533_b);
        entityotherplayermp.field_652_bd = packet20namedentityspawn.field_540_c;
        entityotherplayermp.field_650_be = packet20namedentityspawn.field_539_d;
        entityotherplayermp.field_648_bf = packet20namedentityspawn.field_538_e;
        int i = packet20namedentityspawn.field_535_h;
        if(i == 0)
        {
            entityotherplayermp.field_778_b.mainInventory[entityotherplayermp.field_778_b.currentItem] = null;
        } else
        {
            entityotherplayermp.field_778_b.mainInventory[entityotherplayermp.field_778_b.currentItem] = new ItemStack(i);
        }
        entityotherplayermp.func_399_b(d, d1, d2, f, f1);
        field_1211_f.func_712_a(packet20namedentityspawn.field_534_a, entityotherplayermp);
    }

    public void func_829_a(Packet34EntityTeleport packet34entityteleport)
    {
        Entity entity = field_1211_f.func_709_b(packet34entityteleport.field_509_a);
        if(entity == null)
        {
            return;
        } else
        {
            entity.field_652_bd = packet34entityteleport.field_508_b;
            entity.field_650_be = packet34entityteleport.field_513_c;
            entity.field_648_bf = packet34entityteleport.field_512_d;
            double d = (double)entity.field_652_bd / 32D;
            double d1 = (double)entity.field_650_be / 32D;
            double d2 = (double)entity.field_648_bf / 32D;
            float f = (float)(packet34entityteleport.field_511_e * 360) / 256F;
            float f1 = (float)(packet34entityteleport.field_510_f * 360) / 256F;
            entity.func_378_a(d, d1, d2, f, f1, 3);
            return;
        }
    }

    public void func_827_a(Packet30Entity packet30entity)
    {
        Entity entity = field_1211_f.func_709_b(packet30entity.field_485_a);
        if(entity == null)
        {
            return;
        } else
        {
            entity.field_652_bd += packet30entity.field_484_b;
            entity.field_650_be += packet30entity.field_490_c;
            entity.field_648_bf += packet30entity.field_489_d;
            double d = (double)entity.field_652_bd / 32D;
            double d1 = (double)entity.field_650_be / 32D;
            double d2 = (double)entity.field_648_bf / 32D;
            float f = packet30entity.field_486_g ? (float)(packet30entity.field_488_e * 360) / 256F : entity.rotationYaw;
            float f1 = packet30entity.field_486_g ? (float)(packet30entity.field_487_f * 360) / 256F : entity.rotationPitch;
            entity.func_378_a(d, d1, d2, f, f1, 3);
            return;
        }
    }

    public void func_839_a(Packet29DestroyEntity packet29destroyentity)
    {
        field_1211_f.func_710_c(packet29destroyentity.field_507_a);
    }

    public void func_837_a(Packet10Flying packet10flying)
    {
        EntityPlayerSP entityplayersp = field_1212_e.field_178_g;
        double d = ((EntityPlayer) (entityplayersp)).posX;
        double d1 = ((EntityPlayer) (entityplayersp)).posY;
        double d2 = ((EntityPlayer) (entityplayersp)).posZ;
        float f = ((EntityPlayer) (entityplayersp)).rotationYaw;
        float f1 = ((EntityPlayer) (entityplayersp)).rotationPitch;
        if(packet10flying.field_554_h)
        {
            d = packet10flying.field_561_a;
            d1 = packet10flying.field_560_b;
            d2 = packet10flying.field_559_c;
        }
        if(packet10flying.field_553_i)
        {
            f = packet10flying.field_557_e;
            f1 = packet10flying.field_556_f;
        }
        entityplayersp.field_635_aL = 0.0F;
        entityplayersp.motionX = entityplayersp.motionY = entityplayersp.motionZ = 0.0D;
        entityplayersp.func_399_b(d, d1, d2, f, f1);
        packet10flying.field_561_a = ((EntityPlayer) (entityplayersp)).posX;
        packet10flying.field_560_b = ((EntityPlayer) (entityplayersp)).boundingBox.field_1697_b;
        packet10flying.field_559_c = ((EntityPlayer) (entityplayersp)).posZ;
        packet10flying.field_558_d = ((EntityPlayer) (entityplayersp)).posY;
        field_1213_d.func_972_a(packet10flying);
        if(!field_1210_g)
        {
            field_1212_e.field_178_g.field_614_ah = field_1212_e.field_178_g.posX;
            field_1212_e.field_178_g.field_613_ai = field_1212_e.field_178_g.posY;
            field_1212_e.field_178_g.field_612_aj = field_1212_e.field_178_g.posZ;
            field_1210_g = true;
            field_1212_e.func_128_a(null);
        }
    }

    public void func_826_a(Packet50PreChunk packet50prechunk)
    {
        field_1211_f.func_713_a(packet50prechunk.field_505_a, packet50prechunk.field_504_b, packet50prechunk.field_506_c);
    }

    public void func_824_a(Packet52MultiBlockChange packet52multiblockchange)
    {
        Chunk chunk = field_1211_f.func_704_b(packet52multiblockchange.field_479_a, packet52multiblockchange.field_478_b);
        int i = packet52multiblockchange.field_479_a * 16;
        int j = packet52multiblockchange.field_478_b * 16;
        for(int k = 0; k < packet52multiblockchange.field_480_f; k++)
        {
            short word0 = packet52multiblockchange.field_483_c[k];
            int l = packet52multiblockchange.field_482_d[k] & 0xff;
            byte byte0 = packet52multiblockchange.field_481_e[k];
            int i1 = word0 >> 12 & 0xf;
            int j1 = word0 >> 8 & 0xf;
            int k1 = word0 & 0xff;
            chunk.func_1010_a(i1, k1, j1, l, byte0);
            field_1211_f.func_711_c(i1 + i, k1, j1 + j, i1 + i, k1, j1 + j);
            field_1211_f.func_701_b(i1 + i, k1, j1 + j, i1 + i, k1, j1 + j);
        }

    }

    public void func_833_a(Packet51MapChunk packet51mapchunk)
    {
        field_1211_f.func_711_c(packet51mapchunk.field_573_a, packet51mapchunk.field_572_b, packet51mapchunk.field_579_c, (packet51mapchunk.field_573_a + packet51mapchunk.field_578_d) - 1, (packet51mapchunk.field_572_b + packet51mapchunk.field_577_e) - 1, (packet51mapchunk.field_579_c + packet51mapchunk.field_576_f) - 1);
        field_1211_f.func_693_a(packet51mapchunk.field_573_a, packet51mapchunk.field_572_b, packet51mapchunk.field_579_c, packet51mapchunk.field_578_d, packet51mapchunk.field_577_e, packet51mapchunk.field_576_f, packet51mapchunk.field_575_g);
    }

    public void func_822_a(Packet53BlockChange packet53blockchange)
    {
        field_1211_f.func_714_c(packet53blockchange.X, packet53blockchange.Y, packet53blockchange.Z, packet53blockchange.ID, packet53blockchange.Metadata);
    }

    public void func_844_a(Packet255KickDisconnect packet255kickdisconnect)
    {
        field_1213_d.func_974_a("Got kicked");
        field_1214_c = true;
        field_1212_e.func_134_a(null);
        field_1212_e.func_128_a(new GuiConnectFailed("Disconnected by server", packet255kickdisconnect.field_582_a));
    }

    public void func_823_a(String s)
    {
        if(field_1214_c)
        {
            return;
        } else
        {
            field_1214_c = true;
            field_1212_e.func_134_a(null);
            field_1212_e.func_128_a(new GuiConnectFailed("Connection lost", s));
            return;
        }
    }

    public void func_847_a(Packet packet)
    {
        if(field_1214_c)
        {
            return;
        } else
        {
            field_1213_d.func_972_a(packet);
            return;
        }
    }

    public void func_834_a(Packet22Collect packet22collect)
    {
        EntityItem entityitem = (EntityItem)field_1211_f.func_709_b(packet22collect.field_581_a);
        Object obj = (EntityLiving)field_1211_f.func_709_b(packet22collect.field_580_b);
        if(obj == null)
        {
            obj = field_1212_e.field_178_g;
        }
        if(entityitem != null)
        {
            field_1211_f.func_623_a(entityitem, "random.pop", 0.2F, ((field_1208_b.nextFloat() - field_1208_b.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            field_1212_e.field_177_h.func_1192_a(new EntityPickupFX(field_1212_e.field_180_e, entityitem, ((Entity) (obj)), -0.5F));
            field_1211_f.func_710_c(packet22collect.field_581_a);
        }
    }

    public void func_841_a(Packet16BlockItemSwitch packet16blockitemswitch)
    {
        Entity entity = field_1211_f.func_709_b(packet16blockitemswitch.field_563_a);
        if(entity == null)
        {
            return;
        }
        EntityPlayer entityplayer = (EntityPlayer)entity;
        int i = packet16blockitemswitch.field_562_b;
        if(i == 0)
        {
            entityplayer.field_778_b.mainInventory[entityplayer.field_778_b.currentItem] = null;
        } else
        {
            entityplayer.field_778_b.mainInventory[entityplayer.field_778_b.currentItem] = new ItemStack(i);
        }
    }

    public void func_831_a(Packet3Chat packet3chat)
    {
        field_1212_e.field_164_u.func_552_a(packet3chat.field_517_a);
    }

    public void func_825_a(Packet18ArmAnimation packet18armanimation)
    {
        Entity entity = field_1211_f.func_709_b(packet18armanimation.field_522_a);
        if(entity == null)
        {
            return;
        } else
        {
            EntityPlayer entityplayer = (EntityPlayer)entity;
            entityplayer.func_457_w();
            return;
        }
    }

    public void func_830_a(Packet17AddToInventory packet17addtoinventory)
    {
        field_1212_e.field_178_g.field_778_b.func_504_a(new ItemStack(packet17addtoinventory.field_497_a, packet17addtoinventory.field_496_b, packet17addtoinventory.field_498_c));
    }

    public void func_838_a(Packet2Handshake packet2handshake)
    {
        if(packet2handshake.field_532_a.equals("-"))
        {
            func_847_a(new Packet1Login(field_1212_e.field_176_i.field_1666_b, "Password", 2));
        } else
        {
            try
            {
                URL url = new URL((new StringBuilder()).append("http://www.minecraft.net/game/joinserver.jsp?user=").append(field_1212_e.field_176_i.field_1666_b).append("&sessionId=").append(field_1212_e.field_176_i.field_1669_c).append("&serverId=").append(packet2handshake.field_532_a).toString());
                BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(url.openStream()));
                String s = bufferedreader.readLine();
                bufferedreader.close();
                if(s.equalsIgnoreCase("ok"))
                {
                    func_847_a(new Packet1Login(field_1212_e.field_176_i.field_1666_b, "Password", 2));
                } else
                {
                    field_1213_d.func_974_a((new StringBuilder()).append("Failed to login: ").append(s).toString());
                }
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
                field_1213_d.func_974_a((new StringBuilder()).append("Internal client error: ").append(exception.toString()).toString());
            }
        }
    }

    public void func_849_b()
    {
        field_1214_c = true;
        field_1213_d.func_974_a("Closed");
    }

    public void func_828_a(Packet24MobSpawn packet24mobspawn)
    {
        double d = (double)packet24mobspawn.field_552_c / 32D;
        double d1 = (double)packet24mobspawn.field_551_d / 32D;
        double d2 = (double)packet24mobspawn.field_550_e / 32D;
        float f = (float)(packet24mobspawn.field_549_f * 360) / 256F;
        float f1 = (float)(packet24mobspawn.field_548_g * 360) / 256F;
        EntityLiving entityliving = (EntityLiving)EntityList.func_1084_a(packet24mobspawn.field_546_b, field_1212_e.field_180_e);
        entityliving.field_652_bd = packet24mobspawn.field_552_c;
        entityliving.field_650_be = packet24mobspawn.field_551_d;
        entityliving.field_648_bf = packet24mobspawn.field_550_e;
        entityliving.func_399_b(d, d1, d2, f, f1);
        entityliving.field_720_B = true;
        field_1211_f.func_712_a(packet24mobspawn.field_547_a, entityliving);
    }

    public void func_846_a(Packet4UpdateTime packet4updatetime)
    {
        field_1212_e.field_180_e.func_648_a(packet4updatetime.field_564_a);
    }

    public void func_843_a(Packet5PlayerInventory packet5playerinventory)
    {
        EntityPlayerSP entityplayersp = field_1212_e.field_178_g;
        if(packet5playerinventory.field_571_a == -1)
        {
            ((EntityPlayer) (entityplayersp)).field_778_b.mainInventory = packet5playerinventory.field_570_b;
        }
        if(packet5playerinventory.field_571_a == -2)
        {
            ((EntityPlayer) (entityplayersp)).field_778_b.craftingInventory = packet5playerinventory.field_570_b;
        }
        if(packet5playerinventory.field_571_a == -3)
        {
            ((EntityPlayer) (entityplayersp)).field_778_b.armorInventory = packet5playerinventory.field_570_b;
        }
    }

    public void func_842_a(Packet59ComplexEntity packet59complexentity)
    {
        TileEntity tileentity = field_1211_f.func_603_b(packet59complexentity.field_474_a, packet59complexentity.field_473_b, packet59complexentity.field_477_c);
        if(tileentity != null)
        {
            tileentity.func_482_a(packet59complexentity.field_475_e);
            field_1211_f.func_701_b(packet59complexentity.field_474_a, packet59complexentity.field_473_b, packet59complexentity.field_477_c, packet59complexentity.field_474_a, packet59complexentity.field_473_b, packet59complexentity.field_477_c);
        }
    }

    public void func_845_a(Packet6SpawnPosition packet6spawnposition)
    {
        field_1211_f.spawnX = packet6spawnposition.field_515_a;
        field_1211_f.spawnY = packet6spawnposition.field_514_b;
        field_1211_f.spawnZ = packet6spawnposition.field_516_c;
    }

    private boolean field_1214_c;
    private NetworkManager field_1213_d;
    public String field_1209_a;
    private Minecraft field_1212_e;
    private WorldClient field_1211_f;
    private boolean field_1210_g;
    Random field_1208_b;
}
