package faris;
import java.util.Scanner;

class Area {

    // Circle
    double calculate(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    double calculate(double length, double breadth) {
        return length * breadth;
    }

    // Triangle
    double calculate(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class overloadarea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + obj.calculate(r));

        // Rectangle
        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.calculate(l, b));

        // Triangle
        System.out.print("\nEnter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + obj.calculate(base, height, true));

        sc.close();
    }


	}


