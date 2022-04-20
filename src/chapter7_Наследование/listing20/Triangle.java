package chapter7_Наследование.listing20;

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    private String style;

    // A default constructor.
    Triangle() {
        super();
        style = "none";
    }

    // Constructor for Triangle.
    Triangle(String s, double w, double h) { //1
        super(w, h, "triangle");//call superclass constructor
        style = s;//TwoDShape(double w, double h, String n)
    }

    // One argument constructor.
    Triangle(double x) { //2
        super(x, "triangle"); // call superclass constructor
        style = "filled";//TwoDShape(double x, String n)
    }

    // Construct an object from an object.
    Triangle(Triangle ob) {
        super(ob); // pass object to TwoDShape(TwoDShape ob) constructor
        style = ob.style;
    }

    @Override
    // Override area() for Triangle.
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}