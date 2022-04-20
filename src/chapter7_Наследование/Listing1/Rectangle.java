package chapter7_Наследование.Listing1;

// Подкласс для представления прямоугольников.
class Rectangle extends TwoDShape {
    boolean isSquare() {
        if(width == height) return true;
        return false;
    }

    double area() {
        return width * height;
    }
}
