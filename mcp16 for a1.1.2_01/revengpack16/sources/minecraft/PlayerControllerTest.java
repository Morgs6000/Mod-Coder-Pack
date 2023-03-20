// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;

public class PlayerControllerTest extends PlayerController
{

    public PlayerControllerTest(Minecraft minecraft)
    {
        super(minecraft);
        field_1064_b = true;
    }

    public void func_718_b(EntityPlayer entityplayer)
    {
        for(int i = 0; i < 9; i++)
        {
            if(entityplayer.field_778_b.mainInventory[i] == null)
            {
                field_1065_a.field_178_g.field_778_b.mainInventory[i] = new ItemStack(((Block)Session.field_1667_a.get(i)).blockID);
            } else
            {
                field_1065_a.field_178_g.field_778_b.mainInventory[i].stackSize = 1;
            }
        }

    }

    public boolean func_725_d()
    {
        return false;
    }

    public void func_717_a(World world)
    {
        super.func_717_a(world);
    }

    public void func_728_c()
    {
    }
}
