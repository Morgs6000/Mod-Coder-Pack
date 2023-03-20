// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class GuiConnectFailed extends GuiScreen
{

    public GuiConnectFailed(String s, String s1)
    {
        field_992_a = s;
        field_993_h = s1;
    }

    public void func_570_g()
    {
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_575_a()
    {
        controlList.clear();
        controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 120 + 12, "Back to title screen"));
    }

    protected void func_572_a(GuiButton guibutton)
    {
        if(guibutton.id == 0)
        {
            mc.func_128_a(new GuiMainMenu());
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, field_992_a, width / 2, height / 2 - 50, 0xffffff);
        func_548_a(field_947_g, field_993_h, width / 2, height / 2 - 10, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private String field_992_a;
    private String field_993_h;
}
