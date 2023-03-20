// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.Random;

public class ly
{

    protected ly(int i, gb gb1)
    {
        field_358_bl = field_354_e;
        field_357_bm = 1.0F;
        field_355_bo = 0.6F;
        if(field_345_n[i] != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Slot ").append(i).append(" is already occupied by ").append(field_345_n[i]).append(" when adding ").append(this).toString());
        } else
        {
            field_356_bn = gb1;
            field_345_n[i] = this;
            field_376_bc = i;
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            field_343_p[i] = func_217_b();
            field_341_r[i] = func_217_b() ? 255 : 0;
            field_340_s[i] = func_212_i();
            field_342_q[i] = false;
            return;
        }
    }

    protected ly(int i, int j, gb gb1)
    {
        this(i, gb1);
        field_378_bb = j;
    }

    protected ly func_248_a(bb bb1)
    {
        field_358_bl = bb1;
        return this;
    }

    protected ly func_256_d(int i)
    {
        field_341_r[field_376_bc] = i;
        return this;
    }

    protected ly func_215_a(float f)
    {
        field_339_t[field_376_bc] = (int)(15F * f);
        return this;
    }

    protected ly func_219_b(float f)
    {
        field_372_be = f * 3F;
        return this;
    }

    private boolean func_212_i()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return true;
    }

    public int func_210_f()
    {
        return 0;
    }

    protected ly func_222_c(float f)
    {
        field_374_bd = f;
        if(field_372_be < f * 5F)
        {
            field_372_be = f * 5F;
        }
        return this;
    }

    protected void func_253_b(boolean flag)
    {
        field_344_o[field_376_bc] = flag;
    }

    public void func_213_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
        field_370_bf = f;
        field_368_bg = f1;
        field_366_bh = f2;
        field_364_bi = f3;
        field_362_bj = f4;
        field_360_bk = f5;
    }

    public float func_241_c(nm nm1, int i, int j, int k)
    {
        return nm1.func_598_c(i, j, k);
    }

    public boolean func_260_c(nm nm1, int i, int j, int k, int l)
    {
        if(l == 0 && field_368_bg > 0.0D)
        {
            return true;
        }
        if(l == 1 && field_362_bj < 1.0D)
        {
            return true;
        }
        if(l == 2 && field_366_bh > 0.0D)
        {
            return true;
        }
        if(l == 3 && field_360_bk < 1.0D)
        {
            return true;
        }
        if(l == 4 && field_370_bf > 0.0D)
        {
            return true;
        }
        if(l == 5 && field_364_bi < 1.0D)
        {
            return true;
        } else
        {
            return !nm1.func_601_g(i, j, k);
        }
    }

    public int func_211_a(nm nm1, int i, int j, int k, int l)
    {
        return func_232_a(l, nm1.func_602_e(i, j, k));
    }

    public int func_232_a(int i, int j)
    {
        return func_218_a(i);
    }

    public int func_218_a(int i)
    {
        return field_378_bb;
    }

    public cf func_246_f(cn cn1, int i, int j, int k)
    {
        return cf.func_1161_b((double)i + field_370_bf, (double)j + field_368_bg, (double)k + field_366_bh, (double)i + field_364_bi, (double)j + field_362_bj, (double)k + field_360_bk);
    }

    public void func_230_a(cn cn1, int i, int j, int k, cf cf1, ArrayList arraylist)
    {
        cf cf2 = func_221_d(cn1, i, j, k);
        if(cf2 != null && cf1.func_1178_a(cf2))
        {
            arraylist.add(cf2);
        }
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        return cf.func_1161_b((double)i + field_370_bf, (double)j + field_368_bg, (double)k + field_366_bh, (double)i + field_364_bi, (double)j + field_362_bj, (double)k + field_360_bk);
    }

    public boolean func_217_b()
    {
        return true;
    }

    public boolean func_224_a(int i, boolean flag)
    {
        return func_245_h();
    }

    public boolean func_245_h()
    {
        return true;
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
    }

    public void func_247_b(cn cn1, int i, int j, int k, Random random)
    {
    }

    public void func_252_b(cn cn1, int i, int j, int k, int l)
    {
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
    }

    public int func_206_a()
    {
        return 10;
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
    }

    public void func_214_b(cn cn1, int i, int j, int k)
    {
    }

    public int func_229_a(Random random)
    {
        return 1;
    }

    public int func_240_a(int i, Random random)
    {
        return field_376_bc;
    }

    public float func_225_a(dm dm1)
    {
        if(field_374_bd < 0.0F)
        {
            return 0.0F;
        }
        if(!dm1.func_454_b(this))
        {
            return 1.0F / field_374_bd / 100F;
        } else
        {
            return dm1.func_450_a(this) / field_374_bd / 30F;
        }
    }

    public void func_259_b_(cn cn1, int i, int j, int k, int l)
    {
        func_216_a(cn1, i, j, k, l, 1.0F);
    }

    public void func_216_a(cn cn1, int i, int j, int k, int l, float f)
    {
        if(cn1.field_1026_y)
        {
            return;
        }
        int i1 = func_229_a(cn1.field_1037_n);
        for(int j1 = 0; j1 < i1; j1++)
        {
            if(cn1.field_1037_n.nextFloat() > f)
            {
                continue;
            }
            int k1 = func_240_a(l, cn1.field_1037_n);
            if(k1 > 0)
            {
                float f1 = 0.7F;
                double d = (double)(cn1.field_1037_n.nextFloat() * f1) + (double)(1.0F - f1) * 0.5D;
                double d1 = (double)(cn1.field_1037_n.nextFloat() * f1) + (double)(1.0F - f1) * 0.5D;
                double d2 = (double)(cn1.field_1037_n.nextFloat() * f1) + (double)(1.0F - f1) * 0.5D;
                dx dx1 = new dx(cn1, (double)i + d, (double)j + d1, (double)k + d2, new ev(k1));
                dx1.field_805_c = 10;
                cn1.func_674_a(dx1);
            }
        }

    }

    public float func_227_a(kh kh)
    {
        return field_372_be / 5F;
    }

    public mf func_255_a(cn cn1, int i, int j, int k, aj aj1, aj aj2)
    {
        func_238_a(cn1, i, j, k);
        aj1 = aj1.func_1257_c(-i, -j, -k);
        aj2 = aj2.func_1257_c(-i, -j, -k);
        aj aj3 = aj1.func_1247_a(aj2, field_370_bf);
        aj aj4 = aj1.func_1247_a(aj2, field_364_bi);
        aj aj5 = aj1.func_1250_b(aj2, field_368_bg);
        aj aj6 = aj1.func_1250_b(aj2, field_362_bj);
        aj aj7 = aj1.func_1256_c(aj2, field_366_bh);
        aj aj8 = aj1.func_1256_c(aj2, field_360_bk);
        if(!func_244_a(aj3))
        {
            aj3 = null;
        }
        if(!func_244_a(aj4))
        {
            aj4 = null;
        }
        if(!func_249_b(aj5))
        {
            aj5 = null;
        }
        if(!func_249_b(aj6))
        {
            aj6 = null;
        }
        if(!func_251_c(aj7))
        {
            aj7 = null;
        }
        if(!func_251_c(aj8))
        {
            aj8 = null;
        }
        aj aj9 = null;
        if(aj3 != null && (aj9 == null || aj1.func_1251_c(aj3) < aj1.func_1251_c(aj9)))
        {
            aj9 = aj3;
        }
        if(aj4 != null && (aj9 == null || aj1.func_1251_c(aj4) < aj1.func_1251_c(aj9)))
        {
            aj9 = aj4;
        }
        if(aj5 != null && (aj9 == null || aj1.func_1251_c(aj5) < aj1.func_1251_c(aj9)))
        {
            aj9 = aj5;
        }
        if(aj6 != null && (aj9 == null || aj1.func_1251_c(aj6) < aj1.func_1251_c(aj9)))
        {
            aj9 = aj6;
        }
        if(aj7 != null && (aj9 == null || aj1.func_1251_c(aj7) < aj1.func_1251_c(aj9)))
        {
            aj9 = aj7;
        }
        if(aj8 != null && (aj9 == null || aj1.func_1251_c(aj8) < aj1.func_1251_c(aj9)))
        {
            aj9 = aj8;
        }
        if(aj9 == null)
        {
            return null;
        }
        byte byte0 = -1;
        if(aj9 == aj3)
        {
            byte0 = 4;
        }
        if(aj9 == aj4)
        {
            byte0 = 5;
        }
        if(aj9 == aj5)
        {
            byte0 = 0;
        }
        if(aj9 == aj6)
        {
            byte0 = 1;
        }
        if(aj9 == aj7)
        {
            byte0 = 2;
        }
        if(aj9 == aj8)
        {
            byte0 = 3;
        }
        return new mf(i, j, k, byte0, aj9.func_1257_c(i, j, k));
    }

    private boolean func_244_a(aj aj1)
    {
        if(aj1 == null)
        {
            return false;
        } else
        {
            return aj1.field_1775_b >= field_368_bg && aj1.field_1775_b <= field_362_bj && aj1.field_1779_c >= field_366_bh && aj1.field_1779_c <= field_360_bk;
        }
    }

    private boolean func_249_b(aj aj1)
    {
        if(aj1 == null)
        {
            return false;
        } else
        {
            return aj1.field_1776_a >= field_370_bf && aj1.field_1776_a <= field_364_bi && aj1.field_1779_c >= field_366_bh && aj1.field_1779_c <= field_360_bk;
        }
    }

    private boolean func_251_c(aj aj1)
    {
        if(aj1 == null)
        {
            return false;
        } else
        {
            return aj1.field_1776_a >= field_370_bf && aj1.field_1776_a <= field_364_bi && aj1.field_1775_b >= field_368_bg && aj1.field_1775_b <= field_362_bj;
        }
    }

    public void func_239_c(cn cn1, int i, int j, int k)
    {
    }

    public int func_234_g()
    {
        return 0;
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_600_a(i, j, k);
        return l == 0 || field_345_n[l].field_356_bn.func_879_d();
    }

    public boolean func_250_a(cn cn1, int i, int j, int k, dm dm1)
    {
        return false;
    }

    public void func_254_a(cn cn1, int i, int j, int k, kh kh)
    {
    }

    public void func_258_d(cn cn1, int i, int j, int k, int l)
    {
    }

    public void func_233_b(cn cn1, int i, int j, int k, dm dm1)
    {
    }

    public void func_257_a(cn cn1, int i, int j, int k, kh kh, aj aj1)
    {
    }

    public void func_238_a(nm nm1, int i, int j, int k)
    {
    }

    public int func_207_d(nm nm1, int i, int j, int k)
    {
        return 0xffffff;
    }

    public boolean func_231_b(nm nm1, int i, int j, int k, int l)
    {
        return false;
    }

    public boolean func_209_d()
    {
        return false;
    }

    public void func_236_b(cn cn1, int i, int j, int k, kh kh)
    {
    }

    public boolean func_228_c(cn cn1, int i, int j, int k, int l)
    {
        return false;
    }

    public void func_237_e()
    {
    }

    public void func_220_a_(cn cn1, int i, int j, int k, int l)
    {
        func_259_b_(cn1, i, j, k, l);
    }

    public boolean func_223_g(cn cn1, int i, int j, int k)
    {
        return true;
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    public static final bb field_354_e;
    public static final bb field_353_f;
    public static final bb field_352_g;
    public static final bb field_351_h;
    public static final bb field_350_i;
    public static final bb field_349_j;
    public static final bb field_348_k;
    public static final bb field_347_l;
    public static final bb field_346_m;
    public static final ly field_345_n[];
    public static final boolean field_344_o[] = new boolean[256];
    public static final boolean field_343_p[] = new boolean[256];
    public static final boolean field_342_q[] = new boolean[256];
    public static final int field_341_r[] = new int[256];
    public static final boolean field_340_s[] = new boolean[256];
    public static final int field_339_t[] = new int[256];
    public static final ly field_338_u;
    public static final my field_337_v;
    public static final ly field_336_w;
    public static final ly field_335_x;
    public static final ly field_334_y;
    public static final ly field_333_z;
    public static final ly field_403_A;
    public static final ly field_401_B;
    public static final ly field_399_C;
    public static final ly field_397_D;
    public static final ly field_395_E;
    public static final ly field_393_F;
    public static final ly field_392_G;
    public static final ly field_390_H;
    public static final ly field_388_I;
    public static final ly field_386_J;
    public static final ly field_385_K;
    public static final iz field_384_L;
    public static final ly field_383_M;
    public static final ly field_382_N;
    public static final ly field_381_O = null;
    public static final ly field_379_P = null;
    public static final ly field_377_Q = null;
    public static final ly field_375_R = null;
    public static final ly field_373_S = null;
    public static final ly field_371_T = null;
    public static final ly field_369_U = null;
    public static final ly field_367_V = null;
    public static final ly field_365_W = null;
    public static final ly field_363_X = null;
    public static final ly field_361_Y = null;
    public static final ly field_359_Z = null;
    public static final ly field_421_aa = null;
    public static final ly field_420_ab = null;
    public static final ly field_419_ac;
    public static final ly field_418_ad = null;
    public static final mq field_417_ae;
    public static final mq field_416_af;
    public static final mq field_415_ag;
    public static final mq field_414_ah;
    public static final ly field_413_ai;
    public static final ly field_412_aj;
    public static final ly field_411_ak;
    public static final ly field_410_al;
    public static final ly field_409_am;
    public static final ly field_408_an;
    public static final ly field_407_ao;
    public static final ly field_406_ap;
    public static final ly field_405_aq;
    public static final ly field_404_ar;
    public static final og field_402_as;
    public static final ly field_400_at;
    public static final ly field_398_au;
    public static final ly field_396_av;
    public static final ly field_394_aw;
    public static final ly field_391_ax;
    public static final ly field_389_ay;
    public static final ly field_387_az;
    public static final ly field_447_aA;
    public static final ly field_446_aB;
    public static final ly field_445_aC;
    public static final ly field_444_aD;
    public static final ly field_443_aE;
    public static final ly field_442_aF;
    public static final ly field_441_aG;
    public static final ly field_440_aH;
    public static final ly field_439_aI;
    public static final ly field_438_aJ;
    public static final ly field_437_aK;
    public static final ly field_436_aL;
    public static final ly field_435_aM;
    public static final ly field_434_aN;
    public static final ly field_433_aO;
    public static final ly field_432_aP;
    public static final ly field_431_aQ;
    public static final ly field_430_aR;
    public static final ly field_429_aS;
    public static final ly field_428_aT;
    public static final ly field_427_aU;
    public static final ly field_426_aV;
    public static final ly field_425_aW;
    public static final ly field_424_aX;
    public static final ly field_423_aY;
    public static final ly field_422_aZ;
    public static final ly field_380_ba;
    public int field_378_bb;
    public final int field_376_bc;
    protected float field_374_bd;
    protected float field_372_be;
    public double field_370_bf;
    public double field_368_bg;
    public double field_366_bh;
    public double field_364_bi;
    public double field_362_bj;
    public double field_360_bk;
    public bb field_358_bl;
    public float field_357_bm;
    public final gb field_356_bn;
    public float field_355_bo;

    static 
    {
        field_354_e = new bb("stone", 1.0F, 1.0F);
        field_353_f = new bb("wood", 1.0F, 1.0F);
        field_352_g = new bb("gravel", 1.0F, 1.0F);
        field_351_h = new bb("grass", 1.0F, 1.0F);
        field_350_i = new bb("stone", 1.0F, 1.0F);
        field_349_j = new bb("stone", 1.0F, 1.5F);
        field_348_k = new u("stone", 1.0F, 1.0F);
        field_347_l = new bb("cloth", 1.0F, 1.0F);
        field_346_m = new t("sand", 1.0F, 1.0F);
        field_345_n = new ly[256];
        field_338_u = (new ce(1, 1)).func_222_c(1.5F).func_219_b(10F).func_248_a(field_350_i);
        field_337_v = (my)(new my(2)).func_222_c(0.6F).func_248_a(field_351_h);
        field_336_w = (new hz(3, 2)).func_222_c(0.5F).func_248_a(field_352_g);
        field_335_x = (new ly(4, 16, gb.field_1334_d)).func_222_c(2.0F).func_219_b(10F).func_248_a(field_350_i);
        field_334_y = (new ly(5, 4, gb.field_1335_c)).func_222_c(2.0F).func_219_b(5F).func_248_a(field_353_f);
        field_333_z = (new dt(6, 15)).func_222_c(0.0F).func_248_a(field_351_h);
        field_403_A = (new ly(7, 17, gb.field_1334_d)).func_222_c(-1F).func_219_b(6000000F).func_248_a(field_350_i);
        field_401_B = (new hv(8, gb.field_1332_f)).func_222_c(100F).func_256_d(3);
        field_399_C = (new hn(9, gb.field_1332_f)).func_222_c(100F).func_256_d(3);
        field_397_D = (new hv(10, gb.field_1331_g)).func_222_c(0.0F).func_215_a(1.0F).func_256_d(255);
        field_395_E = (new hn(11, gb.field_1331_g)).func_222_c(100F).func_215_a(1.0F).func_256_d(255);
        field_393_F = (new dh(12, 18)).func_222_c(0.5F).func_248_a(field_346_m);
        field_392_G = (new gz(13, 19)).func_222_c(0.6F).func_248_a(field_352_g);
        field_390_H = (new gw(14, 32)).func_222_c(3F).func_219_b(5F).func_248_a(field_350_i);
        field_388_I = (new gw(15, 33)).func_222_c(3F).func_219_b(5F).func_248_a(field_350_i);
        field_386_J = (new gw(16, 34)).func_222_c(3F).func_219_b(5F).func_248_a(field_350_i);
        field_385_K = (new mg(17)).func_222_c(2.0F).func_248_a(field_353_f);
        field_384_L = (iz)(new iz(18, 52)).func_222_c(0.2F).func_256_d(1).func_248_a(field_351_h);
        field_383_M = (new ng(19)).func_222_c(0.6F).func_248_a(field_351_h);
        field_382_N = (new ct(20, 49, gb.field_1323_o, false)).func_222_c(0.3F).func_248_a(field_348_k);
        field_419_ac = (new ly(35, 64, gb.field_1327_k)).func_222_c(0.8F).func_248_a(field_347_l);
        field_417_ae = (mq)(new mq(37, 13)).func_222_c(0.0F).func_248_a(field_351_h);
        field_416_af = (mq)(new mq(38, 12)).func_222_c(0.0F).func_248_a(field_351_h);
        field_415_ag = (mq)(new ky(39, 29)).func_222_c(0.0F).func_248_a(field_351_h).func_215_a(0.125F);
        field_414_ah = (mq)(new ky(40, 28)).func_222_c(0.0F).func_248_a(field_351_h);
        field_413_ai = (new c(41, 39)).func_222_c(3F).func_219_b(10F).func_248_a(field_349_j);
        field_412_aj = (new c(42, 38)).func_222_c(5F).func_219_b(10F).func_248_a(field_349_j);
        field_411_ak = (new oi(43, true)).func_222_c(2.0F).func_219_b(10F).func_248_a(field_350_i);
        field_410_al = (new oi(44, false)).func_222_c(2.0F).func_219_b(10F).func_248_a(field_350_i);
        field_409_am = (new ly(45, 7, gb.field_1334_d)).func_222_c(2.0F).func_219_b(10F).func_248_a(field_350_i);
        field_408_an = (new q(46, 8)).func_222_c(0.0F).func_248_a(field_351_h);
        field_407_ao = (new ds(47, 35)).func_222_c(1.5F).func_248_a(field_353_f);
        field_406_ap = (new ly(48, 36, gb.field_1334_d)).func_222_c(2.0F).func_219_b(10F).func_248_a(field_350_i);
        field_405_aq = (new cm(49, 37)).func_222_c(10F).func_219_b(2000F).func_248_a(field_350_i);
        field_404_ar = (new mj(50, 80)).func_222_c(0.0F).func_215_a(0.9375F).func_248_a(field_353_f);
        field_402_as = (og)(new og(51, 31)).func_222_c(0.0F).func_215_a(1.0F).func_248_a(field_353_f);
        field_400_at = (new bj(52, 65)).func_222_c(5F).func_248_a(field_349_j);
        field_398_au = new km(53, field_334_y);
        field_396_av = (new b(54)).func_222_c(2.5F).func_248_a(field_353_f);
        field_394_aw = (new kf(55, 84)).func_222_c(0.0F).func_248_a(field_354_e);
        field_391_ax = (new gw(56, 50)).func_222_c(3F).func_219_b(5F).func_248_a(field_350_i);
        field_389_ay = (new c(57, 40)).func_222_c(5F).func_219_b(10F).func_248_a(field_349_j);
        field_387_az = (new cs(58)).func_222_c(2.5F).func_248_a(field_353_f);
        field_447_aA = (new hd(59, 88)).func_222_c(0.0F).func_248_a(field_351_h);
        field_446_aB = (new mi(60)).func_222_c(0.6F).func_248_a(field_352_g);
        field_445_aC = (new ku(61, false)).func_222_c(3.5F).func_248_a(field_350_i);
        field_444_aD = (new ku(62, true)).func_222_c(3.5F).func_248_a(field_350_i).func_215_a(0.875F);
        field_443_aE = (new lr(63, ob.class, true)).func_222_c(1.0F).func_248_a(field_353_f);
        field_442_aF = (new fw(64, gb.field_1335_c)).func_222_c(3F).func_248_a(field_353_f);
        field_441_aG = (new br(65, 83)).func_222_c(0.4F).func_248_a(field_353_f);
        field_440_aH = (new iffix(66, 128)).func_222_c(0.7F).func_248_a(field_349_j);
        field_439_aI = new km(67, field_335_x);
        field_438_aJ = (new lr(68, ob.class, false)).func_222_c(1.0F).func_248_a(field_353_f);
        field_437_aK = (new no(69, 96)).func_222_c(0.5F).func_248_a(field_353_f);
        field_436_aL = (new al(70, field_338_u.field_378_bb, js.mobs)).func_222_c(0.5F).func_248_a(field_350_i);
        field_435_aM = (new fw(71, gb.field_1333_e)).func_222_c(5F).func_248_a(field_349_j);
        field_434_aN = (new al(72, field_334_y.field_378_bb, js.everything)).func_222_c(0.5F).func_248_a(field_353_f);
        field_433_aO = (new ai(73, 51, false)).func_222_c(3F).func_219_b(5F).func_248_a(field_350_i);
        field_432_aP = (new ai(74, 51, true)).func_215_a(0.625F).func_222_c(3F).func_219_b(5F).func_248_a(field_350_i);
        field_431_aQ = (new bg(75, 115, false)).func_222_c(0.0F).func_248_a(field_353_f);
        field_430_aR = (new bg(76, 99, true)).func_222_c(0.0F).func_215_a(0.5F).func_248_a(field_353_f);
        field_429_aS = (new hu(77, field_338_u.field_378_bb)).func_222_c(0.5F).func_248_a(field_350_i);
        field_428_aT = (new fd(78, 66)).func_222_c(0.1F).func_248_a(field_347_l);
        field_427_aU = (new he(79, 67)).func_222_c(0.5F).func_256_d(3).func_248_a(field_348_k);
        field_426_aV = (new p(80, 66)).func_222_c(0.2F).func_248_a(field_347_l);
        field_425_aW = (new hy(81, 70)).func_222_c(0.4F).func_248_a(field_347_l);
        field_424_aX = (new jv(82, 72)).func_222_c(0.6F).func_248_a(field_352_g);
        field_423_aY = (new jm(83, 73)).func_222_c(0.0F).func_248_a(field_351_h);
        field_422_aZ = (new cv(84, 74)).func_222_c(2.0F).func_219_b(10F).func_248_a(field_350_i);
        field_380_ba = (new fh(85, 4)).func_222_c(2.0F).func_219_b(5F).func_248_a(field_353_f);
        for(int i = 0; i < 256; i++)
        {
            if(field_345_n[i] != null)
            {
                di.field_233_c[i] = new av(i - 256);
            }
        }

    }
}
