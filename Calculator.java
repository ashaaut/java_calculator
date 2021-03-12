import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first Number: ");
      int num1=sc.nextInt();
      System.out.println("Enter the second Number: ");
      int num2=sc.nextInt();
      System.out.println("Choose operation between (+,-,*,/): ");
      String operation=sc.next();
      switch(operation){
         case "+":
         System.out.print("Sum="+(num1+num2));
         break;
         case "-":
         System.out.print("Substraction="+(num1-num2));
         break;
         case "*":
         System.out.print("Multiplicatiom="+(num1*num2));
         break;
         case "/":
         System.out.print("Dividation="+(num1/num2));
         break;
         default:
         System.out.print("Invalid Operation");
      }
   }
}