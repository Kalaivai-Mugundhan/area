import java.util.Scanner;

public class areas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Choose a shape to calculate the area:");
    System.out.println("1. Circle");
    System.out.println("2. Rectangle");
    System.out.println("3. Triangle");

    int choice = scanner.nextInt();
    Shape shape = null;

    switch (choice) {
      case 1: // Circle
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        shape = new Circle(radius);
        break;

      case 2: // Rectangle
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle:");
        double height = scanner.nextDouble();
        shape = new Rectangle(width, height);
        break;

      case 3: // Triangle
        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double heightT = scanner.nextDouble();
        shape = new Triangle(base, heightT);
        break;

      default:
        System.out.println("Invalid choice!");
        System.exit(0);
    }

    // Display the area of the selected shape
    System.out.println("The area of the shape is: " + shape.getArea());
  }
}

// Abstract class Shape
public abstract class Shape {
  // Abstract method to get the area of the shape
  public abstract double getArea();
}

// Class for Circle
public class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius; // Area of the circle
  }
}

// Class for Rectangle
public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height; // Area of the rectangle
  }
}

// Class for Triangle
public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public double getArea() {
    return 0.5 * base * height; // Area of the triangle
  }
}