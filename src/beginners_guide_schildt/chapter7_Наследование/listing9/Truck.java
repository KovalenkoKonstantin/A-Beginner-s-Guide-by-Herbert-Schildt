package beginners_guide_schildt.chapter7_Наследование.listing9;

// Extend Vehicle to create a Truck specialization.
class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds

    // This is a constructor for Truck.
    Truck(int p, int f, int m, int c) {
    /* Initialize Vehicle members using
       Vehicle's constructor. */
        super(p, f, m);

        cargocap = c;
    }

    // Accessor methods for cargocap.
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}
