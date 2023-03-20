// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.util.Random;

public class Item
{

    protected Item(int i)
    {
        maxStackSize = 64;
        maxDmg = 32;
        bFull3D = false;
        swiftedIndex = 256 + i;
        if(itemsList[256 + i] != null)
        {
            System.out.println((new StringBuilder()).append("CONFLICT @ ").append(i).toString());
        }
        itemsList[256 + i] = this;
    }

    public Item func_205_a(int i)
    {
        iconIndex = i;
        return this;
    }

    public int func_196_a(ItemStack itemstack)
    {
        return iconIndex;
    }

    public boolean func_192_a(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        return false;
    }

    public float func_204_a(ItemStack itemstack, Block block)
    {
        return 1.0F;
    }

    public ItemStack func_193_a(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        return itemstack;
    }

    public int func_200_b()
    {
        return maxStackSize;
    }

    public int func_197_c()
    {
        return maxDmg;
    }

    public void func_202_a(ItemStack itemstack, EntityLiving entityliving)
    {
    }

    public void func_203_a(ItemStack itemstack, int i, int j, int k, int l)
    {
    }

    public int func_198_a(Entity entity)
    {
        return 1;
    }

    public boolean func_195_a(Block block)
    {
        return false;
    }

    public void func_201_b(ItemStack itemstack, EntityLiving entityliving)
    {
    }

    public Item func_199_d()
    {
        bFull3D = true;
        return this;
    }

    public boolean func_194_a()
    {
        return bFull3D;
    }

