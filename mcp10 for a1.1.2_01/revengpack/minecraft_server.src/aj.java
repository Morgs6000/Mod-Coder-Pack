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

public class aj
{

    public aj()
    {
    }

    public static s a(java.io.InputStream inputstream) throws IOException
    {
        java.io.DataInputStream datainputstream = new DataInputStream(((java.io.InputStream) (new GZIPInputStream(inputstream))));
        try
        {
        s s1 = aj.a(((java.io.DataInput) (datainputstream)));
        return s1;
        }
        finally
        {
        datainputstream.close();
        }
    }

    public static void a(s s1, java.io.OutputStream outputstream) throws IOException
    {
        java.io.DataOutputStream dataoutputstream = new DataOutputStream(((java.io.OutputStream) (new GZIPOutputStream(outputstream))));
        try
        {
        aj.a(s1, ((java.io.DataOutput) (dataoutputstream)));
        }
        finally
        {
        dataoutputstream.close();
        }
    }

    public static s a(byte abyte0[]) throws IOException
    {
        java.io.DataInputStream datainputstream = new DataInputStream(((java.io.InputStream) (new GZIPInputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0)))))));
        try
        {
        s s1 = aj.a(((java.io.DataInput) (datainputstream)));
        datainputstream.close();
        return s1;
        }
        finally
        {
        datainputstream.close();
        }
    }

    public static byte[] a(s s1) throws IOException
    {
        java.io.ByteArrayOutputStream bytearrayoutputstream;
        java.io.DataOutputStream dataoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        dataoutputstream = new DataOutputStream(((java.io.OutputStream) (new GZIPOutputStream(((java.io.OutputStream) (bytearrayoutputstream))))));
        try
        {
        aj.a(s1, ((java.io.DataOutput) (dataoutputstream)));
        }
        finally
        {
        dataoutputstream.close();
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static s a(java.io.DataInput datainput) throws IOException
    {
        gg gg1 = gg.b(datainput);
        if(gg1 instanceof s)
            return (s)gg1;
        else
            throw new IOException("Root tag must be a named compound tag");
    }

    public static void a(s s1, java.io.DataOutput dataoutput) throws IOException
    {
        gg.a(((gg) (s1)), dataoutput);
    }
}
