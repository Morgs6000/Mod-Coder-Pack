// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class NetworkMasterThread extends Thread
{

    NetworkMasterThread(NetworkManager networkmanager)
    {
        field_1086_a = networkmanager;
    }

    public void run()
    {
        try
        {
            Thread.sleep(5000L);
            if(NetworkManager.func_969_e(field_1086_a).isAlive())
            {
                try
                {
                    NetworkManager.func_969_e(field_1086_a).stop();
                }
                catch(Throwable throwable) { }
            }
            if(NetworkManager.func_963_f(field_1086_a).isAlive())
            {
                try
                {
                    NetworkManager.func_963_f(field_1086_a).stop();
                }
                catch(Throwable throwable1) { }
            }
        }
        catch(InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }

    final NetworkManager field_1086_a; /* synthetic field */
}
