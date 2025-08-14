// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class calculator {
   public calculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("\nEnter 1st number :");
      int var2 = var1.nextInt();
      System.out.println("Enter 2nd number :");
      int var3 = var1.nextInt();
      System.out.println("choose a option :");
      System.out.println("1: Addition :");
      System.out.println("2: Multiplication :");
      System.out.println("3: Difference :");
      System.out.println("4: Division :");
      System.out.println("5: Remainder :");
      int var4 = var1.nextInt();
      double var5 = 0.0;
      switch (var4) {
         case 1:
            var5 = (double)(var2 + var3);
            break;
         case 2:
            var5 = (double)(var2 * var3);
            break;
         case 3:
            var5 = (double)(var2 - var3);
            break;
         case 4:
            var5 = (double)(var2 / var3);
            break;
         case 5:
            var5 = (double)(var2 % var3);
      }
      System.out.println("Result is : " + var5);

   }
}
