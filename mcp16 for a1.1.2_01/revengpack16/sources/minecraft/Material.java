// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class Material
{

    public Material()
    {
    }

    public boolean func_879_d()
    {
        return false;
    }

    public boolean func_878_a()
    {
        return true;
    }

    public boolean func_881_b()
    {
        return true;
    }

    public boolean func_880_c()
    {
        return true;
    }

    private Material func_877_f()
    {
        canBurn = true;
        return this;
    }

    public boolean func_876_e()
    {
        return canBurn;
    }

    public static final Material air = new MaterialTransparent();
    public static final Material ground = new Material();
    public static final Material wood = (new Material()).func_877_f();
    public static final Material rock = new Material();
    public static final Material iron = new Material();
    public static final Material water = new MaterialLiquid();
    public static final Material lava = new MaterialLiquid();
    public static final Material leaves = (new Material()).func_877_f();
    public static final Material plants = new MaterialLogic();
    public static final Material sponge = new Material();
    public static final Material cloth = (new Material()).func_877_f();
    public static final Material fire = new MaterialTransparent();
    public static final Material sand = new Material();
    public static final Material circuits = new MaterialLogic();
    public static final Material glass = new Material();
    public static final Material tnt = (new Material()).func_877_f();
    public static final Material unused = new Material();
    public static final Material ice = new Material();
    public static final Material snow = new MaterialLogic();
    public static final Material builtSnow = new Material();
    public static final Material cactus = new Material();
    public static final Material clay = new Material();
    private boolean canBurn;

}
