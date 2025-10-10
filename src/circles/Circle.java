package circles;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "Red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 3.14 * (this.radius * this.radius);
    }

    public double getCircumference() {
        return 6.28 * this.radius; //2 * PI(3.14) * Radius
    }

    public String toString() {
        return "Circle[radius = " + this.radius + ", color = " + this.color + "]";
    }

}
