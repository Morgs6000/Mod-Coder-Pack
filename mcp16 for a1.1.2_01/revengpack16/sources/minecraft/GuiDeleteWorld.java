// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class GuiDeleteWorld extends GuiSelectWorld
{

    public GuiDeleteWorld(GuiScreen guiscreen)
    {
        super(guiscreen);
        field_960_h = "Delete world";
    }

    public void func_585_j()
    {
        controlList.add(new GuiButton(6, width / 2 - 100, height / 6 + 168, "Cancel"));
    }

    public void func_584_c(int i)
    {
        String s = func_586_d(i);
        if(s != null)
        {
            mc.func_128_a(new GuiYesNo(this, "Are you sure you want to delete this world?", (new StringBuilder()).append("'").append(s).append("' will be lost forever!").toString(), i));
        }
    }

    public void func_568_a(boolean flag, int i)
    {
        if(flag)
        {
            java.io.File file = Minecraft.func_106_b();
            World.func_615_b(file, func_586_d(i));
        }
        mc.func_128_a(field_958_a);
    }
}
