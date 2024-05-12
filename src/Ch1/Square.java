package Ch1;

public class Square extends GeometricObject implements Colorable {

    private double side;
    public Square() {
        this(0);
    }
    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
    @Override
    public double getArea() {
        return side * side;
    }

}
