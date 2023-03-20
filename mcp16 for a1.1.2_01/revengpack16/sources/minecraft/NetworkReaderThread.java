// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class NetworkReaderThread extends Thread
{

    NetworkReaderThread(NetworkManager networkmanager, String s)
    {
        super(s);
        field_1085_a = networkmanager;
    }

    public void run()
    {
        synchronized(NetworkManager.field_1478_a)
        {
            NetworkManager.field_1477_b++;
        }
        try
        {
            for(; NetworkManager.func_971_a(field_1085_a) && !NetworkManager.func_968_b(field_1085_a); NetworkManager.func_966_c(field_1085_a)) { }
        }
        finally
        {
            synchronized(NetworkManager.field_1478_a)
            {
                NetworkManager.field_1477_b--;
            }
        }
    }

    final NetworkManager field_1085_a; /* synthetic field */
}
