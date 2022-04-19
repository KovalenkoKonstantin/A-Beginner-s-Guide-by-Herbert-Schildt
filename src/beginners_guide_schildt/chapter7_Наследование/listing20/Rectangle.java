package beginners_guide_schildt.chapter7_Наследование.listing20;

// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape {
    // A default constructor.
    Rectangle() {
        super();
    }

    // Constructor for Rectangle.
    Rectangle(double w, double h) { //1
        super(w, h, "прямоугольник"); // call superclass constructor
    } //TwoDShape(double w, double h, String n)

    // Construct a square.
    Rectangle(double x) { //2
        super(x, "квадрат"); // call superclass constructor
    } //TwoDShape(double x, String n)

    // Construct an object from an object.
    Rectangle(Rectangle ob) {
        super(ob); // pass object to TwoDShape constructor
    } //TwoDShape(TwoDShape ob)

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    @Override
    // Override area() for Rectangle.
    double area() {
        return getWidth() * getHeight();
    }
    //При каждом переопределении метода area () в нем реализуются
    //средства, необходимые для того типа объекта, который инкапсулируется в подклассе.
}
