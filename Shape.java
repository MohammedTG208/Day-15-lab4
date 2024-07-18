public abstract class Shape {
//    Shape defines two int variables: x and y,
//which represent the coordinates of the center of the shape.
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Since these methods are abstract, the
    //other classes will define these methods for their specific class.
    public abstract double calculateArea();
    public abstract double calculateCircumference();

}
