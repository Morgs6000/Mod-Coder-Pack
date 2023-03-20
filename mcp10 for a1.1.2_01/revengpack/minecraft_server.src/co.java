// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import javax.swing.JTextArea;
import javax.swing.text.Document;

public class co extends java.util.logging.Handler
{

    private int b[];
    private int c;
    java.util.logging.Formatter a;
    private javax.swing.JTextArea d;

    public co(javax.swing.JTextArea jtextarea)
    {
        b = new int[1024];
        c = 0;
        a = ((java.util.logging.Formatter) (new gb(this)));
        setFormatter(a);
        d = jtextarea;
    }

    public void close()
    {
    }

    public void flush()
    {
    }

    public void publish(java.util.logging.LogRecord logrecord)
    {
        int i = d.getDocument().getLength();
        d.append(a.format(logrecord));
        d.setCaretPosition(d.getDocument().getLength());
        int j = d.getDocument().getLength() - i;
        if(b[c] != 0)
            d.replaceRange("", 0, b[c]);
        b[c] = j;
        c = (c + 1) % 1024;
    }
}
