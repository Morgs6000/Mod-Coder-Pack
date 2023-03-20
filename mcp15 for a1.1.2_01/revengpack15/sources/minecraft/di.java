// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.util.Random;

public class di
{

    protected di(int i)
    {
        field_290_aT = 64;
        field_289_aU = 32;
        field_287_aW = false;
        field_291_aS = 256 + i;
        if(field_233_c[256 + i] != null)
        {
            System.out.println((new StringBuilder()).append("CONFLICT @ ").append(i).toString());
        }
        field_233_c[256 + i] = this;
    }

    public di func_205_a(int i)
    {
        field_288_aV = i;
        return this;
    }

    public int func_196_a(ev ev)
    {
        return field_288_aV;
    }

    public boolean func_192_a(ev ev, dm dm, cn cn, int i, int j, int k, int l)
    {
        return false;
    }

    public float func_204_a(ev ev, ly ly1)
    {
        return 1.0F;
    }

    public ev func_193_a(ev ev, cn cn, dm dm)
    {
        return ev;
    }

    public int func_200_b()
    {
        return field_290_aT;
    }

    public int func_197_c()
    {
        return field_289_aU;
    }

    public void func_202_a(ev ev, ge ge)
    {
    }

    public void func_203_a(ev ev, int i, int j, int k, int l)
    {
    }

    public int func_198_a(kh kh)
    {
        return 1;
    }

    public boolean func_195_a(ly ly1)
    {
        return false;
    }

    public void func_201_b(ev ev, ge ge)
    {
    }

    public di func_199_d()
    {
        field_287_aW = true;
        return this;
    }

    public boolean func_194_a()
    {
        return field_287_aW;
    }

