// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//package net.minecraft.client;

//import AxisAlignedBB;
//import Block;
//import BlockGrass;
//import EffectRenderer;
//import EntityPlayerSP;
//import EntityRenderer;
//import EnumOS2;
//import EnumOSMappingHelper;
//import FontRenderer;
//import GLAllocation;
//import GameSettings;
//import GameWindowListener;
//import GuiChat;
//import GuiConflictWarning;
//import GuiConnecting;
//import GuiGameOver;
//import GuiIngame;
//import GuiIngameMenu;
//import GuiInventory;
//import GuiMainMenu;
//import GuiScreen;
//import GuiUnused;
//import InventoryPlayer;
//import ItemRenderer;
//import ItemStack;
//import KeyBinding;
//import LoadingScreenRenderer;
//import MathHelper;
//import MinecraftError;
//import MinecraftException;
//import MinecraftImpl;
//import ModelBiped;
//import MouseHelper;
//import MovementInputFromOptions;
//import MovingObjectPosition;
//import OpenGlCapsChecker;
//import PlayerController;
//import PlayerControllerTest;
//import RenderEngine;
//import RenderGlobal;
//import RenderManager;
//import ScaledResolution;
//import Session;
//import SoundManager;
//import Tessellator;
//import TextureCompassFX;
//import TextureFlamesFX;
//import TextureLavaFX;
//import TextureLavaFlowFX;
//import TextureWaterFX;
//import TexureWaterFlowFX;
//import ThreadDownloadResources;
//import ThreadSleepForever;
//import Timer;
//import UnexpectedThrowable;
//import Vec3D;
//import World;
//import WorldRenderer;
import java.awt.*;
import java.io.*;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.*;
import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.GLU;

// Referenced classes of package net.minecraft.client:
//            MinecraftApplet

