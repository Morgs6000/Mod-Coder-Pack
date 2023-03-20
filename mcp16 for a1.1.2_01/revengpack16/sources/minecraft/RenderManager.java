// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;
import org.lwjgl.opengl.GL11;

public class RenderManager
{

    private RenderManager()
    {
        field_1219_o = new HashMap();
        field_1219_o.put(EntitySpider.class, new RenderSpider());
        field_1219_o.put(EntityPig.class, new RenderPig(new ModelPig(), new ModelPig(0.5F), 0.7F));
        field_1219_o.put(EntitySheep.class, new RenderSheep(new ModelSheep2(), new ModelSheep1(), 0.7F));
        field_1219_o.put(EntityCow.class, new RenderCow(new ModelCow(), 0.7F));
        field_1219_o.put(EntityChicken.class, new RenderChicken(new ModelChicken(), 0.3F));
        field_1219_o.put(EntityCreeper.class, new RenderCreeper());
        field_1219_o.put(EntitySkeleton.class, new RenderLiving(new ModelSkeleton(), 0.5F));
        field_1219_o.put(EntityZombie.class, new RenderLiving(new ModelZombie(), 0.5F));
        field_1219_o.put(EntitySlime.class, new RenderSlime(new ModelSlime(16), new ModelSlime(0), 0.25F));
        field_1219_o.put(EntityPlayer.class, new RenderPlayer());
        field_1219_o.put(EntityZombieSimple.class, new RenderZombieSimple(new ModelZombie(), 0.5F, 6F));
        field_1219_o.put(EntityLiving.class, new RenderLiving(new ModelBiped(), 0.5F));
        field_1219_o.put(Entity.class, new RenderEntity());
        field_1219_o.put(EntityPainting.class, new RenderPainting());
        field_1219_o.put(EntityArrow.class, new RenderArrow());
        field_1219_o.put(EntitySnowball.class, new RenderSnowball());
        field_1219_o.put(EntityItem.class, new RenderItem());
        field_1219_o.put(EntityTNTPrimed.class, new RenderTNTPrimed());
        field_1219_o.put(EntityFallingSand.class, new RenderFallingSand());
        field_1219_o.put(EntityMinecart.class, new RenderMinecart());
        field_1219_o.put(EntityBoat.class, new RenderBoat());
        Render render;
        for(Iterator iterator = field_1219_o.values().iterator(); iterator.hasNext(); render.func_150_a(this))
        {
            render = (Render)iterator.next();
        }

    }

    public Render func_850_a(Class class1)
    {
        Render render = (Render)field_1219_o.get(class1);
        if(render == null && class1 != (Entity.class))
        {
            render = func_850_a(class1.getSuperclass());
            field_1219_o.put(class1, render);
        }
        return render;
    }

    public Render func_855_a(Entity entity)
    {
        return func_850_a(entity.getClass());
    }

    public void func_857_a(World world, RenderEngine renderengine, FontRenderer fontrenderer, EntityPlayer entityplayer, GameSettings gamesettings, float f)
    {
        field_1227_g = world;
        field_1229_e = renderengine;
        field_1223_k = gamesettings;
        field_1226_h = entityplayer;
        field_1218_p = fontrenderer;
        field_1225_i = entityplayer.field_603_as + (entityplayer.rotationYaw - entityplayer.field_603_as) * f;
        field_1224_j = entityplayer.field_602_at + (entityplayer.rotationPitch - entityplayer.field_602_at) * f;
        field_1222_l = entityplayer.field_638_aI + (entityplayer.posX - entityplayer.field_638_aI) * (double)f;
        field_1221_m = entityplayer.field_637_aJ + (entityplayer.posY - entityplayer.field_637_aJ) * (double)f;
        field_1220_n = entityplayer.field_636_aK + (entityplayer.posZ - entityplayer.field_636_aK) * (double)f;
    }

    public void func_854_a(Entity entity, float f)
    {
        double d = entity.field_638_aI + (entity.posX - entity.field_638_aI) * (double)f;
        double d1 = entity.field_637_aJ + (entity.posY - entity.field_637_aJ) * (double)f;
        double d2 = entity.field_636_aK + (entity.posZ - entity.field_636_aK) * (double)f;
        float f1 = entity.field_603_as + (entity.rotationYaw - entity.field_603_as) * f;
        float f2 = entity.func_382_a(f);
        GL11.glColor3f(f2, f2, f2);
        func_853_a(entity, d - field_1232_b, d1 - field_1231_c, d2 - field_1230_d, f1, f);
    }

    public void func_853_a(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        Render render = func_855_a(entity);
        if(render != null)
        {
            render.func_147_a(entity, d, d1, d2, f, f1);
            render.func_141_b(entity, d, d1, d2, f, f1);
        }
    }

    public void func_852_a(World world)
    {
        field_1227_g = world;
    }

    public double func_851_a(double d, double d1, double d2)
    {
        double d3 = d - field_1222_l;
        double d4 = d1 - field_1221_m;
        double d5 = d2 - field_1220_n;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public FontRenderer func_856_a()
    {
        return field_1218_p;
    }

    private Map field_1219_o;
    public static RenderManager field_1233_a = new RenderManager();
    private FontRenderer field_1218_p;
    public static double field_1232_b;
    public static double field_1231_c;
    public static double field_1230_d;
    public RenderEngine field_1229_e;
    public ItemRenderer field_1228_f;
    public World field_1227_g;
    public EntityPlayer field_1226_h;
    public float field_1225_i;
    public float field_1224_j;
    public GameSettings field_1223_k;
    public double field_1222_l;
    public double field_1221_m;
    public double field_1220_n;

}
