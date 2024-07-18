public class Circle extends Shape {
//    This value should be stored in an instance variable that is private,
    public double radius;
    private final double pi= 3.14;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    //accessor
    public double getRadius() {
        return radius;
    }
    //mutator
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //area
    @Override
    public double calculateArea() {
        return pi*(radius*radius);
    }
    //circumference
    @Override
    public double calculateCircumference() {

        return 2*pi*radius;
    }
}
