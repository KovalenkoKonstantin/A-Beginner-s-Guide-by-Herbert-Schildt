package beginners_guide_schildt.chapter4_Методы;

class IsFact {
    public static void main(String args[]) {
        Factor x = new Factor();

        if(x.isFactor(2, 20)) System.out.println("2 is factor/делитель");
        //Передача двух аргументов методу isFactor ()
        if(x.isFactor(3, 20)) System.out.println("this won't be displayed");
        //при вызове метода isFactor () передаваемые ему значения
        //также как и в инициализации метода разделяются запятыми.

    }
}
