package beginners_guide_schildt.chapter7_Наследование.Listing5;

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    private String style;

    // Constructor
    Triangle(String s, double w, double h) {
        setWidth(w); //Инициализация части объекта,
        setHeight(h);//соответствующей классу TwoDShape

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}