package chapter11_Threads.listing10;
public class MyThread implements Runnable {
/**Объекты типа MyThread могут выполняться в отдельных потоках,
* так как класс MyThread реализует интерфейс Runnable*/
    Thread thrd;
    TickTock ttOb;
    // Construct a new thread.
/**Конструктору MyТhread () передаются два параметра. Первый из них задает имя потока
 * (в данном случае - "Tick"), а второй - ссылку на объект типа TickTockBad (в данном случае - объект tt)*/
public MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name); //without 'this' wouldn't work
        ttOb = tt;
        thrd.start(); // start the thread
    }
    // Begin execution of new thread.
    public void run() {
/**вызывается метод tick () , если поток называется "Tick",
 * или же метод tock (), если поток называется "Tock"*/
        if(thrd.getName().compareTo("Tick") == 0) {
/**Каждый из этих методов вызывается пять раз с параметром, принимающим логическое значение true.*/
            for(int i=0; i<5; i++) ttOb.tick(true);
/**Последний вызов каждого из методов с параметром, принимающим
 логическое значение false, останавливает имитатор работы часов*/
            ttOb.tick(false);
        }
        else {
            for(int i=0; i<5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}
