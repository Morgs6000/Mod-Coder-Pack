// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiSlider extends GuiButton
{

    public GuiSlider(int i, int j, int k, int l, String s, float f)
    {
        super(i, j, k, 150, 20, s);
        value = 1.0F;
        dragging = false;
        idFloat = 0;
        idFloat = l;
        value = f;
    }

    protected int func_558_a(boolean flag)
    {
        return 0;
    }

    protected void func_560_b(Minecraft minecraft, int i, int j)
    {
        if(!enabled2)
        {
            return;
        }
        if(dragging)
        {
            value = (float)(i - (xPosition + 4)) / (float)(width - 8);
            if(value < 0.0F)
            {
                value = 0.0F;
            }
            if(value > 1.0F)
            {
                value = 1.0F;
            }
            minecraft.options.func_1048_a(idFloat, value);
            displayString = minecraft.options.func_1047_d(idFloat);
        }
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        func_550_b(xPosition + (int)(value * (float)(width - 8)), yPosition, 0, 66, 4, 20);
        func_550_b(xPosition + (int)(value * (float)(width - 8)) + 4, yPosition, 196, 66, 4, 20);
    }

    public boolean func_562_c(Minecraft minecraft, int i, int j)
    {
        if(super.func_562_c(minecraft, i, j))
        {
            value = (float)(i - (xPosition + 4)) / (float)(width - 8);
            if(value < 0.0F)
            {
                value = 0.0F;
            }
            if(value > 1.0F)
            {
                value = 1.0F;
            }
            minecraft.options.func_1048_a(idFloat, value);
            displayString = minecraft.options.func_1047_d(idFloat);
            dragging = true;
            return true;
        } else
        {
            return false;
        }
    }

    public void func_559_a(int i, int j)
    {
        dragging = false;
    }

    public float value;
    public boolean dragging;
    private int idFloat;
}
