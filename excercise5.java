import java.util.Scanner;

class excercise5 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;
        int avr = 0;

        System.out.println("Enter three numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        avr = a+b+c/3;
        System.out.println("Average: " + avr);
    }
}