    protected static Random field_234_b = new Random();
    public static di field_233_c[] = new di[32000];
    public static di field_232_d = (new ms(0, 2)).func_205_a(82);
    public static di field_231_e = (new y(1, 2)).func_205_a(98);
    public static di field_230_f = (new ks(2, 2)).func_205_a(114);
    public static di field_229_g = (new nx(3)).func_205_a(5);
    public static di field_228_h = (new oj(4, 4)).func_205_a(10);
    public static di field_227_i = (new jg(5)).func_205_a(21);
    public static di field_226_j = (new di(6)).func_205_a(37);
    public static di field_225_k = (new di(7)).func_205_a(7);
    public static di field_224_l = (new di(8)).func_205_a(55);
    public static di field_223_m = (new di(9)).func_205_a(23);
    public static di field_222_n = (new di(10)).func_205_a(39);
    public static di field_221_o = (new iu(11, 2)).func_205_a(66);
    public static di field_220_p = (new iu(12, 0)).func_205_a(64);
    public static di field_219_q = (new ms(13, 0)).func_205_a(80);
    public static di field_218_r = (new y(14, 0)).func_205_a(96);
    public static di field_217_s = (new ks(15, 0)).func_205_a(112);
    public static di field_216_t = (new iu(16, 1)).func_205_a(65);
    public static di field_215_u = (new ms(17, 1)).func_205_a(81);
    public static di field_214_v = (new y(18, 1)).func_205_a(97);
    public static di field_213_w = (new ks(19, 1)).func_205_a(113);
    public static di field_212_x = (new iu(20, 3)).func_205_a(67);
    public static di field_211_y = (new ms(21, 3)).func_205_a(83);
    public static di field_210_z = (new y(22, 3)).func_205_a(99);
    public static di field_268_A = (new ks(23, 3)).func_205_a(115);
    public static di field_266_B = (new di(24)).func_205_a(53).func_199_d();
    public static di field_264_C = (new di(25)).func_205_a(71);
    public static di field_263_D = (new ap(26, 10)).func_205_a(72);
    public static di field_261_E = (new iu(27, 0)).func_205_a(68);
    public static di field_259_F = (new ms(28, 0)).func_205_a(84);
    public static di field_257_G = (new y(29, 0)).func_205_a(100);
    public static di field_255_H = (new ks(30, 0)).func_205_a(116);
    public static di field_253_I = (new di(31)).func_205_a(8);
    public static di field_251_J = (new di(32)).func_205_a(24);
    public static di field_250_K = (new di(33)).func_205_a(40);
    public static di field_249_L = (new fu(34, 0)).func_205_a(128);
    public static di field_248_M = (new fu(35, 1)).func_205_a(129);
    public static di field_247_N = (new fu(36, 2)).func_205_a(130);
    public static di field_246_O = (new fu(37, 3)).func_205_a(131);
    public static di field_245_P = (new fu(38, 1)).func_205_a(132);
    public static di field_244_Q;
    public static di field_243_R = (new di(40)).func_205_a(25);
    public static di field_242_S = (new oj(41, 5)).func_205_a(41);
    public static di field_241_T = (new mr(42, 0, 0, 0)).func_205_a(0);
    public static di field_240_U = (new mr(43, 0, 0, 1)).func_205_a(16);
    public static di field_239_V = (new mr(44, 0, 0, 2)).func_205_a(32);
    public static di field_238_W = (new mr(45, 0, 0, 3)).func_205_a(48);
    public static di field_237_X = (new mr(46, 1, 1, 0)).func_205_a(1);
    public static di field_236_Y = (new mr(47, 1, 1, 1)).func_205_a(17);
    public static di field_235_Z = (new mr(48, 1, 1, 2)).func_205_a(33);
    public static di field_286_aa = (new mr(49, 1, 1, 3)).func_205_a(49);
    public static di field_285_ab = (new mr(50, 2, 2, 0)).func_205_a(2);
    public static di field_284_ac = (new mr(51, 2, 2, 1)).func_205_a(18);
    public static di field_283_ad = (new mr(52, 2, 2, 2)).func_205_a(34);
    public static di field_282_ae = (new mr(53, 2, 2, 3)).func_205_a(50);
    public static di field_281_af = (new mr(54, 3, 3, 0)).func_205_a(3);
    public static di field_280_ag = (new mr(55, 3, 3, 1)).func_205_a(19);
    public static di field_279_ah = (new mr(56, 3, 3, 2)).func_205_a(35);
    public static di field_278_ai = (new mr(57, 3, 3, 3)).func_205_a(51);
    public static di field_277_aj = (new mr(58, 1, 4, 0)).func_205_a(4);
    public static di field_276_ak = (new mr(59, 1, 4, 1)).func_205_a(20);
    public static di field_275_al = (new mr(60, 1, 4, 2)).func_205_a(36);
    public static di field_274_am = (new mr(61, 1, 4, 3)).func_205_a(52);
    public static di field_273_an = (new di(62)).func_205_a(6);
    public static di field_272_ao = (new oj(63, 3)).func_205_a(87);
    public static di field_271_ap = (new oj(64, 8)).func_205_a(88);
    public static di field_270_aq = (new od(65)).func_205_a(26);
    public static di field_269_ar = (new oj(66, 42)).func_205_a(11);
    public static di field_267_as = (new md(67)).func_205_a(42);
    public static di field_265_at;
    public static di field_262_au = (new ac(69, 0)).func_205_a(74);
    public static di field_260_av;
    public static di field_258_aw;
    public static di field_256_ax = (new jo(72, 0)).func_205_a(135);
    public static di field_254_ay = (new jw(73)).func_205_a(104);
    public static di field_252_az;
    public static di field_309_aA = (new ef(75)).func_205_a(56);
    public static di field_308_aB = (new bp(76)).func_205_a(14);
    public static di field_307_aC = (new me(77)).func_205_a(136);
    public static di field_306_aD = (new di(78)).func_205_a(103);
    public static di field_305_aE = (new ac(79, -1)).func_205_a(77);
    public static di field_304_aF = (new di(80)).func_205_a(22);
    public static di field_303_aG = (new di(81)).func_205_a(57);
    public static di field_302_aH;
    public static di field_301_aI = (new di(83)).func_205_a(58);
    public static di field_300_aJ = (new di(84)).func_205_a(59);
    public static di field_299_aK = (new di(85)).func_205_a(30);
    public static di field_298_aL = (new jo(86, 1)).func_205_a(151);
    public static di field_297_aM = (new jo(87, 2)).func_205_a(167);
    public static di field_296_aN = (new di(88)).func_205_a(12);
    public static di field_295_aO = (new di(89)).func_205_a(54);
    public static di field_294_aP = (new di(90)).func_205_a(69);
    public static di field_293_aQ = (new lg(2000, "13")).func_205_a(240);
    public static di field_292_aR = (new lg(2001, "cat")).func_205_a(241);
    public final int field_291_aS;
    protected int field_290_aT;
    protected int field_289_aU;
    protected int field_288_aV;
    protected boolean field_287_aW;

    static 
    {
        field_244_Q = (new jn(39, ly.field_447_aA.field_376_bc)).func_205_a(9);
        field_265_at = (new ec(68, gb.field_1335_c)).func_205_a(43);
        field_260_av = (new ac(70, ly.field_401_B.field_376_bc)).func_205_a(75);
        field_258_aw = (new ac(71, ly.field_397_D.field_376_bc)).func_205_a(76);
        field_252_az = (new ec(74, gb.field_1333_e)).func_205_a(44);
        field_302_aH = (new gf(82, ly.field_423_aY)).func_205_a(27);
    }
}
