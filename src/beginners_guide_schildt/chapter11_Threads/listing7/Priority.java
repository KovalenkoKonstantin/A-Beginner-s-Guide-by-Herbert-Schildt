package beginners_guide_schildt.chapter11_Threads.listing7;
// Demonstrate thread priorities.
class Priority implements Runnable {
    int count;
    Thread thrd;
    static boolean stop = false;
    static String currentName;
    /* Construct a new thread. Notice that this
       constructor does not actually start the
       threads running. */
    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    } // Begin execution of new thread.
/**В методе run () содержится цикл, отсчитывающий число своих шагов.*/
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;
/**В цикле производится проверка символьной строки в переменной currentName
 * на совпадение с именем исполняемого потока. Если они не совпадают, то это означает,
 * что произошло переключение задач. */
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
/**При этом отображается имя нового потока, которое присваивается переменной currentName.
 * Это дает возможность следить за тем, насколько часто каждый поток получает время ЦП.*/
                System.out.println("In " + currentName);
            }/**цикл завершает работу, когда значение счетчика достигает 10000000
             * или же когда статическая переменная stop принимает значение true.*/
        } while(stop == false && count < 10000000);
/**Первоначально переменной stop присваивается значение false,
 но первый же поток, заканчивающий отсчет, устанавливает в ней значение true.
 В результате второй поток завершится, как только ему будет выделен квант времени.*/
        stop = true;
        System.out.println("\n" + thrd.getName() +
                " terminating.");
    }
}
