// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.*;

public class eb
{

    public eb()
    {
        field_1661_c = new Random();
        field_1660_d = new HashMap();
        field_1659_e = new ArrayList();
        field_1658_a = 0;
        field_1657_b = true;
    }

    public ah func_1117_a(String s, File file)
    {
        try
        {
            String s1 = s;
            s = s.substring(0, s.indexOf("."));
            if(field_1657_b)
            {
                for(; Character.isDigit(s.charAt(s.length() - 1)); s = s.substring(0, s.length() - 1)) { }
            }
            s = s.replaceAll("/", ".");
            if(!field_1660_d.containsKey(s))
            {
                field_1660_d.put(s, new ArrayList());
            }
            ah ah1 = new ah(s1, file.toURI().toURL());
            ((List)field_1660_d.get(s)).add(ah1);
            field_1659_e.add(ah1);
            field_1658_a++;
            return ah1;
        }
        catch(MalformedURLException malformedurlexception)
        {
            malformedurlexception.printStackTrace();
            throw new RuntimeException(malformedurlexception);
        }
    }

    public ah func_1118_a(String s)
    {
        List list = (List)field_1660_d.get(s);
        if(list == null)
        {
            return null;
        } else
        {
            return (ah)list.get(field_1661_c.nextInt(list.size()));
        }
    }

    public ah func_1116_a()
    {
        if(field_1659_e.size() == 0)
        {
            return null;
        } else
        {
            return (ah)field_1659_e.get(field_1661_c.nextInt(field_1659_e.size()));
        }
    }

    private Random field_1661_c;
    private Map field_1660_d;
    private List field_1659_e;
    public int field_1658_a;
    public boolean field_1657_b;
}
