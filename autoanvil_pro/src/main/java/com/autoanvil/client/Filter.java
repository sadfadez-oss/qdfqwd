
package com.autoanvil.client;
import java.util.*;
public class Filter {
 public static Set<String> allowed=new HashSet<>();
 public static boolean ok(String e){
  return allowed.isEmpty()||allowed.contains(e);
 }
}
