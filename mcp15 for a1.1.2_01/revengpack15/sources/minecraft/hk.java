// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

class hk extends InputStream
{

    public hk(ep ep1, URL url, InputStream inputstream)
    {
        super();
        field_1513_b = ep1;
        field_1514_a = new byte[1];
        field_1515_d = inputstream;
        String s = url.getPath();
        s = s.substring(s.lastIndexOf("/") + 1);
        field_1516_c = s.hashCode();
    }

    public int read()
    {
        int i = read(field_1514_a, 0, 1);
        if(i < 0)
        {
            return i;
        } else
        {
            return field_1514_a[0];
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        try {
			j = field_1515_d.read(abyte0, i, j);
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
        for(int k = 0; k < j; k++)
        {
            byte byte0 = abyte0[i + k] ^= field_1516_c >> 8;
            field_1516_c = field_1516_c * 0x1dba038f + 0x14ee3 * byte0;
        }

        return j;
    }

    private int field_1516_c;
    private InputStream field_1515_d;
    byte field_1514_a[];
    final ep field_1513_b; /* synthetic field */
}
