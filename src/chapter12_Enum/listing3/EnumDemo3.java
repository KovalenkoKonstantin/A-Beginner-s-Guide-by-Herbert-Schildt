package chapter12_Enum.listing3;

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport tp;
        // Display speed of an airplane.
        System.out.println("Typical speed at airplane is " +
                Transport.AIRPLANE.getSpeed() + " miles per hour.\n");

        // Display all Transports and speeds.
        System.out.println("All Transports speeds: ");
        for (Transport t : Transport.values())
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
    }
}
