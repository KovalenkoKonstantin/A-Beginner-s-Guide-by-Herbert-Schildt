package chapter11_Threads.listing10;

// Use wait() and notify() to create a ticking clock.
public class TickTock {
/**В процессе работы имитатора часов в данной переменной хранится строка "ticked" или "tocked",
 * определяющая текущее состояние часов*/
    String state; // contains the state of the clock
/**действие методов wait () и notify() распространяется только на
 синхронизированные методы*/
    synchronized void tick(boolean running) {
        if (!running) { // stop the clock
            state = "ticked";
            notifyAll(); // notify any waiting threads
            return;
        }
/**По ходу работы имитируемых часов в методе tick () выводится слово "Tick", переменная
 state принимает значение "ticked", а затем вызывается метод notify (). Вызов
 метода notify () возобновляет исполнение ожидающего потока.*/
        System.out.print("Tick ");
        state = "ticked"; // set the current state to ticked
        notify(); // let tock() run
        try {
/**Далее в цикле while вызывается метод wait ().
 * В итоге выполнение метода tick () будет приостановлено до тех пор,
 * пока другой поток не вызовет метод notify (). Таким образом,
 * очередной шаг цикла не будет выполнен до тех пор, пока другой поток не вызовет метод notify ()
 * для того же самого объекта. Поэтому, когда вызывается метод tick (), на экран выводится
 слово "Tick" и другой поток получает возможность продолжить свое исполнение, а затем
 выполнение этого метода приостанавливается*/
            while (!state.equals("tocked"))
                wait(); // wait for tock() to complete
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
/**действие методов wait () и notify() распространяется только на
 синхронизированные методы*/
    synchronized void tock(boolean running) {
        if (!running) { // stop the clock
            state = "tocked";
            notifyAll(); // notify any waiting threads
            return;
        }
        System.out.println("Tock");
/**Значение "tocked", означающее завершение цикла, будет установлено
 только после выполнения метода tock ().*/
        state = "tocked"; // set the current state to tocked
        notify(); // let tick() run
        try {
/**Этот цикл предотвращает продолжение исполнения потока в результате ложной активизации.
 Если по окончании ожидания в переменной state не будет присутствовать значение "tocked",
 значит, имела место ложная активизация, и метод wait () будет вызван снова.*/
            while (!state.equals("ticked"))
                wait(); // wait for tick to complete
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}