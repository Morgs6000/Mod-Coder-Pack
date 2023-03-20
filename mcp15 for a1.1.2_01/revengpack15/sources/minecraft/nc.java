// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.net.ConnectException;
import java.net.UnknownHostException;
//import net.minecraft.client.Minecraft;

class nc extends Thread
{

    nc(mn mn1, Minecraft minecraft, String s, int i)
    {
        super();
        field_1103_d = mn1;
        field_1102_a = minecraft;
        field_1101_b = s;
        field_1104_c = i;
    }

    public void run()
    {
        try
        {
            mn.func_582_a(field_1103_d, new gy(field_1102_a, field_1101_b, field_1104_c));
            if(mn.func_581_a(field_1103_d))
            {
                return;
            }
            mn.func_583_b(field_1103_d).func_847_a(new gt(field_1102_a.field_176_i.field_1666_b));
        }
        catch(UnknownHostException unknownhostexception)
        {
            if(mn.func_581_a(field_1103_d))
            {
                return;
            }
            field_1102_a.func_128_a(new cj("Failed to connect to the server", (new StringBuilder()).append("Unknown host '").append(field_1101_b).append("'").toString()));
        }
        catch(ConnectException connectexception)
        {
            if(mn.func_581_a(field_1103_d))
            {
                return;
            }
            field_1102_a.func_128_a(new cj("Failed to connect to the server", connectexception.getMessage()));
        }
        catch(Exception exception)
        {
            if(mn.func_581_a(field_1103_d))
            {
                return;
            }
            exception.printStackTrace();
            field_1102_a.func_128_a(new cj("Failed to connect to the server", exception.toString()));
        }
    }

    final Minecraft field_1102_a; /* synthetic field */
    final String field_1101_b; /* synthetic field */
    final int field_1104_c; /* synthetic field */
    final mn field_1103_d; /* synthetic field */
}
