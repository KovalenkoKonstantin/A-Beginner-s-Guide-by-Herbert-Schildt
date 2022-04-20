package chapter8_Interfaces.listing23;
import chapter8_Interfaces.listing20.*;

class MyIFImp2 implements MyIF {
    // Here, implementations for both getUserID( ) and getAdminID( ) are
    // provided.
    public int getUserID() {
        return 100;
    }

    public int getAdminID() {
        return 42;
    }
}
