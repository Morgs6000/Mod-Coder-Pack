// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;

public class GuiDownloadTerrain extends GuiScreen
{

    public GuiDownloadTerrain(NetClientHandler netclienthandler)
    {
        field_984_h = 0;
        field_983_a = netclienthandler;
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_575_a()
    {
        controlList.clear();
    }

    public void func_570_g()
    {
        field_984_h++;
        if(field_984_h % 20 == 0)
        {
            field_983_a.func_847_a(new Packet0KeepAlive());
        }
        if(field_983_a != null)
        {
            field_983_a.func_848_a();
        }
    }

    protected void func_572_a(GuiButton guibutton)
    {
    }

    public void func_571_a(int i, int j, float f)
    {
        func_579_b(0);
        func_548_a(field_947_g, "Downloading terrain", width / 2, height / 2 - 50, 0xffffff);
        super.func_571_a(i, j, f);
    }

    private NetClientHandler field_983_a;
    private int field_984_h;
}
