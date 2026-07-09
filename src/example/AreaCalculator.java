package example;
import java.util.Scanner;

public class AreaCalculator {

    static void areaSquare(double side) {
        System.out.println("Area of Square = " + (side * side));
    }

    static void areaRectangle(double length, double breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    static void areaCircle(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                areaSquare(side);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                areaRectangle(length, breadth);
                break;

            case 3:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                areaCircle(radius);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}