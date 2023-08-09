package net.minecraft.src;

import net.minecraft.src.DedicatedServer;

public final class ThreadDedicatedServer extends Thread {

   // $FF: synthetic field
   final DedicatedServer field_92021_a;


   public ThreadDedicatedServer(DedicatedServer p_i4100_1_) {
      this.field_92021_a = p_i4100_1_;
   }

   public void run() {
      this.field_92021_a.func_71260_j();
   }
}
