// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import net.minecraft.client.Minecraft;

public class gc extends bh
{

    private bh a;
    private int h;
    private java.lang.String i;

    public gc(bh bh1)
    {
        h = 0;
        i = "";
        a = bh1;
    }

    public void g()
    {
        h++;
    }

    public void a()
    {
        e.clear();
        e.add(((java.lang.Object) (new fk(0, c / 2 - 100, d / 4 + 96 + 12, "Connect"))));
        e.add(((java.lang.Object) (new fk(1, c / 2 - 100, d / 4 + 120 + 12, "Cancel"))));
        ((fk)e.get(0)).g = false;
    }

    protected void a(fk fk1)
    {
        if(!fk1.g)
            return;
        if(fk1.f == 1)
            b.a(a);
        else
        if(fk1.f == 0)
        {
            java.lang.String as[] = i.split(":");
            b.a(((bh) (new mn(b, as[0], as.length <= 1 ? 25565 : java.lang.Integer.parseInt(as[1])))));
        }
    }

    protected void a(char c, int jparm)
    {
        if (c == '\026') {
            String str = bh.c();
            if (str == null) str = "";
            int j = 32 - this.i.length();
            if (j > str.length()) j = str.length();
            if (j > 0) {
              this.i += str.substring(0, j);
            }
          }
          if (c == '\r') {
            a((fk)this.e.get(0));
          }

          if ((c == 14) && (this.i.length() > 0)) this.i = this.i.substring(0, this.i.length() - 1);
          if ((" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(c) >= 0) && (this.i.length() < 32)) {
            this.i += c;
          }
          ((fk)this.e.get(0)).g = (this.i.length() > 0);
    }

    public void a(int j, int k, float f)
    {
        i();
        a(g, "Play Multiplayer", this.c / 2, (d / 4 - 60) + 20, 0xffffff);
        b(g, "Minecraft Multiplayer is currently not finished, but there", this.c / 2 - 140, (d / 4 - 60) + 60 + 0, 0xa0a0a0);
        b(g, "is some buggy early testing going on.", this.c / 2 - 140, (d / 4 - 60) + 60 + 9, 0xa0a0a0);
        b(g, "Enter the IP of a server to connect to it:", this.c / 2 - 140, (d / 4 - 60) + 60 + 36, 0xa0a0a0);
        int l = this.c / 2 - 100;
        int i1 = (d / 4 - 10) + 50 + 18;
        char c = '\310';
        byte byte0 = 20;
        a(l - 1, i1 - 1, l + c + 1, i1 + byte0 + 1, 0xffa0a0a0);
        a(l, i1, l + c, i1 + byte0, 0xff000000);
        b(g, (new StringBuilder()).append(i).append((h / 6) % 2 != 0 ? "" : "_").toString(), l + 4, i1 + (byte0 - 8) / 2, 0xe0e0e0);
        super.a(j, k, f);
    }
}
