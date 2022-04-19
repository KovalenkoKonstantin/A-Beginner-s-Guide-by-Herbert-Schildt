package beginners_guide_schildt.chapter13_Generics.tasks;

public class FlightSchedDemo {
    public static void main(String[] args) {
        FlightSched <Double, String,Integer> newObject = new FlightSched<>(5.87, "AAA", 88);

        newObject.showFlightSched();
        System.out.println();

        double x = newObject.getObj();
        System.out.println(x);
        System.out.println();

        String y = newObject.getObj1();
        System.out.println(y);
        System.out.println();

        int z = newObject.getObj2();
        System.out.println(z);
    }
}
