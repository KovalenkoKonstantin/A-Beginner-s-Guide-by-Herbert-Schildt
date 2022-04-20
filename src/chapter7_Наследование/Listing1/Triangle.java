package chapter7_Наследование.Listing1;

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height / 2;
//Из класса Triangle можно обращаться к членам класса ТWoDShape так,
// как если бы это были его собственные члены
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
