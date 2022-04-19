package beginners_guide_schildt.chapter11_Threads.listing8;

class MyThread implements Runnable {
    Thread thrd;
/**используется статический объект sa типа SurmArray для получения суммы элементов массива.
 * А поскольку он статический, то все экземпляры класса MyThread используют одну его копию.*/
    static SumArray sa = new SumArray();
    int a[];
    int answer;
    // Construct a new thread.
    MyThread(String name, int nums[]) {
        thrd = new Thread(this, name); //without 'this' wouldn't work
        a = nums;
        thrd.start(); // start the thread
    }
    // Begin execution of new thread.
    public void run() {
        //int sum;
        System.out.println(thrd.getName() + " начало.");
        answer = sa.sumArray(a);
        System.out.println("Итоговая сумма для " + thrd.getName() +
                " is " + answer);
        System.out.println(thrd.getName() + " конец.");
    }
}
