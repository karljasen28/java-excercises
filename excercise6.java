import java.util.Scanner;

class excercise6 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        //Write a Java program to print the area and perimeter of a rectangle
        // where width is equal to 5.5 and height 8.5

        double width = 5.5;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}