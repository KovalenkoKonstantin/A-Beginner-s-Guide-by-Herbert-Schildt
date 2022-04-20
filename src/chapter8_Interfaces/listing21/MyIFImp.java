package chapter8_Interfaces.listing21;

import chapter8_Interfaces.listing20.MyIF;

// Implement MyIF.
public class MyIFImp implements MyIF {
    // Only getUserID() defined by MyIF needs to be implemented.
    // getAdminID() can be allowed to default.
    public int getUserID() {
        return 100;
    }
}

