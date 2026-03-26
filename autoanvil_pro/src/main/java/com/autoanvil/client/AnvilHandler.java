
package com.autoanvil.client;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import net.minecraft.screen.slot.SlotActionType;

public class AnvilHandler {
 static int delay=0;
 public static void init(){
  ClientTickEvents.END_CLIENT_TICK.register(c->{
   if(delay>0){delay--;return;}
   if(!(c.currentScreen instanceof AnvilScreen s))return;
   var t=Queue.cur(); if(t==null)return;
   var h=s.getScreenHandler();
   var out=h.getSlot(2).getStack();

   if(!out.isEmpty()){
    c.interactionManager.clickSlot(h.syncId,2,0,SlotActionType.QUICK_MOVE,c.player);
    Queue.next(); delay=8;
   }
  });
 }
}
