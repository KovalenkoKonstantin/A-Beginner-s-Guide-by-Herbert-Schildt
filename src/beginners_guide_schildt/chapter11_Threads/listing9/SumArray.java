package beginners_guide_schildt.chapter11_Threads.listing9;
// Use a synchronized block to control access to SumArray.
class SumArray {
    private int sum;

    int sumArray(int nums[]) { //не синхронизирован
        sum = 0; // reset sum

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("Сумма для " +
                    Thread.currentThread().getName() +
                    " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch / разрешить переключение задач
            }
            catch(InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}
