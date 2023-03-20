// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class GuiConnecting extends GuiScreen
{

    public GuiConnecting(Minecraft minecraft, String s, int i)
    {
        field_953_h = false;
        minecraft.func_134_a(null);
        (new ThreadConnectToServer(this, minecraft, s, i)).start();
    }

    public void func_570_g()
    {
        if(field_952_a != null)
        {
            field_952_a.func_848_a();
        }
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_575_a()
    {
        controlList.clear();
        controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 120 + 12, "Cancel"));
    }

    protected void func_572_a(GuiButton guibutton)
    {
        if(guibutton.id == 0)
        {
            field_953_h = true;
            if(field_952_a != null)
            {
                field_952_a.func_849_b();
            }
            mc.func_128_a(new GuiMainMenu());
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        if(field_952_a == null)
        {
            func_548_a(field_947_g, "Connecting to the server...", width / 2, height / 2 - 50, 0xffffff);
            func_548_a(field_947_g, "", width / 2, height / 2 - 10, 0xffffff);
        } else
        {
            func_548_a(field_947_g, "Logging in...", width / 2, height / 2 - 50, 0xffffff);
            func_548_a(field_947_g, field_952_a.field_1209_a, width / 2, height / 2 - 10, 0xffffff);
        }
        super.func_571_a(i, j, f);
    }

    static NetClientHandler func_582_a(GuiConnecting guiconnecting, NetClientHandler netclienthandler)
    {
        return guiconnecting.field_952_a = netclienthandler;
    }

    static boolean func_581_a(GuiConnecting guiconnecting)
    {
        return guiconnecting.field_953_h;
    }

    static NetClientHandler func_583_b(GuiConnecting guiconnecting)
    {
        return guiconnecting.field_952_a;
    }

    private NetClientHandler field_952_a;
    private boolean field_953_h;
}