    protected static Random rand = new Random();
    public static Item itemsList[] = new Item[32000];
    public static Item shovel = (new ItemSpade(0, 2)).func_205_a(82);
    public static Item pickaxeSteel = (new ItemPickaxe(1, 2)).func_205_a(98);
    public static Item axeSteel = (new ItemAxe(2, 2)).func_205_a(114);
    public static Item striker = (new ItemFlintAndSteel(3)).func_205_a(5);
    public static Item appleRed = (new ItemFood(4, 4)).func_205_a(10);
    public static Item bow = (new ItemBow(5)).func_205_a(21);
    public static Item arrow = (new Item(6)).func_205_a(37);
    public static Item coal = (new Item(7)).func_205_a(7);
    public static Item diamond = (new Item(8)).func_205_a(55);
    public static Item ingotIron = (new Item(9)).func_205_a(23);
    public static Item ingotGold = (new Item(10)).func_205_a(39);
    public static Item swordSteel = (new ItemSword(11, 2)).func_205_a(66);
    public static Item swordWood = (new ItemSword(12, 0)).func_205_a(64);
    public static Item shovelWood = (new ItemSpade(13, 0)).func_205_a(80);
    public static Item pickaxeWood = (new ItemPickaxe(14, 0)).func_205_a(96);
    public static Item axeWood = (new ItemAxe(15, 0)).func_205_a(112);
    public static Item swordStone = (new ItemSword(16, 1)).func_205_a(65);
    public static Item shovelStone = (new ItemSpade(17, 1)).func_205_a(81);
    public static Item pickaxeStone = (new ItemPickaxe(18, 1)).func_205_a(97);
    public static Item axeStone = (new ItemAxe(19, 1)).func_205_a(113);
    public static Item swordDiamond = (new ItemSword(20, 3)).func_205_a(67);
    public static Item shovelDiamond = (new ItemSpade(21, 3)).func_205_a(83);
    public static Item pickaxeDiamond = (new ItemPickaxe(22, 3)).func_205_a(99);
    public static Item axeDiamond = (new ItemAxe(23, 3)).func_205_a(115);
    public static Item stick = (new Item(24)).func_205_a(53).func_199_d();
    public static Item bowlEmpty = (new Item(25)).func_205_a(71);
    public static Item bowlSoup = (new ItemSoup(26, 10)).func_205_a(72);
    public static Item swordGold = (new ItemSword(27, 0)).func_205_a(68);
    public static Item shovelGold = (new ItemSpade(28, 0)).func_205_a(84);
    public static Item pickaxeGold = (new ItemPickaxe(29, 0)).func_205_a(100);
    public static Item axeGold = (new ItemAxe(30, 0)).func_205_a(116);
    public static Item silk = (new Item(31)).func_205_a(8);
    public static Item feather = (new Item(32)).func_205_a(24);
    public static Item gunpowder = (new Item(33)).func_205_a(40);
    public static Item hoeWood = (new ItemHoe(34, 0)).func_205_a(128);
    public static Item hoeStone = (new ItemHoe(35, 1)).func_205_a(129);
    public static Item hoeSteel = (new ItemHoe(36, 2)).func_205_a(130);
    public static Item hoeDiamond = (new ItemHoe(37, 3)).func_205_a(131);
    public static Item hoeGold = (new ItemHoe(38, 1)).func_205_a(132);
    public static Item seeds;
    public static Item wheat = (new Item(40)).func_205_a(25);
    public static Item bread = (new ItemFood(41, 5)).func_205_a(41);
    public static Item helmetLeather = (new ItemArmor(42, 0, 0, 0)).func_205_a(0);
    public static Item plateLeather = (new ItemArmor(43, 0, 0, 1)).func_205_a(16);
    public static Item legsLeather = (new ItemArmor(44, 0, 0, 2)).func_205_a(32);
    public static Item bootsLeather = (new ItemArmor(45, 0, 0, 3)).func_205_a(48);
    public static Item helmetChain = (new ItemArmor(46, 1, 1, 0)).func_205_a(1);
    public static Item plateChain = (new ItemArmor(47, 1, 1, 1)).func_205_a(17);
    public static Item legsChain = (new ItemArmor(48, 1, 1, 2)).func_205_a(33);
    public static Item bootsChain = (new ItemArmor(49, 1, 1, 3)).func_205_a(49);
    public static Item helmetSteel = (new ItemArmor(50, 2, 2, 0)).func_205_a(2);
    public static Item plateSteel = (new ItemArmor(51, 2, 2, 1)).func_205_a(18);
    public static Item legsSteel = (new ItemArmor(52, 2, 2, 2)).func_205_a(34);
    public static Item bootsSteel = (new ItemArmor(53, 2, 2, 3)).func_205_a(50);
    public static Item helmetDiamond = (new ItemArmor(54, 3, 3, 0)).func_205_a(3);
    public static Item plateDiamond = (new ItemArmor(55, 3, 3, 1)).func_205_a(19);
    public static Item legsDiamond = (new ItemArmor(56, 3, 3, 2)).func_205_a(35);
    public static Item bootsDiamond = (new ItemArmor(57, 3, 3, 3)).func_205_a(51);
    public static Item helmetGold = (new ItemArmor(58, 1, 4, 0)).func_205_a(4);
    public static Item plateGold = (new ItemArmor(59, 1, 4, 1)).func_205_a(20);
    public static Item legsGold = (new ItemArmor(60, 1, 4, 2)).func_205_a(36);
    public static Item bootsGold = (new ItemArmor(61, 1, 4, 3)).func_205_a(52);
    public static Item flint = (new Item(62)).func_205_a(6);
    public static Item porkRaw = (new ItemFood(63, 3)).func_205_a(87);
    public static Item porkCooked = (new ItemFood(64, 8)).func_205_a(88);
    public static Item painting = (new ItemPainting(65)).func_205_a(26);
    public static Item appleGold = (new ItemFood(66, 42)).func_205_a(11);
    public static Item sign = (new ItemSign(67)).func_205_a(42);
    public static Item doorWood;
    public static Item bucketEmpty = (new ItemBucket(69, 0)).func_205_a(74);
    public static Item bucketWater;
    public static Item bucketLava;
    public static Item minecartEmpty = (new ItemMinecart(72, 0)).func_205_a(135);
    public static Item saddle = (new ItemSaddle(73)).func_205_a(104);
    public static Item doorSteel;
    public static Item redstone = (new ItemRedstone(75)).func_205_a(56);
    public static Item snowball = (new ItemSnowball(76)).func_205_a(14);
    public static Item boat = (new ItemBoat(77)).func_205_a(136);
    public static Item leather = (new Item(78)).func_205_a(103);
    public static Item bucketMilk = (new ItemBucket(79, -1)).func_205_a(77);
    public static Item brick = (new Item(80)).func_205_a(22);
    public static Item clay = (new Item(81)).func_205_a(57);
    public static Item reed;
    public static Item paper = (new Item(83)).func_205_a(58);
    public static Item book = (new Item(84)).func_205_a(59);
    public static Item slimeBall = (new Item(85)).func_205_a(30);
    public static Item minecartBox = (new ItemMinecart(86, 1)).func_205_a(151);
    public static Item minecartEngine = (new ItemMinecart(87, 2)).func_205_a(167);
    public static Item egg = (new Item(88)).func_205_a(12);
    public static Item compass = (new Item(89)).func_205_a(54);
    public static Item fishingRod = (new Item(90)).func_205_a(69);
    public static Item record13 = (new ItemRecord(2000, "13")).func_205_a(240);
    public static Item recordCat = (new ItemRecord(2001, "cat")).func_205_a(241);
    public final int swiftedIndex;
    protected int maxStackSize;
    protected int maxDmg;
    protected int iconIndex;
    protected boolean bFull3D;

    static 
    {
        seeds = (new ItemSeeds(39, Block.crops.blockID)).func_205_a(9);
        doorWood = (new ItemDoor(68, Material.wood)).func_205_a(43);
        bucketWater = (new ItemBucket(70, Block.waterStill.blockID)).func_205_a(75);
        bucketLava = (new ItemBucket(71, Block.lavaStill.blockID)).func_205_a(76);
        doorSteel = (new ItemDoor(74, Material.iron)).func_205_a(44);
        reed = (new ItemReed(82, Block.reed)).func_205_a(27);
    }
}
