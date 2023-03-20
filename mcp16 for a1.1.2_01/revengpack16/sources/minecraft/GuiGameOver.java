// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiGameOver extends GuiScreen
{

    public GuiGameOver()
    {
    }

    public void func_575_a()
    {
        controlList.clear();
        controlList.add(new GuiButton(1, width / 2 - 100, height / 4 + 72, "Respawn"));
        controlList.add(new GuiButton(2, width / 2 - 100, height / 4 + 96, "Title menu"));
        if(mc.field_176_i == null)
        {
            ((GuiButton)controlList.get(1)).enabled = false;
        }
    }

    protected void func_580_a(char c, int i)
    {
    }

    protected void func_572_a(GuiButton guibutton)
    {
        if(guibutton.id != 0);
        if(guibutton.id == 1)
        {
            mc.func_126_o();
            mc.func_128_a(null);
        }
        if(guibutton.id == 2)
        {
            mc.func_134_a(null);
            mc.func_128_a(new GuiMainMenu());
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_549_a(0, 0, width, height, 0x60500000, 0xa0803030);
        GL11.glPushMatrix();
        GL11.glScalef(2.0F, 2.0F, 2.0F);
        func_548_a(field_947_g, "Game over!", width / 2 / 2, 30, 0xffffff);
        GL11.glPopMatrix();
        func_548_a(field_947_g, (new StringBuilder()).append("Score: &e").append(mc.field_178_g.func_447_r()).toString(), width / 2, 100, 0xffffff);
        super.func_571_a(i, j, f);
    }

    public boolean func_577_b()
    {
        return false;
    }
}
