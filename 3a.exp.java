interface Shape { double area(); }

record Circle(double r) implements Shape { public double area() { return Math.PI * r * r; } }
record Rectangle(double l, double w) implements Shape { public double area() { return l * w; } }
record Triangle(double b, double h) implements Shape { public double area() { return 0.5 * b * h; } }

public class Main {
    public static void main(String[] args) {
        System.out.println(new Circle(5).area());
        System.out.println(new Rectangle(4, 6).area());
        System.out.println(new Triangle(3, 8).area());
    }
}
