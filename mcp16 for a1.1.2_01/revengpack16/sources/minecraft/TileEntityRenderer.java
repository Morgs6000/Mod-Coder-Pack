// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;
import org.lwjgl.opengl.GL11;

public class TileEntityRenderer
{

    private TileEntityRenderer()
    {
        field_1542_m = new HashMap();
        field_1542_m.put(TileEntitySign.class, new TileEntitySignRenderer());
        field_1542_m.put(TileEntityMobSpawner.class, new TileEntityMobSpawnerRenderer());
        TileEntitySpecialRenderer tileentityspecialrenderer;
        for(Iterator iterator = field_1542_m.values().iterator(); iterator.hasNext(); tileentityspecialrenderer.func_928_a(this))
        {
            tileentityspecialrenderer = (TileEntitySpecialRenderer)iterator.next();
        }

    }

    public TileEntitySpecialRenderer func_1027_a(Class class1)
    {
        TileEntitySpecialRenderer tileentityspecialrenderer = (TileEntitySpecialRenderer)field_1542_m.get(class1);
        if(tileentityspecialrenderer == null && class1 != (TileEntity.class))
        {
            tileentityspecialrenderer = func_1027_a(class1.getSuperclass());
            field_1542_m.put(class1, tileentityspecialrenderer);
        }
        return tileentityspecialrenderer;
    }

    public boolean func_1028_a(TileEntity tileentity)
    {
        return func_1031_b(tileentity) != null;
    }

    public TileEntitySpecialRenderer func_1031_b(TileEntity tileentity)
    {
        return func_1027_a(tileentity.getClass());
    }

    public void func_1026_a(World world, RenderEngine renderengine, FontRenderer fontrenderer, EntityPlayer entityplayer, float f)
    {
        field_1549_f = world;
        field_1550_e = renderengine;
        field_1548_g = entityplayer;
        field_1541_n = fontrenderer;
        field_1547_h = entityplayer.field_603_as + (entityplayer.rotationYaw - entityplayer.field_603_as) * f;
        field_1546_i = entityplayer.field_602_at + (entityplayer.rotationPitch - entityplayer.field_602_at) * f;
        field_1545_j = entityplayer.field_638_aI + (entityplayer.posX - entityplayer.field_638_aI) * (double)f;
        field_1544_k = entityplayer.field_637_aJ + (entityplayer.posY - entityplayer.field_637_aJ) * (double)f;
        field_1543_l = entityplayer.field_636_aK + (entityplayer.posZ - entityplayer.field_636_aK) * (double)f;
    }

    public void func_1030_a(TileEntity tileentity, float f)
    {
        if(tileentity.func_480_a(field_1545_j, field_1544_k, field_1543_l) < 4096D)
        {
            float f1 = field_1549_f.func_598_c(tileentity.x, tileentity.y, tileentity.z);
            GL11.glColor3f(f1, f1, f1);
            func_1032_a(tileentity, (double)tileentity.x - field_1553_b, (double)tileentity.y - field_1552_c, (double)tileentity.z - field_1551_d, f);
        }
    }

    public void func_1032_a(TileEntity tileentity, double d, double d1, double d2, 
            float f)
    {
        TileEntitySpecialRenderer tileentityspecialrenderer = func_1031_b(tileentity);
        if(tileentityspecialrenderer != null)
        {
            tileentityspecialrenderer.func_930_a(tileentity, d, d1, d2, f);
        }
    }

    public FontRenderer func_1029_a()
    {
        return field_1541_n;
    }

    private Map field_1542_m;
    public static TileEntityRenderer field_1554_a = new TileEntityRenderer();
    private FontRenderer field_1541_n;
    public static double field_1553_b;
    public static double field_1552_c;
    public static double field_1551_d;
    public RenderEngine field_1550_e;
    public World field_1549_f;
    public EntityPlayer field_1548_g;
    public float field_1547_h;
    public float field_1546_i;
    public double field_1545_j;
    public double field_1544_k;
    public double field_1543_l;

}
