// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class GuiSelectWorld extends GuiScreen
{

    public GuiSelectWorld(GuiScreen guiscreen)
    {
        field_960_h = "Select world";
        field_959_i = false;
        field_958_a = guiscreen;
    }

    public void func_575_a()
    {
        java.io.File file = Minecraft.func_106_b();
        for(int i = 0; i < 5; i++)
        {
            NBTTagCompound nbttagcompound = World.func_629_a(file, (new StringBuilder()).append("World").append(i + 1).toString());
            if(nbttagcompound == null)
            {
                controlList.add(new GuiButton(i, width / 2 - 100, height / 6 + 24 * i, "- empty -"));
            } else
            {
                String s = (new StringBuilder()).append("World ").append(i + 1).toString();
                long l = nbttagcompound.func_764_f("SizeOnDisk");
                s = (new StringBuilder()).append(s).append(" (").append((float)(((l / 1024L) * 100L) / 1024L) / 100F).append(" MB)").toString();
                controlList.add(new GuiButton(i, width / 2 - 100, height / 6 + 24 * i, s));
            }
        }

        func_585_j();
    }

    protected String func_586_d(int i)
    {
        java.io.File file = Minecraft.func_106_b();
        return World.func_629_a(file, (new StringBuilder()).append("World").append(i).toString()) == null ? null : (new StringBuilder()).append("World").append(i).toString();
    }

    public void func_585_j()
    {
        controlList.add(new GuiButton(5, width / 2 - 100, height / 6 + 120 + 12, "Delete world..."));
        controlList.add(new GuiButton(6, width / 2 - 100, height / 6 + 168, "Cancel"));
    }

    protected void func_572_a(GuiButton guibutton)
    {
        if(!guibutton.enabled)
        {
            return;
        }
        if(guibutton.id < 5)
        {
            func_584_c(guibutton.id + 1);
        } else
        if(guibutton.id == 5)
        {
            mc.func_128_a(new GuiDeleteWorld(this));
        } else
        if(guibutton.id == 6)
        {
            mc.func_128_a(field_958_a);
        }
    }

    public void func_584_c(int i)
    {
        mc.func_128_a(null);
        if(field_959_i)
        {
            return;
        } else
        {
            field_959_i = true;
            mc.field_183_b = new PlayerControllerSP(mc);
            mc.func_113_b((new StringBuilder()).append("World").append(i).toString());
            mc.func_128_a(null);
            return;
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_947_g, field_960_h, width / 2, 20, 0xffffff);
        super.func_571_a(i, j, f);
    }

    protected GuiScreen field_958_a;
    protected String field_960_h;
    private boolean field_959_i;
}
