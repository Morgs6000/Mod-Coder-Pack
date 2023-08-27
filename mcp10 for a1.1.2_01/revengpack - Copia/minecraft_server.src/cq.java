// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cq
{

    public static java.util.logging.Logger a = java.util.logging.Logger.getLogger("Minecraft");
    private java.util.Properties b;
    private java.io.File c;

    public cq(java.io.File file)
    {
        b = new Properties();
        c = file;
        if(file.exists())
        {
            try
            {
                b.load(((java.io.InputStream) (new FileInputStream(file))));
            }
            catch(java.lang.Exception exception)
            {
                a.log(java.util.logging.Level.WARNING, (new StringBuilder()).append("Failed to load ").append(((java.lang.Object) (file))).toString(), ((java.lang.Throwable) (exception)));
                a();
            }
        } else
        {
            a.log(java.util.logging.Level.WARNING, (new StringBuilder()).append(((java.lang.Object) (file))).append(" does not exist").toString());
            a();
        }
    }

    public void a()
    {
        a.log(java.util.logging.Level.INFO, "Generating new properties file");
        b();
    }

    public void b()
    {
        try
        {
            b.store(((java.io.OutputStream) (new FileOutputStream(c))), "Minecraft server properties");
        }
        catch(java.lang.Exception exception)
        {
            a.log(java.util.logging.Level.WARNING, (new StringBuilder()).append("Failed to save ").append(((java.lang.Object) (c))).toString(), ((java.lang.Throwable) (exception)));
            a();
        }
    }

    public java.lang.String a(java.lang.String s, java.lang.String s1)
    {
        if(!b.containsKey(((java.lang.Object) (s))))
        {
            b.setProperty(s, s1);
            b();
        }
        return b.getProperty(s, s1);
    }

    public int a(java.lang.String s, int i)
    {
        try
        {
            return java.lang.Integer.parseInt(a(s, (new StringBuilder()).append("").append(i).toString()));
        }
        catch(java.lang.Exception exception)
        {
            b.setProperty(s, (new StringBuilder()).append("").append(i).toString());
        }
        return i;
    }

    public boolean a(java.lang.String s, boolean flag)
    {
        try
        {
            return java.lang.Boolean.parseBoolean(a(s, (new StringBuilder()).append("").append(flag).toString()));
        }
        catch(java.lang.Exception exception)
        {
            b.setProperty(s, (new StringBuilder()).append("").append(flag).toString());
        }
        return flag;
    }

}
