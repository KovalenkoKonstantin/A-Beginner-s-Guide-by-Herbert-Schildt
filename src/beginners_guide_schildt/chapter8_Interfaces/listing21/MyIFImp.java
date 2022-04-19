package beginners_guide_schildt.chapter8_Interfaces.listing21;

import beginners_guide_schildt.chapter8_Interfaces.listing20.MyIF;

// Implement MyIF.
public class MyIFImp implements MyIF {
    // Only getUserID() defined by MyIF needs to be implemented.
    // getAdminID() can be allowed to default.
    public int getUserID() {
        return 100;
    }
}

