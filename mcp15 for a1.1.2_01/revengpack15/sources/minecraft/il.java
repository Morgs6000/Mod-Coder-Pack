// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class il extends hq
{

    public il(Minecraft minecraft)
    {
        super(minecraft);
        field_1064_b = true;
    }

    public void func_718_b(dm dm1)
    {
        for(int i = 0; i < 9; i++)
        {
            if(dm1.field_778_b.field_843_a[i] == null)
            {
                field_1065_a.field_178_g.field_778_b.field_843_a[i] = new ev(((ly)dl.field_1667_a.get(i)).field_376_bc);
            } else
            {
                field_1065_a.field_178_g.field_778_b.field_843_a[i].field_1615_a = 1;
            }
        }

    }

    public boolean func_725_d()
    {
        return false;
    }

    public void func_717_a(cn cn)
    {
        super.func_717_a(cn);
    }

    public void func_728_c()
    {
    }
}
