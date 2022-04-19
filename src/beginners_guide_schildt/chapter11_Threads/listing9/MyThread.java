package beginners_guide_schildt.chapter11_Threads.listing9;
class MyThread implements Runnable {
    Thread thrd;
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
        // synchronize calls to sumArray()
        synchronized(sa) { //вызовы метода summArray() для объекта sa синхронизированы
            answer = sa.sumArray(a);
        }
        System.out.println("Итоговая сумма для " + thrd.getName() +
                " is " + answer);
        System.out.println(thrd.getName() + " конец.");
    }
}
