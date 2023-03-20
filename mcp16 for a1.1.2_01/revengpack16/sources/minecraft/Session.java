// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Session
{

    public Session(String s, String s1)
    {
        field_1666_b = s;
        field_1669_c = s1;
    }

    public static List field_1667_a;
    public String field_1666_b;
    public String field_1669_c;
    public String field_1668_d;

    static 
    {
        field_1667_a = new ArrayList();
        field_1667_a.add(Block.stone);
        field_1667_a.add(Block.cobblestone);
        field_1667_a.add(Block.brick);
        field_1667_a.add(Block.dirt);
        field_1667_a.add(Block.planks);
        field_1667_a.add(Block.wood);
        field_1667_a.add(Block.leaves);
        field_1667_a.add(Block.torchWood);
        field_1667_a.add(Block.stairSingle);
        field_1667_a.add(Block.glass);
        field_1667_a.add(Block.cobblestoneMossy);
        field_1667_a.add(Block.sapling);
        field_1667_a.add(Block.plantYellow);
        field_1667_a.add(Block.plantRed);
        field_1667_a.add(Block.mushroomBrown);
        field_1667_a.add(Block.mushroomRed);
        field_1667_a.add(Block.sand);
        field_1667_a.add(Block.gravel);
        field_1667_a.add(Block.sponge);
        field_1667_a.add(Block.cloth);
        field_1667_a.add(Block.oreCoal);
        field_1667_a.add(Block.oreIron);
        field_1667_a.add(Block.oreGold);
        field_1667_a.add(Block.blockSteel);
        field_1667_a.add(Block.blockGold);
        field_1667_a.add(Block.bookShelf);
        field_1667_a.add(Block.tnt);
        field_1667_a.add(Block.obsidian);
        System.out.println(field_1667_a.size());
    }
}
