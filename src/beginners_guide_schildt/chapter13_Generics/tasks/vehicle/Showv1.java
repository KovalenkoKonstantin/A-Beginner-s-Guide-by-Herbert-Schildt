package beginners_guide_schildt.chapter13_Generics.tasks.vehicle;


public class Showv1 {
    public static void main(String[] args) {
        Conveyerv1 <BMW> conveyerv1 = new Conveyerv1<>(new BMW("BMW"));
        conveyerv1.conveyer1();

        vehicle(new BMW("BMW"),200);

        System.out.println();

        test(conveyerv1);
    }

    private static <T, V> void vehicle (T vehicle, V speed){
        System.out.println("For vehicle " + vehicle + " speed is " + speed);
    }

    private static void test (Conveyerv1<? extends BMW> obj){
        obj.conveyer1();
    }
}