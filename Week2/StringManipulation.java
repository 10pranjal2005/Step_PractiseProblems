// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class StringManipulation {
   public StringManipulation() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String var2 = var1.nextLine();
      String var3 = var2.trim();
      String var4 = var3.replace(" ", "_");
      String var5 = var4.replaceAll("\\d", "");
      String[] var6 = var5.split("_");
      String var7 = String.join(" | ", var6);
      System.out.println(var3);
      System.out.println(var4);
      System.out.println(var5);
      System.out.println(Arrays.toString(var6));
      System.out.println(var7);
      System.out.println(removePunctuation(var3));
      System.out.println(capitalizeWords(var3));
      System.out.println(reverseWordOrder(var3));
      countWordFrequency(var3);
      var1.close();
   }

   public static String removePunctuation(String var0) {
      return var0.replaceAll("\\p{Punct}", "");
   }

   public static String capitalizeWords(String var0) {
      String[] var1 = var0.split("\\s+");
      StringBuilder var2 = new StringBuilder();
      String[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         var2.append(Character.toUpperCase(var6.charAt(0))).append(var6.substring(1)).append(" ");
      }

      return var2.toString().trim();
   }

   public static String reverseWordOrder(String var0) {
      String[] var1 = var0.split("\\s+");
      Collections.reverse(Arrays.asList(var1));
      return String.join(" ", var1);
   }

   public static void countWordFrequency(String var0) {
      String[] var1 = var0.toLowerCase().split("\\s+");
      HashMap var2 = new HashMap();
      String[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         var2.put(var6, (Integer)var2.getOrDefault(var6, 0) + 1);
      }

      System.out.println(var2);
   }
}
