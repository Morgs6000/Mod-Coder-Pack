// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class GuiIngameMenu extends GuiScreen
{

    public GuiIngameMenu()
    {
        field_966_a = 0;
        field_967_h = 0;
    }

    public void func_575_a()
    {
        field_966_a = 0;
        controlList.clear();
        controlList.add(new GuiButton(1, width / 2 - 100, height / 4 + 48, "Save and quit to title"));
        if(mc.func_124_j())
        {
            ((GuiButton)controlList.get(0)).displayString = "Disconnect";
        }
        controlList.add(new GuiButton(4, width / 2 - 100, height / 4 + 24, "Back to game"));
        controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 96, "Options..."));
    }

    protected void func_572_a(GuiButton guibutton)
    {
        if(guibutton.id == 0)
        {
            mc.func_128_a(new GuiOptions(this, mc.options));
        }
        if(guibutton.id == 1)
        {
            if(mc.func_124_j())
            {
                mc.field_180_e.func_660_k();
            }
            mc.func_134_a(null);
            mc.func_128_a(new GuiMainMenu());
        }
        if(guibutton.id == 4)
        {
            mc.func_128_a(null);
            mc.func_123_e();
        }
    }

    public void func_570_g()
    {
        super.func_570_g();
        field_967_h++;
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        boolean flag = !mc.field_180_e.func_650_a(field_966_a++);
        if(flag || field_967_h < 20)
        {
            float f1 = ((float)(field_967_h % 10) + f) / 10F;
            f1 = MathHelper.func_1106_a(f1 * 3.141593F * 2.0F) * 0.2F + 0.8F;
            int k = (int)(255F * f1);
            func_547_b(field_947_g, "Saving level..", 8, height - 16, k << 16 | k << 8 | k);
        }
        func_548_a(field_947_g, "Game menu", width / 2, 40, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private int field_966_a;
    private int field_967_h;
}
