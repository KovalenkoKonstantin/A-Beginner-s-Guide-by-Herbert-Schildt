package chapter8_Interfaces.tasks.Vechicle;
import java.lang.*;
class TruckDemo {
    public static void main(String args[]) {

        // construct some trucks
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        semi.setFuelcap(5);
        semi.setMpg(6);
        semi.setPassengers(10);

        gallons = semi.fuelneeded(dist);

        System.out.println("Semi can carry " + semi.getCargo() +
                " pounds.");
        System.out.println("To go " + dist + " miles semi needs " +
                gallons + " gallons of fuel.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup can carry " + pickup.getCargo() +
                " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " +
                gallons + " gallons of fuel.");
        System.out.println(semi.range() + "\n"+ semi.getPassengers()+ "\n" + semi.getFuelcap()+ "\n" + semi.getMpg());
        System.out.println(IVechicle.PI);
        System.out.println(IVechicle.newMethod());
    }
}
