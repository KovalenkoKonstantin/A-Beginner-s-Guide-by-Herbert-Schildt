package chapter7_Наследование.tasks;

/**Создайте подкласс Circle, производный от класса TwoDShape. В нем должен
        быть определен метод area (), вычисляющий площадь круга, а также конструктор
        с ключевым словом super для инициализации членов, унаследованных от класса
        TwoDShape.
 S = π × r2
 */

public class Circle extends TwoDShape{

    Circle(double x) {
        super(x, "circle"); // call superclass constructor
    }

    @Override
        double area(){
            return Math.pow(getRadius(), 2) * Math.PI;
    }
}
