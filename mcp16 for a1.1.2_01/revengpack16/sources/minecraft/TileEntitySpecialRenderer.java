// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public abstract class TileEntitySpecialRenderer
{

    public TileEntitySpecialRenderer()
    {
    }

    public abstract void func_930_a(TileEntity tileentity, double d, double d1, double d2, 
            float f);

    protected void func_927_a(String s)
    {
        RenderEngine renderengine = field_1411_a.field_1550_e;
        renderengine.func_1076_b(renderengine.func_1070_a(s));
    }

    public void func_928_a(TileEntityRenderer tileentityrenderer)
    {
        field_1411_a = tileentityrenderer;
    }

    public FontRenderer func_929_a()
    {
        return field_1411_a.func_1029_a();
    }

    protected TileEntityRenderer field_1411_a;
}
