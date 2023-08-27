// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ig extends as
{

    public java.lang.String e[] = {
        "", "", "", ""
    };
    public int f;

    public ig()
    {
        f = -1;
    }

    public void b(s s1)
    {
        super.b(s1);
        s1.a("Text1", e[0]);
        s1.a("Text2", e[1]);
        s1.a("Text3", e[2]);
        s1.a("Text4", e[3]);
    }

    public void a(s s1)
    {
        super.a(s1);
        for(int i = 0; i < 4; i++)
        {
            e[i] = s1.h((new StringBuilder()).append("Text").append(i + 1).toString());
            if(e[i].length() > 15)
                e[i] = e[i].substring(0, 15);
        }

    }
}
