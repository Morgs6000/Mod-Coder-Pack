// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
//import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class fr
{

    public fr(Minecraft minecraft, File file)
    {
        field_1584_a = 1.0F;
        field_1583_b = 1.0F;
        field_1582_c = 0.5F;
        field_1581_d = false;
        field_1580_e = 0;
        field_1579_f = true;
        field_1578_g = false;
        field_1577_h = false;
        field_1576_i = true;
        field_1575_j = new it("Forward", 17);
        field_1574_k = new it("Left", 30);
        field_1573_l = new it("Back", 31);
        field_1572_m = new it("Right", 32);
        field_1571_n = new it("Jump", 57);
        field_1570_o = new it("Inventory", 23);
        field_1569_p = new it("Drop", 16);
        field_1567_q = new it("Chat", 20);
        field_1566_r = new it("Toggle fog", 33);
        field_1565_s = new it("Sneak", 42);
        field_1564_t = (new it[] {
            field_1575_j, field_1574_k, field_1573_l, field_1572_m, field_1571_n, field_1565_s, field_1569_p, field_1570_o, field_1567_q, field_1566_r
        });
        field_1562_v = 10;
        field_1561_w = 2;
        field_1560_x = false;
        field_1563_u = minecraft;
        field_1568_A = new File(file, "options.txt");
        func_1044_a();
    }

    public fr()
    {
        field_1584_a = 1.0F;
        field_1583_b = 1.0F;
        field_1582_c = 0.5F;
        field_1581_d = false;
        field_1580_e = 0;
        field_1579_f = true;
        field_1578_g = false;
        field_1577_h = false;
        field_1576_i = true;
        field_1575_j = new it("Forward", 17);
        field_1574_k = new it("Left", 30);
        field_1573_l = new it("Back", 31);
        field_1572_m = new it("Right", 32);
        field_1571_n = new it("Jump", 57);
        field_1570_o = new it("Inventory", 23);
        field_1569_p = new it("Drop", 16);
        field_1567_q = new it("Chat", 20);
        field_1566_r = new it("Toggle fog", 33);
        field_1565_s = new it("Sneak", 42);
        field_1564_t = (new it[] {
            field_1575_j, field_1574_k, field_1573_l, field_1572_m, field_1571_n, field_1565_s, field_1569_p, field_1570_o, field_1567_q, field_1566_r
        });
        field_1562_v = 10;
        field_1561_w = 2;
        field_1560_x = false;
    }

    public String func_1043_a(int i)
    {
        return (new StringBuilder()).append(field_1564_t[i].field_1371_a).append(": ").append(Keyboard.getKeyName(field_1564_t[i].field_1370_b)).toString();
    }

    public void func_1042_a(int i, int j)
    {
        field_1564_t[i].field_1370_b = j;
        func_1041_b();
    }

    public void func_1048_a(int i, float f)
    {
        if(i == 0)
        {
            field_1584_a = f;
            field_1563_u.field_158_A.func_335_a();
        }
        if(i == 1)
        {
            field_1583_b = f;
            field_1563_u.field_158_A.func_335_a();
        }
        if(i == 3)
        {
            field_1582_c = f;
        }
    }

    public void func_1045_b(int i, int j)
    {
        if(i == 2)
        {
            field_1581_d = !field_1581_d;
        }
        if(i == 4)
        {
            field_1580_e = field_1580_e + j & 3;
        }
        if(i == 5)
        {
            field_1579_f = !field_1579_f;
        }
        if(i == 6)
        {
            field_1578_g = !field_1578_g;
            field_1563_u.field_171_n.func_1065_b();
        }
        if(i == 7)
        {
            field_1577_h = !field_1577_h;
        }
        if(i == 8)
        {
            field_1561_w = field_1561_w + j & 3;
        }
        if(i == 9)
        {
            field_1576_i = !field_1576_i;
            field_1563_u.field_179_f.func_958_a();
        }
        func_1041_b();
    }

    public int func_1046_b(int i)
    {
        if(i == 0)
        {
            return 1;
        }
        if(i == 1)
        {
            return 1;
        }
        return i != 3 ? 0 : 1;
    }

    public float func_1049_c(int i)
    {
        if(i == 0)
        {
            return field_1584_a;
        }
        if(i == 1)
        {
            return field_1583_b;
        }
        if(i == 3)
        {
            return field_1582_c;
        } else
        {
            return 0.0F;
        }
    }

    public String func_1047_d(int i)
    {
        if(i == 0)
        {
            return (new StringBuilder()).append("Music: ").append(field_1584_a <= 0.0F ? "OFF" : (new StringBuilder()).append((int)(field_1584_a * 100F)).append("%").toString()).toString();
        }
        if(i == 1)
        {
            return (new StringBuilder()).append("Sound: ").append(field_1583_b <= 0.0F ? "OFF" : (new StringBuilder()).append((int)(field_1583_b * 100F)).append("%").toString()).toString();
        }
        if(i == 2)
        {
            return (new StringBuilder()).append("Invert mouse: ").append(field_1581_d ? "ON" : "OFF").toString();
        }
        if(i == 3)
        {
            if(field_1582_c == 0.0F)
            {
                return "Sensitivity: *yawn*";
            }
            if(field_1582_c == 1.0F)
            {
                return "Sensitivity: HYPERSPEED!!!";
            } else
            {
                return (new StringBuilder()).append("Sensitivity: ").append((int)(field_1582_c * 200F)).append("%").toString();
            }
        }
        if(i == 4)
        {
            return (new StringBuilder()).append("Render distance: ").append(field_1559_y[field_1580_e]).toString();
        }
        if(i == 5)
        {
            return (new StringBuilder()).append("View bobbing: ").append(field_1579_f ? "ON" : "OFF").toString();
        }
        if(i == 6)
        {
            return (new StringBuilder()).append("3d anaglyph: ").append(field_1578_g ? "ON" : "OFF").toString();
        }
        if(i == 7)
        {
            return (new StringBuilder()).append("Limit framerate: ").append(field_1577_h ? "ON" : "OFF").toString();
        }
        if(i == 8)
        {
            return (new StringBuilder()).append("Difficulty: ").append(field_1558_z[field_1561_w]).toString();
        }
        if(i == 9)
        {
            return (new StringBuilder()).append("Graphics: ").append(field_1576_i ? "FANCY" : "FAST").toString();
        } else
        {
            return "";
        }
    }

    public void func_1044_a()
    {
        try
        {
            if(!field_1568_A.exists())
            {
                return;
            }
            BufferedReader bufferedreader = new BufferedReader(new FileReader(field_1568_A));
            for(String s = ""; (s = bufferedreader.readLine()) != null;)
            {
                String as[] = s.split(":");
                if(as[0].equals("music"))
                {
                    field_1584_a = func_1050_a(as[1]);
                }
                if(as[0].equals("sound"))
                {
                    field_1583_b = func_1050_a(as[1]);
                }
                if(as[0].equals("mouseSensitivity"))
                {
                    field_1582_c = func_1050_a(as[1]);
                }
                if(as[0].equals("invertYMouse"))
                {
                    field_1581_d = as[1].equals("true");
                }
                if(as[0].equals("viewDistance"))
                {
                    field_1580_e = Integer.parseInt(as[1]);
                }
                if(as[0].equals("bobView"))
                {
                    field_1579_f = as[1].equals("true");
                }
                if(as[0].equals("anaglyph3d"))
                {
                    field_1578_g = as[1].equals("true");
                }
                if(as[0].equals("limitFramerate"))
                {
                    field_1577_h = as[1].equals("true");
                }
                if(as[0].equals("difficulty"))
                {
                    field_1561_w = Integer.parseInt(as[1]);
                }
                if(as[0].equals("fancyGraphics"))
                {
                    field_1576_i = as[1].equals("true");
                }
                int i = 0;
                while(i < field_1564_t.length) 
                {
                    if(as[0].equals((new StringBuilder()).append("key_").append(field_1564_t[i].field_1371_a).toString()))
                    {
                        field_1564_t[i].field_1370_b = Integer.parseInt(as[1]);
                    }
                    i++;
                }
            }

            bufferedreader.close();
        }
        catch(Exception exception)
        {
            System.out.println("Failed to load options");
            exception.printStackTrace();
        }
    }

    private float func_1050_a(String s)
    {
        if(s.equals("true"))
        {
            return 1.0F;
        }
        if(s.equals("false"))
        {
            return 0.0F;
        } else
        {
            return Float.parseFloat(s);
        }
    }

    public void func_1041_b()
    {
        try
        {
            PrintWriter printwriter = new PrintWriter(new FileWriter(field_1568_A));
            printwriter.println((new StringBuilder()).append("music:").append(field_1584_a).toString());
            printwriter.println((new StringBuilder()).append("sound:").append(field_1583_b).toString());
            printwriter.println((new StringBuilder()).append("invertYMouse:").append(field_1581_d).toString());
            printwriter.println((new StringBuilder()).append("mouseSensitivity:").append(field_1582_c).toString());
            printwriter.println((new StringBuilder()).append("viewDistance:").append(field_1580_e).toString());
            printwriter.println((new StringBuilder()).append("bobView:").append(field_1579_f).toString());
            printwriter.println((new StringBuilder()).append("anaglyph3d:").append(field_1578_g).toString());
            printwriter.println((new StringBuilder()).append("limitFramerate:").append(field_1577_h).toString());
            printwriter.println((new StringBuilder()).append("difficulty:").append(field_1561_w).toString());
            printwriter.println((new StringBuilder()).append("fancyGraphics:").append(field_1576_i).toString());
            for(int i = 0; i < field_1564_t.length; i++)
            {
                printwriter.println((new StringBuilder()).append("key_").append(field_1564_t[i].field_1371_a).append(":").append(field_1564_t[i].field_1370_b).toString());
            }

            printwriter.close();
        }
        catch(Exception exception)
        {
            System.out.println("Failed to save options");
            exception.printStackTrace();
        }
    }

    private static final String field_1559_y[] = {
        "FAR", "NORMAL", "SHORT", "TINY"
    };
    private static final String field_1558_z[] = {
        "Peaceful", "Easy", "Normal", "Hard"
    };
    public float field_1584_a;
    public float field_1583_b;
    public float field_1582_c;
    public boolean field_1581_d;
    public int field_1580_e;
    public boolean field_1579_f;
    public boolean field_1578_g;
    public boolean field_1577_h;
    public boolean field_1576_i;
    public it field_1575_j;
    public it field_1574_k;
    public it field_1573_l;
    public it field_1572_m;
    public it field_1571_n;
    public it field_1570_o;
    public it field_1569_p;
    public it field_1567_q;
    public it field_1566_r;
    public it field_1565_s;
    public it field_1564_t[];
    protected Minecraft field_1563_u;
    private File field_1568_A;
    public int field_1562_v;
    public int field_1561_w;
    public boolean field_1560_x;

}
