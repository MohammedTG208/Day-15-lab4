public class Rectangle extends Shape{

   public double height;
   public double width;

    public Rectangle(int x, int y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.height*this.width;
    }

    @Override
    public double calculateCircumference() {
        return 2*(height*width);
    }
}
