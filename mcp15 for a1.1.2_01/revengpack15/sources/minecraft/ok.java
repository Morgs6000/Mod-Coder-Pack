// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class ok extends dn
{

    public ok()
    {
        super(new jy(), 1.0F);
        func_169_a(new jy());
    }

    protected float func_191_a(ax ax1)
    {
        return 180F;
    }

    protected boolean func_190_a(ax ax1, int i)
    {
        if(i != 0)
        {
            return false;
        }
        if(i != 0)
        {
            return false;
        } else
        {
            func_151_a("/mob/spider_eyes.png");
            float f = (1.0F - ax1.func_382_a(1.0F)) * 0.5F;
            GL11.glEnable(3042);
            GL11.glDisable(3008);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
            return true;
        }
    }

    protected float func_172_a(ge ge)
    {
        return func_191_a((ax)ge);
    }

    protected boolean func_166_a(ge ge, int i)
    {
        return func_190_a((ax)ge, i);
    }
}
