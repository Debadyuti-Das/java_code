import java.util.HashSet;

public class Subsequences {
   public Subsequences() {
   }

   public static void Subsequences(String var0, int var1, String var2, HashSet<String> var3) {
      if (var1 == var0.length()) {
         if (!var3.contains(var2)) {
            System.out.println(var2);
            var3.add(var2);
         }
      } else {
         char var4 = var0.charAt(var1);
         Subsequences(var0, var1 + 1, var2 + var4, var3);
         Subsequences(var0, var1 + 1, var2, var3);
      }
   }

   public static void main(String[] var0) {
      String var1 = "aaa";
      HashSet var2 = new HashSet();
      Subsequences(var1, 0, "", var2);
   }
}
