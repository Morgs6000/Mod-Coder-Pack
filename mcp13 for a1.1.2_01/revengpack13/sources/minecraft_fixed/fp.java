// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import Minecraft;

public final class fp extends java.awt.event.WindowAdapter
{

    final Minecraft a;
    final java.lang.Thread b;

    public fp(Minecraft minecraft, java.lang.Thread thread)
    {
        super();
        a = minecraft;
        b = thread;
    }

    public void windowClosing(java.awt.event.WindowEvent windowevent)
    {
        a.d();
        try
        {
            b.join();
        }
        catch(java.lang.InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        java.lang.System.exit(0);
    }
}
