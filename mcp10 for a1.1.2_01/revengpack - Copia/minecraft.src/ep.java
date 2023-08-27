// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import paulscode.sound.codecs.CodecJOrbis;

public class ep extends paulscode.sound.codecs.CodecJOrbis
{

    public ep()
    {
    }

    protected java.io.InputStream openInputStream()
    {
        try {
			return ((java.io.InputStream) (new hk(this, url, urlConnection.getInputStream())));
		} catch (IOException e) {
			return null;
		}
    }
}
