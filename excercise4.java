import java.util.Scanner;

class excercise4 {
    // static value of radius
    private static final double radius = 7.5;

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}