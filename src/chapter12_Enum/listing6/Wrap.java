package chapter12_Enum.listing6;

// Demonstrate manual boxing and unboxing with a type wrapper.
class Wrap {
    public static void main(String args[]) {
/**создается объект типа Integer, в который упаковывается
 значение 100, а ссылка на этот объект присваивается переменной iOb.*/
        Integer iOb = new Integer(100); // Ручная Упаковка
/**метод intValue () возвращает значение, упакованное в объекте
 iOb как int.*/
        int i = iOb.intValue(); //Ручная Распаковка

        System.out.println(i + " " + iOb); // displays 100 100
    }
}
