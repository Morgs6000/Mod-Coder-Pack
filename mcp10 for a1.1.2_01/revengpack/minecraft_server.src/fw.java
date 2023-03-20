// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class fw
{

    private java.util.Set a;
    private hf b;
    private net.minecraft.server.MinecraftServer c;
    private int d;

    public fw(net.minecraft.server.MinecraftServer minecraftserver)
    {
        a = ((java.util.Set) (new HashSet()));
        b = new hf();
        c = minecraftserver;
        d = minecraftserver.f.a();
    }

    public void a(dj dj1)
    {
        if(dj1 instanceof ea)
        {
            a(dj1, 512, 2);
            ea ea1 = (ea)dj1;
            java.util.Iterator iterator = a.iterator();
            do
            {
                if(!iterator.hasNext())
                    break;
                fy fy1 = (fy)iterator.next();
                if(fy1.a != ea1)
                    fy1.a(ea1);
            } while(true);
        } else
        if(dj1 instanceof fn)
            a(dj1, 64, 20);
        else
        if(dj1 instanceof ih)
            a(dj1, 160, 4);
        else
        if(dj1 instanceof ab)
            a(dj1, 160, 2);
    }

    public void a(dj dj1, int i, int j)
    {
        if(i > d)
            i = d;
        if(b.b(dj1.c))
        {
            throw new IllegalStateException("Entity is already tracked!");
        } else
        {
            fy fy1 = new fy(dj1, i, j);
            a.add(((java.lang.Object) (fy1)));
            b.a(dj1.c, ((java.lang.Object) (fy1)));
            fy1.b(c.e.k);
            return;
        }
    }

    public void b(dj dj1)
    {
        fy fy1 = (fy)b.d(dj1.c);
        if(fy1 != null)
        {
            a.remove(((java.lang.Object) (fy1)));
            fy1.a();
        }
    }

    public void a()
    {
        java.util.ArrayList arraylist = new ArrayList();
        java.util.Iterator iterator = a.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            fy fy1 = (fy)iterator.next();
            fy1.a(c.e.k);
            if(fy1.j && (fy1.a instanceof ea))
                ((java.util.List) (arraylist)).add(((java.lang.Object) ((ea)fy1.a)));
        } while(true);
label0:
        for(int i = 0; i < ((java.util.List) (arraylist)).size(); i++)
        {
            ea ea1 = (ea)((java.util.List) (arraylist)).get(i);
            java.util.Iterator iterator1 = a.iterator();
            do
            {
                if(!iterator1.hasNext())
                    continue label0;
                fy fy2 = (fy)iterator1.next();
                if(fy2.a != ea1)
                    fy2.a(ea1);
            } while(true);
        }

    }

    public void a(dj dj1, hp hp)
    {
        fy fy1 = (fy)b.a(dj1.c);
        if(fy1 != null)
            fy1.a(hp);
    }
}
