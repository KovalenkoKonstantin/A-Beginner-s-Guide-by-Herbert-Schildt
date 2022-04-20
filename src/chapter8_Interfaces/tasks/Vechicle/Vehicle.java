package chapter8_Interfaces.tasks.Vechicle;

// Build a subclass of Vehicle for trucks.
class Vehicle implements IVechicle{
    private int passengers; // number of passengers
    private int fuelcap;    // fuel capacity in gallons
    private int mpg;        // fuel consumption in miles per gallon

    // This is a constructor for Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range.
    public int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance.
    @Override
    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Access methods for instance variables.
    public int getPassengers() { return passengers; }
    public void setPassengers(int p) { passengers = p; }
    public int getFuelcap() { return fuelcap; }
    public void setFuelcap(int f) { fuelcap = f; }
    public int getMpg() { return mpg; }
    public void setMpg(int m) { mpg = m; }

}
