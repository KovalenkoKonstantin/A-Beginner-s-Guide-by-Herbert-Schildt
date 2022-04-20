package chapter11_Threads.tasks;

/**
 * Внесите в класс TickTock изменения для организации фактического отчета времени.
 * Первую половину секунды должен занимать вывод на экран слова "Tick",
 * а вторую - вывод слова "Tock". Таким образом, сообщение "Tick-Tock" должно
 * соответствовать одной секунде отсчитываемого времени. (Время переключения
 * контекстов можно не учитывать.)
 */
public class TickTockv2 {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if (!running) { // stop the clock
            state = "Aped";
            notifyAll(); // notify any waiting threads
            return;
        }

        System.out.print("Ап ");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        state = "Aped"; // set the current state to ticked
        notify(); // let tock() run

        while (!state.equals("Pched")) {
            try {
                wait(); // wait for tock() to complete
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // stop the clock
            state = "Pched";
            notifyAll(); // notify any waiting threads
            return;
        }

        System.out.println("Пчхи");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        state = "Pched"; // set the current state to tocked
        notify(); // let tick() run

        while (!state.equals("Aped")) {
            try {
                wait(); // wait for tick to complete
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}