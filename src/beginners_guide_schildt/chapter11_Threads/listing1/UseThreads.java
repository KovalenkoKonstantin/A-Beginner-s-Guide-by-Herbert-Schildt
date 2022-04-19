package beginners_guide_schildt.chapter11_Threads.listing1;

class UseThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        // First, construct a MyThread object.
        // Создание исполняемого объекта
        MyThread mt = new MyThread("John");

        // Next, construct a thread from that object.
/**класс MyThread реализует интерфейс Runnable. Это означает,
 * что объект типа MyThread подходит для использования в качестве потока,
 * а следовательно, его можно передать конструктору класса Thread.*/
        // Формирование потока для объекта mt
        Thread newThrd = new Thread(mt);
        // Finally, start execution of the thread.
        // Запуск потока но выполнение
/**для запуска нового потока вызывается метод start (),
 что приводит к вызову метода run () из порожденного потока*/
        newThrd.start();
/**После вызова метода start () управление возвращается в методу main (),
 *  где начинается выполнение цикла for.*/
        for(int i=1; i<18; i++) {
            System.out.print("'Параллельное выполнение' - '" + i + "': ");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
