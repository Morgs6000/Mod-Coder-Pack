// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class x
{

    public x()
    {
    }

    public static hm a(java.io.InputStream inputstream) throws IOException
    {
        java.io.DataInputStream datainputstream = new DataInputStream(((java.io.InputStream) (new GZIPInputStream(inputstream))));
        try
        {
        hm hm1 = x.a(((java.io.DataInput) (datainputstream)));
        return hm1;
        }
        finally
        {
        datainputstream.close();
        }
    }

    public static void a(hm hm1, java.io.OutputStream outputstream) throws IOException
    {
        java.io.DataOutputStream dataoutputstream = new DataOutputStream(((java.io.OutputStream) (new GZIPOutputStream(outputstream))));
    try
    {
        x.a(hm1, ((java.io.DataOutput) (dataoutputstream)));
    }
    finally
    {
        dataoutputstream.close();

    }
    }

    public static hm a(byte abyte0[]) throws IOException
    {
        java.io.DataInputStream datainputstream = new DataInputStream(((java.io.InputStream) (new GZIPInputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0)))))));
        try
        {
        hm hm1 = x.a(((java.io.DataInput) (datainputstream)));
        return hm1;
        }
        finally
        {
        datainputstream.close();
        }
    }

    public static byte[] a(hm hm1) throws IOException
    {
        java.io.ByteArrayOutputStream bytearrayoutputstream;
        java.io.DataOutputStream dataoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        dataoutputstream = new DataOutputStream(((java.io.OutputStream) (new GZIPOutputStream(((java.io.OutputStream) (bytearrayoutputstream))))));
        try
        {
        x.a(hm1, ((java.io.DataOutput) (dataoutputstream)));
        }
        finally
        {
        dataoutputstream.close();

        }
        return bytearrayoutputstream.toByteArray();
    }

    public static hm a(java.io.DataInput datainput) throws IOException
    {
        el el1 = el.b(datainput);
        if(el1 instanceof hm)
            return (hm)el1;
        else
            throw new IOException("Root tag must be a named compound tag");
    }

    public static void a(hm hm1, java.io.DataOutput dataoutput) throws IOException
    {
        el.a(((el) (hm1)), dataoutput);
    }
}
