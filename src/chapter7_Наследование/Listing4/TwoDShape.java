package chapter7_Наследование.Listing4;

// Use accessor methods to set and get private members.

// A class for two-dimensional objects.
class TwoDShape {
    private double width;  // these are
    private double height; // now private

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Ширина и высота " +
                width + " и " + height);
    }
}
