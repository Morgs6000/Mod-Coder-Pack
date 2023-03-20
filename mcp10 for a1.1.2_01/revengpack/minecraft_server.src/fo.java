// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import net.minecraft.server.MinecraftServer;

public class fo extends javax.swing.JComponent
    implements ef
{

    public static java.util.logging.Logger a = java.util.logging.Logger.getLogger("Minecraft");
    private net.minecraft.server.MinecraftServer b;

    public static void a(net.minecraft.server.MinecraftServer minecraftserver)
    {
        try
        {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }
        catch(java.lang.Exception exception) { }
        fo fo1 = new fo(minecraftserver);
        javax.swing.JFrame jframe = new JFrame("Minecraft server");
        jframe.add(((java.awt.Component) (fo1)));
        jframe.pack();
        jframe.setLocationRelativeTo(((java.awt.Component) (null)));
        jframe.setVisible(true);
        jframe.addWindowListener(((java.awt.event.WindowListener) (new t(minecraftserver))));
    }

    public fo(net.minecraft.server.MinecraftServer minecraftserver)
    {
        b = minecraftserver;
        setPreferredSize(new Dimension(854, 480));
        setLayout(((java.awt.LayoutManager) (new BorderLayout())));
        try
        {
            add(((java.awt.Component) (d())), "Center");
            add(((java.awt.Component) (a())), "West");
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private javax.swing.JComponent a()
    {
        javax.swing.JPanel jpanel = new JPanel(((java.awt.LayoutManager) (new BorderLayout())));
        jpanel.add(((java.awt.Component) (new hx())), "North");
        jpanel.add(((java.awt.Component) (b())), "Center");
        jpanel.setBorder(((javax.swing.border.Border) (new TitledBorder(((javax.swing.border.Border) (new EtchedBorder())), "Stats"))));
        return ((javax.swing.JComponent) (jpanel));
    }

    private javax.swing.JComponent b()
    {
        h h1 = new h(b);
        javax.swing.JScrollPane jscrollpane = new JScrollPane(((java.awt.Component) (h1)), 22, 30);
        jscrollpane.setBorder(((javax.swing.border.Border) (new TitledBorder(((javax.swing.border.Border) (new EtchedBorder())), "Players"))));
        return ((javax.swing.JComponent) (jscrollpane));
    }

    private javax.swing.JComponent d()
    {
        javax.swing.JPanel jpanel = new JPanel(((java.awt.LayoutManager) (new BorderLayout())));
        javax.swing.JTextArea jtextarea = new JTextArea();
        a.addHandler(((java.util.logging.Handler) (new co(jtextarea))));
        javax.swing.JScrollPane jscrollpane = new JScrollPane(((java.awt.Component) (jtextarea)), 22, 30);
        jtextarea.setEditable(false);
        javax.swing.JTextField jtextfield = new JTextField();
        jtextfield.addActionListener(((java.awt.event.ActionListener) (new v(this, jtextfield))));
        jtextarea.addFocusListener(((java.awt.event.FocusListener) (new w(this))));
        jpanel.add(((java.awt.Component) (jscrollpane)), "Center");
        jpanel.add(((java.awt.Component) (jtextfield)), "South");
        jpanel.setBorder(((javax.swing.border.Border) (new TitledBorder(((javax.swing.border.Border) (new EtchedBorder())), "Log and chat"))));
        return ((javax.swing.JComponent) (jpanel));
    }

    public void b(java.lang.String s)
    {
        a.info(s);
    }

    public java.lang.String c()
    {
        return "CONSOLE";
    }

    static net.minecraft.server.MinecraftServer a(fo fo1)
    {
        return fo1.b;
    }

}
