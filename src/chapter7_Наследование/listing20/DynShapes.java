package chapter7_Наследование.listing20;

class DynShapes {
    public static void main(String args[]) {
        TwoDShape shapes[] = new TwoDShape[5];
//геометрические фигуры объявляются как массив
//объектов типа TwoDShape
//Но на самом деле элементами массива являются ссылки на
//объекты Triangle, Rectangle и TwoDShape
        shapes[0] = new Triangle("outlined", 8.0, 12.0); //1
        shapes[1] = new Rectangle(10); //2
        shapes[2] = new Rectangle(10, 4); //1
        shapes[3] = new Triangle(7.0); //2
        shapes[4] = new TwoDShape(10, 20, "generic"); //1

        for(int i=0; i < shapes.length; i++) {
            System.out.println("объект " + shapes[i].getName());
            System.out.println("площадь " + shapes[i].area());

            System.out.println();
        }
    }
}
