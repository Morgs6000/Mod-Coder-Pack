// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
//import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class GuiScreen extends Gui
{

    public GuiScreen()
    {
        controlList = new ArrayList();
        field_948_f = false;
        field_946_a = null;
    }

    public void func_571_a(int i, int j, float f)
    {
        for(int k = 0; k < controlList.size(); k++)
        {
            GuiButton guibutton = (GuiButton)controlList.get(k);
            guibutton.func_561_a(mc, i, j);
        }

    }

    protected void func_580_a(char c, int i)
    {
        if(i == 1)
        {
            mc.func_128_a(null);
            mc.func_123_e();
        }
    }

    public static String func_574_c()
    {
        try
        {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if(transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor))
            {
                String s = (String)transferable.getTransferData(DataFlavor.stringFlavor);
                return s;
            }
        }
        catch(Exception exception) { }
        return null;
    }

    protected void func_565_a(int i, int j, int k)
    {
        if(k == 0)
        {
            for(int l = 0; l < controlList.size(); l++)
            {
                GuiButton guibutton = (GuiButton)controlList.get(l);
                if(guibutton.func_562_c(mc, i, j))
                {
                    field_946_a = guibutton;
                    mc.field_158_A.func_337_a("random.click", 1.0F, 1.0F);
                    func_572_a(guibutton);
                }
            }

        }
    }

    protected void func_573_b(int i, int j, int k)
    {
        if(field_946_a != null && k == 0)
        {
            field_946_a.func_559_a(i, j);
            field_946_a = null;
        }
    }

    protected void func_572_a(GuiButton guibutton)
    {
    }

    public void func_563_a(Minecraft minecraft, int i, int j)
    {
        mc = minecraft;
        field_947_g = minecraft.field_170_o;
        width = i;
        height = j;
        func_575_a();
    }

    public void func_575_a()
    {
    }

    public void func_564_d()
    {
        for(; Mouse.next(); func_566_e()) { }
        for(; Keyboard.next(); func_569_f()) { }
    }

    public void func_566_e()
    {
        if(Mouse.getEventButtonState())
        {
            int i = (Mouse.getEventX() * width) / mc.displayWidth;
            int k = height - (Mouse.getEventY() * height) / mc.displayHeight - 1;
            func_565_a(i, k, Mouse.getEventButton());
        } else
        {
            int j = (Mouse.getEventX() * width) / mc.displayWidth;
            int l = height - (Mouse.getEventY() * height) / mc.displayHeight - 1;
            func_573_b(j, l, Mouse.getEventButton());
        }
    }

    public void func_569_f()
    {
        if(Keyboard.getEventKeyState())
        {
            if(Keyboard.getEventKey() == 87)
            {
                mc.func_133_h();
                return;
            }
            func_580_a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
    }

    public void func_570_g()
    {
    }

    public void func_576_h()
    {
    }

    public void func_578_i()
    {
        func_567_a(0);
    }

    public void func_567_a(int i)
    {
        if(mc.field_180_e != null)
        {
            func_549_a(0, 0, width, height, 0xc0101010, 0xd0101010);
        } else
        {
            func_579_b(i);
        }
    }

    public void func_579_b(int i)
    {
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glBindTexture(3553, mc.field_171_n.func_1070_a("/dirt.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float f = 32F;
        tessellator.func_977_b();
        tessellator.func_990_b(0x404040);
        tessellator.func_983_a(0.0D, height, 0.0D, 0.0D, (float)height / f + (float)i);
        tessellator.func_983_a(width, height, 0.0D, (float)width / f, (float)height / f + (float)i);
        tessellator.func_983_a(width, 0.0D, 0.0D, (float)width / f, 0 + i);
        tessellator.func_983_a(0.0D, 0.0D, 0.0D, 0.0D, 0 + i);
        tessellator.func_982_a();
    }

    public boolean func_577_b()
    {
        return true;
    }

    public void func_568_a(boolean flag, int i)
    {
    }

    protected Minecraft mc;
    public int width;
    public int height;
    protected java.util.List controlList;
    public boolean field_948_f;
    protected FontRenderer field_947_g;
    private GuiButton field_946_a;
}
