package beginners_guide_schildt.chapter7_Наследование.listing20;

// Use dynamic method dispatch.
// Использование динамической диспетчеризации методов
 class TwoDShape {
    private double width;
    private double height;
    private String name;

    // A default constructor.
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // Parameterized constructor.
    TwoDShape(double w, double h, String n) { //1
        width = w;
        height = h;
        name = n;
    }

    // Construct object with equal width and height.
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Construct an object from an object.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods for width and height.

    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    void setWidth(double w) {
        width = w;
    }
    void setHeight(double h) {
        height = h;
    }


    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Ширина и высота" +
                width + " и " + height);
    }

    double  area() {
        System.out.println("area() должен быть переопределен");
        return 0.0;
    }
}
