import java.util.Scanner;

class excercise3 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        for(int i=0;i < 10; i++) {
            System.out.println(num + "x" + (i+1) + "=" + (num * (i+1)));
        }
    }
}