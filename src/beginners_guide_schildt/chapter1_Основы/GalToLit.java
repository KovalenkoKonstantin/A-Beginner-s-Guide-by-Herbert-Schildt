package beginners_guide_schildt.chapter1_Основы;
/*Упражнение 1.1
Программа перевода галлонов в литры.
Присвойте файлу с исходным кодом имя GalToLit.java.*/
class GalToLit{
    public static void main(String args[]) {
        double gallons=500; //в этой переменной хранится значение, выражающее объем жидкости в галлонах
        double liters=gallons*3.7854;  //в этой переменной хранится значение, объем жидкости в литрах

//        gallons = 10; //начальное значение соответствует 10 галлонам
//liters = gallons * 3.7854; //перевести в литры

        System.out.println(gallons + " галлонам соответствует " + liters + " литров.");
    }
}
