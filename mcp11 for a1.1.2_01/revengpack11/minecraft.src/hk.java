// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

class hk extends java.io.InputStream
{

    private int c;
    private java.io.InputStream d;
    byte a[];
    final ep b;

    public hk(ep ep1, java.net.URL url, java.io.InputStream inputstream)
    {
        super();
        b = ep1;
        a = new byte[1];
        d = inputstream;
        java.lang.String s = url.getPath();
        s = s.substring(s.lastIndexOf("/") + 1);
        c = s.hashCode();
    }

    public int read()
    {
        int i = read(a, 0, 1);
        if(i < 0)
            return i;
        else
            return ((int) (a[0]));
    }

    public int read(byte abyte0[], int i, int j)
    {
        try {
			j = d.read(abyte0, i, j);
		} catch (IOException e) {
			return 0;
		}
        for(int k = 0; k < j; k++)
        {
            byte byte0 = abyte0[i + k] ^= ((byte) (c >> 8));
            c = c * 0x1dba038f + 0x14ee3 * byte0;
        }

        return j;
    }
}
