// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import net.minecraft.server.MinecraftServer;

class v
    implements java.awt.event.ActionListener
{

    final javax.swing.JTextField a;
    final fo b;

    v(fo fo1, javax.swing.JTextField jtextfield)
    {
        super();
        b = fo1;
        a = jtextfield;
    }

    public void actionPerformed(java.awt.event.ActionEvent actionevent)
    {
        java.lang.String s = a.getText().trim();
        if(s.length() > 0)
            fo.a(b).a(s, ((ef) (b)));
        a.setText("");
    }
}
