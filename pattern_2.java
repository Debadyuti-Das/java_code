public class pattern_2 {
   

   public static void main(String[] var0) {
      byte var1 = 4;
      byte var2 = 5;

      for(int var3 = 1; var3 <= var1; ++var3) {
         for(int var4 = 1; var4 <= var2; ++var4) {
            if (var3 != 1 && var3 != var1 && var4 != 1 && var4 != var2) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }
}

