// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import java.util.Vector;
import javax.swing.JList;
import net.minecraft.server.MinecraftServer;

public class h extends javax.swing.JList
    implements dw
{

    private net.minecraft.server.MinecraftServer a;
    private int b;

    public h(net.minecraft.server.MinecraftServer minecraftserver)
    {
        b = 0;
        a = minecraftserver;
        minecraftserver.a(((dw) (this)));
    }

    public void a()
    {
        if(b++ % 20 == 0)
        {
            java.util.Vector vector = new Vector();
            for(int i = 0; i < a.f.b.size(); i++)
                vector.add(((java.lang.Object) (((ea)a.f.b.get(i)).aq)));

            setListData(vector);
        }
    }
}
