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

public class bh extends lm
{

    public bh()
    {
        field_949_e = new ArrayList();
        field_948_f = false;
        field_946_a = null;
    }

    public void func_571_a(int i, int j, float f)
    {
        for(int k = 0; k < field_949_e.size(); k++)
        {
            fk fk1 = (fk)field_949_e.get(k);
            fk1.func_561_a(field_945_b, i, j);
        }

    }

    protected void func_580_a(char c, int i)
    {
        if(i == 1)
        {
            field_945_b.func_128_a(null);
            field_945_b.func_123_e();
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
            for(int l = 0; l < field_949_e.size(); l++)
            {
                fk fk1 = (fk)field_949_e.get(l);
                if(fk1.func_562_c(field_945_b, i, j))
                {
                    field_946_a = fk1;
                    field_945_b.field_158_A.func_337_a("random.click", 1.0F, 1.0F);
                    func_572_a(fk1);
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

    protected void func_572_a(fk fk1)
    {
    }

    public void func_563_a(Minecraft minecraft, int i, int j)
    {
        field_945_b = minecraft;
        field_947_g = minecraft.field_170_o;
        field_951_c = i;
        field_950_d = j;
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
            int i = (Mouse.getEventX() * field_951_c) / field_945_b.field_182_c;
            int k = field_950_d - (Mouse.getEventY() * field_950_d) / field_945_b.field_181_d - 1;
            func_565_a(i, k, Mouse.getEventButton());
        } else
        {
            int j = (Mouse.getEventX() * field_951_c) / field_945_b.field_182_c;
            int l = field_950_d - (Mouse.getEventY() * field_950_d) / field_945_b.field_181_d - 1;
            func_573_b(j, l, Mouse.getEventButton());
        }
    }

    public void func_569_f()
    {
        if(Keyboard.getEventKeyState())
        {
            if(Keyboard.getEventKey() == 87)
            {
                field_945_b.func_133_h();
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
        if(field_945_b.field_180_e != null)
        {
            func_549_a(0, 0, field_951_c, field_950_d, 0xc0101010, 0xd0101010);
        } else
        {
            func_579_b(i);
        }
    }

    public void func_579_b(int i)
    {
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        ho ho1 = ho.field_1512_a;
        GL11.glBindTexture(3553, field_945_b.field_171_n.func_1070_a("/dirt.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float f = 32F;
        ho1.func_977_b();
        ho1.func_990_b(0x404040);
        ho1.func_983_a(0.0D, field_950_d, 0.0D, 0.0D, (float)field_950_d / f + (float)i);
        ho1.func_983_a(field_951_c, field_950_d, 0.0D, (float)field_951_c / f, (float)field_950_d / f + (float)i);
        ho1.func_983_a(field_951_c, 0.0D, 0.0D, (float)field_951_c / f, 0 + i);
        ho1.func_983_a(0.0D, 0.0D, 0.0D, 0.0D, 0 + i);
        ho1.func_982_a();
    }

    public boolean func_577_b()
    {
        return true;
    }

    public void func_568_a(boolean flag, int i)
    {
    }

    protected Minecraft field_945_b;
    public int field_951_c;
    public int field_950_d;
    protected java.util.List field_949_e;
    public boolean field_948_f;
    protected kd field_947_g;
    private fk field_946_a;
}
