package Ch1;

public class GeometricObject {
    private String color;
    public GeometricObject() {
        this.color = "white";
    }
    public GeometricObject(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        // Implementation of area calculation
        return 0.0; // Placeholder value, actual implementation depends on the subclass
    }

}
