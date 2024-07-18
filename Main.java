public class Main {
    public static void main(String[] args) {
        Circle circle1=new Circle(2.5);
        System.out.println("Circle area:"+ circle1.calculateArea());
        System.out.println("Circle Circumference:"+ circle1.calculateCircumference());
        System.out.println("Radius value: "+circle1.getRadius());

        Rectangle rectangle1=new Rectangle(12,6);
        System.out.println("Rectangle area: "+rectangle1.calculateArea());
        System.out.println("Rectangle Circumference: "+rectangle1.calculateCircumference());

        Triangle triangle1=new Triangle(13,22);
        System.out.println("Triangle area: "+triangle1.calculateArea());
        System.out.println("Triangle Perimeter: "+triangle1.calculateCircumference());
    }
}