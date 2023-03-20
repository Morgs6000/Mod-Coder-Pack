// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class m extends fn
{

    public int a;
    public ev b[];

    public m()
    {
    }

    public m(int i, ev aev[])
    {
        a = i;
        b = new ev[aev.length];
        for(int j = 0; j < b.length; j++)
            b[j] = aev[j] != null ? aev[j].e() : null;

    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        short word0 = datainputstream.readShort();
        b = new ev[word0];
        for(int i = 0; i < word0; i++)
        {
            short word1 = datainputstream.readShort();
            if(word1 >= 0)
            {
                byte byte0 = datainputstream.readByte();
                short word2 = datainputstream.readShort();
                b[i] = new ev(((int) (word1)), ((int) (byte0)), ((int) (word2)));
            }
        }

    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeShort(b.length);
        for(int i = 0; i < b.length; i++)
            if(b[i] == null)
            {
                dataoutputstream.writeShort(-1);
            } else
            {
                dataoutputstream.writeShort(((int) ((short)b[i].c)));
                dataoutputstream.writeByte(((int) ((byte)b[i].a)));
                dataoutputstream.writeShort(((int) ((short)b[i].d)));
            }

    }

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 6 + b.length * 5;
    }
}
