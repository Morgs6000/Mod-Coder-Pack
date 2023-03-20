// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class GuiConflictWarning extends GuiScreen
{

    public GuiConflictWarning()
    {
        field_965_a = 0;
    }

    public void func_570_g()
    {
        field_965_a++;
    }

    public void func_575_a()
    {
        controlList.clear();
        controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 120 + 12, "Back to title screen"));
    }

    protected void func_572_a(GuiButton guibutton)
    {
        if(!guibutton.enabled)
        {
            return;
        }
        if(guibutton.id == 0)
        {
            mc.func_128_a(new GuiMainMenu());
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, "Level save conflict", width / 2, (height / 4 - 60) + 20, 0xffffff);
        func_547_b(field_947_g, "Minecraft detected a conflict in the level save data.", width / 2 - 140, (height / 4 - 60) + 60 + 0, 0xa0a0a0);
        func_547_b(field_947_g, "This could be caused by two copies of the game", width / 2 - 140, (height / 4 - 60) + 60 + 18, 0xa0a0a0);
        func_547_b(field_947_g, "accessing the same level.", width / 2 - 140, (height / 4 - 60) + 60 + 27, 0xa0a0a0);
        func_547_b(field_947_g, "To prevent level corruption, the current game has quit.", width / 2 - 140, (height / 4 - 60) + 60 + 45, 0xa0a0a0);
        super.func_571_a(i, j, f);
    }

    private int field_965_a;
}
