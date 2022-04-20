package chapter6_Static.listing14;

// Продемонстрировать использование класса Queue2.
class QDemo2 {
    public static void main(String args[]) {
        // Создать пустую очередь для хранения 10 элементов
        Queue2 q1 = new Queue2(10); //обращение к Queue2 до перезагрузки.
//q[] массив для хранения элементов очереди

        char name[] = {'T', 'o', 'm'};
        // Создать очередь на основе массива
        Queue2 q2 = new Queue2(name);

/*        char ch;
        int i;

        // Поместить ряд символов в очередь q1
        for(i=0; i < 10; i++)
            q1.put((char) ('A' + i));

        // Создать одну очередь на основе другой
        Queue2 q3 = new Queue2(q1);

        // Показать очереди.
        System.out.print("Содержимое q1: ");
        for(i=0; i < 10; i++) {
            ch = q1.get(); // return q[getloc++]
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for(i=0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for(i=0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }*/
    }
}
