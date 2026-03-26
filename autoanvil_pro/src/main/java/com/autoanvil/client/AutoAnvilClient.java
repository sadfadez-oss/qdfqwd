
package com.autoanvil.client;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class AutoAnvilClient implements ClientModInitializer {
 public void onInitializeClient(){
  Keybinds.init();
  AnvilHandler.init();
  ClientTickEvents.END_CLIENT_TICK.register(c->{
   while(Keybinds.KEY.wasPressed()){
    c.setScreen(new AutoAnvilScreen());
   }
  });
 }
}
