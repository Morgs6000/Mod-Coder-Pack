// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class de extends bh
{

    private java.lang.String a;
    private int h;

    public de()
    {
        a = "";
        h = 0;
    }

    public void a()
    {
        org.lwjgl.input.Keyboard.enableRepeatEvents(true);
    }

    public void h()
    {
        org.lwjgl.input.Keyboard.enableRepeatEvents(false);
    }

    public void g()
    {
        h++;
    }

    protected void a(char c, int i)
    {
        if(i == 1)
        {
            b.a(((bh) (null)));
            return;
        }
        if(i == 28)
        {
            java.lang.String s = a.trim();
            if(s.length() > 0)
                b.g.a(a.trim());
            b.a(((bh) (null)));
            return;
        }
        if(i == 14 && a.length() > 0)
            a = a.substring(0, a.length() - 1);
        if ((" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(c) >= 0) && (this.a.length() < 100))
            this.a += c;
    }

    public void a(int i, int j, float f)
    {
        a(2, d - 14, c - 2, d - 2, 0x80000000);
        b(g, (new StringBuilder()).append("> ").append(a).append((h / 6) % 2 != 0 ? "" : "_").toString(), 4, d - 12, 0xe0e0e0);
    }

    protected void a(int iparm, int j, int k)
    {
        if ((k == 0) && 
        	      (this.b.u.a != null)) {
        	      if ((this.a.length() > 0) && (!this.a.endsWith(" "))) {
        	        this.a += " ";
        	      }
        	      this.a += this.b.u.a;
        	      int i = 100;
        	      if (this.a.length() > i)
        	        this.a = this.a.substring(0, i);
        	    }
    }
}
