// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiButton extends Gui
{

    public GuiButton(int i, int j, int k, String s)
    {
        this(i, j, k, 200, 20, s);
    }

    protected GuiButton(int i, int j, int k, int l, int i1, String s)
    {
        width = 200;
        height = 20;
        enabled = true;
        enabled2 = true;
        id = i;
        xPosition = j;
        yPosition = k;
        width = l;
        height = i1;
        displayString = s;
    }

    protected int func_558_a(boolean flag)
    {
        byte byte0 = 1;
        if(!enabled)
        {
            byte0 = 0;
        } else
        if(flag)
        {
            byte0 = 2;
        }
        return byte0;
    }

    public void func_561_a(Minecraft minecraft, int i, int j)
    {
        if(!enabled2)
        {
            return;
        }
        FontRenderer fontrenderer = minecraft.field_170_o;
        GL11.glBindTexture(3553, minecraft.field_171_n.func_1070_a("/gui/gui.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        boolean flag = i >= xPosition && j >= yPosition && i < xPosition + width && j < yPosition + height;
        int k = func_558_a(flag);
        func_550_b(xPosition, yPosition, 0, 46 + k * 20, width / 2, height);
        func_550_b(xPosition + width / 2, yPosition, 200 - width / 2, 46 + k * 20, width / 2, height);
        func_560_b(minecraft, i, j);
        if(!enabled)
        {
            func_548_a(fontrenderer, displayString, xPosition + width / 2, yPosition + (height - 8) / 2, 0xffa0a0a0);
        } else
        if(flag)
        {
            func_548_a(fontrenderer, displayString, xPosition + width / 2, yPosition + (height - 8) / 2, 0xffffa0);
        } else
        {
            func_548_a(fontrenderer, displayString, xPosition + width / 2, yPosition + (height - 8) / 2, 0xe0e0e0);
        }
    }

    protected void func_560_b(Minecraft minecraft, int i, int j)
    {
    }

    public void func_559_a(int i, int j)
    {
    }

    public boolean func_562_c(Minecraft minecraft, int i, int j)
    {
        return enabled && i >= xPosition && j >= yPosition && i < xPosition + width && j < yPosition + height;
    }

    protected int width;
    protected int height;
    public int xPosition;
    public int yPosition;
    public String displayString;
    public int id;
    public boolean enabled;
    public boolean enabled2;
}
