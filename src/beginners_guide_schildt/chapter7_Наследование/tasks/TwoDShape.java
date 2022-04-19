package beginners_guide_schildt.chapter7_Наследование.tasks;

// Create an abstract class.
abstract class TwoDShape {
    private double radius;
    private String name;

    TwoDShape(double x, String n) { //конструктор для круга
        radius = x;
        name = n;
    }

    public double getRadius() {
        return radius;
    }

    abstract double area();
}