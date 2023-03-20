// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

class kz extends java.lang.Thread
{

    final java.lang.String a;
    final hb b;
    final cc c;

    kz(cc cc1, java.lang.String s, hb hb1)
    {
        super();
        c = cc1;
        a = s;
        b = hb1;
    }

    public void run()
    {
        java.net.HttpURLConnection httpurlconnection = null;
        try {
        java.net.URL url = new URL(a);
        httpurlconnection = (java.net.HttpURLConnection)url.openConnection();
        httpurlconnection.setDoInput(true);
        httpurlconnection.setDoOutput(false);
        httpurlconnection.connect();
        if(httpurlconnection.getResponseCode() == 404)
        {
            httpurlconnection.disconnect();
            return;
          }
        if(b == null)
            c.a = javax.imageio.ImageIO.read(httpurlconnection.getInputStream());
        else
            c.a = b.a(javax.imageio.ImageIO.read(httpurlconnection.getInputStream()));
        }
        catch (java.lang.Exception exception)
        {
        exception.printStackTrace();
        }
        finally
        {
        httpurlconnection.disconnect();
        }
    }
}
