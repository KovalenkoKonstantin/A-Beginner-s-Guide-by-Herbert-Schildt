package beginners_guide_schildt.chapter8_Interfaces.tasks.Vechicle;

public interface IVechicle {
    double PI = 3.14;

    static int newMethod() {
        return 100;
    }

    // Compute fuel needed for a given distance.
    default double fuelneeded(int miles) {
        return 0;
    }

    // Return the range.
    int range();
    // Access methods for instance variables.
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);

    default int reset (){
        return 0;
    }
}
