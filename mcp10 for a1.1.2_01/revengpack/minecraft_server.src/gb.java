// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

class gb extends java.util.logging.Formatter
{

    final co a;

    gb(co co1)
    {
        super();
        a = co1;
    }

    public java.lang.String format(java.util.logging.LogRecord logrecord)
    {
        java.lang.StringBuilder stringbuilder = new StringBuilder();
        java.util.logging.Level level = logrecord.getLevel();
        if(level == java.util.logging.Level.FINEST)
            stringbuilder.append("[FINEST] ");
        else
        if(level == java.util.logging.Level.FINER)
            stringbuilder.append("[FINER] ");
        else
        if(level == java.util.logging.Level.FINE)
            stringbuilder.append("[FINE] ");
        else
        if(level == java.util.logging.Level.INFO)
            stringbuilder.append("[INFO] ");
        else
        if(level == java.util.logging.Level.WARNING)
            stringbuilder.append("[WARNING] ");
        else
        if(level == java.util.logging.Level.SEVERE)
            stringbuilder.append("[SEVERE] ");
        else
        if(level == java.util.logging.Level.SEVERE)
            stringbuilder.append((new StringBuilder()).append("[").append(level.getLocalizedName()).append("] ").toString());
        stringbuilder.append(logrecord.getMessage());
        stringbuilder.append('\n');
        java.lang.Throwable throwable = logrecord.getThrown();
        if(throwable != null)
        {
            java.io.StringWriter stringwriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(((java.io.Writer) (stringwriter))));
            stringbuilder.append(stringwriter.toString());
        }
        return stringbuilder.toString();
    }
}
