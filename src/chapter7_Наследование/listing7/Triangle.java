package chapter7_Наследование.listing7;

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    private String style;

    // A default constructor.
    Triangle() {
        super(); //вызвать конструктор суперкласса по умолчанию
        style = "none";
    }

    // Constructor
    Triangle(String s, double w, double h) {
        super(w, h); // использование оперетора super
// для вызова разных форм конструктора TwoDShape ()

        style = s;
    }

    // One argument constructor.
    Triangle(double x) {
        super(x); // происходит обращение к конструктору его
       //непосредственного суперкласса

        style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
