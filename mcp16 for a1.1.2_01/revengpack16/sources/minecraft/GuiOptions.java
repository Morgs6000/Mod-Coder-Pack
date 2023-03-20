// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class GuiOptions extends GuiScreen
{

    public GuiOptions(GuiScreen guiscreen, GameSettings gamesettings)
    {
        screenTitle = "Options";
        parentScreen = guiscreen;
        options = gamesettings;
    }

    public void func_575_a()
    {
        for(int i = 0; i < options.numberOfOptions; i++)
        {
            int j = options.func_1046_b(i);
            if(j == 0)
            {
                controlList.add(new GuiSmallButton(i, (width / 2 - 155) + (i % 2) * 160, height / 6 + 24 * (i >> 1), options.func_1047_d(i)));
            } else
            {
                controlList.add(new GuiSlider(i, (width / 2 - 155) + (i % 2) * 160, height / 6 + 24 * (i >> 1), i, options.func_1047_d(i), options.func_1049_c(i)));
            }
        }

        controlList.add(new GuiButton(100, width / 2 - 100, height / 6 + 120 + 12, "Controls..."));
        controlList.add(new GuiButton(200, width / 2 - 100, height / 6 + 168, "Done"));
    }

    protected void func_572_a(GuiButton guibutton)
    {
        if(!guibutton.enabled)
        {
            return;
        }
        if(guibutton.id < 100)
        {
            options.func_1045_b(guibutton.id, 1);
            guibutton.displayString = options.func_1047_d(guibutton.id);
        }
        if(guibutton.id == 100)
        {
            mc.func_128_a(new GuiControls(this, options));
        }
        if(guibutton.id == 200)
        {
            mc.func_128_a(parentScreen);
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
}
