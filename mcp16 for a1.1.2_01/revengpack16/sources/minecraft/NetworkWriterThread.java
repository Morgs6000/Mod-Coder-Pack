// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class NetworkWriterThread extends Thread
{

    NetworkWriterThread(NetworkManager networkmanager, String s)
    {
        super(s);
        field_1063_a = networkmanager;
    }

    public void run()
    {
        synchronized(NetworkManager.field_1478_a)
        {
            NetworkManager.field_1476_c++;
        }
        try
        {
            for(; NetworkManager.func_971_a(field_1063_a); NetworkManager.func_965_d(field_1063_a)) { }
        }
        finally
        {
            synchronized(NetworkManager.field_1478_a)
            {
                NetworkManager.field_1476_c--;
            }
        }
    }

    final NetworkManager field_1063_a; /* synthetic field */
}
