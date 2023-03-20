// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

class ThreadDownloadImage extends Thread
{

    ThreadDownloadImage(DownloadImageThreadData downloadimagethreaddata, String s, ImageBuffer imagebuffer)
    {
        field_1217_c = downloadimagethreaddata;
        field_1216_a = s;
        field_1215_b = imagebuffer;
    }

    public void run()
    {
        HttpURLConnection httpurlconnection = null;
        try
        {
            URL url = new URL(field_1216_a);
            httpurlconnection = (HttpURLConnection)url.openConnection();
            httpurlconnection.setDoInput(true);
            httpurlconnection.setDoOutput(false);
            httpurlconnection.connect();
            if(httpurlconnection.getResponseCode() == 404)
            {
                return;
            }
            if(field_1215_b == null)
            {
                field_1217_c.field_1706_a = ImageIO.read(httpurlconnection.getInputStream());
            } else
            {
                field_1217_c.field_1706_a = field_1215_b.func_883_a(ImageIO.read(httpurlconnection.getInputStream()));
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            httpurlconnection.disconnect();
        }
    }

    final String field_1216_a; /* synthetic field */
    final ImageBuffer field_1215_b; /* synthetic field */
    final DownloadImageThreadData field_1217_c; /* synthetic field */
}
