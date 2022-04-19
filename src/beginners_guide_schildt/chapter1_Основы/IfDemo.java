package beginners_guide_schildt.chapter1_Основы;
/*Демонстрация применения оператора if.
Присвойте файлу с исходным кодом имя IfDemo.java.*/
class IfDemo{
    public static void main(String args[]){
        int a=2, b=3, c=a-b;

//        a = 2;
//        b = 3;

        if(a < b) System.out.println("a меньше Ь");

        // this won't display anything
        if(a == b) System.out.println("you won't see this");

        System.out.println();

        //c = a - b; //переменная "с" содержит значение -1

        System.out.print("c contains ");
        System.out.println(c);
        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c - отрицательное число");

        System.out.println();

        c = b - a; // переменная "с" теперь содержит значение 1
        System.out.println("c равно 1");
        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c - отрицательное число");

    }
}
