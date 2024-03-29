package chapter7_Наследование.listing21;

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    private String style;

    // A default constructor.
    Triangle() {
        super();
        style = "none";
    }

    // Constructor for Triangle.
    Triangle(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    // One argument constructor
    Triangle(double x) {
        super(x, "triangle"); // call superclass constructor

        style = "filled";
    }

    // Construct an object from an object.
    Triangle(Triangle ob) {
        super(ob); // pass object to TwoDShape constructor
        style = ob.style;
    }
@Override
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
