package circles;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(10.0, "Blue");

        System.out.println("Circle with default constructor: " + c1);
        System.out.println("Circle with second constructor: " + c2);
        System.out.println("Circle with third constructor: " + c3);

        System.out.println("C1's area: " + c1.getArea());
        System.out.println("C2's area: " + c2.getArea());
        System.out.println("C3's area: " + c3.getArea());

        c1.setRadius(15.0);
        c2.setRadius(25.0);
        c3.setRadius(45.0);

        System.out.println("C1's new area: " + c1.getArea());
        System.out.println("C2's new area: " + c2.getArea());
        System.out.println("C3's new area: " + c3.getArea());
    }
}