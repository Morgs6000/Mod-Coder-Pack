// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.PrintStream;
import java.util.Random;

public class ez
{

    protected static java.util.Random b = new Random();
    public static ez c[] = new ez[32000];
    public static ez d = (new gq(0, 2)).a(82);
    public static ez e = (new al(1, 2)).a(98);
    public static ez f = (new du(2, 2)).a(114);
    public static ez g = (new hz(3)).a(5);
    public static ez h = (new ix(4, 4)).a(10);
    public static ez i = (new bz(5)).a(21);
    public static ez j = (new ez(6)).a(37);
    public static ez k = (new ez(7)).a(7);
    public static ez l = (new ez(8)).a(55);
    public static ez m = (new ez(9)).a(23);
    public static ez n = (new ez(10)).a(39);
    public static ez o = (new bh(11, 2)).a(66);
    public static ez p = (new bh(12, 0)).a(64);
    public static ez q = (new gq(13, 0)).a(80);
    public static ez r = (new al(14, 0)).a(96);
    public static ez s = (new du(15, 0)).a(112);
    public static ez t = (new bh(16, 1)).a(65);
    public static ez u = (new gq(17, 1)).a(81);
    public static ez v = (new al(18, 1)).a(97);
    public static ez w = (new du(19, 1)).a(113);
    public static ez x = (new bh(20, 3)).a(67);
    public static ez y = (new gq(21, 3)).a(83);
    public static ez z = (new al(22, 3)).a(99);
    public static ez A = (new du(23, 3)).a(115);
    public static ez B = (new ez(24)).a(53).c();
    public static ez C = (new ez(25)).a(71);
    public static ez D = (new bd(26, 10)).a(72);
    public static ez E = (new bh(27, 0)).a(68);
    public static ez F = (new gq(28, 0)).a(84);
    public static ez G = (new al(29, 0)).a(100);
    public static ez H = (new du(30, 0)).a(116);
    public static ez I = (new ez(31)).a(8);
    public static ez J = (new ez(32)).a(24);
    public static ez K = (new ez(33)).a(40);
    public static ez L = (new ia(34, 0)).a(128);
    public static ez M = (new ia(35, 1)).a(129);
    public static ez N = (new ia(36, 2)).a(130);
    public static ez O = (new ia(37, 3)).a(131);
    public static ez P = (new ia(38, 1)).a(132);
    public static ez Q;
    public static ez R = (new ez(40)).a(25);
    public static ez S = (new ix(41, 5)).a(41);
    public static ez T = (new go(42, 0, 0, 0)).a(0);
    public static ez U = (new go(43, 0, 0, 1)).a(16);
    public static ez V = (new go(44, 0, 0, 2)).a(32);
    public static ez W = (new go(45, 0, 0, 3)).a(48);
    public static ez X = (new go(46, 1, 1, 0)).a(1);
    public static ez Y = (new go(47, 1, 1, 1)).a(17);
    public static ez Z = (new go(48, 1, 1, 2)).a(33);
    public static ez aa = (new go(49, 1, 1, 3)).a(49);
    public static ez ab = (new go(50, 2, 2, 0)).a(2);
    public static ez ac = (new go(51, 2, 2, 1)).a(18);
    public static ez ad = (new go(52, 2, 2, 2)).a(34);
    public static ez ae = (new go(53, 2, 2, 3)).a(50);
    public static ez af = (new go(54, 3, 3, 0)).a(3);
    public static ez ag = (new go(55, 3, 3, 1)).a(19);
    public static ez ah = (new go(56, 3, 3, 2)).a(35);
    public static ez ai = (new go(57, 3, 3, 3)).a(51);
    public static ez aj = (new go(58, 1, 4, 0)).a(4);
    public static ez ak = (new go(59, 1, 4, 1)).a(20);
    public static ez al = (new go(60, 1, 4, 2)).a(36);
    public static ez am = (new go(61, 1, 4, 3)).a(52);
    public static ez an = (new ez(62)).a(6);
    public static ez ao = (new ix(63, 3)).a(87);
    public static ez ap = (new ix(64, 8)).a(88);
    public static ez aq = (new ik(65)).a(26);
    public static ez ar = (new ix(66, 42)).a(11);
    public static ez as = (new fq(67)).a(42);
    public static ez at;
    public static ez au = (new ap(69, 0)).a(74);
    public static ez av;
    public static ez aw;
    public static ez ax = (new ck(72, 0)).a(135);
    public static ez ay = (new cw(73)).a(104);
    public static ez az;
    public static ez aA = (new ge(75)).a(56);
    public static ez aB = (new ch(76)).a(14);
    public static ez aC = (new fs(77)).a(136);
    public static ez aD = (new ez(78)).a(103);
    public static ez aE = (new ap(79, -1)).a(77);
    public static ez aF = (new ez(80)).a(22);
    public static ez aG = (new ez(81)).a(57);
    public static ez aH;
    public static ez aI = (new ez(83)).a(58);
    public static ez aJ = (new ez(84)).a(59);
    public static ez aK = (new ez(85)).a(30);
    public static ez aL = (new ck(86, 1)).a(151);
    public static ez aM = (new ck(87, 2)).a(167);
    public static ez aN = (new ez(88)).a(12);
    public static ez aO = (new ez(89)).a(54);
    public static ez aP = (new ez(90)).a(69);
    public static ez aQ = (new er(2000, "13")).a(240);
    public static ez aR = (new er(2001, "cat")).a(241);
    public final int aS;
    protected int aT;
    protected int aU;
    protected int aV;
    protected boolean aW;

    protected ez(int i1)
    {
        aT = 64;
        aU = 32;
        aW = false;
        aS = 256 + i1;
        if(c[256 + i1] != null)
            java.lang.System.out.println((new StringBuilder()).append("CONFLICT @ ").append(i1).toString());
        c[256 + i1] = this;
    }

    public ez a(int i1)
    {
        aV = i1;
        return this;
    }

    public boolean a(gp gp, fc fc, dy dy, int i1, int j1, int k1, int l1)
    {
        return false;
    }

    public float a(gp gp, ff ff1)
    {
        return 1.0F;
    }

    public int a()
    {
        return aT;
    }

    public int b()
    {
        return aU;
    }

    public void a(gp gp, int i1, int j1, int k1, int l1)
    {
    }

    public boolean a(ff ff1)
    {
        return false;
    }

    public ez c()
    {
        aW = true;
        return this;
    }

    static 
    {
        Q = (new ci(39, ff.aA.bc)).a(9);
        at = (new ga(68, iq.c)).a(43);
        av = (new ap(70, ff.B.bc)).a(75);
        aw = (new ap(71, ff.D.bc)).a(76);
        az = (new ga(74, iq.e)).a(44);
        aH = (new iv(82, ff.aY)).a(27);
    }
}
