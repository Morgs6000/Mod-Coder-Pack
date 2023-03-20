// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

//import Minecraft;

public class fl extends java.lang.Thread
{

    final Minecraft a;

    public fl(Minecraft minecraft, java.lang.String s)
    {
        super(s);
        a = minecraft;
        setDaemon(true);
        start();
    }

    public void run()
    {
        while(a.F) 
            try
            {
                java.lang.Thread.sleep(0x7fffffffL);
            }
            catch(java.lang.InterruptedException interruptedexception) { }
    }
}
