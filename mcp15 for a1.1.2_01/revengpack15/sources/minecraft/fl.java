// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;

public class fl extends Thread
{

    public fl(Minecraft minecraft, String s)
    {
        super(s);
        field_1588_a = minecraft;
        setDaemon(true);
        start();
    }

    public void run()
    {
        while(field_1588_a.field_153_F) 
        {
            try
            {
                Thread.sleep(0x7fffffffL);
            }
            catch(InterruptedException interruptedexception) { }
        }
    }

    final Minecraft field_1588_a; /* synthetic field */
}
