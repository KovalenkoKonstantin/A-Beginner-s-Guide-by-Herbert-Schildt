package chapter4_Методы;

/* A program that uses the Vehicle class.

   Call this file VehicleDemo.java
*/
class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon
    // Возврат дальности поездки.

    // Это конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Определить дальность поездки транспортного средства
    //это метод класса Vehicle
    int range() {
        return mpg * fuelcap; //Возврат дальности поездкн дпя заданого транспортного средства
        //void range() {
        //System.out.println("Range is " + fuelcap * mpg);
        //переменные fuelcap и mpg,
        //встречающиеся в теле метода range (), неявно обозначают их копии,
        //находящиеся в том объекте, для которого вызывается метод range ()
    }

    // Рассчитать объем топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    //это метод класса Vehicle
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}