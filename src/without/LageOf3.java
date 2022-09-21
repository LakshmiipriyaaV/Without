package without;

import java.util.Scanner;
public class LageOf3{

   public static void main(String[] args) {
       int a, b, c, max;
       Scanner scanner;
       // Take three integer from user
       scanner = new Scanner(System.in);
       System.out.println("Enter Three Integer");
       a = scanner.nextInt();
       b = scanner.nextInt();
       c = scanner.nextInt();

       // Using if-else statement compare a, b and c
       if (a > b) {
           // compare a and c
           if (a > c)
               max = a;
           else
               max = c;
       } else {
           // compare b and c
           if (b > c)
               max = b;
           else
               max = c;
       }
       System.out.println("Largest Number : " + max);
   }
}
