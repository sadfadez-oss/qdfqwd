
package com.autoanvil.client;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;

public class AutoAnvilScreen extends Screen {
 protected AutoAnvilScreen(){super(Text.literal("AutoAnvil Pro"));}

 protected void init(){
  int cx=width/2;
  addDrawableChild(ButtonWidget.builder(Text.literal("Clear Queue"),b->Queue.clear())
   .dimensions(cx-100,40,200,20).build());

  addDrawableChild(ButtonWidget.builder(Text.literal("Toggle Sharpness Only"),b->{
   if(Filter.allowed.isEmpty()) Filter.allowed.add("sharpness");
   else Filter.allowed.clear();
  }).dimensions(cx-100,70,200,20).build());
 }

 public void render(DrawContext c,int mx,int my,float d){
  renderBackground(c);
  c.drawCenteredTextWithShadow(textRenderer,title,width/2,15,0xFFFFFF);

  int y=110;
  for(var t:Queue.all()){
   c.drawText(textRenderer,t.l.getName().getString()+" + "+t.r.getName().getString(),20,y,0xAAAAAA,false);
   y+=12;
  }
  super.render(c,mx,my,d);
 }
}
