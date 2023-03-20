// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.Random;

public class Block
{

    protected Block(int i, Material material1)
    {
        stepSound = soundPowderFootstep;
        field_357_bm = 1.0F;
        field_355_bo = 0.6F;
        if(allBlocks[i] != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Slot ").append(i).append(" is already occupied by ").append(allBlocks[i]).append(" when adding ").append(this).toString());
        } else
        {
            material = material1;
            allBlocks[i] = this;
            blockID = i;
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            field_343_p[i] = func_217_b();
            field_341_r[i] = func_217_b() ? 255 : 0;
            field_340_s[i] = func_212_i();
            field_342_q[i] = false;
            return;
        }
    }

    protected Block(int i, int j, Material material1)
    {
        this(i, material1);
        field_378_bb = j;
    }

    protected Block func_248_a(StepSound stepsound)
    {
        stepSound = stepsound;
        return this;
    }

    protected Block func_256_d(int i)
    {
        field_341_r[blockID] = i;
        return this;
    }

    protected Block func_215_a(float f)
    {
        field_339_t[blockID] = (int)(15F * f);
        return this;
    }

    protected Block func_219_b(float f)
    {
        hardness = f * 3F;
        return this;
    }

    private boolean func_212_i()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return true;
    }

    public int func_210_f()
    {
        return 0;
    }

    protected Block func_222_c(float f)
    {
        field_374_bd = f;
        if(hardness < f * 5F)
        {
            hardness = f * 5F;
        }
        return this;
    }

    protected void func_253_b(boolean flag)
    {
        field_344_o[blockID] = flag;
    }

    public void func_213_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
        field_370_bf = f;
        field_368_bg = f1;
        field_366_bh = f2;
        field_364_bi = f3;
        field_362_bj = f4;
        field_360_bk = f5;
    }

    public float func_241_c(IBlockAccess iblockaccess, int i, int j, int k)
    {
        return iblockaccess.func_598_c(i, j, k);
    }

    public boolean func_260_c(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        if(l == 0 && field_368_bg > 0.0D)
        {
            return true;
        }
        if(l == 1 && field_362_bj < 1.0D)
        {
            return true;
        }
        if(l == 2 && field_366_bh > 0.0D)
        {
            return true;
        }
        if(l == 3 && field_360_bk < 1.0D)
        {
            return true;
        }
        if(l == 4 && field_370_bf > 0.0D)
        {
            return true;
        }
        if(l == 5 && field_364_bi < 1.0D)
        {
            return true;
        } else
        {
            return !iblockaccess.func_601_g(i, j, k);
        }
    }

    public int func_211_a(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return func_232_a(l, iblockaccess.func_602_e(i, j, k));
    }

    public int func_232_a(int i, int j)
    {
        return func_218_a(i);
    }

    public int func_218_a(int i)
    {
        return field_378_bb;
    }

    public AxisAlignedBB func_246_f(World world, int i, int j, int k)
    {
        return AxisAlignedBB.func_1161_b((double)i + field_370_bf, (double)j + field_368_bg, (double)k + field_366_bh, (double)i + field_364_bi, (double)j + field_362_bj, (double)k + field_360_bk);
    }

    public void func_230_a(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, ArrayList arraylist)
    {
        AxisAlignedBB axisalignedbb1 = func_221_d(world, i, j, k);
        if(axisalignedbb1 != null && axisalignedbb.func_1178_a(axisalignedbb1))
        {
            arraylist.add(axisalignedbb1);
        }
    }

    public AxisAlignedBB func_221_d(World world, int i, int j, int k)
    {
        return AxisAlignedBB.func_1161_b((double)i + field_370_bf, (double)j + field_368_bg, (double)k + field_366_bh, (double)i + field_364_bi, (double)j + field_362_bj, (double)k + field_360_bk);
    }

    public boolean func_217_b()
    {
        return true;
    }

    public boolean func_224_a(int i, boolean flag)
    {
        return func_245_h();
    }

    public boolean func_245_h()
    {
        return true;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
    }

    public void func_247_b(World world, int i, int j, int k, Random random)
    {
    }

    public void func_252_b(World world, int i, int j, int k, int l)
    {
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
    }

    public int func_206_a()
    {
        return 10;
    }

    public void func_235_e(World world, int i, int j, int k)
    {
    }

    public void func_214_b(World world, int i, int j, int k)
    {
    }

    public int func_229_a(Random random)
    {
        return 1;
    }

    public int func_240_a(int i, Random random)
    {
        return blockID;
    }

    public float func_225_a(EntityPlayer entityplayer)
    {
        if(field_374_bd < 0.0F)
        {
            return 0.0F;
        }
        if(!entityplayer.func_454_b(this))
        {
            return 1.0F / field_374_bd / 100F;
        } else
        {
            return entityplayer.func_450_a(this) / field_374_bd / 30F;
        }
    }

    public void func_259_b_(World world, int i, int j, int k, int l)
    {
        func_216_a(world, i, j, k, l, 1.0F);
    }

    public void func_216_a(World world, int i, int j, int k, int l, float f)
    {
        if(world.field_1026_y)
        {
            return;
        }
        int i1 = func_229_a(world.field_1037_n);
        for(int j1 = 0; j1 < i1; j1++)
        {
            if(world.field_1037_n.nextFloat() > f)
            {
                continue;
            }
            int k1 = func_240_a(l, world.field_1037_n);
            if(k1 > 0)
            {
                float f1 = 0.7F;
                double d = (double)(world.field_1037_n.nextFloat() * f1) + (double)(1.0F - f1) * 0.5D;
                double d1 = (double)(world.field_1037_n.nextFloat() * f1) + (double)(1.0F - f1) * 0.5D;
                double d2 = (double)(world.field_1037_n.nextFloat() * f1) + (double)(1.0F - f1) * 0.5D;
                EntityItem entityitem = new EntityItem(world, (double)i + d, (double)j + d1, (double)k + d2, new ItemStack(k1));
                entityitem.field_805_c = 10;
                world.func_674_a(entityitem);
            }
        }

    }

    public float func_227_a(Entity entity)
    {
        return hardness / 5F;
    }

    public MovingObjectPosition func_255_a(World world, int i, int j, int k, Vec3D vec3d, Vec3D vec3d1)
    {
        func_238_a(world, i, j, k);
        vec3d = vec3d.func_1257_c(-i, -j, -k);
        vec3d1 = vec3d1.func_1257_c(-i, -j, -k);
        Vec3D vec3d2 = vec3d.func_1247_a(vec3d1, field_370_bf);
        Vec3D vec3d3 = vec3d.func_1247_a(vec3d1, field_364_bi);
        Vec3D vec3d4 = vec3d.func_1250_b(vec3d1, field_368_bg);
        Vec3D vec3d5 = vec3d.func_1250_b(vec3d1, field_362_bj);
        Vec3D vec3d6 = vec3d.func_1256_c(vec3d1, field_366_bh);
        Vec3D vec3d7 = vec3d.func_1256_c(vec3d1, field_360_bk);
        if(!func_244_a(vec3d2))
        {
            vec3d2 = null;
        }
        if(!func_244_a(vec3d3))
        {
            vec3d3 = null;
        }
        if(!func_249_b(vec3d4))
        {
            vec3d4 = null;
        }
        if(!func_249_b(vec3d5))
        {
            vec3d5 = null;
        }
        if(!func_251_c(vec3d6))
        {
            vec3d6 = null;
        }
        if(!func_251_c(vec3d7))
        {
            vec3d7 = null;
        }
        Vec3D vec3d8 = null;
        if(vec3d2 != null && (vec3d8 == null || vec3d.func_1251_c(vec3d2) < vec3d.func_1251_c(vec3d8)))
        {
            vec3d8 = vec3d2;
        }
        if(vec3d3 != null && (vec3d8 == null || vec3d.func_1251_c(vec3d3) < vec3d.func_1251_c(vec3d8)))
        {
            vec3d8 = vec3d3;
        }
        if(vec3d4 != null && (vec3d8 == null || vec3d.func_1251_c(vec3d4) < vec3d.func_1251_c(vec3d8)))
        {
            vec3d8 = vec3d4;
        }
        if(vec3d5 != null && (vec3d8 == null || vec3d.func_1251_c(vec3d5) < vec3d.func_1251_c(vec3d8)))
        {
            vec3d8 = vec3d5;
        }
        if(vec3d6 != null && (vec3d8 == null || vec3d.func_1251_c(vec3d6) < vec3d.func_1251_c(vec3d8)))
        {
            vec3d8 = vec3d6;
        }
        if(vec3d7 != null && (vec3d8 == null || vec3d.func_1251_c(vec3d7) < vec3d.func_1251_c(vec3d8)))
        {
            vec3d8 = vec3d7;
        }
        if(vec3d8 == null)
        {
            return null;
        }
        byte byte0 = -1;
        if(vec3d8 == vec3d2)
        {
            byte0 = 4;
        }
        if(vec3d8 == vec3d3)
        {
            byte0 = 5;
        }
        if(vec3d8 == vec3d4)
        {
            byte0 = 0;
        }
        if(vec3d8 == vec3d5)
        {
            byte0 = 1;
        }
        if(vec3d8 == vec3d6)
        {
            byte0 = 2;
        }
        if(vec3d8 == vec3d7)
        {
            byte0 = 3;
        }
        return new MovingObjectPosition(i, j, k, byte0, vec3d8.func_1257_c(i, j, k));
    }

    private boolean func_244_a(Vec3D vec3d)
    {
        if(vec3d == null)
        {
            return false;
        } else
        {
            return vec3d.field_1775_b >= field_368_bg && vec3d.field_1775_b <= field_362_bj && vec3d.field_1779_c >= field_366_bh && vec3d.field_1779_c <= field_360_bk;
        }
    }

    private boolean func_249_b(Vec3D vec3d)
    {
        if(vec3d == null)
        {
            return false;
        } else
        {
            return vec3d.field_1776_a >= field_370_bf && vec3d.field_1776_a <= field_364_bi && vec3d.field_1779_c >= field_366_bh && vec3d.field_1779_c <= field_360_bk;
        }
    }

    private boolean func_251_c(Vec3D vec3d)
    {
        if(vec3d == null)
        {
            return false;
        } else
        {
            return vec3d.field_1776_a >= field_370_bf && vec3d.field_1776_a <= field_364_bi && vec3d.field_1775_b >= field_368_bg && vec3d.field_1775_b <= field_362_bj;
        }
    }

    public void func_239_c(World world, int i, int j, int k)
    {
    }

    public int func_234_g()
    {
        return 0;
    }

    public boolean func_243_a(World world, int i, int j, int k)
    {
        int l = world.func_600_a(i, j, k);
        return l == 0 || allBlocks[l].material.func_879_d();
    }

    public boolean func_250_a(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        return false;
    }

    public void func_254_a(World world, int i, int j, int k, Entity entity)
    {
    }

    public void func_258_d(World world, int i, int j, int k, int l)
    {
    }

    public void func_233_b(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
    }

    public void func_257_a(World world, int i, int j, int k, Entity entity, Vec3D vec3d)
    {
    }

    public void func_238_a(IBlockAccess iblockaccess, int i, int j, int k)
    {
    }

    public int func_207_d(IBlockAccess iblockaccess, int i, int j, int k)
    {
        return 0xffffff;
    }

    public boolean func_231_b(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return false;
    }

    public boolean func_209_d()
    {
        return false;
    }

    public void func_236_b(World world, int i, int j, int k, Entity entity)
    {
    }

    public boolean func_228_c(World world, int i, int j, int k, int l)
    {
        return false;
    }

    public void func_237_e()
    {
    }

    public void func_220_a_(World world, int i, int j, int k, int l)
    {
        func_259_b_(world, i, j, k, l);
    }

    public boolean func_223_g(World world, int i, int j, int k)
    {
        return true;
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

    public static final StepSound soundPowderFootstep;
    public static final StepSound soundWoodFootstep;
    public static final StepSound soundGravelFootstep;
    public static final StepSound soundGrassFootstep;
    public static final StepSound soundStoneFootstep;
    public static final StepSound soundMetalFootstep;
    public static final StepSound soundGlassFootstep;
    public static final StepSound soundClothFootstep;
    public static final StepSound soundSandFootstep;
    public static final Block allBlocks[];
    public static final boolean field_344_o[] = new boolean[256];
    public static final boolean field_343_p[] = new boolean[256];
    public static final boolean field_342_q[] = new boolean[256];
    public static final int field_341_r[] = new int[256];
    public static final boolean field_340_s[] = new boolean[256];
    public static final int field_339_t[] = new int[256];
    public static final Block stone;
    public static final BlockGrass grass;
    public static final Block dirt;
    public static final Block cobblestone;
    public static final Block planks;
    public static final Block sapling;
    public static final Block bedrock;
    public static final Block waterStill;
    public static final Block waterMoving;
    public static final Block lavaStill;
    public static final Block lavaMoving;
    public static final Block sand;
    public static final Block gravel;
    public static final Block oreGold;
    public static final Block oreIron;
    public static final Block oreCoal;
    public static final Block wood;
    public static final BlockLeaves leaves;
    public static final Block sponge;
    public static final Block glass;
    public static final Block field_381_O = null;
    public static final Block field_379_P = null;
    public static final Block field_377_Q = null;
    public static final Block field_375_R = null;
    public static final Block field_373_S = null;
    public static final Block field_371_T = null;
    public static final Block field_369_U = null;
    public static final Block field_367_V = null;
    public static final Block field_365_W = null;
    public static final Block field_363_X = null;
    public static final Block field_361_Y = null;
    public static final Block field_359_Z = null;
    public static final Block field_421_aa = null;
    public static final Block field_420_ab = null;
    public static final Block cloth;
    public static final Block field_418_ad = null;
    public static final BlockFlower plantYellow;
    public static final BlockFlower plantRed;
    public static final BlockFlower mushroomBrown;
    public static final BlockFlower mushroomRed;
    public static final Block blockGold;
    public static final Block blockSteel;
    public static final Block stairDouble;
    public static final Block stairSingle;
    public static final Block brick;
    public static final Block tnt;
    public static final Block bookShelf;
    public static final Block cobblestoneMossy;
    public static final Block obsidian;
    public static final Block torchWood;
    public static final BlockFire fire;
    public static final Block mobSpawner;
    public static final Block stairCompact_Wood;
    public static final Block crate;
    public static final Block redstoneWire;
    public static final Block oreDiamond;
    public static final Block blockDiamond;
    public static final Block workbench;
    public static final Block crops;
    public static final Block tilledField;
    public static final Block stoneOvenIdle;
    public static final Block stoneOvenActive;
    public static final Block pressurePlateWoodActive;
    public static final Block doorWood;
    public static final Block ladder;
    public static final Block minecartTrack;
    public static final Block stairCompactStone;
    public static final Block pressurePlateWoodIdle;
    public static final Block lever;
    public static final Block pressurePlateStone;
    public static final Block doorSteel;
    public static final Block pressurePlateWood;
    public static final Block oreRedstone;
    public static final Block oreRedstoneGlowing;
    public static final Block torchRedstoneIdle;
    public static final Block torchRedstoneActive;
    public static final Block button;
    public static final Block snow;
    public static final Block ice;
    public static final Block blockSnow;
    public static final Block cactus;
    public static final Block blockClay;
    public static final Block reed;
    public static final Block jukebox;
    public static final Block fence;
    public int field_378_bb;
    public final int blockID;
    protected float field_374_bd;
    protected float hardness;
    public double field_370_bf;
    public double field_368_bg;
    public double field_366_bh;
    public double field_364_bi;
    public double field_362_bj;
    public double field_360_bk;
    public StepSound stepSound;
    public float field_357_bm;
    public final Material material;
    public float field_355_bo;

    static 
    {
        soundPowderFootstep = new StepSound("stone", 1.0F, 1.0F);
        soundWoodFootstep = new StepSound("wood", 1.0F, 1.0F);
        soundGravelFootstep = new StepSound("gravel", 1.0F, 1.0F);
        soundGrassFootstep = new StepSound("grass", 1.0F, 1.0F);
        soundStoneFootstep = new StepSound("stone", 1.0F, 1.0F);
        soundMetalFootstep = new StepSound("stone", 1.0F, 1.5F);
        soundGlassFootstep = new StepSoundStone("stone", 1.0F, 1.0F);
        soundClothFootstep = new StepSound("cloth", 1.0F, 1.0F);
        soundSandFootstep = new StepSoundSand("sand", 1.0F, 1.0F);
        allBlocks = new Block[256];
        stone = (new BlockStone(1, 1)).func_222_c(1.5F).func_219_b(10F).func_248_a(soundStoneFootstep);
        grass = (BlockGrass)(new BlockGrass(2)).func_222_c(0.6F).func_248_a(soundGrassFootstep);
        dirt = (new BlockDirt(3, 2)).func_222_c(0.5F).func_248_a(soundGravelFootstep);
        cobblestone = (new Block(4, 16, Material.rock)).func_222_c(2.0F).func_219_b(10F).func_248_a(soundStoneFootstep);
        planks = (new Block(5, 4, Material.wood)).func_222_c(2.0F).func_219_b(5F).func_248_a(soundWoodFootstep);
        sapling = (new BlockSapling(6, 15)).func_222_c(0.0F).func_248_a(soundGrassFootstep);
        bedrock = (new Block(7, 17, Material.rock)).func_222_c(-1F).func_219_b(6000000F).func_248_a(soundStoneFootstep);
        waterStill = (new BlockFlowing(8, Material.water)).func_222_c(100F).func_256_d(3);
        waterMoving = (new BlockStationary(9, Material.water)).func_222_c(100F).func_256_d(3);
        lavaStill = (new BlockFlowing(10, Material.lava)).func_222_c(0.0F).func_215_a(1.0F).func_256_d(255);
        lavaMoving = (new BlockStationary(11, Material.lava)).func_222_c(100F).func_215_a(1.0F).func_256_d(255);
        sand = (new BlockSand(12, 18)).func_222_c(0.5F).func_248_a(soundSandFootstep);
        gravel = (new BlockGravel(13, 19)).func_222_c(0.6F).func_248_a(soundGravelFootstep);
        oreGold = (new BlockOre(14, 32)).func_222_c(3F).func_219_b(5F).func_248_a(soundStoneFootstep);
        oreIron = (new BlockOre(15, 33)).func_222_c(3F).func_219_b(5F).func_248_a(soundStoneFootstep);
        oreCoal = (new BlockOre(16, 34)).func_222_c(3F).func_219_b(5F).func_248_a(soundStoneFootstep);
        wood = (new BlockLog(17)).func_222_c(2.0F).func_248_a(soundWoodFootstep);
        leaves = (BlockLeaves)(new BlockLeaves(18, 52)).func_222_c(0.2F).func_256_d(1).func_248_a(soundGrassFootstep);
        sponge = (new BlockSponge(19)).func_222_c(0.6F).func_248_a(soundGrassFootstep);
        glass = (new BlockGlass(20, 49, Material.glass, false)).func_222_c(0.3F).func_248_a(soundGlassFootstep);
        cloth = (new Block(35, 64, Material.cloth)).func_222_c(0.8F).func_248_a(soundClothFootstep);
        plantYellow = (BlockFlower)(new BlockFlower(37, 13)).func_222_c(0.0F).func_248_a(soundGrassFootstep);
        plantRed = (BlockFlower)(new BlockFlower(38, 12)).func_222_c(0.0F).func_248_a(soundGrassFootstep);
        mushroomBrown = (BlockFlower)(new BlockMushroom(39, 29)).func_222_c(0.0F).func_248_a(soundGrassFootstep).func_215_a(0.125F);
        mushroomRed = (BlockFlower)(new BlockMushroom(40, 28)).func_222_c(0.0F).func_248_a(soundGrassFootstep);
        blockGold = (new BlockOreBlock(41, 39)).func_222_c(3F).func_219_b(10F).func_248_a(soundMetalFootstep);
        blockSteel = (new BlockOreBlock(42, 38)).func_222_c(5F).func_219_b(10F).func_248_a(soundMetalFootstep);
        stairDouble = (new BlockStep(43, true)).func_222_c(2.0F).func_219_b(10F).func_248_a(soundStoneFootstep);
        stairSingle = (new BlockStep(44, false)).func_222_c(2.0F).func_219_b(10F).func_248_a(soundStoneFootstep);
        brick = (new Block(45, 7, Material.rock)).func_222_c(2.0F).func_219_b(10F).func_248_a(soundStoneFootstep);
        tnt = (new BlockTNT(46, 8)).func_222_c(0.0F).func_248_a(soundGrassFootstep);
        bookShelf = (new BlockBookshelf(47, 35)).func_222_c(1.5F).func_248_a(soundWoodFootstep);
        cobblestoneMossy = (new Block(48, 36, Material.rock)).func_222_c(2.0F).func_219_b(10F).func_248_a(soundStoneFootstep);
        obsidian = (new BlockObsidian(49, 37)).func_222_c(10F).func_219_b(2000F).func_248_a(soundStoneFootstep);
        torchWood = (new BlockTorch(50, 80)).func_222_c(0.0F).func_215_a(0.9375F).func_248_a(soundWoodFootstep);
        fire = (BlockFire)(new BlockFire(51, 31)).func_222_c(0.0F).func_215_a(1.0F).func_248_a(soundWoodFootstep);
        mobSpawner = (new BlockMobSpawner(52, 65)).func_222_c(5F).func_248_a(soundMetalFootstep);
        stairCompact_Wood = new BlockStairs(53, planks);
        crate = (new BlockChest(54)).func_222_c(2.5F).func_248_a(soundWoodFootstep);
        redstoneWire = (new BlockRedstoneWire(55, 84)).func_222_c(0.0F).func_248_a(soundPowderFootstep);
        oreDiamond = (new BlockOre(56, 50)).func_222_c(3F).func_219_b(5F).func_248_a(soundStoneFootstep);
        blockDiamond = (new BlockOreBlock(57, 40)).func_222_c(5F).func_219_b(10F).func_248_a(soundMetalFootstep);
        workbench = (new BlockWorkbench(58)).func_222_c(2.5F).func_248_a(soundWoodFootstep);
        crops = (new BlockCrops(59, 88)).func_222_c(0.0F).func_248_a(soundGrassFootstep);
        tilledField = (new BlockSoil(60)).func_222_c(0.6F).func_248_a(soundGravelFootstep);
        stoneOvenIdle = (new BlockFurnace(61, false)).func_222_c(3.5F).func_248_a(soundStoneFootstep);
        stoneOvenActive = (new BlockFurnace(62, true)).func_222_c(3.5F).func_248_a(soundStoneFootstep).func_215_a(0.875F);
        pressurePlateWoodActive = (new BlockSign(63, TileEntitySign.class, true)).func_222_c(1.0F).func_248_a(soundWoodFootstep);
        doorWood = (new BlockDoor(64, Material.wood)).func_222_c(3F).func_248_a(soundWoodFootstep);
        ladder = (new BlockLadder(65, 83)).func_222_c(0.4F).func_248_a(soundWoodFootstep);
        minecartTrack = (new BlockMinecartTrack(66, 128)).func_222_c(0.7F).func_248_a(soundMetalFootstep);
        stairCompactStone = new BlockStairs(67, cobblestone);
        pressurePlateWoodIdle = (new BlockSign(68, TileEntitySign.class, false)).func_222_c(1.0F).func_248_a(soundWoodFootstep);
        lever = (new BlockLever(69, 96)).func_222_c(0.5F).func_248_a(soundWoodFootstep);
        pressurePlateStone = (new BlockPressurePlate(70, stone.field_378_bb, EnumMobType.mobs)).func_222_c(0.5F).func_248_a(soundStoneFootstep);
        doorSteel = (new BlockDoor(71, Material.iron)).func_222_c(5F).func_248_a(soundMetalFootstep);
        pressurePlateWood = (new BlockPressurePlate(72, planks.field_378_bb, EnumMobType.everything)).func_222_c(0.5F).func_248_a(soundWoodFootstep);
        oreRedstone = (new BlockRedstoneOre(73, 51, false)).func_222_c(3F).func_219_b(5F).func_248_a(soundStoneFootstep);
        oreRedstoneGlowing = (new BlockRedstoneOre(74, 51, true)).func_215_a(0.625F).func_222_c(3F).func_219_b(5F).func_248_a(soundStoneFootstep);
        torchRedstoneIdle = (new BlockRedstoneTorch(75, 115, false)).func_222_c(0.0F).func_248_a(soundWoodFootstep);
        torchRedstoneActive = (new BlockRedstoneTorch(76, 99, true)).func_222_c(0.0F).func_215_a(0.5F).func_248_a(soundWoodFootstep);
        button = (new BlockButton(77, stone.field_378_bb)).func_222_c(0.5F).func_248_a(soundStoneFootstep);
        snow = (new BlockSnow(78, 66)).func_222_c(0.1F).func_248_a(soundClothFootstep);
        ice = (new BlockIce(79, 67)).func_222_c(0.5F).func_256_d(3).func_248_a(soundGlassFootstep);
        blockSnow = (new BlockSnowBlock(80, 66)).func_222_c(0.2F).func_248_a(soundClothFootstep);
        cactus = (new BlockCactus(81, 70)).func_222_c(0.4F).func_248_a(soundClothFootstep);
        blockClay = (new BlockClay(82, 72)).func_222_c(0.6F).func_248_a(soundGravelFootstep);
        reed = (new BlockReed(83, 73)).func_222_c(0.0F).func_248_a(soundGrassFootstep);
        jukebox = (new BlockJukeBox(84, 74)).func_222_c(2.0F).func_219_b(10F).func_248_a(soundStoneFootstep);
        fence = (new BlockFence(85, 4)).func_222_c(2.0F).func_219_b(5F).func_248_a(soundWoodFootstep);
        for(int i = 0; i < 256; i++)
        {
            if(allBlocks[i] != null)
            {
                Item.itemsList[i] = new ItemBlock(i - 256);
            }
        }

    }
}
