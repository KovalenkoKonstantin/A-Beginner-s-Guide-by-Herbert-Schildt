package beginners_guide_schildt.chapter7_Наследование.listing15;

class TwoDShape {
    private double width;
    private double height;

    // A default constructor.
    TwoDShape() {
        width = height = 0.0;
    }

    // Parameterized constructor.
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal width and height.
    TwoDShape(double x) {
        width = height = x;
    }

    // Construct an object from an object.
    TwoDShape(TwoDShape ob) {//Создать один объект на основе другого
        width = ob.width;
        height = ob.height;
    }

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Шиpинa и высота - " +
                width + " и " + height);
    }
}