
package com.autoanvil.client;
import net.minecraft.item.ItemStack;
import java.util.*;

public class Queue {
 public static class T{public ItemStack l,r; public T(ItemStack a,ItemStack b){l=a.copy();r=b.copy();}}
 static List<T> q=new ArrayList<>();
 static int i=0;
 public static void add(ItemStack a,ItemStack b){q.add(new T(a,b));}
 public static T cur(){return i<q.size()?q.get(i):null;}
 public static void next(){i++;}
 public static void clear(){q.clear();i=0;}
 public static List<T> all(){return q;}
}
