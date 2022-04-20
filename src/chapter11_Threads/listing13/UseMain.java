package chapter11_Threads.listing13;
/*    Try This 11-2 Controlling the main thread. */

class UseMain {
    public static void main(String args[]) {
        //Thread thrd;
        // Get the main thread.
/**Для доступа к основному потоку нужно получить ссылающийся на него объект
 типа Thread. Для этого следует вызвать метод currentThread (), являющийся
 статическим членом класса Thread*/
        Thread thrd = Thread.currentThread();
//Thread.currentThread() возвращает ссьmку на тот поток, из которого он вызывается

        // Display main thread's name.
        System.out.println("Следи за нитью: " +
                thrd.getName());

        // Display main thread's priority.
        System.out.println("Приоритет по умолчанию: " +
                thrd.getPriority());

        System.out.println();

        // Set the name and priority.
        System.out.println("Забабахаем имя и приоритет.\n");
        thrd.setName("Буду звать тебя Джон");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("А теперь нить: " +
                thrd.getName());

        System.out.println("Приоритет теперя: " +
                thrd.getPriority());
    }
}
