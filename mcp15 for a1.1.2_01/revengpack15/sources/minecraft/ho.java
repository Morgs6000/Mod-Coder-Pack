// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.nio.*;
import org.lwjgl.opengl.*;

public class ho
{

    private ho(int i)
    {
        field_1505_h = 0;
        field_1501_l = false;
        field_1500_m = false;
        field_1499_n = false;
        field_1498_o = 0;
        field_1497_p = 0;
        field_1495_q = false;
        field_1488_w = false;
        field_1487_x = false;
        field_1485_z = 0;
        field_1496_A = 10;
        field_1494_B = i;
        field_1509_d = df.func_1127_b(i * 4);
        field_1508_e = field_1509_d.asIntBuffer();
        field_1507_f = field_1509_d.asFloatBuffer();
        field_1506_g = new int[i];
        field_1487_x = field_1510_c && GLContext.getCapabilities().GL_ARB_vertex_buffer_object;
        if(field_1487_x)
        {
            field_1486_y = df.func_1125_c(field_1496_A);
            ARBVertexBufferObject.glGenBuffersARB(field_1486_y);
        }
    }

    public void func_982_a()
    {
        if(!field_1488_w)
        {
            throw new IllegalStateException("Not tesselating!");
        }
        field_1488_w = false;
        if(field_1505_h > 0)
        {
            field_1508_e.clear();
            field_1508_e.put(field_1506_g, 0, field_1498_o);
            field_1509_d.position(0);
            field_1509_d.limit(field_1498_o * 4);
            if(field_1487_x)
            {
                field_1485_z = (field_1485_z + 1) % field_1496_A;
                ARBVertexBufferObject.glBindBufferARB(34962, field_1486_y.get(field_1485_z));
                ARBVertexBufferObject.glBufferDataARB(34962, field_1509_d, 35040);
            }
            if(field_1500_m)
            {
                if(field_1487_x)
                {
                    GL11.glTexCoordPointer(2, 5126, 32, 12L);
                } else
                {
                    field_1507_f.position(3);
                    GL11.glTexCoordPointer(2, 32, field_1507_f);
                }
                GL11.glEnableClientState(32888);
            }
            if(field_1501_l)
            {
                if(field_1487_x)
                {
                    GL11.glColorPointer(4, 5121, 32, 20L);
                } else
                {
                    field_1509_d.position(20);
                    GL11.glColorPointer(4, true, 32, field_1509_d);
                }
                GL11.glEnableClientState(32886);
            }
            if(field_1499_n)
            {
                if(field_1487_x)
                {
                    GL11.glNormalPointer(5120, 32, 24L);
                } else
                {
                    field_1509_d.position(24);
                    GL11.glNormalPointer(32, field_1509_d);
                }
                GL11.glEnableClientState(32885);
            }
            if(field_1487_x)
            {
                GL11.glVertexPointer(3, 5126, 32, 0L);
            } else
            {
                field_1507_f.position(0);
                GL11.glVertexPointer(3, 32, field_1507_f);
            }
            GL11.glEnableClientState(32884);
            if(field_1493_r == 7 && field_1511_b)
            {
                GL11.glDrawArrays(4, 0, field_1505_h);
            } else
            {
                GL11.glDrawArrays(field_1493_r, 0, field_1505_h);
            }
            GL11.glDisableClientState(32884);
            if(field_1500_m)
            {
                GL11.glDisableClientState(32888);
            }
            if(field_1501_l)
            {
                GL11.glDisableClientState(32886);
            }
            if(field_1499_n)
            {
                GL11.glDisableClientState(32885);
            }
        }
        func_985_d();
    }

    private void func_985_d()
    {
        field_1505_h = 0;
        field_1509_d.clear();
        field_1498_o = 0;
        field_1497_p = 0;
    }

    public void func_977_b()
    {
        func_992_a(7);
    }

    public void func_992_a(int i)
    {
        if(field_1488_w)
        {
            throw new IllegalStateException("Already tesselating!");
        } else
        {
            field_1488_w = true;
            func_985_d();
            field_1493_r = i;
            field_1499_n = false;
            field_1501_l = false;
            field_1500_m = false;
            field_1495_q = false;
            return;
        }
    }

    public void func_981_a(double d, double d1)
    {
        field_1500_m = true;
        field_1504_i = d;
        field_1503_j = d1;
    }

    public void func_987_a(float f, float f1, float f2)
    {
        func_979_a((int)(f * 255F), (int)(f1 * 255F), (int)(f2 * 255F));
    }

    public void func_986_a(float f, float f1, float f2, float f3)
    {
        func_978_a((int)(f * 255F), (int)(f1 * 255F), (int)(f2 * 255F), (int)(f3 * 255F));
    }

    public void func_979_a(int i, int j, int k)
    {
        func_978_a(i, j, k, 255);
    }

