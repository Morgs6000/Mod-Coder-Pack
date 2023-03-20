// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
//import Minecraft;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class bf extends java.lang.Thread
{

    public java.io.File a;
    private Minecraft b;
    private boolean c;

    public bf(java.io.File file, Minecraft minecraft)
    {
        c = false;
        b = minecraft;
        setName("Resource download thread");
        setDaemon(true);
        a = new File(file, "resources/");
        if(!a.exists() && !a.mkdirs())
            throw new RuntimeException((new StringBuilder()).append("The working directory could not be created: ").append(((java.lang.Object) (a))).toString());
        else
            return;
    }

    public void run()
    {
        try {
        java.net.URL url;
        org.w3c.dom.NodeList nodelist;
        int i;
        url = new URL("http://s3.amazonaws.com/MinecraftResources/");
        javax.xml.parsers.DocumentBuilderFactory documentbuilderfactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder documentbuilder = documentbuilderfactory.newDocumentBuilder();
        org.w3c.dom.Document document = documentbuilder.parse(url.openStream());
        nodelist = document.getElementsByTagName("Contents");
            for (i = 0; i < 2; i++)
              for (int j = 0; j < nodelist.getLength(); j++) {
        org.w3c.dom.Node node = nodelist.item(j);
        if(node.getNodeType() == 1)
        {
            org.w3c.dom.Element element = (org.w3c.dom.Element)node;
            java.lang.String s = ((org.w3c.dom.Element)element.getElementsByTagName("Key").item(0)).getChildNodes().item(0).getNodeValue();
            long l = java.lang.Long.parseLong(((org.w3c.dom.Element)element.getElementsByTagName("Size").item(0)).getChildNodes().item(0).getNodeValue());
            if(l > 0L)
            {
                a(url, s, l, i);
                if(c)
                    return;
            }
        }
              }
          }
          catch (java.lang.Exception exception)
          {
        a(a, "");
        exception.printStackTrace();
          }
    }

    public void a()
    {
        a(a, "");
    }

    private void a(java.io.File file, java.lang.String s)
    {
        java.io.File afile[] = file.listFiles();
        for(int i = 0; i < afile.length; i++)
        {
            if(afile[i].isDirectory())
            {
                a(afile[i], (new StringBuilder()).append(s).append(afile[i].getName()).append("/").toString());
                continue;
            }
            try
            {
                b.a((new StringBuilder()).append(s).append(afile[i].getName()).toString(), afile[i]);
            }
            catch(java.lang.Exception exception)
            {
                java.lang.System.out.println((new StringBuilder()).append("Failed to add ").append(s).append(afile[i].getName()).toString());
            }
        }

    }

    private void a(java.net.URL url, java.lang.String s, long l, int i)
    {
        try
        {
        int j = s.indexOf("/");
        java.lang.String s1 = s.substring(0, j);
        if(s1.equals("sound") || s1.equals("newsound"))
        {
            if(i != 0)
                return;
        }
        if(i != 1)
            return;
        java.io.File file;
        file = new File(a, s);
        if(!file.exists() || file.length() != l)
        {
            file.getParentFile().mkdirs();
            java.lang.String s2 = s.replaceAll(" ", "%20");
            a(new URL(url, s2), file, l);
            if(c)
                return;
        }
            b.a(s, file);
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void a(java.net.URL url, java.io.File file, long l) throws IOException
    {
        byte abyte0[] = new byte[4096];
        java.io.DataInputStream datainputstream = new DataInputStream(url.openStream());
        java.io.DataOutputStream dataoutputstream = new DataOutputStream(((java.io.OutputStream) (new FileOutputStream(file))));
        for(int i = 0; (i = datainputstream.read(abyte0)) >= 0;)
        {
            dataoutputstream.write(abyte0, 0, i);
            if(c)
                return;
        }

        datainputstream.close();
        dataoutputstream.close();
    }

    public void b()
    {
        c = true;
    }
}
