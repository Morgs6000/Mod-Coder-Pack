// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fk
{

    public static java.util.logging.Logger a = java.util.logging.Logger.getLogger("Minecraft");

    public fk()
    {
    }

    public static void a()
    {
        gx gx1 = new gx();
        a.setUseParentHandlers(false);
        java.util.logging.ConsoleHandler consolehandler = new ConsoleHandler();
        ((java.util.logging.Handler) (consolehandler)).setFormatter(((java.util.logging.Formatter) (gx1)));
        a.addHandler(((java.util.logging.Handler) (consolehandler)));
        try
        {
            java.util.logging.FileHandler filehandler = new FileHandler("server.log");
            ((java.util.logging.Handler) (filehandler)).setFormatter(((java.util.logging.Formatter) (gx1)));
            a.addHandler(((java.util.logging.Handler) (filehandler)));
        }
        catch(java.lang.Exception exception)
        {
            a.log(java.util.logging.Level.WARNING, "Failed to log to server.log", ((java.lang.Throwable) (exception)));
        }
    }

}