    public void func_978_a(int i, int j, int k, int l)
    {
        if(field_1495_q)
        {
            return;
        }
        if(i > 255)
        {
            i = 255;
        }
        if(j > 255)
        {
            j = 255;
        }
        if(k > 255)
        {
            k = 255;
        }
        if(l > 255)
        {
            l = 255;
        }
        if(i < 0)
        {
            i = 0;
        }
        if(j < 0)
        {
            j = 0;
        }
        if(k < 0)
        {
            k = 0;
        }
        if(l < 0)
        {
            l = 0;
        }
        field_1501_l = true;
        field_1502_k = l << 24 | k << 16 | j << 8 | i;
    }

    public void func_983_a(double d, double d1, double d2, double d3, double d4)
    {
        func_981_a(d3, d4);
        func_991_a(d, d1, d2);
    }

    public void func_991_a(double d, double d1, double d2)
    {
        field_1497_p++;
        if(field_1493_r == 7 && field_1511_b && field_1497_p % 4 == 0)
        {
            for(int i = 0; i < 2; i++)
            {
                int j = 8 * (3 - i);
                if(field_1500_m)
                {
                    field_1506_g[field_1498_o + 3] = field_1506_g[(field_1498_o - j) + 3];
                    field_1506_g[field_1498_o + 4] = field_1506_g[(field_1498_o - j) + 4];
                }
                if(field_1501_l)
                {
                    field_1506_g[field_1498_o + 5] = field_1506_g[(field_1498_o - j) + 5];
                }
                field_1506_g[field_1498_o + 0] = field_1506_g[(field_1498_o - j) + 0];
                field_1506_g[field_1498_o + 1] = field_1506_g[(field_1498_o - j) + 1];
                field_1506_g[field_1498_o + 2] = field_1506_g[(field_1498_o - j) + 2];
                field_1505_h++;
                field_1498_o += 8;
            }

        }
        if(field_1500_m)
        {
            field_1506_g[field_1498_o + 3] = Float.floatToRawIntBits((float)field_1504_i);
            field_1506_g[field_1498_o + 4] = Float.floatToRawIntBits((float)field_1503_j);
        }
        if(field_1501_l)
        {
            field_1506_g[field_1498_o + 5] = field_1502_k;
        }
        if(field_1499_n)
        {
            field_1506_g[field_1498_o + 6] = field_1489_v;
        }
        field_1506_g[field_1498_o + 0] = Float.floatToRawIntBits((float)(d + field_1492_s));
        field_1506_g[field_1498_o + 1] = Float.floatToRawIntBits((float)(d1 + field_1491_t));
        field_1506_g[field_1498_o + 2] = Float.floatToRawIntBits((float)(d2 + field_1490_u));
        field_1498_o += 8;
        field_1505_h++;
        if(field_1505_h % 4 == 0 && field_1498_o >= field_1494_B - 32)
        {
            func_982_a();
            field_1488_w = true;
        }
    }

    public void func_990_b(int i)
    {
        int j = i >> 16 & 0xff;
        int k = i >> 8 & 0xff;
        int l = i & 0xff;
        func_979_a(j, k, l);
    }

    public void func_989_c()
    {
        field_1495_q = true;
    }

    public void func_980_b(float f, float f1, float f2)
    {
        if(!field_1488_w)
        {
            System.out.println("But..");
        }
        field_1499_n = true;
        byte byte0 = (byte)(int)(f * 128F);
        byte byte1 = (byte)(int)(f1 * 127F);
        byte byte2 = (byte)(int)(f2 * 127F);
        field_1489_v = byte0 | byte1 << 8 | byte2 << 16;
    }

    public void func_984_b(double d, double d1, double d2)
    {
        field_1492_s = d;
        field_1491_t = d1;
        field_1490_u = d2;
    }

    public void func_988_c(float f, float f1, float f2)
    {
        field_1492_s += f;
        field_1491_t += f1;
        field_1490_u += f2;
    }

    private static boolean field_1511_b = true;
    private static boolean field_1510_c = false;
    private ByteBuffer field_1509_d;
    private IntBuffer field_1508_e;
    private FloatBuffer field_1507_f;
    private int field_1506_g[];
    private int field_1505_h;
    private double field_1504_i;
    private double field_1503_j;
    private int field_1502_k;
    private boolean field_1501_l;
    private boolean field_1500_m;
    private boolean field_1499_n;
    private int field_1498_o;
    private int field_1497_p;
    private boolean field_1495_q;
    private int field_1493_r;
    private double field_1492_s;
    private double field_1491_t;
    private double field_1490_u;
    private int field_1489_v;
    public static final ho field_1512_a = new ho(0x200000);
    private boolean field_1488_w;
    private boolean field_1487_x;
    private IntBuffer field_1486_y;
    private int field_1485_z;
    private int field_1496_A;
    private int field_1494_B;

}
