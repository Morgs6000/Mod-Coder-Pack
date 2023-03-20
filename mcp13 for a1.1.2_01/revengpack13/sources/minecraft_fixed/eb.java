// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class eb
{

    private java.util.Random c;
    private java.util.Map d;
    private java.util.List e;
    public int a;
    public boolean b;

    public eb()
    {
        c = new Random();
        d = ((java.util.Map) (new HashMap()));
        e = ((java.util.List) (new ArrayList()));
        a = 0;
        b = true;
    }

    public ah a(java.lang.String s, java.io.File file)
    {
        try
        {
            java.lang.String s1 = s;
            s = s.substring(0, s.indexOf("."));
            if(b)
                for(; java.lang.Character.isDigit(s.charAt(s.length() - 1)); s = s.substring(0, s.length() - 1));
            s = s.replaceAll("/", ".");
            if(!d.containsKey(((java.lang.Object) (s))))
                d.put(((java.lang.Object) (s)), ((java.lang.Object) (new ArrayList())));
            ah ah1 = new ah(s1, file.toURI().toURL());
            ((java.util.List)d.get(((java.lang.Object) (s)))).add(((java.lang.Object) (ah1)));
            e.add(((java.lang.Object) (ah1)));
            a++;
            return ah1;
        }
        catch(java.net.MalformedURLException malformedurlexception)
        {
            malformedurlexception.printStackTrace();
            throw new RuntimeException(((java.lang.Throwable) (malformedurlexception)));
        }
    }

    public ah a(java.lang.String s)
    {
        java.util.List list = (java.util.List)d.get(((java.lang.Object) (s)));
        if(list == null)
            return null;
        else
            return (ah)list.get(c.nextInt(list.size()));
    }

    public ah a()
    {
        if(e.size() == 0)
            return null;
        else
            return (ah)e.get(c.nextInt(e.size()));
    }
}
