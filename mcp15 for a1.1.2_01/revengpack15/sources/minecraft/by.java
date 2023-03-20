// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public enum by
{
    Sky(15),
    Block(0);

/*
    public static by[] func_1181_values()
    {
        return (by[])field_1721_d.clone();
    }

    public static by valueOf(String s)
    {
        return (by)Enum.valueOf(by.class, s);
    }
*/
    private by(int j)
    {
        field_1722_c = j;
    }
/*
    public static final by Sky;
    public static final by Block;
*/
    public final int field_1722_c;
//    private static final by field_1721_d[]; /* synthetic field */
/*
    static 
    {
        Sky = new by("Sky", 0, 15);
        Block = new by("Block", 1, 0);
        field_1721_d = (new by[] {
            Sky, Block
        });
    }
*/
}
