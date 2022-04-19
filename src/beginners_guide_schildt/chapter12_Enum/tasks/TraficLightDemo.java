package beginners_guide_schildt.chapter12_Enum.tasks;

public class TraficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        for (int i = 0; i < 10; i++) {
            System.out.println(t1.getTlc());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
