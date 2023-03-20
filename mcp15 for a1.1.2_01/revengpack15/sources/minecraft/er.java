// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public enum er
{
    Kebab("Kebab", 16, 16, 0, 0),
    Aztec("Aztec", 16, 16, 16, 0),
    Alban("Alban", 16, 16, 32, 0),
    Aztec2("Aztec2", 16, 16, 48, 0),
    Bomb("Bomb", 16, 16, 64, 0),
    Plant("Plant", 16, 16, 80, 0),
    Wasteland("Wasteland", 16, 16, 96, 0),
    Pool("Pool", 32, 16, 0, 32),
    Courbet("Courbet", 32, 16, 32, 32),
    Sea("Sea", 32, 16, 64, 32),
    Sunset("Sunset", 32, 16, 96, 32),
    Creebet("Creebet", 32, 16, 128, 32),
    Wanderer("Wanderer", 16, 32, 0, 64),
    Graham("Graham", 16, 32, 16, 64),
    Match("Match", 32, 32, 0, 128),
    Bust("Bust", 32, 32, 32, 128),
    Stage("Stage", 32, 32, 64, 128),
    Void("Void", 32, 32, 96, 128),
    SkullAndRoses("SkullAndRoses", 32, 32, 128, 128),
    Fighters("Fighters", 64, 32, 0, 96),
    Pointer("Pointer", 64, 64, 0, 192),
    Pigscene("Pigscene", 64, 64, 64, 192),
    Skeleton("Skeleton", 64, 48, 192, 64),
    DonkeyKong("DonkeyKong", 64, 48, 192, 112);
/*
    public static er[] values()
    {
        return (er[])field_1630_D.clone();
    }

    public static er valueOf(String s)
    {
        return (er)Enum.valueOf(er.class, s);
    }
*/
    private er(String s1, int j, int k, int l, int i1)
    {
        field_1624_y = s1;
        field_1623_z = j;
        field_1636_A = k;
        field_1634_B = l;
        field_1632_C = i1;
    }
/*
    public static final er Kebab;
    public static final er Aztec;
    public static final er Alban;
    public static final er Aztec2;
    public static final er Bomb;
    public static final er Plant;
    public static final er Wasteland;
    public static final er Pool;
    public static final er Courbet;
    public static final er Sea;
    public static final er Sunset;
    public static final er Creebet;
    public static final er Wanderer;
    public static final er Graham;
    public static final er Match;
    public static final er Bust;
    public static final er Stage;
    public static final er Void;
    public static final er SkullAndRoses;
    public static final er Fighters;
    public static final er Pointer;
    public static final er Pigscene;
    public static final er Skeleton;
    public static final er DonkeyKong;
*/
    public final String field_1624_y;
    public final int field_1623_z;
    public final int field_1636_A;
    public final int field_1634_B;
    public final int field_1632_C;
//    private static final er field_1630_D[]; /* synthetic field */
/*
    static 
    {
        Kebab = new er("Kebab", 0, "Kebab", 16, 16, 0, 0);
        Aztec = new er("Aztec", 1, "Aztec", 16, 16, 16, 0);
        Alban = new er("Alban", 2, "Alban", 16, 16, 32, 0);
        Aztec2 = new er("Aztec2", 3, "Aztec2", 16, 16, 48, 0);
        Bomb = new er("Bomb", 4, "Bomb", 16, 16, 64, 0);
        Plant = new er("Plant", 5, "Plant", 16, 16, 80, 0);
        Wasteland = new er("Wasteland", 6, "Wasteland", 16, 16, 96, 0);
        Pool = new er("Pool", 7, "Pool", 32, 16, 0, 32);
        Courbet = new er("Courbet", 8, "Courbet", 32, 16, 32, 32);
        Sea = new er("Sea", 9, "Sea", 32, 16, 64, 32);
        Sunset = new er("Sunset", 10, "Sunset", 32, 16, 96, 32);
        Creebet = new er("Creebet", 11, "Creebet", 32, 16, 128, 32);
        Wanderer = new er("Wanderer", 12, "Wanderer", 16, 32, 0, 64);
        Graham = new er("Graham", 13, "Graham", 16, 32, 16, 64);
        Match = new er("Match", 14, "Match", 32, 32, 0, 128);
        Bust = new er("Bust", 15, "Bust", 32, 32, 32, 128);
        Stage = new er("Stage", 16, "Stage", 32, 32, 64, 128);
        Void = new er("Void", 17, "Void", 32, 32, 96, 128);
        SkullAndRoses = new er("SkullAndRoses", 18, "SkullAndRoses", 32, 32, 128, 128);
        Fighters = new er("Fighters", 19, "Fighters", 64, 32, 0, 96);
        Pointer = new er("Pointer", 20, "Pointer", 64, 64, 0, 192);
        Pigscene = new er("Pigscene", 21, "Pigscene", 64, 64, 64, 192);
        Skeleton = new er("Skeleton", 22, "Skeleton", 64, 48, 192, 64);
        DonkeyKong = new er("DonkeyKong", 23, "DonkeyKong", 64, 48, 192, 112);
        field_1630_D = (new er[] {
            Kebab, Aztec, Alban, Aztec2, Bomb, Plant, Wasteland, Pool, Courbet, Sea, 
            Sunset, Creebet, Wanderer, Graham, Match, Bust, Stage, Void, SkullAndRoses, Fighters, 
            Pointer, Pigscene, Skeleton, DonkeyKong
        });
    }
*/
}
