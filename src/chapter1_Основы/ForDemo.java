package chapter1_Основы;
/* Demonstrate the for loop.
   Call this file ForDemo.java.
   for(<начальная точка>; <условие выхода>; <операторы счетчика>) {
	// Тело цикла
}*/
class ForDemo {
    public static void main(String args[]) {
        int count;

        for(count = 0; count <= 5; count++)
//      for(count = 0; count < 5; count = count+1)
            System.out.println("This is count: " + count);/*Если это условное выражение принимает логическое значение true,
вызывается метод println (), после чего выполняется итерационная часть цикла. Данная
последовательность действий повторяется до тех пор, пока условное выражение не
примет логическое значение false. В этом случае управление передается следующему
после цикла оператору.*/

        System.out.println("Done!");//println - метод
    }
}