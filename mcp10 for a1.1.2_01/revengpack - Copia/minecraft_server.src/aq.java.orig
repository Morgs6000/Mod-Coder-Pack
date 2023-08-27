// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;

public class aq extends java.awt.Panel
{

    public aq(go go1)
    {
        setBackground(new Color(0x2e3444));
        setLayout(((java.awt.LayoutManager) (new BorderLayout())));
        java.io.StringWriter stringwriter = new StringWriter();
        go1.b.printStackTrace(new PrintWriter(((java.io.Writer) (stringwriter))));
        java.lang.String s = stringwriter.toString();
        java.lang.String s1 = "";
        java.lang.String s2 = "";
        try
        {
            s2 = (new StringBuilder()).append(s2).append("Generated ").append((new SimpleDateFormat()).format(new Date())).append("\n").toString();
            s2 = (new StringBuilder()).append(s2).append("\n").toString();
            s2 = (new StringBuilder()).append(s2).append("Minecraft: Minecraft Alpha v1.1.2_01\n").toString();
            s2 = (new StringBuilder()).append(s2).append("OS: ").append(java.lang.System.getProperty("os.name")).append(" (").append(java.lang.System.getProperty("os.arch")).append(") version ").append(java.lang.System.getProperty("os.version")).append("\n").toString();
            s2 = (new StringBuilder()).append(s2).append("Java: ").append(java.lang.System.getProperty("java.version")).append(", ").append(java.lang.System.getProperty("java.vendor")).append("\n").toString();
            s2 = (new StringBuilder()).append(s2).append("VM: ").append(java.lang.System.getProperty("java.vm.name")).append(" (").append(java.lang.System.getProperty("java.vm.info")).append("), ").append(java.lang.System.getProperty("java.vm.vendor")).append("\n").toString();
            s2 = (new StringBuilder()).append(s2).append("LWJGL: ").append(org.lwjgl.Sys.getVersion()).append("\n").toString();
            s1 = org.lwjgl.opengl.GL11.glGetString(7936);
            s2 = (new StringBuilder()).append(s2).append("OpenGL: ").append(org.lwjgl.opengl.GL11.glGetString(7937)).append(" version ").append(org.lwjgl.opengl.GL11.glGetString(7938)).append(", ").append(org.lwjgl.opengl.GL11.glGetString(7936)).append("\n").toString();
        }
        catch(java.lang.Throwable throwable)
        {
            s2 = (new StringBuilder()).append(s2).append("[failed to get system properties (").append(((java.lang.Object) (throwable))).append(")]\n").toString();
        }
        s2 = (new StringBuilder()).append(s2).append("\n").toString();
        s2 = (new StringBuilder()).append(s2).append(s).toString();
        java.lang.String s3 = "";
        s3 = (new StringBuilder()).append(s3).append("\n").toString();
        s3 = (new StringBuilder()).append(s3).append("\n").toString();
        if(s.contains("Pixel format not accelerated"))
        {
            s3 = (new StringBuilder()).append(s3).append("      Bad video card drivers!      \n").toString();
            s3 = (new StringBuilder()).append(s3).append("      -----------------------      \n").toString();
            s3 = (new StringBuilder()).append(s3).append("\n").toString();
            s3 = (new StringBuilder()).append(s3).append("Minecraft was unable to start because it failed to find an accelerated OpenGL mode.\n").toString();
            s3 = (new StringBuilder()).append(s3).append("This can usually be fixed by updating the video card drivers.\n").toString();
            if(s1.toLowerCase().contains("nvidia"))
            {
                s3 = (new StringBuilder()).append(s3).append("\n").toString();
                s3 = (new StringBuilder()).append(s3).append("You might be able to find drivers for your video card here:\n").toString();
                s3 = (new StringBuilder()).append(s3).append("  http://www.nvidia.com/\n").toString();
            } else
            if(s1.toLowerCase().contains("ati"))
            {
                s3 = (new StringBuilder()).append(s3).append("\n").toString();
                s3 = (new StringBuilder()).append(s3).append("You might be able to find drivers for your video card here:\n").toString();
                s3 = (new StringBuilder()).append(s3).append("  http://www.amd.com/\n").toString();
            }
        } else
        {
            s3 = (new StringBuilder()).append(s3).append("      Minecraft has crashed!      \n").toString();
            s3 = (new StringBuilder()).append(s3).append("      ----------------------      \n").toString();
            s3 = (new StringBuilder()).append(s3).append("\n").toString();
            s3 = (new StringBuilder()).append(s3).append("Minecraft has stopped running because it encountered a problem.\n").toString();
            s3 = (new StringBuilder()).append(s3).append("\n").toString();
            s3 = (new StringBuilder()).append(s3).append("If you wish to report this, please copy this entire text and email it to support@mojang.com.\n").toString();
            s3 = (new StringBuilder()).append(s3).append("Please include a description of what you did when the error occured.\n").toString();
        }
        s3 = (new StringBuilder()).append(s3).append("\n").toString();
        s3 = (new StringBuilder()).append(s3).append("\n").toString();
        s3 = (new StringBuilder()).append(s3).append("\n").toString();
        s3 = (new StringBuilder()).append(s3).append("--- BEGIN ERROR REPORT ").append(java.lang.Integer.toHexString(s3.hashCode())).append(" --------\n").toString();
        s3 = (new StringBuilder()).append(s3).append(s2).toString();
        s3 = (new StringBuilder()).append(s3).append("--- END ERROR REPORT ").append(java.lang.Integer.toHexString(s3.hashCode())).append(" ----------\n").toString();
        s3 = (new StringBuilder()).append(s3).append("\n").toString();
        s3 = (new StringBuilder()).append(s3).append("\n").toString();
        java.awt.TextArea textarea = new TextArea(s3, 0, 0, 1);
        textarea.setFont(new Font("Monospaced", 0, 12));
        add(((java.awt.Component) (new db())), "North");
        add(((java.awt.Component) (new nb(80))), "East");
        add(((java.awt.Component) (new nb(80))), "West");
        add(((java.awt.Component) (new nb(100))), "South");
        add(((java.awt.Component) (textarea)), "Center");
    }
}
