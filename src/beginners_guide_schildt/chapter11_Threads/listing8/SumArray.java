package beginners_guide_schildt.chapter11_Threads.listing8;
// Use synchronize to control access.
class SumArray {
    private int sum;
/**метод sumArray () , вычисляет сумму элементов целочисленного массива.
 *
 * Метод sumArray () синхронизирован, и поэтому в каждый момент времени
 * он может использоваться только одним потоком*/
    synchronized
    int sumArray(int nums[]) {
        sum = 0; // reset sum

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("Сумма для " +
                    Thread.currentThread().getName() + //blow my mind
                    " is " + sum);
            try { Thread.sleep(10); // allow task-switch / разрешить переключение задач
            }
            catch(InterruptedException exc) {
                System.out.println("Thread interrupted.");}}
/**если в двух потоках одновременно сделать вызов sa.sumArray (),
 расчет суммы окажется неверным, поскольку в переменной sum
 накапливаются результаты суммирования, выполняемого одновременно в двух потоках*/
        return sum;
    }
}
