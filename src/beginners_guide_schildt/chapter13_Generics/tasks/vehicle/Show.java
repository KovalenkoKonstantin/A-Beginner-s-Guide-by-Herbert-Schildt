package beginners_guide_schildt.chapter13_Generics.tasks.vehicle;

import java.util.ArrayList;

public class Show {
    public static void main(String[] args) {
        Conveyer <String, Integer> con = new Conveyer<>("Boeing", 600);
        con.conveyer();
        System.out.println(con.getVehicle());
        System.out.println(con.getSpeed());


        Conveyer <String, Integer> con1 = new Conveyer<>("BMW", 200);
        con1.conveyer();
        System.out.println(con1.getVehicle());
        System.out.println(con1.getSpeed());

        Conveyer <String, Integer> con2 = new Conveyer<>("Yamaha", 100);
        con2.conveyer();
        System.out.println(con2.getVehicle());
        System.out.println(con2.getSpeed());

        ArrayList <BMW> boeings = new ArrayList<>();
        boeings.add(new BMW("x6"));
    }
}
