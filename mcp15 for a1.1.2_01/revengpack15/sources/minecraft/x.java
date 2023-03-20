// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class x
{

    public x()
    {
    }

    public static hm func_1138_a(InputStream inputstream) throws IOException
    {
        DataInputStream datainputstream = new DataInputStream(new GZIPInputStream(inputstream));
        try
        {
            hm hm1 = func_1141_a(datainputstream);
            return hm1;
        }
        finally
        {
            datainputstream.close();
        }
    }

    public static void func_1143_a(hm hm1, OutputStream outputstream) throws IOException
    {
        DataOutputStream dataoutputstream = new DataOutputStream(new GZIPOutputStream(outputstream));
        try
        {
            func_1139_a(hm1, dataoutputstream);
        }
        finally
        {
            dataoutputstream.close();
        }
    }

    public static hm func_1140_a(byte abyte0[]) throws IOException
    {
        DataInputStream datainputstream = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(abyte0)));
        try
        {
            hm hm1 = func_1141_a(datainputstream);
            return hm1;
        }
        finally
        {
            datainputstream.close();
        }
    }

    public static byte[] func_1142_a(hm hm1) throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        DataOutputStream dataoutputstream = new DataOutputStream(new GZIPOutputStream(bytearrayoutputstream));
        try
        {
            func_1139_a(hm1, dataoutputstream);
        }
        finally
        {
            dataoutputstream.close();
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static hm func_1141_a(DataInput datainput) throws IOException
    {
        el el1 = el.func_734_b(datainput);
        if(el1 instanceof hm)
        {
            return (hm)el1;
        } else
        {
            throw new IOException("Root tag must be a named compound tag");
        }
    }

    public static void func_1139_a(hm hm1, DataOutput dataoutput) throws IOException
    {
        el.func_738_a(hm1, dataoutput);
    }
}
