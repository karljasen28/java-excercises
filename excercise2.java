import java.util.Scanner;

public class excercise2 {
    public static void main(String[] args) {
    // Write your code here
    Scanner scan = new Scanner(System.in);
    int x, y;
    int sum, sub, pro, div = 0;
    
    int a = -5 + 8 * 6;
    int b = (55 + 9) % 9;
    int c = 20 + (-3 * 5 / 8);
    int d = 5 + 15 / 3 * 2 - 8 % 3;

    System.out.print("First number: ");
    x = scan.nextInt();
    System.out.print("Second number: ");
    y = scan.nextInt();

    sum = x+y;
    sub = x-y;
    pro = x*y;
    div = x/y;

    System.out.println("SUM: " + sum);
    System.out.println("DIFFERENCE: " + sub);
    System.out.println("PRODUCT: " + pro);
    System.out.println("QUOTIENT: " + div);
    System.out.print(a + "\n" + b + "\n" + c + "\n" + d);
   }
  }