public abstract class Minecraft
    implements Runnable
{

    public Minecraft(Component component, Canvas canvas, MinecraftApplet minecraftapplet, int i, int j, boolean flag)
    {
        field_184_a = false;
        field_146_M = new Timer(20F);
        field_176_i = null;
        field_173_l = true;
        field_172_m = false;
        field_169_p = null;
        field_168_q = new LoadingScreenRenderer(this);
        field_167_r = new EntityRenderer(this);
        field_144_O = 0;
        field_143_P = 0;
        field_166_s = null;
        field_165_t = 0;
        field_163_v = false;
        field_162_w = new ModelBiped(0.0F);
        field_161_x = null;
        field_158_A = new SoundManager();
        field_138_U = new TextureWaterFX();
        field_137_V = new TextureLavaFX();
        field_153_F = true;
        field_152_G = "";
        field_151_H = -1L;
        field_150_I = false;
        field_135_X = 0;
        enableRain = false;
        field_148_K = System.currentTimeMillis();
        field_134_Y = 0;
        field_142_Q = i;
        field_141_R = j;
        field_184_a = flag;
        field_159_z = minecraftapplet;
        new ThreadSleepForever(this, "Timer hack thread");
        field_174_k = canvas;
        displayWidth = i;
        displayHeight = j;
        field_184_a = flag;
    }

    public abstract void func_110_a(UnexpectedThrowable unexpectedthrowable);

    public void func_121_a(String s, int i)
    {
        field_140_S = s;
        field_139_T = i;
    }

    public void func_136_a() throws LWJGLException
    {
        if(field_174_k != null)
        {
            Graphics g = field_174_k.getGraphics();
            if(g != null)
            {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, displayWidth, displayHeight);
                g.dispose();
            }
            Display.setParent(field_174_k);
        } else
        if(field_184_a)
        {
            Display.setFullscreen(true);
            displayWidth = Display.getDisplayMode().getWidth();
            displayHeight = Display.getDisplayMode().getHeight();
            if(displayWidth <= 0)
            {
                displayWidth = 1;
            }
            if(displayHeight <= 0)
            {
                displayHeight = 1;
            }
        } else
        {
            Display.setDisplayMode(new org.lwjgl.opengl.DisplayMode(displayWidth, displayHeight));
        }
        Display.setTitle("Minecraft Minecraft Alpha v1.1.2_01");
        try
        {
            Display.create();
        }
        catch(LWJGLException lwjglexception)
        {
            lwjglexception.printStackTrace();
            try
            {
                Thread.sleep(1000L);
            }
            catch(InterruptedException interruptedexception) { }
            Display.create();
        }
        RenderManager.field_1233_a.field_1228_f = new ItemRenderer(this);
        field_156_C = func_106_b();
        options = new GameSettings(this, field_156_C);
        field_171_n = new RenderEngine(options);
        field_170_o = new FontRenderer(options, "/default.png", field_171_n);
        func_104_p();
        Keyboard.create();
        Mouse.create();
        field_157_B = new MouseHelper(field_174_k);
        try
        {
            Controllers.create();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        func_116_c("Pre startup");
        GL11.glEnable(3553);
        GL11.glShadeModel(7425);
        GL11.glClearDepth(1.0D);
        GL11.glEnable(2929);
        GL11.glDepthFunc(515);
        GL11.glEnable(3008);
        GL11.glAlphaFunc(516, 0.1F);
        GL11.glCullFace(1029);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode(5888);
        func_116_c("Startup");
        field_147_L = new OpenGlCapsChecker();
        field_158_A.func_340_a(options);
        field_171_n.func_1066_a(field_137_V);
        field_171_n.func_1066_a(field_138_U);
        field_171_n.func_1066_a(new TextureCompassFX(this));
        field_171_n.func_1066_a(new TexureWaterFlowFX());
        field_171_n.func_1066_a(new TextureLavaFlowFX());
        field_171_n.func_1066_a(new TextureFlamesFX(0));
        field_171_n.func_1066_a(new TextureFlamesFX(1));
        field_179_f = new RenderGlobal(this, field_171_n);
        GL11.glViewport(0, 0, displayWidth, displayHeight);
        field_177_h = new EffectRenderer(field_180_e, field_171_n);
        try
        {
            field_145_N = new ThreadDownloadResources(field_156_C, this);
            field_145_N.start();
        }
        catch(Exception exception1) { }
        func_116_c("Post startup");
        field_164_u = new GuiIngame(this);
        if(field_140_S != null)
        {
            func_128_a(new GuiConnecting(this, field_140_S, field_139_T));
        } else
        {
            func_128_a(new GuiMainMenu());
        }
    }

    private void func_104_p() throws LWJGLException
    {
        ScaledResolution scaledresolution = new ScaledResolution(displayWidth, displayHeight);
        int i = scaledresolution.func_903_a();
        int j = scaledresolution.func_902_b();
        GL11.glClear(16640);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, i, j, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
        GL11.glViewport(0, 0, displayWidth, displayHeight);
        GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glDisable(2912);
        GL11.glBindTexture(3553, field_171_n.func_1070_a("/title/mojang.png"));
        tessellator.func_977_b();
        tessellator.func_990_b(0xffffff);
        tessellator.func_983_a(0.0D, displayHeight, 0.0D, 0.0D, 0.0D);
        tessellator.func_983_a(displayWidth, displayHeight, 0.0D, 0.0D, 0.0D);
        tessellator.func_983_a(displayWidth, 0.0D, 0.0D, 0.0D, 0.0D);
        tessellator.func_983_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
        tessellator.func_982_a();
        char c = '\u0100';
        char c1 = '\u0100';
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        tessellator.func_990_b(0xffffff);
        func_139_a((displayWidth / 2 - c) / 2, (displayHeight / 2 - c1) / 2, 0, 0, c, c1);
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        GL11.glEnable(3008);
        GL11.glAlphaFunc(516, 0.1F);
        org.lwjgl.opengl.Display.swapBuffers();
    }

    public void func_139_a(int i, int j, int k, int l, int i1, int j1)
    {
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_983_a(i + 0, j + j1, 0.0D, (float)(k + 0) * f, (float)(l + j1) * f1);
        tessellator.func_983_a(i + i1, j + j1, 0.0D, (float)(k + i1) * f, (float)(l + j1) * f1);
        tessellator.func_983_a(i + i1, j + 0, 0.0D, (float)(k + i1) * f, (float)(l + 0) * f1);
        tessellator.func_983_a(i + 0, j + 0, 0.0D, (float)(k + 0) * f, (float)(l + 0) * f1);
        tessellator.func_982_a();
    }

    public static File func_106_b()
    {
        if(dataFolder == null)
        {
            dataFolder = func_127_a("minecraft");
        }
        return dataFolder;
    }

    public static File func_127_a(String s)
    {
        String s1 = System.getProperty("user.home", ".");
        File file;
        switch(EnumOSMappingHelper.field_1585_a[func_112_q().ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
            file = new File(s1, (new StringBuilder()).append('.').append(s).append('/').toString());
            break;

        case 3: // '\003'
            String s2 = System.getenv("APPDATA");
            if(s2 != null)
            {
                file = new File(s2, (new StringBuilder()).append(".").append(s).append('/').toString());
            } else
            {
                file = new File(s1, (new StringBuilder()).append('.').append(s).append('/').toString());
            }
            break;

        case 4: // '\004'
            file = new File(s1, (new StringBuilder()).append("Library/Application Support/").append(s).toString());
            break;

        default:
            file = new File(s1, (new StringBuilder()).append(s).append('/').toString());
            break;
        }
        if(!file.exists() && !file.mkdirs())
        {
            throw new RuntimeException((new StringBuilder()).append("The working directory could not be created: ").append(file).toString());
        } else
        {
            return file;
        }
    }

    private static EnumOS2 func_112_q()
    {
        String s = System.getProperty("os.name").toLowerCase();
        if(s.contains("win"))
        {
            return EnumOS2.windows;
        }
        if(s.contains("mac"))
        {
            return EnumOS2.macos;
        }
        if(s.contains("solaris"))
        {
            return EnumOS2.solaris;
        }
        if(s.contains("sunos"))
        {
            return EnumOS2.solaris;
        }
        if(s.contains("linux"))
        {
            return EnumOS2.linux;
        }
        if(s.contains("unix"))
        {
            return EnumOS2.linux;
        } else
        {
            return EnumOS2.unknown;
        }
    }

    public void func_128_a(GuiScreen guiscreen)
    {
        if(field_169_p instanceof GuiUnused)
        {
            return;
        }
        if(field_169_p != null)
        {
            field_169_p.func_576_h();
        }
        if(guiscreen == null && field_180_e == null)
        {
            guiscreen = new GuiMainMenu();
        } else
        if(guiscreen == null && field_178_g.health <= 0)
        {
            guiscreen = new GuiGameOver();
        }
        field_169_p = guiscreen;
        if(guiscreen != null)
        {
            func_138_f();
            ScaledResolution scaledresolution = new ScaledResolution(displayWidth, displayHeight);
            int i = scaledresolution.func_903_a();
            int j = scaledresolution.func_902_b();
            guiscreen.func_563_a(this, i, j);
            field_163_v = false;
        } else
        {
            func_123_e();
        }
    }

    private void func_116_c(String s)
    {
        int i = GL11.glGetError();
        if(i != 0)
        {
            String s1 = GLU.gluErrorString(i);
            System.out.println("########## GL ERROR ##########");
            System.out.println((new StringBuilder()).append("@ ").append(s).toString());
            System.out.println((new StringBuilder()).append(i).append(": ").append(s1).toString());
            System.exit(0);
        }
    }

    public void func_130_c()
    {
        if(field_159_z != null)
        {
            field_159_z.func_101_c();
        }
        try
        {
            if(field_145_N != null)
            {
                field_145_N.func_1208_b();
            }
        }
        catch(Exception exception) { }
        try
        {
            System.out.println("Stopping!");
            func_134_a(null);
            try
            {
                GLAllocation.func_1126_a();
            }
            catch(Exception exception1) { }
            field_158_A.func_330_b();
            Mouse.destroy();
            Keyboard.destroy();
        }
        finally
        {
            Display.destroy();
        }
        System.gc();
    }

    public void run()
    {
        field_153_F = true;
        try
        {
            func_136_a();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            func_110_a(new UnexpectedThrowable("Failed to start game", exception));
            return;
        }
        try
        {
            long l = System.currentTimeMillis();
            int i = 0;
            while(field_153_F && (field_159_z == null || field_159_z.isActive())) 
            {
                AxisAlignedBB.func_1173_a();
                Vec3D.func_1259_a();
                if(field_174_k == null && Display.isCloseRequested())
                {
                    func_109_d();
                }
                if(field_172_m && field_180_e != null)
                {
                    float f = field_146_M.field_1378_c;
                    field_146_M.func_904_a();
                    field_146_M.field_1378_c = f;
                } else
                {
                    field_146_M.func_904_a();
                }
                for(int j = 0; j < field_146_M.field_1379_b; j++)
                {
                    field_144_O++;
                    try
                    {
                        func_111_i();
                        continue;
                    }
                    catch(MinecraftException minecraftexception)
                    {
                        field_180_e = null;
                    }
                    func_134_a(null);
                    func_128_a(new GuiConflictWarning());
                }

                func_116_c("Pre render");
                field_158_A.func_338_a(field_178_g, field_146_M.field_1378_c);
                GL11.glEnable(3553);
                if(field_180_e != null)
                {
                    while(field_180_e.func_638_e()) ;
                }
                if(!field_163_v)
                {
                    if(field_183_b != null)
                    {
                        field_183_b.func_723_a(field_146_M.field_1378_c);
                    }
                    field_167_r.func_909_b(field_146_M.field_1378_c);
                }
                if(!Display.isActive())
                {
                    if(field_184_a)
                    {
                        func_133_h();
                    }
                    Thread.sleep(10L);
                }
                if(Keyboard.isKeyDown(64))
                {
                    func_135_r();
                } else
                {
                    field_151_H = System.nanoTime();
                }
                Thread.yield();
                Display.update();
                if(field_174_k != null && !field_184_a && (field_174_k.getWidth() != displayWidth || field_174_k.getHeight() != displayHeight))
                {
                    displayWidth = field_174_k.getWidth();
                    displayHeight = field_174_k.getHeight();
                    if(displayWidth <= 0)
                    {
                        displayWidth = 1;
                    }
                    if(displayHeight <= 0)
                    {
                        displayHeight = 1;
                    }
                    func_115_a(displayWidth, displayHeight);
                }
                if(options.limitFramerate)
                {
                    Thread.sleep(5L);
                }
                func_116_c("Post render");
                i++;
                field_172_m = !func_124_j() && field_169_p != null && field_169_p.func_577_b();
                while(System.currentTimeMillis() >= l + 1000L) 
                {
                    field_152_G = (new StringBuilder()).append(i).append(" fps, ").append(WorldRenderer.field_1762_b).append(" chunk updates").toString();
                    WorldRenderer.field_1762_b = 0;
                    l += 1000L;
                    i = 0;
                }
            }
        }
        catch(MinecraftError minecrafterror) { }
        catch(Throwable throwable)
        {
            field_180_e = null;
            throwable.printStackTrace();
            func_110_a(new UnexpectedThrowable("Unexpected error", throwable));
        }
        finally { }
    }

    private void func_135_r()
    {
        if(field_151_H == -1L)
        {
            field_151_H = System.nanoTime();
        }
        long l = System.nanoTime();
        field_155_D[field_154_E++ & field_155_D.length - 1] = l - field_151_H;
        field_151_H = l;
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, displayWidth, displayHeight, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
        GL11.glLineWidth(1.0F);
        GL11.glDisable(3553);
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_992_a(7);
        tessellator.func_990_b(0x20200000);
        tessellator.func_991_a(0.0D, displayHeight - 100, 0.0D);
        tessellator.func_991_a(0.0D, displayHeight, 0.0D);
        tessellator.func_991_a(field_155_D.length, displayHeight, 0.0D);
        tessellator.func_991_a(field_155_D.length, displayHeight - 100, 0.0D);
        tessellator.func_982_a();
        long l1 = 0L;
        for(int i = 0; i < field_155_D.length; i++)
        {
            l1 += field_155_D[i];
        }

        int j = (int)(l1 / 0x30d40L / (long)field_155_D.length);
        tessellator.func_992_a(7);
        tessellator.func_990_b(0x20400000);
        tessellator.func_991_a(0.0D, displayHeight - j, 0.0D);
        tessellator.func_991_a(0.0D, displayHeight, 0.0D);
        tessellator.func_991_a(field_155_D.length, displayHeight, 0.0D);
        tessellator.func_991_a(field_155_D.length, displayHeight - j, 0.0D);
        tessellator.func_982_a();
        tessellator.func_992_a(1);
        for(int k = 0; k < field_155_D.length; k++)
        {
            int i1 = ((k - field_154_E & field_155_D.length - 1) * 255) / field_155_D.length;
            int j1 = (i1 * i1) / 255;
            j1 = (j1 * j1) / 255;
            int k1 = (j1 * j1) / 255;
            k1 = (k1 * k1) / 255;
            tessellator.func_990_b(0xff000000 + k1 + j1 * 256 + i1 * 0x10000);
            long l2 = field_155_D[k] / 0x30d40L;
            tessellator.func_991_a((float)k + 0.5F, (float)((long)displayHeight - l2) + 0.5F, 0.0D);
            tessellator.func_991_a((float)k + 0.5F, (float)displayHeight + 0.5F, 0.0D);
        }

        tessellator.func_982_a();
        GL11.glEnable(3553);
    }

    public void func_109_d()
    {
        field_153_F = false;
    }

    public void func_123_e()
    {
        if(!Display.isActive())
        {
            return;
        }
        if(field_150_I)
        {
            return;
        } else
        {
            field_150_I = true;
            field_157_B.func_774_a();
            func_128_a(null);
            field_135_X = field_144_O + 10000;
            return;
        }
    }

    public void func_138_f()
    {
        if(!field_150_I)
        {
            return;
        }
        if(field_178_g != null)
        {
            field_178_g.func_458_k();
        }
        field_150_I = false;
        field_157_B.func_773_b();
    }

    public void func_117_g()
    {
        if(field_169_p != null)
        {
            return;
        } else
        {
            func_128_a(new GuiIngameMenu());
            return;
        }
    }

    private void func_119_a(int i, boolean flag)
    {
        if(field_183_b.field_1064_b)
        {
            return;
        }
        if(i == 0 && field_143_P > 0)
        {
            return;
        }
        if(flag && field_161_x != null && field_161_x.field_1167_a == 0 && i == 0)
        {
            int j = field_161_x.field_1166_b;
            int k = field_161_x.field_1172_c;
            int l = field_161_x.field_1171_d;
            field_183_b.func_726_c(j, k, l, field_161_x.field_1170_e);
            field_177_h.func_1191_a(j, k, l, field_161_x.field_1170_e);
        } else
        {
            field_183_b.func_724_a();
        }
    }

    private void func_108_a(int i)
    {
        if(i == 0 && field_143_P > 0)
        {
            return;
        }
        if(i == 0)
        {
            field_178_g.func_457_w();
        }
        if(field_161_x == null)
        {
            if(i == 0 && !(field_183_b instanceof PlayerControllerTest))
            {
                field_143_P = 10;
            }
        } else
        if(field_161_x.field_1167_a == 1)
        {
            if(i == 0)
            {
                field_178_g.func_463_a(field_161_x.field_1168_g);
            }
            if(i == 1)
            {
                field_178_g.func_456_a_(field_161_x.field_1168_g);
            }
        } else
        if(field_161_x.field_1167_a == 0)
        {
            int j = field_161_x.field_1166_b;
            int k = field_161_x.field_1172_c;
            int i1 = field_161_x.field_1171_d;
            int j1 = field_161_x.field_1170_e;
            Block block = Block.allBlocks[field_180_e.func_600_a(j, k, i1)];
            if(i == 0)
            {
                field_180_e.func_612_i(j, k, i1, field_161_x.field_1170_e);
                if(block != Block.bedrock || field_178_g.field_777_c >= 100)
                {
                    field_183_b.func_719_a(j, k, i1, field_161_x.field_1170_e);
                }
            } else
            {
                ItemStack itemstack2 = field_178_g.field_778_b.func_494_a();
                int k1 = itemstack2 == null ? 0 : itemstack2.stackSize;
                if(field_183_b.func_722_a(field_178_g, field_180_e, itemstack2, j, k, i1, j1))
                {
                    field_178_g.func_457_w();
                }
                if(itemstack2 == null)
                {
                    return;
                }
                if(itemstack2.stackSize == 0)
                {
                    field_178_g.field_778_b.mainInventory[field_178_g.field_778_b.currentItem] = null;
                } else
                if(itemstack2.stackSize != k1)
                {
                    field_167_r.field_1395_a.func_891_b();
                }
            }
        }
        if(i == 1)
        {
            ItemStack itemstack = field_178_g.field_778_b.func_494_a();
            if(itemstack != null)
            {
                int l = itemstack.stackSize;
                ItemStack itemstack1 = itemstack.func_1093_a(field_180_e, field_178_g);
                if(itemstack1 != itemstack || itemstack1 != null && itemstack1.stackSize != l)
                {
                    field_178_g.field_778_b.mainInventory[field_178_g.field_778_b.currentItem] = itemstack1;
                    field_167_r.field_1395_a.func_896_c();
                    if(itemstack1.stackSize == 0)
                    {
                        field_178_g.field_778_b.mainInventory[field_178_g.field_778_b.currentItem] = null;
                    }
                }
            }
        }
    }

    public void func_133_h()
    {
        try
        {
            field_184_a = !field_184_a;
            System.out.println("Toggle fullscreen!");
            if(field_184_a)
            {
                Display.setDisplayMode(Display.getDesktopDisplayMode());
                displayWidth = Display.getDisplayMode().getWidth();
                displayHeight = Display.getDisplayMode().getHeight();
                if(displayWidth <= 0)
                {
                    displayWidth = 1;
                }
                if(displayHeight <= 0)
                {
                    displayHeight = 1;
                }
            } else
            {
                if(field_174_k != null)
                {
                    displayWidth = field_174_k.getWidth();
                    displayHeight = field_174_k.getHeight();
                } else
                {
                    displayWidth = field_142_Q;
                    displayHeight = field_141_R;
                }
                if(displayWidth <= 0)
                {
                    displayWidth = 1;
                }
                if(displayHeight <= 0)
                {
                    displayHeight = 1;
                }
                Display.setDisplayMode(new org.lwjgl.opengl.DisplayMode(field_142_Q, field_141_R));
            }
            func_138_f();
            Display.setFullscreen(field_184_a);
            Display.update();
            Thread.sleep(1000L);
            if(field_184_a)
            {
                func_123_e();
            }
            if(field_169_p != null)
            {
                func_138_f();
                func_115_a(displayWidth, displayHeight);
            }
            System.out.println((new StringBuilder()).append("Size: ").append(displayWidth).append(", ").append(displayHeight).toString());
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_115_a(int i, int j)
    {
        if(i <= 0)
        {
            i = 1;
        }
        if(j <= 0)
        {
            j = 1;
        }
        displayWidth = i;
        displayHeight = j;
        if(field_169_p != null)
        {
            ScaledResolution scaledresolution = new ScaledResolution(i, j);
            int k = scaledresolution.func_903_a();
            int l = scaledresolution.func_902_b();
            field_169_p.func_563_a(this, k, l);
        }
    }

    private void func_114_s()
    {
        if(field_161_x != null)
        {
            int i = field_180_e.func_600_a(field_161_x.field_1166_b, field_161_x.field_1172_c, field_161_x.field_1171_d);
            if(i == Block.grass.blockID)
            {
                i = Block.dirt.blockID;
            }
            if(i == Block.stairDouble.blockID)
            {
                i = Block.stairSingle.blockID;
            }
            if(i == Block.bedrock.blockID)
            {
                i = Block.stone.blockID;
            }
            field_178_g.field_778_b.func_496_a(i, field_183_b instanceof PlayerControllerTest);
        }
    }

    public void func_111_i()
    {
        field_164_u.func_555_a();
        field_167_r.func_910_a(1.0F);
        if(field_178_g != null)
        {
            field_178_g.func_462_n();
        }
        if(!field_172_m && field_180_e != null)
        {
            field_183_b.func_728_c();
        }
        GL11.glBindTexture(3553, field_171_n.func_1070_a("/terrain.png"));
        if(!field_172_m)
        {
            field_171_n.func_1067_a();
        }
        if(field_169_p == null && field_178_g != null && field_178_g.health <= 0)
        {
            func_128_a(null);
        }
        if(field_169_p != null)
        {
            field_135_X = field_144_O + 10000;
        }
        if(field_169_p != null)
        {
            field_169_p.func_564_d();
            if(field_169_p != null)
            {
                field_169_p.func_570_g();
            }
        }
        if(field_169_p == null || field_169_p.field_948_f)
        {
            do
            {
                if(!Mouse.next())
                {
                    break;
                }
                long l = System.currentTimeMillis() - field_148_K;
                if(l <= 200L)
                {
                    int j = Mouse.getEventDWheel();
                    if(j != 0)
                    {
                        field_178_g.field_778_b.func_498_a(j);
                    }
                    if(field_169_p == null)
                    {
                        if(!field_150_I && Mouse.getEventButtonState())
                        {
                            func_123_e();
                        } else
                        {
                            if(Mouse.getEventButton() == 0 && Mouse.getEventButtonState())
                            {
                                func_108_a(0);
                                field_135_X = field_144_O;
                            }
                            if(Mouse.getEventButton() == 1 && Mouse.getEventButtonState())
                            {
                                func_108_a(1);
                                field_135_X = field_144_O;
                            }
                            if(Mouse.getEventButton() == 2 && Mouse.getEventButtonState())
                            {
                                func_114_s();
                            }
                        }
                    } else
                    if(field_169_p != null)
                    {
                        field_169_p.func_566_e();
                    }
                }
            } while(true);
            if(field_143_P > 0)
            {
                field_143_P--;
            }
            do
            {
                if(!Keyboard.next())
                {
                    break;
                }
                field_178_g.func_460_a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.getEventKey() == 87)
                    {
                        func_133_h();
                    } else
                    {
                        if(field_169_p != null)
                        {
                            field_169_p.func_569_f();
                        } else
                        {
                            if(Keyboard.getEventKey() == 1)
                            {
                                func_117_g();
                            }
                            if(Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61))
                            {
                                func_129_t();
                            }
                            if(Keyboard.getEventKey() == 63)
                            {
                                options.thirdPersonView = !options.thirdPersonView;
                            }
                            if(Keyboard.getEventKey() == options.keyBindInventory.keyCode)
                            {
                                func_128_a(new GuiInventory(field_178_g.field_778_b, field_178_g.field_778_b.craftingInventory));
                            }
                            if(Keyboard.getEventKey() == options.keyBindDrop.keyCode)
                            {
                                field_178_g.func_444_a(field_178_g.field_778_b.func_473_a(field_178_g.field_778_b.currentItem, 1), false);
                            }
                            if(func_124_j() && Keyboard.getEventKey() == options.keyBindChat.keyCode)
                            {
                                func_128_a(new GuiChat());
                            }
                        }
                        for(int i = 0; i < 9; i++)
                        {
                            if(Keyboard.getEventKey() == 2 + i)
                            {
                                field_178_g.field_778_b.currentItem = i;
                            }
                        }

                        if(Keyboard.getEventKey() == options.keyBindToggleFog.keyCode)
                        {
                            options.func_1045_b(4, !Keyboard.isKeyDown(42) && !Keyboard.isKeyDown(54) ? 1 : -1);
                        }
                    }
                }
            } while(true);
            if(field_169_p == null)
            {
                if(Mouse.isButtonDown(0) && (float)(field_144_O - field_135_X) >= field_146_M.field_1380_a / 4F && field_150_I)
                {
                    func_108_a(0);
                    field_135_X = field_144_O;
                }
                if(Mouse.isButtonDown(1) && (float)(field_144_O - field_135_X) >= field_146_M.field_1380_a / 4F && field_150_I)
                {
                    func_108_a(1);
                    field_135_X = field_144_O;
                }
            }
            func_119_a(0, field_169_p == null && Mouse.isButtonDown(0) && field_150_I);
        }
        if(field_180_e != null)
        {
            if(field_178_g != null)
            {
                field_134_Y++;
                if(field_134_Y == 30)
                {
                    field_134_Y = 0;
                    field_180_e.func_705_f(field_178_g);
                }
            }
            field_180_e.field_1039_l = options.difficulty;
            if(!field_172_m)
            {
                field_167_r.func_911_a();
            }
            if(!field_172_m)
            {
                field_179_f.func_945_d();
            }
            if(!field_172_m)
            {
                field_180_e.func_633_c();
            }
            if(!field_172_m || func_124_j())
            {
                field_180_e.func_649_g();
            }
            if(!field_172_m && field_180_e != null)
            {
                field_180_e.func_677_m(MathHelper.func_1108_b(field_178_g.posX), MathHelper.func_1108_b(field_178_g.posY), MathHelper.func_1108_b(field_178_g.posZ));
            }
            if(!field_172_m)
            {
                field_177_h.func_1193_a();
            }
        }
        field_148_K = System.currentTimeMillis();
    }

    private void func_129_t()
    {
        System.out.println("FORCING RELOAD!");
        field_158_A = new SoundManager();
        field_158_A.func_340_a(options);
        field_145_N.func_1210_a();
    }

    public boolean func_124_j()
    {
        return field_180_e != null && field_180_e.field_1026_y;
    }

    public void func_113_b(String s)
    {
        func_134_a(null);
        System.gc();
        World world = new World(new File(func_106_b(), "saves"), s);
        if(world.field_1033_r)
        {
            func_105_a(world, "Generating level");
        } else
        {
            func_105_a(world, "Loading level");
        }
    }

    public void func_134_a(World world)
    {
        func_105_a(world, "");
    }

    public void func_105_a(World world, String s)
    {
        field_158_A.func_331_a(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        if(field_180_e != null)
        {
            field_180_e.func_651_a(field_168_q);
        }
        field_180_e = world;
        if(world != null)
        {
            field_183_b.func_717_a(world);
            world.field_1038_m = field_170_o;
            if(!func_124_j())
            {
                field_178_g = (EntityPlayerSP)world.func_661_a(EntityPlayerSP.class);
            } else
            if(field_178_g != null)
            {
                field_178_g.func_374_q();
                if(world != null)
                {
                    world.func_674_a(field_178_g);
                }
            }
            if(!world.field_1026_y)
            {
                func_120_d(s);
            }
            if(field_178_g == null)
            {
                field_178_g = (EntityPlayerSP)field_183_b.func_721_b(world);
                field_178_g.func_374_q();
                field_183_b.func_720_a(field_178_g);
            }
            field_178_g.field_787_a = new MovementInputFromOptions(options);
            if(field_179_f != null)
            {
                field_179_f.func_946_a(world);
            }
            if(field_177_h != null)
            {
                field_177_h.func_1188_a(world);
            }
            field_183_b.func_718_b(field_178_g);
            world.func_608_a(field_178_g);
            if(world.field_1033_r)
            {
                world.func_651_a(field_168_q);
            }
        } else
        {
            field_178_g = null;
        }
        System.gc();
        field_148_K = 0L;
    }

    private void func_120_d(String s)
    {
        field_168_q.func_596_a(s);
        field_168_q.func_595_d("Building terrain");
        char c = '\200';
        int i = 0;
        int j = (c * 2) / 16 + 1;
        j *= j;
        for(int k = -c; k <= c; k += 16)
        {
            int l = field_180_e.spawnX;
            int i1 = field_180_e.spawnZ;
            if(field_178_g != null)
            {
                l = (int)field_178_g.posX;
                i1 = (int)field_178_g.posZ;
            }
            for(int j1 = -c; j1 <= c; j1 += 16)
            {
                field_168_q.func_593_a((i++ * 100) / j);
                field_180_e.func_600_a(l + k, 64, i1 + j1);
                while(field_180_e.func_638_e()) ;
            }

        }

        field_168_q.func_595_d("Simulating world for a bit");
        j = 2000;
        field_180_e.func_656_j();
    }

    public void func_131_a(String s, File file)
    {
        int i = s.indexOf("/");
        String s1 = s.substring(0, i);
        s = s.substring(i + 1);
        if(s1.equalsIgnoreCase("sound"))
        {
            field_158_A.func_332_a(s, file);
        } else
        if(s1.equalsIgnoreCase("newsound"))
        {
            field_158_A.func_332_a(s, file);
        } else
        if(s1.equalsIgnoreCase("streaming"))
        {
            field_158_A.func_333_b(s, file);
        } else
        if(s1.equalsIgnoreCase("music"))
        {
            field_158_A.func_334_c(s, file);
        } else
        if(s1.equalsIgnoreCase("newmusic"))
        {
            field_158_A.func_334_c(s, file);
        }
    }

    public OpenGlCapsChecker func_137_k()
    {
        return field_147_L;
    }

    public String func_122_l()
    {
        return field_179_f.func_953_b();
    }

    public String func_107_m()
    {
        return field_179_f.func_957_c();
    }

    public String func_125_n()
    {
        return (new StringBuilder()).append("P: ").append(field_177_h.func_1190_b()).append(". T: ").append(field_180_e.func_687_d()).toString();
    }

    public void func_126_o()
    {
        field_180_e.func_622_a();
        if(field_178_g != null)
        {
            field_180_e.func_607_d(field_178_g);
        }
        field_178_g = (EntityPlayerSP)field_183_b.func_721_b(field_180_e);
        field_178_g.func_374_q();
        field_183_b.func_720_a(field_178_g);
        field_180_e.func_608_a(field_178_g);
        field_178_g.field_787_a = new MovementInputFromOptions(options);
        field_183_b.func_718_b(field_178_g);
        func_120_d("Respawning");
    }

    public static void func_132_a(String s, String s1)
    {
        func_118_a(s, s1, null);
    }

    public static void func_118_a(String s, String s1, String s2)
    {
        boolean flag = false;
        String s3 = s;
        Frame frame = new Frame("Minecraft");
        Canvas canvas = new Canvas();
        frame.setLayout(new BorderLayout());
        frame.add(canvas, "Center");
        canvas.setPreferredSize(new Dimension(854, 480));
        frame.pack();
        frame.setLocationRelativeTo(null);
        MinecraftImpl minecraftimpl = new MinecraftImpl(frame, canvas, null, 854, 480, flag, frame);
        Thread thread = new Thread(minecraftimpl, "Minecraft main thread");
        thread.setPriority(10);
        minecraftimpl.field_173_l = false;
        minecraftimpl.field_175_j = "www.minecraft.net";
        if(s3 != null && s1 != null)
        {
            minecraftimpl.field_176_i = new Session(s3, s1);
        } else
        {
            minecraftimpl.field_176_i = new Session((new StringBuilder()).append("Player").append(System.currentTimeMillis() % 1000L).toString(), "");
        }
        if(s2 != null)
        {
            String as[] = s2.split(":");
            minecraftimpl.func_121_a(as[0], Integer.parseInt(as[1]));
        }
        frame.setVisible(true);
        frame.addWindowListener(new GameWindowListener(minecraftimpl, thread));
        thread.start();
    }

    public static void main(String args[])
    {
        String s = (new StringBuilder()).append("Player").append(System.currentTimeMillis() % 1000L).toString();
        if(args.length > 0)
        {
            s = args[0];
        }
        String s1 = "-";
        if(args.length > 1)
        {
            s1 = args[1];
        }
        func_132_a(s, s1);
    }

    public PlayerController field_183_b;
    private boolean field_184_a;
    public int displayWidth;
    public int displayHeight;
    private OpenGlCapsChecker field_147_L;
    private Timer field_146_M;
    public World field_180_e;
    public RenderGlobal field_179_f;
    public EntityPlayerSP field_178_g;
    public EffectRenderer field_177_h;
    public Session field_176_i;
    public String field_175_j;
    public Canvas field_174_k;
    public boolean field_173_l;
    public volatile boolean field_172_m;
    public RenderEngine field_171_n;
    public FontRenderer field_170_o;
    public GuiScreen field_169_p;
    public LoadingScreenRenderer field_168_q;
    public EntityRenderer field_167_r;
    private ThreadDownloadResources field_145_N;
    private int field_144_O;
    private int field_143_P;
    private int field_142_Q;
    private int field_141_R;
    public String field_166_s;
    public int field_165_t;
    public GuiIngame field_164_u;
    public boolean field_163_v;
    public ModelBiped field_162_w;
    public MovingObjectPosition field_161_x;
    public GameSettings options;
    protected MinecraftApplet field_159_z;
    public SoundManager field_158_A;
    public MouseHelper field_157_B;
    public File field_156_C;
    public static long field_155_D[] = new long[512];
    public static int field_154_E = 0;
    private String field_140_S;
    private int field_139_T;
    private TextureWaterFX field_138_U;
    private TextureLavaFX field_137_V;
    private static File dataFolder = null;
    public volatile boolean field_153_F;
    public String field_152_G;
    long field_151_H;
    public boolean field_150_I;
    private int field_135_X;
    public boolean enableRain;
    long field_148_K;
    private int field_134_Y;

}
