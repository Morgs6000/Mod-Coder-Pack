// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

public class cl
{

    public static java.util.logging.Logger a = java.util.logging.Logger.getLogger("Minecraft");
    private java.io.File b;

    public cl(java.io.File file)
    {
        b = file;
        file.mkdir();
    }

    public void a(ea ea1)
    {
        try
        {
            s s1 = new s();
            ea1.d(s1);
            java.io.File file = new File(b, "_tmp_.dat");
            java.io.File file1 = new File(b, (new StringBuilder()).append(ea1.aq).append(".dat").toString());
            aj.a(s1, ((java.io.OutputStream) (new FileOutputStream(file))));
            if(file1.exists())
                file1.delete();
            file.renameTo(file1);
        }
        catch(java.lang.Exception exception)
        {
            a.warning((new StringBuilder()).append("Failed to save player data for ").append(ea1.aq).toString());
        }
    }

    public void b(ea ea1)
    {
        try
        {
            java.io.File file = new File(b, (new StringBuilder()).append(ea1.aq).append(".dat").toString());
            if(file.exists())
            {
                s s1 = aj.a(((java.io.InputStream) (new FileInputStream(file))));
                if(s1 != null)
                    ea1.e(s1);
            }
        }
        catch(java.lang.Exception exception)
        {
            a.warning((new StringBuilder()).append("Failed to load player data for ").append(ea1.aq).toString());
        }
    }

}
