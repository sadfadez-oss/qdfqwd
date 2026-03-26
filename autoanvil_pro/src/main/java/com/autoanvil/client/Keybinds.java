
package com.autoanvil.client;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class Keybinds {
 public static KeyBinding KEY;
 public static void init(){
  KEY=KeyBindingHelper.registerKeyBinding(
   new KeyBinding("AutoAnvil GUI",GLFW.GLFW_KEY_K,"AutoAnvil"));
 }
}
