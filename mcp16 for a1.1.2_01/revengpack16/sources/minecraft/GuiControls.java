// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class GuiControls extends GuiScreen
{

    public GuiControls(GuiScreen guiscreen, GameSettings gamesettings)
    {
        screenTitle = "Controls";
        buttonId = -1;
        parentScreen = guiscreen;
        options = gamesettings;
    }

    public void func_575_a()
    {
        for(int i = 0; i < options.keyBindings.length; i++)
        {
            controlList.add(new GuiSmallButton(i, (width / 2 - 155) + (i % 2) * 160, height / 6 + 24 * (i >> 1), options.func_1043_a(i)));
        }

        controlList.add(new GuiButton(200, width / 2 - 100, height / 6 + 168, "Done"));
    }

    protected void func_572_a(GuiButton guibutton)
    {
        for(int i = 0; i < options.keyBindings.length; i++)
        {
            ((GuiButton)controlList.get(i)).displayString = options.func_1043_a(i);
        }

        if(guibutton.id == 200)
        {
            mc.func_128_a(parentScreen);
        } else
        {
            buttonId = guibutton.id;
            guibutton.displayString = (new StringBuilder()).append("> ").append(options.func_1043_a(guibutton.id)).append(" <").toString();
        }
    }

    protected void func_580_a(char c, int i)
    {
        if(buttonId >= 0)
        {
            options.func_1042_a(buttonId, i);
            ((GuiButton)controlList.get(buttonId)).displayString = options.func_1043_a(buttonId);
            buttonId = -1;
        } else
        {
            super.func_580_a(c, i);
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, screenTitle, width / 2, 20, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private GuiScreen parentScreen;
    protected String screenTitle;
    private GameSettings options;
    private int buttonId;
}
