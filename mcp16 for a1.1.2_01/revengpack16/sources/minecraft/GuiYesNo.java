// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;

public class GuiYesNo extends GuiScreen
{

    public GuiYesNo(GuiScreen guiscreen, String s, String s1, int i)
    {
        field_961_a = guiscreen;
        field_964_h = s;
        field_963_i = s1;
        field_962_j = i;
    }

    public void func_575_a()
    {
        controlList.add(new GuiSmallButton(0, (width / 2 - 155) + 0, height / 6 + 96, "Yes"));
        controlList.add(new GuiSmallButton(1, (width / 2 - 155) + 160, height / 6 + 96, "No"));
    }

    protected void func_572_a(GuiButton guibutton)
    {
        field_961_a.func_568_a(guibutton.id == 0, field_962_j);
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, field_964_h, width / 2, 70, 0xffffff);
        func_548_a(field_947_g, field_963_i, width / 2, 90, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private GuiScreen field_961_a;
    private String field_964_h;
    private String field_963_i;
    private int field_962_j;
}
