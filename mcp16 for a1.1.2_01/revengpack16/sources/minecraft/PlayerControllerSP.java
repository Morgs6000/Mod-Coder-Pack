// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;

public class PlayerControllerSP extends PlayerController
{

    public PlayerControllerSP(Minecraft minecraft)
    {
        super(minecraft);
        field_1074_c = -1;
        field_1073_d = -1;
        field_1072_e = -1;
        field_1071_f = 0.0F;
        field_1070_g = 0.0F;
        field_1069_h = 0.0F;
        field_1068_i = 0;
        field_1067_j = new SpawnerMonsters(this, 200, IMobs.class, new Class[] {
            EntityZombie.class, EntitySkeleton.class, EntityCreeper.class, EntitySpider.class, EntitySlime.class
        });
        field_1066_k = new SpawnerAnimals(15, EntityAnimals.class, new Class[] {
            EntitySheep.class, EntityPig.class, EntityCow.class, EntityChicken.class
        });
    }

    public void func_720_a(EntityPlayer entityplayer)
    {
        entityplayer.rotationYaw = -180F;
    }

    public boolean func_729_b(int i, int j, int k, int l)
    {
        int i1 = field_1065_a.field_180_e.func_600_a(i, j, k);
        int j1 = field_1065_a.field_180_e.func_602_e(i, j, k);
        boolean flag = super.func_729_b(i, j, k, l);
        ItemStack itemstack = field_1065_a.field_178_g.func_442_t();
        boolean flag1 = field_1065_a.field_178_g.func_454_b(Block.allBlocks[i1]);
        if(itemstack != null)
        {
            itemstack.func_1087_a(i1, i, j, k);
            if(itemstack.stackSize == 0)
            {
                itemstack.func_1097_a(field_1065_a.field_178_g);
                field_1065_a.field_178_g.func_448_u();
            }
        }
        if(flag && flag1)
        {
            Block.allBlocks[i1].func_220_a_(field_1065_a.field_180_e, i, j, k, j1);
        }
        return flag;
    }

    public void func_719_a(int i, int j, int k, int l)
    {
        int i1 = field_1065_a.field_180_e.func_600_a(i, j, k);
        if(i1 > 0 && field_1071_f == 0.0F)
        {
            Block.allBlocks[i1].func_233_b(field_1065_a.field_180_e, i, j, k, field_1065_a.field_178_g);
        }
        if(i1 > 0 && Block.allBlocks[i1].func_225_a(field_1065_a.field_178_g) >= 1.0F)
        {
            func_729_b(i, j, k, l);
        }
    }

    public void func_724_a()
    {
        field_1071_f = 0.0F;
        field_1068_i = 0;
    }

    public void func_726_c(int i, int j, int k, int l)
    {
        if(field_1068_i > 0)
        {
            field_1068_i--;
            return;
        }
        if(i == field_1074_c && j == field_1073_d && k == field_1072_e)
        {
            int i1 = field_1065_a.field_180_e.func_600_a(i, j, k);
            if(i1 == 0)
            {
                return;
            }
            Block block = Block.allBlocks[i1];
            field_1071_f += block.func_225_a(field_1065_a.field_178_g);
            if(field_1069_h % 4F == 0.0F && block != null)
            {
                field_1065_a.field_158_A.func_336_b(block.stepSound.func_1145_d(), (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, (block.stepSound.func_1147_b() + 1.0F) / 8F, block.stepSound.func_1144_c() * 0.5F);
            }
            field_1069_h++;
            if(field_1071_f >= 1.0F)
            {
                func_729_b(i, j, k, l);
                field_1071_f = 0.0F;
                field_1070_g = 0.0F;
                field_1069_h = 0.0F;
                field_1068_i = 5;
            }
        } else
        {
            field_1071_f = 0.0F;
            field_1070_g = 0.0F;
            field_1069_h = 0.0F;
            field_1074_c = i;
            field_1073_d = j;
            field_1072_e = k;
        }
    }

    public void func_723_a(float f)
    {
        if(field_1071_f <= 0.0F)
        {
            field_1065_a.field_164_u.field_932_b = 0.0F;
            field_1065_a.field_179_f.field_1450_i = 0.0F;
        } else
        {
            float f1 = field_1070_g + (field_1071_f - field_1070_g) * f;
            field_1065_a.field_164_u.field_932_b = f1;
            field_1065_a.field_179_f.field_1450_i = f1;
        }
    }

    public float func_727_b()
    {
        return 4F;
    }

    public void func_717_a(World world)
    {
        super.func_717_a(world);
    }

    public void func_728_c()
    {
        field_1070_g = field_1071_f;
        field_1067_j.func_1150_a(field_1065_a.field_180_e);
        field_1066_k.func_1150_a(field_1065_a.field_180_e);
        field_1065_a.field_158_A.func_341_c();
    }

    private int field_1074_c;
    private int field_1073_d;
    private int field_1072_e;
    private float field_1071_f;
    private float field_1070_g;
    private float field_1069_h;
    private int field_1068_i;
    private SpawnerAnimals field_1067_j;
    private SpawnerAnimals field_1066_k;
}
